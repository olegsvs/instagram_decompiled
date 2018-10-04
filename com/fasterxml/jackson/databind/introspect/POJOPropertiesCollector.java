package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class POJOPropertiesCollector {
    public final AnnotationIntrospector _annotationIntrospector;
    public LinkedList _anyGetters;
    public LinkedList _anySetters;
    public final AnnotatedClass _classDef;
    public final MapperConfig _config;
    public LinkedList _creatorProperties;
    public final boolean _forSerialization;
    public HashSet _ignoredPropertyNames;
    public LinkedHashMap _injectables;
    public LinkedList _jsonValueGetters;
    public final String _mutatorPrefix;
    public final LinkedHashMap _properties = new LinkedHashMap();
    public final JavaType _type;
    public final VisibilityChecker _visibilityChecker;

    public POJOPropertiesCollector(MapperConfig mapperConfig, boolean z, JavaType javaType, AnnotatedClass annotatedClass, String str) {
        AnnotationIntrospector annotationIntrospector = null;
        this._creatorProperties = null;
        this._anyGetters = null;
        this._anySetters = null;
        this._jsonValueGetters = null;
        this._config = mapperConfig;
        this._forSerialization = z;
        this._type = javaType;
        this._classDef = annotatedClass;
        if (str == null) {
            str = "set";
        }
        this._mutatorPrefix = str;
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            annotationIntrospector = this._config.getAnnotationIntrospector();
        }
        this._annotationIntrospector = annotationIntrospector;
        annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            this._visibilityChecker = this._config.getDefaultVisibilityChecker();
        } else {
            this._visibilityChecker = annotationIntrospector.findAutoDetectVisibility(annotatedClass, this._config.getDefaultVisibilityChecker());
        }
    }

    public void _addCreators() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector != null) {
            int parameterCount;
            int i;
            Annotated parameter;
            PropertyName findNameForDeserialization;
            String str;
            POJOPropertyBuilder _property;
            for (AnnotatedConstructor annotatedConstructor : this._classDef.getConstructors()) {
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList();
                }
                parameterCount = annotatedConstructor.getParameterCount();
                for (i = 0; i < parameterCount; i++) {
                    parameter = annotatedConstructor.getParameter(i);
                    findNameForDeserialization = annotationIntrospector.findNameForDeserialization(parameter);
                    if (findNameForDeserialization == null) {
                        str = null;
                    } else {
                        str = findNameForDeserialization.getSimpleName();
                    }
                    if (str != null) {
                        _property = _property(str);
                        _property.addCtor(parameter, str, true, false);
                        this._creatorProperties.add(_property);
                    }
                }
            }
            for (AnnotatedMethod annotatedMethod : this._classDef.getStaticMethods()) {
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList();
                }
                parameterCount = annotatedMethod.getParameterCount();
                for (i = 0; i < parameterCount; i++) {
                    parameter = annotatedMethod.getParameter(i);
                    findNameForDeserialization = annotationIntrospector.findNameForDeserialization(parameter);
                    if (findNameForDeserialization == null) {
                        str = null;
                    } else {
                        str = findNameForDeserialization.getSimpleName();
                    }
                    if (str != null) {
                        _property = _property(str);
                        _property.addCtor(parameter, str, true, false);
                        this._creatorProperties.add(_property);
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _addFields() {
        /*
        r9 = this;
        r6 = r9._annotationIntrospector;
        r0 = r9._forSerialization;
        if (r0 != 0) goto L_0x0012;
    L_0x0006:
        r1 = r9._config;
        r0 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
        r0 = r1.isEnabled(r0);
        if (r0 != 0) goto L_0x0012;
    L_0x0010:
        r8 = 1;
        goto L_0x0013;
    L_0x0012:
        r8 = 0;
    L_0x0013:
        r0 = r9._classDef;
        r0 = r0.fields();
        r7 = r0.iterator();
    L_0x001d:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x0081;
    L_0x0023:
        r5 = r7.next();
        r5 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r5;
        r4 = r5.getName();
        r3 = 0;
        if (r6 != 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0047;
    L_0x0031:
        r0 = r9._forSerialization;
        if (r0 == 0) goto L_0x0041;
    L_0x0035:
        r0 = r6.findNameForSerialization(r5);
        if (r0 != 0) goto L_0x003c;
    L_0x003b:
        goto L_0x0047;
    L_0x003c:
        r3 = r0.getSimpleName();
        goto L_0x0047;
    L_0x0041:
        r0 = r6.findNameForDeserialization(r5);
        if (r0 != 0) goto L_0x003c;
    L_0x0047:
        r0 = "";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0050;
    L_0x004f:
        r3 = r4;
    L_0x0050:
        if (r3 == 0) goto L_0x0054;
    L_0x0052:
        r2 = 1;
        goto L_0x0055;
    L_0x0054:
        r2 = 0;
    L_0x0055:
        if (r2 != 0) goto L_0x005d;
    L_0x0057:
        r0 = r9._visibilityChecker;
        r2 = r0.isFieldVisible(r5);
    L_0x005d:
        if (r6 == 0) goto L_0x0067;
    L_0x005f:
        r0 = r6.hasIgnoreMarker(r5);
        if (r0 == 0) goto L_0x0067;
    L_0x0065:
        r1 = 1;
        goto L_0x0068;
    L_0x0067:
        r1 = 0;
    L_0x0068:
        if (r8 == 0) goto L_0x0079;
    L_0x006a:
        if (r3 != 0) goto L_0x0079;
    L_0x006c:
        if (r1 != 0) goto L_0x0079;
    L_0x006e:
        r0 = r5.getModifiers();
        r0 = java.lang.reflect.Modifier.isFinal(r0);
        if (r0 == 0) goto L_0x0079;
    L_0x0078:
        goto L_0x001d;
    L_0x0079:
        r0 = r9._property(r4);
        r0.addField(r5, r3, r2, r1);
        goto L_0x001d;
    L_0x0081:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields():void");
    }

    public void _addGetterMethod(AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        PropertyName propertyName;
        String okNameForRegularGetter;
        boolean isIsGetterVisible;
        boolean z;
        if (annotationIntrospector != null) {
            if (annotationIntrospector.hasAnyGetterAnnotation(annotatedMethod)) {
                if (this._anyGetters == null) {
                    this._anyGetters = new LinkedList();
                }
                this._anyGetters.add(annotatedMethod);
                return;
            } else if (annotationIntrospector.hasAsValueAnnotation(annotatedMethod)) {
                if (this._jsonValueGetters == null) {
                    this._jsonValueGetters = new LinkedList();
                }
                this._jsonValueGetters.add(annotatedMethod);
                return;
            }
        }
        String str = null;
        if (annotationIntrospector == null) {
            propertyName = null;
        } else {
            propertyName = annotationIntrospector.findNameForSerialization(annotatedMethod);
        }
        if (propertyName != null) {
            str = propertyName.getSimpleName();
        }
        if (str == null) {
            okNameForRegularGetter = BeanUtil.okNameForRegularGetter(annotatedMethod, annotatedMethod.getName());
            if (okNameForRegularGetter == null) {
                okNameForRegularGetter = BeanUtil.okNameForIsGetter(annotatedMethod, annotatedMethod.getName());
                if (okNameForRegularGetter != null) {
                    isIsGetterVisible = this._visibilityChecker.isIsGetterVisible(annotatedMethod);
                } else {
                    return;
                }
            }
            isIsGetterVisible = this._visibilityChecker.isGetterVisible(annotatedMethod);
        } else {
            okNameForRegularGetter = BeanUtil.okNameForGetter(annotatedMethod);
            if (okNameForRegularGetter == null) {
                okNameForRegularGetter = annotatedMethod.getName();
            }
            if (str.length() == 0) {
                str = okNameForRegularGetter;
            }
            isIsGetterVisible = true;
        }
        if (annotationIntrospector == null) {
            z = false;
        } else {
            z = annotationIntrospector.hasIgnoreMarker(annotatedMethod);
        }
        _property(okNameForRegularGetter).addGetter(annotatedMethod, str, isIsGetterVisible, z);
    }

    private void _addIgnored(String str) {
        if (!this._forSerialization) {
            if (this._ignoredPropertyNames == null) {
                this._ignoredPropertyNames = new HashSet();
            }
            this._ignoredPropertyNames.add(str);
        }
    }

    public void _addInjectables() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector != null) {
            for (AnnotatedField annotatedField : this._classDef.fields()) {
                _doAddInjectable(annotationIntrospector.findInjectableValueId(annotatedField), annotatedField);
            }
            for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
                if (annotatedMethod.getParameterCount() == 1) {
                    _doAddInjectable(annotationIntrospector.findInjectableValueId(annotatedMethod), annotatedMethod);
                }
            }
        }
    }

    public void _addMethods() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            int parameterCount = annotatedMethod.getParameterCount();
            if (parameterCount == 0) {
                _addGetterMethod(annotatedMethod, annotationIntrospector);
            } else if (parameterCount == 1) {
                _addSetterMethod(annotatedMethod, annotationIntrospector);
            } else if (parameterCount == 2 && annotationIntrospector != null && annotationIntrospector.hasAnySetterAnnotation(annotatedMethod)) {
                if (this._anySetters == null) {
                    this._anySetters = new LinkedList();
                }
                this._anySetters.add(annotatedMethod);
            }
        }
    }

    public void _addSetterMethod(AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        String okNameForMutator;
        boolean isSetterVisible;
        boolean z;
        String str = null;
        PropertyName findNameForDeserialization = annotationIntrospector == null ? null : annotationIntrospector.findNameForDeserialization(annotatedMethod);
        if (findNameForDeserialization != null) {
            str = findNameForDeserialization.getSimpleName();
        }
        if (str == null) {
            okNameForMutator = BeanUtil.okNameForMutator(annotatedMethod, this._mutatorPrefix);
            if (okNameForMutator != null) {
                isSetterVisible = this._visibilityChecker.isSetterVisible(annotatedMethod);
            } else {
                return;
            }
        }
        okNameForMutator = BeanUtil.okNameForMutator(annotatedMethod, this._mutatorPrefix);
        if (okNameForMutator == null) {
            okNameForMutator = annotatedMethod.getName();
        }
        if (str.length() == 0) {
            str = okNameForMutator;
        }
        isSetterVisible = true;
        if (annotationIntrospector == null) {
            z = false;
        } else {
            z = annotationIntrospector.hasIgnoreMarker(annotatedMethod);
        }
        _property(okNameForMutator).addSetter(annotatedMethod, str, isSetterVisible, z);
    }

    public void _doAddInjectable(Object obj, AnnotatedMember annotatedMember) {
        if (obj != null) {
            if (this._injectables == null) {
                this._injectables = new LinkedHashMap();
            }
            if (((AnnotatedMember) this._injectables.put(obj, annotatedMember)) != null) {
                String str;
                if (obj == null) {
                    str = "[null]";
                } else {
                    str = obj.getClass().getName();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Duplicate injectable value with id '");
                stringBuilder.append(String.valueOf(obj));
                stringBuilder.append("' (of type ");
                stringBuilder.append(str);
                stringBuilder.append(")");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    private PropertyNamingStrategy _findNamingStrategy() {
        Object obj;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            obj = null;
        } else {
            obj = annotationIntrospector.findNamingStrategy(this._classDef);
        }
        if (obj == null) {
            return this._config.getPropertyNamingStrategy();
        }
        if (obj instanceof PropertyNamingStrategy) {
            return (PropertyNamingStrategy) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (PropertyNamingStrategy.class.isAssignableFrom(cls)) {
                HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
                if (handlerInstantiator != null) {
                    PropertyNamingStrategy namingStrategyInstance = handlerInstantiator.namingStrategyInstance(this._config, this._classDef, cls);
                    if (namingStrategyInstance != null) {
                        return namingStrategyInstance;
                    }
                }
                return (PropertyNamingStrategy) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AnnotationIntrospector returned Class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append("; expected Class<PropertyNamingStrategy>");
            throw new IllegalStateException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("AnnotationIntrospector returned PropertyNamingStrategy definition of type ");
        stringBuilder.append(obj.getClass().getName());
        stringBuilder.append("; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public POJOPropertyBuilder _property(String str) {
        POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) this._properties.get(str);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        pOJOPropertyBuilder = new POJOPropertyBuilder(str, this._annotationIntrospector, this._forSerialization);
        this._properties.put(str, pOJOPropertyBuilder);
        return pOJOPropertyBuilder;
    }

    public void _removeUnwantedProperties() {
        Iterator it = this._properties.entrySet().iterator();
        boolean isEnabled = this._config.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS) ^ 1;
        while (it.hasNext()) {
            POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) ((Entry) it.next()).getValue();
            if (pOJOPropertyBuilder.anyVisible()) {
                if (pOJOPropertyBuilder.anyIgnorals()) {
                    if (pOJOPropertyBuilder.isExplicitlyIncluded()) {
                        pOJOPropertyBuilder.removeIgnored();
                        if (!(this._forSerialization || pOJOPropertyBuilder.couldDeserialize())) {
                            _addIgnored(pOJOPropertyBuilder.getName());
                        }
                    } else {
                        it.remove();
                        _addIgnored(pOJOPropertyBuilder.getName());
                    }
                }
                pOJOPropertyBuilder.removeNonVisible(isEnabled);
            } else {
                it.remove();
            }
        }
    }

    public void _renameProperties() {
        Iterator it = this._properties.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) ((Entry) it.next()).getValue();
            String findNewName = pOJOPropertyBuilder.findNewName();
            if (findNewName != null) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(pOJOPropertyBuilder.withName(findNewName));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                POJOPropertyBuilder pOJOPropertyBuilder2 = (POJOPropertyBuilder) it2.next();
                String name = pOJOPropertyBuilder2.getName();
                POJOPropertyBuilder pOJOPropertyBuilder3 = (POJOPropertyBuilder) this._properties.get(name);
                if (pOJOPropertyBuilder3 == null) {
                    this._properties.put(name, pOJOPropertyBuilder2);
                } else {
                    pOJOPropertyBuilder3.addAll(pOJOPropertyBuilder2);
                }
                if (this._creatorProperties != null) {
                    for (int i = 0; i < this._creatorProperties.size(); i++) {
                        if (((POJOPropertyBuilder) this._creatorProperties.get(i)).getInternalName() == pOJOPropertyBuilder2.getInternalName()) {
                            this._creatorProperties.set(i, pOJOPropertyBuilder2);
                            break;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _renameUsing(com.fasterxml.jackson.databind.PropertyNamingStrategy r8) {
        /*
        r7 = this;
        r0 = r7._properties;
        r1 = r0.values();
        r0 = r7._properties;
        r0 = r0.size();
        r0 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder[r0];
        r6 = r1.toArray(r0);
        r6 = (com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder[]) r6;
        r0 = r7._properties;
        r0.clear();
        r5 = r6.length;
        r4 = 0;
    L_0x001b:
        if (r4 >= r5) goto L_0x009e;
    L_0x001d:
        r3 = r6[r4];
        r2 = r3.getName();
        r0 = r7._forSerialization;
        if (r0 == 0) goto L_0x0049;
    L_0x0027:
        r0 = r3.hasGetter();
        if (r0 == 0) goto L_0x0038;
    L_0x002d:
        r1 = r7._config;
        r0 = r3.getGetter();
        r2 = r8.nameForGetterMethod(r1, r0, r2);
        goto L_0x0079;
    L_0x0038:
        r0 = r3.hasField();
        if (r0 == 0) goto L_0x0079;
    L_0x003e:
        r1 = r7._config;
        r0 = r3.getField();
        r2 = r8.nameForField(r1, r0, r2);
        goto L_0x0079;
    L_0x0049:
        r0 = r3.hasSetter();
        if (r0 == 0) goto L_0x005a;
    L_0x004f:
        r1 = r7._config;
        r0 = r3.getSetter();
        r2 = r8.nameForSetterMethod(r1, r0, r2);
        goto L_0x0079;
    L_0x005a:
        r0 = r3.hasConstructorParameter();
        if (r0 == 0) goto L_0x006b;
    L_0x0060:
        r1 = r7._config;
        r0 = r3.getConstructorParameter();
        r2 = r8.nameForConstructorParameter(r1, r0, r2);
        goto L_0x0079;
    L_0x006b:
        r0 = r3.hasField();
        if (r0 == 0) goto L_0x0072;
    L_0x0071:
        goto L_0x003e;
    L_0x0072:
        r0 = r3.hasGetter();
        if (r0 == 0) goto L_0x0079;
    L_0x0078:
        goto L_0x002d;
    L_0x0079:
        r0 = r3.getName();
        r0 = r2.equals(r0);
        if (r0 != 0) goto L_0x0087;
    L_0x0083:
        r3 = r3.withName(r2);
    L_0x0087:
        r0 = r7._properties;
        r0 = r0.get(r2);
        r0 = (com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder) r0;
        if (r0 != 0) goto L_0x0097;
    L_0x0091:
        r0 = r7._properties;
        r0.put(r2, r3);
        goto L_0x009a;
    L_0x0097:
        r0.addAll(r3);
    L_0x009a:
        r4 = r4 + 1;
        goto L_0x001b;
    L_0x009e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameUsing(com.fasterxml.jackson.databind.PropertyNamingStrategy):void");
    }

    public void _renameWithWrappers() {
        String simpleName;
        Iterator it = this._properties.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) ((Entry) it.next()).getValue();
            Annotated primaryMember = pOJOPropertyBuilder.getPrimaryMember();
            if (primaryMember != null) {
                PropertyName findWrapperName = this._annotationIntrospector.findWrapperName(primaryMember);
                if (findWrapperName != null) {
                    if (findWrapperName.hasSimpleName()) {
                        simpleName = findWrapperName.getSimpleName();
                        if (!simpleName.equals(pOJOPropertyBuilder.getName())) {
                            if (linkedList == null) {
                                linkedList = new LinkedList();
                            }
                            linkedList.add(pOJOPropertyBuilder.withName(simpleName));
                            it.remove();
                        }
                    }
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                pOJOPropertyBuilder = (POJOPropertyBuilder) it2.next();
                simpleName = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = (POJOPropertyBuilder) this._properties.get(simpleName);
                if (pOJOPropertyBuilder2 == null) {
                    this._properties.put(simpleName, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
            }
        }
    }

    public void _sortProperties() {
        Boolean bool;
        boolean shouldSortPropertiesAlphabetically;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        String[] strArr = null;
        if (annotationIntrospector == null) {
            bool = null;
        } else {
            bool = annotationIntrospector.findSerializationSortAlphabetically(this._classDef);
        }
        if (bool == null) {
            shouldSortPropertiesAlphabetically = this._config.shouldSortPropertiesAlphabetically();
        } else {
            shouldSortPropertiesAlphabetically = bool.booleanValue();
        }
        if (annotationIntrospector != null) {
            strArr = annotationIntrospector.findSerializationPropertyOrder(this._classDef);
        }
        if (shouldSortPropertiesAlphabetically || this._creatorProperties != null || strArr != null) {
            Map treeMap;
            Iterator it;
            POJOPropertyBuilder pOJOPropertyBuilder;
            int size = this._properties.size();
            if (shouldSortPropertiesAlphabetically) {
                treeMap = new TreeMap();
            } else {
                treeMap = new LinkedHashMap(size + size);
            }
            for (POJOPropertyBuilder pOJOPropertyBuilder2 : this._properties.values()) {
                treeMap.put(pOJOPropertyBuilder2.getName(), pOJOPropertyBuilder2);
            }
            Map linkedHashMap = new LinkedHashMap(size + size);
            if (strArr != null) {
                for (Object obj : strArr) {
                    Object obj2;
                    Object obj3 = (POJOPropertyBuilder) treeMap.get(obj2);
                    if (obj3 == null) {
                        for (POJOPropertyBuilder pOJOPropertyBuilder22 : this._properties.values()) {
                            if (obj2.equals(pOJOPropertyBuilder22.getInternalName())) {
                                obj2 = pOJOPropertyBuilder22.getName();
                                obj3 = pOJOPropertyBuilder22;
                                break;
                            }
                        }
                    }
                    if (obj3 != null) {
                        linkedHashMap.put(obj2, obj3);
                    }
                }
            }
            LinkedList linkedList = this._creatorProperties;
            if (linkedList != null) {
                it = linkedList.iterator();
                while (it.hasNext()) {
                    pOJOPropertyBuilder22 = (POJOPropertyBuilder) it.next();
                    linkedHashMap.put(pOJOPropertyBuilder22.getName(), pOJOPropertyBuilder22);
                }
            }
            linkedHashMap.putAll(treeMap);
            this._properties.clear();
            this._properties.putAll(linkedHashMap);
        }
    }

    public POJOPropertiesCollector collect() {
        this._properties.clear();
        _addFields();
        _addMethods();
        _addCreators();
        _addInjectables();
        _removeUnwantedProperties();
        _renameProperties();
        PropertyNamingStrategy _findNamingStrategy = _findNamingStrategy();
        if (_findNamingStrategy != null) {
            _renameUsing(_findNamingStrategy);
        }
        for (POJOPropertyBuilder trimByVisibility : this._properties.values()) {
            trimByVisibility.trimByVisibility();
        }
        for (POJOPropertyBuilder mergeAnnotations : this._properties.values()) {
            mergeAnnotations.mergeAnnotations(this._forSerialization);
        }
        if (this._config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            _renameWithWrappers();
        }
        _sortProperties();
        return this;
    }

    public Class findPOJOBuilderClass() {
        return this._annotationIntrospector.findPOJOBuilder(this._classDef);
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    public AnnotatedMember getAnyGetter() {
        LinkedList linkedList = this._anyGetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Multiple 'any-getters' defined (");
            stringBuilder.append(this._anyGetters.get(0));
            stringBuilder.append(" vs ");
            stringBuilder.append(this._anyGetters.get(1));
            stringBuilder.append(")");
            reportProblem(stringBuilder.toString());
        }
        return (AnnotatedMember) this._anyGetters.getFirst();
    }

    public AnnotatedMethod getAnySetterMethod() {
        LinkedList linkedList = this._anySetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Multiple 'any-setters' defined (");
            stringBuilder.append(this._anySetters.get(0));
            stringBuilder.append(" vs ");
            stringBuilder.append(this._anySetters.get(1));
            stringBuilder.append(")");
            reportProblem(stringBuilder.toString());
        }
        return (AnnotatedMethod) this._anySetters.getFirst();
    }

    public AnnotatedClass getClassDef() {
        return this._classDef;
    }

    public MapperConfig getConfig() {
        return this._config;
    }

    public Set getIgnoredPropertyNames() {
        return this._ignoredPropertyNames;
    }

    public Map getInjectables() {
        return this._injectables;
    }

    public AnnotatedMethod getJsonValueMethod() {
        LinkedList linkedList = this._jsonValueGetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Multiple value properties defined (");
            stringBuilder.append(this._jsonValueGetters.get(0));
            stringBuilder.append(" vs ");
            stringBuilder.append(this._jsonValueGetters.get(1));
            stringBuilder.append(")");
            reportProblem(stringBuilder.toString());
        }
        return (AnnotatedMethod) this._jsonValueGetters.get(0);
    }

    public ObjectIdInfo getObjectIdInfo() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        ObjectIdInfo findObjectIdInfo = annotationIntrospector.findObjectIdInfo(this._classDef);
        if (findObjectIdInfo != null) {
            findObjectIdInfo = this._annotationIntrospector.findObjectReferenceInfo(this._classDef, findObjectIdInfo);
        }
        return findObjectIdInfo;
    }

    public List getProperties() {
        return new ArrayList(this._properties.values());
    }

    public Map getPropertyMap() {
        return this._properties;
    }

    public JavaType getType() {
        return this._type;
    }

    public void reportProblem(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Problem with definition of ");
        stringBuilder.append(this._classDef);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
