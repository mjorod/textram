package cl.uchile.pleiad.transform;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Type;
import ca.mcgill.cs.sel.ram.Visibility;
import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TClassMember;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TextRamFactory;
import cl.uchile.pleiad.transform.ITextRAMTransform;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TextRAMTransform implements ITextRAMTransform {
  public Aspect transform(final TAspect textRamAspect) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public TAspect transform(final Aspect ramAspect) {
    TAspect _xblockexpression = null;
    {
      final TAspect res = TextRamFactory.eINSTANCE.createTAspect();
      StructuralView _structuralView = ramAspect.getStructuralView();
      TStructuralView _transformStructuralView = this.transformStructuralView(_structuralView);
      res.setStructuralView(_transformStructuralView);
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  private TStructuralView transformStructuralView(final StructuralView ramStructuralView) {
    TStructuralView _xblockexpression = null;
    {
      final TStructuralView res = TextRamFactory.eINSTANCE.createTStructuralView();
      EList<Classifier> _classes = res.getClasses();
      EList<Classifier> _classes_1 = ramStructuralView.getClasses();
      List<TClass> _transformClasses = this.transformClasses(_classes_1);
      _classes.addAll(_transformClasses);
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  private List<TClass> transformClasses(final EList<Classifier> ramClasses) {
    List<TClass> _xblockexpression = null;
    {
      final List<TClass> res = CollectionLiterals.<TClass>newArrayList();
      final Procedure1<Classifier> _function = new Procedure1<Classifier>() {
        public void apply(final Classifier c) {
          TClass _transformClass = TextRAMTransform.this.transformClass(c);
          res.add(_transformClass);
        }
      };
      IterableExtensions.<Classifier>forEach(ramClasses, _function);
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  private TClass transformClass(final Classifier classifier) {
    TClass _xblockexpression = null;
    {
      final ca.mcgill.cs.sel.ram.Class ramClass = ((ca.mcgill.cs.sel.ram.Class) classifier);
      EList<Classifier> _superTypes = ramClass.getSuperTypes();
      int _size = _superTypes.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        throw new IllegalStateException("TextRam classes can have only one super type");
      }
      TClass _createTClass = TextRamFactory.eINSTANCE.createTClass();
      final Procedure1<TClass> _function = new Procedure1<TClass>() {
        public void apply(final TClass it) {
          EList<Classifier> _superTypes = ramClass.getSuperTypes();
          Classifier _get = _superTypes.get(0);
          boolean _isPartial = ((ca.mcgill.cs.sel.ram.Class) _get).isPartial();
          it.setPartialSuperType(_isPartial);
          it.setLayoutX(0);
          it.setLayoutY(0);
          EList<TClassMember> _members = it.getMembers();
          EList<Operation> _operations = ramClass.getOperations();
          List<TClassMember> _transformOperations = TextRAMTransform.this.transformOperations(_operations);
          _members.addAll(_transformOperations);
          EList<TClassMember> _members_1 = it.getMembers();
          EList<Attribute> _attributes = ramClass.getAttributes();
          List<TClassMember> _transformAttributes = TextRAMTransform.this.transformAttributes(_attributes);
          _members_1.addAll(_transformAttributes);
        }
      };
      final TClass res = ObjectExtensions.<TClass>operator_doubleArrow(_createTClass, _function);
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  private List<TClassMember> transformOperations(final List<Operation> ramOperations) {
    List<TClassMember> _xblockexpression = null;
    {
      final List<TClassMember> res = CollectionLiterals.<TClassMember>newArrayList();
      final Procedure1<Operation> _function = new Procedure1<Operation>() {
        public void apply(final Operation o) {
          TOperation _transforOperation = TextRAMTransform.this.transforOperation(o);
          res.add(_transforOperation);
        }
      };
      IterableExtensions.<Operation>forEach(ramOperations, _function);
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  public TOperation transforOperation(final Operation operation) {
    TOperation _xblockexpression = null;
    {
      final TOperation res = TextRamFactory.eINSTANCE.createTOperation();
      boolean _isAbstract = operation.isAbstract();
      res.setAbstract(_isAbstract);
      Visibility _visibility = operation.getVisibility();
      res.setVisibility(_visibility);
      Type _returnType = operation.getReturnType();
      res.setReturnType(_returnType);
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  private List<TClassMember> transformAttributes(final List<Attribute> ramAttributes) {
    List<TClassMember> _xblockexpression = null;
    {
      final List<TClassMember> res = CollectionLiterals.<TClassMember>newArrayList();
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
}
