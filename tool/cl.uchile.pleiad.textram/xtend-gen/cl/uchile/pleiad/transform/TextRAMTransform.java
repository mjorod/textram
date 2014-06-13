package cl.uchile.pleiad.transform;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.ObjectType;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.Parameter;
import ca.mcgill.cs.sel.ram.PrimitiveType;
import ca.mcgill.cs.sel.ram.RSet;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Type;
import ca.mcgill.cs.sel.ram.Visibility;
import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.textRam.TAttribute;
import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TClassMember;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TParameter;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TextRamFactory;
import cl.uchile.pleiad.transform.ITextRAMTransform;
import cl.uchile.pleiad.util.TextRamEcoreUtil;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TextRAMTransform implements ITextRAMTransform {
  @Extension
  private final TextRamEcoreUtil textRamEcoreUtil = new TextRamEcoreUtil();
  
  public Aspect transform(final TAspect textRamAspect) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public TAspect transform(final Aspect ramAspect) {
    TAspect _createTAspect = TextRamFactory.eINSTANCE.createTAspect();
    final Procedure1<TAspect> _function = new Procedure1<TAspect>() {
      public void apply(final TAspect it) {
        String _name = ramAspect.getName();
        it.setName(_name);
      }
    };
    final TAspect textRamAspect = ObjectExtensions.<TAspect>operator_doubleArrow(_createTAspect, _function);
    StructuralView _structuralView = ramAspect.getStructuralView();
    this.transformStructuralView(_structuralView, textRamAspect);
    return textRamAspect;
  }
  
  private void transformStructuralView(final StructuralView from, final TAspect to) {
    TStructuralView _createTStructuralView = TextRamFactory.eINSTANCE.createTStructuralView();
    to.setStructuralView(_createTStructuralView);
    StructuralView _structuralView = to.getStructuralView();
    EList<Type> _types = _structuralView.getTypes();
    EList<Type> _types_1 = from.getTypes();
    Collection<Type> _copyTypes = this.copyTypes(_types_1);
    _types.addAll(_copyTypes);
    this.transformClasses(from, to);
  }
  
  public void convertRSetTypeClassFromTClass(final Aspect aspect, final EList<Type> types) {
    Iterable<RSet> _filter = Iterables.<RSet>filter(types, RSet.class);
    final Procedure1<RSet> _function = new Procedure1<RSet>() {
      public void apply(final RSet rSetType) {
        rSetType.setInstanceClassName(null);
        ObjectType _type = rSetType.getType();
        if ((_type instanceof TClass)) {
          StructuralView _structuralView = aspect.getStructuralView();
          EList<Classifier> _classes = _structuralView.getClasses();
          final Function1<Classifier,Boolean> _function = new Function1<Classifier,Boolean>() {
            public Boolean apply(final Classifier c) {
              String _name = c.getName();
              ObjectType _type = rSetType.getType();
              String _name_1 = _type.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          Classifier _findFirst = IterableExtensions.<Classifier>findFirst(_classes, _function);
          rSetType.setType(_findFirst);
        }
      }
    };
    IterableExtensions.<RSet>forEach(_filter, _function);
  }
  
  private Collection<Type> copyTypes(final List<Type> ramTypes) {
    Collection<Type> _xblockexpression = null;
    {
      final Collection<Type> result = EcoreUtil.<Type>copyAll(ramTypes);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private void transformClasses(final StructuralView from, final TAspect to) {
    StructuralView _structuralView = to.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    EList<Classifier> _classes_1 = from.getClasses();
    List<TClass> _transformClasses = this.transformClasses(_classes_1, to);
    _classes.addAll(_transformClasses);
    EList<Classifier> _classes_2 = from.getClasses();
    this.transformClassMembers(_classes_2, to);
  }
  
  private List<TClass> transformClasses(final EList<Classifier> ramClasses, final TAspect to) {
    List<TClass> _xblockexpression = null;
    {
      final List<TClass> res = CollectionLiterals.<TClass>newArrayList();
      final Procedure1<Classifier> _function = new Procedure1<Classifier>() {
        public void apply(final Classifier c) {
          final TClass textRamClass = TextRAMTransform.this.transformClass(c, to);
          res.add(textRamClass);
        }
      };
      IterableExtensions.<Classifier>forEach(ramClasses, _function);
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  private TClass transformClass(final Classifier from, final TAspect to) {
    TClass _xblockexpression = null;
    {
      final ca.mcgill.cs.sel.ram.Class ramClass = ((ca.mcgill.cs.sel.ram.Class) from);
      TClass _createTClass = TextRamFactory.eINSTANCE.createTClass();
      final Procedure1<TClass> _function = new Procedure1<TClass>() {
        public void apply(final TClass it) {
          String _name = from.getName();
          it.setName(_name);
          it.setLayoutX(0);
          it.setLayoutY(0);
        }
      };
      final TClass res = ObjectExtensions.<TClass>operator_doubleArrow(_createTClass, _function);
      EList<Classifier> _superTypes = ramClass.getSuperTypes();
      int _size = _superTypes.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        throw new IllegalStateException("TextRam classes can have only one super type");
      }
      EList<Classifier> _superTypes_1 = ramClass.getSuperTypes();
      int _size_1 = _superTypes_1.size();
      boolean _equals = (_size_1 == 1);
      if (_equals) {
        EList<Classifier> _superTypes_2 = ramClass.getSuperTypes();
        Classifier _get = _superTypes_2.get(0);
        boolean _isPartial = ((ca.mcgill.cs.sel.ram.Class) _get).isPartial();
        res.setPartialSuperType(_isPartial);
      }
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  /**
   * Transform TextRam's class members after the {@link TClass class) itself were added to the TextRam's {@link TAspect aspect}
   * 
   * @ramClasses {@link EList<ca.mcgill.cs.sel.ram.Classifier> classes} that contains the members.
   * @textRamAsepect {@link TAspect aspect} that contains the classes that will receive the members.
   */
  private void transformClassMembers(final EList<Classifier> ramClasses, final TAspect to) {
    final Procedure1<Classifier> _function = new Procedure1<Classifier>() {
      public void apply(final Classifier c) {
        final ca.mcgill.cs.sel.ram.Class ramClass = ((ca.mcgill.cs.sel.ram.Class) c);
        String _name = ramClass.getName();
        final TClass textRamClass = TextRAMTransform.this.textRamEcoreUtil.findClass(to, _name);
        EList<TClassMember> _members = textRamClass.getMembers();
        EList<Operation> _operations = ramClass.getOperations();
        List<TClassMember> _transformOperations = TextRAMTransform.this.transformOperations(_operations, to);
        _members.addAll(_transformOperations);
        EList<TClassMember> _members_1 = textRamClass.getMembers();
        EList<Attribute> _attributes = ramClass.getAttributes();
        List<TClassMember> _transformAttributes = TextRAMTransform.this.transformAttributes(_attributes, to);
        _members_1.addAll(_transformAttributes);
      }
    };
    IterableExtensions.<Classifier>forEach(ramClasses, _function);
  }
  
  private List<TClassMember> transformOperations(final List<Operation> ramOperations, final TAspect to) {
    List<TClassMember> _xblockexpression = null;
    {
      final List<TClassMember> res = CollectionLiterals.<TClassMember>newArrayList();
      final Procedure1<Operation> _function = new Procedure1<Operation>() {
        public void apply(final Operation o) {
          TOperation _transforOperation = TextRAMTransform.this.transforOperation(o, to);
          res.add(_transforOperation);
        }
      };
      IterableExtensions.<Operation>forEach(ramOperations, _function);
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  private TOperation transforOperation(final Operation operation, final TAspect to) {
    TOperation _xblockexpression = null;
    {
      final TOperation res = TextRamFactory.eINSTANCE.createTOperation();
      boolean _isStatic = operation.isStatic();
      res.setStatic(_isStatic);
      boolean _isPartial = operation.isPartial();
      res.setPartial(_isPartial);
      String _name = operation.getName();
      res.setName(_name);
      boolean _isAbstract = operation.isAbstract();
      res.setAbstract(_isAbstract);
      Visibility _visibility = operation.getVisibility();
      res.setVisibility(_visibility);
      Type _returnType = operation.getReturnType();
      Type _typeReference = this.textRamEcoreUtil.getTypeReference(to, _returnType);
      res.setReturnType(_typeReference);
      Type _returnType_1 = operation.getReturnType();
      if ((_returnType_1 instanceof ca.mcgill.cs.sel.ram.Class)) {
        Type _returnType_2 = operation.getReturnType();
        boolean _isPartial_1 = ((ca.mcgill.cs.sel.ram.Class) _returnType_2).isPartial();
        res.setPartialReturnType(_isPartial_1);
      }
      EList<Parameter> _parameters = operation.getParameters();
      final Procedure1<Parameter> _function = new Procedure1<Parameter>() {
        public void apply(final Parameter p) {
          EList<TParameter> _parameters = res.getParameters();
          TParameter _transformParameter = TextRAMTransform.this.transformParameter(p, to);
          _parameters.add(_transformParameter);
        }
      };
      IterableExtensions.<Parameter>forEach(_parameters, _function);
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  private TParameter transformParameter(final Parameter parameter, final TAspect to) {
    TParameter _xblockexpression = null;
    {
      final TParameter res = TextRamFactory.eINSTANCE.createTParameter();
      Type _type = parameter.getType();
      Type _typeReference = this.textRamEcoreUtil.getTypeReference(to, _type);
      res.setType(_typeReference);
      String _name = parameter.getName();
      res.setName(_name);
      Type _type_1 = parameter.getType();
      if ((_type_1 instanceof ca.mcgill.cs.sel.ram.Class)) {
        Type _type_2 = parameter.getType();
        boolean _isPartial = ((ca.mcgill.cs.sel.ram.Class) _type_2).isPartial();
        res.setPartialType(_isPartial);
      }
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  private List<TClassMember> transformAttributes(final List<Attribute> ramAttributes, final TAspect to) {
    List<TClassMember> _xblockexpression = null;
    {
      final List<TClassMember> res = CollectionLiterals.<TClassMember>newArrayList();
      final Procedure1<Attribute> _function = new Procedure1<Attribute>() {
        public void apply(final Attribute a) {
          TAttribute _transformAttribute = TextRAMTransform.this.transformAttribute(a, to);
          res.add(_transformAttribute);
        }
      };
      IterableExtensions.<Attribute>forEach(ramAttributes, _function);
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  private TAttribute transformAttribute(final Attribute from, final TAspect to) {
    TAttribute _xblockexpression = null;
    {
      final TAttribute res = TextRamFactory.eINSTANCE.createTAttribute();
      boolean _isStatic = from.isStatic();
      res.setStatic(_isStatic);
      String _name = from.getName();
      res.setName(_name);
      PrimitiveType _type = from.getType();
      Type _typeReference = this.textRamEcoreUtil.getTypeReference(to, _type);
      res.setType(((PrimitiveType) _typeReference));
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
}
