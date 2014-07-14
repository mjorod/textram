package cl.uchile.pleiad.transform;

import ca.mcgill.cs.sel.ram.AbstractMessageView;
import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.AspectMessageView;
import ca.mcgill.cs.sel.ram.Association;
import ca.mcgill.cs.sel.ram.AssociationEnd;
import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.CombinedFragment;
import ca.mcgill.cs.sel.ram.Interaction;
import ca.mcgill.cs.sel.ram.InteractionFragment;
import ca.mcgill.cs.sel.ram.Lifeline;
import ca.mcgill.cs.sel.ram.MessageOccurrenceSpecification;
import ca.mcgill.cs.sel.ram.MessageView;
import ca.mcgill.cs.sel.ram.ObjectType;
import ca.mcgill.cs.sel.ram.OccurrenceSpecification;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.Parameter;
import ca.mcgill.cs.sel.ram.PrimitiveType;
import ca.mcgill.cs.sel.ram.RSet;
import ca.mcgill.cs.sel.ram.Reference;
import ca.mcgill.cs.sel.ram.ReferenceType;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.TemporaryProperty;
import ca.mcgill.cs.sel.ram.Type;
import ca.mcgill.cs.sel.ram.TypedElement;
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
import cl.uchile.pleiad.textRam.TMessageView;
import cl.uchile.pleiad.textRam.TOcurrence;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TParameter;
import cl.uchile.pleiad.textRam.TReference;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TTemporaryProperty;
import cl.uchile.pleiad.textRam.TTypedElement;
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
    this.transformMessageViews(ramAspect, textRamAspect);
    return textRamAspect;
  }
  
  private boolean transformMessageViews(final Aspect from, final TAspect to) {
    boolean _xifexpression = false;
    EList<AbstractMessageView> _messageViews = from.getMessageViews();
    int _size = _messageViews.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      EList<AbstractMessageView> _messageViews_1 = to.getMessageViews();
      TAbstractMessageView _transformedMessageViews = this.getTransformedMessageViews(from, to);
      _xifexpression = _messageViews_1.add(_transformedMessageViews);
    }
    return _xifexpression;
  }
  
  private TAbstractMessageView getTransformedMessageViews(final Aspect from, final TAspect to) {
    final TAbstractMessageView res = TextRamFactory.eINSTANCE.createTAbstractMessageView();
    this.addLifelinesfrom(res, from, to);
    EList<AbstractMessageView> _messageViews = from.getMessageViews();
    final Procedure1<AbstractMessageView> _function = new Procedure1<AbstractMessageView>() {
      public void apply(final AbstractMessageView mv) {
        EList<TAbstractMessages> _messages = res.getMessages();
        TAbstractMessages _transformedMessage = TextRAMTransform.this.getTransformedMessage(mv, to);
        _messages.add(_transformedMessage);
      }
    };
    IterableExtensions.<AbstractMessageView>forEach(_messageViews, _function);
    return res;
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
  
  private List<TInteraction> getTextRamInteractions(final Interaction interaction, final TAspect aspect) {
    final List<TInteraction> res = CollectionLiterals.<TInteraction>newArrayList();
    EList<InteractionFragment> _fragments = interaction.getFragments();
    final Procedure1<InteractionFragment> _function = new Procedure1<InteractionFragment>() {
      public void apply(final InteractionFragment f) {
        TInteraction _transformedFragment = TextRAMTransform.this.getTransformedFragment(f);
        res.add(_transformedFragment);
      }
    };
    IterableExtensions.<InteractionFragment>forEach(_fragments, _function);
    return res;
  }
  
  private TInteraction _getTransformedFragment(final MessageOccurrenceSpecification from) {
    final TInteractionMessage res = TextRamFactory.eINSTANCE.createTInteractionMessage();
    EList<Lifeline> _covered = from.getCovered();
    final Procedure1<Lifeline> _function = new Procedure1<Lifeline>() {
      public void apply(final Lifeline it) {
      }
    };
    IterableExtensions.<Lifeline>forEach(_covered, _function);
    from.getCovered();
    return res;
  }
  
  private TInteraction _getTransformedFragment(final OccurrenceSpecification from) {
    final TOcurrence res = TextRamFactory.eINSTANCE.createTOcurrence();
    return res;
  }
  
  private TInteraction _getTransformedFragment(final CombinedFragment from) {
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
        EList<Lifeline> _lifelines = _specification.getLifelines();
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
    IterableExtensions.<MessageView>forEach(_filter_1, _function_1);
  }
  
  private TLifeline getTransformedLifeline(final Lifeline from, final TAspect to) {
    TLifeline _xblockexpression = null;
    {
      TLifeline _createTLifeline = TextRamFactory.eINSTANCE.createTLifeline();
      final Procedure1<TLifeline> _function = new Procedure1<TLifeline>() {
        public void apply(final TLifeline it) {
          TypedElement _represents = from.getRepresents();
          TTypedElement _representsFrom = TextRAMTransform.this.getRepresentsFrom(_represents, to);
          it.setRepresents(_representsFrom);
          String _nameFromLifeline = TextRAMTransform.this.getNameFromLifeline(from);
          it.setName(_nameFromLifeline);
          TypedElement _represents_1 = from.getRepresents();
          TLifelineReferenceType _referenceTypeFrom = TextRAMTransform.this.getReferenceTypeFrom(_represents_1);
          it.setReferenceType(_referenceTypeFrom);
          EList<TTemporaryProperty> _localProperties = it.getLocalProperties();
          List<TTemporaryProperty> _localPropertiesFromLifeline = TextRAMTransform.this.getLocalPropertiesFromLifeline(from, to);
          _localProperties.addAll(_localPropertiesFromLifeline);
        }
      };
      final TLifeline res = ObjectExtensions.<TLifeline>operator_doubleArrow(_createTLifeline, _function);
      _xblockexpression = res;
    }
    return _xblockexpression;
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
    TReference _createTReference = TextRamFactory.eINSTANCE.createTReference();
    final Procedure1<TReference> _function = new Procedure1<TReference>() {
      public void apply(final TReference it) {
        String _name = from.getName();
        it.setName(_name);
        ObjectType _type = from.getType();
        boolean _isPartial = ((ca.mcgill.cs.sel.ram.Class) _type).isPartial();
        it.setPartialClass(_isPartial);
        ObjectType _type_1 = from.getType();
        String _name_1 = _type_1.getName();
        TClass _findClass = TextRAMTransform.this.textRamEcoreUtil.findClass(to, _name_1);
        it.setReference(_findClass);
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
  
  private TInteraction getTransformedFragment(final InteractionFragment from) {
    if (from instanceof MessageOccurrenceSpecification) {
      return _getTransformedFragment((MessageOccurrenceSpecification)from);
    } else if (from instanceof CombinedFragment) {
      return _getTransformedFragment((CombinedFragment)from);
    } else if (from instanceof OccurrenceSpecification) {
      return _getTransformedFragment((OccurrenceSpecification)from);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(from).toString());
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
