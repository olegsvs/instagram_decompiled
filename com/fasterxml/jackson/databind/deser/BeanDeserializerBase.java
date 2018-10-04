package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class BeanDeserializerBase extends StdDeserializer implements ContextualDeserializer, ResolvableDeserializer, Serializable {
    private static final long serialVersionUID = -2038793552422727904L;
    public SettableAnyProperty _anySetter;
    public final Map _backRefs;
    public final BeanPropertyMap _beanProperties;
    public final JavaType _beanType;
    private final transient Annotations _classAnnotations;
    public JsonDeserializer _delegateDeserializer;
    public ExternalTypeHandler _externalTypeIdHandler;
    public final HashSet _ignorableProps;
    public final boolean _ignoreAllUnknown;
    public final ValueInjector[] _injectables;
    public final boolean _needViewProcesing;
    public boolean _nonStandardCreation;
    public final ObjectIdReader _objectIdReader;
    public PropertyBasedCreator _propertyBasedCreator;
    public final Shape _serializationShape;
    public transient HashMap _subDeserializers;
    public UnwrappedPropertyHandler _unwrappedPropertyHandler;
    public final ValueInstantiator _valueInstantiator;
    public boolean _vanillaProcessing;

    public abstract Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract BeanDeserializerBase asArrayDeserializer();

    public abstract Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext);

    public boolean isCachable() {
        return true;
    }

    public abstract JsonDeserializer unwrappingDeserializer(NameTransformer nameTransformer);

    public abstract BeanDeserializerBase withIgnorableProperties(HashSet hashSet);

    public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader);

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase) {
        this(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase._beanType);
        this._classAnnotations = beanDeserializerBase._classAnnotations;
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._objectIdReader = objectIdReader;
        if (objectIdReader == null) {
            this._beanProperties = beanDeserializerBase._beanProperties;
            return;
        }
        this._beanProperties = beanDeserializerBase._beanProperties.withProperty(new ObjectIdValueProperty(objectIdReader, true));
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        boolean z;
        UnwrappedPropertyHandler unwrappedPropertyHandler;
        super(beanDeserializerBase._beanType);
        this._classAnnotations = beanDeserializerBase._classAnnotations;
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        if (nameTransformer == null) {
            if (!beanDeserializerBase._ignoreAllUnknown) {
                z = false;
                this._ignoreAllUnknown = z;
                this._anySetter = beanDeserializerBase._anySetter;
                this._injectables = beanDeserializerBase._injectables;
                this._objectIdReader = beanDeserializerBase._objectIdReader;
                this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
                unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
                if (nameTransformer == null) {
                    if (unwrappedPropertyHandler != null) {
                        unwrappedPropertyHandler = unwrappedPropertyHandler.renameAll(nameTransformer);
                    }
                    this._beanProperties = beanDeserializerBase._beanProperties.renameAll(nameTransformer);
                } else {
                    this._beanProperties = beanDeserializerBase._beanProperties;
                }
                this._unwrappedPropertyHandler = unwrappedPropertyHandler;
                this._needViewProcesing = beanDeserializerBase._needViewProcesing;
                this._serializationShape = beanDeserializerBase._serializationShape;
                this._vanillaProcessing = false;
            }
        }
        z = true;
        this._ignoreAllUnknown = z;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        if (nameTransformer == null) {
            this._beanProperties = beanDeserializerBase._beanProperties;
        } else {
            if (unwrappedPropertyHandler != null) {
                unwrappedPropertyHandler = unwrappedPropertyHandler.renameAll(nameTransformer);
            }
            this._beanProperties = beanDeserializerBase._beanProperties.renameAll(nameTransformer);
        }
        this._unwrappedPropertyHandler = unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, HashSet hashSet) {
        super(beanDeserializerBase._beanType);
        this._classAnnotations = beanDeserializerBase._classAnnotations;
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = hashSet;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._beanProperties = beanDeserializerBase._beanProperties;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase._beanType);
        this._classAnnotations = beanDeserializerBase._classAnnotations;
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanDeserializerBase._beanProperties;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = z;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    public BeanDeserializerBase(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, BeanPropertyMap beanPropertyMap, Map map, HashSet hashSet, boolean z, boolean z2) {
        ValueInjector[] valueInjectorArr;
        boolean z3;
        boolean z4;
        Value findExpectedFormat;
        super(beanDescription.getType());
        this._classAnnotations = beanDescription.getClassInfo().getAnnotations();
        this._beanType = beanDescription.getType();
        this._valueInstantiator = beanDeserializerBuilder.getValueInstantiator();
        this._beanProperties = beanPropertyMap;
        this._backRefs = map;
        this._ignorableProps = hashSet;
        this._ignoreAllUnknown = z;
        this._anySetter = beanDeserializerBuilder.getAnySetter();
        List injectables = beanDeserializerBuilder.getInjectables();
        Shape shape = null;
        if (injectables != null) {
            if (!injectables.isEmpty()) {
                valueInjectorArr = (ValueInjector[]) injectables.toArray(new ValueInjector[injectables.size()]);
                this._injectables = valueInjectorArr;
                this._objectIdReader = beanDeserializerBuilder.getObjectIdReader();
                z3 = false;
                if (!(this._unwrappedPropertyHandler != null || this._valueInstantiator.canCreateUsingDelegate() || this._valueInstantiator.canCreateFromObjectWith())) {
                    if (!this._valueInstantiator.canCreateUsingDefault()) {
                        z4 = false;
                        this._nonStandardCreation = z4;
                        findExpectedFormat = beanDescription.findExpectedFormat(null);
                        if (findExpectedFormat != null) {
                            shape = findExpectedFormat.getShape();
                        }
                        this._serializationShape = shape;
                        this._needViewProcesing = z2;
                        if (!(this._nonStandardCreation || this._injectables != null || this._needViewProcesing || this._objectIdReader == null)) {
                            z3 = true;
                        }
                        this._vanillaProcessing = z3;
                    }
                }
                z4 = true;
                this._nonStandardCreation = z4;
                findExpectedFormat = beanDescription.findExpectedFormat(null);
                if (findExpectedFormat != null) {
                    shape = findExpectedFormat.getShape();
                }
                this._serializationShape = shape;
                this._needViewProcesing = z2;
                z3 = true;
                this._vanillaProcessing = z3;
            }
        }
        valueInjectorArr = null;
        this._injectables = valueInjectorArr;
        this._objectIdReader = beanDeserializerBuilder.getObjectIdReader();
        z3 = false;
        if (!this._valueInstantiator.canCreateUsingDefault()) {
            z4 = false;
            this._nonStandardCreation = z4;
            findExpectedFormat = beanDescription.findExpectedFormat(null);
            if (findExpectedFormat != null) {
                shape = findExpectedFormat.getShape();
            }
            this._serializationShape = shape;
            this._needViewProcesing = z2;
            z3 = true;
            this._vanillaProcessing = z3;
        }
        z4 = true;
        this._nonStandardCreation = z4;
        findExpectedFormat = beanDescription.findExpectedFormat(null);
        if (findExpectedFormat != null) {
            shape = findExpectedFormat.getShape();
        }
        this._serializationShape = shape;
        this._needViewProcesing = z2;
        z3 = true;
        this._vanillaProcessing = z3;
    }

    public JsonDeserializer _findSubclassDeserializer(DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) {
        synchronized (this) {
            try {
                JsonDeserializer jsonDeserializer = this._subDeserializers == null ? null : (JsonDeserializer) this._subDeserializers.get(new ClassKey(obj.getClass()));
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    break;
                }
            }
        }
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer findRootValueDeserializer = deserializationContext.findRootValueDeserializer(deserializationContext.constructType(obj.getClass()));
        if (findRootValueDeserializer != null) {
            synchronized (this) {
                try {
                    if (this._subDeserializers == null) {
                        this._subDeserializers = new HashMap();
                    }
                    this._subDeserializers.put(new ClassKey(obj.getClass()), findRootValueDeserializer);
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            }
        }
        return findRootValueDeserializer;
    }

    public SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        JsonDeserializer valueDeserializer = settableBeanProperty.getValueDeserializer();
        if ((valueDeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase) valueDeserializer).getValueInstantiator().canCreateUsingDefault()) {
            Class rawClass = settableBeanProperty.getType().getRawClass();
            Class outerClass = ClassUtil.getOuterClass(rawClass);
            if (outerClass != null && outerClass == this._beanType.getRawClass()) {
                for (Constructor constructor : rawClass.getConstructors()) {
                    Class[] parameterTypes = constructor.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes[0] == outerClass) {
                        if (deserializationContext.getConfig().canOverrideAccessModifiers()) {
                            ClassUtil.checkAndFixAccess(constructor);
                        }
                        return new InnerClassProperty(settableBeanProperty, constructor);
                    }
                }
            }
        }
        return settableBeanProperty;
    }

    public SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty settableBeanProperty2 = settableBeanProperty;
        String managedReferenceName = settableBeanProperty.getManagedReferenceName();
        if (managedReferenceName == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty findBackReference;
        ResolvedType resolvedType;
        ResolvedType type;
        StringBuilder stringBuilder;
        JsonDeserializer valueDeserializer = settableBeanProperty.getValueDeserializer();
        if (valueDeserializer instanceof BeanDeserializerBase) {
            findBackReference = ((BeanDeserializerBase) valueDeserializer).findBackReference(managedReferenceName);
        } else if (valueDeserializer instanceof ContainerDeserializerBase) {
            JsonDeserializer contentDeserializer = ((ContainerDeserializerBase) valueDeserializer).getContentDeserializer();
            if (contentDeserializer instanceof BeanDeserializerBase) {
                findBackReference = ((BeanDeserializerBase) contentDeserializer).findBackReference(managedReferenceName);
                deserializationContext = true;
                if (findBackReference == null) {
                    resolvedType = this._beanType;
                    type = findBackReference.getType();
                    if (type.getRawClass().isAssignableFrom(resolvedType.getRawClass())) {
                        return new ManagedReferenceProperty(settableBeanProperty2, managedReferenceName, findBackReference, this._classAnnotations, deserializationContext);
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Can not handle managed/back reference '");
                    stringBuilder.append(managedReferenceName);
                    stringBuilder.append("': back reference type (");
                    stringBuilder.append(type.getRawClass().getName());
                    stringBuilder.append(") not compatible with managed type (");
                    stringBuilder.append(resolvedType.getRawClass().getName());
                    stringBuilder.append(")");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Can not handle managed/back reference '");
                stringBuilder.append(managedReferenceName);
                stringBuilder.append("': no back reference property found from type ");
                stringBuilder.append(settableBeanProperty.getType());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            String str;
            if (contentDeserializer == null) {
                str = "NULL";
            } else {
                str = contentDeserializer.getClass().getName();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can not handle managed/back reference '");
            stringBuilder.append(managedReferenceName);
            stringBuilder.append("': value deserializer is of type ContainerDeserializerBase, but content type is not handled by a BeanDeserializer ");
            stringBuilder.append(" (instead it's of type ");
            stringBuilder.append(str);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (valueDeserializer instanceof AbstractDeserializer) {
            findBackReference = ((AbstractDeserializer) valueDeserializer).findBackReference(managedReferenceName);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can not handle managed/back reference '");
            stringBuilder.append(managedReferenceName);
            stringBuilder.append("': type for value deserializer is not BeanDeserializer or ContainerDeserializerBase, but ");
            stringBuilder.append(valueDeserializer.getClass().getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        deserializationContext = null;
        if (findBackReference == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can not handle managed/back reference '");
            stringBuilder.append(managedReferenceName);
            stringBuilder.append("': no back reference property found from type ");
            stringBuilder.append(settableBeanProperty.getType());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        resolvedType = this._beanType;
        type = findBackReference.getType();
        if (type.getRawClass().isAssignableFrom(resolvedType.getRawClass())) {
            return new ManagedReferenceProperty(settableBeanProperty2, managedReferenceName, findBackReference, this._classAnnotations, deserializationContext);
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Can not handle managed/back reference '");
        stringBuilder.append(managedReferenceName);
        stringBuilder.append("': back reference type (");
        stringBuilder.append(type.getRawClass().getName());
        stringBuilder.append(") not compatible with managed type (");
        stringBuilder.append(resolvedType.getRawClass().getName());
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public SettableBeanProperty _resolveUnwrappedProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        AnnotatedMember member = settableBeanProperty.getMember();
        if (member != null) {
            NameTransformer findUnwrappingNameTransformer = deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(member);
            if (findUnwrappingNameTransformer != null) {
                JsonDeserializer valueDeserializer = settableBeanProperty.getValueDeserializer();
                JsonDeserializer unwrappingDeserializer = valueDeserializer.unwrappingDeserializer(findUnwrappingNameTransformer);
                if (!(unwrappingDeserializer == valueDeserializer || unwrappingDeserializer == null)) {
                    return settableBeanProperty.withValueDeserializer(unwrappingDeserializer);
                }
            }
        }
        return null;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        Annotated member;
        Object[] objArr;
        JsonDeserializer withObjectIdReader;
        Value findFormat;
        ObjectIdReader objectIdReader = this._objectIdReader;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        Shape shape = null;
        if (beanProperty != null) {
            if (annotationIntrospector != null) {
                member = beanProperty.getMember();
                if (beanProperty != null || annotationIntrospector == null) {
                    objArr = null;
                } else {
                    objArr = annotationIntrospector.findPropertiesToIgnore(member);
                    ObjectIdInfo findObjectIdInfo = annotationIntrospector.findObjectIdInfo(member);
                    if (findObjectIdInfo != null) {
                        SettableBeanProperty findProperty;
                        JavaType type;
                        ObjectIdGenerator propertyBasedObjectIdGenerator;
                        ObjectIdInfo findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, findObjectIdInfo);
                        Class generatorType = findObjectReferenceInfo.getGeneratorType();
                        if (generatorType == ObjectIdGenerators$PropertyGenerator.class) {
                            String propertyName = findObjectReferenceInfo.getPropertyName();
                            findProperty = findProperty(propertyName);
                            if (findProperty != null) {
                                type = findProperty.getType();
                                propertyBasedObjectIdGenerator = new PropertyBasedObjectIdGenerator(findObjectReferenceInfo.getScope());
                            } else {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid Object Id definition for ");
                                stringBuilder.append(getBeanClass().getName());
                                stringBuilder.append(": can not find property with name '");
                                stringBuilder.append(propertyName);
                                stringBuilder.append("'");
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        }
                        type = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType(generatorType), ObjectIdGenerator.class)[0];
                        propertyBasedObjectIdGenerator = deserializationContext.objectIdGeneratorInstance(member, findObjectReferenceInfo);
                        findProperty = null;
                        objectIdReader = ObjectIdReader.construct(type, findObjectReferenceInfo.getPropertyName(), propertyBasedObjectIdGenerator, deserializationContext.findRootValueDeserializer(type), findProperty);
                    }
                }
                withObjectIdReader = (objectIdReader != null || objectIdReader == this._objectIdReader) ? this : withObjectIdReader(objectIdReader);
                if (!(objArr == null || objArr.length == 0)) {
                    withObjectIdReader = withObjectIdReader.withIgnorableProperties(ArrayBuilders.setAndArray(withObjectIdReader._ignorableProps, objArr));
                }
                if (member != null) {
                    findFormat = annotationIntrospector.findFormat(member);
                    if (findFormat != null) {
                        shape = findFormat.getShape();
                    }
                }
                if (shape == null) {
                    shape = this._serializationShape;
                }
                return shape != Shape.ARRAY ? withObjectIdReader.asArrayDeserializer() : withObjectIdReader;
            }
        }
        member = null;
        if (beanProperty != null) {
        }
        objArr = null;
        if (objectIdReader != null) {
        }
        withObjectIdReader = withObjectIdReader.withIgnorableProperties(ArrayBuilders.setAndArray(withObjectIdReader._ignorableProps, objArr));
        if (member != null) {
            findFormat = annotationIntrospector.findFormat(member);
            if (findFormat != null) {
                shape = findFormat.getShape();
            }
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        if (shape != Shape.ARRAY) {
        }
    }

    public Iterator creatorProperties() {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        if (propertyBasedCreator == null) {
            return Collections.emptyList().iterator();
        }
        return propertyBasedCreator.properties().iterator();
    }

    public Object deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            try {
                Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, createUsingDelegate);
                }
                return createUsingDelegate;
            } catch (Throwable e) {
                wrapInstantiationProblem(e, deserializationContext);
            }
        }
        throw deserializationContext.mappingException(getBeanClass());
    }

    public Object deserializeFromBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._delegateDeserializer == null || this._valueInstantiator.canCreateFromBoolean()) {
            return this._valueInstantiator.createFromBoolean(deserializationContext, jsonParser.getCurrentToken() == JsonToken.VALUE_TRUE);
        }
        Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate);
        }
        return createUsingDelegate;
    }

    public Object deserializeFromDouble(JsonParser jsonParser, DeserializationContext deserializationContext) {
        switch (jsonParser.getNumberType().ordinal()) {
            case 3:
            case 4:
                if (this._delegateDeserializer == null || this._valueInstantiator.canCreateFromDouble()) {
                    return this._valueInstantiator.createFromDouble(deserializationContext, jsonParser.getDoubleValue());
                }
                Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, createUsingDelegate);
                }
                return createUsingDelegate;
            default:
                JsonDeserializer jsonDeserializer = this._delegateDeserializer;
                if (jsonDeserializer != null) {
                    return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
                }
                throw deserializationContext.instantiationException(getBeanClass(), "no suitable creator method found to deserialize from JSON floating-point number");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object deserializeFromNumber(com.fasterxml.jackson.core.JsonParser r3, com.fasterxml.jackson.databind.DeserializationContext r4) {
        /*
        r2 = this;
        r0 = r2._objectIdReader;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r2.deserializeFromObjectId(r3, r4);
        return r0;
    L_0x0009:
        r0 = r3.getNumberType();
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x0053;
            case 1: goto L_0x002a;
            default: goto L_0x0014;
        };
    L_0x0014:
        r0 = r2._delegateDeserializer;
        if (r0 == 0) goto L_0x007b;
    L_0x0018:
        r1 = r2._valueInstantiator;
        r0 = r0.deserialize(r3, r4);
        r1 = r1.createUsingDelegate(r4, r0);
        r0 = r2._injectables;
        if (r0 == 0) goto L_0x0047;
    L_0x0026:
        r2.injectValues(r4, r1);
        goto L_0x0047;
    L_0x002a:
        r0 = r2._delegateDeserializer;
        if (r0 == 0) goto L_0x0048;
    L_0x002e:
        r0 = r2._valueInstantiator;
        r0 = r0.canCreateFromInt();
        if (r0 != 0) goto L_0x0048;
    L_0x0036:
        r1 = r2._valueInstantiator;
        r0 = r2._delegateDeserializer;
        r0 = r0.deserialize(r3, r4);
        r1 = r1.createUsingDelegate(r4, r0);
        r0 = r2._injectables;
        if (r0 == 0) goto L_0x0047;
    L_0x0046:
        goto L_0x0026;
    L_0x0047:
        return r1;
    L_0x0048:
        r2 = r2._valueInstantiator;
        r0 = r3.getLongValue();
        r0 = r2.createFromLong(r4, r0);
        return r0;
    L_0x0053:
        r0 = r2._delegateDeserializer;
        if (r0 == 0) goto L_0x0070;
    L_0x0057:
        r0 = r2._valueInstantiator;
        r0 = r0.canCreateFromInt();
        if (r0 != 0) goto L_0x0070;
    L_0x005f:
        r1 = r2._valueInstantiator;
        r0 = r2._delegateDeserializer;
        r0 = r0.deserialize(r3, r4);
        r1 = r1.createUsingDelegate(r4, r0);
        r0 = r2._injectables;
        if (r0 == 0) goto L_0x0047;
    L_0x006f:
        goto L_0x0026;
    L_0x0070:
        r1 = r2._valueInstantiator;
        r0 = r3.getIntValue();
        r0 = r1.createFromInt(r4, r0);
        return r0;
    L_0x007b:
        r1 = r2.getBeanClass();
        r0 = "no suitable creator method found to deserialize from JSON integer number";
        r0 = r4.instantiationException(r1, r0);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromNumber(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Object");
    }

    public Object deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object deserialize = this._objectIdReader.deserializer.deserialize(jsonParser, deserializationContext);
        Object obj = deserializationContext.findObjectId(deserialize, this._objectIdReader.generator).item;
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not resolve Object Id [");
        stringBuilder.append(deserialize);
        stringBuilder.append("] (for ");
        stringBuilder.append(this._beanType);
        stringBuilder.append(") -- unresolved forward-reference?");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public Object deserializeFromObjectUsingNonDefault(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        if (this._beanType.isAbstract()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not instantiate abstract type ");
            stringBuilder.append(this._beanType);
            stringBuilder.append(" (need to add/enable type information?)");
            throw JsonMappingException.from(jsonParser, stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("No suitable constructor found for type ");
        stringBuilder.append(this._beanType);
        stringBuilder.append(": can not instantiate from JSON object (need to add/enable type information?)");
        throw JsonMappingException.from(jsonParser, stringBuilder.toString());
    }

    public Object deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        if (this._delegateDeserializer == null || this._valueInstantiator.canCreateFromString()) {
            return this._valueInstantiator.createFromString(deserializationContext, jsonParser.getText());
        }
        Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate);
        }
        return createUsingDelegate;
    }

    public Object deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = this._objectIdReader.propertyName;
        if (str.equals(jsonParser.getCurrentName())) {
            return deserializeFromObject(jsonParser, deserializationContext);
        }
        JsonGenerator tokenBuffer = new TokenBuffer(jsonParser.getCodec());
        JsonGenerator jsonGenerator = null;
        while (jsonParser.getCurrentToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            if (jsonGenerator != null) {
                jsonGenerator.writeFieldName(currentName);
                jsonParser.nextToken();
                jsonGenerator.copyCurrentStructure(jsonParser);
            } else if (str.equals(currentName)) {
                jsonGenerator = new TokenBuffer(jsonParser.getCodec());
                jsonGenerator.writeFieldName(currentName);
                jsonParser.nextToken();
                jsonGenerator.copyCurrentStructure(jsonParser);
                jsonGenerator.append(tokenBuffer);
                tokenBuffer = null;
            } else {
                tokenBuffer.writeFieldName(currentName);
                jsonParser.nextToken();
                tokenBuffer.copyCurrentStructure(jsonParser);
            }
            jsonParser.nextToken();
        }
        if (jsonGenerator == null) {
            jsonGenerator = tokenBuffer;
        }
        jsonGenerator.writeEndObject();
        JsonParser asParser = jsonGenerator.asParser();
        asParser.nextToken();
        return deserializeFromObject(asParser, deserializationContext);
    }

    public final Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        if (this._objectIdReader != null) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken != null && currentToken.isScalarValue()) {
                return deserializeFromObjectId(jsonParser, deserializationContext);
            }
        }
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        Map map = this._backRefs;
        if (map == null) {
            return null;
        }
        return (SettableBeanProperty) map.get(str);
    }

    public JsonDeserializer findConvertingDeserializer(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            Object findDeserializationConverter = annotationIntrospector.findDeserializationConverter(settableBeanProperty.getMember());
            if (findDeserializationConverter != null) {
                Converter converterInstance = deserializationContext.converterInstance(settableBeanProperty.getMember(), findDeserializationConverter);
                JavaType inputType = converterInstance.getInputType(deserializationContext.getTypeFactory());
                return new StdDelegatingDeserializer(converterInstance, inputType, deserializationContext.findContextualValueDeserializer(inputType, settableBeanProperty));
            }
        }
        return null;
    }

    public SettableBeanProperty findProperty(String str) {
        SettableBeanProperty settableBeanProperty;
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        if (beanPropertyMap == null) {
            settableBeanProperty = null;
        } else {
            settableBeanProperty = beanPropertyMap.find(str);
        }
        if (settableBeanProperty != null) {
            return settableBeanProperty;
        }
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        return propertyBasedCreator != null ? propertyBasedCreator.findCreatorProperty(str) : settableBeanProperty;
    }

    public final Class getBeanClass() {
        return this._beanType.getRawClass();
    }

    public Collection getKnownPropertyNames() {
        Collection arrayList = new ArrayList();
        Iterator it = this._beanProperties.iterator();
        while (it.hasNext()) {
            arrayList.add(((SettableBeanProperty) it.next()).getName());
        }
        return arrayList;
    }

    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public int getPropertyCount() {
        return this._beanProperties.size();
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public JavaType getValueType() {
        return this._beanType;
    }

    public Object handlePolymorphic(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) {
        JsonDeserializer _findSubclassDeserializer = _findSubclassDeserializer(deserializationContext, obj, tokenBuffer);
        if (_findSubclassDeserializer != null) {
            if (tokenBuffer != null) {
                tokenBuffer.writeEndObject();
                JsonParser asParser = tokenBuffer.asParser();
                asParser.nextToken();
                obj = _findSubclassDeserializer.deserialize(asParser, deserializationContext, obj);
            }
            return jsonParser != null ? _findSubclassDeserializer.deserialize(jsonParser, deserializationContext, obj) : obj;
        } else {
            if (tokenBuffer != null) {
                obj = handleUnknownProperties(deserializationContext, obj, tokenBuffer);
            }
            if (jsonParser != null) {
                return deserialize(jsonParser, deserializationContext, obj);
            }
            return obj;
        }
    }

    public Object handleUnknownProperties(DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) {
        tokenBuffer.writeEndObject();
        JsonParser asParser = tokenBuffer.asParser();
        while (asParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = asParser.getCurrentName();
            asParser.nextToken();
            handleUnknownProperty(asParser, deserializationContext, obj, currentName);
        }
        return obj;
    }

    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        if (!this._ignoreAllUnknown) {
            HashSet hashSet = this._ignorableProps;
            if (hashSet == null || !hashSet.contains(str)) {
                super.handleUnknownProperty(jsonParser, deserializationContext, obj, str);
                return;
            }
        }
        jsonParser.skipChildren();
    }

    public void handleUnknownVanilla(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        HashSet hashSet = this._ignorableProps;
        if (hashSet == null || !hashSet.contains(str)) {
            SettableAnyProperty settableAnyProperty = this._anySetter;
            if (settableAnyProperty != null) {
                try {
                    settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, str);
                    return;
                } catch (Throwable e) {
                    wrapAndThrow(e, obj, str, deserializationContext);
                    return;
                }
            }
            handleUnknownProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        jsonParser.skipChildren();
    }

    public boolean hasProperty(String str) {
        return this._beanProperties.find(str) != null;
    }

    public boolean hasViews() {
        return this._needViewProcesing;
    }

    public void injectValues(DeserializationContext deserializationContext, Object obj) {
        for (ValueInjector inject : this._injectables) {
            inject.inject(deserializationContext, obj);
        }
    }

    public Iterator properties() {
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        if (beanPropertyMap != null) {
            return beanPropertyMap.iterator();
        }
        throw new IllegalStateException("Can only call after BeanDeserializer has been resolved");
    }

    public void replaceProperty(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        this._beanProperties.replace(settableBeanProperty2);
    }

    public void resolve(DeserializationContext deserializationContext) {
        Builder builder;
        SettableBeanProperty _resolveInnerClassValuedProperty;
        TypeDeserializer valueTypeDeserializer;
        UnwrappedPropertyHandler unwrappedPropertyHandler = null;
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            PropertyBasedCreator construct = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()));
            this._propertyBasedCreator = construct;
            builder = null;
            for (SettableBeanProperty _resolveInnerClassValuedProperty2 : construct.properties()) {
                if (_resolveInnerClassValuedProperty2.hasValueTypeDeserializer()) {
                    valueTypeDeserializer = _resolveInnerClassValuedProperty2.getValueTypeDeserializer();
                    if (valueTypeDeserializer.getTypeInclusion() == As.EXTERNAL_PROPERTY) {
                        if (builder == null) {
                            builder = new Builder();
                        }
                        builder.addExternal(_resolveInnerClassValuedProperty2, valueTypeDeserializer);
                    }
                }
            }
        } else {
            builder = null;
        }
        Iterator it = this._beanProperties.iterator();
        while (it.hasNext()) {
            JsonDeserializer createContextual;
            SettableBeanProperty settableBeanProperty;
            SettableBeanProperty _resolveManagedReferenceProperty;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) it.next();
            if (settableBeanProperty2.hasValueDeserializer()) {
                JsonDeserializer valueDeserializer = settableBeanProperty2.getValueDeserializer();
                if (valueDeserializer instanceof ContextualDeserializer) {
                    createContextual = ((ContextualDeserializer) valueDeserializer).createContextual(deserializationContext, settableBeanProperty2);
                    if (createContextual != valueDeserializer) {
                    }
                }
                settableBeanProperty = settableBeanProperty2;
                _resolveManagedReferenceProperty = _resolveManagedReferenceProperty(deserializationContext, settableBeanProperty);
                settableBeanProperty = _resolveUnwrappedProperty(deserializationContext, _resolveManagedReferenceProperty);
                if (settableBeanProperty == null) {
                    if (unwrappedPropertyHandler == null) {
                        unwrappedPropertyHandler = new UnwrappedPropertyHandler();
                    }
                    unwrappedPropertyHandler.addProperty(settableBeanProperty);
                } else {
                    _resolveInnerClassValuedProperty2 = _resolveInnerClassValuedProperty(deserializationContext, _resolveManagedReferenceProperty);
                    if (_resolveInnerClassValuedProperty2 != settableBeanProperty2) {
                        this._beanProperties.replace(_resolveInnerClassValuedProperty2);
                    }
                    if (_resolveInnerClassValuedProperty2.hasValueTypeDeserializer()) {
                        valueTypeDeserializer = _resolveInnerClassValuedProperty2.getValueTypeDeserializer();
                        if (valueTypeDeserializer.getTypeInclusion() != As.EXTERNAL_PROPERTY) {
                            if (builder == null) {
                                builder = new Builder();
                            }
                            builder.addExternal(_resolveInnerClassValuedProperty2, valueTypeDeserializer);
                            this._beanProperties.remove(_resolveInnerClassValuedProperty2);
                        }
                    }
                }
            } else {
                createContextual = findConvertingDeserializer(deserializationContext, settableBeanProperty2);
                if (createContextual == null) {
                    createContextual = findDeserializer(deserializationContext, settableBeanProperty2.getType(), settableBeanProperty2);
                }
            }
            settableBeanProperty = settableBeanProperty2.withValueDeserializer(createContextual);
            _resolveManagedReferenceProperty = _resolveManagedReferenceProperty(deserializationContext, settableBeanProperty);
            settableBeanProperty = _resolveUnwrappedProperty(deserializationContext, _resolveManagedReferenceProperty);
            if (settableBeanProperty == null) {
                _resolveInnerClassValuedProperty2 = _resolveInnerClassValuedProperty(deserializationContext, _resolveManagedReferenceProperty);
                if (_resolveInnerClassValuedProperty2 != settableBeanProperty2) {
                    this._beanProperties.replace(_resolveInnerClassValuedProperty2);
                }
                if (_resolveInnerClassValuedProperty2.hasValueTypeDeserializer()) {
                    valueTypeDeserializer = _resolveInnerClassValuedProperty2.getValueTypeDeserializer();
                    if (valueTypeDeserializer.getTypeInclusion() != As.EXTERNAL_PROPERTY) {
                        if (builder == null) {
                            builder = new Builder();
                        }
                        builder.addExternal(_resolveInnerClassValuedProperty2, valueTypeDeserializer);
                        this._beanProperties.remove(_resolveInnerClassValuedProperty2);
                    }
                }
            } else {
                if (unwrappedPropertyHandler == null) {
                    unwrappedPropertyHandler = new UnwrappedPropertyHandler();
                }
                unwrappedPropertyHandler.addProperty(settableBeanProperty);
            }
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (!(settableAnyProperty == null || settableAnyProperty.hasValueDeserializer())) {
            SettableAnyProperty settableAnyProperty2 = this._anySetter;
            this._anySetter = settableAnyProperty2.withValueDeserializer(findDeserializer(deserializationContext, settableAnyProperty2.getType(), this._anySetter.getProperty()));
        }
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType != null) {
                this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, new Std(null, delegateType, null, this._classAnnotations, this._valueInstantiator.getDelegateCreator(), false));
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid delegate-creator definition for ");
                stringBuilder.append(this._beanType);
                stringBuilder.append(": value instantiator (");
                stringBuilder.append(this._valueInstantiator.getClass().getName());
                stringBuilder.append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        boolean z = true;
        if (builder != null) {
            this._externalTypeIdHandler = builder.build();
            this._nonStandardCreation = true;
        }
        this._unwrappedPropertyHandler = unwrappedPropertyHandler;
        if (unwrappedPropertyHandler != null) {
            this._nonStandardCreation = true;
        }
        if (!this._vanillaProcessing || this._nonStandardCreation) {
            z = false;
        }
        this._vanillaProcessing = z;
    }

    private Throwable throwOrReturnThrowable(Throwable th, DeserializationContext deserializationContext) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        Object obj;
        if (deserializationContext != null) {
            if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                obj = null;
                if (!(th instanceof IOException)) {
                    if (obj == null) {
                        if (!(th instanceof RuntimeException)) {
                            throw ((RuntimeException) th);
                        }
                    }
                } else if (obj != null || !(th instanceof JsonProcessingException)) {
                    throw ((IOException) th);
                }
                return th;
            }
        }
        obj = 1;
        if (!(th instanceof IOException)) {
            if (obj != null) {
            }
            throw ((IOException) th);
        } else if (obj == null) {
            if (!(th instanceof RuntimeException)) {
                throw ((RuntimeException) th);
            }
        }
        return th;
    }

    public void wrapAndThrow(Throwable th, Object obj, int i, DeserializationContext deserializationContext) {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, i);
    }

    public void wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, str);
    }

    public void wrapInstantiationProblem(Throwable th, DeserializationContext deserializationContext) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        Object obj;
        if (deserializationContext != null) {
            if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                obj = null;
                if (!(th instanceof IOException)) {
                    throw ((IOException) th);
                } else if (obj == null || !(th instanceof RuntimeException)) {
                    throw deserializationContext.instantiationException(this._beanType.getRawClass(), th);
                } else {
                    throw ((RuntimeException) th);
                }
            }
        }
        obj = 1;
        if (!(th instanceof IOException)) {
            throw ((IOException) th);
        }
        if (obj == null) {
        }
        throw deserializationContext.instantiationException(this._beanType.getRawClass(), th);
    }
}
