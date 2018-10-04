package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.util.ClassUtil;

@JacksonStdImpl
public class ClassDeserializer extends StdScalarDeserializer {
    public static final ClassDeserializer instance = new ClassDeserializer();
    private static final long serialVersionUID = 1;

    public ClassDeserializer() {
        super(Class.class);
    }

    public Class deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.VALUE_STRING) {
            try {
                return deserializationContext.findClass(jsonParser.getText().trim());
            } catch (Throwable e) {
                throw deserializationContext.instantiationException(this._valueClass, ClassUtil.getRootCause(e));
            }
        }
        throw deserializationContext.mappingException(this._valueClass, currentToken);
    }
}
