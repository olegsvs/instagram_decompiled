package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Array;

public final class ArrayType extends TypeBase {
    private static final long serialVersionUID = 9040058063449087477L;
    public final JavaType _componentType;
    public final Object _emptyArray;

    public int containedTypeCount() {
        return 1;
    }

    public String containedTypeName(int i) {
        return i == 0 ? "E" : null;
    }

    public boolean isAbstract() {
        return false;
    }

    public boolean isArrayType() {
        return true;
    }

    public boolean isConcrete() {
        return true;
    }

    public boolean isContainerType() {
        return true;
    }

    private ArrayType(JavaType javaType, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), javaType.hashCode(), obj2, obj3, z);
        this._componentType = javaType;
        this._emptyArray = obj;
    }

    public JavaType _narrow(Class cls) {
        if (cls.isArray()) {
            return construct(TypeFactory.defaultInstance().constructType(cls.getComponentType()), this._valueHandler, this._typeHandler);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Incompatible narrowing operation: trying to narrow ");
        stringBuilder.append(toString());
        stringBuilder.append(" to class ");
        stringBuilder.append(cls.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String buildCanonicalName() {
        return this._class.getName();
    }

    public static ArrayType construct(JavaType javaType, Object obj, Object obj2) {
        return new ArrayType(javaType, Array.newInstance(javaType.getRawClass(), 0), null, null, null);
    }

    public JavaType containedType(int i) {
        return i == 0 ? this._componentType : null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                return this._componentType.equals(((ArrayType) obj)._componentType);
            }
        }
        return false;
    }

    public JavaType getContentType() {
        return this._componentType;
    }

    public StringBuilder getErasedSignature(StringBuilder stringBuilder) {
        stringBuilder.append('[');
        return this._componentType.getErasedSignature(stringBuilder);
    }

    public StringBuilder getGenericSignature(StringBuilder stringBuilder) {
        stringBuilder.append('[');
        return this._componentType.getGenericSignature(stringBuilder);
    }

    public boolean hasGenericTypes() {
        return this._componentType.hasGenericTypes();
    }

    public JavaType narrowContentsBy(Class cls) {
        if (cls == this._componentType.getRawClass()) {
            return this;
        }
        return construct(this._componentType.narrowBy(cls), this._valueHandler, this._typeHandler);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[array type, component type: ");
        stringBuilder.append(this._componentType);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public JavaType widenContentsBy(Class cls) {
        if (cls == this._componentType.getRawClass()) {
            return this;
        }
        return construct(this._componentType.widenBy(cls), this._valueHandler, this._typeHandler);
    }

    public ArrayType withContentTypeHandler(Object obj) {
        if (obj == this._componentType.getTypeHandler()) {
            return this;
        }
        return new ArrayType(this._componentType.withTypeHandler(obj), this._emptyArray, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public ArrayType withContentValueHandler(Object obj) {
        if (obj == this._componentType.getValueHandler()) {
            return this;
        }
        return new ArrayType(this._componentType.withValueHandler(obj), this._emptyArray, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public ArrayType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        return new ArrayType(this._componentType.withStaticTyping(), this._emptyArray, this._valueHandler, this._typeHandler, true);
    }

    public ArrayType withTypeHandler(Object obj) {
        Object obj2 = obj;
        if (obj == this._typeHandler) {
            return this;
        }
        return new ArrayType(this._componentType, this._emptyArray, this._valueHandler, obj2, this._asStatic);
    }

    public ArrayType withValueHandler(Object obj) {
        Object obj2 = obj;
        if (obj == this._valueHandler) {
            return this;
        }
        return new ArrayType(this._componentType, this._emptyArray, obj2, this._typeHandler, this._asStatic);
    }
}
