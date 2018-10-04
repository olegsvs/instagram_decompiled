package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class SimpleBeanPropertyFilter implements BeanPropertyFilter {

    public class FilterExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
        private static final long serialVersionUID = 1;
        public final Set _propertiesToInclude;

        public FilterExceptFilter(Set set) {
            this._propertiesToInclude = set;
        }

        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return this._propertiesToInclude.contains(beanPropertyWriter.getName());
        }
    }

    public class SerializeExceptFilter extends SimpleBeanPropertyFilter {
        public final Set _propertiesToExclude;

        public SerializeExceptFilter(Set set) {
            this._propertiesToExclude = set;
        }

        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return this._propertiesToExclude.contains(beanPropertyWriter.getName()) ^ 1;
        }
    }

    public abstract boolean include(BeanPropertyWriter beanPropertyWriter);

    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(jsonObjectFormatVisitor);
        }
    }

    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, ObjectNode objectNode, SerializerProvider serializerProvider) {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(objectNode, serializerProvider);
        }
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(Set set) {
        return new FilterExceptFilter(set);
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(String... strArr) {
        Object hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new FilterExceptFilter(hashSet);
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(Set set) {
        return new SerializeExceptFilter(set);
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(String... strArr) {
        Object hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new SerializeExceptFilter(hashSet);
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, BeanPropertyWriter beanPropertyWriter) {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
        }
    }
}
