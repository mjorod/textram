package cl.uchile.pleiad.transform;

import ca.mcgill.cs.sel.ram.AbstractMessageView;
import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.AspectMessageView;
import ca.mcgill.cs.sel.ram.Association;
import ca.mcgill.cs.sel.ram.AssociationEnd;
import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.AttributeMapping;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.ClassifierMapping;
import ca.mcgill.cs.sel.ram.CombinedFragment;
import ca.mcgill.cs.sel.ram.DestructionOccurrenceSpecification;
import ca.mcgill.cs.sel.ram.ExecutionStatement;
import ca.mcgill.cs.sel.ram.Instantiation;
import ca.mcgill.cs.sel.ram.InstantiationType;
import ca.mcgill.cs.sel.ram.Interaction;
import ca.mcgill.cs.sel.ram.InteractionFragment;
import ca.mcgill.cs.sel.ram.InteractionOperand;
import ca.mcgill.cs.sel.ram.InteractionOperatorKind;
import ca.mcgill.cs.sel.ram.Layout;
import ca.mcgill.cs.sel.ram.LayoutElement;
import ca.mcgill.cs.sel.ram.Lifeline;
import ca.mcgill.cs.sel.ram.LiteralInteger;
import ca.mcgill.cs.sel.ram.LiteralString;
import ca.mcgill.cs.sel.ram.Message;
import ca.mcgill.cs.sel.ram.MessageEnd;
import ca.mcgill.cs.sel.ram.MessageOccurrenceSpecification;
import ca.mcgill.cs.sel.ram.MessageView;
import ca.mcgill.cs.sel.ram.ObjectType;
import ca.mcgill.cs.sel.ram.OccurrenceSpecification;
import ca.mcgill.cs.sel.ram.OpaqueExpression;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.OperationMapping;
import ca.mcgill.cs.sel.ram.OriginalBehaviorExecution;
import ca.mcgill.cs.sel.ram.Parameter;
import ca.mcgill.cs.sel.ram.ParameterValue;
import ca.mcgill.cs.sel.ram.ParameterValueMapping;
import ca.mcgill.cs.sel.ram.PrimitiveType;
import ca.mcgill.cs.sel.ram.RSet;
import ca.mcgill.cs.sel.ram.RamFactory;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.cs.sel.ram.Reference;
import ca.mcgill.cs.sel.ram.ReferenceType;
import ca.mcgill.cs.sel.ram.StructuralFeature;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.TemporaryProperty;
import ca.mcgill.cs.sel.ram.Type;
import ca.mcgill.cs.sel.ram.TypedElement;
import ca.mcgill.cs.sel.ram.ValueSpecification;
import ca.mcgill.cs.sel.ram.Visibility;
import ca.mcgill.sel.commons.emf.util.EMFModelUtil;
import cl.uchile.pleiad.textRam.AssociationDirectionMultiplicity;
import cl.uchile.pleiad.textRam.OcurrenceType;
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
import cl.uchile.pleiad.textRam.TLocalAttribute;
import cl.uchile.pleiad.textRam.TMessage;
import cl.uchile.pleiad.textRam.TMessageAssignableFeature;
import cl.uchile.pleiad.textRam.TMessageView;
import cl.uchile.pleiad.textRam.TOcurrence;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TParameter;
import cl.uchile.pleiad.textRam.TReference;
import cl.uchile.pleiad.textRam.TReturnInteraction;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TTemporaryProperty;
import cl.uchile.pleiad.textRam.TTypedElement;
import cl.uchile.pleiad.textRam.TValueSpecification;
import cl.uchile.pleiad.textRam.TextRamFactory;
import cl.uchile.pleiad.transform.ITextRAMTransform;
import cl.uchile.pleiad.util.TextRamEcoreUtil;
import cl.uchile.pleiad.util.TextRamModelUtil;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
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
    final Set<TAspect> extendedTextRamAspects = TextRamModelUtil.transformExtendedAspects(ramAspect);
    this.transformInstantiations(ramAspect, textRamAspect, extendedTextRamAspects);
    this.transformMessageViews(ramAspect, textRamAspect);
    this.transformLayout(ramAspect, textRamAspect);
    return textRamAspect;
  }
  
  private void transformInstantiations(final Aspect from, final TAspect to, final Set<TAspect> extendedTextRamAspects) {
    final TInstantiationHeader headerExtend = this.transformHeaderInstantiationOfExtendType(from, extendedTextRamAspects);
    boolean _notEquals = (!Objects.equal(headerExtend, null));
    if (_notEquals) {
      EList<TInstantiationHeader> _headerInstantiations = to.getHeaderInstantiations();
      _headerInstantiations.add(headerExtend);
    }
    final TInstantiationHeader headerDepends = this.transformHeaderInstantiationOfDependsType(from, extendedTextRamAspects);
    boolean _notEquals_1 = (!Objects.equal(headerDepends, null));
    if (_notEquals_1) {
      EList<TInstantiationHeader> _headerInstantiations_1 = to.getHeaderInstantiations();
      _headerInstantiations_1.add(headerDepends);
    }
    EList<Instantiation> _instantiations = from.getInstantiations();
    final Procedure1<Instantiation> _function = new Procedure1<Instantiation>() {
      public void apply(final Instantiation i) {
        EList<Instantiation> _instantiations = to.getInstantiations();
        Instantiation _transformInstantiationBody = TextRAMTransform.this.transformInstantiationBody(i, to, extendedTextRamAspects);
        _instantiations.add(_transformInstantiationBody);
      }
    };
    IterableExtensions.<Instantiation>forEach(_instantiations, _function);
  }
  
  private Instantiation transformInstantiationBody(final Instantiation instantiation, final TAspect to, final Set<TAspect> extendedAspects) {
    EList<Instantiation> _instantiations = to.getInstantiations();
    final Function1<Instantiation,Boolean> _function = new Function1<Instantiation,Boolean>() {
      public Boolean apply(final Instantiation a) {
        Aspect _externalAspect = a.getExternalAspect();
        String _name = _externalAspect.getName();
        Aspect _externalAspect_1 = instantiation.getExternalAspect();
        String _name_1 = _externalAspect_1.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    Instantiation res = IterableExtensions.<Instantiation>findFirst(_instantiations, _function);
    boolean _equals = Objects.equal(res, null);
    if (_equals) {
      Instantiation _createInstantiation = RamFactory.eINSTANCE.createInstantiation();
      res = _createInstantiation;
    }
    final Function1<TAspect,Boolean> _function_1 = new Function1<TAspect,Boolean>() {
      public Boolean apply(final TAspect a) {
        String _name = a.getName();
        Aspect _externalAspect = instantiation.getExternalAspect();
        String _name_1 = _externalAspect.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    TAspect _findFirst = IterableExtensions.<TAspect>findFirst(extendedAspects, _function_1);
    res.setExternalAspect(_findFirst);
    EList<ClassifierMapping> _mappings = instantiation.getMappings();
    for (final ClassifierMapping m : _mappings) {
      EList<ClassifierMapping> _mappings_1 = res.getMappings();
      Aspect _externalAspect = res.getExternalAspect();
      TClassifierMapping _transformMappings = this.transformMappings(m, _externalAspect, to, extendedAspects);
      _mappings_1.add(_transformMappings);
    }
    return res;
  }
  
  private TClassifierMapping transformMappings(final ClassifierMapping mapping, final Aspect fromAspect, final TAspect toAspect, final Set<TAspect> extendedAspects) {
    TClassifierMapping res = null;
    TClassifierMapping _createTClassifierMapping = TextRamFactory.eINSTANCE.createTClassifierMapping();
    res = _createTClassifierMapping;
    final Set<TClass> extendedClasses = this.textRamEcoreUtil.getInstantiationsClasses(toAspect);
    final Function1<TClass,Boolean> _function = new Function1<TClass,Boolean>() {
      public Boolean apply(final TClass c) {
        String _name = c.getName();
        Classifier _fromElement = mapping.getFromElement();
        String _name_1 = _fromElement.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    TClass _findFirst = IterableExtensions.<TClass>findFirst(extendedClasses, _function);
    res.setFromElement(_findFirst);
    Classifier _toElement = mapping.getToElement();
    String _name = _toElement.getName();
    Classifier classTo = this.textRamEcoreUtil.findClass(toAspect, _name);
    boolean _equals = Objects.equal(classTo, null);
    if (_equals) {
      Classifier _toElement_1 = mapping.getToElement();
      if ((_toElement_1 instanceof PrimitiveType)) {
        StructuralView _structuralView = toAspect.getStructuralView();
        EList<Type> _types = _structuralView.getTypes();
        Iterable<PrimitiveType> _filter = Iterables.<PrimitiveType>filter(_types, PrimitiveType.class);
        final Function1<PrimitiveType,Boolean> _function_1 = new Function1<PrimitiveType,Boolean>() {
          public Boolean apply(final PrimitiveType e) {
            String _name = e.getName();
            Classifier _toElement = mapping.getToElement();
            String _name_1 = _toElement.getName();
            return Boolean.valueOf(Objects.equal(_name, _name_1));
          }
        };
        PrimitiveType type = IterableExtensions.<PrimitiveType>findFirst(_filter, _function_1);
        classTo = type;
      }
    }
    res.setToElement(classTo);
    EList<AttributeMapping> _attributeMappings = mapping.getAttributeMappings();
    for (final AttributeMapping a : _attributeMappings) {
      {
        EList<TClassMember> _fromMembers = res.getFromMembers();
        Classifier _fromElement = res.getFromElement();
        TAttribute _transformAttributeMemberFromElement = this.transformAttributeMemberFromElement(((TClass) _fromElement), a);
        _fromMembers.add(_transformAttributeMemberFromElement);
        EList<TClassMember> _toMembers = res.getToMembers();
        Classifier _toElement_2 = res.getToElement();
        TAttribute _transformAttributeMemberToElement = this.transformAttributeMemberToElement(((TClass) _toElement_2), a);
        _toMembers.add(_transformAttributeMemberToElement);
      }
    }
    EList<OperationMapping> _operationMappings = mapping.getOperationMappings();
    for (final OperationMapping o : _operationMappings) {
      {
        EList<TClassMember> _fromMembers = res.getFromMembers();
        Classifier _fromElement = res.getFromElement();
        TClassMember _transfomOperationMemberFromElement = this.transfomOperationMemberFromElement(((TClass) _fromElement), o);
        _fromMembers.add(_transfomOperationMemberFromElement);
        EList<TClassMember> _toMembers = res.getToMembers();
        Classifier _toElement_2 = res.getToElement();
        TOperation _transformOperationsMemberToElement = this.transformOperationsMemberToElement(((TClass) _toElement_2), o);
        _toMembers.add(_transformOperationsMemberToElement);
      }
    }
    return res;
  }
  
  private TOperation transformOperationsMemberToElement(final TClass clazz, final OperationMapping mapping) {
    Operation _toElement = mapping.getToElement();
    final TOperation res = TextRamEcoreUtil.findTextRamOperation(clazz, _toElement);
    return res;
  }
  
  private TAttribute transformAttributeMemberToElement(final TClass clazz, final AttributeMapping mapping) {
    EList<TClassMember> _members = clazz.getMembers();
    Iterable<TAttribute> _filter = Iterables.<TAttribute>filter(_members, TAttribute.class);
    final Function1<TAttribute,Boolean> _function = new Function1<TAttribute,Boolean>() {
      public Boolean apply(final TAttribute a) {
        String _name = a.getName();
        Attribute _toElement = mapping.getToElement();
        String _name_1 = _toElement.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<TAttribute>findFirst(_filter, _function);
  }
  
  private TClassMember transfomOperationMemberFromElement(final TClass clazz, final OperationMapping mapping) {
    Operation _fromElement = mapping.getFromElement();
    final TOperation res = TextRamEcoreUtil.findTextRamOperation(clazz, _fromElement);
    return res;
  }
  
  private TAttribute transformAttributeMemberFromElement(final TClass clazz, final AttributeMapping mapping) {
    EList<TClassMember> _members = clazz.getMembers();
    Iterable<TAttribute> _filter = Iterables.<TAttribute>filter(_members, TAttribute.class);
    final Function1<TAttribute,Boolean> _function = new Function1<TAttribute,Boolean>() {
      public Boolean apply(final TAttribute a) {
        String _name = a.getName();
        Attribute _fromElement = mapping.getFromElement();
        String _name_1 = _fromElement.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<TAttribute>findFirst(_filter, _function);
  }
  
  private TInstantiationHeader transformHeaderInstantiationOfExtendType(final Aspect from, final Set<TAspect> extendedExternalTextRamAspects) {
    EList<Instantiation> _instantiations = from.getInstantiations();
    final Function1<Instantiation,Boolean> _function = new Function1<Instantiation,Boolean>() {
      public Boolean apply(final Instantiation i) {
        InstantiationType _type = i.getType();
        return Boolean.valueOf(Objects.equal(_type, InstantiationType.EXTENDS));
      }
    };
    boolean _exists = IterableExtensions.<Instantiation>exists(_instantiations, _function);
    if (_exists) {
      final TInstantiationHeader header = TextRamFactory.eINSTANCE.createTInstantiationHeader();
      header.setType(InstantiationType.EXTENDS);
      EList<Instantiation> _instantiations_1 = from.getInstantiations();
      final Function1<Instantiation,Boolean> _function_1 = new Function1<Instantiation,Boolean>() {
        public Boolean apply(final Instantiation ins) {
          InstantiationType _type = ins.getType();
          return Boolean.valueOf(Objects.equal(_type, InstantiationType.EXTENDS));
        }
      };
      Iterable<Instantiation> _filter = IterableExtensions.<Instantiation>filter(_instantiations_1, _function_1);
      final Procedure1<Instantiation> _function_2 = new Procedure1<Instantiation>() {
        public void apply(final Instantiation ins) {
          EList<TAspect> _externalAspects = header.getExternalAspects();
          final Function1<TAspect,Boolean> _function = new Function1<TAspect,Boolean>() {
            public Boolean apply(final TAspect e) {
              String _name = e.getName();
              Aspect _externalAspect = ins.getExternalAspect();
              String _name_1 = _externalAspect.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          TAspect _findFirst = IterableExtensions.<TAspect>findFirst(extendedExternalTextRamAspects, _function);
          _externalAspects.add(_findFirst);
        }
      };
      IterableExtensions.<Instantiation>forEach(_filter, _function_2);
      return header;
    }
    return null;
  }
  
  private TInstantiationHeader transformHeaderInstantiationOfDependsType(final Aspect from, final Set<TAspect> extendedExternalTextRamAspects) {
    EList<Instantiation> _instantiations = from.getInstantiations();
    final Function1<Instantiation,Boolean> _function = new Function1<Instantiation,Boolean>() {
      public Boolean apply(final Instantiation i) {
        InstantiationType _type = i.getType();
        return Boolean.valueOf(Objects.equal(_type, InstantiationType.DEPENDS));
      }
    };
    boolean _exists = IterableExtensions.<Instantiation>exists(_instantiations, _function);
    if (_exists) {
      final TInstantiationHeader header = TextRamFactory.eINSTANCE.createTInstantiationHeader();
      header.setType(InstantiationType.DEPENDS);
      EList<Instantiation> _instantiations_1 = from.getInstantiations();
      final Function1<Instantiation,Boolean> _function_1 = new Function1<Instantiation,Boolean>() {
        public Boolean apply(final Instantiation ins) {
          InstantiationType _type = ins.getType();
          return Boolean.valueOf(Objects.equal(_type, InstantiationType.DEPENDS));
        }
      };
      Iterable<Instantiation> _filter = IterableExtensions.<Instantiation>filter(_instantiations_1, _function_1);
      final Procedure1<Instantiation> _function_2 = new Procedure1<Instantiation>() {
        public void apply(final Instantiation ins) {
          EList<TAspect> _externalAspects = header.getExternalAspects();
          final Function1<TAspect,Boolean> _function = new Function1<TAspect,Boolean>() {
            public Boolean apply(final TAspect e) {
              String _name = e.getName();
              Aspect _externalAspect = ins.getExternalAspect();
              String _name_1 = _externalAspect.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          TAspect _findFirst = IterableExtensions.<TAspect>findFirst(extendedExternalTextRamAspects, _function);
          _externalAspects.add(_findFirst);
        }
      };
      IterableExtensions.<Instantiation>forEach(_filter, _function_2);
      return header;
    }
    return null;
  }
  
  private void transformLayout(final Aspect from, final TAspect to) {
    Layout _layout = from.getLayout();
    EMap<EObject,EMap<EObject,LayoutElement>> _containers = _layout.getContainers();
    Map.Entry<EObject,EMap<EObject,LayoutElement>> _get = _containers.get(0);
    EMap<EObject,LayoutElement> _value = _get.getValue();
    final Procedure1<Map.Entry<EObject,LayoutElement>> _function = new Procedure1<Map.Entry<EObject,LayoutElement>>() {
      public void apply(final Map.Entry<EObject,LayoutElement> v) {
        EObject _key = v.getKey();
        if ((_key instanceof ca.mcgill.cs.sel.ram.Class)) {
          EObject _key_1 = v.getKey();
          String _name = ((ca.mcgill.cs.sel.ram.Class) _key_1).getName();
          final TClass tClass = TextRAMTransform.this.textRamEcoreUtil.findClass(to, _name);
          boolean _notEquals = (!Objects.equal(tClass, null));
          if (_notEquals) {
            LayoutElement _value = v.getValue();
            float _x = _value.getX();
            tClass.setLayoutX(_x);
            LayoutElement _value_1 = v.getValue();
            float _y = _value_1.getY();
            tClass.setLayoutY(_y);
          }
        }
      }
    };
    IterableExtensions.<Map.Entry<EObject,LayoutElement>>forEach(_value, _function);
  }
  
  private TAbstractMessageView transformMessageViews(final Aspect from, final TAspect to) {
    TAbstractMessageView _xifexpression = null;
    EList<AbstractMessageView> _messageViews = from.getMessageViews();
    int _size = _messageViews.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      _xifexpression = this.getTransformedMessageViews(from, to);
    }
    return _xifexpression;
  }
  
  private TAbstractMessageView getTransformedMessageViews(final Aspect from, final TAspect to) {
    final TAbstractMessageView tAbstractMessageView = TextRamFactory.eINSTANCE.createTAbstractMessageView();
    EList<AbstractMessageView> _messageViews = to.getMessageViews();
    _messageViews.add(tAbstractMessageView);
    this.addLifelinesfrom(tAbstractMessageView, from, to);
    EList<AbstractMessageView> _messageViews_1 = from.getMessageViews();
    Iterable<AspectMessageView> _filter = Iterables.<AspectMessageView>filter(_messageViews_1, AspectMessageView.class);
    final Procedure1<AspectMessageView> _function = new Procedure1<AspectMessageView>() {
      public void apply(final AspectMessageView mv) {
        EList<TAbstractMessages> _messages = tAbstractMessageView.getMessages();
        TAbstractMessages _transformedMessage = TextRAMTransform.this.getTransformedMessage(mv, to);
        _messages.add(_transformedMessage);
      }
    };
    IterableExtensions.<AspectMessageView>forEach(_filter, _function);
    EList<AbstractMessageView> _messageViews_2 = from.getMessageViews();
    Iterable<MessageView> _filter_1 = Iterables.<MessageView>filter(_messageViews_2, MessageView.class);
    final Procedure1<MessageView> _function_1 = new Procedure1<MessageView>() {
      public void apply(final MessageView mv) {
        EList<TAbstractMessages> _messages = tAbstractMessageView.getMessages();
        TAbstractMessages _transformedMessage = TextRAMTransform.this.getTransformedMessage(mv, to);
        _messages.add(_transformedMessage);
      }
    };
    IterableExtensions.<MessageView>forEach(_filter_1, _function_1);
    return tAbstractMessageView;
  }
  
  private TAbstractMessages _getTransformedMessage(final AspectMessageView from, final TAspect to) {
    final TAspectMessageView res = TextRamFactory.eINSTANCE.createTAspectMessageView();
    String _name = from.getName();
    res.setName(_name);
    Operation _pointcut = from.getPointcut();
    TClass _classFromMessageView = this.getClassFromMessageView(_pointcut, to);
    res.setClass(_classFromMessageView);
    TClass _class_ = res.getClass_();
    Operation _pointcut_1 = from.getPointcut();
    TOperation _findTextRamOperation = TextRamEcoreUtil.findTextRamOperation(_class_, _pointcut_1);
    res.setSpecifies(_findTextRamOperation);
    TClass _class__1 = res.getClass_();
    boolean _isPartial = _class__1.isPartial();
    res.setPartialClass(_isPartial);
    TOperation _specifies = res.getSpecifies();
    boolean _isPartial_1 = _specifies.isPartial();
    res.setPartialOperation(_isPartial_1);
    EList<TParameter> _arguments = res.getArguments();
    TOperation _specifies_1 = res.getSpecifies();
    EList<TParameter> _parameters = _specifies_1.getParameters();
    _arguments.addAll(_parameters);
    EList<TInteraction> _interactionMessages = res.getInteractionMessages();
    Interaction _advice = from.getAdvice();
    List<TInteraction> _textRamInteractions = this.getTextRamInteractions(_advice, to);
    _interactionMessages.addAll(_textRamInteractions);
    return res;
  }
  
  private TAbstractMessages _getTransformedMessage(final MessageView from, final TAspect to) {
    final TMessageView res = TextRamFactory.eINSTANCE.createTMessageView();
    Operation _specifies = from.getSpecifies();
    TClass _classFromMessageView = this.getClassFromMessageView(_specifies, to);
    res.setClass(_classFromMessageView);
    TClass _class_ = res.getClass_();
    Operation _specifies_1 = from.getSpecifies();
    TOperation _findTextRamOperation = TextRamEcoreUtil.findTextRamOperation(_class_, _specifies_1);
    res.setSpecifies(_findTextRamOperation);
    TClass _class__1 = res.getClass_();
    boolean _isPartial = _class__1.isPartial();
    res.setPartialClass(_isPartial);
    TOperation _specifies_2 = res.getSpecifies();
    boolean _isPartial_1 = _specifies_2.isPartial();
    res.setPartialOperation(_isPartial_1);
    EList<TParameter> _arguments = res.getArguments();
    TOperation _specifies_3 = res.getSpecifies();
    EList<TParameter> _parameters = _specifies_3.getParameters();
    _arguments.addAll(_parameters);
    EList<AspectMessageView> _affectedBy = from.getAffectedBy();
    int _size = _affectedBy.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      EList<TInteraction> _interactionMessages = res.getInteractionMessages();
      Interaction _specification = from.getSpecification();
      List<TInteraction> _textRamInteractions = this.getTextRamInteractions(_specification, to);
      _interactionMessages.addAll(_textRamInteractions);
    } else {
      EClass _aspect = RamPackage.eINSTANCE.getAspect();
      final Aspect root = EMFModelUtil.<Aspect>getRootContainerOfType(from, _aspect);
      EList<AbstractMessageView> _messageViews = root.getMessageViews();
      Iterable<AspectMessageView> _filter = Iterables.<AspectMessageView>filter(_messageViews, AspectMessageView.class);
      final Procedure1<AspectMessageView> _function = new Procedure1<AspectMessageView>() {
        public void apply(final AspectMessageView amv) {
          EList<AbstractMessageView> _messageViews = to.getMessageViews();
          AbstractMessageView _get = _messageViews.get(0);
          EList<TAbstractMessages> _messages = ((TAbstractMessageView) _get).getMessages();
          Iterable<TAspectMessageView> _filter = Iterables.<TAspectMessageView>filter(_messages, TAspectMessageView.class);
          final Function1<TAspectMessageView,Boolean> _function = new Function1<TAspectMessageView,Boolean>() {
            public Boolean apply(final TAspectMessageView q) {
              String _name = q.getName();
              String _name_1 = amv.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          final TAspectMessageView textRamAspectMessage = IterableExtensions.<TAspectMessageView>findFirst(_filter, _function);
          boolean _equals = Objects.equal(textRamAspectMessage, null);
          if (_equals) {
            throw new IllegalStateException("TAspectMessageView has not been found");
          }
          EList<TAspectMessageView> _affectedBy = res.getAffectedBy();
          _affectedBy.add(textRamAspectMessage);
        }
      };
      IterableExtensions.<AspectMessageView>forEach(_filter, _function);
    }
    return res;
  }
  
  private List<TInteraction> getTextRamInteractions(final Interaction interaction, final TAspect to) {
    final List<TInteraction> res = CollectionLiterals.<TInteraction>newArrayList();
    EList<InteractionFragment> _fragments = interaction.getFragments();
    final Procedure1<InteractionFragment> _function = new Procedure1<InteractionFragment>() {
      public void apply(final InteractionFragment f) {
        EList<InteractionFragment> _fragments = interaction.getFragments();
        final TInteraction transformed = TextRAMTransform.this.getTransformedFragment(f, _fragments, to);
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(transformed, null));
        if (!_notEquals) {
          _and = false;
        } else {
          boolean _containsFragment = TextRAMTransform.this.containsFragment(res, transformed);
          boolean _equals = (_containsFragment == false);
          _and = _equals;
        }
        if (_and) {
          res.add(transformed);
        }
      }
    };
    IterableExtensions.<InteractionFragment>forEach(_fragments, _function);
    return res;
  }
  
  private boolean _containsFragment(final List<TInteraction> interactions, final TInteractionMessage interaction) {
    Iterable<TInteractionMessage> _filter = Iterables.<TInteractionMessage>filter(interactions, TInteractionMessage.class);
    final Function1<TInteractionMessage,Boolean> _function = new Function1<TInteractionMessage,Boolean>() {
      public Boolean apply(final TInteractionMessage i) {
        boolean _and = false;
        boolean _and_1 = false;
        TLifeline _leftLifeline = i.getLeftLifeline();
        String _nameFromTLifeline = TextRAMTransform.this.getNameFromTLifeline(_leftLifeline);
        TLifeline _leftLifeline_1 = interaction.getLeftLifeline();
        String _nameFromTLifeline_1 = TextRAMTransform.this.getNameFromTLifeline(_leftLifeline_1);
        boolean _equals = Objects.equal(_nameFromTLifeline, _nameFromTLifeline_1);
        if (!_equals) {
          _and_1 = false;
        } else {
          TLifeline _rightLifeline = i.getRightLifeline();
          String _nameFromTLifeline_2 = TextRAMTransform.this.getNameFromTLifeline(_rightLifeline);
          TLifeline _rightLifeline_1 = interaction.getRightLifeline();
          String _nameFromTLifeline_3 = TextRAMTransform.this.getNameFromTLifeline(_rightLifeline_1);
          boolean _equals_1 = Objects.equal(_nameFromTLifeline_2, _nameFromTLifeline_3);
          _and_1 = _equals_1;
        }
        if (!_and_1) {
          _and = false;
        } else {
          TMessage _message = i.getMessage();
          TOperation _signature = _message.getSignature();
          String _name = _signature.getName();
          TMessage _message_1 = interaction.getMessage();
          TOperation _signature_1 = _message_1.getSignature();
          String _name_1 = _signature_1.getName();
          boolean _equals_2 = Objects.equal(_name, _name_1);
          _and = _equals_2;
        }
        return Boolean.valueOf(_and);
      }
    };
    final boolean res = IterableExtensions.<TInteractionMessage>exists(_filter, _function);
    return res;
  }
  
  private boolean _containsFragment(final List<TInteraction> interactions, final TCombinedFragment interaction) {
    return false;
  }
  
  private boolean _containsFragment(final List<TInteraction> interactions, final TReturnInteraction interaction) {
    return false;
  }
  
  private boolean _containsFragment(final List<TInteraction> interactions, final TOcurrence interaction) {
    Iterable<TOcurrence> _filter = Iterables.<TOcurrence>filter(interactions, TOcurrence.class);
    final Function1<TOcurrence,Boolean> _function = new Function1<TOcurrence,Boolean>() {
      public Boolean apply(final TOcurrence i) {
        boolean _xblockexpression = false;
        {
          TLifeline _leftLifeline = i.getLeftLifeline();
          String _nameFromTLifeline = TextRAMTransform.this.getNameFromTLifeline(_leftLifeline);
          TLifeline _leftLifeline_1 = interaction.getLeftLifeline();
          String _nameFromTLifeline_1 = TextRAMTransform.this.getNameFromTLifeline(_leftLifeline_1);
          /* Objects.equal(_nameFromTLifeline, _nameFromTLifeline_1); */
          OcurrenceType _ocurrenceType = i.getOcurrenceType();
          OcurrenceType _ocurrenceType_1 = interaction.getOcurrenceType();
          _xblockexpression = Objects.equal(_ocurrenceType, _ocurrenceType_1);
        }
        return Boolean.valueOf(_xblockexpression);
      }
    };
    final boolean res = IterableExtensions.<TOcurrence>exists(_filter, _function);
    return res;
  }
  
  private TInteraction _getTransformedFragment(final MessageOccurrenceSpecification from, final EList<InteractionFragment> fragments, final TAspect to) {
    final Message ramMessage = from.getMessage();
    EList<AbstractMessageView> _messageViews = to.getMessageViews();
    Iterable<TAbstractMessageView> _filter = Iterables.<TAbstractMessageView>filter(_messageViews, TAbstractMessageView.class);
    TAbstractMessageView _get = ((TAbstractMessageView[])Conversions.unwrapArray(_filter, TAbstractMessageView.class))[0];
    final List<TLifeline> tLifelines = _get.getLifelines();
    Iterable<MessageOccurrenceSpecification> _filter_1 = Iterables.<MessageOccurrenceSpecification>filter(fragments, MessageOccurrenceSpecification.class);
    final Function1<MessageOccurrenceSpecification,Boolean> _function = new Function1<MessageOccurrenceSpecification,Boolean>() {
      public Boolean apply(final MessageOccurrenceSpecification mos) {
        Message _message = mos.getMessage();
        return Boolean.valueOf(Objects.equal(_message, ramMessage));
      }
    };
    Iterable<MessageOccurrenceSpecification> _filter_2 = IterableExtensions.<MessageOccurrenceSpecification>filter(_filter_1, _function);
    final List<MessageOccurrenceSpecification> pair = IterableExtensions.<MessageOccurrenceSpecification>toList(_filter_2);
    int _size = pair.size();
    boolean _equals = (_size == 2);
    if (_equals) {
      final TInteractionMessage res = TextRamFactory.eINSTANCE.createTInteractionMessage();
      Message _message = from.getMessage();
      MessageEnd _sendEvent = _message.getSendEvent();
      EList<Lifeline> _covered = ((MessageOccurrenceSpecification) _sendEvent).getCovered();
      Lifeline _get_1 = _covered.get(0);
      final TLifeline tLeftLifeline = this.getFirstTLifelineFromLifeline(tLifelines, _get_1);
      Message _message_1 = from.getMessage();
      MessageEnd _receiveEvent = _message_1.getReceiveEvent();
      EList<Lifeline> _covered_1 = ((MessageOccurrenceSpecification) _receiveEvent).getCovered();
      Lifeline _get_2 = _covered_1.get(0);
      final TLifeline tRightLifeline = this.getFirstTLifelineFromLifeline(tLifelines, _get_2);
      boolean _equals_1 = Objects.equal(tLeftLifeline, null);
      if (_equals_1) {
        throw new IllegalStateException("Left TLifeline has not been found");
      }
      boolean _equals_2 = Objects.equal(tRightLifeline, null);
      if (_equals_2) {
        throw new IllegalStateException("Right TLifeline has not been found");
      }
      res.setLeftLifeline(tLeftLifeline);
      res.setRightLifeline(tRightLifeline);
      TMessage _transformedTMessageFrom = this.getTransformedTMessageFrom(ramMessage, to);
      res.setMessage(_transformedTMessageFrom);
      return res;
    }
    return null;
  }
  
  public TLifeline getFirstTLifelineFromLifeline(final List<TLifeline> lifelines, final Lifeline lifeline) {
    final Function1<TLifeline,Boolean> _function = new Function1<TLifeline,Boolean>() {
      public Boolean apply(final TLifeline l) {
        TTypedElement _represents = l.getRepresents();
        String _nameFromRepresents = TextRAMTransform.this.getNameFromRepresents(_represents);
        TypedElement _represents_1 = lifeline.getRepresents();
        String _ramNameFromRepresents = TextRAMTransform.this.getRamNameFromRepresents(_represents_1);
        return Boolean.valueOf(Objects.equal(_nameFromRepresents, _ramNameFromRepresents));
      }
    };
    return IterableExtensions.<TLifeline>findFirst(lifelines, _function);
  }
  
  private TInteraction _getTransformedFragment(final OriginalBehaviorExecution from, final EList<InteractionFragment> fragments, final TAspect to) {
    final TOcurrence res = TextRamFactory.eINSTANCE.createTOcurrence();
    EList<AbstractMessageView> _messageViews = to.getMessageViews();
    Iterable<TAbstractMessageView> _filter = Iterables.<TAbstractMessageView>filter(_messageViews, TAbstractMessageView.class);
    TAbstractMessageView _get = ((TAbstractMessageView[])Conversions.unwrapArray(_filter, TAbstractMessageView.class))[0];
    final EList<TLifeline> tLifelines = _get.getLifelines();
    TLifeline _tLifelineFrom = this.getTLifelineFrom(from, tLifelines);
    res.setLeftLifeline(_tLifelineFrom);
    res.setOcurrenceType(OcurrenceType.ORIGINAL);
    return res;
  }
  
  private TInteraction _getTransformedFragment(final OccurrenceSpecification from, final EList<InteractionFragment> fragments, final TAspect to) {
    final TOcurrence res = TextRamFactory.eINSTANCE.createTOcurrence();
    return res;
  }
  
  private TInteraction _getTransformedFragment(final ExecutionStatement from, final EList<InteractionFragment> fragments, final TAspect to) {
    return null;
  }
  
  private TInteraction _getTransformedFragment(final DestructionOccurrenceSpecification from, final EList<InteractionFragment> fragments, final TAspect to) {
    final TOcurrence res = TextRamFactory.eINSTANCE.createTOcurrence();
    res.setOcurrenceType(OcurrenceType.DESTRUCTION);
    return res;
  }
  
  private TInteraction _getTransformedFragment(final CombinedFragment from, final EList<InteractionFragment> fragments, final TAspect to) {
    final TCombinedFragment res = TextRamFactory.eINSTANCE.createTCombinedFragment();
    InteractionOperatorKind _interactionOperator = from.getInteractionOperator();
    res.setInteractionOperator(_interactionOperator);
    EList<InteractionOperand> _operands = from.getOperands();
    InteractionOperand _get = _operands.get(0);
    ValueSpecification _interactionConstraint = _get.getInteractionConstraint();
    String _textRamInteractionConstraint = this.getTextRamInteractionConstraint(_interactionConstraint);
    res.setInteractionConstraint(_textRamInteractionConstraint);
    final List<TInteraction> tInteractions = CollectionLiterals.<TInteraction>newArrayList();
    final List<TInteraction> tInteractionsForAlt = CollectionLiterals.<TInteraction>newArrayList();
    EList<InteractionOperand> _operands_1 = from.getOperands();
    InteractionOperand _get_1 = _operands_1.get(0);
    EList<InteractionFragment> _fragments = _get_1.getFragments();
    final Procedure1<InteractionFragment> _function = new Procedure1<InteractionFragment>() {
      public void apply(final InteractionFragment f) {
        EList<InteractionOperand> _operands = from.getOperands();
        InteractionOperand _get = _operands.get(0);
        EList<InteractionFragment> _fragments = _get.getFragments();
        final TInteraction transformed = TextRAMTransform.this.getTransformedFragment(f, _fragments, to);
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(transformed, null));
        if (!_notEquals) {
          _and = false;
        } else {
          boolean _containsFragment = TextRAMTransform.this.containsFragment(tInteractions, transformed);
          boolean _equals = (_containsFragment == false);
          _and = _equals;
        }
        if (_and) {
          tInteractions.add(transformed);
        }
      }
    };
    IterableExtensions.<InteractionFragment>forEach(_fragments, _function);
    EList<TInteraction> _containers = res.getContainers();
    _containers.addAll(tInteractions);
    InteractionOperatorKind _interactionOperator_1 = from.getInteractionOperator();
    boolean _equals = Objects.equal(_interactionOperator_1, InteractionOperatorKind.ALT);
    if (_equals) {
      EList<InteractionOperand> _operands_2 = from.getOperands();
      InteractionOperand _get_2 = _operands_2.get(1);
      EList<InteractionFragment> _fragments_1 = _get_2.getFragments();
      final Procedure1<InteractionFragment> _function_1 = new Procedure1<InteractionFragment>() {
        public void apply(final InteractionFragment f) {
          EList<InteractionOperand> _operands = from.getOperands();
          InteractionOperand _get = _operands.get(1);
          EList<InteractionFragment> _fragments = _get.getFragments();
          final TInteraction transformed = TextRAMTransform.this.getTransformedFragment(f, _fragments, to);
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(transformed, null));
          if (!_notEquals) {
            _and = false;
          } else {
            boolean _containsFragment = TextRAMTransform.this.containsFragment(tInteractions, transformed);
            boolean _equals = (_containsFragment == false);
            _and = _equals;
          }
          if (_and) {
            tInteractionsForAlt.add(transformed);
          }
        }
      };
      IterableExtensions.<InteractionFragment>forEach(_fragments_1, _function_1);
    }
    EList<TInteraction> _elseContainers = res.getElseContainers();
    _elseContainers.addAll(tInteractionsForAlt);
    return res;
  }
  
  private String _getTextRamInteractionConstraint(final OpaqueExpression value) {
    return value.getBody();
  }
  
  private String _getTextRamInteractionConstraint(final LiteralString value) {
    return value.getValue();
  }
  
  private String _getTextRamInteractionConstraint(final LiteralInteger value) {
    int _value = value.getValue();
    return String.valueOf(_value);
  }
  
  private String _getTextRamInteractionConstraint(final ParameterValue value) {
    Parameter _parameter = value.getParameter();
    return _parameter.getName();
  }
  
  private TMessage getTransformedTMessageFrom(final Message message, final TAspect to) {
    final TMessage res = TextRamFactory.eINSTANCE.createTMessage();
    Operation _signature = message.getSignature();
    EObject _eContainer = _signature.eContainer();
    String _name = ((ca.mcgill.cs.sel.ram.Class) _eContainer).getName();
    final TClass clazz = this.textRamEcoreUtil.findClass(to, _name);
    StructuralFeature _assignTo = message.getAssignTo();
    boolean _notEquals = (!Objects.equal(_assignTo, null));
    if (_notEquals) {
      StructuralFeature _assignTo_1 = message.getAssignTo();
      TMessageAssignableFeature _assignToFrom = this.getAssignToFrom(_assignTo_1, to, clazz);
      res.setAssignTo(_assignToFrom);
    }
    Operation _signature_1 = message.getSignature();
    final TOperation tOperation = TextRamEcoreUtil.findTextRamOperation(clazz, _signature_1);
    res.setSignature(tOperation);
    boolean _isPartial = tOperation.isPartial();
    res.setPartialOperation(_isPartial);
    return res;
  }
  
  private List<TValueSpecification> getMessagesArguments(final Message message, final TAspect to, final TOperation operation) {
    final List<TValueSpecification> res = CollectionLiterals.<TValueSpecification>newArrayList();
    EList<ParameterValueMapping> _arguments = message.getArguments();
    final Procedure1<ParameterValueMapping> _function = new Procedure1<ParameterValueMapping>() {
      public void apply(final ParameterValueMapping a) {
        TValueSpecification _transformTValueSpecification = TextRAMTransform.this.transformTValueSpecification(a, to, operation);
        res.add(_transformTValueSpecification);
      }
    };
    IterableExtensions.<ParameterValueMapping>forEach(_arguments, _function);
    return res;
  }
  
  private TValueSpecification transformTValueSpecification(final ParameterValueMapping mapping, final TAspect to, final TOperation operation) {
    ValueSpecification _value = mapping.getValue();
    TValueSpecification res = this.resolveValueSpecification(_value, to);
    boolean _and = false;
    Parameter _parameter = mapping.getParameter();
    boolean _notEquals = (!Objects.equal(_parameter, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _equals = Objects.equal(res, null);
      _and = _equals;
    }
    if (_and) {
      EList<TParameter> _parameters = operation.getParameters();
      final Function1<TParameter,Boolean> _function = new Function1<TParameter,Boolean>() {
        public Boolean apply(final TParameter p) {
          String _name = p.getName();
          Parameter _parameter = mapping.getParameter();
          String _name_1 = _parameter.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      TParameter _findFirst = IterableExtensions.<TParameter>findFirst(_parameters, _function);
      res = _findFirst;
    }
    return res;
  }
  
  private TValueSpecification _resolveValueSpecification(final Attribute specification, final TAspect to) {
    EList<AbstractMessageView> _messageViews = to.getMessageViews();
    AbstractMessageView _get = _messageViews.get(0);
    final TAbstractMessageView tAbstractMessageView = ((TAbstractMessageView) _get);
    EList<TLifeline> _lifelines = tAbstractMessageView.getLifelines();
    final Function1<TLifeline,EList<TTemporaryProperty>> _function = new Function1<TLifeline,EList<TTemporaryProperty>>() {
      public EList<TTemporaryProperty> apply(final TLifeline it) {
        return it.getLocalProperties();
      }
    };
    List<EList<TTemporaryProperty>> _map = ListExtensions.<TLifeline, EList<TTemporaryProperty>>map(_lifelines, _function);
    Iterable<TTemporaryProperty> _flatten = Iterables.<TTemporaryProperty>concat(_map);
    Iterable<TLocalAttribute> _filter = Iterables.<TLocalAttribute>filter(_flatten, TLocalAttribute.class);
    final Function1<TLocalAttribute,Boolean> _function_1 = new Function1<TLocalAttribute,Boolean>() {
      public Boolean apply(final TLocalAttribute la) {
        String _name = la.getName();
        String _name_1 = specification.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    final TLocalAttribute res = IterableExtensions.<TLocalAttribute>findFirst(_filter, _function_1);
    return res;
  }
  
  private TValueSpecification _resolveValueSpecification(final Reference specification, final TAspect to) {
    EList<AbstractMessageView> _messageViews = to.getMessageViews();
    AbstractMessageView _get = _messageViews.get(0);
    final TAbstractMessageView tAbstractMessageView = ((TAbstractMessageView) _get);
    EList<TLifeline> _lifelines = tAbstractMessageView.getLifelines();
    final Function1<TLifeline,EList<TTemporaryProperty>> _function = new Function1<TLifeline,EList<TTemporaryProperty>>() {
      public EList<TTemporaryProperty> apply(final TLifeline it) {
        return it.getLocalProperties();
      }
    };
    List<EList<TTemporaryProperty>> _map = ListExtensions.<TLifeline, EList<TTemporaryProperty>>map(_lifelines, _function);
    Iterable<TTemporaryProperty> _flatten = Iterables.<TTemporaryProperty>concat(_map);
    Iterable<TReference> _filter = Iterables.<TReference>filter(_flatten, TReference.class);
    final Function1<TReference,Boolean> _function_1 = new Function1<TReference,Boolean>() {
      public Boolean apply(final TReference la) {
        String _name = la.getName();
        String _name_1 = specification.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    TValueSpecification res = IterableExtensions.<TReference>findFirst(_filter, _function_1);
    boolean _equals = Objects.equal(res, null);
    if (_equals) {
      EList<TLifeline> _lifelines_1 = tAbstractMessageView.getLifelines();
      final Function1<TLifeline,Boolean> _function_2 = new Function1<TLifeline,Boolean>() {
        public Boolean apply(final TLifeline l) {
          String _name = l.getName();
          String _name_1 = specification.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      TLifeline _findFirst = IterableExtensions.<TLifeline>findFirst(_lifelines_1, _function_2);
      res = _findFirst;
    }
    return res;
  }
  
  private TMessageAssignableFeature _getAssignToFrom(final AssociationEnd feature, final TAspect to, final TClass clazz) {
    StructuralView _structuralView = to.getStructuralView();
    final TStructuralView tStructuralView = ((TStructuralView) _structuralView);
    EList<TAssociation> _tAssociations = tStructuralView.getTAssociations();
    final Function1<TAssociation,Boolean> _function = new Function1<TAssociation,Boolean>() {
      public Boolean apply(final TAssociation a) {
        String _name = a.getName();
        String _name_1 = feature.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<TAssociation>findFirst(_tAssociations, _function);
  }
  
  private TMessageAssignableFeature _getAssignToFrom(final Attribute feature, final TAspect to, final TClass clazz) {
    EList<AbstractMessageView> _messageViews = to.getMessageViews();
    AbstractMessageView _get = _messageViews.get(0);
    final TAbstractMessageView mv = ((TAbstractMessageView) _get);
    EList<TLifeline> _lifelines = mv.getLifelines();
    final Function1<TLifeline,EList<TTemporaryProperty>> _function = new Function1<TLifeline,EList<TTemporaryProperty>>() {
      public EList<TTemporaryProperty> apply(final TLifeline it) {
        return it.getLocalProperties();
      }
    };
    List<EList<TTemporaryProperty>> _map = ListExtensions.<TLifeline, EList<TTemporaryProperty>>map(_lifelines, _function);
    Iterable<TTemporaryProperty> _flatten = Iterables.<TTemporaryProperty>concat(_map);
    Iterable<TLocalAttribute> _filter = Iterables.<TLocalAttribute>filter(_flatten, TLocalAttribute.class);
    final Function1<TLocalAttribute,Boolean> _function_1 = new Function1<TLocalAttribute,Boolean>() {
      public Boolean apply(final TLocalAttribute la) {
        String _name = la.getName();
        String _name_1 = feature.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    final TLocalAttribute res = IterableExtensions.<TLocalAttribute>findFirst(_filter, _function_1);
    return res;
  }
  
  private TMessageAssignableFeature _getAssignToFrom(final Reference feature, final TAspect to, final TClass clazz) {
    EList<AbstractMessageView> _messageViews = to.getMessageViews();
    AbstractMessageView _get = _messageViews.get(0);
    final TAbstractMessageView mv = ((TAbstractMessageView) _get);
    EList<TLifeline> _lifelines = mv.getLifelines();
    final Function1<TLifeline,EList<TTemporaryProperty>> _function = new Function1<TLifeline,EList<TTemporaryProperty>>() {
      public EList<TTemporaryProperty> apply(final TLifeline it) {
        return it.getLocalProperties();
      }
    };
    List<EList<TTemporaryProperty>> _map = ListExtensions.<TLifeline, EList<TTemporaryProperty>>map(_lifelines, _function);
    Iterable<TTemporaryProperty> _flatten = Iterables.<TTemporaryProperty>concat(_map);
    Iterable<TReference> _filter = Iterables.<TReference>filter(_flatten, TReference.class);
    final Function1<TReference,Boolean> _function_1 = new Function1<TReference,Boolean>() {
      public Boolean apply(final TReference la) {
        String _name = la.getName();
        String _name_1 = feature.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    TReference _findFirst = IterableExtensions.<TReference>findFirst(_filter, _function_1);
    TMessageAssignableFeature res = ((TReference) _findFirst);
    boolean _equals = Objects.equal(res, null);
    if (_equals) {
      EList<TLifeline> _lifelines_1 = mv.getLifelines();
      final Function1<TLifeline,Boolean> _function_2 = new Function1<TLifeline,Boolean>() {
        public Boolean apply(final TLifeline l) {
          String _name = l.getName();
          String _name_1 = feature.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      TLifeline _findFirst_1 = IterableExtensions.<TLifeline>findFirst(_lifelines_1, _function_2);
      res = _findFirst_1;
    }
    boolean _equals_1 = Objects.equal(res, null);
    if (_equals_1) {
      EList<TLifeline> _lifelines_2 = mv.getLifelines();
      final Function1<TLifeline,Boolean> _function_3 = new Function1<TLifeline,Boolean>() {
        public Boolean apply(final TLifeline l) {
          TTypedElement _represents = l.getRepresents();
          String _nameFromRepresents = TextRAMTransform.this.getNameFromRepresents(_represents);
          String _name = feature.getName();
          return Boolean.valueOf(Objects.equal(_nameFromRepresents, _name));
        }
      };
      TLifeline _findFirst_2 = IterableExtensions.<TLifeline>findFirst(_lifelines_2, _function_3);
      res = _findFirst_2;
    }
    return res;
  }
  
  private TLifeline _getTLifelineFrom(final OriginalBehaviorExecution originalExecution, final List<TLifeline> list) {
    final Function1<TLifeline,Boolean> _function = new Function1<TLifeline,Boolean>() {
      public Boolean apply(final TLifeline tl) {
        String _nameFromTLifeline = TextRAMTransform.this.getNameFromTLifeline(tl);
        EList<Lifeline> _covered = originalExecution.getCovered();
        Lifeline _get = _covered.get(0);
        String _nameFromLifeline = TextRAMTransform.this.getNameFromLifeline(_get);
        return Boolean.valueOf(Objects.equal(_nameFromTLifeline, _nameFromLifeline));
      }
    };
    final TLifeline res = IterableExtensions.<TLifeline>findFirst(list, _function);
    return res;
  }
  
  private TLifeline _getTLifelineFrom(final MessageOccurrenceSpecification messageOcurrence, final List<TLifeline> list) {
    final Function1<TLifeline,Boolean> _function = new Function1<TLifeline,Boolean>() {
      public Boolean apply(final TLifeline tl) {
        String _nameFromTLifeline = TextRAMTransform.this.getNameFromTLifeline(tl);
        EList<Lifeline> _covered = messageOcurrence.getCovered();
        Lifeline _get = _covered.get(0);
        String _nameFromLifeline = TextRAMTransform.this.getNameFromLifeline(_get);
        return Boolean.valueOf(Objects.equal(_nameFromTLifeline, _nameFromLifeline));
      }
    };
    final TLifeline res = IterableExtensions.<TLifeline>findFirst(list, _function);
    return res;
  }
  
  private TClass getClassFromMessageView(final Operation operation, final TAspect to) {
    EObject _eContainer = operation.eContainer();
    final ca.mcgill.cs.sel.ram.Class clazz = ((ca.mcgill.cs.sel.ram.Class) _eContainer);
    String _name = clazz.getName();
    TClass _findClass = this.textRamEcoreUtil.findClass(to, _name);
    final TClass res = ((TClass) _findClass);
    return res;
  }
  
  private void addLifelinesfrom(final TAbstractMessageView textRamMessageView, final Aspect from, final TAspect to) {
    final List<TLifeline> lifelines = CollectionLiterals.<TLifeline>newArrayList();
    EList<AbstractMessageView> _messageViews = from.getMessageViews();
    Iterable<AspectMessageView> _filter = Iterables.<AspectMessageView>filter(_messageViews, AspectMessageView.class);
    final Procedure1<AspectMessageView> _function = new Procedure1<AspectMessageView>() {
      public void apply(final AspectMessageView amv) {
        Interaction _advice = amv.getAdvice();
        EList<Lifeline> _lifelines = _advice.getLifelines();
        final Procedure1<Lifeline> _function = new Procedure1<Lifeline>() {
          public void apply(final Lifeline l) {
            boolean _exists = TextRAMTransform.this.exists(lifelines, l);
            boolean _equals = (_exists == false);
            if (_equals) {
              TLifeline _transformedLifeline = TextRAMTransform.this.getTransformedLifeline(l, to);
              lifelines.add(_transformedLifeline);
            }
          }
        };
        IterableExtensions.<Lifeline>forEach(_lifelines, _function);
      }
    };
    IterableExtensions.<AspectMessageView>forEach(_filter, _function);
    EList<AbstractMessageView> _messageViews_1 = from.getMessageViews();
    Iterable<MessageView> _filter_1 = Iterables.<MessageView>filter(_messageViews_1, MessageView.class);
    final Procedure1<MessageView> _function_1 = new Procedure1<MessageView>() {
      public void apply(final MessageView mv) {
        Interaction _specification = mv.getSpecification();
        boolean _notEquals = (!Objects.equal(_specification, null));
        if (_notEquals) {
          Interaction _specification_1 = mv.getSpecification();
          EList<Lifeline> _lifelines = _specification_1.getLifelines();
          final Procedure1<Lifeline> _function = new Procedure1<Lifeline>() {
            public void apply(final Lifeline l) {
              boolean _exists = TextRAMTransform.this.exists(lifelines, l);
              boolean _equals = (_exists == false);
              if (_equals) {
                TLifeline _transformedLifeline = TextRAMTransform.this.getTransformedLifeline(l, to);
                lifelines.add(_transformedLifeline);
              }
            }
          };
          IterableExtensions.<Lifeline>forEach(_lifelines, _function);
        }
      }
    };
    IterableExtensions.<MessageView>forEach(_filter_1, _function_1);
    EList<TLifeline> _lifelines = textRamMessageView.getLifelines();
    _lifelines.addAll(lifelines);
  }
  
  private boolean exists(final List<TLifeline> lifelines, final Lifeline toFind) {
    TypedElement _represents = toFind.getRepresents();
    if ((_represents instanceof TAssociation)) {
      final Function1<TLifeline,Boolean> _function = new Function1<TLifeline,Boolean>() {
        public Boolean apply(final TLifeline l) {
          String _name = l.getName();
          String _nameFromLifeline = TextRAMTransform.this.getNameFromLifeline(toFind);
          return Boolean.valueOf(Objects.equal(_name, _nameFromLifeline));
        }
      };
      Iterable<TLifeline> _filter = IterableExtensions.<TLifeline>filter(lifelines, _function);
      int _size = IterableExtensions.size(_filter);
      return (_size > 0);
    } else {
      final Function1<TLifeline,Boolean> _function_1 = new Function1<TLifeline,Boolean>() {
        public Boolean apply(final TLifeline l) {
          String _nameFromTLifeline = TextRAMTransform.this.getNameFromTLifeline(l);
          String _nameFromLifeline = TextRAMTransform.this.getNameFromLifeline(toFind);
          return Boolean.valueOf(Objects.equal(_nameFromTLifeline, _nameFromLifeline));
        }
      };
      Iterable<TLifeline> _filter_1 = IterableExtensions.<TLifeline>filter(lifelines, _function_1);
      int _size_1 = IterableExtensions.size(_filter_1);
      return (_size_1 > 0);
    }
  }
  
  private TLifeline getTransformedLifeline(final Lifeline from, final TAspect to) {
    final TLifeline res = TextRamFactory.eINSTANCE.createTLifeline();
    TypedElement _represents = from.getRepresents();
    boolean _resolveStaticFromReference = this.resolveStaticFromReference(_represents);
    res.setStatic(_resolveStaticFromReference);
    TypedElement _represents_1 = from.getRepresents();
    TTypedElement _representsFrom = this.getRepresentsFrom(_represents_1, to);
    res.setRepresents(_representsFrom);
    String _nameFromLifeline = this.getNameFromLifeline(from);
    res.setName(_nameFromLifeline);
    TypedElement _represents_2 = from.getRepresents();
    TLifelineReferenceType _referenceTypeFrom = this.getReferenceTypeFrom(_represents_2);
    res.setReferenceType(_referenceTypeFrom);
    EList<TTemporaryProperty> _localProperties = res.getLocalProperties();
    List<TTemporaryProperty> _localPropertiesFromLifeline = this.getLocalPropertiesFromLifeline(from, to);
    _localProperties.addAll(_localPropertiesFromLifeline);
    return res;
  }
  
  private List<TTemporaryProperty> getLocalPropertiesFromLifeline(final Lifeline from, final TAspect to) {
    final List<TTemporaryProperty> res = CollectionLiterals.<TTemporaryProperty>newArrayList();
    EList<TemporaryProperty> _localProperties = from.getLocalProperties();
    final Procedure1<TemporaryProperty> _function = new Procedure1<TemporaryProperty>() {
      public void apply(final TemporaryProperty lp) {
        final TTemporaryProperty localProperty = TextRAMTransform.this.getLocalProperty(lp, to);
        final Function1<TTemporaryProperty,Boolean> _function = new Function1<TTemporaryProperty,Boolean>() {
          public Boolean apply(final TTemporaryProperty q) {
            String _name = q.getName();
            String _name_1 = localProperty.getName();
            return Boolean.valueOf(Objects.equal(_name, _name_1));
          }
        };
        boolean _exists = IterableExtensions.<TTemporaryProperty>exists(res, _function);
        boolean _equals = (_exists == false);
        if (_equals) {
          res.add(localProperty);
        }
      }
    };
    IterableExtensions.<TemporaryProperty>forEach(_localProperties, _function);
    return res;
  }
  
  private TTemporaryProperty _getLocalProperty(final Reference from, final TAspect to) {
    ObjectType _type = from.getType();
    if ((_type instanceof ca.mcgill.cs.sel.ram.Class)) {
      ObjectType _type_1 = from.getType();
      String _name = from.getName();
      return this.transformLocalPropertyFromReference(((ca.mcgill.cs.sel.ram.Class) _type_1), _name, to);
    }
    ObjectType _type_2 = from.getType();
    if ((_type_2 instanceof RSet)) {
      ObjectType _type_3 = from.getType();
      final RSet rSet = ((RSet) _type_3);
      ObjectType _type_4 = rSet.getType();
      if ((_type_4 instanceof ca.mcgill.cs.sel.ram.Class)) {
        ObjectType _type_5 = rSet.getType();
        String _name_1 = from.getName();
        return this.transformLocalPropertyFromReference(((ca.mcgill.cs.sel.ram.Class) _type_5), _name_1, to);
      } else {
        ObjectType _type_6 = rSet.getType();
        if ((_type_6 instanceof PrimitiveType)) {
          ObjectType _type_7 = rSet.getType();
          return this.transformLocalPropertyFromPrimitiveType(((PrimitiveType) _type_7), from, to);
        }
      }
    }
    ObjectType _type_8 = from.getType();
    if ((_type_8 instanceof PrimitiveType)) {
      ObjectType _type_9 = from.getType();
      return this.transformLocalPropertyFromPrimitiveType(((PrimitiveType) _type_9), from, to);
    }
    return null;
  }
  
  private TLocalAttribute transformLocalPropertyFromPrimitiveType(final PrimitiveType type, final Reference from, final TAspect to) {
    final TLocalAttribute res = TextRamFactory.eINSTANCE.createTLocalAttribute();
    String _name = from.getName();
    res.setName(_name);
    Type _typeReference = this.textRamEcoreUtil.getTypeReference(to, type);
    res.setType(((PrimitiveType) _typeReference));
    return res;
  }
  
  private TTemporaryProperty transformLocalPropertyFromReference(final ca.mcgill.cs.sel.ram.Class clazz, final String name, final TAspect aspect) {
    String _name = clazz.getName();
    final TClass tClass = this.textRamEcoreUtil.findClass(aspect, _name);
    final TReference res = TextRamFactory.eINSTANCE.createTReference();
    res.setName(name);
    boolean _isPartial = tClass.isPartial();
    res.setPartialClass(_isPartial);
    res.setReference(tClass);
    return res;
  }
  
  private TTemporaryProperty _getLocalProperty(final Attribute from, final TAspect to) {
    TLocalAttribute _createTLocalAttribute = TextRamFactory.eINSTANCE.createTLocalAttribute();
    final Procedure1<TLocalAttribute> _function = new Procedure1<TLocalAttribute>() {
      public void apply(final TLocalAttribute it) {
        String _name = from.getName();
        it.setName(_name);
        PrimitiveType _type = from.getType();
        Type _typeReference = TextRAMTransform.this.textRamEcoreUtil.getTypeReference(to, _type);
        it.setType(((PrimitiveType) _typeReference));
      }
    };
    final TLocalAttribute res = ObjectExtensions.<TLocalAttribute>operator_doubleArrow(_createTLocalAttribute, _function);
    return res;
  }
  
  private TLifelineReferenceType _getReferenceTypeFrom(final AssociationEnd from) {
    return TLifelineReferenceType.ASSOCIATION;
  }
  
  private TLifelineReferenceType _getReferenceTypeFrom(final Attribute from) {
    return TLifelineReferenceType.ATTRIBUTE;
  }
  
  private TLifelineReferenceType _getReferenceTypeFrom(final Reference from) {
    return TLifelineReferenceType.REFERENCE;
  }
  
  private TLifelineReferenceType _getReferenceTypeFrom(final Parameter from) {
    throw new IllegalStateException("Parameter is not supported as referenceType");
  }
  
  private String getNameFromLifeline(final Lifeline lifeline) {
    TypedElement _represents = lifeline.getRepresents();
    return _represents.getName();
  }
  
  private String getNameFromTLifeline(final TLifeline tLifeline) {
    return tLifeline.getName();
  }
  
  private String _getNameFromRepresents(final TClass clazz) {
    return clazz.getName();
  }
  
  private String _getNameFromRepresents(final TAssociation assoc) {
    return assoc.getName();
  }
  
  private String _getNameFromRepresents(final TAttribute attr) {
    return attr.getName();
  }
  
  private String _getRamNameFromRepresents(final Reference r) {
    ObjectType _type = r.getType();
    return _type.getName();
  }
  
  private String _getRamNameFromRepresents(final AssociationEnd ass) {
    return ass.getName();
  }
  
  private String _getRamNameFromRepresents(final Attribute attr) {
    return attr.getName();
  }
  
  private String _getRamNameFromRepresents(final Parameter par) {
    return par.getName();
  }
  
  private TTypedElement _getRepresentsFrom(final AssociationEnd from, final Aspect to) {
    String _name = from.getName();
    return this.textRamEcoreUtil.getTAssociation(to, _name);
  }
  
  private TTypedElement _getRepresentsFrom(final Reference from, final Aspect to) {
    StructuralView _structuralView = to.getStructuralView();
    ObjectType _type = from.getType();
    String _name = _type.getName();
    return this.textRamEcoreUtil.getTClassFrom(((TStructuralView) _structuralView), _name);
  }
  
  private TTypedElement _getRepresentsFrom(final Attribute from, final Aspect to) {
    StructuralView _structuralView = to.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
    final Function1<TClass,EList<TClassMember>> _function = new Function1<TClass,EList<TClassMember>>() {
      public EList<TClassMember> apply(final TClass it) {
        return it.getMembers();
      }
    };
    Iterable<EList<TClassMember>> _map = IterableExtensions.<TClass, EList<TClassMember>>map(_filter, _function);
    Iterable<TClassMember> _flatten = Iterables.<TClassMember>concat(_map);
    Iterable<TAttribute> _filter_1 = Iterables.<TAttribute>filter(_flatten, TAttribute.class);
    final Function1<TAttribute,Boolean> _function_1 = new Function1<TAttribute,Boolean>() {
      public Boolean apply(final TAttribute a) {
        String _name = a.getName();
        PrimitiveType _type = from.getType();
        String _name_1 = _type.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<TAttribute>findFirst(_filter_1, _function_1);
  }
  
  private TTypedElement _getRepresentsFrom(final Parameter from, final Aspect to) {
    throw new IllegalStateException("Parameter not supported in TTypedElement");
  }
  
  private boolean _resolveStaticFromReference(final AssociationEnd from) {
    return false;
  }
  
  private boolean _resolveStaticFromReference(final Reference from) {
    return from.isStatic();
  }
  
  private boolean _resolveStaticFromReference(final Attribute from) {
    return false;
  }
  
  private boolean _resolveStaticFromReference(final Parameter from) {
    throw new IllegalStateException("Parameter not supported in TTypedElement");
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
    this.transformAssociations(from, to);
  }
  
  private void transformAssociations(final StructuralView from, final TAspect to) {
    EList<Association> _associations = from.getAssociations();
    final Procedure1<Association> _function = new Procedure1<Association>() {
      public void apply(final Association a) {
        StructuralView _structuralView = to.getStructuralView();
        EList<TAssociation> _tAssociations = ((TStructuralView) _structuralView).getTAssociations();
        StructuralView _structuralView_1 = to.getStructuralView();
        TAssociation _transformAssociation = TextRAMTransform.this.transformAssociation(a, ((TStructuralView) _structuralView_1));
        _tAssociations.add(_transformAssociation);
      }
    };
    IterableExtensions.<Association>forEach(_associations, _function);
  }
  
  private TAssociation transformAssociation(final Association from, final TStructuralView to) {
    TAssociation _createTAssociation = TextRamFactory.eINSTANCE.createTAssociation();
    final Procedure1<TAssociation> _function = new Procedure1<TAssociation>() {
      public void apply(final TAssociation it) {
        EList<AssociationEnd> _ends = from.getEnds();
        AssociationEnd _get = _ends.get(0);
        String _name = _get.getName();
        it.setName(_name);
      }
    };
    final TAssociation res = ObjectExtensions.<TAssociation>operator_doubleArrow(_createTAssociation, _function);
    TAssociationEnd _createTAssociationEnd = TextRamFactory.eINSTANCE.createTAssociationEnd();
    final Procedure1<TAssociationEnd> _function_1 = new Procedure1<TAssociationEnd>() {
      public void apply(final TAssociationEnd it) {
        EList<AssociationEnd> _ends = from.getEnds();
        AssociationEnd _get = _ends.get(0);
        int _lowerBound = _get.getLowerBound();
        it.setLowerBound(_lowerBound);
        EList<AssociationEnd> _ends_1 = from.getEnds();
        AssociationEnd _get_1 = _ends_1.get(0);
        int _upperBound = _get_1.getUpperBound();
        it.setUpperBound(_upperBound);
      }
    };
    TAssociationEnd _doubleArrow = ObjectExtensions.<TAssociationEnd>operator_doubleArrow(_createTAssociationEnd, _function_1);
    res.setFromEnd(_doubleArrow);
    TAssociationEnd _createTAssociationEnd_1 = TextRamFactory.eINSTANCE.createTAssociationEnd();
    final Procedure1<TAssociationEnd> _function_2 = new Procedure1<TAssociationEnd>() {
      public void apply(final TAssociationEnd it) {
        EList<AssociationEnd> _ends = from.getEnds();
        AssociationEnd _get = _ends.get(1);
        int _lowerBound = _get.getLowerBound();
        it.setLowerBound(_lowerBound);
        EList<AssociationEnd> _ends_1 = from.getEnds();
        AssociationEnd _get_1 = _ends_1.get(1);
        int _upperBound = _get_1.getUpperBound();
        it.setUpperBound(_upperBound);
      }
    };
    TAssociationEnd _doubleArrow_1 = ObjectExtensions.<TAssociationEnd>operator_doubleArrow(_createTAssociationEnd_1, _function_2);
    res.setToEnd(_doubleArrow_1);
    EObject _eContainer = from.eContainer();
    EList<AssociationEnd> _ends = from.getEnds();
    AssociationEnd _get = _ends.get(0);
    Classifier _classifier = _get.getClassifier();
    String _name = _classifier.getName();
    Classifier _classifierFrom = this.textRamEcoreUtil.getClassifierFrom(((StructuralView) _eContainer), _name);
    final ca.mcgill.cs.sel.ram.Class clazzFrom = ((ca.mcgill.cs.sel.ram.Class) _classifierFrom);
    EObject _eContainer_1 = from.eContainer();
    EList<AssociationEnd> _ends_1 = from.getEnds();
    AssociationEnd _get_1 = _ends_1.get(1);
    Classifier _classifier_1 = _get_1.getClassifier();
    String _name_1 = _classifier_1.getName();
    Classifier _classifierFrom_1 = this.textRamEcoreUtil.getClassifierFrom(((StructuralView) _eContainer_1), _name_1);
    final ca.mcgill.cs.sel.ram.Class clazzTo = ((ca.mcgill.cs.sel.ram.Class) _classifierFrom_1);
    TAssociationEnd _fromEnd = res.getFromEnd();
    String _name_2 = clazzFrom.getName();
    TClass _tClassFrom = this.textRamEcoreUtil.getTClassFrom(to, _name_2);
    _fromEnd.setClassReference(_tClassFrom);
    TAssociationEnd _toEnd = res.getToEnd();
    String _name_3 = clazzTo.getName();
    TClass _tClassFrom_1 = this.textRamEcoreUtil.getTClassFrom(to, _name_3);
    _toEnd.setClassReference(_tClassFrom_1);
    res.setReferenceType(ReferenceType.COMPOSITION);
    res.setDirectionMultplicity(AssociationDirectionMultiplicity.UNIDIRECTIONAL);
    return res;
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
        EList<Classifier> _superTypes_1 = ramClass.getSuperTypes();
        _superTypes_1.get(0);
      }
      EList<Classifier> _superTypes_2 = ramClass.getSuperTypes();
      int _size_1 = _superTypes_2.size();
      boolean _equals = (_size_1 == 1);
      if (_equals) {
        EList<Classifier> _superTypes_3 = ramClass.getSuperTypes();
        Classifier _get = _superTypes_3.get(0);
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
  
  private TAbstractMessages getTransformedMessage(final AbstractMessageView from, final TAspect to) {
    if (from instanceof AspectMessageView) {
      return _getTransformedMessage((AspectMessageView)from, to);
    } else if (from instanceof MessageView) {
      return _getTransformedMessage((MessageView)from, to);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(from, to).toString());
    }
  }
  
  private boolean containsFragment(final List<TInteraction> interactions, final TInteraction interaction) {
    if (interaction instanceof TCombinedFragment) {
      return _containsFragment(interactions, (TCombinedFragment)interaction);
    } else if (interaction instanceof TInteractionMessage) {
      return _containsFragment(interactions, (TInteractionMessage)interaction);
    } else if (interaction instanceof TOcurrence) {
      return _containsFragment(interactions, (TOcurrence)interaction);
    } else if (interaction instanceof TReturnInteraction) {
      return _containsFragment(interactions, (TReturnInteraction)interaction);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(interactions, interaction).toString());
    }
  }
  
  private TInteraction getTransformedFragment(final InteractionFragment from, final EList<InteractionFragment> fragments, final TAspect to) {
    if (from instanceof DestructionOccurrenceSpecification) {
      return _getTransformedFragment((DestructionOccurrenceSpecification)from, fragments, to);
    } else if (from instanceof MessageOccurrenceSpecification) {
      return _getTransformedFragment((MessageOccurrenceSpecification)from, fragments, to);
    } else if (from instanceof CombinedFragment) {
      return _getTransformedFragment((CombinedFragment)from, fragments, to);
    } else if (from instanceof ExecutionStatement) {
      return _getTransformedFragment((ExecutionStatement)from, fragments, to);
    } else if (from instanceof OccurrenceSpecification) {
      return _getTransformedFragment((OccurrenceSpecification)from, fragments, to);
    } else if (from instanceof OriginalBehaviorExecution) {
      return _getTransformedFragment((OriginalBehaviorExecution)from, fragments, to);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(from, fragments, to).toString());
    }
  }
  
  private String getTextRamInteractionConstraint(final ValueSpecification value) {
    if (value instanceof LiteralInteger) {
      return _getTextRamInteractionConstraint((LiteralInteger)value);
    } else if (value instanceof LiteralString) {
      return _getTextRamInteractionConstraint((LiteralString)value);
    } else if (value instanceof OpaqueExpression) {
      return _getTextRamInteractionConstraint((OpaqueExpression)value);
    } else if (value instanceof ParameterValue) {
      return _getTextRamInteractionConstraint((ParameterValue)value);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(value).toString());
    }
  }
  
  private TValueSpecification resolveValueSpecification(final EObject specification, final TAspect to) {
    if (specification instanceof Reference) {
      return _resolveValueSpecification((Reference)specification, to);
    } else if (specification instanceof Attribute) {
      return _resolveValueSpecification((Attribute)specification, to);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(specification, to).toString());
    }
  }
  
  private TMessageAssignableFeature getAssignToFrom(final StructuralFeature feature, final TAspect to, final TClass clazz) {
    if (feature instanceof AssociationEnd) {
      return _getAssignToFrom((AssociationEnd)feature, to, clazz);
    } else if (feature instanceof Reference) {
      return _getAssignToFrom((Reference)feature, to, clazz);
    } else if (feature instanceof Attribute) {
      return _getAssignToFrom((Attribute)feature, to, clazz);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(feature, to, clazz).toString());
    }
  }
  
  private TLifeline getTLifelineFrom(final InteractionFragment messageOcurrence, final List<TLifeline> list) {
    if (messageOcurrence instanceof MessageOccurrenceSpecification) {
      return _getTLifelineFrom((MessageOccurrenceSpecification)messageOcurrence, list);
    } else if (messageOcurrence instanceof OriginalBehaviorExecution) {
      return _getTLifelineFrom((OriginalBehaviorExecution)messageOcurrence, list);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(messageOcurrence, list).toString());
    }
  }
  
  private TTemporaryProperty getLocalProperty(final EObject from, final TAspect to) {
    if (from instanceof Reference) {
      return _getLocalProperty((Reference)from, to);
    } else if (from instanceof Attribute) {
      return _getLocalProperty((Attribute)from, to);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(from, to).toString());
    }
  }
  
  private TLifelineReferenceType getReferenceTypeFrom(final TypedElement from) {
    if (from instanceof AssociationEnd) {
      return _getReferenceTypeFrom((AssociationEnd)from);
    } else if (from instanceof Reference) {
      return _getReferenceTypeFrom((Reference)from);
    } else if (from instanceof Attribute) {
      return _getReferenceTypeFrom((Attribute)from);
    } else if (from instanceof Parameter) {
      return _getReferenceTypeFrom((Parameter)from);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(from).toString());
    }
  }
  
  private String getNameFromRepresents(final TTypedElement clazz) {
    if (clazz instanceof TClass) {
      return _getNameFromRepresents((TClass)clazz);
    } else if (clazz instanceof TAssociation) {
      return _getNameFromRepresents((TAssociation)clazz);
    } else if (clazz instanceof TAttribute) {
      return _getNameFromRepresents((TAttribute)clazz);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(clazz).toString());
    }
  }
  
  private String getRamNameFromRepresents(final TypedElement ass) {
    if (ass instanceof AssociationEnd) {
      return _getRamNameFromRepresents((AssociationEnd)ass);
    } else if (ass instanceof Reference) {
      return _getRamNameFromRepresents((Reference)ass);
    } else if (ass instanceof Attribute) {
      return _getRamNameFromRepresents((Attribute)ass);
    } else if (ass instanceof Parameter) {
      return _getRamNameFromRepresents((Parameter)ass);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ass).toString());
    }
  }
  
  private TTypedElement getRepresentsFrom(final TypedElement from, final Aspect to) {
    if (from instanceof AssociationEnd) {
      return _getRepresentsFrom((AssociationEnd)from, to);
    } else if (from instanceof Reference) {
      return _getRepresentsFrom((Reference)from, to);
    } else if (from instanceof Attribute) {
      return _getRepresentsFrom((Attribute)from, to);
    } else if (from instanceof Parameter) {
      return _getRepresentsFrom((Parameter)from, to);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(from, to).toString());
    }
  }
  
  private boolean resolveStaticFromReference(final TypedElement from) {
    if (from instanceof AssociationEnd) {
      return _resolveStaticFromReference((AssociationEnd)from);
    } else if (from instanceof Reference) {
      return _resolveStaticFromReference((Reference)from);
    } else if (from instanceof Attribute) {
      return _resolveStaticFromReference((Attribute)from);
    } else if (from instanceof Parameter) {
      return _resolveStaticFromReference((Parameter)from);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(from).toString());
    }
  }
}
