package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Map;

public class MapLikeType extends TypeBase {
    private static final long serialVersionUID = 416067702302823522L;
    public final JavaType _keyType;
    public final JavaType _valueType;

    public int containedTypeCount() {
        return 2;
    }

    public String containedTypeName(int i) {
        return i == 0 ? "K" : i == 1 ? "V" : null;
    }

    public boolean isContainerType() {
        return true;
    }

    public boolean isMapLikeType() {
        return true;
    }

    public MapLikeType(Class cls, JavaType javaType, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, javaType.hashCode() ^ javaType2.hashCode(), obj, obj2, z);
        this._keyType = javaType;
        this._valueType = javaType2;
    }

    public JavaType _narrow(Class cls) {
        return new MapLikeType(cls, this._keyType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public String buildCanonicalName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this._class.getName());
        if (this._keyType != null) {
            stringBuilder.append('<');
            stringBuilder.append(this._keyType.toCanonical());
            stringBuilder.append(',');
            stringBuilder.append(this._valueType.toCanonical());
            stringBuilder.append('>');
        }
        return stringBuilder.toString();
    }

    public static MapLikeType construct(Class cls, JavaType javaType, JavaType javaType2) {
        return new MapLikeType(cls, javaType, javaType2, null, null, false);
    }

    public JavaType containedType(int i) {
        if (i == 0) {
            return this._keyType;
        }
        return i == 1 ? this._valueType : null;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    MapLikeType mapLikeType = (MapLikeType) obj;
                    if (this._class != mapLikeType._class || !this._keyType.equals(mapLikeType._keyType) || !this._valueType.equals(mapLikeType._valueType)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    public StringBuilder getErasedSignature(StringBuilder stringBuilder) {
        return TypeBase._classSignature(this._class, stringBuilder, true);
    }

    public StringBuilder getGenericSignature(StringBuilder stringBuilder) {
        TypeBase._classSignature(this._class, stringBuilder, false);
        stringBuilder.append('<');
        this._keyType.getGenericSignature(stringBuilder);
        this._valueType.getGenericSignature(stringBuilder);
        stringBuilder.append(">;");
        return stringBuilder;
    }

    public JavaType getKeyType() {
        return this._keyType;
    }

    public boolean isTrueMapType() {
        return Map.class.isAssignableFrom(this._class);
    }

    public JavaType narrowContentsBy(Class cls) {
        if (cls == this._valueType.getRawClass()) {
            return this;
        }
        return new MapLikeType(this._class, this._keyType, this._valueType.narrowBy(cls), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public JavaType narrowKey(Class cls) {
        if (cls == this._keyType.getRawClass()) {
            return this;
        }
        return new MapLikeType(this._class, this._keyType.narrowBy(cls), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[map-like type; class ");
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
        return new MapLikeType(this._class, this._keyType, this._valueType.widenBy(cls), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public JavaType widenKey(Class cls) {
        if (cls == this._keyType.getRawClass()) {
            return this;
        }
        return new MapLikeType(this._class, this._keyType.widenBy(cls), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapLikeType withContentTypeHandler(Object obj) {
        return new MapLikeType(this._class, this._keyType, this._valueType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapLikeType withContentValueHandler(Object obj) {
        return new MapLikeType(this._class, this._keyType, this._valueType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapLikeType withKeyTypeHandler(Object obj) {
        return new MapLikeType(this._class, this._keyType.withTypeHandler(obj), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapLikeType withKeyValueHandler(Object obj) {
        return new MapLikeType(this._class, this._keyType.withValueHandler(obj), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public MapLikeType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        return new MapLikeType(this._class, this._keyType, this._valueType.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    public MapLikeType withTypeHandler(Object obj) {
        return new MapLikeType(this._class, this._keyType, this._valueType, this._valueHandler, obj, this._asStatic);
    }

    public MapLikeType withValueHandler(Object obj) {
        return new MapLikeType(this._class, this._keyType, this._valueType, obj, this._typeHandler, this._asStatic);
    }
}
