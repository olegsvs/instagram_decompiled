package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;

public interface JsonArrayFormatVisitor extends JsonFormatVisitorWithSerializerProvider {

    public class Base implements JsonArrayFormatVisitor {
        public SerializerProvider _provider;

        public void itemsFormat(JsonFormatTypes jsonFormatTypes) {
        }

        public void itemsFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
        }

        public Base(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }

        public SerializerProvider getProvider() {
            return this._provider;
        }

        public void setProvider(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }
    }

    void itemsFormat(JsonFormatTypes jsonFormatTypes);

    void itemsFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType);
}
