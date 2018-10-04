package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public final class CollectionType extends CollectionLikeType {
    private static final long serialVersionUID = -7834910259750909424L;

    private CollectionType(Class cls, JavaType javaType, Object obj, Object obj2, boolean z) {
        super(cls, javaType, obj, obj2, z);
    }

    public JavaType _narrow(Class cls) {
        return new CollectionType(cls, this._elementType, null, null, this._asStatic);
    }

    public static CollectionType construct(Class cls, JavaType javaType) {
        return new CollectionType(cls, javaType, null, null, false);
    }

    public JavaType narrowContentsBy(Class cls) {
        if (cls == this._elementType.getRawClass()) {
            return this;
        }
        return new CollectionType(this._class, this._elementType.narrowBy(cls), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[collection type; class ");
        stringBuilder.append(this._class.getName());
        stringBuilder.append(", contains ");
        stringBuilder.append(this._elementType);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public JavaType widenContentsBy(Class cls) {
        if (cls == this._elementType.getRawClass()) {
            return this;
        }
        return new CollectionType(this._class, this._elementType.widenBy(cls), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public CollectionType withContentTypeHandler(Object obj) {
        return new CollectionType(this._class, this._elementType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public CollectionType withContentValueHandler(Object obj) {
        return new CollectionType(this._class, this._elementType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    public CollectionType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        return new CollectionType(this._class, this._elementType.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    public CollectionType withTypeHandler(Object obj) {
        return new CollectionType(this._class, this._elementType, this._valueHandler, obj, this._asStatic);
    }

    public CollectionType withValueHandler(Object obj) {
        return new CollectionType(this._class, this._elementType, obj, this._typeHandler, this._asStatic);
    }
}
