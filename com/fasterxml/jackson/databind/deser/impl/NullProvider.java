package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;

public final class NullProvider implements Serializable {
    private static final long serialVersionUID = 1;
    private final boolean _isPrimitive;
    private final Object _nullValue;
    private final Class _rawType;

    public NullProvider(JavaType javaType, Object obj) {
        this._nullValue = obj;
        this._isPrimitive = javaType.isPrimitive();
        this._rawType = javaType.getRawClass();
    }

    public Object nullValue(DeserializationContext deserializationContext) {
        if (this._isPrimitive) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can not map JSON null into type ");
                stringBuilder.append(this._rawType.getName());
                stringBuilder.append(" (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)");
                throw deserializationContext.mappingException(stringBuilder.toString());
            }
        }
        return this._nullValue;
    }
}
