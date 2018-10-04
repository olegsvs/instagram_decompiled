package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class TypeFactory implements Serializable {
    public static final SimpleType CORE_TYPE_BOOL = new SimpleType(Boolean.TYPE);
    public static final SimpleType CORE_TYPE_INT = new SimpleType(Integer.TYPE);
    public static final SimpleType CORE_TYPE_LONG = new SimpleType(Long.TYPE);
    public static final SimpleType CORE_TYPE_STRING = new SimpleType(String.class);
    private static final JavaType[] NO_TYPES = new JavaType[0];
    public static final TypeFactory instance = new TypeFactory();
    private static final long serialVersionUID = 1;
    public transient HierarchicType _cachedArrayListType;
    public transient HierarchicType _cachedHashMapType;
    public final TypeModifier[] _modifiers;
    public final TypeParser _parser;
    public final LRUMap _typeCache;

    private TypeFactory() {
        this._typeCache = new LRUMap(16, 100);
        this._parser = new TypeParser(this);
        this._modifiers = null;
    }

    public TypeFactory(TypeParser typeParser, TypeModifier[] typeModifierArr) {
        this._typeCache = new LRUMap(16, 100);
        this._parser = typeParser;
        this._modifiers = typeModifierArr;
    }

    public synchronized HierarchicType _arrayListSuperInterfaceChain(HierarchicType hierarchicType) {
        if (this._cachedArrayListType == null) {
            HierarchicType deepCloneWithoutSubtype = hierarchicType.deepCloneWithoutSubtype();
            _doFindSuperInterfaceChain(deepCloneWithoutSubtype, List.class);
            this._cachedArrayListType = deepCloneWithoutSubtype.getSuperType();
        }
        HierarchicType deepCloneWithoutSubtype2 = this._cachedArrayListType.deepCloneWithoutSubtype();
        hierarchicType.setSuperType(deepCloneWithoutSubtype2);
        deepCloneWithoutSubtype2.setSubType(hierarchicType);
        return hierarchicType;
    }

    private JavaType _collectionType(Class cls) {
        JavaType[] findTypeParameters = findTypeParameters(cls, Collection.class);
        if (findTypeParameters == null) {
            return CollectionType.construct(cls, _unknownType());
        }
        if (findTypeParameters.length == 1) {
            return CollectionType.construct(cls, findTypeParameters[0]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Strange Collection type ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(": can not determine type parameters");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public JavaType _constructType(Type type, TypeBindings typeBindings) {
        JavaType _fromClass;
        if (type instanceof Class) {
            _fromClass = _fromClass((Class) type, typeBindings);
        } else if (type instanceof ParameterizedType) {
            _fromClass = _fromParamType((ParameterizedType) type, typeBindings);
        } else if (type instanceof JavaType) {
            return (JavaType) type;
        } else {
            if (type instanceof GenericArrayType) {
                _fromClass = _fromArrayType((GenericArrayType) type, typeBindings);
            } else if (type instanceof TypeVariable) {
                _fromClass = _fromVariable((TypeVariable) type, typeBindings);
            } else if (type instanceof WildcardType) {
                _fromClass = _fromWildcard((WildcardType) type, typeBindings);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized Type: ");
                stringBuilder.append(type == null ? "[null]" : type.toString());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (!(this._modifiers == null || r4.isContainerType())) {
            for (TypeModifier modifyType : this._modifiers) {
                _fromClass = modifyType.modifyType(_fromClass, type, typeBindings, this);
            }
        }
        return _fromClass;
    }

    public HierarchicType _doFindSuperInterfaceChain(HierarchicType hierarchicType, Class cls) {
        HierarchicType _findSuperInterfaceChain;
        Class rawClass = hierarchicType.getRawClass();
        Type[] genericInterfaces = rawClass.getGenericInterfaces();
        if (genericInterfaces != null) {
            for (Type _findSuperInterfaceChain2 : genericInterfaces) {
                _findSuperInterfaceChain = _findSuperInterfaceChain(_findSuperInterfaceChain2, cls);
                if (_findSuperInterfaceChain != null) {
                    break;
                }
            }
        }
        Type _findSuperInterfaceChain22 = rawClass.getGenericSuperclass();
        if (_findSuperInterfaceChain22 != null) {
            _findSuperInterfaceChain = _findSuperInterfaceChain(_findSuperInterfaceChain22, cls);
            if (_findSuperInterfaceChain != null) {
                _findSuperInterfaceChain.setSubType(hierarchicType);
                hierarchicType.setSuperType(_findSuperInterfaceChain);
                return hierarchicType;
            }
        }
        return null;
    }

    public HierarchicType _findSuperClassChain(Type type, Class cls) {
        HierarchicType hierarchicType = new HierarchicType(type);
        Class rawClass = hierarchicType.getRawClass();
        if (rawClass == cls) {
            return hierarchicType;
        }
        Type genericSuperclass = rawClass.getGenericSuperclass();
        if (genericSuperclass != null) {
            HierarchicType _findSuperClassChain = _findSuperClassChain(genericSuperclass, cls);
            if (_findSuperClassChain != null) {
                _findSuperClassChain.setSubType(hierarchicType);
                hierarchicType.setSuperType(_findSuperClassChain);
                return hierarchicType;
            }
        }
        return null;
    }

    public HierarchicType _findSuperInterfaceChain(Type type, Class cls) {
        HierarchicType hierarchicType = new HierarchicType(type);
        Class rawClass = hierarchicType.getRawClass();
        if (rawClass == cls) {
            return new HierarchicType(type);
        }
        if (rawClass == HashMap.class && cls == Map.class) {
            return _hashMapSuperInterfaceChain(hierarchicType);
        }
        if (rawClass == ArrayList.class && cls == List.class) {
            return _arrayListSuperInterfaceChain(hierarchicType);
        }
        return _doFindSuperInterfaceChain(hierarchicType, cls);
    }

    public HierarchicType _findSuperTypeChain(Class cls, Class cls2) {
        if (cls2.isInterface()) {
            return _findSuperInterfaceChain(cls, cls2);
        }
        return _findSuperClassChain(cls, cls2);
    }

    public JavaType _fromArrayType(GenericArrayType genericArrayType, TypeBindings typeBindings) {
        return ArrayType.construct(_constructType(genericArrayType.getGenericComponentType(), typeBindings), null, null);
    }

    public JavaType _fromClass(Class cls, TypeBindings typeBindings) {
        if (cls == String.class) {
            return CORE_TYPE_STRING;
        }
        if (cls == Boolean.TYPE) {
            return CORE_TYPE_BOOL;
        }
        if (cls == Integer.TYPE) {
            return CORE_TYPE_INT;
        }
        if (cls == Long.TYPE) {
            return CORE_TYPE_LONG;
        }
        ClassKey classKey = new ClassKey(cls);
        synchronized (this._typeCache) {
            try {
                JavaType javaType = (JavaType) this._typeCache.get(classKey);
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    break;
                }
            }
        }
        if (javaType != null) {
            return javaType;
        }
        JavaType construct;
        if (cls.isArray()) {
            construct = ArrayType.construct(_constructType(cls.getComponentType(), null), null, null);
        } else {
            if (!cls.isEnum()) {
                if (Map.class.isAssignableFrom(cls)) {
                    construct = _mapType(cls);
                } else if (Collection.class.isAssignableFrom(cls)) {
                    construct = _collectionType(cls);
                }
            }
            construct = new SimpleType(cls);
        }
        synchronized (this._typeCache) {
            try {
                this._typeCache.put(classKey, construct);
            } catch (Throwable th3) {
                th2 = th3;
                throw th2;
            }
        }
        return construct;
    }

    public JavaType _fromParamType(ParameterizedType parameterizedType, TypeBindings typeBindings) {
        int i;
        JavaType[] javaTypeArr;
        Class cls = (Class) parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments == null) {
            i = 0;
        } else {
            i = actualTypeArguments.length;
        }
        if (i == 0) {
            javaTypeArr = NO_TYPES;
        } else {
            javaTypeArr = new JavaType[i];
            for (int i2 = 0; i2 < i; i2++) {
                javaTypeArr[i2] = _constructType(actualTypeArguments[i2], typeBindings);
            }
        }
        StringBuilder stringBuilder;
        if (Map.class.isAssignableFrom(cls)) {
            javaTypeArr = findTypeParameters(constructSimpleType(cls, javaTypeArr), Map.class);
            if (javaTypeArr.length == 2) {
                return MapType.construct(cls, javaTypeArr[0], javaTypeArr[1]);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not find 2 type parameters for Map class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" (found ");
            stringBuilder.append(javaTypeArr.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (Collection.class.isAssignableFrom(cls)) {
            javaTypeArr = findTypeParameters(constructSimpleType(cls, javaTypeArr), Collection.class);
            if (javaTypeArr.length == 1) {
                return CollectionType.construct(cls, javaTypeArr[0]);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not find 1 type parameter for Collection class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" (found ");
            stringBuilder.append(javaTypeArr.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i == 0) {
            return new SimpleType(cls);
        } else {
            return constructSimpleType(cls, javaTypeArr);
        }
    }

    public JavaType _fromParameterizedClass(Class cls, List list) {
        if (cls.isArray()) {
            return ArrayType.construct(_constructType(cls.getComponentType(), null), null, null);
        }
        if (!cls.isEnum()) {
            if (Map.class.isAssignableFrom(cls)) {
                if (list.size() <= 0) {
                    return _mapType(cls);
                }
                return MapType.construct(cls, (JavaType) list.get(0), list.size() >= 2 ? (JavaType) list.get(1) : _unknownType());
            } else if (Collection.class.isAssignableFrom(cls)) {
                if (list.size() >= 1) {
                    return CollectionType.construct(cls, (JavaType) list.get(0));
                }
                return _collectionType(cls);
            } else if (list.size() != 0) {
                return constructSimpleType(cls, (JavaType[]) list.toArray(new JavaType[list.size()]));
            }
        }
        return new SimpleType(cls);
    }

    public JavaType _fromVariable(TypeVariable typeVariable, TypeBindings typeBindings) {
        if (typeBindings == null) {
            return _unknownType();
        }
        String name = typeVariable.getName();
        JavaType findType = typeBindings.findType(name);
        if (findType != null) {
            return findType;
        }
        Type[] bounds = typeVariable.getBounds();
        typeBindings._addPlaceholder(name);
        return _constructType(bounds[0], typeBindings);
    }

    public JavaType _fromWildcard(WildcardType wildcardType, TypeBindings typeBindings) {
        return _constructType(wildcardType.getUpperBounds()[0], typeBindings);
    }

    public synchronized HierarchicType _hashMapSuperInterfaceChain(HierarchicType hierarchicType) {
        if (this._cachedHashMapType == null) {
            HierarchicType deepCloneWithoutSubtype = hierarchicType.deepCloneWithoutSubtype();
            _doFindSuperInterfaceChain(deepCloneWithoutSubtype, Map.class);
            this._cachedHashMapType = deepCloneWithoutSubtype.getSuperType();
        }
        HierarchicType deepCloneWithoutSubtype2 = this._cachedHashMapType.deepCloneWithoutSubtype();
        hierarchicType.setSuperType(deepCloneWithoutSubtype2);
        deepCloneWithoutSubtype2.setSubType(hierarchicType);
        return hierarchicType;
    }

    private JavaType _mapType(Class cls) {
        JavaType[] findTypeParameters = findTypeParameters(cls, Map.class);
        if (findTypeParameters == null) {
            return MapType.construct(cls, _unknownType(), _unknownType());
        }
        if (findTypeParameters.length == 2) {
            return MapType.construct(cls, findTypeParameters[0], findTypeParameters[1]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Strange Map type ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(": can not determine type parameters");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public JavaType _resolveVariableViaSubTypes(HierarchicType hierarchicType, String str, TypeBindings typeBindings) {
        if (hierarchicType != null && hierarchicType.isGeneric()) {
            TypeVariable[] typeParameters = hierarchicType.getRawClass().getTypeParameters();
            int length = typeParameters.length;
            for (int i = 0; i < length; i++) {
                if (str.equals(typeParameters[i].getName())) {
                    Type type = hierarchicType.asGeneric().getActualTypeArguments()[i];
                    if (type instanceof TypeVariable) {
                        return _resolveVariableViaSubTypes(hierarchicType.getSubType(), ((TypeVariable) type).getName(), typeBindings);
                    }
                    return _constructType(type, typeBindings);
                }
            }
        }
        return _unknownType();
    }

    public JavaType _unknownType() {
        return new SimpleType(Object.class);
    }

    public ArrayType constructArrayType(JavaType javaType) {
        return ArrayType.construct(javaType, null, null);
    }

    public ArrayType constructArrayType(Class cls) {
        return ArrayType.construct(_constructType(cls, null), null, null);
    }

    public CollectionLikeType constructCollectionLikeType(Class cls, JavaType javaType) {
        return CollectionLikeType.construct(cls, javaType);
    }

    public CollectionLikeType constructCollectionLikeType(Class cls, Class cls2) {
        return CollectionLikeType.construct(cls, constructType((Type) cls2));
    }

    public CollectionType constructCollectionType(Class cls, JavaType javaType) {
        return CollectionType.construct(cls, javaType);
    }

    public CollectionType constructCollectionType(Class cls, Class cls2) {
        return CollectionType.construct(cls, constructType((Type) cls2));
    }

    public JavaType constructFromCanonical(String str) {
        return this._parser.parse(str);
    }

    public MapLikeType constructMapLikeType(Class cls, JavaType javaType, JavaType javaType2) {
        return MapLikeType.construct(cls, javaType, javaType2);
    }

    public MapLikeType constructMapLikeType(Class cls, Class cls2, Class cls3) {
        return MapType.construct(cls, constructType((Type) cls2), constructType((Type) cls3));
    }

    public MapType constructMapType(Class cls, JavaType javaType, JavaType javaType2) {
        return MapType.construct(cls, javaType, javaType2);
    }

    public MapType constructMapType(Class cls, Class cls2, Class cls3) {
        return MapType.construct(cls, constructType((Type) cls2), constructType((Type) cls3));
    }

    public JavaType constructParametricType(Class cls, JavaType... javaTypeArr) {
        StringBuilder stringBuilder;
        if (cls.isArray()) {
            if (javaTypeArr.length == 1) {
                return constructArrayType(javaTypeArr[0]);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Need exactly 1 parameter type for arrays (");
            stringBuilder.append(cls.getName());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (Map.class.isAssignableFrom(cls)) {
            if (javaTypeArr.length == 2) {
                return constructMapType(cls, javaTypeArr[0], javaTypeArr[1]);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Need exactly 2 parameter types for Map types (");
            stringBuilder.append(cls.getName());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!Collection.class.isAssignableFrom(cls)) {
            return constructSimpleType(cls, javaTypeArr);
        } else {
            if (javaTypeArr.length == 1) {
                return constructCollectionType(cls, javaTypeArr[0]);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Need exactly 1 parameter type for Collection types (");
            stringBuilder.append(cls.getName());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public JavaType constructParametricType(Class cls, Class... clsArr) {
        int length = clsArr.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i = 0; i < length; i++) {
            javaTypeArr[i] = _fromClass(clsArr[i], null);
        }
        return constructParametricType(cls, javaTypeArr);
    }

    public CollectionLikeType constructRawCollectionLikeType(Class cls) {
        return CollectionLikeType.construct(cls, unknownType());
    }

    public CollectionType constructRawCollectionType(Class cls) {
        return CollectionType.construct(cls, unknownType());
    }

    public MapLikeType constructRawMapLikeType(Class cls) {
        return MapLikeType.construct(cls, unknownType(), unknownType());
    }

    public MapType constructRawMapType(Class cls) {
        return MapType.construct(cls, unknownType(), unknownType());
    }

    public JavaType constructSimpleType(Class cls, JavaType[] javaTypeArr) {
        Class cls2 = cls;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        JavaType[] javaTypeArr2 = javaTypeArr;
        if (typeParameters.length == javaTypeArr.length) {
            String[] strArr = new String[typeParameters.length];
            int length = typeParameters.length;
            for (int i = 0; i < length; i++) {
                strArr[i] = typeParameters[i].getName();
            }
            return new SimpleType(cls2, strArr, javaTypeArr2, null, null, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Parameter type mismatch for ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(": expected ");
        stringBuilder.append(typeParameters.length);
        stringBuilder.append(" parameters, was given ");
        stringBuilder.append(javaTypeArr.length);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public JavaType constructSpecializedType(JavaType javaType, Class cls) {
        if (!(javaType instanceof SimpleType) || (!cls.isArray() && !Map.class.isAssignableFrom(cls) && !Collection.class.isAssignableFrom(cls))) {
            return javaType.narrowBy(cls);
        }
        if (javaType.getRawClass().isAssignableFrom(cls)) {
            JavaType _fromClass = _fromClass(cls, new TypeBindings(this, javaType.getRawClass()));
            Object valueHandler = javaType.getValueHandler();
            if (valueHandler != null) {
                _fromClass = _fromClass.withValueHandler(valueHandler);
            }
            valueHandler = javaType.getTypeHandler();
            if (valueHandler != null) {
                _fromClass = _fromClass.withTypeHandler(valueHandler);
            }
            return _fromClass;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class ");
        stringBuilder.append(cls.getClass().getName());
        stringBuilder.append(" not subtype of ");
        stringBuilder.append(javaType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public JavaType constructType(TypeReference typeReference) {
        return _constructType(typeReference.getType(), null);
    }

    public JavaType constructType(Type type) {
        return _constructType(type, null);
    }

    public JavaType constructType(Type type, JavaType javaType) {
        return _constructType(type, javaType == null ? null : new TypeBindings(this, javaType));
    }

    public JavaType constructType(Type type, TypeBindings typeBindings) {
        return _constructType(type, typeBindings);
    }

    public JavaType constructType(Type type, Class cls) {
        return _constructType(type, cls == null ? null : new TypeBindings(this, cls));
    }

    public static TypeFactory defaultInstance() {
        return instance;
    }

    public JavaType[] findTypeParameters(JavaType javaType, Class cls) {
        Class rawClass = javaType.getRawClass();
        if (rawClass != cls) {
            return findTypeParameters(rawClass, cls, new TypeBindings(this, javaType));
        }
        int containedTypeCount = javaType.containedTypeCount();
        if (containedTypeCount == 0) {
            return null;
        }
        JavaType[] javaTypeArr = new JavaType[containedTypeCount];
        for (int i = 0; i < containedTypeCount; i++) {
            javaTypeArr[i] = javaType.containedType(i);
        }
        return javaTypeArr;
    }

    public JavaType[] findTypeParameters(Class cls, Class cls2) {
        return findTypeParameters(cls, cls2, new TypeBindings(this, cls));
    }

    public JavaType[] findTypeParameters(Class cls, Class cls2, TypeBindings typeBindings) {
        HierarchicType _findSuperTypeChain = _findSuperTypeChain(cls, cls2);
        if (_findSuperTypeChain != null) {
            while (_findSuperTypeChain.getSuperType() != null) {
                _findSuperTypeChain = _findSuperTypeChain.getSuperType();
                Class rawClass = _findSuperTypeChain.getRawClass();
                TypeBindings typeBindings2 = new TypeBindings(this, rawClass);
                if (_findSuperTypeChain.isGeneric()) {
                    Type[] actualTypeArguments = _findSuperTypeChain.asGeneric().getActualTypeArguments();
                    TypeVariable[] typeParameters = rawClass.getTypeParameters();
                    int length = actualTypeArguments.length;
                    for (int i = 0; i < length; i++) {
                        typeBindings2.addBinding(typeParameters[i].getName(), _constructType(actualTypeArguments[i], typeBindings));
                    }
                }
                typeBindings = typeBindings2;
            }
            if (_findSuperTypeChain.isGeneric()) {
                return typeBindings.typesAsArray();
            }
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(" is not a subtype of ");
        stringBuilder.append(cls2.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public JavaType moreSpecificType(JavaType javaType, JavaType javaType2) {
        if (javaType != null) {
            if (javaType2 != null) {
                Class rawClass = javaType.getRawClass();
                Class rawClass2 = javaType2.getRawClass();
                if (rawClass != rawClass2) {
                    if (rawClass.isAssignableFrom(rawClass2)) {
                    }
                }
            }
            return javaType;
        }
        return javaType2;
    }

    public static Class rawClass(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        return defaultInstance().constructType(type).getRawClass();
    }

    public JavaType uncheckedSimpleType(Class cls) {
        return new SimpleType(cls);
    }

    public static JavaType unknownType() {
        return defaultInstance()._unknownType();
    }

    public TypeFactory withModifier(TypeModifier typeModifier) {
        TypeModifier[] typeModifierArr = this._modifiers;
        if (typeModifierArr != null) {
            return new TypeFactory(this._parser, (TypeModifier[]) ArrayBuilders.insertInListNoDup(typeModifierArr, typeModifier));
        }
        return new TypeFactory(this._parser, new TypeModifier[]{typeModifier});
    }
}
