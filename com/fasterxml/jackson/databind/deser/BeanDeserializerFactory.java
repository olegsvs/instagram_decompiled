package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers$AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    private static final Class[] INIT_CAUSE_PARAMS = new Class[]{Throwable.class};
    private static final Class[] NO_VIEWS = new Class[0];
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    private static final long serialVersionUID = 1;

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    public JsonDeserializer _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        for (Deserializers findBeanDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer findBeanDeserializer2 = findBeanDeserializer.findBeanDeserializer(javaType, deserializationConfig, beanDescription);
            if (findBeanDeserializer2 != null) {
                return findBeanDeserializer2;
            }
        }
        return null;
    }

    public void addBeanProps(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        BeanDeserializerBuilder beanDeserializerBuilder2 = beanDeserializerBuilder;
        DatabindContext databindContext = deserializationContext;
        SettableBeanProperty[] fromObjectArguments = beanDeserializerBuilder2.getValueInstantiator().getFromObjectArguments(deserializationContext.getConfig());
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        BeanDescription beanDescription2 = beanDescription;
        Boolean findIgnoreUnknownProperties = annotationIntrospector.findIgnoreUnknownProperties(beanDescription2.getClassInfo());
        if (findIgnoreUnknownProperties != null) {
            beanDeserializerBuilder2.setIgnoreUnknownProperties(findIgnoreUnknownProperties.booleanValue());
        }
        DeserializationContext<String> arrayToSet = ArrayBuilders.arrayToSet(annotationIntrospector.findPropertiesToIgnore(beanDescription2.getClassInfo()));
        for (String addIgnorable : arrayToSet) {
            beanDeserializerBuilder2.addIgnorable(addIgnorable);
        }
        AnnotatedMethod findAnySetter = beanDescription2.findAnySetter();
        BasicDeserializerFactory basicDeserializerFactory = this;
        if (findAnySetter != null) {
            beanDeserializerBuilder2.setAnySetter(constructAnySetter(databindContext, beanDescription2, findAnySetter));
        }
        if (findAnySetter == null) {
            Collection<String> ignoredPropertyNames = beanDescription2.getIgnoredPropertyNames();
            if (ignoredPropertyNames != null) {
                for (String addIgnorable2 : ignoredPropertyNames) {
                    beanDeserializerBuilder2.addIgnorable(addIgnorable2);
                }
            }
        }
        Object obj = (databindContext.isEnabled(MapperFeature.USE_GETTERS_AS_SETTERS) && databindContext.isEnabled(MapperFeature.AUTO_DETECT_GETTERS)) ? 1 : null;
        List filterBeanProps = filterBeanProps(databindContext, beanDescription2, beanDeserializerBuilder2, beanDescription2.findProperties(), arrayToSet);
        if (basicDeserializerFactory._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateProperties : basicDeserializerFactory._factoryConfig.deserializerModifiers()) {
                filterBeanProps = updateProperties.updateProperties(databindContext.getConfig(), beanDescription2, filterBeanProps);
            }
        }
        for (BeanPropertyDefinition beanPropertyDefinition : r5) {
            SettableBeanProperty settableBeanProperty = null;
            if (beanPropertyDefinition.hasConstructorParameter()) {
                String name = beanPropertyDefinition.getName();
                if (fromObjectArguments != null) {
                    for (SettableBeanProperty settableBeanProperty2 : fromObjectArguments) {
                        if (name.equals(settableBeanProperty2.getName())) {
                            settableBeanProperty = settableBeanProperty2;
                            break;
                        }
                    }
                }
                if (settableBeanProperty != null) {
                    beanDeserializerBuilder2.addCreatorProperty(settableBeanProperty);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not find creator property with name '");
                    stringBuilder.append(name);
                    stringBuilder.append("' (in class ");
                    stringBuilder.append(beanDescription2.getBeanClass().getName());
                    stringBuilder.append(")");
                    throw databindContext.mappingException(stringBuilder.toString());
                }
            }
            if (beanPropertyDefinition.hasSetter()) {
                settableBeanProperty = constructSettableProperty(databindContext, beanDescription2, beanPropertyDefinition, beanPropertyDefinition.getSetter().getGenericParameterType(0));
            } else if (beanPropertyDefinition.hasField()) {
                settableBeanProperty = constructSettableProperty(databindContext, beanDescription2, beanPropertyDefinition, beanPropertyDefinition.getField().getGenericType());
            } else if (obj != null && beanPropertyDefinition.hasGetter()) {
                Class rawType = beanPropertyDefinition.getGetter().getRawType();
                if (Collection.class.isAssignableFrom(rawType) || Map.class.isAssignableFrom(rawType)) {
                    settableBeanProperty = constructSetterlessProperty(databindContext, beanDescription2, beanPropertyDefinition);
                }
            }
            if (settableBeanProperty != null) {
                Class[] findViews = beanPropertyDefinition.findViews();
                if (findViews == null && !databindContext.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                    findViews = NO_VIEWS;
                }
                settableBeanProperty.setViews(findViews);
                beanDeserializerBuilder2.addProperty(settableBeanProperty);
            }
        }
    }

    public void addInjectables(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        Map findInjectables = beanDescription.findInjectables();
        if (findInjectables != null) {
            boolean canOverrideAccessModifiers = deserializationContext.canOverrideAccessModifiers();
            for (Entry entry : findInjectables.entrySet()) {
                AnnotatedMember annotatedMember = (AnnotatedMember) entry.getValue();
                if (canOverrideAccessModifiers) {
                    annotatedMember.fixAccess();
                }
                beanDeserializerBuilder.addInjectable(annotatedMember.getName(), beanDescription.resolveType(annotatedMember.getGenericType()), beanDescription.getClassAnnotations(), annotatedMember, entry.getKey());
            }
        }
    }

    public void addObjectIdReader(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        ObjectIdInfo objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo != null) {
            SettableBeanProperty findProperty;
            JavaType type;
            ObjectIdGenerator propertyBasedObjectIdGenerator;
            Class generatorType = objectIdInfo.getGeneratorType();
            if (generatorType == ObjectIdGenerators$PropertyGenerator.class) {
                String propertyName = objectIdInfo.getPropertyName();
                findProperty = beanDeserializerBuilder.findProperty(propertyName);
                if (findProperty != null) {
                    type = findProperty.getType();
                    propertyBasedObjectIdGenerator = new PropertyBasedObjectIdGenerator(objectIdInfo.getScope());
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid Object Id definition for ");
                    stringBuilder.append(beanDescription.getBeanClass().getName());
                    stringBuilder.append(": can not find property with name '");
                    stringBuilder.append(propertyName);
                    stringBuilder.append("'");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            type = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType(generatorType), ObjectIdGenerator.class)[0];
            findProperty = null;
            propertyBasedObjectIdGenerator = deserializationContext.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo);
            beanDeserializerBuilder.setObjectIdReader(ObjectIdReader.construct(type, objectIdInfo.getPropertyName(), propertyBasedObjectIdGenerator, deserializationContext.findRootValueDeserializer(type), findProperty));
        }
    }

    public void addReferenceProperties(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        Map findBackReferenceProperties = beanDescription.findBackReferenceProperties();
        if (findBackReferenceProperties != null) {
            for (Entry entry : findBackReferenceProperties.entrySet()) {
                Type genericParameterType;
                String str = (String) entry.getKey();
                AnnotatedMember annotatedMember = (AnnotatedMember) entry.getValue();
                if (annotatedMember instanceof AnnotatedMethod) {
                    genericParameterType = ((AnnotatedMethod) annotatedMember).getGenericParameterType(0);
                } else {
                    genericParameterType = annotatedMember.getRawType();
                }
                beanDeserializerBuilder.addBackReferenceProperty(str, constructSettableProperty(deserializationContext, beanDescription, SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), annotatedMember), genericParameterType));
            }
        }
    }

    public JsonDeserializer buildBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JsonDeserializer build;
        ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
        BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
        constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator);
        addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        addObjectIdReader(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        addReferenceProperties(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        addInjectables(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        DeserializationConfig config = deserializationContext.getConfig();
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
            }
        }
        if (!javaType.isAbstract() || findValueInstantiator.canInstantiate()) {
            build = constructBeanDeserializerBuilder.build();
        } else {
            build = constructBeanDeserializerBuilder.buildAbstract();
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateBuilder2 : this._factoryConfig.deserializerModifiers()) {
                build = updateBuilder2.modifyDeserializer(config, beanDescription, build);
            }
        }
        return build;
    }

    public JsonDeserializer buildBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        String str;
        ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
        MapperConfig config = deserializationContext.getConfig();
        BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
        constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator);
        addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        addObjectIdReader(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        addReferenceProperties(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        addInjectables(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        Value findPOJOBuilderConfig = beanDescription.findPOJOBuilderConfig();
        if (findPOJOBuilderConfig == null) {
            str = "build";
        } else {
            str = findPOJOBuilderConfig.buildMethodName;
        }
        AnnotatedMethod findMethod = beanDescription.findMethod(str, null);
        if (findMethod != null && config.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(findMethod.getMember());
        }
        constructBeanDeserializerBuilder.setPOJOBuilder(findMethod, findPOJOBuilderConfig);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
            }
        }
        JsonDeserializer buildBuilderBased = constructBeanDeserializerBuilder.buildBuilderBased(javaType, str);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateBuilder2 : this._factoryConfig.deserializerModifiers()) {
                buildBuilderBased = updateBuilder2.modifyDeserializer(config, beanDescription, buildBuilderBased);
            }
        }
        return buildBuilderBased;
    }

    public JsonDeserializer buildThrowableDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
        constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator(deserializationContext, beanDescription));
        addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        AnnotatedMember findMethod = beanDescription.findMethod("initCause", INIT_CAUSE_PARAMS);
        if (findMethod != null) {
            SettableBeanProperty constructSettableProperty = constructSettableProperty(deserializationContext, beanDescription, SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), findMethod, "cause"), findMethod.getGenericParameterType(0));
            if (constructSettableProperty != null) {
                constructBeanDeserializerBuilder.addOrReplaceProperty(constructSettableProperty, true);
            }
        }
        constructBeanDeserializerBuilder.addIgnorable("localizedMessage");
        constructBeanDeserializerBuilder.addIgnorable("suppressed");
        constructBeanDeserializerBuilder.addIgnorable("message");
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
            }
        }
        JsonDeserializer build = constructBeanDeserializerBuilder.build();
        if (build instanceof BeanDeserializer) {
            build = new ThrowableDeserializer((BeanDeserializer) build);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateBuilder2 : this._factoryConfig.deserializerModifiers()) {
                build = updateBuilder2.modifyDeserializer(config, beanDescription, build);
            }
        }
        return build;
    }

    public SettableAnyProperty constructAnySetter(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedMethod annotatedMethod) {
        AnnotatedMember annotatedMember = annotatedMethod;
        if (deserializationContext.canOverrideAccessModifiers()) {
            annotatedMethod.fixAccess();
        }
        JavaType resolveType = beanDescription.bindingsForBeanType().resolveType(annotatedMethod.getGenericParameterType(1));
        BeanProperty std = new Std(annotatedMethod.getName(), resolveType, null, beanDescription.getClassAnnotations(), annotatedMember, false);
        JavaType resolveType2 = resolveType(deserializationContext, beanDescription, resolveType, annotatedMethod);
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedMethod);
        if (findDeserializerFromAnnotation != null) {
            return new SettableAnyProperty(std, annotatedMethod, resolveType2, findDeserializerFromAnnotation);
        }
        return new SettableAnyProperty(std, annotatedMethod, modifyTypeByAnnotation(deserializationContext, annotatedMethod, resolveType2), null);
    }

    public BeanDeserializerBuilder constructBeanDeserializerBuilder(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        return new BeanDeserializerBuilder(beanDescription, deserializationContext.getConfig());
    }

    public SettableBeanProperty constructSettableProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, Type type) {
        SettableBeanProperty methodProperty;
        BeanPropertyDefinition beanPropertyDefinition2 = beanPropertyDefinition;
        Annotated mutator = beanPropertyDefinition.getMutator();
        if (deserializationContext.canOverrideAccessModifiers()) {
            mutator.fixAccess();
        }
        JavaType resolveType = beanDescription.resolveType(type);
        Std std = new Std(beanPropertyDefinition.getName(), resolveType, beanPropertyDefinition.getWrapperName(), beanDescription.getClassAnnotations(), mutator, beanPropertyDefinition.isRequired());
        JavaType resolveType2 = resolveType(deserializationContext, beanDescription, resolveType, mutator);
        if (resolveType2 != resolveType) {
            std.withType(resolveType2);
        }
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, mutator);
        JavaType modifyTypeByAnnotation = modifyTypeByAnnotation(deserializationContext, mutator, resolveType2);
        TypeDeserializer typeDeserializer = (TypeDeserializer) modifyTypeByAnnotation.getTypeHandler();
        if (mutator instanceof AnnotatedMethod) {
            methodProperty = new MethodProperty(beanPropertyDefinition2, modifyTypeByAnnotation, typeDeserializer, beanDescription.getClassAnnotations(), (AnnotatedMethod) mutator);
        } else {
            methodProperty = new FieldProperty(beanPropertyDefinition2, modifyTypeByAnnotation, typeDeserializer, beanDescription.getClassAnnotations(), (AnnotatedField) mutator);
        }
        if (findDeserializerFromAnnotation != null) {
            methodProperty = methodProperty.withValueDeserializer(findDeserializerFromAnnotation);
        }
        ReferenceProperty findReferenceType = beanPropertyDefinition2.findReferenceType();
        if (findReferenceType != null && findReferenceType.isManagedReference()) {
            methodProperty.setManagedReferenceName(findReferenceType.getName());
        }
        return methodProperty;
    }

    public SettableBeanProperty constructSetterlessProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        BeanPropertyDefinition beanPropertyDefinition2 = beanPropertyDefinition;
        beanPropertyDefinition = beanPropertyDefinition.getGetter();
        if (deserializationContext.canOverrideAccessModifiers()) {
            beanPropertyDefinition.fixAccess();
        }
        JavaType type = beanPropertyDefinition.getType(beanDescription.bindingsForBeanType());
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, beanPropertyDefinition);
        JavaType modifyTypeByAnnotation = modifyTypeByAnnotation(deserializationContext, beanPropertyDefinition, type);
        SettableBeanProperty setterlessProperty = new SetterlessProperty(beanPropertyDefinition2, modifyTypeByAnnotation, (TypeDeserializer) modifyTypeByAnnotation.getTypeHandler(), beanDescription.getClassAnnotations(), beanPropertyDefinition);
        return findDeserializerFromAnnotation != null ? setterlessProperty.withValueDeserializer(findDeserializerFromAnnotation) : setterlessProperty;
    }

    public JsonDeserializer createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer _findCustomBeanDeserializer = _findCustomBeanDeserializer(javaType, config, beanDescription);
        if (_findCustomBeanDeserializer == null) {
            if (javaType.isThrowable()) {
                return buildThrowableDeserializer(deserializationContext, javaType, beanDescription);
            }
            if (javaType.isAbstract()) {
                JavaType materializeAbstractType = materializeAbstractType(deserializationContext, javaType, beanDescription);
                if (materializeAbstractType != null) {
                    return buildBeanDeserializer(deserializationContext, materializeAbstractType, config.introspect(materializeAbstractType));
                }
            }
            _findCustomBeanDeserializer = findStdDeserializer(deserializationContext, javaType, beanDescription);
            if (_findCustomBeanDeserializer == null) {
                if (isPotentialBeanType(javaType.getRawClass())) {
                    return buildBeanDeserializer(deserializationContext, javaType, beanDescription);
                }
                return null;
            }
        }
        return _findCustomBeanDeserializer;
    }

    public JsonDeserializer createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class cls) {
        return buildBuilderBasedDeserializer(deserializationContext, javaType, deserializationContext.getConfig().introspectForBuilder(deserializationContext.constructType(cls)));
    }

    public List filterBeanProps(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder, List list, Set set) {
        List arrayList = new ArrayList(Math.max(4, list.size()));
        Map hashMap = new HashMap();
        for (BeanPropertyDefinition beanPropertyDefinition : list) {
            String name = beanPropertyDefinition.getName();
            if (!set.contains(name)) {
                if (!beanPropertyDefinition.hasConstructorParameter()) {
                    Class cls = null;
                    if (beanPropertyDefinition.hasSetter()) {
                        cls = beanPropertyDefinition.getSetter().getRawParameterType(0);
                    } else if (beanPropertyDefinition.hasField()) {
                        cls = beanPropertyDefinition.getField().getRawType();
                    }
                    if (cls != null && isIgnorableType(deserializationContext.getConfig(), beanDescription, cls, hashMap)) {
                        beanDeserializerBuilder.addIgnorable(name);
                    }
                }
                arrayList.add(beanPropertyDefinition);
            }
        }
        return arrayList;
    }

    public JsonDeserializer findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), beanDescription);
    }

    public JsonDeserializer findStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JsonDeserializer findDefaultDeserializer = findDefaultDeserializer(deserializationContext, javaType, beanDescription);
        if (findDefaultDeserializer != null) {
            return findDefaultDeserializer;
        }
        Class cls = AtomicReference.class;
        if (!cls.isAssignableFrom(javaType.getRawClass())) {
            return findOptionalStdDeserializer(deserializationContext, javaType, beanDescription);
        }
        JavaType javaType2;
        JavaType[] findTypeParameters = deserializationContext.getTypeFactory().findTypeParameters(javaType, cls);
        if (findTypeParameters != null) {
            if (findTypeParameters.length >= 1) {
                javaType2 = findTypeParameters[0];
                return new JdkDeserializers$AtomicReferenceDeserializer(javaType2);
            }
        }
        javaType2 = TypeFactory.unknownType();
        return new JdkDeserializers$AtomicReferenceDeserializer(javaType2);
    }

    public boolean isIgnorableType(DeserializationConfig deserializationConfig, BeanDescription beanDescription, Class cls, Map map) {
        Boolean bool = (Boolean) map.get(cls);
        if (bool == null) {
            bool = deserializationConfig.getAnnotationIntrospector().isIgnorableType(deserializationConfig.introspectClassAnnotations(cls).getClassInfo());
            if (bool == null) {
                bool = Boolean.FALSE;
            }
        }
        return bool.booleanValue();
    }

    public boolean isPotentialBeanType(Class cls) {
        StringBuilder stringBuilder;
        String canBeABeanType = ClassUtil.canBeABeanType(cls);
        if (canBeABeanType == null) {
            if (ClassUtil.isProxyType(cls)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Can not deserialize Proxy class ");
                stringBuilder.append(cls.getName());
                stringBuilder.append(" as a Bean");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            canBeABeanType = ClassUtil.isLocalType(cls, true);
            if (canBeABeanType == null) {
                return true;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Can not deserialize Class ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(" (of type ");
        stringBuilder.append(canBeABeanType);
        stringBuilder.append(") as a Bean");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public JavaType materializeAbstractType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JavaType type = beanDescription.getType();
        for (AbstractTypeResolver resolveAbstractType : this._factoryConfig.abstractTypeResolvers()) {
            JavaType resolveAbstractType2 = resolveAbstractType.resolveAbstractType(deserializationContext.getConfig(), type);
            if (resolveAbstractType2 != null) {
                return resolveAbstractType2;
            }
        }
        return null;
    }

    public DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig) {
        if (this._factoryConfig == deserializerFactoryConfig) {
            return this;
        }
        if (getClass() == BeanDeserializerFactory.class) {
            return new BeanDeserializerFactory(deserializerFactoryConfig);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Subtype of BeanDeserializerFactory (");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(") has not properly overridden method 'withAdditionalDeserializers': can not instantiate subtype with ");
        stringBuilder.append("additional deserializer definitions");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
