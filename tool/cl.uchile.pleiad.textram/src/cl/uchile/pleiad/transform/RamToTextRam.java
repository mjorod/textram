package cl.uchile.pleiad.transform;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.serializer.impl.Serializer;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.sel.commons.emf.util.ResourceManager;
import cl.uchile.pleiad.textRam.TAspect;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class RamToTextRam {

	public static void main(String[] args) {
		
		File[] files = new File("/Users/moliva/touchram/touchram/ca.mcgill.sel.ram.gui/models/SlotMachine").listFiles();
		Map<String,String> res = new HashMap<String, String>();
		
		process( files, res );
		
		for ( String s: res.keySet() ) {
		
			BufferedWriter writer = null;
		    try {
		        writer = new BufferedWriter(new FileWriter("/Users/moliva/textramTemp/" + s ));
		        writer.write( res.get(s) );
		    } catch (IOException e) {
		        System.err.println(e);
		    } finally {
		        if (writer != null) {
		            try {
		                writer.close();
		            } catch (IOException e) {
		                System.err.println(e);
		            }
		        }
		    }
		}
						
	}
	
	public static void process(File[] files, Map<String,String> sb) {
		for ( File file : files ) {
			if ( file.isDirectory() ) {
				process( file.listFiles() , sb);
			} else {
				
				if ( file.getName().endsWith("Game.ram") == true ) {
					continue;
				}
				
				if (!EPackage.Registry.INSTANCE.containsKey(RamPackage.eINSTANCE.getNsURI())) {
					EPackage.Registry.INSTANCE.put(RamPackage.eINSTANCE.getNsURI(), ca.mcgill.cs.sel.ram.RamPackage.eINSTANCE);
				}
				
				Aspect ramAspect = (Aspect)ResourceManager.loadModel(file); 
						
				ITextRAMTransform transformer = new TextRAMTransform();
						
				TAspect res =  transformer.transform(ramAspect);
				
				Injector injector = Guice.createInjector(new  cl.uchile.pleiad.TextRAMRuntimeModule());  
				Serializer serializer = injector.getInstance(Serializer.class);  
				
				String str = serializer.serialize(res);
				
				System.out.println(str);
				
				sb.put( ramAspect.getName() + ".xram", str);
				
			}
		}
		
	}

}
