package cl.uchile.pleiad.converter;

import ca.mcgill.cs.sel.ram.Aspect;
import cl.uchile.pleiad.generator.RamGenerator;
import cl.uchile.pleiad.textRam.TAspect;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class ModelConverterProxy {
  private final static ModelConverterProxy instance = new ModelConverterProxy();
  
  private final Map<String,Aspect> aspects = CollectionLiterals.<String, Aspect>newHashMap();
  
  private ModelConverterProxy() {
  }
  
  public static ModelConverterProxy getInstance() {
    return ModelConverterProxy.instance;
  }
  
  public void reset() {
    this.aspects.clear();
  }
  
  public Aspect convertTextRAMModelToRAMModel(final TAspect textRamAspect) {
    Aspect _xblockexpression = null;
    {
      String _name = textRamAspect.getName();
      boolean _containsKey = this.aspects.containsKey(_name);
      boolean _equals = (_containsKey == false);
      if (_equals) {
        final RamGenerator generator = new RamGenerator(textRamAspect);
        final Aspect ramAspect = generator.getRamAspect();
        String _name_1 = textRamAspect.getName();
        this.aspects.put(_name_1, ramAspect);
      }
      String _name_2 = textRamAspect.getName();
      _xblockexpression = this.aspects.get(_name_2);
    }
    return _xblockexpression;
  }
}
