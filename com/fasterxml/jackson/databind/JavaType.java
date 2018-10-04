package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.type.ResolvedType;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public abstract class JavaType extends ResolvedType implements Serializable, Type {
    private static final long serialVersionUID = 6774285981275451126L;
    public final boolean _asStatic;
    public final Class _class;
    public final int _hashCode;
    public final Object _typeHandler;
    public final Object _valueHandler;

    public abstract JavaType _narrow(Class cls);

    public JavaType containedType(int i) {
        return null;
    }

    public int containedTypeCount() {
        return 0;
    }

    public String containedTypeName(int i) {
        return null;
    }

    public abstract boolean equals(Object obj);

    public JavaType getContentType() {
        return null;
    }

    public abstract StringBuilder getErasedSignature(StringBuilder stringBuilder);

    public abstract StringBuilder getGenericSignature(StringBuilder stringBuilder);

    public JavaType getKeyType() {
        return null;
    }

    public boolean isArrayType() {
        return false;
    }

    public boolean isCollectionLikeType() {
        return false;
    }

    public abstract boolean isContainerType();

    public boolean isMapLikeType() {
        return false;
    }

    public abstract JavaType narrowContentsBy(Class cls);

    public abstract String toString();

    public abstract JavaType widenContentsBy(Class cls);

    public abstract JavaType withContentTypeHandler(Object obj);

    public abstract JavaType withContentValueHandler(Object obj);

    public abstract JavaType withStaticTyping();

    public abstract JavaType withTypeHandler(Object obj);

    public abstract JavaType withValueHandler(Object obj);

    public JavaType(Class cls, int i, Object obj, Object obj2, boolean z) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode() + i;
        this._valueHandler = obj;
        this._typeHandler = obj2;
        this._asStatic = z;
    }

    public void _assertSubclass(Class cls, Class cls2) {
        if (!this._class.isAssignableFrom(cls)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" is not assignable to ");
            stringBuilder.append(this._class.getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public JavaType _widen(Class cls) {
        return _narrow(cls);
    }

    public JavaType forcedNarrowBy(Class cls) {
        if (cls == this._class) {
            return this;
        }
        JavaType _narrow = _narrow(cls);
        if (this._valueHandler != _narrow.getValueHandler()) {
            _narrow = _narrow.withValueHandler(this._valueHandler);
        }
        if (this._typeHandler != _narrow.getTypeHandler()) {
            _narrow = _narrow.withTypeHandler(this._typeHandler);
        }
        return _narrow;
    }

    public String getErasedSignature() {
        StringBuilder stringBuilder = new StringBuilder(40);
        getErasedSignature(stringBuilder);
        return stringBuilder.toString();
    }

    public String getGenericSignature() {
        StringBuilder stringBuilder = new StringBuilder(40);
        getGenericSignature(stringBuilder);
        return stringBuilder.toString();
    }

    public final Class getRawClass() {
        return this._class;
    }

    public Object getTypeHandler() {
        return this._typeHandler;
    }

    public Object getValueHandler() {
        return this._valueHandler;
    }

    public boolean hasGenericTypes() {
        return containedTypeCount() > 0;
    }

    public final boolean hasRawClass(Class cls) {
        return this._class == cls;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(this._class.getModifiers());
    }

    public boolean isConcrete() {
        if ((this._class.getModifiers() & 1536) != 0) {
            if (!this._class.isPrimitive()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEnumType() {
        return this._class.isEnum();
    }

    public final boolean isFinal() {
        return Modifier.isFinal(this._class.getModifiers());
    }

    public final boolean isInterface() {
        return this._class.isInterface();
    }

    public final boolean isPrimitive() {
        return this._class.isPrimitive();
    }

    public boolean isThrowable() {
        return Throwable.class.isAssignableFrom(this._class);
    }

    public JavaType narrowBy(Class cls) {
        Class cls2 = this._class;
        if (cls == cls2) {
            return this;
        }
        _assertSubclass(cls, cls2);
        JavaType _narrow = _narrow(cls);
        if (this._valueHandler != _narrow.getValueHandler()) {
            _narrow = _narrow.withValueHandler(this._valueHandler);
        }
        if (this._typeHandler != _narrow.getTypeHandler()) {
            _narrow = _narrow.withTypeHandler(this._typeHandler);
        }
        return _narrow;
    }

    public final boolean useStaticType() {
        return this._asStatic;
    }

    public JavaType widenBy(Class cls) {
        Class cls2 = this._class;
        if (cls == cls2) {
            return this;
        }
        _assertSubclass(cls2, cls);
        return _widen(cls);
    }
}
