package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public final class MapType extends MapLikeType {
    private static final long serialVersionUID = -811146779148281500L;

    private MapType(Class cls, JavaType javaType, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, javaType, javaType2, obj, obj2, z);
    }

    public JavaType _narrow(Class cls) {
        return new MapType(cls, this._keyType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public static MapType construct(Class cls, JavaType javaType, JavaType javaType2) {
        return new MapType(cls, javaType, javaType2, null, null, false);
    }

    public JavaType narrowContentsBy(Class cls) {
        if (cls == this._valueType.getRawClass()) {
            return this;
        }
        return new MapType(this._class, this._keyType, this._valueType.narrowBy(cls), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public JavaType narrowKey(Class cls) {
        if (cls == this._keyType.getRawClass()) {
            return this;
        }
        return new MapType(this._class, this._keyType.narrowBy(cls), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[map type; class ");
        stringBuilder.append(this._class.getName());
        stringBuilder.append(", ");
        stringBuilder.append(this._keyType);
        stringBuilder.append(" -> ");
        stringBuilder.append(this._valueType);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public JavaType widenContentsBy(Class cls) {
        if (cls == this._valueType.getRawClass()) {
            return this;
        }
        return new MapType(this._class, this._keyType, this._valueType.widenBy(cls), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public JavaType widenKey(Class cls) {
        if (cls == this._keyType.getRawClass()) {
            return this;
        }
        return new MapType(this._class, this._keyType.widenBy(cls), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapType withContentTypeHandler(Object obj) {
        return new MapType(this._class, this._keyType, this._valueType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapType withContentValueHandler(Object obj) {
        return new MapType(this._class, this._keyType, this._valueType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapType withKeyTypeHandler(Object obj) {
        return new MapType(this._class, this._keyType.withTypeHandler(obj), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapType withKeyValueHandler(Object obj) {
        return new MapType(this._class, this._keyType.withValueHandler(obj), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        return new MapType(this._class, this._keyType.withStaticTyping(), this._valueType.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    public MapType withTypeHandler(Object obj) {
        return new MapType(this._class, this._keyType, this._valueType, this._valueHandler, obj, this._asStatic);
    }

    public MapType withValueHandler(Object obj) {
        return new MapType(this._class, this._keyType, this._valueType, obj, this._typeHandler, this._asStatic);
    }
}
