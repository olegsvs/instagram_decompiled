package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

public final class FilteredBeanPropertyWriter$MultiView extends BeanPropertyWriter {
    public final BeanPropertyWriter _delegate;
    public final Class[] _views;

    public FilteredBeanPropertyWriter$MultiView(BeanPropertyWriter beanPropertyWriter, Class[] clsArr) {
        super(beanPropertyWriter);
        this._delegate = beanPropertyWriter;
        this._views = clsArr;
    }

    public void assignNullSerializer(JsonSerializer jsonSerializer) {
        this._delegate.assignNullSerializer(jsonSerializer);
    }

    public void assignSerializer(JsonSerializer jsonSerializer) {
        this._delegate.assignSerializer(jsonSerializer);
    }

    public FilteredBeanPropertyWriter$MultiView rename(NameTransformer nameTransformer) {
        return new FilteredBeanPropertyWriter$MultiView(this._delegate.rename(nameTransformer), this._views);
    }

    public void serializeAsColumn(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Class activeView = serializerProvider.getActiveView();
        if (activeView != null) {
            int i = 0;
            int length = this._views.length;
            while (i < length) {
                if (this._views[i].isAssignableFrom(activeView)) {
                    break;
                }
                i++;
            }
            if (i == length) {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
                return;
            }
        }
        this._delegate.serializeAsColumn(obj, jsonGenerator, serializerProvider);
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Class activeView = serializerProvider.getActiveView();
        if (activeView != null) {
            int i = 0;
            int length = this._views.length;
            while (i < length) {
                if (this._views[i].isAssignableFrom(activeView)) {
                    break;
                }
                i++;
            }
            if (i == length) {
                return;
            }
        }
        this._delegate.serializeAsField(obj, jsonGenerator, serializerProvider);
    }
}
