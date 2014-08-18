package cl.uchile.pleiad.util;

import ca.mcgill.cs.sel.ram.AbstractMessageView;
import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.Instantiation;
import ca.mcgill.cs.sel.ram.InstantiationType;
import ca.mcgill.cs.sel.ram.ObjectType;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.Parameter;
import ca.mcgill.cs.sel.ram.PrimitiveType;
import ca.mcgill.cs.sel.ram.RAny;
import ca.mcgill.cs.sel.ram.RBoolean;
import ca.mcgill.cs.sel.ram.RChar;
import ca.mcgill.cs.sel.ram.RDouble;
import ca.mcgill.cs.sel.ram.RFloat;
import ca.mcgill.cs.sel.ram.RInt;
import ca.mcgill.cs.sel.ram.RSet;
import ca.mcgill.cs.sel.ram.RString;
import ca.mcgill.cs.sel.ram.RVoid;
import ca.mcgill.cs.sel.ram.RamFactory;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Type;
import ca.mcgill.cs.sel.ram.Visibility;
import cl.uchile.pleiad.textRam.TAbstractMessageView;
import cl.uchile.pleiad.textRam.TAbstractMessages;
import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.textRam.TAspectMessageView;
import cl.uchile.pleiad.textRam.TAssociation;
import cl.uchile.pleiad.textRam.TAssociationEnd;
import cl.uchile.pleiad.textRam.TAttribute;
import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TClassMember;
import cl.uchile.pleiad.textRam.TClassifierMapping;
import cl.uchile.pleiad.textRam.TCombinedFragment;
import cl.uchile.pleiad.textRam.TInstantiationHeader;
import cl.uchile.pleiad.textRam.TInteraction;
import cl.uchile.pleiad.textRam.TInteractionMessage;
import cl.uchile.pleiad.textRam.TLifeline;
import cl.uchile.pleiad.textRam.TLifelineReferenceType;
import cl.uchile.pleiad.textRam.TMessage;
import cl.uchile.pleiad.textRam.TMessageAssignableFeature;
import cl.uchile.pleiad.textRam.TOcurrence;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TParameter;
import cl.uchile.pleiad.textRam.TReturnInteraction;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TTemporaryProperty;
import cl.uchile.pleiad.textRam.TTypedElement;
import cl.uchile.pleiad.textRam.TValueSpecification;
import cl.uchile.pleiad.textRam.TextRamPackage;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public final class TextRamEcoreUtil {
  /**
   * Returns the next container object in the hierarchy of the given object that {@link EClassifier#isInstance is an instance} of the type
   * 
   * @param eObject the child object to check
   * @param type the type of container to find
   * @return the first container object of the given type, null if none found
   */
  public static <T extends EObject> T getRootContainerOfType(final EObject eObject, final EClassifier type) {
    boolean _notEquals = (!Objects.equal(eObject, null));
    if (_notEquals) {
      EObject currentObject = eObject;
      EObject _eContainer = currentObject.eContainer();
      boolean _notEquals_1 = (!Objects.equal(_eContainer, null));
      boolean _while = _notEquals_1;
      while (_while) {
        {
          EObject _eContainer_1 = currentObject.eContainer();
          currentObject = _eContainer_1;
          boolean _isInstance = type.isInstance(currentObject);
          if (_isInstance) {
            final T typed = ((T) currentObject);
            return typed;
          }
        }
        EObject _eContainer_1 = currentObject.eContainer();
        boolean _notEquals_2 = (!Objects.equal(_eContainer_1, null));
        _while = _notEquals_2;
      }
    }
    return null;
  }
  
  /**
   * Returns the immediately preceding sibling of the given object that {@link EClassifier#isInstance is an instance} of the type
   * 
   * @param eObject current object
   * @param type of the immediately predecessor to find
   * @return the first sibling object of the given type, null if none found
   */
  public static <T extends EObject> T getPrev(final EObject eObject, final EClassifier type) {
    boolean _notEquals = (!Objects.equal(eObject, null));
    if (_notEquals) {
      final EObject parent = eObject.eContainer();
      boolean _notEquals_1 = (!Objects.equal(parent, null));
      if (_notEquals_1) {
        EObject prev = EcoreUtil2.getPreviousSibling(eObject);
        boolean _notEquals_2 = (!Objects.equal(prev, null));
        boolean _while = _notEquals_2;
        while (_while) {
          {
            boolean _isInstance = type.isInstance(prev);
            if (_isInstance) {
              return ((T) prev);
            }
            EObject _previousSibling = EcoreUtil2.getPreviousSibling(prev);
            prev = _previousSibling;
          }
          boolean _notEquals_3 = (!Objects.equal(prev, null));
          _while = _notEquals_3;
        }
      }
    }
    return null;
  }
  
  public Classifier getClassifierFrom(final StructuralView owner, final String name) {
    boolean _notEquals = (!Objects.equal(owner, null));
    if (_notEquals) {
      EList<Classifier> _classes = owner.getClasses();
      final Function1<Classifier,Boolean> _function = new Function1<Classifier,Boolean>() {
        public Boolean apply(final Classifier c) {
          String _name = c.getName();
          return Boolean.valueOf(Objects.equal(_name, name));
        }
      };
      return IterableExtensions.<Classifier>findFirst(_classes, _function);
    }
    return null;
  }
  
  public TClass getTClassFrom(final TStructuralView owner, final String name) {
    boolean _notEquals = (!Objects.equal(owner, null));
    if (_notEquals) {
      EList<Classifier> _classes = owner.getClasses();
      Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
      final Function1<TClass,Boolean> _function = new Function1<TClass,Boolean>() {
        public Boolean apply(final TClass c) {
          String _name = c.getName();
          return Boolean.valueOf(Objects.equal(_name, name));
        }
      };
      return IterableExtensions.<TClass>findFirst(_filter, _function);
    }
    return null;
  }
  
  /**
   * Returns all TextRAM's operations that match the given name from a {@link TClass class} and also its super type's operations.
   * 
   * @param clazz owner of the operations
   * @param name of the operation
   * @return a list of all class's operations that match the given name
   */
  public static List<TOperation> findTextRamOperations(final TClass clazz, final String name) {
    List<TOperation> _xblockexpression = null;
    {
      final List<TOperation> result = CollectionLiterals.<TOperation>newArrayList();
      EList<TClassMember> _members = clazz.getMembers();
      Iterable<TOperation> _filter = Iterables.<TOperation>filter(_members, TOperation.class);
      final Function1<TOperation,Boolean> _function = new Function1<TOperation,Boolean>() {
        public Boolean apply(final TOperation o) {
          String _name = o.getName();
          return Boolean.valueOf(Objects.equal(_name, name));
        }
      };
      Iterable<TOperation> _filter_1 = IterableExtensions.<TOperation>filter(_filter, _function);
      List<TOperation> _list = IterableExtensions.<TOperation>toList(_filter_1);
      result.addAll(_list);
      int _size = result.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        EList<Classifier> _superTypes = clazz.getSuperTypes();
        Iterable<TClass> _filter_2 = Iterables.<TClass>filter(_superTypes, TClass.class);
        final Procedure1<TClass> _function_1 = new Procedure1<TClass>() {
          public void apply(final TClass s) {
            List<TOperation> _findTextRamOperations = TextRamEcoreUtil.findTextRamOperations(s, name);
            result.addAll(_findTextRamOperations);
          }
        };
        IterableExtensions.<TClass>forEach(_filter_2, _function_1);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  /**
   * Return a {@link TOperation operation} from {@link TClass clazz}
   * 
   * @param clazz owner of the operation
   * @param operation Ram's {@Operation operation} that contains the signature of the {@link TOperation textram's operation} to find
   * return if founded it returns a {@link TOperation textram's operation}
   */
  public static TOperation findTextRamOperation(final TClass clazz, final Operation operation) {
    String _name = operation.getName();
    final List<TOperation> operations = TextRamEcoreUtil.findTextRamOperations(clazz, _name);
    for (final TOperation o : operations) {
      boolean _operationThatMatchSignature = TextRamEcoreUtil.operationThatMatchSignature(o, operation);
      boolean _equals = (_operationThatMatchSignature == true);
      if (_equals) {
        return o;
      }
    }
    return null;
  }
  
  private static boolean operationThatMatchSignature(final TOperation current, final Operation toCompare) {
    String _name = current.getName();
    String _name_1 = toCompare.getName();
    boolean _notEquals = (!Objects.equal(_name, _name_1));
    if (_notEquals) {
      return false;
    }
    EList<TParameter> _parameters = current.getParameters();
    int _size = _parameters.size();
    EList<Parameter> _parameters_1 = toCompare.getParameters();
    int _size_1 = _parameters_1.size();
    boolean _notEquals_1 = (_size != _size_1);
    if (_notEquals_1) {
      return false;
    }
    EList<TParameter> _parameters_2 = current.getParameters();
    int _size_2 = _parameters_2.size();
    boolean _greaterThan = (_size_2 > 0);
    if (_greaterThan) {
      EList<Parameter> _parameters_3 = toCompare.getParameters();
      int _size_3 = _parameters_3.size();
      int _minus = (_size_3 - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for (final Integer i : _upTo) {
        EList<Parameter> _parameters_4 = toCompare.getParameters();
        Parameter _get = _parameters_4.get((i).intValue());
        Type _type = _get.getType();
        String _name_2 = _type.getName();
        EList<TParameter> _parameters_5 = current.getParameters();
        TParameter _get_1 = _parameters_5.get((i).intValue());
        Type _type_1 = _get_1.getType();
        String _name_3 = _type_1.getName();
        boolean _notEquals_2 = (!Objects.equal(_name_2, _name_3));
        if (_notEquals_2) {
          return false;
        }
      }
    }
    return true;
  }
  
  /**
   * Returns all TextRAM's operations for the given {@link TClass class} and also its super types
   * 
   * @param clazz owner of the operations
   * @return a list of all class's operations
   */
  public static List<TOperation> findTextRamOperations(final TClass clazz) {
    List<TOperation> _xblockexpression = null;
    {
      final List<TOperation> result = CollectionLiterals.<TOperation>newArrayList();
      EList<TClassMember> _members = clazz.getMembers();
      Iterable<TOperation> _filter = Iterables.<TOperation>filter(_members, TOperation.class);
      List<TOperation> _list = IterableExtensions.<TOperation>toList(_filter);
      result.addAll(_list);
      int _size = result.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        EList<Classifier> _superTypes = clazz.getSuperTypes();
        Iterable<TClass> _filter_1 = Iterables.<TClass>filter(_superTypes, TClass.class);
        final Procedure1<TClass> _function = new Procedure1<TClass>() {
          public void apply(final TClass superType) {
            List<TOperation> _findTextRamOperations = TextRamEcoreUtil.findTextRamOperations(superType);
            result.addAll(_findTextRamOperations);
          }
        };
        IterableExtensions.<TClass>forEach(_filter_1, _function);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static List<Operation> findOperations(final ca.mcgill.cs.sel.ram.Class clazz, final String name) {
    List<Operation> _xblockexpression = null;
    {
      final List<Operation> result = CollectionLiterals.<Operation>newArrayList();
      EList<Operation> _operations = clazz.getOperations();
      final Function1<Operation,Boolean> _function = new Function1<Operation,Boolean>() {
        public Boolean apply(final Operation o) {
          String _name = o.getName();
          return Boolean.valueOf(Objects.equal(_name, name));
        }
      };
      Iterable<Operation> _filter = IterableExtensions.<Operation>filter(_operations, _function);
      List<Operation> _list = IterableExtensions.<Operation>toList(_filter);
      result.addAll(_list);
      int _size = result.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        EList<Classifier> _superTypes = clazz.getSuperTypes();
        Iterable<ca.mcgill.cs.sel.ram.Class> _filter_1 = Iterables.<ca.mcgill.cs.sel.ram.Class>filter(_superTypes, ca.mcgill.cs.sel.ram.Class.class);
        final Procedure1<ca.mcgill.cs.sel.ram.Class> _function_1 = new Procedure1<ca.mcgill.cs.sel.ram.Class>() {
          public void apply(final ca.mcgill.cs.sel.ram.Class s) {
            List<Operation> _findOperations = TextRamEcoreUtil.findOperations(s, name);
            result.addAll(_findOperations);
          }
        };
        IterableExtensions.<ca.mcgill.cs.sel.ram.Class>forEach(_filter_1, _function_1);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static List<TOperation> findAspectOperations(final Aspect aspect, final String operationName) {
    List<TOperation> _xblockexpression = null;
    {
      final List<TOperation> result = CollectionLiterals.<TOperation>newArrayList();
      StructuralView _structuralView = aspect.getStructuralView();
      EList<Classifier> _classes = _structuralView.getClasses();
      Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
      final Function1<TClass,EList<TClassMember>> _function = new Function1<TClass,EList<TClassMember>>() {
        public EList<TClassMember> apply(final TClass it) {
          return it.getMembers();
        }
      };
      Iterable<EList<TClassMember>> _map = IterableExtensions.<TClass, EList<TClassMember>>map(_filter, _function);
      Iterable<TClassMember> _flatten = Iterables.<TClassMember>concat(_map);
      Iterable<TOperation> _filter_1 = Iterables.<TOperation>filter(_flatten, TOperation.class);
      final Function1<TOperation,Boolean> _function_1 = new Function1<TOperation,Boolean>() {
        public Boolean apply(final TOperation o) {
          String _name = o.getName();
          return Boolean.valueOf(Objects.equal(_name, operationName));
        }
      };
      Iterable<TOperation> _filter_2 = IterableExtensions.<TOperation>filter(_filter_1, _function_1);
      List<TOperation> _list = IterableExtensions.<TOperation>toList(_filter_2);
      result.addAll(_list);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  /**
   * Gets the class from a {@link TInteractionMessage interaction}.
   * Evaluates the rightlifeline's referenceType attribute and resolves how to get the corresponded class.
   * 
   * @param textRamInteraction current message interaction
   * @return {@link TClass class} owner f the message interaction
   */
  public static TClass getTextRamClass(final TInteractionMessage textRamInteraction) {
    try {
      TClass _xblockexpression = null;
      {
        TClass result = null;
        TClass result1 = null;
        TLifeline _rightLifeline = textRamInteraction.getRightLifeline();
        TLifelineReferenceType _referenceType = _rightLifeline.getReferenceType();
        boolean _equals = Objects.equal(_referenceType, TLifelineReferenceType.REFERENCE);
        if (_equals) {
          TLifeline _rightLifeline_1 = textRamInteraction.getRightLifeline();
          TTypedElement _represents = _rightLifeline_1.getRepresents();
          result = ((TClass) _represents);
        }
        TLifeline _rightLifeline_2 = textRamInteraction.getRightLifeline();
        TLifelineReferenceType _referenceType_1 = _rightLifeline_2.getReferenceType();
        boolean _equals_1 = Objects.equal(_referenceType_1, TLifelineReferenceType.ASSOCIATION);
        if (_equals_1) {
          TLifeline _rightLifeline_3 = textRamInteraction.getRightLifeline();
          TTypedElement _represents_1 = _rightLifeline_3.getRepresents();
          TAssociationEnd _toEnd = ((TAssociation) _represents_1).getToEnd();
          TClass _classReference = _toEnd.getClassReference();
          result = ((TClass) _classReference);
        }
        TLifeline _rightLifeline_4 = textRamInteraction.getRightLifeline();
        TLifelineReferenceType _referenceType_2 = _rightLifeline_4.getReferenceType();
        boolean _equals_2 = Objects.equal(_referenceType_2, TLifelineReferenceType.ATTRIBUTE);
        if (_equals_2) {
          throw new Exception("Attributes are not supported as TLifeline references");
        }
        _xblockexpression = result;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public TAssociation getTAssociation(final Aspect aspect, final String name) {
    StructuralView _structuralView = aspect.getStructuralView();
    final TStructuralView tStructuralView = ((TStructuralView) _structuralView);
    EList<TAssociation> _tAssociations = tStructuralView.getTAssociations();
    final Function1<TAssociation,Boolean> _function = new Function1<TAssociation,Boolean>() {
      public Boolean apply(final TAssociation a) {
        String _name = a.getName();
        return Boolean.valueOf(Objects.equal(_name, name));
      }
    };
    return IterableExtensions.<TAssociation>findFirst(_tAssociations, _function);
  }
  
  protected Type _getTypeReference(final Aspect aspect, final PrimitiveType type) {
    StructuralView _structuralView = aspect.getStructuralView();
    EList<Type> _types = _structuralView.getTypes();
    Iterable<PrimitiveType> _filter = Iterables.<PrimitiveType>filter(_types, PrimitiveType.class);
    final Function1<PrimitiveType,Boolean> _function = new Function1<PrimitiveType,Boolean>() {
      public Boolean apply(final PrimitiveType t) {
        String _name = t.getName();
        String _name_1 = type.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<PrimitiveType>findFirst(_filter, _function);
  }
  
  protected Type _getTypeReference(final Aspect aspect, final Type type) {
    StructuralView _structuralView = aspect.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    Iterable<ca.mcgill.cs.sel.ram.Class> _filter = Iterables.<ca.mcgill.cs.sel.ram.Class>filter(_classes, ca.mcgill.cs.sel.ram.Class.class);
    final Function1<ca.mcgill.cs.sel.ram.Class,Boolean> _function = new Function1<ca.mcgill.cs.sel.ram.Class,Boolean>() {
      public Boolean apply(final ca.mcgill.cs.sel.ram.Class c) {
        String _name = c.getName();
        String _name_1 = type.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<ca.mcgill.cs.sel.ram.Class>findFirst(_filter, _function);
  }
  
  protected Type _getTypeReference(final Aspect aspect, final RVoid type) {
    StructuralView _structuralView = aspect.getStructuralView();
    EList<Type> _types = _structuralView.getTypes();
    Iterable<RVoid> _filter = Iterables.<RVoid>filter(_types, RVoid.class);
    final Function1<RVoid,Boolean> _function = new Function1<RVoid,Boolean>() {
      public Boolean apply(final RVoid t) {
        String _name = t.getName();
        String _name_1 = type.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<RVoid>findFirst(_filter, _function);
  }
  
  protected Type _getTypeReference(final Aspect aspect, final RSet type) {
    StructuralView _structuralView = aspect.getStructuralView();
    EList<Type> _types = _structuralView.getTypes();
    Iterable<RSet> _filter = Iterables.<RSet>filter(_types, RSet.class);
    final Function1<RSet,Boolean> _function = new Function1<RSet,Boolean>() {
      public Boolean apply(final RSet t) {
        String _name = t.getName();
        String _name_1 = type.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<RSet>findFirst(_filter, _function);
  }
  
  protected Type _getTypeReference(final Aspect aspect, final RAny type) {
    StructuralView _structuralView = aspect.getStructuralView();
    EList<Type> _types = _structuralView.getTypes();
    Iterable<RAny> _filter = Iterables.<RAny>filter(_types, RAny.class);
    final Function1<RAny,Boolean> _function = new Function1<RAny,Boolean>() {
      public Boolean apply(final RAny t) {
        String _name = t.getName();
        String _name_1 = type.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<RAny>findFirst(_filter, _function);
  }
  
  public TClass findClass(final TAspect aspect, final String name) {
    StructuralView _structuralView = aspect.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
    final Function1<TClass,Boolean> _function = new Function1<TClass,Boolean>() {
      public Boolean apply(final TClass c) {
        String _name = c.getName();
        return Boolean.valueOf(Objects.equal(_name, name));
      }
    };
    return IterableExtensions.<TClass>findFirst(_filter, _function);
  }
  
  /**
   * Gets a hierarchy of the external aspect's classes of type EXTENDS defined in the header of the given {@link TAspect aspect}
   * 
   * @param aspect owner of the external aspects
   * @return a flatten list of the hierarchy of the extended classes for the given aspects
   */
  public List<TClass> getExtendedClasses(final TAspect aspect) {
    List<TClass> _xblockexpression = null;
    {
      final List<TClass> result = CollectionLiterals.<TClass>newArrayList();
      this.addExtendedClasses(aspect, result);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private void addExtendedClasses(final TAspect aspect, final List<TClass> classes) {
    StructuralView _structuralView = aspect.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
    Iterables.<TClass>addAll(classes, _filter);
    Iterable<TAspect> _extendedExternalAspects = this.getExtendedExternalAspects(aspect);
    final Procedure1<TAspect> _function = new Procedure1<TAspect>() {
      public void apply(final TAspect a) {
        TextRamEcoreUtil.this.addExtendedClasses(a, classes);
      }
    };
    IterableExtensions.<TAspect>forEach(_extendedExternalAspects, _function);
  }
  
  public Iterable<TAspect> getExternalAspectsFromHeader(final TAspect aspect) {
    Iterable<TAspect> _xblockexpression = null;
    {
      EList<TInstantiationHeader> _headerInstantiations = aspect.getHeaderInstantiations();
      final Function1<TInstantiationHeader,EList<TAspect>> _function = new Function1<TInstantiationHeader,EList<TAspect>>() {
        public EList<TAspect> apply(final TInstantiationHeader it) {
          return it.getExternalAspects();
        }
      };
      List<EList<TAspect>> _map = ListExtensions.<TInstantiationHeader, EList<TAspect>>map(_headerInstantiations, _function);
      final Iterable<TAspect> validExternalAspects = Iterables.<TAspect>concat(_map);
      _xblockexpression = validExternalAspects;
    }
    return _xblockexpression;
  }
  
  public EList<Type> getTypesFor(final StructuralView structuralView) {
    EList<Type> _types = structuralView.getTypes();
    TextRamEcoreUtil.appendPrimitiveTypes(_types);
    EList<Type> _types_1 = structuralView.getTypes();
    EList<Type> _types_2 = structuralView.getTypes();
    BasicEList<Type> _addRSetPrimitiveTypes = TextRamEcoreUtil.addRSetPrimitiveTypes(_types_2);
    _types_1.addAll(_addRSetPrimitiveTypes);
    return TextRamEcoreUtil.getAllTypes(structuralView);
  }
  
  public List<PrimitiveType> getPrimitiveTypes(final StructuralView structuralView) {
    List<PrimitiveType> _xblockexpression = null;
    {
      EList<Type> _types = structuralView.getTypes();
      TextRamEcoreUtil.appendPrimitiveTypes(_types);
      EList<Type> _types_1 = structuralView.getTypes();
      Iterable<PrimitiveType> _filter = Iterables.<PrimitiveType>filter(_types_1, PrimitiveType.class);
      _xblockexpression = IterableExtensions.<PrimitiveType>toList(_filter);
    }
    return _xblockexpression;
  }
  
  public List<Classifier> getClasses(final Instantiation instantiation) {
    Aspect _externalAspect = instantiation.getExternalAspect();
    StructuralView _structuralView = _externalAspect.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    return IterableExtensions.<Classifier>toList(_classes);
  }
  
  public Set<TClass> getInstantiationsClasses(final TAspect aspect) {
    final Set<TClass> res = CollectionLiterals.<TClass>newHashSet();
    Set<TClass> _collectClassesFromInstantiations = this.collectClassesFromInstantiations(aspect, res);
    res.addAll(_collectClassesFromInstantiations);
    return res;
  }
  
  private Set<TClass> collectClassesFromInstantiations(final TAspect aspect, final Set<TClass> classes) {
    StructuralView _structuralView = aspect.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
    final Procedure1<TClass> _function = new Procedure1<TClass>() {
      public void apply(final TClass c) {
        final Function1<TClass,Boolean> _function = new Function1<TClass,Boolean>() {
          public Boolean apply(final TClass q) {
            String _name = q.getName();
            String _name_1 = c.getName();
            return Boolean.valueOf(Objects.equal(_name, _name_1));
          }
        };
        boolean _exists = IterableExtensions.<TClass>exists(classes, _function);
        boolean _equals = (_exists == false);
        if (_equals) {
          classes.add(c);
        }
      }
    };
    IterableExtensions.<TClass>forEach(_filter, _function);
    EList<TInstantiationHeader> _headerInstantiations = aspect.getHeaderInstantiations();
    final Function1<TInstantiationHeader,EList<TAspect>> _function_1 = new Function1<TInstantiationHeader,EList<TAspect>>() {
      public EList<TAspect> apply(final TInstantiationHeader it) {
        return it.getExternalAspects();
      }
    };
    List<EList<TAspect>> _map = ListExtensions.<TInstantiationHeader, EList<TAspect>>map(_headerInstantiations, _function_1);
    Iterable<TAspect> _flatten = Iterables.<TAspect>concat(_map);
    final Procedure1<TAspect> _function_2 = new Procedure1<TAspect>() {
      public void apply(final TAspect i) {
        Set<TClass> _collectClassesFromInstantiations = TextRamEcoreUtil.this.collectClassesFromInstantiations(i, classes);
        classes.addAll(_collectClassesFromInstantiations);
      }
    };
    IterableExtensions.<TAspect>forEach(_flatten, _function_2);
    return classes;
  }
  
  public List<TOperation> getMembersFrom(final TClassifierMapping classifierMapping) {
    Classifier _fromElement = classifierMapping.getFromElement();
    final TClass fromElement = ((TClass) _fromElement);
    EList<TClassMember> _members = fromElement.getMembers();
    Iterable<TOperation> _filter = Iterables.<TOperation>filter(_members, TOperation.class);
    return IterableExtensions.<TOperation>toList(_filter);
  }
  
  public List<TOperation> getPublicOperations(final Aspect aspect) {
    List<TOperation> _xblockexpression = null;
    {
      StructuralView _structuralView = aspect.getStructuralView();
      EList<Classifier> _classes = _structuralView.getClasses();
      Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
      final Function1<TClass,EList<TClassMember>> _function = new Function1<TClass,EList<TClassMember>>() {
        public EList<TClassMember> apply(final TClass it) {
          return it.getMembers();
        }
      };
      Iterable<EList<TClassMember>> _map = IterableExtensions.<TClass, EList<TClassMember>>map(_filter, _function);
      Iterable<TClassMember> _flatten = Iterables.<TClassMember>concat(_map);
      Iterable<TOperation> _filter_1 = Iterables.<TOperation>filter(_flatten, TOperation.class);
      final Function1<TOperation,Boolean> _function_1 = new Function1<TOperation,Boolean>() {
        public Boolean apply(final TOperation oper) {
          Visibility _visibility = oper.getVisibility();
          return Boolean.valueOf(Objects.equal(_visibility, Visibility.PUBLIC));
        }
      };
      Iterable<TOperation> _filter_2 = IterableExtensions.<TOperation>filter(_filter_1, _function_1);
      final List<TOperation> operations = IterableExtensions.<TOperation>toList(_filter_2);
      _xblockexpression = operations;
    }
    return _xblockexpression;
  }
  
  public Iterable<TOperation> getOperations(final Aspect aspect) {
    Iterable<TOperation> _xblockexpression = null;
    {
      StructuralView _structuralView = aspect.getStructuralView();
      EList<Classifier> _classes = _structuralView.getClasses();
      Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
      final Function1<TClass,EList<TClassMember>> _function = new Function1<TClass,EList<TClassMember>>() {
        public EList<TClassMember> apply(final TClass it) {
          return it.getMembers();
        }
      };
      Iterable<EList<TClassMember>> _map = IterableExtensions.<TClass, EList<TClassMember>>map(_filter, _function);
      Iterable<TClassMember> _flatten = Iterables.<TClassMember>concat(_map);
      final Iterable<TOperation> operations = Iterables.<TOperation>filter(_flatten, TOperation.class);
      _xblockexpression = operations;
    }
    return _xblockexpression;
  }
  
  public List<TTypedElement> getTTypedElements(final TAspect aspect) {
    List<TTypedElement> _xblockexpression = null;
    {
      final List<TTypedElement> result = CollectionLiterals.<TTypedElement>newArrayList();
      this.addExtendendTTypedElements(aspect, result);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public List<TOperation> getExtendedOperationsFromRightLifeline(final TInteractionMessage interaction) {
    try {
      TMessage _message = interaction.getMessage();
      if (((_message instanceof TMessage) == false)) {
        throw new Exception("Concrete type of TAbstractMessage must be TMessage");
      }
      final TClass owner = TextRamEcoreUtil.getTextRamClass(interaction);
      final List<TOperation> operations = TextRamEcoreUtil.findTextRamOperations(owner);
      return operations;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Gets the hierarchy of the external aspect's operations of type EXTENDS defined in the header of the given {@link TAspect aspect}
   * 
   * @param aspect owner of the external aspects
   * @return a flatten list of the hierarchy of the extended classes for the given aspects.
   */
  public List<TOperation> getExtendedOperations(final TAspect aspect) {
    List<TOperation> _xblockexpression = null;
    {
      final List<TOperation> result = CollectionLiterals.<TOperation>newArrayList();
      this.addExtendedOperations(aspect, result);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private void addExtendendTTypedElements(final TAspect aspect, final List<TTypedElement> elements) {
    List<TAssociation> _allAssociations = this.getAllAssociations(aspect);
    elements.addAll(_allAssociations);
    Iterable<TAttribute> _allAttributes = this.getAllAttributes(aspect);
    Iterables.<TTypedElement>addAll(elements, _allAttributes);
    List<TTypedElement> _allClasses = this.getAllClasses(aspect);
    elements.addAll(_allClasses);
    Iterable<TAspect> _extendedExternalAspects = this.getExtendedExternalAspects(aspect);
    final Procedure1<TAspect> _function = new Procedure1<TAspect>() {
      public void apply(final TAspect a) {
        TextRamEcoreUtil.this.addExtendendTTypedElements(a, elements);
      }
    };
    IterableExtensions.<TAspect>forEach(_extendedExternalAspects, _function);
  }
  
  private void addExtendedOperations(final TAspect aspect, final List<TOperation> operations) {
    StructuralView _structuralView = aspect.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
    final Function1<TClass,EList<TClassMember>> _function = new Function1<TClass,EList<TClassMember>>() {
      public EList<TClassMember> apply(final TClass it) {
        return it.getMembers();
      }
    };
    Iterable<EList<TClassMember>> _map = IterableExtensions.<TClass, EList<TClassMember>>map(_filter, _function);
    Iterable<TClassMember> _flatten = Iterables.<TClassMember>concat(_map);
    Iterable<TOperation> _filter_1 = Iterables.<TOperation>filter(_flatten, TOperation.class);
    Iterables.<TOperation>addAll(operations, _filter_1);
    Iterable<TAspect> _extendedExternalAspects = this.getExtendedExternalAspects(aspect);
    final Procedure1<TAspect> _function_1 = new Procedure1<TAspect>() {
      public void apply(final TAspect a) {
        TextRamEcoreUtil.this.addExtendedOperations(a, operations);
      }
    };
    IterableExtensions.<TAspect>forEach(_extendedExternalAspects, _function_1);
  }
  
  /**
   * gets all external aspects defined in the header instantiation of the given {@link TAspect aspect} model.
   * 
   * @param aspect owner of the external aspects
   * @return external aspect from the given aspect
   */
  private Iterable<TAspect> getExtendedExternalAspects(final TAspect aspect) {
    EList<TInstantiationHeader> _headerInstantiations = aspect.getHeaderInstantiations();
    final Function1<TInstantiationHeader,Boolean> _function = new Function1<TInstantiationHeader,Boolean>() {
      public Boolean apply(final TInstantiationHeader i) {
        InstantiationType _type = i.getType();
        return Boolean.valueOf(Objects.equal(_type, InstantiationType.EXTENDS));
      }
    };
    Iterable<TInstantiationHeader> _filter = IterableExtensions.<TInstantiationHeader>filter(_headerInstantiations, _function);
    final Function1<TInstantiationHeader,EList<TAspect>> _function_1 = new Function1<TInstantiationHeader,EList<TAspect>>() {
      public EList<TAspect> apply(final TInstantiationHeader it) {
        return it.getExternalAspects();
      }
    };
    Iterable<EList<TAspect>> _map = IterableExtensions.<TInstantiationHeader, EList<TAspect>>map(_filter, _function_1);
    Iterable<TAspect> _flatten = Iterables.<TAspect>concat(_map);
    return Iterables.<TAspect>filter(_flatten, TAspect.class);
  }
  
  private List<TTypedElement> getAllClasses(final Aspect aspect) {
    StructuralView _structuralView = aspect.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
    Iterable<TTypedElement> _filter_1 = Iterables.<TTypedElement>filter(_filter, TTypedElement.class);
    return IterableExtensions.<TTypedElement>toList(_filter_1);
  }
  
  private Iterable<TAttribute> getAllAttributes(final Aspect aspect) {
    StructuralView _structuralView = aspect.getStructuralView();
    final TStructuralView tStructuralView = ((TStructuralView) _structuralView);
    EList<Classifier> _classes = tStructuralView.getClasses();
    Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
    final Function1<TClass,EList<TClassMember>> _function = new Function1<TClass,EList<TClassMember>>() {
      public EList<TClassMember> apply(final TClass it) {
        return it.getMembers();
      }
    };
    Iterable<EList<TClassMember>> _map = IterableExtensions.<TClass, EList<TClassMember>>map(_filter, _function);
    Iterable<TClassMember> _flatten = Iterables.<TClassMember>concat(_map);
    return Iterables.<TAttribute>filter(_flatten, TAttribute.class);
  }
  
  private List<TAssociation> getAllAssociations(final Aspect aspect) {
    StructuralView _structuralView = aspect.getStructuralView();
    final TStructuralView tStructuralView = ((TStructuralView) _structuralView);
    EList<TAssociation> _tAssociations = tStructuralView.getTAssociations();
    return IterableExtensions.<TAssociation>toList(_tAssociations);
  }
  
  private static EList<Type> getAllTypes(final StructuralView structuralView) {
    EList<Type> _xblockexpression = null;
    {
      final EList<Type> typeList = new BasicEList<Type>();
      EList<Classifier> _classes = structuralView.getClasses();
      for (final Classifier clazz : _classes) {
        {
          typeList.add(clazz);
          EList<Type> _types = structuralView.getTypes();
          Iterable<RSet> _filter = Iterables.<RSet>filter(_types, RSet.class);
          final Function1<RSet,Boolean> _function = new Function1<RSet,Boolean>() {
            public Boolean apply(final RSet t) {
              ObjectType _type = t.getType();
              String _name = _type.getName();
              String _name_1 = clazz.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          boolean _exists = IterableExtensions.<RSet>exists(_filter, _function);
          boolean _equals = (_exists == false);
          if (_equals) {
            RSet _createRSet = RamFactory.eINSTANCE.createRSet();
            final Procedure1<RSet> _function_1 = new Procedure1<RSet>() {
              public void apply(final RSet it) {
                it.setType(clazz);
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("Set<");
                String _name = clazz.getName();
                _builder.append(_name, "");
                _builder.append(">");
                it.setInstanceClassName(_builder.toString());
              }
            };
            final RSet rSet = ObjectExtensions.<RSet>operator_doubleArrow(_createRSet, _function_1);
            EList<Type> _types_1 = structuralView.getTypes();
            _types_1.add(rSet);
            typeList.add(rSet);
          }
        }
      }
      EList<Type> _types = structuralView.getTypes();
      for (final Type type : _types) {
        typeList.add(type);
      }
      _xblockexpression = typeList;
    }
    return _xblockexpression;
  }
  
  private static boolean appendPrimitiveTypes(final EList<Type> typesToReturn) {
    boolean _xifexpression = false;
    int _length = ((Object[])Conversions.unwrapArray(typesToReturn, Object.class)).length;
    boolean _equals = (_length == 0);
    if (_equals) {
      boolean _xblockexpression = false;
      {
        RVoid _createRVoid = RamFactory.eINSTANCE.createRVoid();
        typesToReturn.add(_createRVoid);
        RBoolean _createRBoolean = RamFactory.eINSTANCE.createRBoolean();
        typesToReturn.add(_createRBoolean);
        RChar _createRChar = RamFactory.eINSTANCE.createRChar();
        typesToReturn.add(_createRChar);
        RInt _createRInt = RamFactory.eINSTANCE.createRInt();
        typesToReturn.add(_createRInt);
        RString _createRString = RamFactory.eINSTANCE.createRString();
        typesToReturn.add(_createRString);
        RAny _createRAny = RamFactory.eINSTANCE.createRAny();
        typesToReturn.add(_createRAny);
        RDouble _createRDouble = RamFactory.eINSTANCE.createRDouble();
        typesToReturn.add(_createRDouble);
        RFloat _createRFloat = RamFactory.eINSTANCE.createRFloat();
        _xblockexpression = typesToReturn.add(_createRFloat);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  /**
   * This method add a RSet type for each primitive type in the list.
   * 
   * @types list of types in the structural view
   * @returns list of RSet type for each primitive type in the structural view
   */
  private static BasicEList<Type> addRSetPrimitiveTypes(final EList<Type> types) {
    BasicEList<Type> _xblockexpression = null;
    {
      final BasicEList<Type> result = new BasicEList<Type>();
      Iterable<RSet> _filter = Iterables.<RSet>filter(types, RSet.class);
      int _size = IterableExtensions.size(_filter);
      boolean _equals = (_size == 0);
      if (_equals) {
        Iterable<PrimitiveType> _filter_1 = Iterables.<PrimitiveType>filter(types, PrimitiveType.class);
        final Procedure1<PrimitiveType> _function = new Procedure1<PrimitiveType>() {
          public void apply(final PrimitiveType t) {
            RSet _createRSet = RamFactory.eINSTANCE.createRSet();
            final Procedure1<RSet> _function = new Procedure1<RSet>() {
              public void apply(final RSet it) {
                it.setType(t);
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("Set<");
                String _name = t.getName();
                _builder.append(_name, "");
                _builder.append(">");
                it.setInstanceClassName(_builder.toString());
              }
            };
            final RSet rSet = ObjectExtensions.<RSet>operator_doubleArrow(_createRSet, _function);
            result.add(rSet);
          }
        };
        IterableExtensions.<PrimitiveType>forEach(_filter_1, _function);
      } else {
        Iterable<RSet> _filter_2 = Iterables.<RSet>filter(types, RSet.class);
        Iterables.<Type>addAll(result, _filter_2);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public List<TParameter> getParameters(final Aspect aspect) {
    List<TParameter> _xblockexpression = null;
    {
      StructuralView _structuralView = aspect.getStructuralView();
      final TStructuralView tStructuralView = ((TStructuralView) _structuralView);
      EList<Classifier> _classes = tStructuralView.getClasses();
      Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
      final Function1<TClass,EList<TClassMember>> _function = new Function1<TClass,EList<TClassMember>>() {
        public EList<TClassMember> apply(final TClass it) {
          return it.getMembers();
        }
      };
      Iterable<EList<TClassMember>> _map = IterableExtensions.<TClass, EList<TClassMember>>map(_filter, _function);
      Iterable<TClassMember> _flatten = Iterables.<TClassMember>concat(_map);
      Iterable<TOperation> _filter_1 = Iterables.<TOperation>filter(_flatten, TOperation.class);
      final Function1<TOperation,EList<TParameter>> _function_1 = new Function1<TOperation,EList<TParameter>>() {
        public EList<TParameter> apply(final TOperation it) {
          return it.getParameters();
        }
      };
      Iterable<EList<TParameter>> _map_1 = IterableExtensions.<TOperation, EList<TParameter>>map(_filter_1, _function_1);
      Iterable<TParameter> _flatten_1 = Iterables.<TParameter>concat(_map_1);
      _xblockexpression = IterableExtensions.<TParameter>toList(_flatten_1);
    }
    return _xblockexpression;
  }
  
  /**
   * Gets all assignable features from TInteractionMessage, according the following rules:
   * 1. Only local properties defined in the left lifeline
   * 2. All aspect's associations
   * 3. Right lifeline
   * 
   * @param textRamInteractionMessage current interaction
   */
  public List<TMessageAssignableFeature> getAssignableFeatures(final TInteractionMessage textRamInteractionMessage) {
    List<TMessageAssignableFeature> _xblockexpression = null;
    {
      final List<TMessageAssignableFeature> result = CollectionLiterals.<TMessageAssignableFeature>newArrayList();
      TLifeline _leftLifeline = textRamInteractionMessage.getLeftLifeline();
      EList<TTemporaryProperty> _localProperties = _leftLifeline.getLocalProperties();
      result.addAll(_localProperties);
      Aspect _aspect = this.getAspect(textRamInteractionMessage);
      List<TAssociation> _allAssociations = this.getAllAssociations(_aspect);
      result.addAll(_allAssociations);
      TLifeline _rightLifeline = textRamInteractionMessage.getRightLifeline();
      result.add(_rightLifeline);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private EList<TLifeline> allLifelines(final Aspect aspect) {
    EList<AbstractMessageView> _messageViews = aspect.getMessageViews();
    AbstractMessageView _get = _messageViews.get(0);
    final TAbstractMessageView view = ((TAbstractMessageView) _get);
    return view.getLifelines();
  }
  
  private Aspect getAspect(final TInteractionMessage textRamInteractionMessage) {
    Aspect _xblockexpression = null;
    {
      final Aspect result = TextRamEcoreUtil.<Aspect>getRootContainerOfType(textRamInteractionMessage, RamPackage.Literals.ASPECT);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public Iterable<TTemporaryProperty> getGetTAttributesFromLifelines(final Aspect aspect) {
    EList<AbstractMessageView> _messageViews = aspect.getMessageViews();
    AbstractMessageView _head = IterableExtensions.<AbstractMessageView>head(_messageViews);
    final TAbstractMessageView tAbstractMessageView = ((TAbstractMessageView) _head);
    boolean _notEquals = (!Objects.equal(tAbstractMessageView, null));
    if (_notEquals) {
      EList<TLifeline> _lifelines = tAbstractMessageView.getLifelines();
      final Function1<TLifeline,EList<TTemporaryProperty>> _function = new Function1<TLifeline,EList<TTemporaryProperty>>() {
        public EList<TTemporaryProperty> apply(final TLifeline it) {
          return it.getLocalProperties();
        }
      };
      List<EList<TTemporaryProperty>> _map = ListExtensions.<TLifeline, EList<TTemporaryProperty>>map(_lifelines, _function);
      return Iterables.<TTemporaryProperty>concat(_map);
    }
    return null;
  }
  
  public List<TAspectMessageView> getAspectMessageViews(final TAbstractMessageView abstractMessageView) {
    List<TAspectMessageView> _xblockexpression = null;
    {
      final List<TAspectMessageView> result = CollectionLiterals.<TAspectMessageView>newArrayList();
      EList<TAbstractMessages> _messages = abstractMessageView.getMessages();
      Iterable<TAspectMessageView> _filter = Iterables.<TAspectMessageView>filter(_messages, TAspectMessageView.class);
      final Procedure1<TAspectMessageView> _function = new Procedure1<TAspectMessageView>() {
        public void apply(final TAspectMessageView m) {
          result.add(m);
        }
      };
      IterableExtensions.<TAspectMessageView>forEach(_filter, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public Iterable<TOperation> getOperationsForAspectMessageView(final TAbstractMessages messageView) {
    TClass _class_ = messageView.getClass_();
    boolean _notEquals = (!Objects.equal(_class_, null));
    if (_notEquals) {
      TClass _class__1 = messageView.getClass_();
      EList<TClassMember> _members = _class__1.getMembers();
      return Iterables.<TOperation>filter(_members, TOperation.class);
    } else {
      final Aspect aspect = TextRamEcoreUtil.<Aspect>getRootContainerOfType(messageView, RamPackage.Literals.ASPECT);
      return this.getPublicOperations(aspect);
    }
  }
  
  public Iterable<TParameter> getArgumentsForAspectMessageViewOperation(final TAbstractMessages messageView) {
    Iterable<TParameter> _xblockexpression = null;
    {
      final Aspect aspect = TextRamEcoreUtil.<Aspect>getRootContainerOfType(messageView, RamPackage.Literals.ASPECT);
      final TClass clazz = messageView.getClass_();
      Iterable<TOperation> operations = null;
      boolean _notEquals = (!Objects.equal(clazz, null));
      if (_notEquals) {
        StructuralView _structuralView = aspect.getStructuralView();
        EList<Classifier> _classes = ((TStructuralView) _structuralView).getClasses();
        Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
        final Function1<TClass,Boolean> _function = new Function1<TClass,Boolean>() {
          public Boolean apply(final TClass c) {
            String _name = c.getName();
            TClass _class_ = messageView.getClass_();
            String _name_1 = _class_.getName();
            return Boolean.valueOf(Objects.equal(_name, _name_1));
          }
        };
        Iterable<TClass> _filter_1 = IterableExtensions.<TClass>filter(_filter, _function);
        final Function1<TClass,EList<TClassMember>> _function_1 = new Function1<TClass,EList<TClassMember>>() {
          public EList<TClassMember> apply(final TClass it) {
            return it.getMembers();
          }
        };
        Iterable<EList<TClassMember>> _map = IterableExtensions.<TClass, EList<TClassMember>>map(_filter_1, _function_1);
        Iterable<TClassMember> _flatten = Iterables.<TClassMember>concat(_map);
        Iterable<TOperation> _filter_2 = Iterables.<TOperation>filter(_flatten, TOperation.class);
        final Function1<TOperation,Boolean> _function_2 = new Function1<TOperation,Boolean>() {
          public Boolean apply(final TOperation o) {
            String _name = o.getName();
            TOperation _specifies = messageView.getSpecifies();
            String _name_1 = _specifies.getName();
            return Boolean.valueOf(Objects.equal(_name, _name_1));
          }
        };
        Iterable<TOperation> _filter_3 = IterableExtensions.<TOperation>filter(_filter_2, _function_2);
        operations = _filter_3;
      } else {
        StructuralView _structuralView_1 = aspect.getStructuralView();
        EList<Classifier> _classes_1 = ((TStructuralView) _structuralView_1).getClasses();
        Iterable<TClass> _filter_4 = Iterables.<TClass>filter(_classes_1, TClass.class);
        final Function1<TClass,EList<TClassMember>> _function_3 = new Function1<TClass,EList<TClassMember>>() {
          public EList<TClassMember> apply(final TClass it) {
            return it.getMembers();
          }
        };
        Iterable<EList<TClassMember>> _map_1 = IterableExtensions.<TClass, EList<TClassMember>>map(_filter_4, _function_3);
        Iterable<TClassMember> _flatten_1 = Iterables.<TClassMember>concat(_map_1);
        Iterable<TOperation> _filter_5 = Iterables.<TOperation>filter(_flatten_1, TOperation.class);
        final Function1<TOperation,Boolean> _function_4 = new Function1<TOperation,Boolean>() {
          public Boolean apply(final TOperation o) {
            String _name = o.getName();
            TOperation _specifies = messageView.getSpecifies();
            String _name_1 = _specifies.getName();
            return Boolean.valueOf(Objects.equal(_name, _name_1));
          }
        };
        Iterable<TOperation> _filter_6 = IterableExtensions.<TOperation>filter(_filter_5, _function_4);
        operations = _filter_6;
      }
      final Function1<TOperation,EList<TParameter>> _function_5 = new Function1<TOperation,EList<TParameter>>() {
        public EList<TParameter> apply(final TOperation it) {
          return it.getParameters();
        }
      };
      Iterable<EList<TParameter>> _map_2 = IterableExtensions.<TOperation, EList<TParameter>>map(operations, _function_5);
      final Iterable<TParameter> result = Iterables.<TParameter>concat(_map_2);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public List<TValueSpecification> getTValueSpecificationUsedByMessageView(final TAbstractMessages messageView) {
    List<TValueSpecification> _xblockexpression = null;
    {
      final List<TValueSpecification> result = CollectionLiterals.<TValueSpecification>newArrayList();
      EList<TInteraction> _interactionMessages = messageView.getInteractionMessages();
      final Procedure1<TInteraction> _function = new Procedure1<TInteraction>() {
        public void apply(final TInteraction i) {
          final List<TValueSpecification> textRamValueSpecification = TextRamEcoreUtil.this.getTValueSpecificationFromInteraction(i);
          result.addAll(textRamValueSpecification);
        }
      };
      IterableExtensions.<TInteraction>forEach(_interactionMessages, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private List<TValueSpecification> _getTValueSpecificationFromInteraction(final TInteractionMessage interaction) {
    List<TValueSpecification> _xblockexpression = null;
    {
      final List<TValueSpecification> result = CollectionLiterals.<TValueSpecification>newArrayList();
      final TMessage message = interaction.getMessage();
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(message, null));
      if (!_notEquals) {
        _and = false;
      } else {
        TMessageAssignableFeature _assignTo = message.getAssignTo();
        boolean _notEquals_1 = (!Objects.equal(_assignTo, null));
        _and = _notEquals_1;
      }
      if (_and) {
        TMessageAssignableFeature _assignTo_1 = message.getAssignTo();
        if (((_assignTo_1 instanceof TAssociation) == false)) {
          TMessageAssignableFeature _assignTo_2 = message.getAssignTo();
          result.add(((TValueSpecification) _assignTo_2));
        }
      }
      TOperation _signature = message.getSignature();
      EList<TParameter> _parameters = _signature.getParameters();
      final Procedure1<TParameter> _function = new Procedure1<TParameter>() {
        public void apply(final TParameter p) {
          result.add(p);
        }
      };
      IterableExtensions.<TParameter>forEach(_parameters, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private List<TValueSpecification> _getTValueSpecificationFromInteraction(final TCombinedFragment interaction) {
    List<TValueSpecification> _xblockexpression = null;
    {
      final List<TValueSpecification> result = CollectionLiterals.<TValueSpecification>newArrayList();
      EList<TInteraction> _containers = interaction.getContainers();
      final Procedure1<TInteraction> _function = new Procedure1<TInteraction>() {
        public void apply(final TInteraction i) {
          final List<TValueSpecification> textRamValueSpecification = TextRamEcoreUtil.this.getTValueSpecificationFromInteraction(i);
          result.addAll(textRamValueSpecification);
        }
      };
      IterableExtensions.<TInteraction>forEach(_containers, _function);
      EList<TInteraction> _elseContainers = interaction.getElseContainers();
      final Procedure1<TInteraction> _function_1 = new Procedure1<TInteraction>() {
        public void apply(final TInteraction i) {
          final List<TValueSpecification> textRamValueSpecification = TextRamEcoreUtil.this.getTValueSpecificationFromInteraction(i);
          result.addAll(textRamValueSpecification);
        }
      };
      IterableExtensions.<TInteraction>forEach(_elseContainers, _function_1);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private List<TValueSpecification> _getTValueSpecificationFromInteraction(final TReturnInteraction interaction) {
    List<TValueSpecification> _xblockexpression = null;
    {
      final List<TValueSpecification> result = CollectionLiterals.<TValueSpecification>newArrayList();
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private List<TValueSpecification> _getTValueSpecificationFromInteraction(final TOcurrence interaction) {
    List<TValueSpecification> _xblockexpression = null;
    {
      final List<TValueSpecification> result = CollectionLiterals.<TValueSpecification>newArrayList();
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public List<TValueSpecification> getTValueSpecificationList(final TInteractionMessage interaction) {
    List<TValueSpecification> _xblockexpression = null;
    {
      final List<TValueSpecification> result = CollectionLiterals.<TValueSpecification>newArrayList();
      final Aspect aspect = TextRamEcoreUtil.<Aspect>getRootContainerOfType(interaction, RamPackage.Literals.ASPECT);
      TMessage _message = interaction.getMessage();
      TOperation _signature = ((TMessage) _message).getSignature();
      final String operationName = _signature.getName();
      TLifeline _rightLifeline = interaction.getRightLifeline();
      TTypedElement _represents = _rightLifeline.getRepresents();
      final TClass clazz = this.getClassOwner(_represents, aspect);
      EList<TClassMember> _members = clazz.getMembers();
      Iterable<TOperation> _filter = Iterables.<TOperation>filter(_members, TOperation.class);
      final Function1<TOperation,Boolean> _function = new Function1<TOperation,Boolean>() {
        public Boolean apply(final TOperation o) {
          String _name = o.getName();
          return Boolean.valueOf(Objects.equal(_name, operationName));
        }
      };
      Iterable<TOperation> _filter_1 = IterableExtensions.<TOperation>filter(_filter, _function);
      final Function1<TOperation,EList<TParameter>> _function_1 = new Function1<TOperation,EList<TParameter>>() {
        public EList<TParameter> apply(final TOperation it) {
          return it.getParameters();
        }
      };
      Iterable<EList<TParameter>> _map = IterableExtensions.<TOperation, EList<TParameter>>map(_filter_1, _function_1);
      Iterable<TParameter> _flatten = Iterables.<TParameter>concat(_map);
      final Procedure1<TParameter> _function_2 = new Procedure1<TParameter>() {
        public void apply(final TParameter p) {
          result.add(p);
        }
      };
      IterableExtensions.<TParameter>forEach(_flatten, _function_2);
      final TAbstractMessageView messageView = TextRamEcoreUtil.<TAbstractMessageView>getRootContainerOfType(interaction, TextRamPackage.Literals.TABSTRACT_MESSAGE_VIEW);
      EList<TLifeline> _lifelines = messageView.getLifelines();
      final Function1<TLifeline,Boolean> _function_3 = new Function1<TLifeline,Boolean>() {
        public Boolean apply(final TLifeline l) {
          TLifelineReferenceType _referenceType = l.getReferenceType();
          return Boolean.valueOf(Objects.equal(_referenceType, TLifelineReferenceType.REFERENCE));
        }
      };
      Iterable<TLifeline> _filter_2 = IterableExtensions.<TLifeline>filter(_lifelines, _function_3);
      List<TLifeline> _list = IterableExtensions.<TLifeline>toList(_filter_2);
      result.addAll(_list);
      final List<TTemporaryProperty> temporaryPropertyList = CollectionLiterals.<TTemporaryProperty>newArrayList();
      TLifeline _rightLifeline_1 = interaction.getRightLifeline();
      EList<TTemporaryProperty> _localProperties = _rightLifeline_1.getLocalProperties();
      final Procedure1<TTemporaryProperty> _function_4 = new Procedure1<TTemporaryProperty>() {
        public void apply(final TTemporaryProperty p) {
          temporaryPropertyList.add(p);
        }
      };
      IterableExtensions.<TTemporaryProperty>forEach(_localProperties, _function_4);
      TLifeline _leftLifeline = interaction.getLeftLifeline();
      EList<TTemporaryProperty> _localProperties_1 = _leftLifeline.getLocalProperties();
      final Procedure1<TTemporaryProperty> _function_5 = new Procedure1<TTemporaryProperty>() {
        public void apply(final TTemporaryProperty p) {
          temporaryPropertyList.add(p);
        }
      };
      IterableExtensions.<TTemporaryProperty>forEach(_localProperties_1, _function_5);
      result.addAll(temporaryPropertyList);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public EList<TLifeline> getTLifelines(final TAspect aspect) {
    EList<AbstractMessageView> _messageViews = aspect.getMessageViews();
    AbstractMessageView _get = _messageViews.get(0);
    final TAbstractMessageView tAbstractMessageView = ((TAbstractMessageView) _get);
    return tAbstractMessageView.getLifelines();
  }
  
  private TClass _getClassOwner(final TAssociation owner, final Aspect aspect) {
    TClass _xblockexpression = null;
    {
      TAssociationEnd _toEnd = owner.getToEnd();
      TClass _classReference = _toEnd.getClassReference();
      final TClass result = ((TClass) _classReference);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private TClass _getClassOwner(final TAttribute owner, final Aspect aspect) {
    TClass _xblockexpression = null;
    {
      EObject _eContainer = owner.eContainer();
      final TClass result = ((TClass) _eContainer);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private TClass _getClassOwner(final TClass owner, final Aspect aspect) {
    TClass _xblockexpression = null;
    {
      final TClass result = owner;
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public Type getTypeReference(final Aspect aspect, final Type type) {
    if (type instanceof RSet) {
      return _getTypeReference(aspect, (RSet)type);
    } else if (type instanceof PrimitiveType) {
      return _getTypeReference(aspect, (PrimitiveType)type);
    } else if (type instanceof RAny) {
      return _getTypeReference(aspect, (RAny)type);
    } else if (type instanceof RVoid) {
      return _getTypeReference(aspect, (RVoid)type);
    } else if (type != null) {
      return _getTypeReference(aspect, type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aspect, type).toString());
    }
  }
  
  private List<TValueSpecification> getTValueSpecificationFromInteraction(final TInteraction interaction) {
    if (interaction instanceof TCombinedFragment) {
      return _getTValueSpecificationFromInteraction((TCombinedFragment)interaction);
    } else if (interaction instanceof TInteractionMessage) {
      return _getTValueSpecificationFromInteraction((TInteractionMessage)interaction);
    } else if (interaction instanceof TOcurrence) {
      return _getTValueSpecificationFromInteraction((TOcurrence)interaction);
    } else if (interaction instanceof TReturnInteraction) {
      return _getTValueSpecificationFromInteraction((TReturnInteraction)interaction);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(interaction).toString());
    }
  }
  
  private TClass getClassOwner(final TTypedElement owner, final Aspect aspect) {
    if (owner instanceof TClass) {
      return _getClassOwner((TClass)owner, aspect);
    } else if (owner instanceof TAssociation) {
      return _getClassOwner((TAssociation)owner, aspect);
    } else if (owner instanceof TAttribute) {
      return _getClassOwner((TAttribute)owner, aspect);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(owner, aspect).toString());
    }
  }
}
