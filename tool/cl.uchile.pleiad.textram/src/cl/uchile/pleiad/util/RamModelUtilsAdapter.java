package cl.uchile.pleiad.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.RAny;
import ca.mcgill.cs.sel.ram.RVoid;
import ca.mcgill.cs.sel.ram.RamFactory;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Type;

public class RamModelUtilsAdapter {
	
	public static void createDefaultTypes(StructuralView structuralView)
    {
        if (getTypeInstance(RVoid.class, structuralView) == null) {
            structuralView.getTypes().add(getRamFactory().createRVoid());
        }
        
        if (getTypeInstance(RAny.class, structuralView) == null) {
            structuralView.getTypes().add(getRamFactory().createRAny());
        }
        
        // add all primitive types
        EClass primitiveTypeClass = RamPackage.eINSTANCE.getPrimitiveType();
        
        for (EClassifier classifier : RamPackage.eINSTANCE.getEClassifiers()) {
            if (classifier instanceof EClass) {
                EClass clazz = (EClass) classifier;
                
                // is it a PrimitiveType but not an Enum
                if (!clazz.isAbstract() && primitiveTypeClass.isSuperTypeOf(clazz) && !RamPackage.eINSTANCE.getREnum().equals(clazz)) {
                    
                    boolean alreadyExists = false;
                    
                    // if the type already exists we don't want to add it another time
                    for (Type type : structuralView.getTypes()) {
                        
                        if (type.eClass().equals(clazz)) {
                            alreadyExists = true;
                            break;
                        }
                        
                    }
                    
                    if (!alreadyExists) {
                        Type newObject = (Type) RamFactory.eINSTANCE.create(clazz);
                        structuralView.getTypes().add(newObject);
                    }
                }
            }
        }
    }
	
	@SuppressWarnings("unchecked")
    private static <T extends Type> T getTypeInstance(final java.lang.Class<T> typeClass, final StructuralView structuralView)
    {
        for (final Type type : getAllTypes(structuralView)) {
            if (typeClass.isInstance(type)) {
                return (T) type;
            }
        }
        return null;
    }
	
	private static List<Type> getAllTypes(final StructuralView structuralView)
    {
        final List<Type> typeList = new ArrayList<Type>();
        for (final Classifier clazz : structuralView.getClasses()) {
            typeList.add(clazz);
        }
        for (final Type type : structuralView.getTypes()) {
            typeList.add(type);
        }
        return typeList;
    }
    
	/**
     * @return The current RAM factory that should be used to create new metamodel elements.
     */
    private static RamFactory getRamFactory()
    {
        return RamFactory.eINSTANCE;
    }

}
