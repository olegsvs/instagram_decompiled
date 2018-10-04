package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

public final class FilteredBeanPropertyWriter$SingleView extends BeanPropertyWriter {
    public final BeanPropertyWriter _delegate;
    public final Class _view;

    public FilteredBeanPropertyWriter$SingleView(BeanPropertyWriter beanPropertyWriter, Class cls) {
        super(beanPropertyWriter);
        this._delegate = beanPropertyWriter;
        this._view = cls;
    }

    public void assignNullSerializer(JsonSerializer jsonSerializer) {
        this._delegate.assignNullSerializer(jsonSerializer);
    }

    public void assignSerializer(JsonSerializer jsonSerializer) {
        this._delegate.assignSerializer(jsonSerializer);
    }

    public FilteredBeanPropertyWriter$SingleView rename(NameTransformer nameTransformer) {
        return new FilteredBeanPropertyWriter$SingleView(this._delegate.rename(nameTransformer), this._view);
    }

    public void serializeAsColumn(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Class activeView = serializerProvider.getActiveView();
        if (activeView != null) {
            if (!this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
                return;
            }
        }
        this._delegate.serializeAsColumn(obj, jsonGenerator, serializerProvider);
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Class activeView = serializerProvider.getActiveView();
        if (activeView == null || this._view.isAssignableFrom(activeView)) {
            this._delegate.serializeAsField(obj, jsonGenerator, serializerProvider);
        }
    }
}
