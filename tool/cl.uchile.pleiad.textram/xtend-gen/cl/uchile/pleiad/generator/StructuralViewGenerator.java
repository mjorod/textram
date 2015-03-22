package cl.uchile.pleiad.generator;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Association;
import ca.mcgill.cs.sel.ram.AssociationEnd;
import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.AttributeMapping;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.ClassifierMapping;
import ca.mcgill.cs.sel.ram.Instantiation;
import ca.mcgill.cs.sel.ram.InstantiationType;
import ca.mcgill.cs.sel.ram.ObjectType;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.OperationMapping;
import ca.mcgill.cs.sel.ram.Parameter;
import ca.mcgill.cs.sel.ram.ParameterMapping;
import ca.mcgill.cs.sel.ram.PrimitiveType;
import ca.mcgill.cs.sel.ram.RSet;
import ca.mcgill.cs.sel.ram.RVoid;
import ca.mcgill.cs.sel.ram.RamFactory;
import ca.mcgill.cs.sel.ram.ReferenceType;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Type;
import ca.mcgill.cs.sel.ram.Visibility;
import cl.uchile.pleiad.converter.ModelConverterProxy;
import cl.uchile.pleiad.textRam.AssociationDirectionMultiplicity;
import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.textRam.TAssociation;
import cl.uchile.pleiad.textRam.TAssociationEnd;
import cl.uchile.pleiad.textRam.TAttribute;
import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TClassMember;
import cl.uchile.pleiad.textRam.TClassifierMapping;
import cl.uchile.pleiad.textRam.TInstantiationHeader;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TParameter;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.util.TextRamEcoreUtil;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class StructuralViewGenerator {
  private TAspect textRamAspect;
  
  private Aspect ramAspect;
  
  private final List<Aspect> externalAspects = CollectionLiterals.<Aspect>newArrayList();
  
  @Extension
  private TextRamEcoreUtil scopeProvider = new TextRamEcoreUtil();
  
  public StructuralViewGenerator(final TAspect from, final Aspect to) {
    this.textRamAspect = from;
    this.ramAspect = to;
    StructuralView _createStructuralView = RamFactory.eINSTANCE.createStructuralView();
    this.ramAspect.setStructuralView(_createStructuralView);
    StructuralView _structuralView = from.getStructuralView();
    EList<Type> _types = _structuralView.getTypes();
    boolean _isEmpty = _types.isEmpty();
    boolean _equals = (_isEmpty == true);
    if (_equals) {
      StructuralView _structuralView_1 = this.textRamAspect.getStructuralView();
      this.scopeProvider.getTypesFor(((TStructuralView) _structuralView_1));
    }
    StructuralView _structuralView_2 = this.ramAspect.getStructuralView();
    EList<Classifier> _classes = _structuralView_2.getClasses();
    List<Classifier> _createClasses = this.createClasses();
    _classes.addAll(_createClasses);
    StructuralView _structuralView_3 = this.ramAspect.getStructuralView();
    EList<Type> _types_1 = _structuralView_3.getTypes();
    this.generateTypes(_types_1);
    this.generateClasses();
    StructuralView _structuralView_4 = this.ramAspect.getStructuralView();
    EList<Association> _associations = _structuralView_4.getAssociations();
    List<Association> _generateAssociations = this.generateAssociations();
    _associations.addAll(_generateAssociations);
    EList<Instantiation> _instantiations = this.ramAspect.getInstantiations();
    List<Instantiation> _generateInstantiations = this.generateInstantiations();
    _instantiations.addAll(_generateInstantiations);
  }
  
  private void generateTypes(final EList<Type> ramTypes) {
    StructuralView _structuralView = this.textRamAspect.getStructuralView();
    EList<Type> _types = _structuralView.getTypes();
    Collection<Type> _copyAll = EcoreUtil.<Type>copyAll(_types);
    ramTypes.addAll(_copyAll);
    Iterable<RSet> _filter = Iterables.<RSet>filter(ramTypes, RSet.class);
    final Procedure1<RSet> _function = new Procedure1<RSet>() {
      public void apply(final RSet rSetType) {
        rSetType.setInstanceClassName(null);
        ObjectType _type = rSetType.getType();
        if ((_type instanceof TClass)) {
          StructuralView _structuralView = StructuralViewGenerator.this.ramAspect.getStructuralView();
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
  
  public StructuralView getStructuralView() {
    return this.ramAspect.getStructuralView();
  }
  
  private List<Instantiation> generateInstantiations() {
    List<Instantiation> _xblockexpression = null;
    {
      final List<Instantiation> result = CollectionLiterals.<Instantiation>newArrayList();
      final TAspect aspect = ((TAspect) this.textRamAspect);
      EList<TInstantiationHeader> _headerInstantiations = aspect.getHeaderInstantiations();
      final Procedure1<TInstantiationHeader> _function = new Procedure1<TInstantiationHeader>() {
        public void apply(final TInstantiationHeader i) {
          InstantiationType _type = i.getType();
          boolean _equals = Objects.equal(_type, InstantiationType.EXTENDS);
          if (_equals) {
            List<Instantiation> _generateInstantiationExtendsFromHeader = StructuralViewGenerator.this.generateInstantiationExtendsFromHeader(i);
            result.addAll(_generateInstantiationExtendsFromHeader);
          } else {
            InstantiationType _type_1 = i.getType();
            boolean _equals_1 = Objects.equal(_type_1, InstantiationType.DEPENDS);
            if (_equals_1) {
              List<Instantiation> _generateInstantiationDependsOnFromHeader = StructuralViewGenerator.this.generateInstantiationDependsOnFromHeader(i);
              result.addAll(_generateInstantiationDependsOnFromHeader);
            }
          }
        }
      };
      IterableExtensions.<TInstantiationHeader>forEach(_headerInstantiations, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private List<Instantiation> generateInstantiationDependsOnFromHeader(final TInstantiationHeader instantiationHeader) {
    try {
      List<Instantiation> _xblockexpression = null;
      {
        final List<Instantiation> result = CollectionLiterals.<Instantiation>newArrayList();
        InstantiationType _type = instantiationHeader.getType();
        boolean _notEquals = (!Objects.equal(_type, InstantiationType.DEPENDS));
        if (_notEquals) {
          throw new Exception("Only instantiation of type DEPENDS can be processed in this method");
        }
        EList<TAspect> _externalAspects = instantiationHeader.getExternalAspects();
        final Procedure1<TAspect> _function = new Procedure1<TAspect>() {
          public void apply(final TAspect ea) {
            EList<Instantiation> _instantiations = StructuralViewGenerator.this.textRamAspect.getInstantiations();
            final Function1<Instantiation,Boolean> _function = new Function1<Instantiation,Boolean>() {
              public Boolean apply(final Instantiation ins) {
                boolean _and = false;
                Aspect _externalAspect = ins.getExternalAspect();
                String _name = _externalAspect.getName();
                String _name_1 = ea.getName();
                boolean _equals = Objects.equal(_name, _name_1);
                if (!_equals) {
                  _and = false;
                } else {
                  EList<ClassifierMapping> _mappings = ins.getMappings();
                  int _length = ((Object[])Conversions.unwrapArray(_mappings, Object.class)).length;
                  boolean _greaterThan = (_length > 0);
                  _and = _greaterThan;
                }
                return Boolean.valueOf(_and);
              }
            };
            final Instantiation instantiationDependsOn = IterableExtensions.<Instantiation>findFirst(_instantiations, _function);
            Instantiation _generateInstantiation = StructuralViewGenerator.this.generateInstantiation(instantiationDependsOn);
            result.add(_generateInstantiation);
          }
        };
        IterableExtensions.<TAspect>forEach(_externalAspects, _function);
        _xblockexpression = result;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private List<Instantiation> generateInstantiationExtendsFromHeader(final TInstantiationHeader instantiationHeader) {
    try {
      List<Instantiation> _xblockexpression = null;
      {
        InstantiationType _type = instantiationHeader.getType();
        boolean _notEquals = (!Objects.equal(_type, InstantiationType.EXTENDS));
        if (_notEquals) {
          throw new Exception("Only instantiation of type EXTENDS can be processed in this method");
        }
        final List<Instantiation> result = CollectionLiterals.<Instantiation>newArrayList();
        EList<TAspect> _externalAspects = instantiationHeader.getExternalAspects();
        final Procedure1<TAspect> _function = new Procedure1<TAspect>() {
          public void apply(final TAspect ea) {
            Aspect externalAspect = null;
            final Function1<Aspect,Boolean> _function = new Function1<Aspect,Boolean>() {
              public Boolean apply(final Aspect e) {
                String _name = e.getName();
                String _name_1 = ea.getName();
                return Boolean.valueOf(Objects.equal(_name, _name_1));
              }
            };
            boolean _exists = IterableExtensions.<Aspect>exists(StructuralViewGenerator.this.externalAspects, _function);
            if (_exists) {
              final Function1<Aspect,Boolean> _function_1 = new Function1<Aspect,Boolean>() {
                public Boolean apply(final Aspect e) {
                  String _name = e.getName();
                  String _name_1 = ea.getName();
                  return Boolean.valueOf(Objects.equal(_name, _name_1));
                }
              };
              Aspect _findFirst = IterableExtensions.<Aspect>findFirst(StructuralViewGenerator.this.externalAspects, _function_1);
              externalAspect = _findFirst;
            } else {
              ModelConverterProxy _instance = ModelConverterProxy.getInstance();
              Aspect _convertTextRAMModelToRAMModel = _instance.convertTextRAMModelToRAMModel(ea);
              externalAspect = _convertTextRAMModelToRAMModel;
              StructuralViewGenerator.this.externalAspects.add(externalAspect);
            }
            final Instantiation instantiation = RamFactory.eINSTANCE.createInstantiation();
            instantiation.setExternalAspect(externalAspect);
            InstantiationType _type = instantiationHeader.getType();
            instantiation.setType(_type);
            EList<Instantiation> _instantiations = StructuralViewGenerator.this.textRamAspect.getInstantiations();
            final Function1<Instantiation,Boolean> _function_2 = new Function1<Instantiation,Boolean>() {
              public Boolean apply(final Instantiation ins) {
                boolean _and = false;
                Aspect _externalAspect = ins.getExternalAspect();
                String _name = _externalAspect.getName();
                String _name_1 = ea.getName();
                boolean _equals = Objects.equal(_name, _name_1);
                if (!_equals) {
                  _and = false;
                } else {
                  EList<ClassifierMapping> _mappings = ins.getMappings();
                  int _length = ((Object[])Conversions.unwrapArray(_mappings, Object.class)).length;
                  boolean _greaterThan = (_length > 0);
                  _and = _greaterThan;
                }
                return Boolean.valueOf(_and);
              }
            };
            final Instantiation instantiationMapped = IterableExtensions.<Instantiation>findFirst(_instantiations, _function_2);
            boolean _notEquals = (!Objects.equal(instantiationMapped, null));
            if (_notEquals) {
              EList<ClassifierMapping> _mappings = instantiation.getMappings();
              List<ClassifierMapping> _generateMappings = StructuralViewGenerator.this.generateMappings(instantiationMapped, externalAspect);
              _mappings.addAll(_generateMappings);
            }
            result.add(instantiation);
          }
        };
        IterableExtensions.<TAspect>forEach(_externalAspects, _function);
        _xblockexpression = result;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Instantiation generateInstantiation(final Instantiation from) {
    Instantiation _xblockexpression = null;
    {
      ModelConverterProxy _instance = ModelConverterProxy.getInstance();
      Aspect _externalAspect = from.getExternalAspect();
      final Aspect myExternalAspect = _instance.convertTextRAMModelToRAMModel(((TAspect) _externalAspect));
      Instantiation _createInstantiation = RamFactory.eINSTANCE.createInstantiation();
      final Procedure1<Instantiation> _function = new Procedure1<Instantiation>() {
        public void apply(final Instantiation it) {
          it.setExternalAspect(myExternalAspect);
          InstantiationType _instantiationTypeFromHeader = StructuralViewGenerator.this.getInstantiationTypeFromHeader(from);
          it.setType(_instantiationTypeFromHeader);
          EList<ClassifierMapping> _mappings = it.getMappings();
          List<ClassifierMapping> _generateMappings = StructuralViewGenerator.this.generateMappings(from, myExternalAspect);
          _mappings.addAll(_generateMappings);
        }
      };
      final Instantiation result = ObjectExtensions.<Instantiation>operator_doubleArrow(_createInstantiation, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private InstantiationType getInstantiationTypeFromHeader(final Instantiation instantiation) {
    InstantiationType _xblockexpression = null;
    {
      final TAspect tAspect = ((TAspect) this.textRamAspect);
      EList<TInstantiationHeader> _headerInstantiations = tAspect.getHeaderInstantiations();
      final Function1<TInstantiationHeader,Boolean> _function = new Function1<TInstantiationHeader,Boolean>() {
        public Boolean apply(final TInstantiationHeader hi) {
          EList<TAspect> _externalAspects = hi.getExternalAspects();
          final Function1<TAspect,Boolean> _function = new Function1<TAspect,Boolean>() {
            public Boolean apply(final TAspect ea) {
              String _name = ea.getName();
              Aspect _externalAspect = instantiation.getExternalAspect();
              String _name_1 = _externalAspect.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          return Boolean.valueOf(IterableExtensions.<TAspect>exists(_externalAspects, _function));
        }
      };
      final TInstantiationHeader headerInstantiation = IterableExtensions.<TInstantiationHeader>findFirst(_headerInstantiations, _function);
      final InstantiationType type = headerInstantiation.getType();
      _xblockexpression = type;
    }
    return _xblockexpression;
  }
  
  private List<ClassifierMapping> generateMappings(final Instantiation from, final Aspect externalAspect) {
    List<ClassifierMapping> _xblockexpression = null;
    {
      final List<ClassifierMapping> result = CollectionLiterals.<ClassifierMapping>newArrayList();
      EList<ClassifierMapping> _mappings = from.getMappings();
      Iterable<TClassifierMapping> _filter = Iterables.<TClassifierMapping>filter(_mappings, TClassifierMapping.class);
      final Procedure1<TClassifierMapping> _function = new Procedure1<TClassifierMapping>() {
        public void apply(final TClassifierMapping textRamMapping) {
          ClassifierMapping _generateMapping = StructuralViewGenerator.this.generateMapping(textRamMapping, externalAspect);
          result.add(_generateMapping);
        }
      };
      IterableExtensions.<TClassifierMapping>forEach(_filter, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private ClassifierMapping generateMapping(final TClassifierMapping textRamClassifierMapping, final Aspect externalAspect) {
    ClassifierMapping _xblockexpression = null;
    {
      final ClassifierMapping result = RamFactory.eINSTANCE.createClassifierMapping();
      StructuralView _structuralView = externalAspect.getStructuralView();
      EList<Classifier> _classes = _structuralView.getClasses();
      Iterable<ca.mcgill.cs.sel.ram.Class> _filter = Iterables.<ca.mcgill.cs.sel.ram.Class>filter(_classes, ca.mcgill.cs.sel.ram.Class.class);
      final Function1<ca.mcgill.cs.sel.ram.Class,Boolean> _function = new Function1<ca.mcgill.cs.sel.ram.Class,Boolean>() {
        public Boolean apply(final ca.mcgill.cs.sel.ram.Class c) {
          String _name = c.getName();
          Classifier _fromElement = textRamClassifierMapping.getFromElement();
          String _name_1 = _fromElement.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      ca.mcgill.cs.sel.ram.Class _findFirst = IterableExtensions.<ca.mcgill.cs.sel.ram.Class>findFirst(_filter, _function);
      result.setFromElement(_findFirst);
      StructuralView _structuralView_1 = this.ramAspect.getStructuralView();
      EList<Classifier> _classes_1 = _structuralView_1.getClasses();
      Iterable<ca.mcgill.cs.sel.ram.Class> _filter_1 = Iterables.<ca.mcgill.cs.sel.ram.Class>filter(_classes_1, ca.mcgill.cs.sel.ram.Class.class);
      final Function1<ca.mcgill.cs.sel.ram.Class,Boolean> _function_1 = new Function1<ca.mcgill.cs.sel.ram.Class,Boolean>() {
        public Boolean apply(final ca.mcgill.cs.sel.ram.Class c) {
          String _name = c.getName();
          Classifier _toElement = textRamClassifierMapping.getToElement();
          String _name_1 = _toElement.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      ca.mcgill.cs.sel.ram.Class _findFirst_1 = IterableExtensions.<ca.mcgill.cs.sel.ram.Class>findFirst(_filter_1, _function_1);
      result.setToElement(_findFirst_1);
      EList<TClassMember> _fromMembers = textRamClassifierMapping.getFromMembers();
      int _size = _fromMembers.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        EList<TClassMember> _fromMembers_1 = textRamClassifierMapping.getFromMembers();
        int _size_1 = _fromMembers_1.size();
        int _minus = (_size_1 - 1);
        IntegerRange _upTo = new IntegerRange(0, _minus);
        for (final Integer i : _upTo) {
          {
            EList<TClassMember> _fromMembers_2 = textRamClassifierMapping.getFromMembers();
            final TClassMember fromMember = _fromMembers_2.get((i).intValue());
            EList<TClassMember> _toMembers = textRamClassifierMapping.getToMembers();
            final TClassMember toMember = _toMembers.get((i).intValue());
            this.generateMemberMapping(fromMember, toMember, externalAspect, result);
          }
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private boolean _generateMemberMapping(final TAttribute fromMember, final TClassMember toMember, final Aspect externalAspect, final ClassifierMapping classifierMapping) {
    boolean _xblockexpression = false;
    {
      AttributeMapping _createAttributeMapping = RamFactory.eINSTANCE.createAttributeMapping();
      final Procedure1<AttributeMapping> _function = new Procedure1<AttributeMapping>() {
        public void apply(final AttributeMapping it) {
          StructuralView _structuralView = externalAspect.getStructuralView();
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
              String _name_1 = fromMember.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          Attribute _findFirst = IterableExtensions.<Attribute>findFirst(_flatten, _function_1);
          it.setFromElement(_findFirst);
          StructuralView _structuralView_1 = StructuralViewGenerator.this.ramAspect.getStructuralView();
          EList<Classifier> _classes_1 = _structuralView_1.getClasses();
          Iterable<ca.mcgill.cs.sel.ram.Class> _filter_1 = Iterables.<ca.mcgill.cs.sel.ram.Class>filter(_classes_1, ca.mcgill.cs.sel.ram.Class.class);
          final Function1<ca.mcgill.cs.sel.ram.Class,EList<Attribute>> _function_2 = new Function1<ca.mcgill.cs.sel.ram.Class,EList<Attribute>>() {
            public EList<Attribute> apply(final ca.mcgill.cs.sel.ram.Class it) {
              return it.getAttributes();
            }
          };
          Iterable<EList<Attribute>> _map_1 = IterableExtensions.<ca.mcgill.cs.sel.ram.Class, EList<Attribute>>map(_filter_1, _function_2);
          Iterable<Attribute> _flatten_1 = Iterables.<Attribute>concat(_map_1);
          final Function1<Attribute,Boolean> _function_3 = new Function1<Attribute,Boolean>() {
            public Boolean apply(final Attribute a) {
              String _name = a.getName();
              String _name_1 = toMember.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          Attribute _findFirst_1 = IterableExtensions.<Attribute>findFirst(_flatten_1, _function_3);
          it.setToElement(_findFirst_1);
        }
      };
      final AttributeMapping attributeMapping = ObjectExtensions.<AttributeMapping>operator_doubleArrow(_createAttributeMapping, _function);
      EList<AttributeMapping> _attributeMappings = classifierMapping.getAttributeMappings();
      _xblockexpression = _attributeMappings.add(attributeMapping);
    }
    return _xblockexpression;
  }
  
  private boolean _generateMemberMapping(final TOperation fromMember, final TClassMember toMember, final Aspect externalAspect, final ClassifierMapping classifierMapping) {
    boolean _xblockexpression = false;
    {
      final OperationMapping operationMapping = RamFactory.eINSTANCE.createOperationMapping();
      StructuralView _structuralView = externalAspect.getStructuralView();
      EList<Classifier> _classes = _structuralView.getClasses();
      Iterable<ca.mcgill.cs.sel.ram.Class> _filter = Iterables.<ca.mcgill.cs.sel.ram.Class>filter(_classes, ca.mcgill.cs.sel.ram.Class.class);
      final Function1<ca.mcgill.cs.sel.ram.Class,EList<Operation>> _function = new Function1<ca.mcgill.cs.sel.ram.Class,EList<Operation>>() {
        public EList<Operation> apply(final ca.mcgill.cs.sel.ram.Class it) {
          return it.getOperations();
        }
      };
      Iterable<EList<Operation>> _map = IterableExtensions.<ca.mcgill.cs.sel.ram.Class, EList<Operation>>map(_filter, _function);
      Iterable<Operation> _flatten = Iterables.<Operation>concat(_map);
      final Function1<Operation,Boolean> _function_1 = new Function1<Operation,Boolean>() {
        public Boolean apply(final Operation o) {
          String _name = o.getName();
          String _name_1 = fromMember.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      Operation _findFirst = IterableExtensions.<Operation>findFirst(_flatten, _function_1);
      operationMapping.setFromElement(_findFirst);
      StructuralView _structuralView_1 = this.ramAspect.getStructuralView();
      EList<Classifier> _classes_1 = _structuralView_1.getClasses();
      Iterable<ca.mcgill.cs.sel.ram.Class> _filter_1 = Iterables.<ca.mcgill.cs.sel.ram.Class>filter(_classes_1, ca.mcgill.cs.sel.ram.Class.class);
      final Function1<ca.mcgill.cs.sel.ram.Class,EList<Operation>> _function_2 = new Function1<ca.mcgill.cs.sel.ram.Class,EList<Operation>>() {
        public EList<Operation> apply(final ca.mcgill.cs.sel.ram.Class it) {
          return it.getOperations();
        }
      };
      Iterable<EList<Operation>> _map_1 = IterableExtensions.<ca.mcgill.cs.sel.ram.Class, EList<Operation>>map(_filter_1, _function_2);
      Iterable<Operation> _flatten_1 = Iterables.<Operation>concat(_map_1);
      final Function1<Operation,Boolean> _function_3 = new Function1<Operation,Boolean>() {
        public Boolean apply(final Operation a) {
          String _name = a.getName();
          String _name_1 = toMember.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      Operation _findFirst_1 = IterableExtensions.<Operation>findFirst(_flatten_1, _function_3);
      operationMapping.setToElement(_findFirst_1);
      EList<ParameterMapping> _parameterMappings = operationMapping.getParameterMappings();
      Operation _fromElement = operationMapping.getFromElement();
      Operation _toElement = operationMapping.getToElement();
      List<ParameterMapping> _generateParameterMapping = this.generateParameterMapping(_fromElement, _toElement);
      _parameterMappings.addAll(_generateParameterMapping);
      EList<OperationMapping> _operationMappings = classifierMapping.getOperationMappings();
      _xblockexpression = _operationMappings.add(operationMapping);
    }
    return _xblockexpression;
  }
  
  private List<ParameterMapping> generateParameterMapping(final Operation fromOperation, final Operation toOperation) {
    List<ParameterMapping> _xblockexpression = null;
    {
      final List<ParameterMapping> result = CollectionLiterals.<ParameterMapping>newArrayList();
      EList<Parameter> _parameters = fromOperation.getParameters();
      final Procedure1<Parameter> _function = new Procedure1<Parameter>() {
        public void apply(final Parameter fromParm) {
          final ParameterMapping parameterMapping = RamFactory.eINSTANCE.createParameterMapping();
          parameterMapping.setFromElement(fromParm);
          EList<Parameter> _parameters = toOperation.getParameters();
          EList<Parameter> _parameters_1 = fromOperation.getParameters();
          int _indexOf = _parameters_1.indexOf(fromParm);
          Parameter _get = _parameters.get(_indexOf);
          parameterMapping.setToElement(_get);
          result.add(parameterMapping);
        }
      };
      IterableExtensions.<Parameter>forEach(_parameters, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private List<Classifier> createClasses() {
    List<Classifier> _xblockexpression = null;
    {
      final List<Classifier> result = CollectionLiterals.<Classifier>newArrayList();
      StructuralView _structuralView = this.textRamAspect.getStructuralView();
      EList<Classifier> _classes = _structuralView.getClasses();
      Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
      final Procedure1<TClass> _function = new Procedure1<TClass>() {
        public void apply(final TClass textRamClass) {
          ca.mcgill.cs.sel.ram.Class _createClass = StructuralViewGenerator.this.createClass(textRamClass);
          result.add(_createClass);
        }
      };
      IterableExtensions.<TClass>forEach(_filter, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private void generateClasses() {
    StructuralView _structuralView = this.textRamAspect.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    Iterable<TClass> _filter = Iterables.<TClass>filter(_classes, TClass.class);
    final Procedure1<TClass> _function = new Procedure1<TClass>() {
      public void apply(final TClass textRamClass) {
        StructuralView _structuralView = StructuralViewGenerator.this.ramAspect.getStructuralView();
        EList<Classifier> _classes = _structuralView.getClasses();
        final Function1<Classifier,Boolean> _function = new Function1<Classifier,Boolean>() {
          public Boolean apply(final Classifier c) {
            String _name = c.getName();
            String _name_1 = textRamClass.getName();
            return Boolean.valueOf(Objects.equal(_name, _name_1));
          }
        };
        Classifier _findFirst = IterableExtensions.<Classifier>findFirst(_classes, _function);
        final ca.mcgill.cs.sel.ram.Class clazz = ((ca.mcgill.cs.sel.ram.Class) _findFirst);
        StructuralViewGenerator.this.generateClass(textRamClass, clazz);
      }
    };
    IterableExtensions.<TClass>forEach(_filter, _function);
  }
  
  private ca.mcgill.cs.sel.ram.Class createClass(final TClass from) {
    ca.mcgill.cs.sel.ram.Class _xblockexpression = null;
    {
      final ca.mcgill.cs.sel.ram.Class clazz = RamFactory.eINSTANCE.createClass();
      String _name = from.getName();
      clazz.setName(_name);
      boolean _isAbstract = from.isAbstract();
      clazz.setAbstract(_isAbstract);
      boolean _isPartial = from.isPartial();
      clazz.setPartial(_isPartial);
      _xblockexpression = clazz;
    }
    return _xblockexpression;
  }
  
  private boolean generateClass(final TClass from, final ca.mcgill.cs.sel.ram.Class to) {
    boolean _xblockexpression = false;
    {
      EList<Classifier> _superTypes = to.getSuperTypes();
      List<Classifier> _generateSuperTypes = this.generateSuperTypes(from);
      _superTypes.addAll(_generateSuperTypes);
      EList<Operation> _operations = to.getOperations();
      List<Operation> _generateOperations = this.generateOperations(from);
      _operations.addAll(_generateOperations);
      EList<Attribute> _attributes = to.getAttributes();
      List<Attribute> _generateAttributes = this.generateAttributes(from);
      _xblockexpression = _attributes.addAll(_generateAttributes);
    }
    return _xblockexpression;
  }
  
  private List<Classifier> generateSuperTypes(final TClass textRamClass) {
    List<Classifier> _xblockexpression = null;
    {
      final List<Classifier> result = CollectionLiterals.<Classifier>newArrayList();
      EList<Classifier> _superTypes = textRamClass.getSuperTypes();
      final Procedure1<Classifier> _function = new Procedure1<Classifier>() {
        public void apply(final Classifier superType) {
          StructuralView _structuralView = StructuralViewGenerator.this.ramAspect.getStructuralView();
          EList<Classifier> _classes = _structuralView.getClasses();
          final Function1<Classifier,Boolean> _function = new Function1<Classifier,Boolean>() {
            public Boolean apply(final Classifier c) {
              String _name = c.getName();
              String _name_1 = superType.getName();
              return Boolean.valueOf(Objects.equal(_name, _name_1));
            }
          };
          Classifier _findFirst = IterableExtensions.<Classifier>findFirst(_classes, _function);
          result.add(_findFirst);
        }
      };
      IterableExtensions.<Classifier>forEach(_superTypes, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private List<Operation> generateOperations(final TClass textRamClass) {
    List<Operation> _xblockexpression = null;
    {
      final List<Operation> result = CollectionLiterals.<Operation>newArrayList();
      EList<TClassMember> _members = textRamClass.getMembers();
      Iterable<TOperation> _filter = Iterables.<TOperation>filter(_members, TOperation.class);
      final Procedure1<TOperation> _function = new Procedure1<TOperation>() {
        public void apply(final TOperation o) {
          Operation _generateOperation = StructuralViewGenerator.this.generateOperation(o);
          result.add(_generateOperation);
        }
      };
      IterableExtensions.<TOperation>forEach(_filter, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private Operation generateOperation(final TOperation from) {
    Operation _xblockexpression = null;
    {
      Operation _createOperation = RamFactory.eINSTANCE.createOperation();
      final Procedure1<Operation> _function = new Procedure1<Operation>() {
        public void apply(final Operation it) {
          String _name = from.getName();
          it.setName(_name);
          boolean _isAbstract = from.isAbstract();
          it.setAbstract(_isAbstract);
          boolean _isStatic = from.isStatic();
          it.setStatic(_isStatic);
          boolean _isPartial = from.isPartial();
          it.setPartial(_isPartial);
          Type _returnType = from.getReturnType();
          Type _transformType = StructuralViewGenerator.this.transformType(_returnType);
          it.setReturnType(_transformType);
          Visibility _visibility = from.getVisibility();
          it.setVisibility(_visibility);
          EList<Parameter> _parameters = it.getParameters();
          List<Parameter> _generateParameters = StructuralViewGenerator.this.generateParameters(from);
          _parameters.addAll(_generateParameters);
        }
      };
      final Operation result = ObjectExtensions.<Operation>operator_doubleArrow(_createOperation, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private List<Attribute> generateAttributes(final TClass textRamClass) {
    List<Attribute> _xblockexpression = null;
    {
      final List<Attribute> result = CollectionLiterals.<Attribute>newArrayList();
      EList<TClassMember> _members = textRamClass.getMembers();
      Iterable<TAttribute> _filter = Iterables.<TAttribute>filter(_members, TAttribute.class);
      final Procedure1<TAttribute> _function = new Procedure1<TAttribute>() {
        public void apply(final TAttribute o) {
          Attribute _generateAttribute = StructuralViewGenerator.this.generateAttribute(o);
          result.add(_generateAttribute);
        }
      };
      IterableExtensions.<TAttribute>forEach(_filter, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private Attribute generateAttribute(final TAttribute from) {
    Attribute _xblockexpression = null;
    {
      Attribute _createAttribute = RamFactory.eINSTANCE.createAttribute();
      final Procedure1<Attribute> _function = new Procedure1<Attribute>() {
        public void apply(final Attribute it) {
          String _name = from.getName();
          it.setName(_name);
          boolean _isStatic = from.isStatic();
          it.setStatic(_isStatic);
          PrimitiveType _type = from.getType();
          Type _transformType = StructuralViewGenerator.this.transformType(_type);
          it.setType(((PrimitiveType) _transformType));
        }
      };
      final Attribute result = ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private List<Parameter> generateParameters(final TOperation from) {
    List<Parameter> _xblockexpression = null;
    {
      final List<Parameter> result = CollectionLiterals.<Parameter>newArrayList();
      EList<TParameter> _parameters = from.getParameters();
      final Procedure1<TParameter> _function = new Procedure1<TParameter>() {
        public void apply(final TParameter p) {
          Parameter _generateParameter = StructuralViewGenerator.this.generateParameter(p);
          result.add(_generateParameter);
        }
      };
      IterableExtensions.<TParameter>forEach(_parameters, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private Parameter generateParameter(final TParameter from) {
    Parameter _xblockexpression = null;
    {
      Parameter _createParameter = RamFactory.eINSTANCE.createParameter();
      final Procedure1<Parameter> _function = new Procedure1<Parameter>() {
        public void apply(final Parameter it) {
          String _name = from.getName();
          it.setName(_name);
          Type _type = from.getType();
          Type _transformType = StructuralViewGenerator.this.transformType(_type);
          it.setType(_transformType);
        }
      };
      final Parameter result = ObjectExtensions.<Parameter>operator_doubleArrow(_createParameter, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private Type _transformType(final PrimitiveType type) {
    StructuralView _structuralView = this.ramAspect.getStructuralView();
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
  
  private Type _transformType(final Type type) {
    StructuralView _structuralView = this.ramAspect.getStructuralView();
    EList<Classifier> _classes = _structuralView.getClasses();
    final Function1<Classifier,Boolean> _function = new Function1<Classifier,Boolean>() {
      public Boolean apply(final Classifier c) {
        String _name = c.getName();
        String _name_1 = type.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    return IterableExtensions.<Classifier>findFirst(_classes, _function);
  }
  
  private Type _transformType(final RVoid type) {
    StructuralView _structuralView = this.ramAspect.getStructuralView();
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
  
  private Type _transformType(final RSet type) {
    StructuralView _structuralView = this.ramAspect.getStructuralView();
    EList<Type> _types = _structuralView.getTypes();
    Iterable<RSet> _filter = Iterables.<RSet>filter(_types, RSet.class);
    final Function1<RSet,Boolean> _function = new Function1<RSet,Boolean>() {
      public Boolean apply(final RSet t) {
        String _name = t.getName();
        String _name_1 = type.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }
    };
    final RSet res = IterableExtensions.<RSet>findFirst(_filter, _function);
    return res;
  }
  
  private List<Association> generateAssociations() {
    List<Association> _xblockexpression = null;
    {
      final List<Association> result = CollectionLiterals.<Association>newArrayList();
      StructuralView _structuralView = this.textRamAspect.getStructuralView();
      final TStructuralView textRamStructuralView = ((TStructuralView) _structuralView);
      EList<TAssociation> _tAssociations = textRamStructuralView.getTAssociations();
      final Procedure1<TAssociation> _function = new Procedure1<TAssociation>() {
        public void apply(final TAssociation textRamAssoc) {
          Association _generateAssociation = StructuralViewGenerator.this.generateAssociation(textRamAssoc);
          result.add(_generateAssociation);
        }
      };
      IterableExtensions.<TAssociation>forEach(_tAssociations, _function);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private Association generateAssociation(final TAssociation textRamAssoc) {
    Association _xblockexpression = null;
    {
      final Association result = RamFactory.eINSTANCE.createAssociation();
      StructuralView _structuralView = this.ramAspect.getStructuralView();
      EList<Classifier> _classes = _structuralView.getClasses();
      final Function1<Classifier,Boolean> _function = new Function1<Classifier,Boolean>() {
        public Boolean apply(final Classifier c) {
          String _name = c.getName();
          TAssociationEnd _fromEnd = textRamAssoc.getFromEnd();
          TClass _classReference = _fromEnd.getClassReference();
          String _name_1 = _classReference.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      Classifier _findFirst = IterableExtensions.<Classifier>findFirst(_classes, _function);
      final ca.mcgill.cs.sel.ram.Class classFrom = ((ca.mcgill.cs.sel.ram.Class) _findFirst);
      StructuralView _structuralView_1 = this.ramAspect.getStructuralView();
      EList<Classifier> _classes_1 = _structuralView_1.getClasses();
      final Function1<Classifier,Boolean> _function_1 = new Function1<Classifier,Boolean>() {
        public Boolean apply(final Classifier c) {
          String _name = c.getName();
          TAssociationEnd _toEnd = textRamAssoc.getToEnd();
          TClass _classReference = _toEnd.getClassReference();
          String _name_1 = _classReference.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      Classifier _findFirst_1 = IterableExtensions.<Classifier>findFirst(_classes_1, _function_1);
      final ca.mcgill.cs.sel.ram.Class classTo = ((ca.mcgill.cs.sel.ram.Class) _findFirst_1);
      TAssociationEnd _fromEnd = textRamAssoc.getFromEnd();
      TClass _classReference = _fromEnd.getClassReference();
      final String nameFrom = _classReference.getName();
      TAssociationEnd _toEnd = textRamAssoc.getToEnd();
      TClass _classReference_1 = _toEnd.getClassReference();
      final String nameTo = _classReference_1.getName();
      result.setName(((nameFrom + "_") + nameTo));
      final AssociationEnd fromEnd = RamFactory.eINSTANCE.createAssociationEnd();
      fromEnd.setAssoc(result);
      TAssociationEnd _fromEnd_1 = textRamAssoc.getFromEnd();
      int _lowerBound = _fromEnd_1.getLowerBound();
      TAssociationEnd _fromEnd_2 = textRamAssoc.getFromEnd();
      int _lowerBound_1 = _fromEnd_2.getLowerBound();
      int _plus = (_lowerBound + _lowerBound_1);
      boolean _notEquals = (_plus != 0);
      if (_notEquals) {
        TAssociationEnd _fromEnd_3 = textRamAssoc.getFromEnd();
        int _lowerBound_2 = _fromEnd_3.getLowerBound();
        fromEnd.setLowerBound(_lowerBound_2);
        TAssociationEnd _fromEnd_4 = textRamAssoc.getFromEnd();
        int _upperBound = _fromEnd_4.getUpperBound();
        fromEnd.setUpperBound(_upperBound);
      }
      String _name = textRamAssoc.getName();
      String _lowerCaseFirst = StructuralViewGenerator.toLowerCaseFirst(_name);
      fromEnd.setName(_lowerCaseFirst);
      ReferenceType _referenceType = textRamAssoc.getReferenceType();
      boolean _notEquals_1 = (!Objects.equal(_referenceType, null));
      if (_notEquals_1) {
        ReferenceType _referenceType_1 = textRamAssoc.getReferenceType();
        fromEnd.setReferenceType(_referenceType_1);
      }
      final AssociationEnd toEnd = RamFactory.eINSTANCE.createAssociationEnd();
      toEnd.setAssoc(result);
      TAssociationEnd _toEnd_1 = textRamAssoc.getToEnd();
      int _lowerBound_3 = _toEnd_1.getLowerBound();
      TAssociationEnd _toEnd_2 = textRamAssoc.getToEnd();
      int _upperBound_1 = _toEnd_2.getUpperBound();
      int _plus_1 = (_lowerBound_3 + _upperBound_1);
      boolean _notEquals_2 = (_plus_1 != 0);
      if (_notEquals_2) {
        TAssociationEnd _toEnd_3 = textRamAssoc.getToEnd();
        int _lowerBound_4 = _toEnd_3.getLowerBound();
        toEnd.setLowerBound(_lowerBound_4);
        TAssociationEnd _toEnd_4 = textRamAssoc.getToEnd();
        int _upperBound_2 = _toEnd_4.getUpperBound();
        toEnd.setUpperBound(_upperBound_2);
      }
      toEnd.setNavigable(false);
      String _name_1 = classFrom.getName();
      String _lowerCaseFirst_1 = StructuralViewGenerator.toLowerCaseFirst(_name_1);
      toEnd.setName(_lowerCaseFirst_1);
      EList<AssociationEnd> _associationEnds = classFrom.getAssociationEnds();
      _associationEnds.add(fromEnd);
      EList<AssociationEnd> _associationEnds_1 = classTo.getAssociationEnds();
      _associationEnds_1.add(toEnd);
      AssociationDirectionMultiplicity _directionMultplicity = textRamAssoc.getDirectionMultplicity();
      boolean _equals = Objects.equal(_directionMultplicity, AssociationDirectionMultiplicity.BIDIRECTIONAL);
      if (_equals) {
        EList<AssociationEnd> _associationEnds_2 = classFrom.getAssociationEnds();
        _associationEnds_2.add(toEnd);
        EList<AssociationEnd> _associationEnds_3 = classTo.getAssociationEnds();
        _associationEnds_3.add(fromEnd);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  private static String toLowerCaseFirst(final String text) {
    String _xblockexpression = null;
    {
      char[] charArray = text.toCharArray();
      char _get = charArray[0];
      char _lowerCase = Character.toLowerCase(_get);
      charArray[0] = _lowerCase;
      _xblockexpression = String.valueOf(charArray);
    }
    return _xblockexpression;
  }
  
  private boolean generateMemberMapping(final TClassMember fromMember, final TClassMember toMember, final Aspect externalAspect, final ClassifierMapping classifierMapping) {
    if (fromMember instanceof TAttribute) {
      return _generateMemberMapping((TAttribute)fromMember, toMember, externalAspect, classifierMapping);
    } else if (fromMember instanceof TOperation) {
      return _generateMemberMapping((TOperation)fromMember, toMember, externalAspect, classifierMapping);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(fromMember, toMember, externalAspect, classifierMapping).toString());
    }
  }
  
  private Type transformType(final Type type) {
    if (type instanceof RSet) {
      return _transformType((RSet)type);
    } else if (type instanceof PrimitiveType) {
      return _transformType((PrimitiveType)type);
    } else if (type instanceof RVoid) {
      return _transformType((RVoid)type);
    } else if (type != null) {
      return _transformType(type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
}
