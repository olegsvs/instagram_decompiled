package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.Converter$None;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BasicBeanDescription extends BeanDescription {
    public final AnnotationIntrospector _annotationIntrospector;
    public AnnotatedMember _anyGetter;
    public AnnotatedMethod _anySetterMethod;
    public TypeBindings _bindings;
    public final AnnotatedClass _classInfo;
    public final MapperConfig _config;
    public Set _ignoredPropertyNames;
    public Map _injectables;
    public AnnotatedMethod _jsonValueMethod;
    public ObjectIdInfo _objectIdInfo;
    public final List _properties;

    public BasicBeanDescription(MapperConfig mapperConfig, JavaType javaType, AnnotatedClass annotatedClass, List list) {
        AnnotationIntrospector annotationIntrospector;
        super(javaType);
        this._config = mapperConfig;
        if (mapperConfig == null) {
            annotationIntrospector = null;
        } else {
            annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        }
        this._annotationIntrospector = annotationIntrospector;
        this._classInfo = annotatedClass;
        this._properties = list;
    }

    public BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector) {
        this(pOJOPropertiesCollector.getConfig(), pOJOPropertiesCollector.getType(), pOJOPropertiesCollector.getClassDef(), pOJOPropertiesCollector.getProperties());
        this._objectIdInfo = pOJOPropertiesCollector.getObjectIdInfo();
    }

    public Converter _createConverter(Object obj) {
        Converter converter = null;
        if (obj != null) {
            if (obj instanceof Converter) {
                return (Converter) obj;
            }
            StringBuilder stringBuilder;
            if (obj instanceof Class) {
                Class cls = (Class) obj;
                if (cls != Converter$None.class) {
                    if (cls != NoClass.class) {
                        if (Converter.class.isAssignableFrom(cls)) {
                            HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
                            if (handlerInstantiator != null) {
                                converter = handlerInstantiator.converterInstance(this._config, this._classInfo, cls);
                            }
                            if (converter == null) {
                                converter = (Converter) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers());
                            }
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("AnnotationIntrospector returned Class ");
                            stringBuilder.append(cls.getName());
                            stringBuilder.append("; expected Class<Converter>");
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                }
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("AnnotationIntrospector returned Converter definition of type ");
                stringBuilder.append(obj.getClass().getName());
                stringBuilder.append("; expected type Converter or Class<Converter> instead");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return converter;
    }

    public LinkedHashMap _findPropertyFields(Collection collection, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (BeanPropertyDefinition beanPropertyDefinition : this._properties) {
            AnnotatedField field = beanPropertyDefinition.getField();
            if (field != null) {
                String name = beanPropertyDefinition.getName();
                if (collection == null || !collection.contains(name)) {
                    linkedHashMap.put(name, field);
                }
            }
        }
        return linkedHashMap;
    }

    public TypeBindings bindingsForBeanType() {
        if (this._bindings == null) {
            this._bindings = new TypeBindings(this._config.getTypeFactory(), this._type);
        }
        return this._bindings;
    }

    public AnnotatedMember findAnyGetter() {
        Annotated annotated = this._anyGetter;
        if (annotated != null) {
            if (!Map.class.isAssignableFrom(annotated.getRawType())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid 'any-getter' annotation on method ");
                stringBuilder.append(this._anyGetter.getName());
                stringBuilder.append("(): return type is not instance of java.util.Map");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return this._anyGetter;
    }

    public AnnotatedMethod findAnySetter() {
        AnnotatedWithParams annotatedWithParams = this._anySetterMethod;
        if (annotatedWithParams != null) {
            Class rawParameterType = annotatedWithParams.getRawParameterType(0);
            if (rawParameterType != String.class) {
                if (rawParameterType != Object.class) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid 'any-setter' annotation on method ");
                    stringBuilder.append(this._anySetterMethod.getName());
                    stringBuilder.append("(): first argument not of type String or Object, but ");
                    stringBuilder.append(rawParameterType.getName());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        return this._anySetterMethod;
    }

    public Map findBackReferenceProperties() {
        Map map = null;
        for (BeanPropertyDefinition mutator : this._properties) {
            AnnotatedMember mutator2 = mutator.getMutator();
            if (mutator2 != null) {
                ReferenceProperty findReferenceType = this._annotationIntrospector.findReferenceType(mutator2);
                if (findReferenceType != null && findReferenceType.isBackReference()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    String name = findReferenceType.getName();
                    if (map.put(name, mutator2) != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Multiple back-reference properties with name '");
                        stringBuilder.append(name);
                        stringBuilder.append("'");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
        }
        return map;
    }

    public List findCreatorPropertyNames() {
        List list = null;
        int i = 0;
        while (i < 2) {
            for (AnnotatedWithParams annotatedWithParams : i == 0 ? getConstructors() : getFactoryMethods()) {
                int parameterCount = annotatedWithParams.getParameterCount();
                int i2 = 1;
                if (parameterCount >= 1) {
                    PropertyName findNameForDeserialization = this._annotationIntrospector.findNameForDeserialization(annotatedWithParams.getParameter(0));
                    if (findNameForDeserialization != null) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(findNameForDeserialization.getSimpleName());
                        while (i2 < parameterCount) {
                            Object obj;
                            findNameForDeserialization = this._annotationIntrospector.findNameForDeserialization(annotatedWithParams.getParameter(i2));
                            if (findNameForDeserialization == null) {
                                obj = null;
                            } else {
                                obj = findNameForDeserialization.getSimpleName();
                            }
                            list.add(obj);
                            i2++;
                        }
                    }
                }
            }
            i++;
        }
        return list == null ? Collections.emptyList() : list;
    }

    public AnnotatedConstructor findDefaultConstructor() {
        return this._classInfo.getDefaultConstructor();
    }

    public Converter findDeserializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findDeserializationConverter(this._classInfo));
    }

    public Value findExpectedFormat(Value value) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector != null) {
            Value findFormat = annotationIntrospector.findFormat(this._classInfo);
            if (findFormat != null) {
                return findFormat;
            }
        }
        return value;
    }

    public Method findFactoryMethod(Class... clsArr) {
        for (AnnotatedMethod annotatedMethod : this._classInfo.getStaticMethods()) {
            if (isFactoryMethod(annotatedMethod)) {
                int i = 0;
                Class rawParameterType = annotatedMethod.getRawParameterType(0);
                int length = clsArr.length;
                while (i < length) {
                    if (rawParameterType.isAssignableFrom(clsArr[i])) {
                        return annotatedMethod.getAnnotated();
                    }
                    i++;
                }
                continue;
            }
        }
        return null;
    }

    public Map findInjectables() {
        return this._injectables;
    }

    public AnnotatedMethod findJsonValueMethod() {
        return this._jsonValueMethod;
    }

    public AnnotatedMethod findMethod(String str, Class[] clsArr) {
        return this._classInfo.findMethod(str, clsArr);
    }

    public Class findPOJOBuilder() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilder(this._classInfo);
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilderConfig(this._classInfo);
    }

    public List findProperties() {
        return this._properties;
    }

    public Converter findSerializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findSerializationConverter(this._classInfo));
    }

    public Include findSerializationInclusion(Include include) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return include;
        }
        return annotationIntrospector.findSerializationInclusion(this._classInfo, include);
    }

    public Constructor findSingleArgConstructor(Class... clsArr) {
        for (AnnotatedConstructor annotatedConstructor : this._classInfo.getConstructors()) {
            if (annotatedConstructor.getParameterCount() == 1) {
                int i = 0;
                Class rawParameterType = annotatedConstructor.getRawParameterType(0);
                int length = clsArr.length;
                while (i < length) {
                    if (clsArr[i] == rawParameterType) {
                        return annotatedConstructor.getAnnotated();
                    }
                    i++;
                }
                continue;
            }
        }
        return null;
    }

    public static BasicBeanDescription forDeserialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        BasicBeanDescription basicBeanDescription = new BasicBeanDescription(pOJOPropertiesCollector);
        basicBeanDescription._anySetterMethod = pOJOPropertiesCollector.getAnySetterMethod();
        basicBeanDescription._ignoredPropertyNames = pOJOPropertiesCollector.getIgnoredPropertyNames();
        basicBeanDescription._injectables = pOJOPropertiesCollector.getInjectables();
        basicBeanDescription._jsonValueMethod = pOJOPropertiesCollector.getJsonValueMethod();
        return basicBeanDescription;
    }

    public static BasicBeanDescription forOtherUse(MapperConfig mapperConfig, JavaType javaType, AnnotatedClass annotatedClass) {
        return new BasicBeanDescription(mapperConfig, javaType, annotatedClass, Collections.emptyList());
    }

    public static BasicBeanDescription forSerialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        BasicBeanDescription basicBeanDescription = new BasicBeanDescription(pOJOPropertiesCollector);
        basicBeanDescription._jsonValueMethod = pOJOPropertiesCollector.getJsonValueMethod();
        basicBeanDescription._anyGetter = pOJOPropertiesCollector.getAnyGetter();
        return basicBeanDescription;
    }

    public Annotations getClassAnnotations() {
        return this._classInfo.getAnnotations();
    }

    public AnnotatedClass getClassInfo() {
        return this._classInfo;
    }

    public List getConstructors() {
        return this._classInfo.getConstructors();
    }

    public List getFactoryMethods() {
        List<AnnotatedMethod> staticMethods = this._classInfo.getStaticMethods();
        if (staticMethods.isEmpty()) {
            return staticMethods;
        }
        List arrayList = new ArrayList();
        for (AnnotatedMethod annotatedMethod : staticMethods) {
            if (isFactoryMethod(annotatedMethod)) {
                arrayList.add(annotatedMethod);
            }
        }
        return arrayList;
    }

    public Set getIgnoredPropertyNames() {
        Set set = this._ignoredPropertyNames;
        return set == null ? Collections.emptySet() : set;
    }

    public ObjectIdInfo getObjectIdInfo() {
        return this._objectIdInfo;
    }

    public boolean hasKnownClassAnnotations() {
        return this._classInfo.hasAnnotations();
    }

    public Object instantiateBean(boolean z) {
        AnnotatedMember defaultConstructor = this._classInfo.getDefaultConstructor();
        if (defaultConstructor == null) {
            return null;
        }
        if (z) {
            defaultConstructor.fixAccess();
        }
        try {
            return defaultConstructor.getAnnotated().newInstance(new Object[0]);
        } catch (Exception e) {
            Throwable e2 = e;
            while (e2.getCause() != null) {
                e2 = e2.getCause();
            }
            if (e2 instanceof Error) {
                throw ((Error) e2);
            } else if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to instantiate bean of type ");
                stringBuilder.append(this._classInfo.getAnnotated().getName());
                stringBuilder.append(": (");
                stringBuilder.append(e2.getClass().getName());
                stringBuilder.append(") ");
                stringBuilder.append(e2.getMessage());
                throw new IllegalArgumentException(stringBuilder.toString(), e2);
            }
        }
    }

    public boolean isFactoryMethod(AnnotatedMethod annotatedMethod) {
        if (getBeanClass().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            if (!this._annotationIntrospector.hasCreatorAnnotation(annotatedMethod)) {
                if ("valueOf".equals(annotatedMethod.getName())) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean removeProperty(String str) {
        Iterator it = this._properties.iterator();
        while (it.hasNext()) {
            if (((BeanPropertyDefinition) it.next()).getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public JavaType resolveType(Type type) {
        return type == null ? null : bindingsForBeanType().resolveType(type);
    }
}
