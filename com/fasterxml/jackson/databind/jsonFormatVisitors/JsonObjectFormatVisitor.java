package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;

public interface JsonObjectFormatVisitor extends JsonFormatVisitorWithSerializerProvider {

    public class Base implements JsonObjectFormatVisitor {
        public SerializerProvider _provider;

        public void optionalProperty(BeanProperty beanProperty) {
        }

        public void optionalProperty(String str) {
        }

        public void optionalProperty(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
        }

        public void property(BeanProperty beanProperty) {
        }

        public void property(String str) {
        }

        public void property(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
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

    void optionalProperty(BeanProperty beanProperty);

    void optionalProperty(String str);

    void optionalProperty(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType);

    void property(BeanProperty beanProperty);

    void property(String str);

    void property(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType);
}
