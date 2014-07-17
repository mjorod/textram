package cl.uchile.pleiad.transform;

import ca.mcgill.cs.sel.ram.AbstractMessageView;
import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.AspectMessageView;
import ca.mcgill.cs.sel.ram.Association;
import ca.mcgill.cs.sel.ram.AssociationEnd;
import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.CombinedFragment;
import ca.mcgill.cs.sel.ram.ExecutionStatement;
import ca.mcgill.cs.sel.ram.Interaction;
import ca.mcgill.cs.sel.ram.InteractionFragment;
import ca.mcgill.cs.sel.ram.Lifeline;
import ca.mcgill.cs.sel.ram.Message;
import ca.mcgill.cs.sel.ram.MessageOccurrenceSpecification;
import ca.mcgill.cs.sel.ram.MessageView;
import ca.mcgill.cs.sel.ram.ObjectType;
import ca.mcgill.cs.sel.ram.OccurrenceSpecification;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.Parameter;
import ca.mcgill.cs.sel.ram.ParameterValueMapping;
import ca.mcgill.cs.sel.ram.PrimitiveType;
import ca.mcgill.cs.sel.ram.RSet;
import ca.mcgill.cs.sel.ram.Reference;
import ca.mcgill.cs.sel.ram.ReferenceType;
import ca.mcgill.cs.sel.ram.StructuralFeature;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.TemporaryProperty;
import ca.mcgill.cs.sel.ram.Type;
import ca.mcgill.cs.sel.ram.TypedElement;
import ca.mcgill.cs.sel.ram.ValueSpecification;
import ca.mcgill.cs.sel.ram.Visibility;
import cl.uchile.pleiad.textRam.AssociationDirectionMultiplicity;
import cl.uchile.pleiad.textRam.TAbstractMessageView;
import cl.uchile.pleiad.textRam.TAbstractMessages;
import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.textRam.TAspectMessageView;
import cl.uchile.pleiad.textRam.TAssociation;
import cl.uchile.pleiad.textRam.TAssociationEnd;
import cl.uchile.pleiad.textRam.TAttribute;
import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TClassMember;
import cl.uchile.pleiad.textRam.TCombinedFragment;
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
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TTemporaryProperty;
import cl.uchile.pleiad.textRam.TTypedElement;
import cl.uchile.pleiad.textRam.TValueSpecification;
import cl.uchile.pleiad.textRam.TextRamFactory;
import cl.uchile.pleiad.transform.ITextRAMTransform;
import cl.uchile.pleiad.util.TextRamEcoreUtil;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
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
    this.transformMessageViews(ramAspect, textRamAspect);
    return textRamAspect;
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
    final Procedure1<AbstractMessageView> _function = new Procedure1<AbstractMessageView>() {
      public void apply(final AbstractMessageView mv) {
        EList<TAbstractMessages> _messages = tAbstractMessageView.getMessages();
        TAbstractMessages _transformedMessage = TextRAMTransform.this.getTransformedMessage(mv, to);
        _messages.add(_transformedMessage);
      }
    };
    IterableExtensions.<AbstractMessageView>forEach(_messageViews_1, _function);
    return tAbstractMessageView;
  }
  
  private TAbstractMessages _getTransformedMessage(final AspectMessageView from, final TAspect to) {
    final TAspectMessageView res = TextRamFactory.eINSTANCE.createTAspectMessageView();
    String _name = from.getName();
    res.setName(_name);
    Operation _pointcut = from.getPointcut();
    TClass _classFromPointCut = this.getClassFromPointCut(_pointcut, to);
    res.setClass(_classFromPointCut);
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
  
  private List<TInteraction> getTextRamInteractions(final Interaction interaction, final TAspect to) {
    final List<TInteraction> res = CollectionLiterals.<TInteraction>newArrayList();
    EList<InteractionFragment> _fragments = interaction.getFragments();
    final Procedure1<InteractionFragment> _function = new Procedure1<InteractionFragment>() {
      public void apply(final InteractionFragment f) {
        EList<InteractionFragment> _fragments = interaction.getFragments();
        TInteraction _transformedFragment = TextRAMTransform.this.getTransformedFragment(f, _fragments, to);
        res.add(_transformedFragment);
      }
    };
    IterableExtensions.<InteractionFragment>forEach(_fragments, _function);
    return res;
  }
  
  private TInteraction _getTransformedFragment(final MessageOccurrenceSpecification from, final EList<InteractionFragment> fragments, final TAspect to) {
    final TInteractionMessage res = TextRamFactory.eINSTANCE.createTInteractionMessage();
    EList<AbstractMessageView> _messageViews = to.getMessageViews();
    Iterable<TAbstractMessageView> _filter = Iterables.<TAbstractMessageView>filter(_messageViews, TAbstractMessageView.class);
    TAbstractMessageView _get = ((TAbstractMessageView[])Conversions.unwrapArray(_filter, TAbstractMessageView.class))[0];
    final EList<TLifeline> tLifelines = _get.getLifelines();
    Iterable<MessageOccurrenceSpecification> _filter_1 = Iterables.<MessageOccurrenceSpecification>filter(fragments, MessageOccurrenceSpecification.class);
    final Function1<MessageOccurrenceSpecification,Boolean> _function = new Function1<MessageOccurrenceSpecification,Boolean>() {
      public Boolean apply(final MessageOccurrenceSpecification f) {
        Message _message = f.getMessage();
        Operation _signature = _message.getSignature();
        String _name = _signature.getName();
        Message _message_1 = from.getMessage();
        Operation _signature_1 = _message_1.getSignature();
        String _name_1 = _signature_1.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    final Iterable<MessageOccurrenceSpecification> pair = IterableExtensions.<MessageOccurrenceSpecification>filter(_filter_1, _function);
    int _size = IterableExtensions.size(pair);
    boolean _equals = (_size == 2);
    if (_equals) {
      MessageOccurrenceSpecification _get_1 = ((MessageOccurrenceSpecification[])Conversions.unwrapArray(pair, MessageOccurrenceSpecification.class))[0];
      TLifeline _tLifelineFrom = this.getTLifelineFrom(_get_1, tLifelines);
      res.setLeftLifeline(_tLifelineFrom);
      MessageOccurrenceSpecification _get_2 = ((MessageOccurrenceSpecification[])Conversions.unwrapArray(pair, MessageOccurrenceSpecification.class))[1];
      TLifeline _tLifelineFrom_1 = this.getTLifelineFrom(_get_2, tLifelines);
      res.setRightLifeline(_tLifelineFrom_1);
      Message _message = from.getMessage();
      TMessage _transformedTMessageFrom = this.getTransformedTMessageFrom(_message, to);
      res.setMessage(_transformedTMessageFrom);
    }
    return res;
  }
  
  private TMessage getTransformedTMessageFrom(final Message message, final TAspect to) {
    final TMessage res = TextRamFactory.eINSTANCE.createTMessage();
    Operation _signature = message.getSignature();
    EObject _eContainer = _signature.eContainer();
    String _name = ((ca.mcgill.cs.sel.ram.Class) _eContainer).getName();
    final TClass clazz = this.textRamEcoreUtil.findClass(to, _name);
    StructuralFeature _assignTo = message.getAssignTo();
    TMessageAssignableFeature _assignToFrom = this.getAssignToFrom(_assignTo, to, clazz);
    res.setAssignTo(_assignToFrom);
    Operation _signature_1 = message.getSignature();
    final TOperation tOperation = TextRamEcoreUtil.findTextRamOperation(clazz, _signature_1);
    res.setSignature(tOperation);
    EList<TValueSpecification> _arguments = res.getArguments();
    List<TValueSpecification> _messagesArguments = this.getMessagesArguments(message, to, tOperation);
    _arguments.addAll(_messagesArguments);
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
    final Function1<TLifeline,Boolean> _function = new Function1<TLifeline,Boolean>() {
      public Boolean apply(final TLifeline l) {
        String _name = l.getName();
        String _name_1 = feature.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    TLifeline res = IterableExtensions.<TLifeline>findFirst(_lifelines, _function);
    boolean _equals = Objects.equal(res, null);
    if (_equals) {
      EList<TLifeline> _lifelines_1 = mv.getLifelines();
      final Function1<TLifeline,Boolean> _function_1 = new Function1<TLifeline,Boolean>() {
        public Boolean apply(final TLifeline l) {
          TTypedElement _represents = l.getRepresents();
          String _nameFromRepresents = TextRAMTransform.this.getNameFromRepresents(_represents);
          String _name = feature.getName();
          return Boolean.valueOf(Objects.equal(_nameFromRepresents, _name));
        }
      };
      TLifeline _findFirst = IterableExtensions.<TLifeline>findFirst(_lifelines_1, _function_1);
      res = _findFirst;
    }
    return res;
  }
  
  private TLifeline getTLifelineFrom(final MessageOccurrenceSpecification messageOcurrence, final EList<TLifeline> list) {
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
  
  private TInteraction _getTransformedFragment(final OccurrenceSpecification from, final EList<InteractionFragment> fragments, final TAspect to) {
    final TOcurrence res = TextRamFactory.eINSTANCE.createTOcurrence();
    return res;
  }
  
  private TInteraction _getTransformedFragment(final CombinedFragment from, final EList<InteractionFragment> fragments, final TAspect to) {
    final TCombinedFragment res = TextRamFactory.eINSTANCE.createTCombinedFragment();
    return res;
  }
  
  private TInteraction _getTransformedFragment(final ExecutionStatement from, final EList<InteractionFragment> fragments, final TAspect to) {
    final TCombinedFragment res = TextRamFactory.eINSTANCE.createTCombinedFragment();
    return res;
  }
  
  private TClass getClassFromPointCut(final Operation operation, final TAspect to) {
    EObject _eContainer = operation.eContainer();
    final ca.mcgill.cs.sel.ram.Class clazz = ((ca.mcgill.cs.sel.ram.Class) _eContainer);
    String _name = clazz.getName();
    TClass _findClass = this.textRamEcoreUtil.findClass(to, _name);
    final TClass res = ((TClass) _findClass);
    return res;
  }
  
  private TAbstractMessages _getTransformedMessage(final MessageView from, final TAspect to) {
    TMessageView _createTMessageView = TextRamFactory.eINSTANCE.createTMessageView();
    final Procedure1<TMessageView> _function = new Procedure1<TMessageView>() {
      public void apply(final TMessageView it) {
      }
    };
    final TMessageView res = ObjectExtensions.<TMessageView>operator_doubleArrow(_createTMessageView, _function);
    return res;
  }
  
  private void addLifelinesfrom(final TAbstractMessageView textRamMessageView, final Aspect from, final TAspect to) {
    EList<AbstractMessageView> _messageViews = from.getMessageViews();
    Iterable<AspectMessageView> _filter = Iterables.<AspectMessageView>filter(_messageViews, AspectMessageView.class);
    final Procedure1<AspectMessageView> _function = new Procedure1<AspectMessageView>() {
      public void apply(final AspectMessageView amv) {
        Interaction _advice = amv.getAdvice();
        EList<Lifeline> _lifelines = _advice.getLifelines();
        final Procedure1<Lifeline> _function = new Procedure1<Lifeline>() {
          public void apply(final Lifeline l) {
            EList<TLifeline> _lifelines = textRamMessageView.getLifelines();
            TLifeline _transformedLifeline = TextRAMTransform.this.getTransformedLifeline(l, to);
            _lifelines.add(_transformedLifeline);
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
              EList<TLifeline> _lifelines = textRamMessageView.getLifelines();
              TLifeline _transformedLifeline = TextRAMTransform.this.getTransformedLifeline(l, to);
              _lifelines.add(_transformedLifeline);
            }
          };
          IterableExtensions.<Lifeline>forEach(_lifelines, _function);
        }
      }
    };
    IterableExtensions.<MessageView>forEach(_filter_1, _function_1);
  }
  
  private TLifeline getTransformedLifeline(final Lifeline from, final TAspect to) {
    final TLifeline res = TextRamFactory.eINSTANCE.createTLifeline();
    TypedElement _represents = from.getRepresents();
    TTypedElement _representsFrom = this.getRepresentsFrom(_represents, to);
    res.setRepresents(_representsFrom);
    String _nameFromLifeline = this.getNameFromLifeline(from);
    res.setName(_nameFromLifeline);
    TypedElement _represents_1 = from.getRepresents();
    TLifelineReferenceType _referenceTypeFrom = this.getReferenceTypeFrom(_represents_1);
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
        TTemporaryProperty _localProperty = TextRAMTransform.this.getLocalProperty(lp, to);
        res.add(_localProperty);
      }
    };
    IterableExtensions.<TemporaryProperty>forEach(_localProperties, _function);
    return res;
  }
  
  private TTemporaryProperty _getLocalProperty(final Reference from, final TAspect to) {
    ObjectType _type = from.getType();
    if ((_type instanceof ca.mcgill.cs.sel.ram.Class)) {
      ObjectType _type_1 = from.getType();
      return this.transformLocalPropertyFromReference(((ca.mcgill.cs.sel.ram.Class) _type_1), to);
    }
    ObjectType _type_2 = from.getType();
    if ((_type_2 instanceof RSet)) {
      ObjectType _type_3 = from.getType();
      final RSet rSet = ((RSet) _type_3);
      ObjectType _type_4 = rSet.getType();
      if ((_type_4 instanceof ca.mcgill.cs.sel.ram.Class)) {
        ObjectType _type_5 = rSet.getType();
        return this.transformLocalPropertyFromReference(((ca.mcgill.cs.sel.ram.Class) _type_5), to);
      } else {
        ObjectType _type_6 = from.getType();
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
  
  private TTemporaryProperty transformLocalPropertyFromReference(final ca.mcgill.cs.sel.ram.Class clazz, final TAspect aspect) {
    String _name = clazz.getName();
    final TClass tClass = this.textRamEcoreUtil.findClass(aspect, _name);
    TReference _createTReference = TextRamFactory.eINSTANCE.createTReference();
    final Procedure1<TReference> _function = new Procedure1<TReference>() {
      public void apply(final TReference it) {
        String _name = clazz.getName();
        it.setName(_name);
        boolean _isPartial = tClass.isPartial();
        it.setPartialClass(_isPartial);
        it.setReference(tClass);
      }
    };
    final TReference res = ObjectExtensions.<TReference>operator_doubleArrow(_createTReference, _function);
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
    TTypedElement _represents = tLifeline.getRepresents();
    return this.getNameFromRepresents(_represents);
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
  
  private TTypedElement _getRepresentsFrom(final AssociationEnd from, final Aspect to) {
    String _name = from.getName();
    return this.textRamEcoreUtil.getTAssociation(to, _name);
  }
  
  private TTypedElement _getRepresentsFrom(final Reference from, final Aspect to) {
    StructuralView _structuralView = to.getStructuralView();
    String _name = from.getName();
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
        String _name_1 = from.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<TAttribute>findFirst(_filter_1, _function_1);
  }
  
  private TTypedElement _getRepresentsFrom(final Parameter from, final Aspect to) {
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
        String _name = from.getName();
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
    AssociationEnd _get_1 = _ends_1.get(0);
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
  
  private TInteraction getTransformedFragment(final InteractionFragment from, final EList<InteractionFragment> fragments, final TAspect to) {
    if (from instanceof MessageOccurrenceSpecification) {
      return _getTransformedFragment((MessageOccurrenceSpecification)from, fragments, to);
    } else if (from instanceof CombinedFragment) {
      return _getTransformedFragment((CombinedFragment)from, fragments, to);
    } else if (from instanceof ExecutionStatement) {
      return _getTransformedFragment((ExecutionStatement)from, fragments, to);
    } else if (from instanceof OccurrenceSpecification) {
      return _getTransformedFragment((OccurrenceSpecification)from, fragments, to);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(from, fragments, to).toString());
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
}
