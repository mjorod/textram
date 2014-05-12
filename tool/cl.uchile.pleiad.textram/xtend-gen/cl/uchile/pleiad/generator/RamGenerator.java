package cl.uchile.pleiad.generator;

import ca.mcgill.cs.sel.ram.AbstractMessageView;
import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.RamFactory;
import ca.mcgill.cs.sel.ram.StructuralView;
import cl.uchile.pleiad.generator.MessageViewsGenerator;
import cl.uchile.pleiad.generator.StructuralViewGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class RamGenerator {
  private Aspect ramAspect;
  
  private Aspect textRamAspect;
  
  public RamGenerator(final Aspect textRamAspect) {
    this.textRamAspect = textRamAspect;
    Aspect _createAspect = RamFactory.eINSTANCE.createAspect();
    final Procedure1<Aspect> _function = new Procedure1<Aspect>() {
      public void apply(final Aspect it) {
        String _name = textRamAspect.getName();
        it.setName(_name);
      }
    };
    Aspect _doubleArrow = ObjectExtensions.<Aspect>operator_doubleArrow(_createAspect, _function);
    this.ramAspect = _doubleArrow;
    StructuralView _generateStructuralView = this.generateStructuralView(this.ramAspect, this.textRamAspect);
    this.ramAspect.setStructuralView(_generateStructuralView);
    EList<AbstractMessageView> _messageViews = this.ramAspect.getMessageViews();
    EList<AbstractMessageView> _generateMessageView = this.generateMessageView(this.ramAspect, this.textRamAspect);
    _messageViews.addAll(_generateMessageView);
  }
  
  public EList<AbstractMessageView> generateMessageView(final Aspect aspect, final Aspect aspect2) {
    MessageViewsGenerator _messageViewsGenerator = new MessageViewsGenerator(this.textRamAspect, this.ramAspect);
    return _messageViewsGenerator.getMessagesView();
  }
  
  public Aspect getRamAspect() {
    return this.ramAspect;
  }
  
  private StructuralView generateStructuralView(final Aspect aspect, final Aspect aspect2) {
    StructuralViewGenerator _structuralViewGenerator = new StructuralViewGenerator(this.textRamAspect, this.ramAspect);
    return _structuralViewGenerator.getStructuralView();
  }
}
