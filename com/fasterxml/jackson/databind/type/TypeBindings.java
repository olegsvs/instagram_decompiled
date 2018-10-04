package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class TypeBindings {
    private static final JavaType[] NO_TYPES = new JavaType[0];
    public static final JavaType UNBOUND = new SimpleType(Object.class);
    public Map _bindings;
    public final Class _contextClass;
    public final JavaType _contextType;
    private final TypeBindings _parentBindings;
    public HashSet _placeholders;
    public final TypeFactory _typeFactory;

    public TypeBindings(TypeFactory typeFactory, JavaType javaType) {
        this(typeFactory, null, javaType.getRawClass(), javaType);
    }

    private TypeBindings(TypeFactory typeFactory, TypeBindings typeBindings, Class cls, JavaType javaType) {
        this._typeFactory = typeFactory;
        this._parentBindings = typeBindings;
        this._contextClass = cls;
        this._contextType = javaType;
    }

    public TypeBindings(TypeFactory typeFactory, Class cls) {
        this(typeFactory, null, cls, null);
    }

    public void _addPlaceholder(String str) {
        if (this._placeholders == null) {
            this._placeholders = new HashSet();
        }
        this._placeholders.add(str);
    }

    public void _resolve() {
        _resolveBindings(this._contextClass);
        ResolvedType resolvedType = this._contextType;
        if (resolvedType != null) {
            int containedTypeCount = resolvedType.containedTypeCount();
            if (containedTypeCount > 0) {
                for (int i = 0; i < containedTypeCount; i++) {
                    addBinding(this._contextType.containedTypeName(i), this._contextType.containedType(i));
                }
            }
        }
        if (this._bindings == null) {
            this._bindings = Collections.emptyMap();
        }
    }

    public void _resolveBindings(Type type) {
        if (type != null) {
            int i = 0;
            Map map;
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments != null && actualTypeArguments.length > 0) {
                    Class cls = (Class) parameterizedType.getRawType();
                    TypeVariable[] typeParameters = cls.getTypeParameters();
                    if (typeParameters.length == actualTypeArguments.length) {
                        int length = actualTypeArguments.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            String name = typeParameters[i2].getName();
                            map = this._bindings;
                            if (map == null) {
                                this._bindings = new LinkedHashMap();
                            } else if (map.containsKey(name)) {
                            }
                            _addPlaceholder(name);
                            this._bindings.put(name, this._typeFactory._constructType(actualTypeArguments[i2], this));
                        }
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Strange parametrized type (in class ");
                        stringBuilder.append(cls.getName());
                        stringBuilder.append("): number of type arguments != number of type parameters (");
                        stringBuilder.append(actualTypeArguments.length);
                        stringBuilder.append(" vs ");
                        stringBuilder.append(typeParameters.length);
                        stringBuilder.append(")");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                type = (Class) parameterizedType.getRawType();
            } else if (type instanceof Class) {
                type = (Class) type;
                Class declaringClass = type.getDeclaringClass();
                if (!(declaringClass == null || declaringClass.isAssignableFrom(type))) {
                    _resolveBindings(type.getDeclaringClass());
                }
                TypeVariable[] typeParameters2 = type.getTypeParameters();
                if (typeParameters2 != null && typeParameters2.length > 0) {
                    JavaType[] javaTypeArr = null;
                    ResolvedType resolvedType = this._contextType;
                    if (resolvedType != null && type.isAssignableFrom(resolvedType.getRawClass())) {
                        javaTypeArr = this._typeFactory.findTypeParameters(this._contextType, (Class) type);
                    }
                    for (int i3 = 0; i3 < typeParameters2.length; i3++) {
                        TypeVariable typeVariable = typeParameters2[i3];
                        String name2 = typeVariable.getName();
                        Type type2 = typeVariable.getBounds()[0];
                        if (type2 != null) {
                            map = this._bindings;
                            if (map == null) {
                                this._bindings = new LinkedHashMap();
                            } else if (map.containsKey(name2)) {
                            }
                            _addPlaceholder(name2);
                            if (javaTypeArr != null) {
                                this._bindings.put(name2, javaTypeArr[i3]);
                            } else {
                                this._bindings.put(name2, this._typeFactory._constructType(type2, this));
                            }
                        }
                    }
                }
            } else {
                return;
            }
            _resolveBindings(type.getGenericSuperclass());
            Type[] genericInterfaces = type.getGenericInterfaces();
            int length2 = genericInterfaces.length;
            while (i < length2) {
                _resolveBindings(genericInterfaces[i]);
                i++;
            }
        }
    }

    public void addBinding(String str, JavaType javaType) {
        Map map = this._bindings;
        if (map == null || map.size() == 0) {
            this._bindings = new LinkedHashMap();
        }
        this._bindings.put(str, javaType);
    }

    public TypeBindings childInstance() {
        return new TypeBindings(this._typeFactory, this, this._contextClass, this._contextType);
    }

    public JavaType findType(String str) {
        if (this._bindings == null) {
            _resolve();
        }
        JavaType javaType = (JavaType) this._bindings.get(str);
        if (javaType != null) {
            return javaType;
        }
        HashSet hashSet = this._placeholders;
        if (hashSet == null || !hashSet.contains(str)) {
            TypeBindings typeBindings = this._parentBindings;
            if (typeBindings != null) {
                return typeBindings.findType(str);
            }
            Class cls = this._contextClass;
            if (cls == null || cls.getEnclosingClass() == null || Modifier.isStatic(this._contextClass.getModifiers())) {
                String javaType2;
                cls = this._contextClass;
                if (cls == null) {
                    javaType = this._contextType;
                    javaType2 = javaType != null ? javaType.toString() : "UNKNOWN";
                } else {
                    javaType2 = cls.getName();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Type variable '");
                stringBuilder.append(str);
                stringBuilder.append("' can not be resolved (with context of class ");
                stringBuilder.append(javaType2);
                stringBuilder.append(")");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return UNBOUND;
    }

    public int getBindingCount() {
        if (this._bindings == null) {
            _resolve();
        }
        return this._bindings.size();
    }

    public JavaType resolveType(Class cls) {
        return this._typeFactory._constructType(cls, this);
    }

    public JavaType resolveType(Type type) {
        return this._typeFactory._constructType(type, this);
    }

    public String toString() {
        if (this._bindings == null) {
            _resolve();
        }
        StringBuilder stringBuilder = new StringBuilder("[TypeBindings for ");
        JavaType javaType = this._contextType;
        if (javaType != null) {
            stringBuilder.append(javaType.toString());
        } else {
            stringBuilder.append(this._contextClass.getName());
        }
        stringBuilder.append(": ");
        stringBuilder.append(this._bindings);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public JavaType[] typesAsArray() {
        if (this._bindings == null) {
            _resolve();
        }
        if (this._bindings.size() == 0) {
            return NO_TYPES;
        }
        return (JavaType[]) this._bindings.values().toArray(new JavaType[this._bindings.size()]);
    }
}
