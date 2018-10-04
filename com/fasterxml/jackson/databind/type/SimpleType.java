package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;
import java.util.Map;

public final class SimpleType extends TypeBase {
    private static final long serialVersionUID = -800374828948534376L;
    public final String[] _typeNames;
    public final JavaType[] _typeParameters;

    public boolean isContainerType() {
        return false;
    }

    public SimpleType(Class cls) {
        this(cls, null, null, null, null, false);
    }

    public SimpleType(Class cls, String[] strArr, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z) {
        super(cls, 0, obj, obj2, z);
        if (strArr != null) {
            if (strArr.length != 0) {
                r1._typeNames = strArr;
                r1._typeParameters = javaTypeArr;
                return;
            }
        }
        r1._typeNames = null;
        r1._typeParameters = null;
    }

    public JavaType _narrow(Class cls) {
        return new SimpleType(cls, this._typeNames, this._typeParameters, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public String buildCanonicalName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this._class.getName());
        JavaType[] javaTypeArr = this._typeParameters;
        if (javaTypeArr != null && javaTypeArr.length > 0) {
            stringBuilder.append('<');
            Object obj = 1;
            for (ResolvedType resolvedType : this._typeParameters) {
                if (obj != null) {
                    obj = null;
                } else {
                    stringBuilder.append(',');
                }
                stringBuilder.append(resolvedType.toCanonical());
            }
            stringBuilder.append('>');
        }
        return stringBuilder.toString();
    }

    public static SimpleType construct(Class cls) {
        StringBuilder stringBuilder;
        if (Map.class.isAssignableFrom(cls)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can not construct SimpleType for a Map (class: ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (Collection.class.isAssignableFrom(cls)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can not construct SimpleType for a Collection (class: ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!cls.isArray()) {
            return new SimpleType(cls);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can not construct SimpleType for an array (class: ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static SimpleType constructUnsafe(Class cls) {
        return new SimpleType(cls, null, null, null, null, false);
    }

    public JavaType containedType(int i) {
        if (i >= 0) {
            JavaType[] javaTypeArr = this._typeParameters;
            if (javaTypeArr != null) {
                if (i < javaTypeArr.length) {
                    return javaTypeArr[i];
                }
            }
        }
        return null;
    }

    public int containedTypeCount() {
        JavaType[] javaTypeArr = this._typeParameters;
        return javaTypeArr == null ? 0 : javaTypeArr.length;
    }

    public String containedTypeName(int i) {
        if (i >= 0) {
            String[] strArr = this._typeNames;
            if (strArr != null) {
                if (i < strArr.length) {
                    return strArr[i];
                }
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    SimpleType simpleType = (SimpleType) obj;
                    if (simpleType._class == this._class) {
                        JavaType[] javaTypeArr = this._typeParameters;
                        JavaType[] javaTypeArr2 = simpleType._typeParameters;
                        if (javaTypeArr == null) {
                            if (javaTypeArr2 != null) {
                                if (javaTypeArr2.length != 0) {
                                    z = false;
                                }
                            }
                        } else if (javaTypeArr2 != null) {
                            if (javaTypeArr.length == javaTypeArr2.length) {
                                int length = javaTypeArr.length;
                                int i = 0;
                                while (i < length) {
                                    if (javaTypeArr[i].equals(javaTypeArr2[i])) {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public StringBuilder getErasedSignature(StringBuilder stringBuilder) {
        return TypeBase._classSignature(this._class, stringBuilder, true);
    }

    public StringBuilder getGenericSignature(StringBuilder stringBuilder) {
        int i = 0;
        TypeBase._classSignature(this._class, stringBuilder, false);
        if (this._typeParameters != null) {
            stringBuilder.append('<');
            JavaType[] javaTypeArr = this._typeParameters;
            int length = javaTypeArr.length;
            while (i < length) {
                stringBuilder = javaTypeArr[i].getGenericSignature(stringBuilder);
                i++;
            }
            stringBuilder.append('>');
        }
        stringBuilder.append(';');
        return stringBuilder;
    }

    public JavaType narrowContentsBy(Class cls) {
        throw new IllegalArgumentException("Internal error: SimpleType.narrowContentsBy() should never be called");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("[simple type, class ");
        stringBuilder.append(buildCanonicalName());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public JavaType widenContentsBy(Class cls) {
        throw new IllegalArgumentException("Internal error: SimpleType.widenContentsBy() should never be called");
    }

    public JavaType withContentTypeHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContenTypeHandler()");
    }

    public SimpleType withContentValueHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContenValueHandler()");
    }

    public SimpleType withStaticTyping() {
        return this._asStatic ? this : new SimpleType(this._class, this._typeNames, this._typeParameters, this._valueHandler, this._typeHandler, this._asStatic);
    }

    public SimpleType withTypeHandler(Object obj) {
        return new SimpleType(this._class, this._typeNames, this._typeParameters, this._valueHandler, obj, this._asStatic);
    }

    public SimpleType withValueHandler(Object obj) {
        Object obj2 = obj;
        if (obj == this._valueHandler) {
            return this;
        }
        return new SimpleType(this._class, this._typeNames, this._typeParameters, obj2, this._typeHandler, this._asStatic);
    }
}
