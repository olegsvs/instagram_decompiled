package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class AnnotatedClass extends Annotated {
    private static final AnnotationMap[] NO_ANNOTATION_MAPS = new AnnotationMap[0];
    public final AnnotationIntrospector _annotationIntrospector;
    public final Class _class;
    public AnnotationMap _classAnnotations;
    public List _constructors;
    public List _creatorMethods;
    public boolean _creatorsResolved = false;
    public AnnotatedConstructor _defaultConstructor;
    public List _fields;
    public AnnotatedMethodMap _memberMethods;
    public final MixInResolver _mixInResolver;
    public final Class _primaryMixIn;
    public final List _superTypes;

    private AnnotatedClass(Class cls, List list, AnnotationIntrospector annotationIntrospector, MixInResolver mixInResolver, AnnotationMap annotationMap) {
        Class cls2;
        this._class = cls;
        this._superTypes = list;
        this._annotationIntrospector = annotationIntrospector;
        this._mixInResolver = mixInResolver;
        MixInResolver mixInResolver2 = this._mixInResolver;
        if (mixInResolver2 == null) {
            cls2 = null;
        } else {
            cls2 = mixInResolver2.findMixInClassFor(this._class);
        }
        this._primaryMixIn = cls2;
        this._classAnnotations = annotationMap;
    }

    private void _addAnnotationsIfNotPresent(AnnotatedMember annotatedMember, Annotation[] annotationArr) {
        if (annotationArr != null) {
            List list = null;
            for (Annotation annotation : annotationArr) {
                if (_isAnnotationBundle(annotation)) {
                    if (r4 == null) {
                        list = new LinkedList();
                    }
                    list.add(annotation.annotationType().getDeclaredAnnotations());
                } else {
                    annotatedMember.addIfNotPresent(annotation);
                }
            }
            if (r4 != null) {
                for (Annotation[] _addAnnotationsIfNotPresent : r4) {
                    _addAnnotationsIfNotPresent(annotatedMember, _addAnnotationsIfNotPresent);
                }
            }
        }
    }

    private void _addAnnotationsIfNotPresent(AnnotationMap annotationMap, Annotation[] annotationArr) {
        if (annotationArr != null) {
            List list = null;
            for (Annotation annotation : annotationArr) {
                if (_isAnnotationBundle(annotation)) {
                    if (r4 == null) {
                        list = new LinkedList();
                    }
                    list.add(annotation.annotationType().getDeclaredAnnotations());
                } else {
                    annotationMap.addIfNotPresent(annotation);
                }
            }
            if (r4 != null) {
                for (Annotation[] _addAnnotationsIfNotPresent : r4) {
                    _addAnnotationsIfNotPresent(annotationMap, _addAnnotationsIfNotPresent);
                }
            }
        }
    }

    public void _addClassMixIns(AnnotationMap annotationMap, Class cls) {
        MixInResolver mixInResolver = this._mixInResolver;
        if (mixInResolver != null) {
            _addClassMixIns(annotationMap, cls, mixInResolver.findMixInClassFor(cls));
        }
    }

    public void _addClassMixIns(AnnotationMap annotationMap, Class cls, Class cls2) {
        if (cls2 != null) {
            _addAnnotationsIfNotPresent(annotationMap, cls2.getDeclaredAnnotations());
            for (Class declaredAnnotations : ClassUtil.findSuperTypes(cls2, cls)) {
                _addAnnotationsIfNotPresent(annotationMap, declaredAnnotations.getDeclaredAnnotations());
            }
        }
    }

    public void _addConstructorMixIns(Class cls) {
        List list = this._constructors;
        int size = list == null ? 0 : list.size();
        MemberKey[] memberKeyArr = null;
        for (Constructor constructor : cls.getDeclaredConstructors()) {
            if (constructor.getParameterTypes().length != 0) {
                if (memberKeyArr == null) {
                    memberKeyArr = new MemberKey[size];
                    for (int i = 0; i < size; i++) {
                        memberKeyArr[i] = new MemberKey(((AnnotatedConstructor) this._constructors.get(i)).getAnnotated());
                    }
                }
                MemberKey memberKey = new MemberKey(constructor);
                for (int i2 = 0; i2 < size; i2++) {
                    if (memberKey.equals(memberKeyArr[i2])) {
                        _addMixOvers(constructor, (AnnotatedConstructor) this._constructors.get(i2), true);
                        break;
                    }
                }
            } else {
                AnnotatedConstructor annotatedConstructor = this._defaultConstructor;
                if (annotatedConstructor != null) {
                    _addMixOvers(constructor, annotatedConstructor, false);
                }
            }
        }
    }

    public void _addFactoryMixIns(Class cls) {
        int size = this._creatorMethods.size();
        MemberKey[] memberKeyArr = null;
        for (Method method : cls.getDeclaredMethods()) {
            if (Modifier.isStatic(method.getModifiers())) {
                if (method.getParameterTypes().length != 0) {
                    if (memberKeyArr == null) {
                        memberKeyArr = new MemberKey[size];
                        for (int i = 0; i < size; i++) {
                            memberKeyArr[i] = new MemberKey(((AnnotatedMethod) this._creatorMethods.get(i)).getAnnotated());
                        }
                    }
                    MemberKey memberKey = new MemberKey(method);
                    for (int i2 = 0; i2 < size; i2++) {
                        if (memberKey.equals(memberKeyArr[i2])) {
                            _addMixOvers(method, (AnnotatedMethod) this._creatorMethods.get(i2), true);
                            break;
                        }
                    }
                }
            }
        }
    }

    public void _addFieldMixIns(Class cls, Class cls2, Map map) {
        List<Class> arrayList = new ArrayList();
        arrayList.add(cls2);
        ClassUtil.findSuperTypes(cls2, cls, arrayList);
        for (Class declaredFields : arrayList) {
            for (Field field : declaredFields.getDeclaredFields()) {
                if (_isIncludableField(field)) {
                    AnnotatedField annotatedField = (AnnotatedField) map.get(field.getName());
                    if (annotatedField != null) {
                        _addOrOverrideAnnotations(annotatedField, field.getDeclaredAnnotations());
                    }
                }
            }
        }
    }

    public void _addMemberMethods(Class cls, AnnotatedMethodMap annotatedMethodMap, Class cls2, AnnotatedMethodMap annotatedMethodMap2) {
        if (cls2 != null) {
            _addMethodMixIns(cls, annotatedMethodMap, cls2, annotatedMethodMap2);
        }
        if (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                if (_isIncludableMemberMethod(method)) {
                    AnnotatedMember find = annotatedMethodMap.find(method);
                    if (find == null) {
                        AnnotatedMethod _constructMethod = _constructMethod(method);
                        annotatedMethodMap.add(_constructMethod);
                        AnnotatedMethod remove = annotatedMethodMap2.remove(method);
                        if (remove != null) {
                            _addMixOvers(remove.getAnnotated(), _constructMethod, false);
                        }
                    } else {
                        _addMixUnders(method, find);
                        if (find.getDeclaringClass().isInterface() && !method.getDeclaringClass().isInterface()) {
                            annotatedMethodMap.add(find.withMethod(method));
                        }
                    }
                }
            }
        }
    }

    public void _addMethodMixIns(Class cls, AnnotatedMethodMap annotatedMethodMap, Class cls2, AnnotatedMethodMap annotatedMethodMap2) {
        List<Class> arrayList = new ArrayList();
        arrayList.add(cls2);
        ClassUtil.findSuperTypes(cls2, cls, arrayList);
        for (Class declaredMethods : arrayList) {
            for (Method method : declaredMethods.getDeclaredMethods()) {
                if (_isIncludableMemberMethod(method)) {
                    AnnotatedMethod find = annotatedMethodMap.find(method);
                    if (find != null) {
                        _addMixUnders(method, find);
                    } else {
                        annotatedMethodMap2.add(_constructMethod(method));
                    }
                }
            }
        }
    }

    public void _addMixOvers(Constructor constructor, AnnotatedConstructor annotatedConstructor, boolean z) {
        _addOrOverrideAnnotations(annotatedConstructor, constructor.getDeclaredAnnotations());
        if (z) {
            constructor = constructor.getParameterAnnotations();
            int length = constructor.length;
            for (int i = 0; i < length; i++) {
                for (Annotation addOrOverrideParam : constructor[i]) {
                    annotatedConstructor.addOrOverrideParam(i, addOrOverrideParam);
                }
            }
        }
    }

    public void _addMixOvers(Method method, AnnotatedMethod annotatedMethod, boolean z) {
        _addOrOverrideAnnotations(annotatedMethod, method.getDeclaredAnnotations());
        if (z) {
            method = method.getParameterAnnotations();
            int length = method.length;
            for (int i = 0; i < length; i++) {
                for (Annotation addOrOverrideParam : method[i]) {
                    annotatedMethod.addOrOverrideParam(i, addOrOverrideParam);
                }
            }
        }
    }

    public void _addMixUnders(Method method, AnnotatedMethod annotatedMethod) {
        _addAnnotationsIfNotPresent((AnnotatedMember) annotatedMethod, method.getDeclaredAnnotations());
    }

    private void _addOrOverrideAnnotations(AnnotatedMember annotatedMember, Annotation[] annotationArr) {
        if (annotationArr != null) {
            List list = null;
            for (Annotation annotation : annotationArr) {
                if (_isAnnotationBundle(annotation)) {
                    if (r4 == null) {
                        list = new LinkedList();
                    }
                    list.add(annotation.annotationType().getDeclaredAnnotations());
                } else {
                    annotatedMember.addOrOverride(annotation);
                }
            }
            if (r4 != null) {
                for (Annotation[] _addOrOverrideAnnotations : r4) {
                    _addOrOverrideAnnotations(annotatedMember, _addOrOverrideAnnotations);
                }
            }
        }
    }

    public AnnotationMap _collectRelevantAnnotations(Annotation[] annotationArr) {
        AnnotationMap annotationMap = new AnnotationMap();
        _addAnnotationsIfNotPresent(annotationMap, annotationArr);
        return annotationMap;
    }

    public AnnotationMap[] _collectRelevantAnnotations(Annotation[][] annotationArr) {
        int length = annotationArr.length;
        AnnotationMap[] annotationMapArr = new AnnotationMap[length];
        for (int i = 0; i < length; i++) {
            annotationMapArr[i] = _collectRelevantAnnotations(annotationArr[i]);
        }
        return annotationMapArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.introspect.AnnotatedConstructor _constructConstructor(java.lang.reflect.Constructor r8, boolean r9) {
        /*
        r7 = this;
        r0 = r7._annotationIntrospector;
        if (r0 != 0) goto L_0x0017;
    L_0x0004:
        r2 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
        r1 = r7._emptyAnnotationMap();
        r0 = r8.getParameterTypes();
        r0 = r0.length;
        r0 = r7._emptyAnnotationMaps(r0);
        r2.<init>(r8, r1, r0);
        return r2;
    L_0x0017:
        r6 = 0;
        if (r9 == 0) goto L_0x0028;
    L_0x001a:
        r1 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
        r0 = r8.getDeclaredAnnotations();
        r0 = r7._collectRelevantAnnotations(r0);
        r1.<init>(r8, r0, r6);
        return r1;
    L_0x0028:
        r5 = r8.getParameterAnnotations();
        r0 = r8.getParameterTypes();
        r4 = r0.length;
        r0 = r5.length;
        if (r4 == r0) goto L_0x0096;
    L_0x0034:
        r3 = r8.getDeclaringClass();
        r0 = r3.isEnum();
        r2 = 0;
        if (r0 == 0) goto L_0x0051;
    L_0x003f:
        r0 = r5.length;
        r1 = 2;
        r0 = r0 + r1;
        if (r4 != r0) goto L_0x0051;
    L_0x0044:
        r0 = r5.length;
        r0 = r0 + r1;
        r3 = new java.lang.annotation.Annotation[r0][];
        r0 = r5.length;
        java.lang.System.arraycopy(r5, r2, r3, r1, r0);
        r6 = r7._collectRelevantAnnotations(r3);
        goto L_0x005e;
    L_0x0051:
        r0 = r3.isMemberClass();
        if (r0 == 0) goto L_0x005d;
    L_0x0057:
        r0 = r5.length;
        r1 = 1;
        r0 = r0 + r1;
        if (r4 != r0) goto L_0x005d;
    L_0x005c:
        goto L_0x0044;
    L_0x005d:
        r3 = r5;
    L_0x005e:
        if (r6 == 0) goto L_0x0061;
    L_0x0060:
        goto L_0x001a;
    L_0x0061:
        r2 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Internal error: constructor for ";
        r1.append(r0);
        r0 = r8.getDeclaringClass();
        r0 = r0.getName();
        r1.append(r0);
        r0 = " has mismatch: ";
        r1.append(r0);
        r1.append(r4);
        r0 = " parameters; ";
        r1.append(r0);
        r0 = r3.length;
        r1.append(r0);
        r0 = " sets of annotations";
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0096:
        r6 = r7._collectRelevantAnnotations(r5);
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedClass._constructConstructor(java.lang.reflect.Constructor, boolean):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }

    public AnnotatedMethod _constructCreatorMethod(Method method) {
        if (this._annotationIntrospector == null) {
            return new AnnotatedMethod(method, _emptyAnnotationMap(), _emptyAnnotationMaps(method.getParameterTypes().length));
        }
        return new AnnotatedMethod(method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), _collectRelevantAnnotations(method.getParameterAnnotations()));
    }

    public AnnotatedField _constructField(Field field) {
        if (this._annotationIntrospector == null) {
            return new AnnotatedField(field, _emptyAnnotationMap());
        }
        return new AnnotatedField(field, _collectRelevantAnnotations(field.getDeclaredAnnotations()));
    }

    public AnnotatedMethod _constructMethod(Method method) {
        if (this._annotationIntrospector == null) {
            return new AnnotatedMethod(method, _emptyAnnotationMap(), null);
        }
        return new AnnotatedMethod(method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), null);
    }

    private AnnotationMap _emptyAnnotationMap() {
        return new AnnotationMap();
    }

    private AnnotationMap[] _emptyAnnotationMaps(int i) {
        if (i == 0) {
            return NO_ANNOTATION_MAPS;
        }
        AnnotationMap[] annotationMapArr = new AnnotationMap[i];
        for (int i2 = 0; i2 < i; i2++) {
            annotationMapArr[i2] = _emptyAnnotationMap();
        }
        return annotationMapArr;
    }

    public Map _findFields(Class cls, Map map) {
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            map = _findFields(superclass, map);
            for (Field field : cls.getDeclaredFields()) {
                if (_isIncludableField(field)) {
                    if (map == null) {
                        map = new LinkedHashMap();
                    }
                    map.put(field.getName(), _constructField(field));
                }
            }
            MixInResolver mixInResolver = this._mixInResolver;
            if (mixInResolver != null) {
                Class findMixInClassFor = mixInResolver.findMixInClassFor(cls);
                if (findMixInClassFor != null) {
                    _addFieldMixIns(superclass, findMixInClassFor, map);
                }
            }
        }
        return map;
    }

    private final boolean _isAnnotationBundle(Annotation annotation) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        return annotationIntrospector != null && annotationIntrospector.isAnnotationBundle(annotation);
    }

    private boolean _isIncludableField(Field field) {
        if (!field.isSynthetic()) {
            int modifiers = field.getModifiers();
            if (!Modifier.isStatic(modifiers)) {
                if (!Modifier.isTransient(modifiers)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean _isIncludableMemberMethod(Method method) {
        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic()) {
            return false;
        }
        if (method.isBridge()) {
            return false;
        }
        if (method.getParameterTypes().length <= 2) {
            return true;
        }
        return false;
    }

    public static AnnotatedClass construct(Class cls, AnnotationIntrospector annotationIntrospector, MixInResolver mixInResolver) {
        return new AnnotatedClass(cls, ClassUtil.findSuperTypes(cls, null), annotationIntrospector, mixInResolver, null);
    }

    public static AnnotatedClass constructWithoutSuperTypes(Class cls, AnnotationIntrospector annotationIntrospector, MixInResolver mixInResolver) {
        return new AnnotatedClass(cls, Collections.emptyList(), annotationIntrospector, mixInResolver, null);
    }

    public Iterable fields() {
        if (this._fields == null) {
            resolveFields();
        }
        return this._fields;
    }

    public AnnotatedMethod findMethod(String str, Class[] clsArr) {
        if (this._memberMethods == null) {
            resolveMemberMethods();
        }
        return this._memberMethods.find(str, clsArr);
    }

    public AnnotationMap getAllAnnotations() {
        if (this._classAnnotations == null) {
            resolveClassAnnotations();
        }
        return this._classAnnotations;
    }

    public Class getAnnotated() {
        return this._class;
    }

    public Annotation getAnnotation(Class cls) {
        if (this._classAnnotations == null) {
            resolveClassAnnotations();
        }
        return this._classAnnotations.get(cls);
    }

    public Annotations getAnnotations() {
        if (this._classAnnotations == null) {
            resolveClassAnnotations();
        }
        return this._classAnnotations;
    }

    public List getConstructors() {
        if (!this._creatorsResolved) {
            resolveCreators();
        }
        return this._constructors;
    }

    public AnnotatedConstructor getDefaultConstructor() {
        if (!this._creatorsResolved) {
            resolveCreators();
        }
        return this._defaultConstructor;
    }

    public int getFieldCount() {
        if (this._fields == null) {
            resolveFields();
        }
        return this._fields.size();
    }

    public Type getGenericType() {
        return this._class;
    }

    public int getMemberMethodCount() {
        if (this._memberMethods == null) {
            resolveMemberMethods();
        }
        return this._memberMethods.size();
    }

    public int getModifiers() {
        return this._class.getModifiers();
    }

    public String getName() {
        return this._class.getName();
    }

    public Class getRawType() {
        return this._class;
    }

    public List getStaticMethods() {
        if (!this._creatorsResolved) {
            resolveCreators();
        }
        return this._creatorMethods;
    }

    public boolean hasAnnotations() {
        if (this._classAnnotations == null) {
            resolveClassAnnotations();
        }
        return this._classAnnotations.size() > 0;
    }

    public Iterable memberMethods() {
        if (this._memberMethods == null) {
            resolveMemberMethods();
        }
        return this._memberMethods;
    }

    private void resolveClassAnnotations() {
        this._classAnnotations = new AnnotationMap();
        if (this._annotationIntrospector != null) {
            Class cls = this._primaryMixIn;
            if (cls != null) {
                _addClassMixIns(this._classAnnotations, this._class, cls);
            }
            _addAnnotationsIfNotPresent(this._classAnnotations, this._class.getDeclaredAnnotations());
            for (Class cls2 : this._superTypes) {
                _addClassMixIns(this._classAnnotations, cls2);
                _addAnnotationsIfNotPresent(this._classAnnotations, cls2.getDeclaredAnnotations());
            }
            _addClassMixIns(this._classAnnotations, Object.class);
        }
    }

    private void resolveCreators() {
        int size;
        Constructor[] declaredConstructors = this._class.getDeclaredConstructors();
        int i = 0;
        List list = null;
        List list2 = null;
        for (Constructor constructor : declaredConstructors) {
            if (constructor.getParameterTypes().length == 0) {
                this._defaultConstructor = _constructConstructor(constructor, true);
            } else {
                if (list2 == null) {
                    list2 = new ArrayList(Math.max(10, declaredConstructors.length));
                }
                list2.add(_constructConstructor(constructor, false));
            }
        }
        if (list2 == null) {
            this._constructors = Collections.emptyList();
        } else {
            this._constructors = list2;
        }
        if (!(this._primaryMixIn == null || (this._defaultConstructor == null && this._constructors.isEmpty()))) {
            _addConstructorMixIns(this._primaryMixIn);
        }
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector != null) {
            AnnotatedMember annotatedMember = this._defaultConstructor;
            if (annotatedMember != null && annotationIntrospector.hasIgnoreMarker(annotatedMember)) {
                this._defaultConstructor = null;
            }
            List list3 = this._constructors;
            if (list3 != null) {
                size = list3.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (this._annotationIntrospector.hasIgnoreMarker((AnnotatedMember) this._constructors.get(size))) {
                        this._constructors.remove(size);
                    }
                }
            }
        }
        Method[] declaredMethods = this._class.getDeclaredMethods();
        size = declaredMethods.length;
        while (i < size) {
            Method method = declaredMethods[i];
            if (Modifier.isStatic(method.getModifiers())) {
                if (list == null) {
                    list = new ArrayList(8);
                }
                list.add(_constructCreatorMethod(method));
            }
            i++;
        }
        if (list == null) {
            this._creatorMethods = Collections.emptyList();
        } else {
            this._creatorMethods = list;
            Class cls = this._primaryMixIn;
            if (cls != null) {
                _addFactoryMixIns(cls);
            }
            if (this._annotationIntrospector != null) {
                size = this._creatorMethods.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (this._annotationIntrospector.hasIgnoreMarker((AnnotatedMember) this._creatorMethods.get(size))) {
                        this._creatorMethods.remove(size);
                    }
                }
            }
        }
        this._creatorsResolved = true;
    }

    private void resolveFields() {
        Map _findFields = _findFields(this._class, null);
        if (_findFields != null) {
            if (_findFields.size() != 0) {
                List arrayList = new ArrayList(_findFields.size());
                this._fields = arrayList;
                arrayList.addAll(_findFields.values());
                return;
            }
        }
        this._fields = Collections.emptyList();
    }

    private void resolveMemberMethods() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap;
        r0.<init>();
        r5._memberMethods = r0;
        r4 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap;
        r4.<init>();
        r2 = r5._class;
        r1 = r5._memberMethods;
        r0 = r5._primaryMixIn;
        r5._addMemberMethods(r2, r1, r0, r4);
        r0 = r5._superTypes;
        r3 = r0.iterator();
    L_0x001b:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0037;
    L_0x0021:
        r2 = r3.next();
        r2 = (java.lang.Class) r2;
        r0 = r5._mixInResolver;
        if (r0 != 0) goto L_0x002d;
    L_0x002b:
        r1 = 0;
        goto L_0x0031;
    L_0x002d:
        r1 = r0.findMixInClassFor(r2);
    L_0x0031:
        r0 = r5._memberMethods;
        r5._addMemberMethods(r2, r0, r1, r4);
        goto L_0x001b;
    L_0x0037:
        r1 = r5._mixInResolver;
        if (r1 == 0) goto L_0x004a;
    L_0x003b:
        r0 = java.lang.Object.class;
        r2 = r1.findMixInClassFor(r0);
        if (r2 == 0) goto L_0x004a;
    L_0x0043:
        r1 = r5._class;
        r0 = r5._memberMethods;
        r5._addMethodMixIns(r1, r0, r2, r4);
    L_0x004a:
        r0 = r5._annotationIntrospector;
        if (r0 == 0) goto L_0x0086;
    L_0x004e:
        r0 = r4.isEmpty();
        if (r0 != 0) goto L_0x0086;
    L_0x0054:
        r4 = r4.iterator();
    L_0x0058:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0086;
    L_0x005e:
        r3 = r4.next();
        r3 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r3;
        r2 = java.lang.Object.class;	 Catch:{ Exception -> 0x0058 }
        r1 = r3.getName();	 Catch:{ Exception -> 0x0058 }
        r0 = r3.getRawParameterTypes();	 Catch:{ Exception -> 0x0058 }
        r0 = r2.getDeclaredMethod(r1, r0);	 Catch:{ Exception -> 0x0058 }
        if (r0 == 0) goto L_0x0058;	 Catch:{ Exception -> 0x0058 }
    L_0x0074:
        r2 = r5._constructMethod(r0);	 Catch:{ Exception -> 0x0058 }
        r1 = r3.getAnnotated();	 Catch:{ Exception -> 0x0058 }
        r0 = 0;	 Catch:{ Exception -> 0x0058 }
        r5._addMixOvers(r1, r2, r0);	 Catch:{ Exception -> 0x0058 }
        r0 = r5._memberMethods;	 Catch:{ Exception -> 0x0058 }
        r0.add(r2);	 Catch:{ Exception -> 0x0058 }
        goto L_0x0058;	 Catch:{ Exception -> 0x0058 }
    L_0x0086:
        return;	 Catch:{ Exception -> 0x0058 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods():void");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[AnnotedClass ");
        stringBuilder.append(this._class.getName());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public AnnotatedClass withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedClass(this._class, this._superTypes, this._annotationIntrospector, this._mixInResolver, annotationMap);
    }
}
