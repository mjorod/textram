/**
 * generated by Xtext
 */
package cl.uchile.pleiad.validation;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.PrimitiveType;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Type;
import cl.uchile.pleiad.textRam.TAbstractMessageView;
import cl.uchile.pleiad.textRam.TAbstractMessages;
import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.textRam.TAttribute;
import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TClassMember;
import cl.uchile.pleiad.textRam.TClassifierMapping;
import cl.uchile.pleiad.textRam.TInteractionMessage;
import cl.uchile.pleiad.textRam.TLifeline;
import cl.uchile.pleiad.textRam.TLifelineReferenceType;
import cl.uchile.pleiad.textRam.TLocalAttribute;
import cl.uchile.pleiad.textRam.TMessage;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TParameter;
import cl.uchile.pleiad.textRam.TReference;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TTypedElement;
import cl.uchile.pleiad.textRam.TValueSpecification;
import cl.uchile.pleiad.textRam.TextRamPackage;
import cl.uchile.pleiad.util.TextRamEcoreUtil;
import cl.uchile.pleiad.validation.AbstractTextRAMValidator;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class TextRAMValidator extends AbstractTextRAMValidator {
  public final static String DUPLICATE_ELEMENT = "cl.uchile.pleiad.DuplicateElement";
  
  public final static String DUPLICATE_CLASS = "cl.uchile.pleiad.DuplicateClass";
  
  public final static String UNDEFINED_ELEMENT = "cl.uchile.pleiad.UndefinedElement";
  
  public final static String INVALID_ARGUMENTS = "cl.uchile.pleiad.InvalidArguments";
  
  public final static String MEMBERS_AMBIGUITY = "cl.uchile.pleiad.MembersAmbiguity";
  
  @Check
  public void checkNoDuplicatesAttributes(final TAttribute attr) {
    EObject _rootContainerOfType = TextRamEcoreUtil.<EObject>getRootContainerOfType(attr, TextRamPackage.Literals.TCLASS);
    final TClass owner = ((TClass) _rootContainerOfType);
    EList<TClassMember> _members = owner.getMembers();
    final Function1<TClassMember,Boolean> _function = new Function1<TClassMember,Boolean>() {
      public Boolean apply(final TClassMember m) {
        String _name = m.getName();
        String _name_1 = attr.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    Iterable<TClassMember> _filter = IterableExtensions.<TClassMember>filter(_members, _function);
    final int count = IterableExtensions.size(_filter);
    if ((count > 1)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Duplicate member \'");
      String _name = attr.getName();
      _builder.append(_name, "");
      _builder.append("\' ");
      EAttribute _tClassMember_Name = TextRamPackage.eINSTANCE.getTClassMember_Name();
      this.error(_builder.toString(), _tClassMember_Name, TextRAMValidator.DUPLICATE_ELEMENT);
    }
  }
  
  @Check
  public void checkNoDuplicationOperations(final TOperation operation) {
    EObject _rootContainerOfType = TextRamEcoreUtil.<EObject>getRootContainerOfType(operation, TextRamPackage.Literals.TCLASS);
    final TClass owner = ((TClass) _rootContainerOfType);
    EList<TClassMember> _members = owner.getMembers();
    Iterable<TOperation> _filter = Iterables.<TOperation>filter(_members, TOperation.class);
    final Function1<TOperation,Boolean> _function = new Function1<TOperation,Boolean>() {
      public Boolean apply(final TOperation o) {
        boolean _and = false;
        String _name = o.getName();
        String _name_1 = operation.getName();
        boolean _equals = Objects.equal(_name, _name_1);
        if (!_equals) {
          _and = false;
        } else {
          EList<TParameter> _parameters = o.getParameters();
          int _size = _parameters.size();
          EList<TParameter> _parameters_1 = operation.getParameters();
          int _size_1 = _parameters_1.size();
          boolean _equals_1 = (_size == _size_1);
          _and = _equals_1;
        }
        return Boolean.valueOf(_and);
      }
    };
    final Iterable<TOperation> operations = IterableExtensions.<TOperation>filter(_filter, _function);
    boolean error = false;
    final List<String> parameterTypesList = CollectionLiterals.<String>newArrayList();
    for (final TOperation o : operations) {
      {
        EList<TParameter> _parameters = o.getParameters();
        String parameterTypes = this.stringifyTypes(_parameters);
        boolean _and = false;
        if (!(error == false)) {
          _and = false;
        } else {
          boolean _contains = parameterTypesList.contains(parameterTypes);
          boolean _equals = (_contains == false);
          _and = _equals;
        }
        if (_and) {
          parameterTypesList.add(parameterTypes);
        } else {
          error = true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Duplicate member \'");
          String _name = o.getName();
          _builder.append(_name, "");
          _builder.append("\' ");
          EAttribute _tClassMember_Name = TextRamPackage.eINSTANCE.getTClassMember_Name();
          this.error(_builder.toString(), _tClassMember_Name, TextRAMValidator.DUPLICATE_ELEMENT);
        }
      }
    }
  }
  
  /**
   * converts to string each parameter's type and creates a concatenated string
   * 
   * @param parameters list of parameters
   */
  private String stringifyTypes(final EList<TParameter> parameters) {
    String _xblockexpression = null;
    {
      String result = "";
      for (final TParameter p : parameters) {
        Type _type = p.getType();
        String _name = _type.getName();
        String _concat = result.concat(_name);
        result = _concat;
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  @Check
  public void checkNoDuplicateClass(final TClass clazz) {
    EObject _rootContainerOfType = TextRamEcoreUtil.<EObject>getRootContainerOfType(clazz, TextRamPackage.Literals.TASPECT);
    final TAspect owner = ((TAspect) _rootContainerOfType);
    StructuralView _structuralView = owner.getStructuralView();
    EList<Classifier> _classes = ((TStructuralView) _structuralView).getClasses();
    Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
    final Function1<TClass,Boolean> _function = new Function1<TClass,Boolean>() {
      public Boolean apply(final TClass c) {
        String _name = c.getName();
        String _name_1 = clazz.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    Iterable<TClass> _filter_1 = IterableExtensions.<TClass>filter(_filter, _function);
    final int count = IterableExtensions.size(_filter_1);
    if ((count > 1)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Duplicate class \'");
      String _name = clazz.getName();
      _builder.append(_name, "");
      _builder.append("\' ");
      EAttribute _namedElement_Name = RamPackage.eINSTANCE.getNamedElement_Name();
      this.error(_builder.toString(), _namedElement_Name, TextRAMValidator.DUPLICATE_CLASS);
    }
  }
  
  @Check
  public void checkOperationIsValidOnInteraction(final TMessage tMessage) {
    EObject _eContainer = tMessage.eContainer();
    final TInteractionMessage textRamInteraction = ((TInteractionMessage) _eContainer);
    final TOperation operation = tMessage.getSignature();
    final EList<TValueSpecification> operationArguments = tMessage.getArguments();
    final TClass owner = TextRamEcoreUtil.getTextRamClass(textRamInteraction);
    String _name = operation.getName();
    final List<TOperation> operations = TextRamEcoreUtil.findTextRamOperations(owner, _name);
    final TOperation o = this.findOperationThatMatchArgumentsSignatureOnMessageInteraction(operations, operationArguments);
    boolean _equals = Objects.equal(o, null);
    if (_equals) {
      String _name_1 = operation.getName();
      String _plus = ("Invalid arguments on \'" + _name_1);
      String _plus_1 = (_plus + "\'");
      this.error(_plus_1, TextRamPackage.Literals.TMESSAGE__SIGNATURE, TextRAMValidator.INVALID_ARGUMENTS);
    }
  }
  
  /**
   * returns true if the {@link TOperation operation} is defined in the given {@link TClass class}
   * 
   * @param clazz owner of the operation
   * @param operation to find
   */
  private boolean containsOperation(final TClass clazz, final TOperation operation) {
    EList<TClassMember> _members = clazz.getMembers();
    Iterable<TOperation> _filter = Iterables.<TOperation>filter(_members, TOperation.class);
    final Function1<TOperation,Boolean> _function = new Function1<TOperation,Boolean>() {
      public Boolean apply(final TOperation o) {
        String _name = o.getName();
        String _name_1 = operation.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<TOperation>exists(_filter, _function);
  }
  
  @Check
  public void checkOperationIsValidOnMessageView(final TAbstractMessages messageView) {
    final TClass clazz = messageView.getClass_();
    final TOperation messageViewOperation = messageView.getSpecifies();
    final EList<TParameter> messageViewArguments = messageView.getArguments();
    final Aspect aspect = TextRamEcoreUtil.<Aspect>getRootContainerOfType(messageView, RamPackage.Literals.ASPECT);
    String _name = messageViewOperation.getName();
    final List<TOperation> operations = this.getAllOperations(aspect, clazz, _name);
    boolean _haveAmbiguityDefinition = this.haveAmbiguityDefinition(operations);
    boolean _equals = (_haveAmbiguityDefinition == true);
    if (_equals) {
      this.error("The class\'s name is mandatory. There are more than one operation with the same name in other classes.", TextRamPackage.Literals.TABSTRACT_MESSAGES__SPECIFIES, TextRAMValidator.MEMBERS_AMBIGUITY);
    }
    final TOperation o = this.findOperationThatMatchArgumentsSignature(operations, messageViewArguments);
    boolean _equals_1 = Objects.equal(o, null);
    if (_equals_1) {
      String _name_1 = messageViewOperation.getName();
      String _plus = ("Invalid arguments on \'" + _name_1);
      String _plus_1 = (_plus + "\'");
      this.error(_plus_1, TextRamPackage.Literals.TABSTRACT_MESSAGES__SPECIFIES, TextRAMValidator.INVALID_ARGUMENTS);
    }
  }
  
  /**
   * Gets all operations from the aspect or the optional class that match the given name.
   * If the optional {@link TClass class} is defined, the method returns only the operations for that class.
   * Otherwise, returns all the operations from the aspect that match the given name.
   * 
   * @param aspect owner of the model
   * @param optionalClass owner of the operations. This is an optional parameter.
   * @param operationName name of the operation to get
   * 
   * @return all operation that match the given name (from the aspect or the optional class)
   */
  private List<TOperation> getAllOperations(final Aspect aspect, final TClass optionalClass, final String operationName) {
    List<TOperation> _xblockexpression = null;
    {
      final List<TOperation> result = CollectionLiterals.<TOperation>newArrayList();
      boolean _isDefined = this.isDefined(optionalClass);
      if (_isDefined) {
        List<TOperation> _findTextRamOperations = TextRamEcoreUtil.findTextRamOperations(optionalClass, operationName);
        result.addAll(_findTextRamOperations);
      } else {
        List<TOperation> _findAspectOperations = TextRamEcoreUtil.findAspectOperations(aspect, operationName);
        result.addAll(_findAspectOperations);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private TOperation findOperationThatMatchArgumentsSignatureOnMessageInteraction(final List<TOperation> operations, final EList<TValueSpecification> arguments) {
    TOperation _xblockexpression = null;
    {
      TOperation result = null;
      for (final TOperation o : operations) {
        boolean _and = false;
        EList<TParameter> _parameters = o.getParameters();
        boolean _haveSameNumberOfArgumentsOnMessageInteraction = this.haveSameNumberOfArgumentsOnMessageInteraction(_parameters, arguments);
        boolean _equals = (_haveSameNumberOfArgumentsOnMessageInteraction == true);
        if (!_equals) {
          _and = false;
        } else {
          EList<TParameter> _parameters_1 = o.getParameters();
          boolean _haveSameArgumentsTypeOnMessageInteraction = this.haveSameArgumentsTypeOnMessageInteraction(_parameters_1, arguments);
          boolean _equals_1 = (_haveSameArgumentsTypeOnMessageInteraction == true);
          _and = _equals_1;
        }
        if (_and) {
          result = o;
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private TOperation findOperationThatMatchArgumentsSignature(final List<TOperation> operations, final EList<TParameter> arguments) {
    TOperation _xblockexpression = null;
    {
      TOperation result = null;
      for (final TOperation o : operations) {
        boolean _and = false;
        EList<TParameter> _parameters = o.getParameters();
        boolean _haveSameNumberOfArguments = this.haveSameNumberOfArguments(_parameters, arguments);
        boolean _equals = (_haveSameNumberOfArguments == true);
        if (!_equals) {
          _and = false;
        } else {
          EList<TParameter> _parameters_1 = o.getParameters();
          boolean _haveSameArgumentsType = this.haveSameArgumentsType(_parameters_1, arguments);
          boolean _equals_1 = (_haveSameArgumentsType == true);
          _and = _equals_1;
        }
        if (_and) {
          result = o;
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private String _getTypeNameForTValueSpecification(final TLocalAttribute specification) {
    PrimitiveType _type = specification.getType();
    return _type.getName();
  }
  
  private String _getTypeNameForTValueSpecification(final TReference specification) {
    TClass _reference = specification.getReference();
    return ((TClass) _reference).getName();
  }
  
  private String _getTypeNameForTValueSpecification(final TParameter specification) {
    Type _type = specification.getType();
    return _type.getName();
  }
  
  private String _getTypeNameForTValueSpecification(final TLifeline l) {
    try {
      String _xblockexpression = null;
      {
        TLifelineReferenceType _referenceType = l.getReferenceType();
        boolean _notEquals = (!Objects.equal(_referenceType, TLifelineReferenceType.REFERENCE));
        if (_notEquals) {
          throw new Exception("Only Reference types can be parameters");
        }
        TTypedElement _represents = l.getRepresents();
        _xblockexpression = ((TClass) _represents).getName();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private boolean haveSameArgumentsTypeOnMessageInteraction(final EList<TParameter> list, final EList<TValueSpecification> list2) {
    try {
      int _size = list.size();
      int _size_1 = list2.size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        throw new Exception("Argument\'s lists are not the same size");
      }
      boolean _and = false;
      boolean _isEmpty = list.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (!_equals) {
        _and = false;
      } else {
        boolean _isEmpty_1 = list2.isEmpty();
        boolean _equals_1 = (_isEmpty_1 == false);
        _and = _equals_1;
      }
      if (_and) {
        int _size_2 = list.size();
        int _minus = (_size_2 - 1);
        IntegerRange _upTo = new IntegerRange(0, _minus);
        for (final Integer i : _upTo) {
          TParameter _get = list.get((i).intValue());
          Type _type = _get.getType();
          String _name = _type.getName();
          TValueSpecification _get_1 = list2.get((i).intValue());
          String _typeNameForTValueSpecification = this.getTypeNameForTValueSpecification(_get_1);
          boolean _notEquals_1 = (!Objects.equal(_name, _typeNameForTValueSpecification));
          if (_notEquals_1) {
            return false;
          }
        }
      }
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private boolean haveSameArgumentsType(final EList<TParameter> list, final EList<TParameter> list2) {
    try {
      int _size = list.size();
      int _size_1 = list2.size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        throw new Exception("Argument\'s lists are not the same size");
      }
      boolean _and = false;
      boolean _isEmpty = list.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (!_equals) {
        _and = false;
      } else {
        boolean _isEmpty_1 = list2.isEmpty();
        boolean _equals_1 = (_isEmpty_1 == false);
        _and = _equals_1;
      }
      if (_and) {
        int _size_2 = list.size();
        int _minus = (_size_2 - 1);
        IntegerRange _upTo = new IntegerRange(0, _minus);
        for (final Integer i : _upTo) {
          TParameter _get = list.get((i).intValue());
          Type _type = _get.getType();
          String _name = _type.getName();
          TParameter _get_1 = list2.get((i).intValue());
          Type _type_1 = _get_1.getType();
          String _name_1 = _type_1.getName();
          boolean _notEquals_1 = (!Objects.equal(_name, _name_1));
          if (_notEquals_1) {
            return false;
          }
        }
      }
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private boolean haveSameNumberOfArguments(final EList<TParameter> list, final EList<TParameter> list2) {
    int _size = list.size();
    int _size_1 = list2.size();
    return (_size == _size_1);
  }
  
  /**
   * check if the quantity of arguments of two lists are the same.
   * This method is used to validate the quantity of arguments between a class's operation and message view header's operation.
   * 
   * @param list one to compare
   * @param list two to compare
   * @return returns true if both lists have the same number of elements, otherwise returns false.
   */
  private boolean haveSameNumberOfArgumentsOnMessageInteraction(final EList<TParameter> list, final EList<TValueSpecification> list2) {
    int _size = list.size();
    int _size_1 = list2.size();
    return (_size == _size_1);
  }
  
  /**
   * check if the operation is overloaded
   * 
   * @param operations from a class
   * @return retuns true if exists overloading, otherwise returns false.
   */
  private boolean areOverloaded(final List<TOperation> operations) {
    int _size = operations.size();
    return (_size > 0);
  }
  
  /**
   * There is ambiguity if the operation has more than one occurrence.
   * This method is used to check if the message view header's operation needs the class definition to avoid ambiguity.
   * 
   * @param operations extracted from the structural view
   * @return returns true if exists ambiguity, otherwise returns false.
   */
  private boolean haveAmbiguityDefinition(final List<TOperation> operations) {
    int _size = operations.size();
    return (_size > 1);
  }
  
  private boolean isDefined(final TClass clazz) {
    return (!Objects.equal(clazz, null));
  }
  
  @Check
  public void checkPartialDefinitionForTOperationReturnType(final TOperation operation) {
    Type _returnType = operation.getReturnType();
    if ((_returnType instanceof TClass)) {
      Type _returnType_1 = operation.getReturnType();
      final TClass returnType = ((TClass) _returnType_1);
      boolean _and = false;
      boolean _isPartial = returnType.isPartial();
      boolean _equals = (_isPartial == true);
      if (!_equals) {
        _and = false;
      } else {
        boolean _isPartialReturnType = operation.isPartialReturnType();
        boolean _equals_1 = (_isPartialReturnType == false);
        _and = _equals_1;
      }
      if (_and) {
        Type _returnType_2 = operation.getReturnType();
        String _name = _returnType_2.getName();
        String _plus = ("Missing | at " + _name);
        this.error(_plus, TextRamPackage.Literals.TOPERATION__RETURN_TYPE);
      }
      boolean _and_1 = false;
      boolean _isPartial_1 = returnType.isPartial();
      boolean _equals_2 = (_isPartial_1 == false);
      if (!_equals_2) {
        _and_1 = false;
      } else {
        boolean _isPartialReturnType_1 = operation.isPartialReturnType();
        boolean _equals_3 = (_isPartialReturnType_1 == true);
        _and_1 = _equals_3;
      }
      if (_and_1) {
        Type _returnType_3 = operation.getReturnType();
        String _name_1 = _returnType_3.getName();
        String _plus_1 = (_name_1 + " is not defined as partial");
        this.error(_plus_1, TextRamPackage.Literals.TOPERATION__RETURN_TYPE);
      }
    }
  }
  
  @Check
  public void checkPartialDefinitionForSuperTypes(final TClass clazz) {
    EList<Classifier> _superTypes = clazz.getSuperTypes();
    Iterable<TClass> _filter = Iterables.<TClass>filter(_superTypes, TClass.class);
    final Procedure1<TClass> _function = new Procedure1<TClass>() {
      public void apply(final TClass s) {
        boolean _and = false;
        boolean _isPartialSuperType = clazz.isPartialSuperType();
        boolean _equals = (_isPartialSuperType == false);
        if (!_equals) {
          _and = false;
        } else {
          boolean _isPartial = s.isPartial();
          boolean _equals_1 = (_isPartial == true);
          _and = _equals_1;
        }
        if (_and) {
          String _name = s.getName();
          String _plus = ("Missing | at " + _name);
          TextRAMValidator.this.error(_plus, RamPackage.Literals.CLASS__SUPER_TYPES);
        }
        boolean _and_1 = false;
        boolean _isPartialSuperType_1 = clazz.isPartialSuperType();
        boolean _equals_2 = (_isPartialSuperType_1 == true);
        if (!_equals_2) {
          _and_1 = false;
        } else {
          boolean _isPartial_1 = s.isPartial();
          boolean _equals_3 = (_isPartial_1 == false);
          _and_1 = _equals_3;
        }
        if (_and_1) {
          String _name_1 = s.getName();
          String _plus_1 = (_name_1 + " is not defined as partial");
          TextRAMValidator.this.error(_plus_1, RamPackage.Literals.CLASS__SUPER_TYPES);
        }
      }
    };
    IterableExtensions.<TClass>forEach(_filter, _function);
  }
  
  @Check
  public void checkPartialDefinitionForTParameterType(final TParameter parameter) {
    Type _type = parameter.getType();
    if ((_type instanceof TClass)) {
      Type _type_1 = parameter.getType();
      final TClass returnType = ((TClass) _type_1);
      boolean _and = false;
      boolean _isPartial = returnType.isPartial();
      boolean _equals = (_isPartial == true);
      if (!_equals) {
        _and = false;
      } else {
        boolean _isPartialType = parameter.isPartialType();
        boolean _equals_1 = (_isPartialType == false);
        _and = _equals_1;
      }
      if (_and) {
        Type _type_2 = parameter.getType();
        String _name = _type_2.getName();
        String _plus = ("Missing | at " + _name);
        this.error(_plus, TextRamPackage.Literals.TPARAMETER__TYPE);
      }
      boolean _and_1 = false;
      boolean _isPartial_1 = returnType.isPartial();
      boolean _equals_2 = (_isPartial_1 == false);
      if (!_equals_2) {
        _and_1 = false;
      } else {
        boolean _isPartialType_1 = parameter.isPartialType();
        boolean _equals_3 = (_isPartialType_1 == true);
        _and_1 = _equals_3;
      }
      if (_and_1) {
        Type _type_3 = parameter.getType();
        String _name_1 = _type_3.getName();
        String _plus_1 = (_name_1 + " is not defined as partial");
        this.error(_plus_1, TextRamPackage.Literals.TPARAMETER__TYPE);
      }
    }
  }
  
  @Check
  public void checkPartialDefinitionsOnTAbstractMessages(final TAbstractMessages messageView) {
    final TClass clazz = messageView.getClass_();
    final TOperation operation = messageView.getSpecifies();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(clazz, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _isPartial = clazz.isPartial();
      boolean _isPartialClass = messageView.isPartialClass();
      boolean _notEquals_1 = (_isPartial != _isPartialClass);
      _and = _notEquals_1;
    }
    if (_and) {
      boolean _isPartial_1 = clazz.isPartial();
      boolean _equals = (_isPartial_1 == true);
      if (_equals) {
        String _name = clazz.getName();
        String _plus = ("Missing | at " + _name);
        this.error(_plus, TextRamPackage.Literals.TABSTRACT_MESSAGES__CLASS);
      } else {
        String _name_1 = clazz.getName();
        String _plus_1 = ("The class " + _name_1);
        String _plus_2 = (_plus_1 + " is not a partial class.");
        this.error(_plus_2, TextRamPackage.Literals.TABSTRACT_MESSAGES__CLASS);
      }
    }
    boolean _and_1 = false;
    boolean _notEquals_2 = (!Objects.equal(operation, null));
    if (!_notEquals_2) {
      _and_1 = false;
    } else {
      boolean _isPartial_2 = operation.isPartial();
      boolean _isPartialOperation = messageView.isPartialOperation();
      boolean _notEquals_3 = (_isPartial_2 != _isPartialOperation);
      _and_1 = _notEquals_3;
    }
    if (_and_1) {
      boolean _isPartial_3 = operation.isPartial();
      boolean _equals_1 = (_isPartial_3 == true);
      if (_equals_1) {
        String _name_2 = operation.getName();
        String _plus_3 = ("Missing | at " + _name_2);
        this.error(_plus_3, TextRamPackage.Literals.TABSTRACT_MESSAGES__SPECIFIES);
      } else {
        String _name_3 = operation.getName();
        String _plus_4 = ("The operation " + _name_3);
        String _plus_5 = (_plus_4 + " is not a partial operation.");
        this.error(_plus_5, TextRamPackage.Literals.TABSTRACT_MESSAGES__SPECIFIES);
      }
    }
  }
  
  @Check
  public void checkPartialDefinitionOnReference(final TReference reference) {
    boolean _and = false;
    boolean _isPartialClass = reference.isPartialClass();
    boolean _equals = (_isPartialClass == false);
    if (!_equals) {
      _and = false;
    } else {
      TClass _reference = reference.getReference();
      boolean _isPartial = _reference.isPartial();
      boolean _equals_1 = (_isPartial == true);
      _and = _equals_1;
    }
    if (_and) {
      TClass _reference_1 = reference.getReference();
      String _name = _reference_1.getName();
      String _plus = ("Missing | at " + _name);
      this.error(_plus, TextRamPackage.Literals.TREFERENCE__REFERENCE);
    }
    boolean _and_1 = false;
    boolean _isPartialClass_1 = reference.isPartialClass();
    boolean _equals_2 = (_isPartialClass_1 == true);
    if (!_equals_2) {
      _and_1 = false;
    } else {
      TClass _reference_2 = reference.getReference();
      boolean _isPartial_1 = _reference_2.isPartial();
      boolean _equals_3 = (_isPartial_1 == false);
      _and_1 = _equals_3;
    }
    if (_and_1) {
      TClass _reference_3 = reference.getReference();
      String _name_1 = _reference_3.getName();
      String _plus_1 = ("The class " + _name_1);
      String _plus_2 = (_plus_1 + " is not a partial class.");
      this.error(_plus_2, TextRamPackage.Literals.TREFERENCE__REFERENCE);
    }
  }
  
  @Check
  public void checkPartialDefinitionOnTMessageWithSignature(final TMessage message) {
    boolean _and = false;
    boolean _isPartialOperation = message.isPartialOperation();
    boolean _equals = (_isPartialOperation == false);
    if (!_equals) {
      _and = false;
    } else {
      TOperation _signature = message.getSignature();
      boolean _isPartial = _signature.isPartial();
      boolean _equals_1 = (_isPartial == true);
      _and = _equals_1;
    }
    if (_and) {
      TOperation _signature_1 = message.getSignature();
      String _name = _signature_1.getName();
      String _plus = ("Missing | at " + _name);
      this.error(_plus, TextRamPackage.Literals.TMESSAGE__SIGNATURE);
    }
    boolean _and_1 = false;
    boolean _isPartialOperation_1 = message.isPartialOperation();
    boolean _equals_2 = (_isPartialOperation_1 == true);
    if (!_equals_2) {
      _and_1 = false;
    } else {
      TOperation _signature_2 = message.getSignature();
      boolean _isPartial_1 = _signature_2.isPartial();
      boolean _equals_3 = (_isPartial_1 == false);
      _and_1 = _equals_3;
    }
    if (_and_1) {
      TOperation _signature_3 = message.getSignature();
      String _name_1 = _signature_3.getName();
      String _plus_1 = ("The class " + _name_1);
      String _plus_2 = (_plus_1 + " is not a partial class.");
      this.error(_plus_2, TextRamPackage.Literals.TMESSAGE__SIGNATURE);
    }
  }
  
  @Check
  public void checkPartialDefinitionOnTClassifierMapping(final TClassifierMapping classifierMapping) {
    boolean _and = false;
    boolean _isPartialFromElement = classifierMapping.isPartialFromElement();
    boolean _equals = (_isPartialFromElement == false);
    if (!_equals) {
      _and = false;
    } else {
      Classifier _fromElement = classifierMapping.getFromElement();
      boolean _isPartial = ((ca.mcgill.cs.sel.ram.Class) _fromElement).isPartial();
      boolean _equals_1 = (_isPartial == true);
      _and = _equals_1;
    }
    if (_and) {
      Classifier _fromElement_1 = classifierMapping.getFromElement();
      String _name = _fromElement_1.getName();
      String _plus = ("Missing | at " + _name);
      this.error(_plus, TextRamPackage.Literals.TCLASSIFIER_MAPPING__PARTIAL_FROM_ELEMENT);
    }
    boolean _and_1 = false;
    boolean _isPartialFromElement_1 = classifierMapping.isPartialFromElement();
    boolean _equals_2 = (_isPartialFromElement_1 == true);
    if (!_equals_2) {
      _and_1 = false;
    } else {
      Classifier _fromElement_2 = classifierMapping.getFromElement();
      boolean _isPartial_1 = ((ca.mcgill.cs.sel.ram.Class) _fromElement_2).isPartial();
      boolean _equals_3 = (_isPartial_1 == false);
      _and_1 = _equals_3;
    }
    if (_and_1) {
      Classifier _fromElement_3 = classifierMapping.getFromElement();
      String _name_1 = _fromElement_3.getName();
      String _plus_1 = ("The class " + _name_1);
      String _plus_2 = (_plus_1 + " is not a partial class (fromElement).");
      this.error(_plus_2, TextRamPackage.Literals.TCLASSIFIER_MAPPING__PARTIAL_FROM_ELEMENT);
    }
    boolean _and_2 = false;
    boolean _isPartialToElement = classifierMapping.isPartialToElement();
    boolean _equals_4 = (_isPartialToElement == false);
    if (!_equals_4) {
      _and_2 = false;
    } else {
      Classifier _toElement = classifierMapping.getToElement();
      boolean _isPartial_2 = ((ca.mcgill.cs.sel.ram.Class) _toElement).isPartial();
      boolean _equals_5 = (_isPartial_2 == true);
      _and_2 = _equals_5;
    }
    if (_and_2) {
      Classifier _toElement_1 = classifierMapping.getToElement();
      String _name_2 = _toElement_1.getName();
      String _plus_3 = ("Missing | at " + _name_2);
      this.error(_plus_3, TextRamPackage.Literals.TCLASSIFIER_MAPPING__PARTIAL_TO_ELEMENT);
    }
    boolean _and_3 = false;
    boolean _isPartialToElement_1 = classifierMapping.isPartialToElement();
    boolean _equals_6 = (_isPartialToElement_1 == true);
    if (!_equals_6) {
      _and_3 = false;
    } else {
      Classifier _toElement_2 = classifierMapping.getToElement();
      boolean _isPartial_3 = ((ca.mcgill.cs.sel.ram.Class) _toElement_2).isPartial();
      boolean _equals_7 = (_isPartial_3 == false);
      _and_3 = _equals_7;
    }
    if (_and_3) {
      Classifier _toElement_3 = classifierMapping.getToElement();
      String _name_3 = _toElement_3.getName();
      String _plus_4 = ("The class " + _name_3);
      String _plus_5 = (_plus_4 + " is not a partial class (toElement).");
      this.error(_plus_5, TextRamPackage.Literals.TCLASSIFIER_MAPPING__PARTIAL_TO_ELEMENT);
    }
  }
  
  @Check
  public void checkMessageViewBody(final TAbstractMessageView messageView) {
    boolean _and = false;
    EList<TLifeline> _lifelines = messageView.getLifelines();
    int _size = _lifelines.size();
    boolean _greaterThan = (_size > 0);
    if (!_greaterThan) {
      _and = false;
    } else {
      EList<TAbstractMessages> _messages = messageView.getMessages();
      int _size_1 = _messages.size();
      boolean _equals = (_size_1 == 0);
      _and = _equals;
    }
    if (_and) {
      this.error("Message views are mandatory", TextRamPackage.Literals.TABSTRACT_MESSAGE_VIEW__LIFELINES);
    }
  }
  
  private String getTypeNameForTValueSpecification(final TValueSpecification specification) {
    if (specification instanceof TLocalAttribute) {
      return _getTypeNameForTValueSpecification((TLocalAttribute)specification);
    } else if (specification instanceof TReference) {
      return _getTypeNameForTValueSpecification((TReference)specification);
    } else if (specification instanceof TLifeline) {
      return _getTypeNameForTValueSpecification((TLifeline)specification);
    } else if (specification instanceof TParameter) {
      return _getTypeNameForTValueSpecification((TParameter)specification);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(specification).toString());
    }
  }
}
