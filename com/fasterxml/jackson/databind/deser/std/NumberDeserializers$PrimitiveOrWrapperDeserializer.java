package com.fasterxml.jackson.databind.deser.std;

public abstract class NumberDeserializers$PrimitiveOrWrapperDeserializer extends StdScalarDeserializer {
    private static final long serialVersionUID = 1;
    public final Object _nullValue;

    public NumberDeserializers$PrimitiveOrWrapperDeserializer(Class cls, Object obj) {
        super(cls);
        this._nullValue = obj;
    }

    public final Object getNullValue() {
        return this._nullValue;
    }
}
