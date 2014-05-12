package cl.uchile.pleiad.util;

import ca.mcgill.cs.sel.ram.Aspect;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class TextRAMPersistence {
  private final static TextRAMPersistence instance = new TextRAMPersistence();
  
  private TextRAMPersistence() {
  }
  
  public static TextRAMPersistence getInstance() {
    return TextRAMPersistence.instance;
  }
  
  public String serializeModel(final Aspect aspect, final String path) {
    String _xblockexpression = null;
    {
      String result = "";
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      URI _createFileURI = URI.createFileURI(path);
      final Resource resource = resourceSet.createResource(_createFileURI);
      EList<EObject> _contents = resource.getContents();
      _contents.add(aspect);
      try {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        resource.save(outputStream, Collections.EMPTY_MAP);
        outputStream.flush();
        outputStream.close();
        String _string = outputStream.toString();
        result = _string;
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
          System.err.println("Error saving RAM.");
          String _message = e.getMessage();
          result = _message;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
}
