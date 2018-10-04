package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class TypeBase extends JavaType implements JsonSerializable {
    private static final long serialVersionUID = -3581199092426900829L;
    public volatile transient String _canonicalName;

    public abstract String buildCanonicalName();

    public abstract StringBuilder getErasedSignature(StringBuilder stringBuilder);

    public abstract StringBuilder getGenericSignature(StringBuilder stringBuilder);

    public TypeBase(Class cls, int i, Object obj, Object obj2) {
        this(cls, i, obj, obj2, false);
    }

    public TypeBase(Class cls, int i, Object obj, Object obj2, boolean z) {
        super(cls, i, obj, obj2, z);
    }

    public static StringBuilder _classSignature(Class cls, StringBuilder stringBuilder, boolean z) {
        if (!cls.isPrimitive()) {
            stringBuilder.append('L');
            cls = cls.getName();
            int length = cls.length();
            for (int i = 0; i < length; i++) {
                char charAt = cls.charAt(i);
                if (charAt == '.') {
                    charAt = '/';
                }
                stringBuilder.append(charAt);
            }
            if (z) {
                stringBuilder.append(';');
            }
        } else if (cls == Boolean.TYPE) {
            stringBuilder.append('Z');
        } else if (cls == Byte.TYPE) {
            stringBuilder.append('B');
        } else if (cls == Short.TYPE) {
            stringBuilder.append('S');
        } else if (cls == Character.TYPE) {
            stringBuilder.append('C');
        } else if (cls == Integer.TYPE) {
            stringBuilder.append('I');
        } else if (cls == Long.TYPE) {
            stringBuilder.append('J');
        } else if (cls == Float.TYPE) {
            stringBuilder.append('F');
        } else if (cls == Double.TYPE) {
            stringBuilder.append('D');
        } else if (cls == Void.TYPE) {
            stringBuilder.append('V');
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unrecognized primitive type: ");
            stringBuilder2.append(cls.getName());
            throw new IllegalStateException(stringBuilder2.toString());
        }
        return stringBuilder;
    }

    public Object getTypeHandler() {
        return this._typeHandler;
    }

    public Object getValueHandler() {
        return this._valueHandler;
    }

    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeString(toCanonical());
    }

    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForScalar(this, jsonGenerator);
        serialize(jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForScalar(this, jsonGenerator);
    }

    public String toCanonical() {
        String str = this._canonicalName;
        return str == null ? buildCanonicalName() : str;
    }
}
