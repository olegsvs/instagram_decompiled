package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;

public interface JsonMapFormatVisitor extends JsonFormatVisitorWithSerializerProvider {

    public class Base implements JsonMapFormatVisitor {
        public SerializerProvider _provider;

        public void keyFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
        }

        public void valueFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
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

    void keyFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType);

    void valueFormat(JsonFormatVisitable jsonFormatVisitable, JavaType javaType);
}
