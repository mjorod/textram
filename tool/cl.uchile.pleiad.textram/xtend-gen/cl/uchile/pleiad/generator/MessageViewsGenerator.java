package cl.uchile.pleiad.generator;

import ca.mcgill.cs.sel.ram.AbstractMessageView;
import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.AspectMessageView;
import ca.mcgill.cs.sel.ram.AssociationEnd;
import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.CombinedFragment;
import ca.mcgill.cs.sel.ram.FragmentContainer;
import ca.mcgill.cs.sel.ram.Gate;
import ca.mcgill.cs.sel.ram.Interaction;
import ca.mcgill.cs.sel.ram.InteractionFragment;
import ca.mcgill.cs.sel.ram.InteractionOperand;
import ca.mcgill.cs.sel.ram.InteractionOperatorKind;
import ca.mcgill.cs.sel.ram.Lifeline;
import ca.mcgill.cs.sel.ram.Message;
import ca.mcgill.cs.sel.ram.MessageOccurrenceSpecification;
import ca.mcgill.cs.sel.ram.MessageSort;
import ca.mcgill.cs.sel.ram.MessageView;
import ca.mcgill.cs.sel.ram.OpaqueExpression;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.OriginalBehaviorExecution;
import ca.mcgill.cs.sel.ram.Parameter;
import ca.mcgill.cs.sel.ram.ParameterValue;
import ca.mcgill.cs.sel.ram.ParameterValueMapping;
import ca.mcgill.cs.sel.ram.PrimitiveType;
import ca.mcgill.cs.sel.ram.RamFactory;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.cs.sel.ram.Reference;
import ca.mcgill.cs.sel.ram.StructuralFeature;
import ca.mcgill.cs.sel.ram.StructuralFeatureValue;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.TemporaryProperty;
import ca.mcgill.cs.sel.ram.Type;
import ca.mcgill.cs.sel.ram.TypedElement;
import ca.mcgill.cs.sel.ram.ValueSpecification;
import cl.uchile.pleiad.textRam.TAbstractMessageView;
import cl.uchile.pleiad.textRam.TAbstractMessages;
import cl.uchile.pleiad.textRam.TAspectMessageView;
import cl.uchile.pleiad.textRam.TAssociation;
import cl.uchile.pleiad.textRam.TAssociationEnd;
import cl.uchile.pleiad.textRam.TAttribute;
import cl.uchile.pleiad.textRam.TClass;
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
import cl.uchile.pleiad.textRam.TReturnInteraction;
import cl.uchile.pleiad.textRam.TTemporaryProperty;
import cl.uchile.pleiad.textRam.TTypedElement;
import cl.uchile.pleiad.textRam.TValueSpecification;
import cl.uchile.pleiad.textRam.TextRamPackage;
import cl.uchile.pleiad.util.TextRamEcoreUtil;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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
public class MessageViewsGenerator {
  private Aspect textRamAspect;
  
  private Aspect ramAspect;
  
  public MessageViewsGenerator(final Aspect from, final Aspect to) {
    this.textRamAspect = from;
    this.ramAspect = to;
    EList<AbstractMessageView> _messageViews = this.textRamAspect.getMessageViews();
    int _size = _messageViews.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      final EList<TAbstractMessages> textRamMessages = this.getTextRamMessages();
      Iterable<TAspectMessageView> _filter = Iterables.<TAspectMessageView>filter(textRamMessages, TAspectMessageView.class);
      final Procedure1<TAspectMessageView> _function = new Procedure1<TAspectMessageView>() {
        public void apply(final TAspectMessageView m) {
          EList<AbstractMessageView> _messageViews = MessageViewsGenerator.this.ramAspect.getMessageViews();
          AbstractMessageView _generateMessageView = MessageViewsGenerator.this.generateMessageView(m);
          _messageViews.add(_generateMessageView);
        }
      };
      IterableExtensions.<TAspectMessageView>forEach(_filter, _function);
      Iterable<TMessageView> _filter_1 = Iterables.<TMessageView>filter(textRamMessages, TMessageView.class);
      final Procedure1<TMessageView> _function_1 = new Procedure1<TMessageView>() {
        public void apply(final TMessageView m) {
          EList<AbstractMessageView> _messageViews = MessageViewsGenerator.this.ramAspect.getMessageViews();
          AbstractMessageView _generateMessageView = MessageViewsGenerator.this.generateMessageView(m);
          _messageViews.add(_generateMessageView);
        }
      };
      IterableExtensions.<TMessageView>forEach(_filter_1, _function_1);
    }
  }
  
  public EList<AbstractMessageView> getMessagesView() {
    return this.ramAspect.getMessageViews();
  }
  
  private EList<TAbstractMessages> getTextRamMessages() {
    EList<AbstractMessageView> _messageViews = this.textRamAspect.getMessageViews();
    AbstractMessageView _head = IterableExtensions.<AbstractMessageView>head(_messageViews);
    return ((TAbstractMessageView) _head).getMessages();
  }
  
  private AbstractMessageView _generateMessageView(final TAspectMessageView textRamAspectMessageView) {
    AspectMessageView _xblockexpression = null;
    {
      AspectMessageView _createAspectMessageView = RamFactory.eINSTANCE.createAspectMessageView();
      final Procedure1<AspectMessageView> _function = new Procedure1<AspectMessageView>() {
        public void apply(final AspectMessageView it) {
          String _name = textRamAspectMessageView.getName();
          it.setName(_name);
          Operation _generatePointcut = MessageViewsGenerator.this.generatePointcut(textRamAspectMessageView);
          it.setPointcut(_generatePointcut);
          Interaction _createInteraction = MessageViewsGenerator.this.createInteraction(textRamAspectMessageView);
          it.setAdvice(_createInteraction);
        }
      };
      AspectMessageView result = ObjectExtensions.<AspectMessageView>operator_doubleArrow(_createAspectMessageView, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private AbstractMessageView _generateMessageView(final TMessageView textRamMessage) {
    MessageView _xblockexpression = null;
    {
      MessageView _createMessageView = RamFactory.eINSTANCE.createMessageView();
      final Procedure1<MessageView> _function = new Procedure1<MessageView>() {
        public void apply(final MessageView it) {
          Operation _generateSpecifies = MessageViewsGenerator.this.generateSpecifies(textRamMessage);
          it.setSpecifies(_generateSpecifies);
          Interaction _createInteraction = MessageViewsGenerator.this.createInteraction(textRamMessage);
          it.setSpecification(_createInteraction);
          EList<AspectMessageView> _affectedBy = it.getAffectedBy();
          List<AspectMessageView> _generateAffectedBy = MessageViewsGenerator.this.generateAffectedBy(textRamMessage);
          _affectedBy.addAll(_generateAffectedBy);
        }
      };
      MessageView result = ObjectExtensions.<MessageView>operator_doubleArrow(_createMessageView, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public List<AspectMessageView> generateAffectedBy(final TMessageView textRamMessageView) {
    List<AspectMessageView> _xblockexpression = null;
    {
      final List<AspectMessageView> result = CollectionLiterals.<AspectMessageView>newArrayList();
      EList<TAspectMessageView> _affectedBy = textRamMessageView.getAffectedBy();
      final Procedure1<TAspectMessageView> _function = new Procedure1<TAspectMessageView>() {
        public void apply(final TAspectMessageView textRamAspectMessage) {
          EList<AbstractMessageView> _messageViews = MessageViewsGenerator.this.ramAspect.getMessageViews();
          Iterable<AspectMessageView> _filter = Iterables.<AspectMessageView>filter(_messageViews, AspectMessageView.class);
          final Function1<AspectMessageView,Boolean> _function = new Function1<AspectMessageView,Boolean>() {
            public Boolean apply(final AspectMessageView m) {
              String _name = m.getName();
              String _name_1 = textRamAspectMessage.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          AspectMessageView _findFirst = IterableExtensions.<AspectMessageView>findFirst(_filter, _function);
          result.add(_findFirst);
        }
      };
      IterableExtensions.<TAspectMessageView>forEach(_affectedBy, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private Operation generateSpecifies(final TMessageView textRamMessage) {
    Operation _xblockexpression = null;
    {
      final Operation result = this.findOperationWithSameSignature(textRamMessage);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private Operation generatePointcut(final TAspectMessageView textRamAspectMessageView) {
    Operation _xblockexpression = null;
    {
      Operation result = null;
      final TClass veryDumbClass_ = textRamAspectMessageView.getClass_();
      boolean _notEquals = (!Objects.equal(veryDumbClass_, null));
      if (_notEquals) {
        TClass _class_ = textRamAspectMessageView.getClass_();
        String _name = _class_.getName();
        final ca.mcgill.cs.sel.ram.Class clazz = this.findClass(this.ramAspect, _name);
        EList<Operation> _operations = clazz.getOperations();
        final Function1<Operation,Boolean> _function = new Function1<Operation,Boolean>() {
          public Boolean apply(final Operation o) {
            String _name = o.getName();
            TOperation _specifies = textRamAspectMessageView.getSpecifies();
            String _name_1 = _specifies.getName();
            return Boolean.valueOf(Objects.equal(_name, _name_1));
          }
        };
        Operation _findFirst = IterableExtensions.<Operation>findFirst(_operations, _function);
        result = _findFirst;
      } else {
        Operation _findOperationWithSameSignature = this.findOperationWithSameSignature(textRamAspectMessageView);
        result = _findOperationWithSameSignature;
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private Operation getMessageSignature(final TMessage message) {
    final TOperation textRamOperation = message.getSignature();
    final List<Operation> classOperations = CollectionLiterals.<Operation>newArrayList();
    final EList<TValueSpecification> arguments = message.getArguments();
    StructuralView _structuralView = this.ramAspect.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    final Function1<Classifier,EList<Operation>> _function = new Function1<Classifier,EList<Operation>>() {
      public EList<Operation> apply(final Classifier it) {
        return it.getOperations();
      }
    };
    List<EList<Operation>> _map = ListExtensions.<Classifier, EList<Operation>>map(_classes, _function);
    Iterable<Operation> _flatten = Iterables.<Operation>concat(_map);
    final Function1<Operation,Boolean> _function_1 = new Function1<Operation,Boolean>() {
      public Boolean apply(final Operation a) {
        String _name = a.getName();
        String _name_1 = textRamOperation.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    Iterable<Operation> _filter = IterableExtensions.<Operation>filter(_flatten, _function_1);
    Iterables.<Operation>addAll(classOperations, _filter);
    for (final Operation o : classOperations) {
      EList<Parameter> _parameters = o.getParameters();
      int _length = ((Object[])Conversions.unwrapArray(_parameters, Object.class)).length;
      int _length_1 = ((Object[])Conversions.unwrapArray(arguments, Object.class)).length;
      boolean _equals = (_length == _length_1);
      if (_equals) {
        boolean matchParameterType = true;
        try {
          boolean _and = false;
          EList<Parameter> _parameters_1 = o.getParameters();
          boolean _isEmpty = _parameters_1.isEmpty();
          boolean _equals_1 = (_isEmpty == false);
          if (!_equals_1) {
            _and = false;
          } else {
            boolean _isEmpty_1 = arguments.isEmpty();
            boolean _equals_2 = (_isEmpty_1 == false);
            _and = _equals_2;
          }
          if (_and) {
            EList<Parameter> _parameters_2 = o.getParameters();
            int _size = _parameters_2.size();
            int _minus = (_size - 1);
            IntegerRange _upTo = new IntegerRange(0, _minus);
            for (final Integer i : _upTo) {
              EList<Parameter> _parameters_3 = o.getParameters();
              Parameter _get = _parameters_3.get((i).intValue());
              Type _type = _get.getType();
              String _name = _type.getName();
              TValueSpecification _get_1 = arguments.get((i).intValue());
              String _typeNameForTValueSpecification = this.getTypeNameForTValueSpecification(_get_1);
              boolean _equals_3 = Objects.equal(_name, _typeNameForTValueSpecification);
              boolean _equals_4 = (_equals_3 == false);
              if (_equals_4) {
                matchParameterType = false;
              }
            }
          }
          if ((matchParameterType == true)) {
            return o;
          }
        } catch (final Throwable _t) {
          if (_t instanceof NullPointerException) {
            final NullPointerException e = (NullPointerException)_t;
            String m = e.getMessage();
            m = m;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    }
    return null;
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
  
  private Operation findOperationWithSameSignature(final TAbstractMessages from) {
    final TOperation operation = from.getSpecifies();
    ca.mcgill.cs.sel.ram.Class clazz = null;
    TClass _class_ = from.getClass_();
    boolean _notEquals = (!Objects.equal(_class_, null));
    if (_notEquals) {
      TClass _class__1 = from.getClass_();
      String _name = _class__1.getName();
      ca.mcgill.cs.sel.ram.Class _findClass = this.findClass(this.ramAspect, _name);
      clazz = _findClass;
    }
    final List<Operation> classOperations = CollectionLiterals.<Operation>newArrayList();
    final EList<TParameter> arguments = from.getArguments();
    boolean _notEquals_1 = (!Objects.equal(clazz, null));
    if (_notEquals_1) {
      String _name_1 = operation.getName();
      List<Operation> _findOperations = TextRamEcoreUtil.findOperations(clazz, _name_1);
      classOperations.addAll(_findOperations);
    } else {
      StructuralView _structuralView = this.ramAspect.getStructuralView();
      EList<Classifier> _classes = _structuralView.getClasses();
      final Function1<Classifier,EList<Operation>> _function = new Function1<Classifier,EList<Operation>>() {
        public EList<Operation> apply(final Classifier it) {
          return it.getOperations();
        }
      };
      List<EList<Operation>> _map = ListExtensions.<Classifier, EList<Operation>>map(_classes, _function);
      Iterable<Operation> _flatten = Iterables.<Operation>concat(_map);
      final Function1<Operation,Boolean> _function_1 = new Function1<Operation,Boolean>() {
        public Boolean apply(final Operation a) {
          String _name = a.getName();
          String _name_1 = operation.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      Iterable<Operation> _filter = IterableExtensions.<Operation>filter(_flatten, _function_1);
      Iterables.<Operation>addAll(classOperations, _filter);
    }
    for (final Operation o : classOperations) {
      EList<Parameter> _parameters = o.getParameters();
      int _length = ((Object[])Conversions.unwrapArray(_parameters, Object.class)).length;
      int _length_1 = ((Object[])Conversions.unwrapArray(arguments, Object.class)).length;
      boolean _equals = (_length == _length_1);
      if (_equals) {
        boolean matchParameterType = true;
        boolean _and = false;
        EList<Parameter> _parameters_1 = o.getParameters();
        boolean _isEmpty = _parameters_1.isEmpty();
        boolean _equals_1 = (_isEmpty == false);
        if (!_equals_1) {
          _and = false;
        } else {
          boolean _isEmpty_1 = arguments.isEmpty();
          boolean _equals_2 = (_isEmpty_1 == false);
          _and = _equals_2;
        }
        if (_and) {
          EList<Parameter> _parameters_2 = o.getParameters();
          int _size = _parameters_2.size();
          int _minus = (_size - 1);
          IntegerRange _upTo = new IntegerRange(0, _minus);
          for (final Integer i : _upTo) {
            EList<Parameter> _parameters_3 = o.getParameters();
            Parameter _get = _parameters_3.get((i).intValue());
            Type _type = _get.getType();
            String _name_2 = _type.getName();
            TParameter _get_1 = arguments.get((i).intValue());
            Type _type_1 = _get_1.getType();
            String _name_3 = _type_1.getName();
            boolean _equals_3 = Objects.equal(_name_2, _name_3);
            boolean _equals_4 = (_equals_3 == false);
            if (_equals_4) {
              matchParameterType = false;
            }
          }
        }
        if ((matchParameterType == true)) {
          return o;
        }
      }
    }
    return null;
  }
  
  private Interaction createInteraction(final TAbstractMessages textRamMessage) {
    Interaction _xblockexpression = null;
    {
      EObject _eContainer = textRamMessage.eContainer();
      final TAbstractMessageView objects = ((TAbstractMessageView) _eContainer);
      Interaction _createInteraction = RamFactory.eINSTANCE.createInteraction();
      final Procedure1<Interaction> _function = new Procedure1<Interaction>() {
        public void apply(final Interaction it) {
          EList<Reference> _properties = it.getProperties();
          EList<TLifeline> _lifelines = objects.getLifelines();
          ArrayList<Reference> _generateProperties = MessageViewsGenerator.this.generateProperties(_lifelines);
          _properties.addAll(_generateProperties);
          EList<Lifeline> _lifelines_1 = it.getLifelines();
          EList<TLifeline> _lifelines_2 = objects.getLifelines();
          EList<Reference> _properties_1 = it.getProperties();
          ArrayList<Lifeline> _generateLifelines = MessageViewsGenerator.this.generateLifelines(it, _lifelines_2, _properties_1);
          _lifelines_1.addAll(_generateLifelines);
        }
      };
      final Interaction result = ObjectExtensions.<Interaction>operator_doubleArrow(_createInteraction, _function);
      this.generatesDefaultStartMessage(result, textRamMessage);
      EList<TInteraction> _interactionMessages = textRamMessage.getInteractionMessages();
      final Procedure1<TInteraction> _function_1 = new Procedure1<TInteraction>() {
        public void apply(final TInteraction textRamInteraction) {
          MessageViewsGenerator.this.generateInteractionMessages(textRamInteraction, result, textRamMessage);
        }
      };
      IterableExtensions.<TInteraction>forEach(_interactionMessages, _function_1);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private void _generateInteractionMessages(final TOcurrence textRamOcurrenceMessage, final FragmentContainer fragmentContainer, final TAbstractMessages textRamMessage) {
    final Interaction interaction = ((Interaction) fragmentContainer);
    EList<Lifeline> _lifelines = interaction.getLifelines();
    final Function1<Lifeline,Boolean> _function = new Function1<Lifeline,Boolean>() {
      public Boolean apply(final Lifeline l) {
        TypedElement _represents = l.getRepresents();
        String _name = _represents.getName();
        TLifeline _leftLifeline = textRamOcurrenceMessage.getLeftLifeline();
        String _name_1 = _leftLifeline.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    final Lifeline lifeline = IterableExtensions.<Lifeline>findFirst(_lifelines, _function);
    OriginalBehaviorExecution _createOriginalBehaviorExecution = RamFactory.eINSTANCE.createOriginalBehaviorExecution();
    final Procedure1<OriginalBehaviorExecution> _function_1 = new Procedure1<OriginalBehaviorExecution>() {
      public void apply(final OriginalBehaviorExecution it) {
        EList<Lifeline> _covered = it.getCovered();
        _covered.add(lifeline);
      }
    };
    final OriginalBehaviorExecution originalBehaviourExecution = ObjectExtensions.<OriginalBehaviorExecution>operator_doubleArrow(_createOriginalBehaviorExecution, _function_1);
    EList<InteractionFragment> _fragments = interaction.getFragments();
    _fragments.add(originalBehaviourExecution);
  }
  
  private void _generateInteractionMessages(final TInteractionMessage textRamInteractionMessage, final FragmentContainer fragmentContainer, final TAbstractMessages textRamMessage) {
    final Message message = this.generateMessageOcurrence(textRamInteractionMessage, fragmentContainer);
    this.addMessage(fragmentContainer, message);
  }
  
  private boolean addMessage(final FragmentContainer fragmentContainer, final Message message) {
    boolean _xifexpression = false;
    if ((fragmentContainer instanceof InteractionOperand)) {
      boolean _xblockexpression = false;
      {
        final Interaction rootInteraction = TextRamEcoreUtil.<Interaction>getRootContainerOfType(fragmentContainer, RamPackage.Literals.INTERACTION);
        EList<Message> _messages = rootInteraction.getMessages();
        _xblockexpression = _messages.add(message);
      }
      _xifexpression = _xblockexpression;
    } else {
      EList<Message> _messages = ((Interaction) fragmentContainer).getMessages();
      _xifexpression = _messages.add(message);
    }
    return _xifexpression;
  }
  
  private void _generateInteractionMessages(final TCombinedFragment textRamCombinedFragment, final FragmentContainer fragmentContainer, final TAbstractMessages textRamMessage) {
    CombinedFragment _createCombinedFragment = RamFactory.eINSTANCE.createCombinedFragment();
    final Procedure1<CombinedFragment> _function = new Procedure1<CombinedFragment>() {
      public void apply(final CombinedFragment it) {
        InteractionOperatorKind _interactionOperator = textRamCombinedFragment.getInteractionOperator();
        it.setInteractionOperator(_interactionOperator);
      }
    };
    final CombinedFragment combinedFragment = ObjectExtensions.<CombinedFragment>operator_doubleArrow(_createCombinedFragment, _function);
    EList<InteractionFragment> _fragments = fragmentContainer.getFragments();
    _fragments.add(combinedFragment);
    final InteractionOperand interactionOperand = RamFactory.eINSTANCE.createInteractionOperand();
    EList<InteractionOperand> _operands = combinedFragment.getOperands();
    _operands.add(interactionOperand);
    OpaqueExpression _createOpaqueExpression = RamFactory.eINSTANCE.createOpaqueExpression();
    final Procedure1<OpaqueExpression> _function_1 = new Procedure1<OpaqueExpression>() {
      public void apply(final OpaqueExpression it) {
        String _interactionConstraint = textRamCombinedFragment.getInteractionConstraint();
        it.setBody(_interactionConstraint);
        it.setLanguage("java");
      }
    };
    final OpaqueExpression interactionConstraint = ObjectExtensions.<OpaqueExpression>operator_doubleArrow(_createOpaqueExpression, _function_1);
    interactionOperand.setInteractionConstraint(interactionConstraint);
    EList<TInteraction> _containers = textRamCombinedFragment.getContainers();
    final Procedure1<TInteraction> _function_2 = new Procedure1<TInteraction>() {
      public void apply(final TInteraction fragment) {
        MessageViewsGenerator.this.generateInteractionMessages(fragment, interactionOperand, textRamMessage);
      }
    };
    IterableExtensions.<TInteraction>forEach(_containers, _function_2);
    EList<InteractionOperand> _operands_1 = combinedFragment.getOperands();
    final Function1<InteractionOperand,EList<InteractionFragment>> _function_3 = new Function1<InteractionOperand,EList<InteractionFragment>>() {
      public EList<InteractionFragment> apply(final InteractionOperand it) {
        return it.getFragments();
      }
    };
    List<EList<InteractionFragment>> _map = ListExtensions.<InteractionOperand, EList<InteractionFragment>>map(_operands_1, _function_3);
    Iterable<InteractionFragment> _flatten = Iterables.<InteractionFragment>concat(_map);
    final Procedure1<InteractionFragment> _function_4 = new Procedure1<InteractionFragment>() {
      public void apply(final InteractionFragment fragment) {
        EList<Lifeline> _covered = combinedFragment.getCovered();
        EList<Lifeline> _covered_1 = fragment.getCovered();
        _covered.addAll(_covered_1);
      }
    };
    IterableExtensions.<InteractionFragment>forEach(_flatten, _function_4);
  }
  
  private void _generateInteractionMessages(final TReturnInteraction textRamReturnInteraction, final FragmentContainer fragmentContainer, final TAbstractMessages textRamMessage) {
    final TInteractionMessage prev = TextRamEcoreUtil.<TInteractionMessage>getPrev(textRamReturnInteraction, TextRamPackage.Literals.TINTERACTION_MESSAGE);
    boolean _equals = Objects.equal(prev, null);
    if (_equals) {
      throw new NullPointerException("Previous element of type TInteractionMessage cannot be found");
    }
    final Interaction interaction = ((Interaction) fragmentContainer);
    EList<Lifeline> _lifelines = interaction.getLifelines();
    final Function1<Lifeline,Boolean> _function = new Function1<Lifeline,Boolean>() {
      public Boolean apply(final Lifeline l) {
        TypedElement _represents = l.getRepresents();
        String _name = _represents.getName();
        TLifeline _rightLifeline = prev.getRightLifeline();
        String _name_1 = _rightLifeline.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    final Lifeline lifeLineFrom = IterableExtensions.<Lifeline>findFirst(_lifelines, _function);
    final Lifeline lifeLineTo = this.getFirstLifeline(prev, interaction);
    final MessageOccurrenceSpecification send = RamFactory.eINSTANCE.createMessageOccurrenceSpecification();
    EList<Lifeline> _covered = send.getCovered();
    _covered.add(lifeLineFrom);
    EList<InteractionFragment> _fragments = interaction.getFragments();
    _fragments.add(send);
    final MessageOccurrenceSpecification receive = RamFactory.eINSTANCE.createMessageOccurrenceSpecification();
    EList<Lifeline> _covered_1 = receive.getCovered();
    _covered_1.add(lifeLineTo);
    EList<InteractionFragment> _fragments_1 = interaction.getFragments();
    _fragments_1.add(receive);
    Message _createMessage = RamFactory.eINSTANCE.createMessage();
    final Procedure1<Message> _function_1 = new Procedure1<Message>() {
      public void apply(final Message it) {
        it.setSendEvent(send);
        it.setReceiveEvent(receive);
        it.setMessageSort(MessageSort.REPLY);
        ValueSpecification _messageReturn = MessageViewsGenerator.this.getMessageReturn(textRamReturnInteraction, lifeLineTo);
        it.setReturns(_messageReturn);
      }
    };
    final Message message = ObjectExtensions.<Message>operator_doubleArrow(_createMessage, _function_1);
    send.setMessage(message);
    receive.setMessage(message);
    this.addMessage(fragmentContainer, message);
  }
  
  private Message generateMessageOcurrence(final TInteractionMessage textRamInteractionMessage, final FragmentContainer interaction) {
    try {
      Message _xblockexpression = null;
      {
        final Lifeline lifeLineFrom = this.getLifelineFrom(interaction, textRamInteractionMessage);
        final Lifeline lifeLineTo = this.getLifelineTo(interaction, textRamInteractionMessage);
        TMessage _message = textRamInteractionMessage.getMessage();
        final Operation operation = this.getMessageSignature(_message);
        boolean _equals = Objects.equal(operation, null);
        if (_equals) {
          TMessage _message_1 = textRamInteractionMessage.getMessage();
          TOperation _signature = ((TMessage) _message_1).getSignature();
          String _name = _signature.getName();
          String _plus = ("Operation: " + _name);
          String _plus_1 = (_plus + " not founded in ");
          String _name_1 = this.textRamAspect.getName();
          String _plus_2 = (_plus_1 + _name_1);
          throw new Exception(_plus_2);
        }
        final MessageOccurrenceSpecification send = RamFactory.eINSTANCE.createMessageOccurrenceSpecification();
        EList<Lifeline> _covered = send.getCovered();
        _covered.add(lifeLineFrom);
        EList<InteractionFragment> _fragments = interaction.getFragments();
        _fragments.add(send);
        final MessageOccurrenceSpecification receive = RamFactory.eINSTANCE.createMessageOccurrenceSpecification();
        EList<Lifeline> _covered_1 = receive.getCovered();
        _covered_1.add(lifeLineTo);
        EList<InteractionFragment> _fragments_1 = interaction.getFragments();
        _fragments_1.add(receive);
        Message _createMessage = RamFactory.eINSTANCE.createMessage();
        final Procedure1<Message> _function = new Procedure1<Message>() {
          public void apply(final Message it) {
            it.setSendEvent(send);
            it.setReceiveEvent(receive);
            it.setSignature(operation);
            EList<ParameterValueMapping> _arguments = it.getArguments();
            TMessage _message = textRamInteractionMessage.getMessage();
            List<ParameterValueMapping> _generateArguments = MessageViewsGenerator.this.generateArguments(((TMessage) _message), operation, lifeLineTo);
            _arguments.addAll(_generateArguments);
          }
        };
        final Message message = ObjectExtensions.<Message>operator_doubleArrow(_createMessage, _function);
        TMessage _message_2 = textRamInteractionMessage.getMessage();
        if ((_message_2 instanceof TMessage)) {
          TMessage _message_3 = textRamInteractionMessage.getMessage();
          TMessageAssignableFeature _assignTo = ((TMessage) _message_3).getAssignTo();
          boolean _notEquals = (!Objects.equal(_assignTo, null));
          if (_notEquals) {
            TMessage _message_4 = textRamInteractionMessage.getMessage();
            StructuralFeature _generateAssignTo = this.generateAssignTo(((TMessage) _message_4), lifeLineTo);
            message.setAssignTo(_generateAssignTo);
          }
        }
        boolean _isCreate = textRamInteractionMessage.isCreate();
        boolean _equals_1 = (_isCreate == true);
        if (_equals_1) {
          message.setMessageSort(MessageSort.CREATE_MESSAGE);
        }
        send.setMessage(message);
        receive.setMessage(message);
        _xblockexpression = message;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public StructuralFeature generateAssignTo(final TMessage textRamMessage, final Lifeline lifeline) {
    StructuralFeature result = null;
    TMessageAssignableFeature _assignTo = textRamMessage.getAssignTo();
    boolean _notEquals = (!Objects.equal(_assignTo, null));
    if (_notEquals) {
      TMessageAssignableFeature _assignTo_1 = textRamMessage.getAssignTo();
      if ((_assignTo_1 instanceof TAssociation)) {
        TMessageAssignableFeature _assignTo_2 = textRamMessage.getAssignTo();
        StructuralFeature _createStructuralFeature = this.createStructuralFeature(((TAssociation) _assignTo_2), lifeline);
        result = _createStructuralFeature;
      } else {
        TMessageAssignableFeature _assignTo_3 = textRamMessage.getAssignTo();
        if ((_assignTo_3 instanceof TLifeline)) {
          TMessageAssignableFeature _assignTo_4 = textRamMessage.getAssignTo();
          StructuralFeature _createStructuralFeature_1 = this.createStructuralFeature(((TLifeline) _assignTo_4), lifeline);
          result = _createStructuralFeature_1;
        } else {
          TMessageAssignableFeature _assignTo_5 = textRamMessage.getAssignTo();
          StructuralFeature _createStructuralFeature_2 = this.createStructuralFeature(_assignTo_5, lifeline);
          result = _createStructuralFeature_2;
        }
      }
    }
    return result;
  }
  
  private Reference getReferenceFromLifeline(final TReference tReference, final Lifeline lifeline) {
    EList<TemporaryProperty> _localProperties = lifeline.getLocalProperties();
    Iterable<Reference> _filter = Iterables.<Reference>filter(_localProperties, Reference.class);
    final Function1<Reference,Boolean> _function = new Function1<Reference,Boolean>() {
      public Boolean apply(final Reference r) {
        String _name = r.getName();
        String _name_1 = tReference.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<Reference>findFirst(_filter, _function);
  }
  
  private Attribute getLocalPropertyFromLifeline(final TLocalAttribute tLocalAttribute, final Lifeline lifeline) {
    EList<TemporaryProperty> _localProperties = lifeline.getLocalProperties();
    Iterable<Attribute> _filter = Iterables.<Attribute>filter(_localProperties, Attribute.class);
    final Function1<Attribute,Boolean> _function = new Function1<Attribute,Boolean>() {
      public Boolean apply(final Attribute a) {
        String _name = a.getName();
        String _name_1 = tLocalAttribute.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<Attribute>findFirst(_filter, _function);
  }
  
  private Reference getLifelineFromSibiling(final TLifeline tLifeline, final Lifeline lifeline) {
    EObject _eContainer = lifeline.eContainer();
    EList<Reference> _properties = ((Interaction) _eContainer).getProperties();
    final Function1<Reference,Boolean> _function = new Function1<Reference,Boolean>() {
      public Boolean apply(final Reference p) {
        String _name = p.getName();
        String _name_1 = tLifeline.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<Reference>findFirst(_properties, _function);
  }
  
  private StructuralFeature _createStructuralFeature(final TAssociation feature, final Lifeline lifeline) {
    AssociationEnd _xblockexpression = null;
    {
      String _name = feature.getName();
      final AssociationEnd result = this.findAssociationEnd(this.ramAspect, _name);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private StructuralFeature _createStructuralFeature(final TReference feature, final Lifeline lifeline) {
    Reference _xblockexpression = null;
    {
      final Reference result = this.getReferenceFromLifeline(feature, lifeline);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private StructuralFeature _createStructuralFeature(final TLocalAttribute feature, final Lifeline lifeline) {
    Attribute _xblockexpression = null;
    {
      final Attribute result = this.getLocalPropertyFromLifeline(feature, lifeline);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private StructuralFeature _createStructuralFeature(final TLifeline tLifeline, final Lifeline lifeline) {
    Reference _xblockexpression = null;
    {
      final Reference represents = this.getLifelineFromSibiling(tLifeline, lifeline);
      final Reference result = represents;
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private ValueSpecification _createValueSpecification(final TReference feature, final Lifeline lifeline) {
    final Reference structuralFeature = this.getReferenceFromLifeline(feature, lifeline);
    StructuralFeatureValue _createStructuralFeatureValue = RamFactory.eINSTANCE.createStructuralFeatureValue();
    final Procedure1<StructuralFeatureValue> _function = new Procedure1<StructuralFeatureValue>() {
      public void apply(final StructuralFeatureValue it) {
        it.setValue(structuralFeature);
      }
    };
    final StructuralFeatureValue structuralFeautreValue = ObjectExtensions.<StructuralFeatureValue>operator_doubleArrow(_createStructuralFeatureValue, _function);
    return structuralFeautreValue;
  }
  
  private ValueSpecification _createValueSpecification(final TLocalAttribute feature, final Lifeline lifeline) {
    final Attribute structuralFeature = this.getLocalPropertyFromLifeline(feature, lifeline);
    StructuralFeatureValue _createStructuralFeatureValue = RamFactory.eINSTANCE.createStructuralFeatureValue();
    final Procedure1<StructuralFeatureValue> _function = new Procedure1<StructuralFeatureValue>() {
      public void apply(final StructuralFeatureValue it) {
        it.setValue(structuralFeature);
      }
    };
    final StructuralFeatureValue structuralFeautreValue = ObjectExtensions.<StructuralFeatureValue>operator_doubleArrow(_createStructuralFeatureValue, _function);
    return structuralFeautreValue;
  }
  
  private ValueSpecification _createValueSpecification(final TLifeline tLifeline, final Lifeline lifeline) {
    final Reference structuralFeature = this.getLifelineFromSibiling(tLifeline, lifeline);
    StructuralFeatureValue _createStructuralFeatureValue = RamFactory.eINSTANCE.createStructuralFeatureValue();
    final Procedure1<StructuralFeatureValue> _function = new Procedure1<StructuralFeatureValue>() {
      public void apply(final StructuralFeatureValue it) {
        it.setValue(structuralFeature);
      }
    };
    final StructuralFeatureValue structuralFeautreValue = ObjectExtensions.<StructuralFeatureValue>operator_doubleArrow(_createStructuralFeatureValue, _function);
    return structuralFeautreValue;
  }
  
  private List<ParameterValueMapping> _generateArguments(final TAbstractMessages tMessage, final Operation operation, final Lifeline lifeline) {
    List<ParameterValueMapping> _xblockexpression = null;
    {
      final List<ParameterValueMapping> result = CollectionLiterals.<ParameterValueMapping>newArrayList();
      EList<Parameter> _parameters = operation.getParameters();
      boolean _isEmpty = _parameters.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (_equals) {
        EList<Parameter> _parameters_1 = operation.getParameters();
        int _length = ((Object[])Conversions.unwrapArray(_parameters_1, Object.class)).length;
        int _minus = (_length - 1);
        IntegerRange _upTo = new IntegerRange(0, _minus);
        for (final Integer i : _upTo) {
          EList<Parameter> _parameters_2 = operation.getParameters();
          Parameter _get = _parameters_2.get((i).intValue());
          EList<TParameter> _arguments = tMessage.getArguments();
          TParameter _get_1 = _arguments.get((i).intValue());
          ParameterValueMapping _createParameterValueMapping = this.createParameterValueMapping(_get, _get_1, lifeline);
          result.add(_createParameterValueMapping);
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private List<ParameterValueMapping> _generateArguments(final TMessage tMessage, final Operation operation, final Lifeline lifeline) {
    List<ParameterValueMapping> _xblockexpression = null;
    {
      final List<ParameterValueMapping> result = CollectionLiterals.<ParameterValueMapping>newArrayList();
      EList<Parameter> _parameters = operation.getParameters();
      boolean _isEmpty = _parameters.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (_equals) {
        EList<Parameter> _parameters_1 = operation.getParameters();
        int _length = ((Object[])Conversions.unwrapArray(_parameters_1, Object.class)).length;
        int _minus = (_length - 1);
        IntegerRange _upTo = new IntegerRange(0, _minus);
        for (final Integer i : _upTo) {
          EList<Parameter> _parameters_2 = operation.getParameters();
          Parameter _get = _parameters_2.get((i).intValue());
          EList<TValueSpecification> _arguments = tMessage.getArguments();
          TValueSpecification _get_1 = _arguments.get((i).intValue());
          ParameterValueMapping _createParameterValueMapping = this.createParameterValueMapping(_get, _get_1, lifeline);
          result.add(_createParameterValueMapping);
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private Message generatesDefaultStartMessage(final Interaction interaction, final TAbstractMessages messageView) {
    try {
      Message _xblockexpression = null;
      {
        boolean _and = false;
        if (!(messageView instanceof TMessageView)) {
          _and = false;
        } else {
          EList<TAspectMessageView> _affectedBy = ((TMessageView) messageView).getAffectedBy();
          boolean _notEquals = (!Objects.equal(_affectedBy, null));
          _and = _notEquals;
        }
        if (_and) {
          return null;
        }
        EList<TInteraction> _interactionMessages = messageView.getInteractionMessages();
        TInteraction _head = IterableExtensions.<TInteraction>head(_interactionMessages);
        final Lifeline lifeLineTo = this.getFirstLifeline(_head, interaction);
        Operation operation = null;
        TClass _class_ = messageView.getClass_();
        boolean _notEquals_1 = (!Objects.equal(_class_, null));
        if (_notEquals_1) {
          ca.mcgill.cs.sel.ram.Class clazz = null;
          TClass _class__1 = messageView.getClass_();
          String _name = _class__1.getName();
          ca.mcgill.cs.sel.ram.Class _findClass = this.findClass(this.ramAspect, _name);
          clazz = ((ca.mcgill.cs.sel.ram.Class) _findClass);
          EList<Operation> _operations = clazz.getOperations();
          final Function1<Operation,Boolean> _function = new Function1<Operation,Boolean>() {
            public Boolean apply(final Operation o) {
              String _name = o.getName();
              TOperation _specifies = messageView.getSpecifies();
              String _name_1 = _specifies.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          Operation _findFirst = IterableExtensions.<Operation>findFirst(_operations, _function);
          operation = _findFirst;
        } else {
          StructuralView _structuralView = this.ramAspect.getStructuralView();
          EList<Classifier> _classes = _structuralView.getClasses();
          Iterable<ca.mcgill.cs.sel.ram.Class> _filter = Iterables.<ca.mcgill.cs.sel.ram.Class>filter(_classes, ca.mcgill.cs.sel.ram.Class.class);
          final Function1<ca.mcgill.cs.sel.ram.Class,EList<Operation>> _function_1 = new Function1<ca.mcgill.cs.sel.ram.Class,EList<Operation>>() {
            public EList<Operation> apply(final ca.mcgill.cs.sel.ram.Class it) {
              return it.getOperations();
            }
          };
          Iterable<EList<Operation>> _map = IterableExtensions.<ca.mcgill.cs.sel.ram.Class, EList<Operation>>map(_filter, _function_1);
          Iterable<Operation> _flatten = Iterables.<Operation>concat(_map);
          final Function1<Operation,Boolean> _function_2 = new Function1<Operation,Boolean>() {
            public Boolean apply(final Operation o) {
              String _name = o.getName();
              TOperation _specifies = messageView.getSpecifies();
              String _name_1 = _specifies.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          final Iterable<Operation> operations = IterableExtensions.<Operation>filter(_flatten, _function_2);
          int _length = ((Object[])Conversions.unwrapArray(operations, Object.class)).length;
          boolean _notEquals_2 = (_length != 1);
          if (_notEquals_2) {
            throw new Exception("Invalid operation definition.");
          }
          Operation _get = ((Operation[])Conversions.unwrapArray(operations, Operation.class))[0];
          operation = _get;
        }
        final Gate gate = RamFactory.eINSTANCE.createGate();
        String _name_1 = operation.getName();
        String _plus = ("in_" + _name_1);
        gate.setName(_plus);
        EList<Gate> _formalGates = interaction.getFormalGates();
        _formalGates.add(gate);
        MessageOccurrenceSpecification _createMessageOccurrenceSpecification = RamFactory.eINSTANCE.createMessageOccurrenceSpecification();
        final Procedure1<MessageOccurrenceSpecification> _function_3 = new Procedure1<MessageOccurrenceSpecification>() {
          public void apply(final MessageOccurrenceSpecification it) {
            EList<Lifeline> _covered = it.getCovered();
            _covered.add(lifeLineTo);
          }
        };
        final MessageOccurrenceSpecification event = ObjectExtensions.<MessageOccurrenceSpecification>operator_doubleArrow(_createMessageOccurrenceSpecification, _function_3);
        EList<InteractionFragment> _fragments = interaction.getFragments();
        _fragments.add(event);
        final Message result = RamFactory.eINSTANCE.createMessage();
        result.setSignature(operation);
        EList<ParameterValueMapping> _arguments = result.getArguments();
        List<ParameterValueMapping> _generateArguments = this.generateArguments(messageView, operation, lifeLineTo);
        _arguments.addAll(_generateArguments);
        result.setSendEvent(gate);
        result.setReceiveEvent(event);
        boolean _isCreate = messageView.isCreate();
        boolean _equals = (_isCreate == true);
        if (_equals) {
          result.setMessageSort(MessageSort.CREATE_MESSAGE);
        }
        EList<Message> _messages = interaction.getMessages();
        _messages.add(result);
        event.setMessage(result);
        gate.setMessage(result);
        _xblockexpression = result;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Lifeline _getFirstLifeline(final TInteractionMessage interactionMessage, final Interaction interaction) {
    Lifeline _xblockexpression = null;
    {
      final TLifeline firstLifeline = interactionMessage.getLeftLifeline();
      EList<Lifeline> _lifelines = interaction.getLifelines();
      final Function1<Lifeline,Boolean> _function = new Function1<Lifeline,Boolean>() {
        public Boolean apply(final Lifeline l) {
          TypedElement _represents = l.getRepresents();
          String _name = _represents.getName();
          String _name_1 = firstLifeline.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      final Lifeline result = IterableExtensions.<Lifeline>findFirst(_lifelines, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private Lifeline _getFirstLifeline(final TOcurrence interactionMessage, final Interaction interaction) {
    Lifeline _xblockexpression = null;
    {
      final TLifeline firstLifeline = interactionMessage.getLeftLifeline();
      EList<Lifeline> _lifelines = interaction.getLifelines();
      final Function1<Lifeline,Boolean> _function = new Function1<Lifeline,Boolean>() {
        public Boolean apply(final Lifeline l) {
          TypedElement _represents = l.getRepresents();
          String _name = _represents.getName();
          String _name_1 = firstLifeline.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      final Lifeline result = IterableExtensions.<Lifeline>findFirst(_lifelines, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private ValueSpecification getMessageReturn(final TReturnInteraction interaction, final Lifeline lifeline) {
    ValueSpecification _xblockexpression = null;
    {
      TValueSpecification _return = interaction.getReturn();
      final ValueSpecification result = this.createValueSpecification(_return, lifeline);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private Lifeline _getLifelineTo(final Interaction interaction, final TInteractionMessage textRamInteractionMessage) {
    Lifeline _xblockexpression = null;
    {
      EList<Lifeline> _lifelines = interaction.getLifelines();
      final Function1<Lifeline,Boolean> _function = new Function1<Lifeline,Boolean>() {
        public Boolean apply(final Lifeline l) {
          TypedElement _represents = l.getRepresents();
          String _name = _represents.getName();
          TLifeline _rightLifeline = textRamInteractionMessage.getRightLifeline();
          String _name_1 = _rightLifeline.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      final Lifeline lifeLineTo = IterableExtensions.<Lifeline>findFirst(_lifelines, _function);
      _xblockexpression = lifeLineTo;
    }
    return _xblockexpression;
  }
  
  private Lifeline _getLifelineTo(final InteractionOperand interactionOperand, final TInteractionMessage textRamInteractionMessage) {
    Lifeline _xblockexpression = null;
    {
      final Interaction rootInteraction = TextRamEcoreUtil.<Interaction>getRootContainerOfType(interactionOperand, RamPackage.Literals.INTERACTION);
      EList<Lifeline> _lifelines = rootInteraction.getLifelines();
      final Function1<Lifeline,Boolean> _function = new Function1<Lifeline,Boolean>() {
        public Boolean apply(final Lifeline l) {
          TypedElement _represents = l.getRepresents();
          String _name = _represents.getName();
          TLifeline _rightLifeline = textRamInteractionMessage.getRightLifeline();
          String _name_1 = _rightLifeline.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      final Lifeline lifeLineTo = IterableExtensions.<Lifeline>findFirst(_lifelines, _function);
      _xblockexpression = lifeLineTo;
    }
    return _xblockexpression;
  }
  
  private Lifeline _getLifelineFrom(final Interaction interaction, final TInteractionMessage textRamInteractionMessage) {
    Lifeline _xblockexpression = null;
    {
      EList<Lifeline> _lifelines = interaction.getLifelines();
      final Function1<Lifeline,Boolean> _function = new Function1<Lifeline,Boolean>() {
        public Boolean apply(final Lifeline l) {
          TypedElement _represents = l.getRepresents();
          String _name = _represents.getName();
          TLifeline _leftLifeline = textRamInteractionMessage.getLeftLifeline();
          String _name_1 = _leftLifeline.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      final Lifeline lifeLineFrom = IterableExtensions.<Lifeline>findFirst(_lifelines, _function);
      _xblockexpression = lifeLineFrom;
    }
    return _xblockexpression;
  }
  
  private Lifeline _getLifelineFrom(final InteractionOperand interactionOperand, final TInteractionMessage textRamInteractionMessage) {
    Lifeline _xblockexpression = null;
    {
      final Interaction rootInteraction = TextRamEcoreUtil.<Interaction>getRootContainerOfType(interactionOperand, RamPackage.Literals.INTERACTION);
      EList<Lifeline> _lifelines = rootInteraction.getLifelines();
      final Function1<Lifeline,Boolean> _function = new Function1<Lifeline,Boolean>() {
        public Boolean apply(final Lifeline l) {
          TypedElement _represents = l.getRepresents();
          String _name = _represents.getName();
          TLifeline _leftLifeline = textRamInteractionMessage.getLeftLifeline();
          String _name_1 = _leftLifeline.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      final Lifeline lifeLineFrom = IterableExtensions.<Lifeline>findFirst(_lifelines, _function);
      _xblockexpression = lifeLineFrom;
    }
    return _xblockexpression;
  }
  
  private ParameterValueMapping _createParameterValueMapping(final Parameter p, final TLocalAttribute tLocalAttribute, final Lifeline lifeline) {
    ParameterValueMapping _xblockexpression = null;
    {
      ParameterValueMapping _createParameterValueMapping = RamFactory.eINSTANCE.createParameterValueMapping();
      final Procedure1<ParameterValueMapping> _function = new Procedure1<ParameterValueMapping>() {
        public void apply(final ParameterValueMapping it) {
          it.setParameter(p);
          StructuralFeatureValue _createStructuralFeatureValue = RamFactory.eINSTANCE.createStructuralFeatureValue();
          final Procedure1<StructuralFeatureValue> _function = new Procedure1<StructuralFeatureValue>() {
            public void apply(final StructuralFeatureValue it) {
              EList<TemporaryProperty> _localProperties = lifeline.getLocalProperties();
              Iterable<Attribute> _filter = Iterables.<Attribute>filter(_localProperties, Attribute.class);
              final Function1<Attribute,Boolean> _function = new Function1<Attribute,Boolean>() {
                public Boolean apply(final Attribute l) {
                  String _name = l.getName();
                  String _name_1 = tLocalAttribute.getName();
                  return Boolean.valueOf(Objects.equal(_name, _name_1));
                }
              };
              Attribute _findFirst = IterableExtensions.<Attribute>findFirst(_filter, _function);
              it.setValue(_findFirst);
            }
          };
          StructuralFeatureValue _doubleArrow = ObjectExtensions.<StructuralFeatureValue>operator_doubleArrow(_createStructuralFeatureValue, _function);
          it.setValue(_doubleArrow);
        }
      };
      final ParameterValueMapping result = ObjectExtensions.<ParameterValueMapping>operator_doubleArrow(_createParameterValueMapping, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private ParameterValueMapping _createParameterValueMapping(final Parameter p, final TReference tReference, final Lifeline lifeline) {
    ParameterValueMapping _xblockexpression = null;
    {
      ParameterValueMapping _createParameterValueMapping = RamFactory.eINSTANCE.createParameterValueMapping();
      final Procedure1<ParameterValueMapping> _function = new Procedure1<ParameterValueMapping>() {
        public void apply(final ParameterValueMapping it) {
          it.setParameter(p);
          StructuralFeatureValue _createStructuralFeatureValue = RamFactory.eINSTANCE.createStructuralFeatureValue();
          final Procedure1<StructuralFeatureValue> _function = new Procedure1<StructuralFeatureValue>() {
            public void apply(final StructuralFeatureValue it) {
              EList<TemporaryProperty> _localProperties = lifeline.getLocalProperties();
              Iterable<Reference> _filter = Iterables.<Reference>filter(_localProperties, Reference.class);
              final Function1<Reference,Boolean> _function = new Function1<Reference,Boolean>() {
                public Boolean apply(final Reference l) {
                  String _name = l.getName();
                  String _name_1 = tReference.getName();
                  return Boolean.valueOf(Objects.equal(_name, _name_1));
                }
              };
              Reference _findFirst = IterableExtensions.<Reference>findFirst(_filter, _function);
              it.setValue(_findFirst);
            }
          };
          StructuralFeatureValue _doubleArrow = ObjectExtensions.<StructuralFeatureValue>operator_doubleArrow(_createStructuralFeatureValue, _function);
          it.setValue(_doubleArrow);
        }
      };
      final ParameterValueMapping result = ObjectExtensions.<ParameterValueMapping>operator_doubleArrow(_createParameterValueMapping, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private ParameterValueMapping _createParameterValueMapping(final Parameter p, final TLifeline tLifeline, final Lifeline lifeline) {
    ParameterValueMapping _xblockexpression = null;
    {
      EObject _eContainer = lifeline.eContainer();
      final Interaction interaction = ((Interaction) _eContainer);
      ParameterValueMapping _createParameterValueMapping = RamFactory.eINSTANCE.createParameterValueMapping();
      final Procedure1<ParameterValueMapping> _function = new Procedure1<ParameterValueMapping>() {
        public void apply(final ParameterValueMapping it) {
          it.setParameter(p);
          StructuralFeatureValue _createStructuralFeatureValue = RamFactory.eINSTANCE.createStructuralFeatureValue();
          final Procedure1<StructuralFeatureValue> _function = new Procedure1<StructuralFeatureValue>() {
            public void apply(final StructuralFeatureValue it) {
              EList<Reference> _properties = interaction.getProperties();
              final Function1<Reference,Boolean> _function = new Function1<Reference,Boolean>() {
                public Boolean apply(final Reference prop) {
                  String _name = prop.getName();
                  String _name_1 = tLifeline.getName();
                  return Boolean.valueOf(Objects.equal(_name, _name_1));
                }
              };
              Reference _findFirst = IterableExtensions.<Reference>findFirst(_properties, _function);
              it.setValue(_findFirst);
            }
          };
          StructuralFeatureValue _doubleArrow = ObjectExtensions.<StructuralFeatureValue>operator_doubleArrow(_createStructuralFeatureValue, _function);
          it.setValue(_doubleArrow);
        }
      };
      final ParameterValueMapping result = ObjectExtensions.<ParameterValueMapping>operator_doubleArrow(_createParameterValueMapping, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private ParameterValueMapping _createParameterValueMapping(final Parameter p, final TParameter tParameter, final Lifeline lifeline) {
    ParameterValueMapping _xblockexpression = null;
    {
      ParameterValueMapping _createParameterValueMapping = RamFactory.eINSTANCE.createParameterValueMapping();
      final Procedure1<ParameterValueMapping> _function = new Procedure1<ParameterValueMapping>() {
        public void apply(final ParameterValueMapping it) {
          it.setParameter(p);
          ParameterValue _createParameterValue = RamFactory.eINSTANCE.createParameterValue();
          final Procedure1<ParameterValue> _function = new Procedure1<ParameterValue>() {
            public void apply(final ParameterValue it) {
              it.setParameter(p);
            }
          };
          ParameterValue _doubleArrow = ObjectExtensions.<ParameterValue>operator_doubleArrow(_createParameterValue, _function);
          it.setValue(_doubleArrow);
        }
      };
      final ParameterValueMapping result = ObjectExtensions.<ParameterValueMapping>operator_doubleArrow(_createParameterValueMapping, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private ca.mcgill.cs.sel.ram.Class findClass(final Aspect aspect, final String name) {
    ca.mcgill.cs.sel.ram.Class _xblockexpression = null;
    {
      StructuralView _structuralView = aspect.getStructuralView();
      EList<Classifier> _classes = _structuralView.getClasses();
      Iterable<ca.mcgill.cs.sel.ram.Class> _filter = Iterables.<ca.mcgill.cs.sel.ram.Class>filter(_classes, ca.mcgill.cs.sel.ram.Class.class);
      final Function1<ca.mcgill.cs.sel.ram.Class,Boolean> _function = new Function1<ca.mcgill.cs.sel.ram.Class,Boolean>() {
        public Boolean apply(final ca.mcgill.cs.sel.ram.Class c) {
          String _name = c.getName();
          return Boolean.valueOf(Objects.equal(_name, name));
        }
      };
      ca.mcgill.cs.sel.ram.Class result = IterableExtensions.<ca.mcgill.cs.sel.ram.Class>findFirst(_filter, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public AssociationEnd findAssociationEnd(final Aspect aspect, final String name) {
    AssociationEnd _xblockexpression = null;
    {
      StructuralView _structuralView = aspect.getStructuralView();
      EList<Classifier> _classes = _structuralView.getClasses();
      Iterable<ca.mcgill.cs.sel.ram.Class> _filter = Iterables.<ca.mcgill.cs.sel.ram.Class>filter(_classes, ca.mcgill.cs.sel.ram.Class.class);
      final Function1<ca.mcgill.cs.sel.ram.Class,EList<AssociationEnd>> _function = new Function1<ca.mcgill.cs.sel.ram.Class,EList<AssociationEnd>>() {
        public EList<AssociationEnd> apply(final ca.mcgill.cs.sel.ram.Class it) {
          return it.getAssociationEnds();
        }
      };
      Iterable<EList<AssociationEnd>> _map = IterableExtensions.<ca.mcgill.cs.sel.ram.Class, EList<AssociationEnd>>map(_filter, _function);
      Iterable<AssociationEnd> _flatten = Iterables.<AssociationEnd>concat(_map);
      final Function1<AssociationEnd,Boolean> _function_1 = new Function1<AssociationEnd,Boolean>() {
        public Boolean apply(final AssociationEnd a) {
          String _name = a.getName();
          return Boolean.valueOf(Objects.equal(_name, name));
        }
      };
      final AssociationEnd result = IterableExtensions.<AssociationEnd>findFirst(_flatten, _function_1);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public ca.mcgill.cs.sel.ram.Class findClassFromAssociationEnd(final Aspect aspect, final TAssociation assoc) {
    ca.mcgill.cs.sel.ram.Class _xblockexpression = null;
    {
      TAssociationEnd _toEnd = assoc.getToEnd();
      TClass _classReference = _toEnd.getClassReference();
      String _name = _classReference.getName();
      final ca.mcgill.cs.sel.ram.Class result = this.findClass(this.ramAspect, _name);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private ArrayList<Lifeline> generateLifelines(final Interaction interaction, final List<TLifeline> textRamLifelines, final List<Reference> properties) {
    ArrayList<Lifeline> _xblockexpression = null;
    {
      final ArrayList<Lifeline> result = new ArrayList<Lifeline>();
      final Procedure1<TLifeline> _function = new Procedure1<TLifeline>() {
        public void apply(final TLifeline textRamLifeline) {
          Lifeline _createLifeline = RamFactory.eINSTANCE.createLifeline();
          final Procedure1<Lifeline> _function = new Procedure1<Lifeline>() {
            public void apply(final Lifeline it) {
              TypedElement _createRepresents = MessageViewsGenerator.this.createRepresents(textRamLifeline, properties);
              it.setRepresents(_createRepresents);
              EList<TemporaryProperty> _localProperties = it.getLocalProperties();
              List<TemporaryProperty> _generateLocalProperties = MessageViewsGenerator.this.generateLocalProperties(textRamLifeline);
              _localProperties.addAll(_generateLocalProperties);
            }
          };
          Lifeline lifeline = ObjectExtensions.<Lifeline>operator_doubleArrow(_createLifeline, _function);
          result.add(lifeline);
        }
      };
      IterableExtensions.<TLifeline>forEach(textRamLifelines, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private TypedElement createRepresents(final TLifeline textRamLifeline, final List<Reference> properties) {
    TypedElement _xblockexpression = null;
    {
      TypedElement result = null;
      TLifelineReferenceType _referenceType = textRamLifeline.getReferenceType();
      boolean _equals = Objects.equal(_referenceType, TLifelineReferenceType.REFERENCE);
      if (_equals) {
        final Function1<Reference,Boolean> _function = new Function1<Reference,Boolean>() {
          public Boolean apply(final Reference p) {
            String _name = p.getName();
            String _name_1 = textRamLifeline.getName();
            return Boolean.valueOf(Objects.equal(_name, _name_1));
          }
        };
        Reference _findFirst = IterableExtensions.<Reference>findFirst(properties, _function);
        result = _findFirst;
      }
      TLifelineReferenceType _referenceType_1 = textRamLifeline.getReferenceType();
      boolean _equals_1 = Objects.equal(_referenceType_1, TLifelineReferenceType.ASSOCIATION);
      if (_equals_1) {
        TTypedElement _represents = textRamLifeline.getRepresents();
        String _name = ((TAssociation) _represents).getName();
        AssociationEnd _findAssociationEnd = this.findAssociationEnd(this.ramAspect, _name);
        result = _findAssociationEnd;
      }
      TLifelineReferenceType _referenceType_2 = textRamLifeline.getReferenceType();
      boolean _equals_2 = Objects.equal(_referenceType_2, TLifelineReferenceType.ATTRIBUTE);
      if (_equals_2) {
        TTypedElement _represents_1 = textRamLifeline.getRepresents();
        String _name_1 = ((TAttribute) _represents_1).getName();
        Attribute _findAttribute = this.findAttribute(this.ramAspect, _name_1);
        result = _findAttribute;
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private List<TemporaryProperty> generateLocalProperties(final TLifeline textRamLifeline) {
    List<TemporaryProperty> _xblockexpression = null;
    {
      final List<TemporaryProperty> result = CollectionLiterals.<TemporaryProperty>newArrayList();
      EList<TTemporaryProperty> _localProperties = textRamLifeline.getLocalProperties();
      final Procedure1<TTemporaryProperty> _function = new Procedure1<TTemporaryProperty>() {
        public void apply(final TTemporaryProperty textRamTemporaryProperty) {
          TemporaryProperty _createLocalProperty = MessageViewsGenerator.this.createLocalProperty(textRamTemporaryProperty);
          result.add(_createLocalProperty);
        }
      };
      IterableExtensions.<TTemporaryProperty>forEach(_localProperties, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected TemporaryProperty _createLocalProperty(final TReference reference) {
    Reference _xblockexpression = null;
    {
      Reference _createReference = RamFactory.eINSTANCE.createReference();
      final Procedure1<Reference> _function = new Procedure1<Reference>() {
        public void apply(final Reference it) {
          it.setLowerBound(1);
          String _name = reference.getName();
          it.setName(_name);
          TClass _reference = reference.getReference();
          String _name_1 = _reference.getName();
          ca.mcgill.cs.sel.ram.Class _findClass = MessageViewsGenerator.this.findClass(MessageViewsGenerator.this.ramAspect, _name_1);
          it.setType(_findClass);
        }
      };
      final Reference result = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected TemporaryProperty _createLocalProperty(final TLocalAttribute attribute) {
    Attribute _xblockexpression = null;
    {
      Attribute _createAttribute = RamFactory.eINSTANCE.createAttribute();
      final Procedure1<Attribute> _function = new Procedure1<Attribute>() {
        public void apply(final Attribute it) {
          String _name = attribute.getName();
          it.setName(_name);
          PrimitiveType _type = attribute.getType();
          it.setType(_type);
        }
      };
      Attribute result = ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public Attribute findAttribute(final Aspect aspect, final String name) {
    Attribute _xblockexpression = null;
    {
      StructuralView _structuralView = aspect.getStructuralView();
      EList<Classifier> _classes = _structuralView.getClasses();
      Iterable<ca.mcgill.cs.sel.ram.Class> _filter = Iterables.<ca.mcgill.cs.sel.ram.Class>filter(_classes, ca.mcgill.cs.sel.ram.Class.class);
      final Function1<ca.mcgill.cs.sel.ram.Class,EList<Attribute>> _function = new Function1<ca.mcgill.cs.sel.ram.Class,EList<Attribute>>() {
        public EList<Attribute> apply(final ca.mcgill.cs.sel.ram.Class it) {
          return it.getAttributes();
        }
      };
      Iterable<EList<Attribute>> _map = IterableExtensions.<ca.mcgill.cs.sel.ram.Class, EList<Attribute>>map(_filter, _function);
      Iterable<Attribute> _flatten = Iterables.<Attribute>concat(_map);
      final Function1<Attribute,Boolean> _function_1 = new Function1<Attribute,Boolean>() {
        public Boolean apply(final Attribute a) {
          String _name = a.getName();
          return Boolean.valueOf(Objects.equal(_name, name));
        }
      };
      final Attribute result = IterableExtensions.<Attribute>findFirst(_flatten, _function_1);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private ArrayList<Reference> generateProperties(final List<TLifeline> textRamLifelines) {
    final ArrayList<Reference> result = new ArrayList<Reference>();
    final Function1<TLifeline,Boolean> _function = new Function1<TLifeline,Boolean>() {
      public Boolean apply(final TLifeline lifeline) {
        TLifelineReferenceType _referenceType = lifeline.getReferenceType();
        return Boolean.valueOf(Objects.equal(_referenceType, TLifelineReferenceType.REFERENCE));
      }
    };
    Iterable<TLifeline> _filter = IterableExtensions.<TLifeline>filter(textRamLifelines, _function);
    final Procedure1<TLifeline> _function_1 = new Procedure1<TLifeline>() {
      public void apply(final TLifeline lifeline) {
        Reference _createProperty = MessageViewsGenerator.this.createProperty(lifeline);
        result.add(_createProperty);
      }
    };
    IterableExtensions.<TLifeline>forEach(_filter, _function_1);
    return result;
  }
  
  private Reference createProperty(final TLifeline lifeline) {
    Reference _xblockexpression = null;
    {
      TTypedElement _represents = lifeline.getRepresents();
      if (((_represents instanceof TClass) == false)) {
        throw new ClassCastException();
      }
      Reference _createReference = RamFactory.eINSTANCE.createReference();
      final Procedure1<Reference> _function = new Procedure1<Reference>() {
        public void apply(final Reference it) {
          it.setLowerBound(1);
          String _name = lifeline.getName();
          it.setName(_name);
          TTypedElement _represents = lifeline.getRepresents();
          String _name_1 = ((TClass) _represents).getName();
          ca.mcgill.cs.sel.ram.Class _findClass = MessageViewsGenerator.this.findClass(MessageViewsGenerator.this.ramAspect, _name_1);
          it.setType(_findClass);
          boolean _isStatic = lifeline.isStatic();
          it.setStatic(_isStatic);
        }
      };
      final Reference result = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private AbstractMessageView generateMessageView(final TAbstractMessages textRamAspectMessageView) {
    if (textRamAspectMessageView instanceof TAspectMessageView) {
      return _generateMessageView((TAspectMessageView)textRamAspectMessageView);
    } else if (textRamAspectMessageView instanceof TMessageView) {
      return _generateMessageView((TMessageView)textRamAspectMessageView);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(textRamAspectMessageView).toString());
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
  
  private void generateInteractionMessages(final TInteraction textRamCombinedFragment, final FragmentContainer fragmentContainer, final TAbstractMessages textRamMessage) {
    if (textRamCombinedFragment instanceof TCombinedFragment) {
      _generateInteractionMessages((TCombinedFragment)textRamCombinedFragment, fragmentContainer, textRamMessage);
      return;
    } else if (textRamCombinedFragment instanceof TInteractionMessage) {
      _generateInteractionMessages((TInteractionMessage)textRamCombinedFragment, fragmentContainer, textRamMessage);
      return;
    } else if (textRamCombinedFragment instanceof TOcurrence) {
      _generateInteractionMessages((TOcurrence)textRamCombinedFragment, fragmentContainer, textRamMessage);
      return;
    } else if (textRamCombinedFragment instanceof TReturnInteraction) {
      _generateInteractionMessages((TReturnInteraction)textRamCombinedFragment, fragmentContainer, textRamMessage);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(textRamCombinedFragment, fragmentContainer, textRamMessage).toString());
    }
  }
  
  private StructuralFeature createStructuralFeature(final TMessageAssignableFeature feature, final Lifeline lifeline) {
    if (feature instanceof TLocalAttribute) {
      return _createStructuralFeature((TLocalAttribute)feature, lifeline);
    } else if (feature instanceof TReference) {
      return _createStructuralFeature((TReference)feature, lifeline);
    } else if (feature instanceof TAssociation) {
      return _createStructuralFeature((TAssociation)feature, lifeline);
    } else if (feature instanceof TLifeline) {
      return _createStructuralFeature((TLifeline)feature, lifeline);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(feature, lifeline).toString());
    }
  }
  
  private ValueSpecification createValueSpecification(final EObject feature, final Lifeline lifeline) {
    if (feature instanceof TLocalAttribute) {
      return _createValueSpecification((TLocalAttribute)feature, lifeline);
    } else if (feature instanceof TReference) {
      return _createValueSpecification((TReference)feature, lifeline);
    } else if (feature instanceof TLifeline) {
      return _createValueSpecification((TLifeline)feature, lifeline);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(feature, lifeline).toString());
    }
  }
  
  private List<ParameterValueMapping> generateArguments(final EObject tMessage, final Operation operation, final Lifeline lifeline) {
    if (tMessage instanceof TAbstractMessages) {
      return _generateArguments((TAbstractMessages)tMessage, operation, lifeline);
    } else if (tMessage instanceof TMessage) {
      return _generateArguments((TMessage)tMessage, operation, lifeline);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(tMessage, operation, lifeline).toString());
    }
  }
  
  private Lifeline getFirstLifeline(final TInteraction interactionMessage, final Interaction interaction) {
    if (interactionMessage instanceof TInteractionMessage) {
      return _getFirstLifeline((TInteractionMessage)interactionMessage, interaction);
    } else if (interactionMessage instanceof TOcurrence) {
      return _getFirstLifeline((TOcurrence)interactionMessage, interaction);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(interactionMessage, interaction).toString());
    }
  }
  
  private Lifeline getLifelineTo(final FragmentContainer interaction, final TInteractionMessage textRamInteractionMessage) {
    if (interaction instanceof Interaction) {
      return _getLifelineTo((Interaction)interaction, textRamInteractionMessage);
    } else if (interaction instanceof InteractionOperand) {
      return _getLifelineTo((InteractionOperand)interaction, textRamInteractionMessage);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(interaction, textRamInteractionMessage).toString());
    }
  }
  
  private Lifeline getLifelineFrom(final FragmentContainer interaction, final TInteractionMessage textRamInteractionMessage) {
    if (interaction instanceof Interaction) {
      return _getLifelineFrom((Interaction)interaction, textRamInteractionMessage);
    } else if (interaction instanceof InteractionOperand) {
      return _getLifelineFrom((InteractionOperand)interaction, textRamInteractionMessage);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(interaction, textRamInteractionMessage).toString());
    }
  }
  
  private ParameterValueMapping createParameterValueMapping(final Parameter p, final TValueSpecification tLocalAttribute, final Lifeline lifeline) {
    if (tLocalAttribute instanceof TLocalAttribute) {
      return _createParameterValueMapping(p, (TLocalAttribute)tLocalAttribute, lifeline);
    } else if (tLocalAttribute instanceof TReference) {
      return _createParameterValueMapping(p, (TReference)tLocalAttribute, lifeline);
    } else if (tLocalAttribute instanceof TLifeline) {
      return _createParameterValueMapping(p, (TLifeline)tLocalAttribute, lifeline);
    } else if (tLocalAttribute instanceof TParameter) {
      return _createParameterValueMapping(p, (TParameter)tLocalAttribute, lifeline);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p, tLocalAttribute, lifeline).toString());
    }
  }
  
  public TemporaryProperty createLocalProperty(final TTemporaryProperty attribute) {
    if (attribute instanceof TLocalAttribute) {
      return _createLocalProperty((TLocalAttribute)attribute);
    } else if (attribute instanceof TReference) {
      return _createLocalProperty((TReference)attribute);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(attribute).toString());
    }
  }
}
