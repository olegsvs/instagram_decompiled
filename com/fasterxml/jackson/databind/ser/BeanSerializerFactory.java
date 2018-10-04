package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);
    private static final long serialVersionUID = 1;

    public BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    public BeanPropertyWriter _constructWriter(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, TypeBindings typeBindings, PropertyBuilder propertyBuilder, boolean z, AnnotatedMember annotatedMember) {
        BeanPropertyDefinition beanPropertyDefinition2 = beanPropertyDefinition;
        String name = beanPropertyDefinition.getName();
        SerializerProvider serializerProvider2 = serializerProvider;
        Annotated annotated = annotatedMember;
        if (serializerProvider.canOverrideAccessModifiers()) {
            annotated.fixAccess();
        }
        ResolvedType type = annotated.getType(typeBindings);
        PropertyBuilder propertyBuilder2 = propertyBuilder;
        BeanProperty std = new Std(name, type, beanPropertyDefinition.getWrapperName(), propertyBuilder2.getClassAnnotations(), annotated, beanPropertyDefinition.isRequired());
        serializerProvider = findSerializerFromAnnotation(serializerProvider, annotated);
        if (serializerProvider instanceof ResolvableSerializer) {
            ((ResolvableSerializer) serializerProvider).resolve(serializerProvider2);
        }
        if (serializerProvider instanceof ContextualSerializer) {
            serializerProvider = ((ContextualSerializer) serializerProvider).createContextual(serializerProvider2, std);
        }
        typeBindings = null;
        if (ClassUtil.isCollectionMapOrArray(type.getRawClass())) {
            typeBindings = findPropertyContentTypeSerializer(type, serializerProvider2.getConfig(), annotated);
        }
        return propertyBuilder2.buildWriter(beanPropertyDefinition2, type, serializerProvider, findPropertyTypeSerializer(type, serializerProvider2.getConfig(), annotated), typeBindings, annotated, z);
    }

    public JsonSerializer _createSerializer2(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) {
        JsonSerializer findSerializerByAnnotations = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
        if (findSerializerByAnnotations == null) {
            SerializationConfig config = serializerProvider.getConfig();
            if (!javaType.isContainerType()) {
                for (Serializers findSerializer : customSerializers()) {
                    findSerializerByAnnotations = findSerializer.findSerializer(config, javaType, beanDescription);
                    if (findSerializerByAnnotations != null) {
                        break;
                    }
                }
            }
            if (!z) {
                z = usesStaticTyping(config, beanDescription, null);
            }
            findSerializerByAnnotations = buildContainerSerializer(serializerProvider, javaType, beanDescription, z);
            if (findSerializerByAnnotations != null) {
            }
            if (findSerializerByAnnotations == null) {
                findSerializerByAnnotations = findSerializerByLookup(javaType, config, beanDescription, z);
                if (findSerializerByAnnotations == null) {
                    findSerializerByAnnotations = findSerializerByPrimaryType(serializerProvider, javaType, beanDescription, z);
                    if (findSerializerByAnnotations == null) {
                        findSerializerByAnnotations = findBeanSerializer(serializerProvider, javaType, beanDescription);
                        if (findSerializerByAnnotations == null) {
                            findSerializerByAnnotations = findSerializerByAddonType(config, javaType, beanDescription, z);
                        }
                    }
                }
            }
            if (findSerializerByAnnotations != null && this._factoryConfig.hasSerializerModifiers()) {
                for (BeanSerializerModifier modifySerializer : this._factoryConfig.serializerModifiers()) {
                    findSerializerByAnnotations = modifySerializer.modifySerializer(config, beanDescription, findSerializerByAnnotations);
                }
            }
        }
        return findSerializerByAnnotations;
    }

    public JsonSerializer constructBeanSerializer(SerializerProvider serializerProvider, BeanDescription beanDescription) {
        Class cls = Object.class;
        if (beanDescription.getBeanClass() == cls) {
            return serializerProvider.getUnknownTypeSerializer(cls);
        }
        MapperConfig config = serializerProvider.getConfig();
        BeanSerializerBuilder constructBeanSerializerBuilder = constructBeanSerializerBuilder(beanDescription);
        constructBeanSerializerBuilder.setConfig(config);
        List findBeanProperties = findBeanProperties(serializerProvider, beanDescription, constructBeanSerializerBuilder);
        if (findBeanProperties == null) {
            findBeanProperties = new ArrayList();
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier changeProperties : this._factoryConfig.serializerModifiers()) {
                findBeanProperties = changeProperties.changeProperties(config, beanDescription, findBeanProperties);
            }
        }
        findBeanProperties = filterBeanProperties(config, beanDescription, findBeanProperties);
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier changeProperties2 : this._factoryConfig.serializerModifiers()) {
                findBeanProperties = changeProperties2.orderProperties(config, beanDescription, findBeanProperties);
            }
        }
        constructBeanSerializerBuilder.setObjectIdWriter(constructObjectIdHandler(serializerProvider, beanDescription, findBeanProperties));
        constructBeanSerializerBuilder.setProperties(findBeanProperties);
        constructBeanSerializerBuilder.setFilterId(findFilterId(config, beanDescription));
        Annotated findAnyGetter = beanDescription.findAnyGetter();
        if (findAnyGetter != null) {
            if (config.canOverrideAccessModifiers()) {
                findAnyGetter.fixAccess();
            }
            JavaType type = findAnyGetter.getType(beanDescription.bindingsForBeanType());
            boolean isEnabled = config.isEnabled(MapperFeature.USE_STATIC_TYPING);
            JavaType contentType = type.getContentType();
            constructBeanSerializerBuilder.setAnyGetter(new AnyGetterWriter(new Std(findAnyGetter.getName(), contentType, null, beanDescription.getClassAnnotations(), findAnyGetter, false), findAnyGetter, MapSerializer.construct(null, type, isEnabled, createTypeSerializer(config, contentType), null, null)));
        }
        processViews(config, constructBeanSerializerBuilder);
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier changeProperties22 : this._factoryConfig.serializerModifiers()) {
                constructBeanSerializerBuilder = changeProperties22.updateBuilder(config, beanDescription, constructBeanSerializerBuilder);
            }
        }
        JsonSerializer build = constructBeanSerializerBuilder.build();
        return (build == null && beanDescription.hasKnownClassAnnotations()) ? constructBeanSerializerBuilder.createDummy() : build;
    }

    public final JsonSerializer constructBeanSerializer(SerializerProvider serializerProvider, BeanDescription beanDescription, BeanProperty beanProperty) {
        return constructBeanSerializer(serializerProvider, beanDescription);
    }

    public BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription beanDescription) {
        return new BeanSerializerBuilder(beanDescription);
    }

    public BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanPropertyWriter, Class[] clsArr) {
        return FilteredBeanPropertyWriter.constructViewBased(beanPropertyWriter, clsArr);
    }

    public ObjectIdWriter constructObjectIdHandler(SerializerProvider serializerProvider, BeanDescription beanDescription, List list) {
        ObjectIdInfo objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo == null) {
            return null;
        }
        Type generatorType = objectIdInfo.getGeneratorType();
        if (generatorType == ObjectIdGenerators$PropertyGenerator.class) {
            String propertyName = objectIdInfo.getPropertyName();
            int size = list.size();
            for (int i = 0; i != size; i++) {
                BeanPropertyWriter beanPropertyWriter = (BeanPropertyWriter) list.get(i);
                if (propertyName.equals(beanPropertyWriter.getName())) {
                    if (i > 0) {
                        list.remove(i);
                        list.add(0, beanPropertyWriter);
                    }
                    return ObjectIdWriter.construct(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(objectIdInfo, beanPropertyWriter), objectIdInfo.getAlwaysAsId());
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid Object Id definition for ");
            stringBuilder.append(beanDescription.getBeanClass().getName());
            stringBuilder.append(": can not find property with name '");
            stringBuilder.append(propertyName);
            stringBuilder.append("'");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return ObjectIdWriter.construct(serializerProvider.getTypeFactory().findTypeParameters(serializerProvider.constructType(generatorType), ObjectIdGenerator.class)[0], objectIdInfo.getPropertyName(), serializerProvider.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo), objectIdInfo.getAlwaysAsId());
    }

    public PropertyBuilder constructPropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return new PropertyBuilder(serializationConfig, beanDescription);
    }

    public JsonSerializer createSerializer(SerializerProvider serializerProvider, JavaType javaType) {
        SerializationConfig config = serializerProvider.getConfig();
        BeanDescription introspect = config.introspect(javaType);
        JsonSerializer findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, introspect.getClassInfo());
        if (findSerializerFromAnnotation != null) {
            return findSerializerFromAnnotation;
        }
        boolean z;
        ResolvedType modifyTypeByAnnotation = modifyTypeByAnnotation(config, introspect.getClassInfo(), javaType);
        if (modifyTypeByAnnotation == javaType) {
            z = false;
        } else {
            if (!modifyTypeByAnnotation.hasRawClass(javaType.getRawClass())) {
                introspect = config.introspect(modifyTypeByAnnotation);
            }
            z = true;
        }
        Converter findSerializationConverter = introspect.findSerializationConverter();
        if (findSerializationConverter == null) {
            return _createSerializer2(serializerProvider, modifyTypeByAnnotation, introspect, z);
        }
        ResolvedType outputType = findSerializationConverter.getOutputType(serializerProvider.getTypeFactory());
        if (!outputType.hasRawClass(modifyTypeByAnnotation.getRawClass())) {
            introspect = config.introspect(outputType);
        }
        return new StdDelegatingSerializer(findSerializationConverter, outputType, _createSerializer2(serializerProvider, outputType, introspect, true));
    }

    public Iterable customSerializers() {
        return this._factoryConfig.serializers();
    }

    public List filterBeanProperties(SerializationConfig serializationConfig, BeanDescription beanDescription, List list) {
        serializationConfig = serializationConfig.getAnnotationIntrospector().findPropertiesToIgnore(beanDescription.getClassInfo());
        if (serializationConfig != null && serializationConfig.length > 0) {
            beanDescription = ArrayBuilders.arrayToSet(serializationConfig);
            serializationConfig = list.iterator();
            while (serializationConfig.hasNext()) {
                if (beanDescription.contains(((BeanPropertyWriter) serializationConfig.next()).getName())) {
                    serializationConfig.remove();
                }
            }
        }
        return list;
    }

    public List findBeanProperties(SerializerProvider serializerProvider, BeanDescription beanDescription, BeanSerializerBuilder beanSerializerBuilder) {
        List<BeanPropertyDefinition> findProperties = beanDescription.findProperties();
        SerializerProvider serializerProvider2 = serializerProvider;
        MapperConfig config = serializerProvider.getConfig();
        BeanSerializerFactory beanSerializerFactory = this;
        removeIgnorableTypes(config, beanDescription, findProperties);
        if (config.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)) {
            removeSetterlessGetters(config, beanDescription, findProperties);
        }
        if (findProperties.isEmpty()) {
            return null;
        }
        serializerProvider = usesStaticTyping(config, beanDescription, null);
        PropertyBuilder constructPropertyBuilder = constructPropertyBuilder(config, beanDescription);
        List arrayList = new ArrayList(findProperties.size());
        TypeBindings bindingsForBeanType = beanDescription.bindingsForBeanType();
        for (BeanPropertyDefinition beanPropertyDefinition : findProperties) {
            beanDescription = beanPropertyDefinition.getAccessor();
            if (!beanPropertyDefinition.isTypeId()) {
                ReferenceProperty findReferenceType = beanPropertyDefinition.findReferenceType();
                if (findReferenceType == null || !findReferenceType.isBackReference()) {
                    if (beanDescription instanceof AnnotatedMethod) {
                        arrayList.add(_constructWriter(serializerProvider2, beanPropertyDefinition, bindingsForBeanType, constructPropertyBuilder, serializerProvider, (AnnotatedMethod) beanDescription));
                    } else {
                        arrayList.add(_constructWriter(serializerProvider2, beanPropertyDefinition, bindingsForBeanType, constructPropertyBuilder, serializerProvider, (AnnotatedField) beanDescription));
                    }
                }
            } else if (beanDescription != null) {
                if (config.canOverrideAccessModifiers()) {
                    beanDescription.fixAccess();
                }
                beanSerializerBuilder.setTypeId(beanDescription);
            }
        }
        return arrayList;
    }

    public JsonSerializer findBeanSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) {
        if (isPotentialBeanType(javaType.getRawClass()) || javaType.isEnumType()) {
            return constructBeanSerializer(serializerProvider, beanDescription);
        }
        return null;
    }

    public final JsonSerializer findBeanSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, BeanProperty beanProperty) {
        return findBeanSerializer(serializerProvider, javaType, beanDescription);
    }

    public Object findFilterId(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return serializationConfig.getAnnotationIntrospector().findFilterId(beanDescription.getClassInfo());
    }

    public TypeSerializer findPropertyContentTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) {
        JavaType contentType = javaType.getContentType();
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        TypeResolverBuilder findPropertyContentTypeResolver = annotationIntrospector.findPropertyContentTypeResolver(serializationConfig, annotatedMember, javaType);
        if (findPropertyContentTypeResolver == null) {
            return createTypeSerializer(serializationConfig, contentType);
        }
        return findPropertyContentTypeResolver.buildTypeSerializer(serializationConfig, contentType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedMember, serializationConfig, annotationIntrospector, contentType));
    }

    public TypeSerializer findPropertyTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        TypeResolverBuilder findPropertyTypeResolver = annotationIntrospector.findPropertyTypeResolver(serializationConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return createTypeSerializer(serializationConfig, javaType);
        }
        return findPropertyTypeResolver.buildTypeSerializer(serializationConfig, javaType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedMember, serializationConfig, annotationIntrospector, javaType));
    }

    public final TypeSerializer findPropertyTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember, BeanProperty beanProperty) {
        return findPropertyTypeSerializer(javaType, serializationConfig, annotatedMember);
    }

    public boolean isPotentialBeanType(Class cls) {
        return ClassUtil.canBeABeanType(cls) == null && !ClassUtil.isProxyType(cls);
    }

    public void processViews(SerializationConfig serializationConfig, BeanSerializerBuilder beanSerializerBuilder) {
        List properties = beanSerializerBuilder.getProperties();
        boolean isEnabled = serializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int size = properties.size();
        BeanPropertyWriter[] beanPropertyWriterArr = new BeanPropertyWriter[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            BeanPropertyWriter beanPropertyWriter = (BeanPropertyWriter) properties.get(i2);
            Class[] views = beanPropertyWriter.getViews();
            if (views != null) {
                i++;
                beanPropertyWriterArr[i2] = constructFilteredBeanWriter(beanPropertyWriter, views);
            } else if (isEnabled) {
                beanPropertyWriterArr[i2] = beanPropertyWriter;
            }
        }
        if (!isEnabled || i != 0) {
            beanSerializerBuilder.setFilteredProperties(beanPropertyWriterArr);
        }
    }

    public void removeIgnorableTypes(SerializationConfig serializationConfig, BeanDescription beanDescription, List list) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Annotated accessor = ((BeanPropertyDefinition) it.next()).getAccessor();
            if (accessor != null) {
                Class rawType = accessor.getRawType();
                Boolean bool = (Boolean) hashMap.get(rawType);
                if (bool == null) {
                    bool = annotationIntrospector.isIgnorableType(serializationConfig.introspectClassAnnotations(rawType).getClassInfo());
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    hashMap.put(rawType, bool);
                }
                if (bool.booleanValue()) {
                }
            }
            it.remove();
        }
    }

    public void removeSetterlessGetters(SerializationConfig serializationConfig, BeanDescription beanDescription, List list) {
        beanDescription = list.iterator();
        while (beanDescription.hasNext()) {
            BeanPropertyDefinition beanPropertyDefinition = (BeanPropertyDefinition) beanDescription.next();
            if (!(beanPropertyDefinition.couldDeserialize() || beanPropertyDefinition.isExplicitlyIncluded())) {
                beanDescription.remove();
            }
        }
    }

    public SerializerFactory withConfig(SerializerFactoryConfig serializerFactoryConfig) {
        if (this._factoryConfig == serializerFactoryConfig) {
            return this;
        }
        if (getClass() == BeanSerializerFactory.class) {
            return new BeanSerializerFactory(serializerFactoryConfig);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Subtype of BeanSerializerFactory (");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(") has not properly overridden method 'withAdditionalSerializers': can not instantiate subtype with ");
        stringBuilder.append("additional serializer definitions");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
