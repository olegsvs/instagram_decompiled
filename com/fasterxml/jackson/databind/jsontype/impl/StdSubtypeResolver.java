package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class StdSubtypeResolver extends SubtypeResolver implements Serializable {
    private static final long serialVersionUID = 1;
    public LinkedHashSet _registeredSubtypes;

    public void _collectAndResolve(AnnotatedClass annotatedClass, NamedType namedType, MapperConfig mapperConfig, AnnotationIntrospector annotationIntrospector, HashMap hashMap) {
        if (!namedType.hasName()) {
            String findTypeName = annotationIntrospector.findTypeName(annotatedClass);
            if (findTypeName != null) {
                namedType = new NamedType(namedType.getType(), findTypeName);
            }
        }
        if (!hashMap.containsKey(namedType)) {
            hashMap.put(namedType, namedType);
            Collection<NamedType> findSubtypes = annotationIntrospector.findSubtypes(annotatedClass);
            if (findSubtypes != null && !findSubtypes.isEmpty()) {
                for (NamedType namedType2 : findSubtypes) {
                    annotatedClass = AnnotatedClass.constructWithoutSuperTypes(namedType2.getType(), annotationIntrospector, mapperConfig);
                    _collectAndResolve(annotatedClass, !namedType2.hasName() ? new NamedType(namedType2.getType(), annotationIntrospector.findTypeName(annotatedClass)) : namedType2, mapperConfig, annotationIntrospector, hashMap);
                }
            }
        } else if (namedType.hasName() && !((NamedType) hashMap.get(namedType)).hasName()) {
            hashMap.put(namedType, namedType);
        }
    }

    public Collection collectAndResolveSubtypes(AnnotatedClass annotatedClass, MapperConfig mapperConfig, AnnotationIntrospector annotationIntrospector) {
        HashMap hashMap = new HashMap();
        StdSubtypeResolver stdSubtypeResolver = this;
        AnnotatedClass annotatedClass2 = annotatedClass;
        MapperConfig mapperConfig2 = mapperConfig;
        AnnotationIntrospector annotationIntrospector2 = annotationIntrospector;
        if (this._registeredSubtypes != null) {
            Class rawType = annotatedClass.getRawType();
            Iterator it = this._registeredSubtypes.iterator();
            while (it.hasNext()) {
                NamedType namedType = (NamedType) it.next();
                if (rawType.isAssignableFrom(namedType.getType())) {
                    _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedType.getType(), annotationIntrospector, mapperConfig), namedType, mapperConfig2, annotationIntrospector2, hashMap);
                }
            }
        }
        _collectAndResolve(annotatedClass2, new NamedType(annotatedClass.getRawType(), null), mapperConfig, annotationIntrospector, hashMap);
        return new ArrayList(hashMap.values());
    }

    public Collection collectAndResolveSubtypes(AnnotatedMember annotatedMember, MapperConfig mapperConfig, AnnotationIntrospector annotationIntrospector) {
        return collectAndResolveSubtypes(annotatedMember, mapperConfig, annotationIntrospector, null);
    }

    public Collection collectAndResolveSubtypes(AnnotatedMember annotatedMember, MapperConfig mapperConfig, AnnotationIntrospector annotationIntrospector, JavaType javaType) {
        Iterator it;
        NamedType namedType;
        Class rawType = javaType == null ? annotatedMember.getRawType() : javaType.getRawClass();
        HashMap hashMap = new HashMap();
        StdSubtypeResolver stdSubtypeResolver = this;
        LinkedHashSet linkedHashSet = this._registeredSubtypes;
        MapperConfig mapperConfig2 = mapperConfig;
        AnnotationIntrospector annotationIntrospector2 = annotationIntrospector;
        if (linkedHashSet != null) {
            it = linkedHashSet.iterator();
            while (it.hasNext()) {
                namedType = (NamedType) it.next();
                if (rawType.isAssignableFrom(namedType.getType())) {
                    _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedType.getType(), annotationIntrospector, mapperConfig), namedType, mapperConfig2, annotationIntrospector2, hashMap);
                }
            }
        }
        Collection<NamedType> findSubtypes = annotationIntrospector.findSubtypes(annotatedMember);
        if (findSubtypes != null) {
            for (NamedType namedType2 : findSubtypes) {
                _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(namedType2.getType(), annotationIntrospector, mapperConfig), namedType2, mapperConfig2, annotationIntrospector2, hashMap);
            }
        }
        _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(rawType, annotationIntrospector, mapperConfig), new NamedType(rawType, null), mapperConfig2, annotationIntrospector2, hashMap);
        return new ArrayList(hashMap.values());
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        if (this._registeredSubtypes == null) {
            this._registeredSubtypes = new LinkedHashSet();
        }
        for (Object add : namedTypeArr) {
            this._registeredSubtypes.add(add);
        }
    }

    public void registerSubtypes(Class... clsArr) {
        NamedType[] namedTypeArr = new NamedType[clsArr.length];
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            namedTypeArr[i] = new NamedType(clsArr[i]);
        }
        registerSubtypes(namedTypeArr);
    }
}
