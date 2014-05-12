package cl.uchile.pleiad.scoping;

import ca.mcgill.cs.sel.ram.AbstractMessageView;
import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.Instantiation;
import ca.mcgill.cs.sel.ram.InstantiationType;
import ca.mcgill.cs.sel.ram.ObjectType;
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
import cl.uchile.pleiad.util.TextRamEcoreUtil;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelScopeProvider {
  public Iterable<Aspect> getExternalAspectsFromHeader(final TAspect aspect) {
    Iterable<Aspect> _xblockexpression = null;
    {
      EList<TInstantiationHeader> _headerInstantiations = aspect.getHeaderInstantiations();
      final Function1<TInstantiationHeader,EList<Aspect>> _function = new Function1<TInstantiationHeader,EList<Aspect>>() {
        public EList<Aspect> apply(final TInstantiationHeader it) {
          return it.getExternalAspects();
        }
      };
      List<EList<Aspect>> _map = ListExtensions.<TInstantiationHeader, EList<Aspect>>map(_headerInstantiations, _function);
      final Iterable<Aspect> validExternalAspects = Iterables.<Aspect>concat(_map);
      _xblockexpression = validExternalAspects;
    }
    return _xblockexpression;
  }
  
  public EList<Type> getTypesFor(final StructuralView structuralView) {
    EList<Type> _types = structuralView.getTypes();
    ModelScopeProvider.appendPrimitiveTypes(_types);
    EList<Type> _types_1 = structuralView.getTypes();
    EList<Type> _types_2 = structuralView.getTypes();
    BasicEList<Type> _addRSetPrimitiveTypes = ModelScopeProvider.addRSetPrimitiveTypes(_types_2);
    _types_1.addAll(_addRSetPrimitiveTypes);
    return ModelScopeProvider.getAllTypes(structuralView);
  }
  
  public List<PrimitiveType> getPrimitiveTypes(final StructuralView structuralView) {
    List<PrimitiveType> _xblockexpression = null;
    {
      EList<Type> _types = structuralView.getTypes();
      ModelScopeProvider.appendPrimitiveTypes(_types);
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
  
  public List<TClassMember> getMembersFrom(final TClassifierMapping classifierMapping) {
    EObject _eContainer = classifierMapping.eContainer();
    final InstantiationType instantiationType = ((Instantiation) _eContainer).getType();
    Classifier _fromElement = classifierMapping.getFromElement();
    final TClass fromElement = ((TClass) _fromElement);
    boolean _equals = Objects.equal(instantiationType, InstantiationType.DEPENDS);
    if (_equals) {
      EList<TClassMember> _members = fromElement.getMembers();
      Iterable<TOperation> _filter = Iterables.<TOperation>filter(_members, TOperation.class);
      final Function1<TOperation,Boolean> _function = new Function1<TOperation,Boolean>() {
        public Boolean apply(final TOperation t) {
          Visibility _visibility = t.getVisibility();
          return Boolean.valueOf(Objects.equal(_visibility, Visibility.PUBLIC));
        }
      };
      Iterable<TOperation> _filter_1 = IterableExtensions.<TOperation>filter(_filter, _function);
      Iterable<TClassMember> _filter_2 = Iterables.<TClassMember>filter(_filter_1, TClassMember.class);
      return IterableExtensions.<TClassMember>toList(_filter_2);
    }
    EList<TClassMember> _members_1 = fromElement.getMembers();
    return IterableExtensions.<TClassMember>toList(_members_1);
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
        ModelScopeProvider.this.addExtendendTTypedElements(a, elements);
      }
    };
    IterableExtensions.<TAspect>forEach(_extendedExternalAspects, _function);
  }
  
  private void addExtendedClasses(final TAspect aspect, final List<TClass> classes) {
    StructuralView _structuralView = aspect.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
    Iterables.<TClass>addAll(classes, _filter);
    Iterable<TAspect> _extendedExternalAspects = this.getExtendedExternalAspects(aspect);
    final Procedure1<TAspect> _function = new Procedure1<TAspect>() {
      public void apply(final TAspect a) {
        ModelScopeProvider.this.addExtendedClasses(a, classes);
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
        ModelScopeProvider.this.addExtendedOperations(a, operations);
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
    final Function1<TInstantiationHeader,EList<Aspect>> _function_1 = new Function1<TInstantiationHeader,EList<Aspect>>() {
      public EList<Aspect> apply(final TInstantiationHeader it) {
        return it.getExternalAspects();
      }
    };
    Iterable<EList<Aspect>> _map = IterableExtensions.<TInstantiationHeader, EList<Aspect>>map(_filter, _function_1);
    Iterable<Aspect> _flatten = Iterables.<Aspect>concat(_map);
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
   * 3. The right lifeline
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
      CollectionExtensions.<TLifeline>addAll(result, _rightLifeline);
      _xblockexpression = result;
    }
    return _xblockexpression;
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
          final List<TValueSpecification> textRamValueSpecification = ModelScopeProvider.this.getTValueSpecificationFromInteraction(i);
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
          final List<TValueSpecification> textRamValueSpecification = ModelScopeProvider.this.getTValueSpecificationFromInteraction(i);
          result.addAll(textRamValueSpecification);
        }
      };
      IterableExtensions.<TInteraction>forEach(_containers, _function);
      EList<TInteraction> _elseContainers = interaction.getElseContainers();
      final Procedure1<TInteraction> _function_1 = new Procedure1<TInteraction>() {
        public void apply(final TInteraction i) {
          final List<TValueSpecification> textRamValueSpecification = ModelScopeProvider.this.getTValueSpecificationFromInteraction(i);
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
  
  private TClass _getClassOwner(final TAssociation owner, final Aspect aspect) {
    TClass _xblockexpression = null;
    {
      TAssociationEnd _toEnd = owner.getToEnd();
      ca.mcgill.cs.sel.ram.Class _classReference = _toEnd.getClassReference();
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
