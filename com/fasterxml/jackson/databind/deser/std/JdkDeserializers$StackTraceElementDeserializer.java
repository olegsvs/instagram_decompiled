package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;

public class JdkDeserializers$StackTraceElementDeserializer extends StdScalarDeserializer {
    public static final JdkDeserializers$StackTraceElementDeserializer instance = new JdkDeserializers$StackTraceElementDeserializer();

    public JdkDeserializers$StackTraceElementDeserializer() {
        super(StackTraceElement.class);
    }

    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            String str = JsonProperty.USE_DEFAULT_NAME;
            String str2 = JsonProperty.USE_DEFAULT_NAME;
            String str3 = JsonProperty.USE_DEFAULT_NAME;
            int i = -1;
            while (true) {
                JsonToken nextValue = jsonParser.nextValue();
                if (nextValue == JsonToken.END_OBJECT) {
                    return new StackTraceElement(str, str2, str3, i);
                }
                String currentName = jsonParser.getCurrentName();
                if ("className".equals(currentName)) {
                    str = jsonParser.getText();
                } else if ("fileName".equals(currentName)) {
                    str3 = jsonParser.getText();
                } else if ("lineNumber".equals(currentName)) {
                    if (nextValue.isNumeric()) {
                        i = jsonParser.getIntValue();
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Non-numeric token (");
                        stringBuilder.append(nextValue);
                        stringBuilder.append(") for property 'lineNumber'");
                        throw JsonMappingException.from(jsonParser, stringBuilder.toString());
                    }
                } else if ("methodName".equals(currentName)) {
                    str2 = jsonParser.getText();
                } else if (!"nativeMethod".equals(currentName)) {
                    handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, currentName);
                }
            }
        } else {
            throw deserializationContext.mappingException(this._valueClass, currentToken);
        }
    }
}
