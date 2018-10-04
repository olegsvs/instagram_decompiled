package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JacksonDeserializers;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    private static final Class CLASS_CHAR_BUFFER = CharSequence.class;
    private static final Class CLASS_ITERABLE = Iterable.class;
    private static final Class CLASS_OBJECT = Object.class;
    private static final Class CLASS_STRING = String.class;
    public static final HashMap _collectionFallbacks;
    public static final HashMap _mapFallbacks;
    public final DeserializerFactoryConfig _factoryConfig;

    public abstract DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig);

    static {
        HashMap hashMap = new HashMap();
        _mapFallbacks = hashMap;
        hashMap.put(Map.class.getName(), LinkedHashMap.class);
        hashMap = _mapFallbacks;
        hashMap.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        Class cls = TreeMap.class;
        hashMap.put(SortedMap.class.getName(), cls);
        hashMap.put("java.util.NavigableMap", cls);
        try {
            _mapFallbacks.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Problems with (optional) types: ");
            stringBuilder.append(th);
            printStream.println(stringBuilder.toString());
        }
        hashMap = new HashMap();
        _collectionFallbacks = hashMap;
        cls = ArrayList.class;
        hashMap.put(Collection.class.getName(), cls);
        hashMap = _collectionFallbacks;
        hashMap.put(List.class.getName(), cls);
        hashMap.put(Set.class.getName(), HashSet.class);
        hashMap.put(SortedSet.class.getName(), TreeSet.class);
        cls = LinkedList.class;
        hashMap.put(Queue.class.getName(), cls);
        hashMap.put("java.util.Deque", cls);
        hashMap.put("java.util.NavigableSet", TreeSet.class);
    }

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    public void _addDeserializerConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector) {
        BeanDescription beanDescription2 = beanDescription;
        Annotated findDefaultConstructor = beanDescription2.findDefaultConstructor();
        AnnotationIntrospector annotationIntrospector2 = annotationIntrospector;
        CreatorCollector creatorCollector2 = creatorCollector;
        if (findDefaultConstructor != null && (!creatorCollector2.hasDefaultCreator() || annotationIntrospector2.hasCreatorAnnotation(findDefaultConstructor))) {
            creatorCollector2.setDefaultCreator(findDefaultConstructor);
        }
        AnnotatedWithParams annotatedWithParams = null;
        String[] strArr = null;
        for (BeanPropertyDefinition beanPropertyDefinition : beanDescription2.findProperties()) {
            if (beanPropertyDefinition.getConstructorParameter() != null) {
                AnnotatedParameter constructorParameter = beanPropertyDefinition.getConstructorParameter();
                AnnotatedWithParams owner = constructorParameter.getOwner();
                if (owner instanceof AnnotatedConstructor) {
                    if (annotatedWithParams == null) {
                        annotatedWithParams = (AnnotatedConstructor) owner;
                        strArr = new String[annotatedWithParams.getParameterCount()];
                    }
                    strArr[constructorParameter.getIndex()] = beanPropertyDefinition.getName();
                }
            }
        }
        for (AnnotatedWithParams annotatedWithParams2 : beanDescription2.getConstructors()) {
            boolean z;
            VisibilityChecker visibilityChecker2;
            boolean isCreatorVisible;
            BasicDeserializerFactory basicDeserializerFactory;
            DeserializationContext deserializationContext2;
            CreatorProperty[] creatorPropertyArr;
            AnnotatedParameter annotatedParameter;
            int i;
            int i2;
            Annotated parameter;
            String str;
            PropertyName propertyName;
            Object findInjectableValueId;
            int parameterCount = annotatedWithParams2.getParameterCount();
            int i3 = 0;
            if (!annotationIntrospector2.hasCreatorAnnotation(annotatedWithParams2)) {
                if (annotatedWithParams2 != annotatedWithParams) {
                    z = false;
                    visibilityChecker2 = visibilityChecker;
                    isCreatorVisible = visibilityChecker2.isCreatorVisible(annotatedWithParams2);
                    basicDeserializerFactory = this;
                    deserializationContext2 = deserializationContext;
                    if (parameterCount != 1) {
                        _handleSingleArgumentConstructor(deserializationContext2, beanDescription2, visibilityChecker2, annotationIntrospector2, creatorCollector2, annotatedWithParams2, z, isCreatorVisible, annotatedWithParams2 != annotatedWithParams ? strArr[0] : null);
                    } else if (!z || isCreatorVisible) {
                        creatorPropertyArr = new CreatorProperty[parameterCount];
                        annotatedParameter = null;
                        i = 0;
                        i2 = 0;
                        while (i3 < parameterCount) {
                            parameter = annotatedWithParams2.getParameter(i3);
                            str = annotatedWithParams2 != annotatedWithParams ? strArr[i3] : null;
                            if (str == null) {
                                if (parameter != null) {
                                    propertyName = null;
                                } else {
                                    propertyName = annotationIntrospector2.findNameForDeserialization(parameter);
                                }
                                if (propertyName != null) {
                                    str = null;
                                } else {
                                    str = propertyName.getSimpleName();
                                }
                            }
                            findInjectableValueId = annotationIntrospector2.findInjectableValueId(parameter);
                            if (str == null && str.length() > 0) {
                                i++;
                                creatorPropertyArr[i3] = constructCreatorProperty(deserializationContext2, beanDescription2, str, i3, parameter, findInjectableValueId);
                            } else if (findInjectableValueId != null) {
                                i2++;
                                creatorPropertyArr[i3] = constructCreatorProperty(deserializationContext2, beanDescription2, str, i3, parameter, findInjectableValueId);
                            } else if (annotatedParameter == null) {
                                annotatedParameter = parameter;
                            }
                            i3++;
                        }
                        if (!z || i > 0 || i2 > 0) {
                            if (i + i2 != parameterCount) {
                                creatorCollector2.addPropertyCreator(annotatedWithParams2, creatorPropertyArr);
                            } else if (i == 0 || i2 + 1 != parameterCount) {
                                creatorCollector2.addIncompeteParameter(annotatedParameter);
                            } else {
                                creatorCollector2.addDelegatingCreator(annotatedWithParams2, creatorPropertyArr);
                            }
                        }
                    }
                }
            }
            z = true;
            visibilityChecker2 = visibilityChecker;
            isCreatorVisible = visibilityChecker2.isCreatorVisible(annotatedWithParams2);
            basicDeserializerFactory = this;
            deserializationContext2 = deserializationContext;
            if (parameterCount != 1) {
                if (z) {
                }
                creatorPropertyArr = new CreatorProperty[parameterCount];
                annotatedParameter = null;
                i = 0;
                i2 = 0;
                while (i3 < parameterCount) {
                    parameter = annotatedWithParams2.getParameter(i3);
                    if (annotatedWithParams2 != annotatedWithParams) {
                    }
                    if (str == null) {
                        if (parameter != null) {
                            propertyName = annotationIntrospector2.findNameForDeserialization(parameter);
                        } else {
                            propertyName = null;
                        }
                        if (propertyName != null) {
                            str = propertyName.getSimpleName();
                        } else {
                            str = null;
                        }
                    }
                    findInjectableValueId = annotationIntrospector2.findInjectableValueId(parameter);
                    if (str == null) {
                    }
                    if (findInjectableValueId != null) {
                        i2++;
                        creatorPropertyArr[i3] = constructCreatorProperty(deserializationContext2, beanDescription2, str, i3, parameter, findInjectableValueId);
                    } else if (annotatedParameter == null) {
                        annotatedParameter = parameter;
                    }
                    i3++;
                }
                if (z) {
                }
                if (i + i2 != parameterCount) {
                    if (i == 0) {
                    }
                    creatorCollector2.addIncompeteParameter(annotatedParameter);
                } else {
                    creatorCollector2.addPropertyCreator(annotatedWithParams2, creatorPropertyArr);
                }
            } else {
                if (annotatedWithParams2 != annotatedWithParams) {
                }
                _handleSingleArgumentConstructor(deserializationContext2, beanDescription2, visibilityChecker2, annotationIntrospector2, creatorCollector2, annotatedWithParams2, z, isCreatorVisible, annotatedWithParams2 != annotatedWithParams ? strArr[0] : null);
            }
        }
    }

    public void _addDeserializerFactoryMethods(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector) {
        DeserializationContext deserializationContext2 = deserializationContext;
        DeserializationConfig config = deserializationContext2.getConfig();
        BeanDescription beanDescription2 = beanDescription;
        for (AnnotatedMethod annotatedMethod : beanDescription2.getFactoryMethods()) {
            AnnotationIntrospector annotationIntrospector2 = annotationIntrospector;
            boolean hasCreatorAnnotation = annotationIntrospector2.hasCreatorAnnotation(annotatedMethod);
            int parameterCount = annotatedMethod.getParameterCount();
            CreatorCollector creatorCollector2 = creatorCollector;
            if (parameterCount != 0) {
                PropertyName propertyName;
                int i = 0;
                BasicDeserializerFactory basicDeserializerFactory = this;
                if (parameterCount == 1) {
                    Annotated parameter = annotatedMethod.getParameter(0);
                    if (parameter == null) {
                        propertyName = null;
                    } else {
                        propertyName = annotationIntrospector2.findNameForDeserialization(parameter);
                    }
                    String str;
                    if (propertyName == null) {
                        str = null;
                    } else {
                        str = propertyName.getSimpleName();
                    }
                    if (annotationIntrospector2.findInjectableValueId(parameter) == null && (r1 == null || r1.length() == 0)) {
                        AnnotationIntrospector annotationIntrospector3 = annotationIntrospector2;
                        _handleSingleArgumentFactory(config, beanDescription2, visibilityChecker, annotationIntrospector3, creatorCollector2, annotatedMethod, hasCreatorAnnotation);
                    }
                } else if (!annotationIntrospector2.hasCreatorAnnotation(annotatedMethod)) {
                }
                CreatorProperty[] creatorPropertyArr = new CreatorProperty[parameterCount];
                AnnotatedParameter annotatedParameter = null;
                int i2 = 0;
                int i3 = 0;
                while (i < parameterCount) {
                    String str2;
                    Annotated parameter2 = annotatedMethod.getParameter(i);
                    if (parameter2 == null) {
                        propertyName = null;
                    } else {
                        propertyName = annotationIntrospector2.findNameForDeserialization(parameter2);
                    }
                    if (propertyName == null) {
                        str2 = null;
                    } else {
                        str2 = propertyName.getSimpleName();
                    }
                    Object findInjectableValueId = annotationIntrospector2.findInjectableValueId(parameter2);
                    if (str2 != null && str2.length() > 0) {
                        i2++;
                        creatorPropertyArr[i] = constructCreatorProperty(deserializationContext2, beanDescription2, str2, i, parameter2, findInjectableValueId);
                    } else if (findInjectableValueId != null) {
                        i3++;
                        creatorPropertyArr[i] = constructCreatorProperty(deserializationContext2, beanDescription2, str2, i, parameter2, findInjectableValueId);
                    } else if (annotatedParameter == null) {
                        annotatedParameter = parameter2;
                    }
                    i++;
                }
                if (hasCreatorAnnotation || i2 > 0 || i3 > 0) {
                    if (i2 + i3 == parameterCount) {
                        creatorCollector2.addPropertyCreator(annotatedMethod, creatorPropertyArr);
                    } else if (i2 == 0 && i3 + 1 == parameterCount) {
                        creatorCollector2.addDelegatingCreator(annotatedMethod, creatorPropertyArr);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Argument #");
                        stringBuilder.append(annotatedParameter.getIndex());
                        stringBuilder.append(" of factory method ");
                        stringBuilder.append(annotatedMethod);
                        stringBuilder.append(" has no property name annotation; must have name when multiple-paramater constructor annotated as Creator");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            } else if (hasCreatorAnnotation) {
                creatorCollector2.setDefaultCreator(annotatedMethod);
            }
        }
    }

    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        DeserializationContext deserializationContext2 = deserializationContext;
        BeanDescription beanDescription2 = beanDescription;
        CreatorCollector creatorCollector = new CreatorCollector(beanDescription, deserializationContext.canOverrideAccessModifiers());
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        MapperConfig config = deserializationContext.getConfig();
        VisibilityChecker findAutoDetectVisibility = annotationIntrospector.findAutoDetectVisibility(beanDescription.getClassInfo(), config.getDefaultVisibilityChecker());
        _addDeserializerFactoryMethods(deserializationContext2, beanDescription2, findAutoDetectVisibility, annotationIntrospector, creatorCollector);
        if (beanDescription.getType().isConcrete()) {
            _addDeserializerConstructors(deserializationContext2, beanDescription2, findAutoDetectVisibility, annotationIntrospector, creatorCollector);
        }
        return creatorCollector.constructValueInstantiator(config);
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        MapperConfig config = deserializationContext.getConfig();
        BeanDescription introspect = config.introspect(javaType);
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findDeserializerFromAnnotation == null) {
            Class rawClass = javaType.getRawClass();
            if (_findCustomEnumDeserializer(rawClass, config, introspect) == null) {
                EnumResolver constructEnumResolver = constructEnumResolver(rawClass, config, introspect.findJsonValueMethod());
                for (AnnotatedMethod annotatedMethod : introspect.getFactoryMethods()) {
                    if (config.getAnnotationIntrospector().hasCreatorAnnotation(annotatedMethod)) {
                        StringBuilder stringBuilder;
                        if (annotatedMethod.getParameterCount() != 1 || !annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unsuitable method (");
                            stringBuilder.append(annotatedMethod);
                            stringBuilder.append(") decorated with @JsonCreator (for Enum type ");
                            stringBuilder.append(rawClass.getName());
                            stringBuilder.append(")");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else if (annotatedMethod.getGenericParameterType(0) == String.class) {
                            if (config.canOverrideAccessModifiers()) {
                                ClassUtil.checkAndFixAccess(annotatedMethod.getMember());
                            }
                            return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver, annotatedMethod);
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Parameter #0 type for factory method (");
                            stringBuilder.append(annotatedMethod);
                            stringBuilder.append(") not suitable, must be java.lang.String");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                }
                return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver);
            }
        }
        return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, findDeserializerFromAnnotation);
    }

    public JsonDeserializer _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        for (Deserializers findArrayDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer findArrayDeserializer2 = findArrayDeserializer.findArrayDeserializer(arrayType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findArrayDeserializer2 != null) {
                return findArrayDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        for (Deserializers findCollectionDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer findCollectionDeserializer2 = findCollectionDeserializer.findCollectionDeserializer(collectionType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionDeserializer2 != null) {
                return findCollectionDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        for (Deserializers findCollectionLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer findCollectionLikeDeserializer2 = findCollectionLikeDeserializer.findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionLikeDeserializer2 != null) {
                return findCollectionLikeDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer _findCustomEnumDeserializer(Class cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        for (Deserializers findEnumDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer findEnumDeserializer2 = findEnumDeserializer.findEnumDeserializer(cls, deserializationConfig, beanDescription);
            if (findEnumDeserializer2 != null) {
                return findEnumDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        for (Deserializers findMapDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer findMapDeserializer2 = findMapDeserializer.findMapDeserializer(mapType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapDeserializer2 != null) {
                return findMapDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        for (Deserializers findMapLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer findMapLikeDeserializer2 = findMapLikeDeserializer.findMapLikeDeserializer(mapLikeType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapLikeDeserializer2 != null) {
                return findMapLikeDeserializer2;
            }
        }
        return null;
    }

    public JsonDeserializer _findCustomTreeNodeDeserializer(Class cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        for (Deserializers findTreeNodeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer findTreeNodeDeserializer2 = findTreeNodeDeserializer.findTreeNodeDeserializer(cls, deserializationConfig, beanDescription);
            if (findTreeNodeDeserializer2 != null) {
                return findTreeNodeDeserializer2;
            }
        }
        return null;
    }

    public AnnotatedMethod _findJsonValueFor(DeserializationConfig deserializationConfig, JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return deserializationConfig.introspect(javaType).findJsonValueMethod();
    }

    private ValueInstantiator _findStdValueInstantiator(DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        return JacksonDeserializers.findValueInstantiator(deserializationConfig, beanDescription);
    }

    public boolean _handleSingleArgumentConstructor(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, AnnotatedConstructor annotatedConstructor, boolean z, boolean z2, String str) {
        String str2 = str;
        AnnotatedWithParams annotatedWithParams = annotatedConstructor;
        Annotated parameter = annotatedWithParams.getParameter(0);
        AnnotationIntrospector annotationIntrospector2 = annotationIntrospector;
        if (str == null) {
            PropertyName propertyName;
            if (parameter == null) {
                propertyName = null;
            } else {
                propertyName = annotationIntrospector2.findNameForDeserialization(parameter);
            }
            if (propertyName == null) {
                str2 = null;
            } else {
                str2 = propertyName.getSimpleName();
            }
        }
        CreatorCollector creatorCollector2 = creatorCollector;
        if (annotationIntrospector2.findInjectableValueId(parameter) == null) {
            if (str2 == null || str2.length() <= 0) {
                Class rawParameterType = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType != String.class) {
                    if (rawParameterType != Integer.TYPE) {
                        if (rawParameterType != Integer.class) {
                            if (rawParameterType != Long.TYPE) {
                                if (rawParameterType != Long.class) {
                                    if (rawParameterType != Double.TYPE) {
                                        if (rawParameterType != Double.class) {
                                            if (!z) {
                                                return false;
                                            }
                                            creatorCollector2.addDelegatingCreator(annotatedWithParams, null);
                                            return true;
                                        }
                                    }
                                    if (z || z2) {
                                        creatorCollector2.addDoubleCreator(annotatedWithParams);
                                    }
                                }
                            }
                            if (z || z2) {
                                creatorCollector2.addLongCreator(annotatedWithParams);
                            }
                        }
                    }
                    if (z || z2) {
                        creatorCollector2.addIntCreator(annotatedWithParams);
                    }
                } else if (z || z2) {
                    creatorCollector2.addStringCreator(annotatedWithParams);
                }
                return true;
            }
        }
        creatorCollector2.addPropertyCreator(annotatedWithParams, new CreatorProperty[]{constructCreatorProperty(deserializationContext, beanDescription, str2, 0, parameter, r12)});
        return true;
    }

    public boolean _handleSingleArgumentFactory(DeserializationConfig deserializationConfig, BeanDescription beanDescription, VisibilityChecker visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, AnnotatedMethod annotatedMethod, boolean z) {
        beanDescription = annotatedMethod.getRawParameterType(0);
        if (beanDescription != String.class) {
            if (beanDescription != Integer.TYPE) {
                if (beanDescription != Integer.class) {
                    if (beanDescription != Long.TYPE) {
                        if (beanDescription != Long.class) {
                            if (beanDescription != Double.TYPE) {
                                if (beanDescription != Double.class) {
                                    if (beanDescription != Boolean.TYPE) {
                                        if (beanDescription != Boolean.class) {
                                            if (!annotationIntrospector.hasCreatorAnnotation(annotatedMethod)) {
                                                return false;
                                            }
                                            creatorCollector.addDelegatingCreator(annotatedMethod, null);
                                            return true;
                                        }
                                    }
                                    if (z || visibilityChecker.isCreatorVisible(annotatedMethod)) {
                                        creatorCollector.addBooleanCreator(annotatedMethod);
                                    }
                                }
                            }
                            if (z || visibilityChecker.isCreatorVisible(annotatedMethod)) {
                                creatorCollector.addDoubleCreator(annotatedMethod);
                            }
                        }
                    }
                    if (z || visibilityChecker.isCreatorVisible(annotatedMethod)) {
                        creatorCollector.addLongCreator(annotatedMethod);
                    }
                }
            }
            if (z || visibilityChecker.isCreatorVisible(annotatedMethod)) {
                creatorCollector.addIntCreator(annotatedMethod);
            }
        } else if (z || visibilityChecker.isCreatorVisible(annotatedMethod)) {
            creatorCollector.addStringCreator(annotatedMethod);
        }
        return true;
    }

    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class cls = (Class) _collectionFallbacks.get(javaType.getRawClass().getName());
        if (cls == null) {
            return null;
        }
        return (CollectionType) deserializationConfig.constructSpecializedType(javaType, cls);
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class rawClass = javaType.getRawClass();
        if (this._factoryConfig.hasAbstractTypeResolvers()) {
            for (AbstractTypeResolver findTypeMapping : this._factoryConfig.abstractTypeResolvers()) {
                ResolvedType findTypeMapping2 = findTypeMapping.findTypeMapping(deserializationConfig, javaType);
                if (findTypeMapping2 != null && findTypeMapping2.getRawClass() != rawClass) {
                    return findTypeMapping2;
                }
            }
        }
        return null;
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, Annotated annotated, Object obj) {
        if (obj != null) {
            if (obj instanceof ValueInstantiator) {
                return (ValueInstantiator) obj;
            }
            StringBuilder stringBuilder;
            if (obj instanceof Class) {
                Class cls = (Class) obj;
                if (cls != NoClass.class) {
                    if (ValueInstantiator.class.isAssignableFrom(cls)) {
                        HandlerInstantiator handlerInstantiator = deserializationConfig.getHandlerInstantiator();
                        if (handlerInstantiator != null) {
                            ValueInstantiator valueInstantiatorInstance = handlerInstantiator.valueInstantiatorInstance(deserializationConfig, annotated, cls);
                            if (valueInstantiatorInstance != null) {
                                return valueInstantiatorInstance;
                            }
                        }
                        return (ValueInstantiator) ClassUtil.createInstance(cls, deserializationConfig.canOverrideAccessModifiers());
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("AnnotationIntrospector returned Class ");
                    stringBuilder.append(cls.getName());
                    stringBuilder.append("; expected Class<ValueInstantiator>");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("AnnotationIntrospector returned key deserializer definition of type ");
                stringBuilder.append(obj.getClass().getName());
                stringBuilder.append("; expected type KeyDeserializer or Class<KeyDeserializer> instead");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return null;
    }

    public CreatorProperty constructCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, String str, int i, AnnotatedParameter annotatedParameter, Object obj) {
        Boolean bool;
        boolean z;
        DatabindContext databindContext = deserializationContext;
        MapperConfig config = databindContext.getConfig();
        AnnotationIntrospector annotationIntrospector = databindContext.getAnnotationIntrospector();
        Annotated annotated = annotatedParameter;
        if (annotationIntrospector == null) {
            bool = null;
        } else {
            bool = annotationIntrospector.hasRequiredMarker(annotated);
        }
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        BeanDescription beanDescription2 = beanDescription;
        JavaType constructType = config.getTypeFactory().constructType(annotated.getParameterType(), beanDescription2.bindingsForBeanType());
        String str2 = str;
        Std std = new Std(str2, constructType, annotationIntrospector.findWrapperName(annotated), beanDescription2.getClassAnnotations(), annotated, z);
        JavaType resolveType = resolveType(databindContext, beanDescription2, constructType, annotated);
        if (resolveType != constructType) {
            std = std.withType(resolveType);
        }
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(databindContext, annotated);
        JavaType modifyTypeByAnnotation = modifyTypeByAnnotation(databindContext, annotated, resolveType);
        TypeDeserializer typeDeserializer = (TypeDeserializer) modifyTypeByAnnotation.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, modifyTypeByAnnotation);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        CreatorProperty creatorProperty = new CreatorProperty(str2, modifyTypeByAnnotation, std.getWrapperName(), typeDeserializer2, beanDescription2.getClassAnnotations(), annotated, i, obj, std.isRequired());
        return findDeserializerFromAnnotation != null ? creatorProperty.withValueDeserializer(findDeserializerFromAnnotation) : creatorProperty;
    }

    public EnumResolver constructEnumResolver(Class cls, DeserializationConfig deserializationConfig, AnnotatedMethod annotatedMethod) {
        if (annotatedMethod != null) {
            Object annotated = annotatedMethod.getAnnotated();
            if (deserializationConfig.canOverrideAccessModifiers()) {
                ClassUtil.checkAndFixAccess(annotated);
            }
            return EnumResolver.constructUsingMethod(cls, annotated);
        } else if (deserializationConfig.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
            return EnumResolver.constructUsingToString(cls);
        } else {
            return EnumResolver.constructFor(cls, deserializationConfig.getAnnotationIntrospector());
        }
    }

    public JsonDeserializer createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        ArrayType arrayType2 = arrayType;
        ResolvedType contentType = arrayType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        deserializationContext = (TypeDeserializer) contentType.getTypeHandler();
        BasicDeserializerFactory basicDeserializerFactory = this;
        if (deserializationContext == null) {
            deserializationContext = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer _findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType2, config, beanDescription, deserializationContext, jsonDeserializer);
        if (_findCustomArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                Class rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            _findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType2, jsonDeserializer, deserializationContext);
        }
        if (basicDeserializerFactory._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyArrayDeserializer : basicDeserializerFactory._factoryConfig.deserializerModifiers()) {
                _findCustomArrayDeserializer = modifyArrayDeserializer.modifyArrayDeserializer(config, arrayType2, beanDescription, _findCustomArrayDeserializer);
            }
        }
        return _findCustomArrayDeserializer;
    }

    public JsonDeserializer createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, BeanDescription beanDescription) {
        CollectionType collectionType2 = collectionType;
        BeanDescription beanDescription2 = beanDescription;
        ResolvedType contentType = collectionType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        BasicDeserializerFactory basicDeserializerFactory = this;
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer _findCustomCollectionDeserializer = _findCustomCollectionDeserializer(collectionType2, config, beanDescription2, typeDeserializer, jsonDeserializer);
        if (_findCustomCollectionDeserializer == null) {
            Class rawClass = collectionType.getRawClass();
            if (jsonDeserializer == null && EnumSet.class.isAssignableFrom(rawClass)) {
                _findCustomCollectionDeserializer = new EnumSetDeserializer(contentType, null);
            }
        }
        if (_findCustomCollectionDeserializer == null) {
            if (collectionType.isInterface() || collectionType.isAbstract()) {
                ResolvedType _mapAbstractCollectionType = _mapAbstractCollectionType(collectionType, config);
                if (_mapAbstractCollectionType != null) {
                    beanDescription2 = config.introspectForCreation(_mapAbstractCollectionType);
                    collectionType2 = _mapAbstractCollectionType;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can not find a deserializer for non-concrete Collection type ");
                    stringBuilder.append(collectionType);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription2);
            if (!findValueInstantiator.canCreateUsingDefault() && collectionType2.getRawClass() == ArrayBlockingQueue.class) {
                return new ArrayBlockingQueueDeserializer(collectionType2, jsonDeserializer, typeDeserializer, findValueInstantiator, null);
            }
            if (contentType.getRawClass() == String.class) {
                _findCustomCollectionDeserializer = new StringCollectionDeserializer(collectionType2, jsonDeserializer, findValueInstantiator);
            } else {
                _findCustomCollectionDeserializer = new CollectionDeserializer(collectionType2, jsonDeserializer, typeDeserializer, findValueInstantiator);
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyCollectionDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionDeserializer = modifyCollectionDeserializer.modifyCollectionDeserializer(config, collectionType2, beanDescription2, _findCustomCollectionDeserializer);
            }
        }
        return _findCustomCollectionDeserializer;
    }

    public JsonDeserializer createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription) {
        CollectionLikeType collectionLikeType2 = collectionLikeType;
        JavaType contentType = collectionLikeType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        deserializationContext = (TypeDeserializer) contentType.getTypeHandler();
        BasicDeserializerFactory basicDeserializerFactory = this;
        if (deserializationContext == null) {
            deserializationContext = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer _findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType2, config, beanDescription, deserializationContext, jsonDeserializer);
        if (_findCustomCollectionLikeDeserializer != null && basicDeserializerFactory._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyCollectionLikeDeserializer : basicDeserializerFactory._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionLikeDeserializer = modifyCollectionLikeDeserializer.modifyCollectionLikeDeserializer(config, collectionLikeType2, beanDescription, _findCustomCollectionLikeDeserializer);
            }
        }
        return _findCustomCollectionLikeDeserializer;
    }

    public JsonDeserializer createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        Class rawClass = javaType.getRawClass();
        JsonDeserializer _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescription);
        if (_findCustomEnumDeserializer == null) {
            for (AnnotatedMethod annotatedMethod : beanDescription.getFactoryMethods()) {
                if (deserializationContext.getAnnotationIntrospector().hasCreatorAnnotation(annotatedMethod)) {
                    if (annotatedMethod.getParameterCount() == 1 && annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                        _findCustomEnumDeserializer = EnumDeserializer.deserializerForCreator(config, rawClass, annotatedMethod);
                        if (_findCustomEnumDeserializer == null) {
                            _findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, beanDescription.findJsonValueMethod()));
                        }
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unsuitable method (");
                        stringBuilder.append(annotatedMethod);
                        stringBuilder.append(") decorated with @JsonCreator (for Enum type ");
                        stringBuilder.append(rawClass.getName());
                        stringBuilder.append(")");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
            if (_findCustomEnumDeserializer == null) {
                _findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, beanDescription.findJsonValueMethod()));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyEnumDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomEnumDeserializer = modifyEnumDeserializer.modifyEnumDeserializer(config, javaType, beanDescription, _findCustomEnumDeserializer);
            }
        }
        return _findCustomEnumDeserializer;
    }

    public KeyDeserializer createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        MapperConfig config = deserializationContext.getConfig();
        KeyDeserializer keyDeserializer = null;
        if (this._factoryConfig.hasKeyDeserializers()) {
            BeanDescription introspectClassAnnotations = config.introspectClassAnnotations(javaType.getRawClass());
            for (KeyDeserializers findKeyDeserializer : this._factoryConfig.keyDeserializers()) {
                keyDeserializer = findKeyDeserializer.findKeyDeserializer(javaType, config, introspectClassAnnotations);
                if (keyDeserializer != null) {
                    break;
                }
            }
        }
        if (keyDeserializer == null) {
            if (javaType.isEnumType()) {
                return _createEnumKeyDeserializer(deserializationContext, javaType);
            }
            keyDeserializer = StdKeyDeserializers.findStringBasedKeyDeserializer(config, javaType);
        }
        if (keyDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyKeyDeserializer : this._factoryConfig.deserializerModifiers()) {
                keyDeserializer = modifyKeyDeserializer.modifyKeyDeserializer(config, javaType, keyDeserializer);
            }
        }
        return keyDeserializer;
    }

    public JsonDeserializer createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, BeanDescription beanDescription) {
        BeanDescription beanDescription2 = beanDescription;
        MapType mapType2 = mapType;
        MapperConfig config = deserializationContext.getConfig();
        ResolvedType keyType = mapType.getKeyType();
        JavaType contentType = mapType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        BasicDeserializerFactory basicDeserializerFactory = this;
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer _findCustomMapDeserializer = _findCustomMapDeserializer(mapType, config, beanDescription2, keyDeserializer, typeDeserializer, jsonDeserializer);
        if (_findCustomMapDeserializer == null) {
            Class rawClass;
            Class rawClass2 = mapType.getRawClass();
            if (EnumMap.class.isAssignableFrom(rawClass2)) {
                rawClass = keyType.getRawClass();
                if (rawClass == null || !rawClass.isEnum()) {
                    throw new IllegalArgumentException("Can not construct EnumMap; generic (key) type not available");
                }
                _findCustomMapDeserializer = new EnumMapDeserializer(mapType, null, jsonDeserializer, typeDeserializer);
            }
            if (_findCustomMapDeserializer == null) {
                if (mapType.isInterface() || mapType.isAbstract()) {
                    rawClass = (Class) _mapFallbacks.get(rawClass2.getName());
                    if (rawClass != null) {
                        mapType2 = (MapType) config.constructSpecializedType(mapType, rawClass);
                        beanDescription2 = config.introspectForCreation(mapType2);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Can not find a deserializer for non-concrete Map type ");
                        stringBuilder.append(mapType);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                _findCustomMapDeserializer = new MapDeserializer((JavaType) mapType2, findValueInstantiator(deserializationContext, beanDescription2), keyDeserializer, jsonDeserializer, typeDeserializer);
                _findCustomMapDeserializer.setIgnorableProperties(config.getAnnotationIntrospector().findPropertiesToIgnore(beanDescription2.getClassInfo()));
            }
        }
        if (basicDeserializerFactory._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyMapDeserializer : basicDeserializerFactory._factoryConfig.deserializerModifiers()) {
                _findCustomMapDeserializer = modifyMapDeserializer.modifyMapDeserializer(config, mapType2, beanDescription2, _findCustomMapDeserializer);
            }
        }
        return _findCustomMapDeserializer;
    }

    public JsonDeserializer createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription) {
        MapLikeType mapLikeType2 = mapLikeType;
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        BasicDeserializerFactory basicDeserializerFactory = this;
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer _findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType2, config, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
        if (_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyMapLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomMapLikeDeserializer = modifyMapLikeDeserializer.modifyMapLikeDeserializer(config, mapLikeType, beanDescription, _findCustomMapLikeDeserializer);
            }
        }
        return _findCustomMapLikeDeserializer;
    }

    public JsonDeserializer createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Class rawClass = javaType.getRawClass();
        JsonDeserializer _findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, beanDescription);
        if (_findCustomTreeNodeDeserializer != null) {
            return _findCustomTreeNodeDeserializer;
        }
        return JsonNodeDeserializer.getDeserializer(rawClass);
    }

    public JsonDeserializer findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        Class rawClass = javaType.getRawClass();
        String name = rawClass.getName();
        if (!rawClass.isPrimitive()) {
            if (!name.startsWith("java.")) {
                return name.startsWith("com.fasterxml.") ? JacksonDeserializers.find(rawClass) : null;
            }
        }
        if (rawClass == CLASS_OBJECT) {
            return UntypedObjectDeserializer.instance;
        }
        if (rawClass != CLASS_STRING) {
            if (rawClass != CLASS_CHAR_BUFFER) {
                if (rawClass == CLASS_ITERABLE) {
                    return createCollectionDeserializer(deserializationContext, deserializationContext.getTypeFactory().constructCollectionType(Collection.class, javaType.containedTypeCount() > 0 ? javaType.containedType(0) : TypeFactory.unknownType()), beanDescription);
                }
                JsonDeserializer find = NumberDeserializers.find(rawClass, name);
                if (find == null) {
                    find = DateDeserializers.find(rawClass, name);
                    if (find == null) {
                        find = JdkDeserializers.find(rawClass, name);
                    }
                }
                return find;
            }
        }
        return StringDeserializer.instance;
    }

    public JsonDeserializer findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        Object findDeserializer = deserializationContext.getAnnotationIntrospector().findDeserializer(annotated);
        if (findDeserializer == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, findDeserializer);
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        TypeResolverBuilder findPropertyContentTypeResolver = annotationIntrospector.findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        if (findPropertyContentTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, contentType);
        }
        return findPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedMember, deserializationConfig, annotationIntrospector, contentType));
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        TypeResolverBuilder findPropertyTypeResolver = annotationIntrospector.findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        return findPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedMember, deserializationConfig, annotationIntrospector, javaType));
    }

    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) {
        AnnotatedClass classInfo = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        TypeResolverBuilder findTypeResolver = annotationIntrospector.findTypeResolver(deserializationConfig, classInfo, javaType);
        Collection collection = null;
        if (findTypeResolver == null) {
            findTypeResolver = deserializationConfig.getDefaultTyper(javaType);
            if (findTypeResolver == null) {
                return null;
            }
        }
        collection = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypes(classInfo, deserializationConfig, annotationIntrospector);
        if (findTypeResolver.getDefaultImpl() == null && javaType.isAbstract()) {
            ResolvedType mapAbstractType = mapAbstractType(deserializationConfig, javaType);
            if (!(mapAbstractType == null || mapAbstractType.getRawClass() == javaType.getRawClass())) {
                findTypeResolver = findTypeResolver.defaultImpl(mapAbstractType.getRawClass());
            }
        }
        return findTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collection);
    }

    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        Annotated classInfo = beanDescription.getClassInfo();
        Object findValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(classInfo);
        ValueInstantiator _valueInstantiatorInstance = findValueInstantiator != null ? _valueInstantiatorInstance(config, classInfo, findValueInstantiator) : null;
        if (_valueInstantiatorInstance == null) {
            _valueInstantiatorInstance = _findStdValueInstantiator(config, beanDescription);
            if (_valueInstantiatorInstance == null) {
                _valueInstantiatorInstance = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            }
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (ValueInstantiators valueInstantiators : this._factoryConfig.valueInstantiators()) {
                _valueInstantiatorInstance = valueInstantiators.findValueInstantiator(config, beanDescription, _valueInstantiatorInstance);
                if (_valueInstantiatorInstance == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Broken registered ValueInstantiators (of type ");
                    stringBuilder.append(valueInstantiators.getClass().getName());
                    stringBuilder.append("): returned null ValueInstantiator");
                    throw new JsonMappingException(stringBuilder.toString());
                }
            }
        }
        if (_valueInstantiatorInstance.getIncompleteParameter() == null) {
            return _valueInstantiatorInstance;
        }
        AnnotatedParameter incompleteParameter = _valueInstantiatorInstance.getIncompleteParameter();
        AnnotatedWithParams owner = incompleteParameter.getOwner();
        stringBuilder = new StringBuilder();
        stringBuilder.append("Argument #");
        stringBuilder.append(incompleteParameter.getIndex());
        stringBuilder.append(" of constructor ");
        stringBuilder.append(owner);
        stringBuilder.append(" has no property name annotation; must have name when multiple-paramater constructor annotated as Creator");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public DeserializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        ResolvedType _mapAbstractType2;
        StringBuilder stringBuilder;
        while (true) {
            _mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
            if (_mapAbstractType2 == null) {
                return javaType;
            }
            Class rawClass = javaType.getRawClass();
            Class rawClass2 = _mapAbstractType2.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid abstract type resolution from ");
                stringBuilder.append(javaType);
                stringBuilder.append(" to ");
                stringBuilder.append(_mapAbstractType2);
                stringBuilder.append(": latter is not a subtype of former");
            } else {
                ResolvedType resolvedType = _mapAbstractType2;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid abstract type resolution from ");
        stringBuilder.append(javaType);
        stringBuilder.append(" to ");
        stringBuilder.append(_mapAbstractType2);
        stringBuilder.append(": latter is not a subtype of former");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, Annotated annotated, JavaType javaType) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        Class findDeserializationType = annotationIntrospector.findDeserializationType(annotated, javaType);
        if (findDeserializationType != null) {
            try {
                javaType = javaType.narrowBy(findDeserializationType);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to narrow type ");
                stringBuilder.append(javaType);
                stringBuilder.append(" with concrete-type annotation (value ");
                stringBuilder.append(findDeserializationType.getName());
                stringBuilder.append("), method '");
                stringBuilder.append(annotated.getName());
                stringBuilder.append("': ");
                stringBuilder.append(e.getMessage());
                throw new JsonMappingException(stringBuilder.toString(), null, e);
            }
        }
        if (!javaType.isContainerType()) {
            return javaType;
        }
        findDeserializationType = annotationIntrospector.findDeserializationKeyType(annotated, javaType.getKeyType());
        if (findDeserializationType != null) {
            if (javaType instanceof MapLikeType) {
                try {
                    javaType = ((MapLikeType) javaType).narrowKey(findDeserializationType);
                } catch (Throwable e2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to narrow key type ");
                    stringBuilder.append(javaType);
                    stringBuilder.append(" with key-type annotation (");
                    stringBuilder.append(findDeserializationType.getName());
                    stringBuilder.append("): ");
                    stringBuilder.append(e2.getMessage());
                    throw new JsonMappingException(stringBuilder.toString(), null, e2);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal key-type annotation: type ");
            stringBuilder.append(javaType);
            stringBuilder.append(" is not a Map(-like) type");
            throw new JsonMappingException(stringBuilder.toString());
        }
        JavaType keyType = javaType.getKeyType();
        if (keyType != null && keyType.getValueHandler() == null) {
            KeyDeserializer keyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotated, annotationIntrospector.findKeyDeserializer(annotated));
            if (keyDeserializerInstance != null) {
                javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
                javaType.getKeyType();
            }
        }
        findDeserializationType = annotationIntrospector.findDeserializationContentType(annotated, javaType.getContentType());
        if (findDeserializationType != null) {
            try {
                javaType = javaType.narrowContentsBy(findDeserializationType);
            } catch (Throwable e22) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to narrow content type ");
                stringBuilder.append(javaType);
                stringBuilder.append(" with content-type annotation (");
                stringBuilder.append(findDeserializationType.getName());
                stringBuilder.append("): ");
                stringBuilder.append(e22.getMessage());
                throw new JsonMappingException(stringBuilder.toString(), null, e22);
            }
        }
        if (javaType.getContentType().getValueHandler() != null) {
            return javaType;
        }
        JsonDeserializer deserializerInstance = deserializationContext.deserializerInstance(annotated, annotationIntrospector.findContentDeserializer(annotated));
        return deserializerInstance != null ? javaType.withContentValueHandler(deserializerInstance) : javaType;
    }

    public JavaType resolveType(DeserializationContext deserializationContext, BeanDescription beanDescription, JavaType javaType, AnnotatedMember annotatedMember) {
        Object findPropertyTypeDeserializer;
        if (javaType.isContainerType()) {
            AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
            if (javaType.getKeyType() != null) {
                KeyDeserializer keyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember));
                if (keyDeserializerInstance != null) {
                    javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
                    javaType.getKeyType();
                }
            }
            JsonDeserializer deserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (deserializerInstance != null) {
                javaType = javaType.withContentValueHandler(deserializerInstance);
            }
            if (annotatedMember instanceof AnnotatedMember) {
                TypeDeserializer findPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
                if (findPropertyContentTypeDeserializer != null) {
                    javaType = javaType.withContentTypeHandler(findPropertyContentTypeDeserializer);
                }
            }
        }
        if (annotatedMember instanceof AnnotatedMember) {
            findPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        } else {
            findPropertyTypeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), javaType);
        }
        return findPropertyTypeDeserializer != null ? javaType.withTypeHandler(findPropertyTypeDeserializer) : javaType;
    }

    public final DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        return withConfig(this._factoryConfig.withAbstractTypeResolver(abstractTypeResolver));
    }

    public final DeserializerFactory withAdditionalDeserializers(Deserializers deserializers) {
        return withConfig(this._factoryConfig.withAdditionalDeserializers(deserializers));
    }

    public final DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers) {
        return withConfig(this._factoryConfig.withAdditionalKeyDeserializers(keyDeserializers));
    }

    public final DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        return withConfig(this._factoryConfig.withDeserializerModifier(beanDeserializerModifier));
    }

    public final DeserializerFactory withValueInstantiators(ValueInstantiators valueInstantiators) {
        return withConfig(this._factoryConfig.withValueInstantiators(valueInstantiators));
    }
}
