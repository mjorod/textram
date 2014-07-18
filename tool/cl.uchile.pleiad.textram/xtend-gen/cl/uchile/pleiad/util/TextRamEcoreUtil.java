package cl.uchile.pleiad.util;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.Parameter;
import ca.mcgill.cs.sel.ram.PrimitiveType;
import ca.mcgill.cs.sel.ram.RAny;
import ca.mcgill.cs.sel.ram.RSet;
import ca.mcgill.cs.sel.ram.RVoid;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Type;
import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.textRam.TAssociation;
import cl.uchile.pleiad.textRam.TAssociationEnd;
import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TClassMember;
import cl.uchile.pleiad.textRam.TInteractionMessage;
import cl.uchile.pleiad.textRam.TLifeline;
import cl.uchile.pleiad.textRam.TLifelineReferenceType;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TParameter;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TTypedElement;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
        EList<TParameter> _parameters_5 = current.getParameters();
        TParameter _get_1 = _parameters_5.get((i).intValue());
        Type _type_1 = _get_1.getType();
        boolean _notEquals_2 = (!Objects.equal(_type, _type_1));
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
}
