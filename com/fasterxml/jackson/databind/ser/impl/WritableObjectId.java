package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class WritableObjectId {
    public final ObjectIdGenerator generator;
    public Object id;
    public boolean idWritten = false;

    public WritableObjectId(ObjectIdGenerator objectIdGenerator) {
        this.generator = objectIdGenerator;
    }

    public Object generateId(Object obj) {
        Object generateId = this.generator.generateId(obj);
        this.id = generateId;
        return generateId;
    }

    public void writeAsField(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) {
        SerializableString serializableString = objectIdWriter.propertyName;
        this.idWritten = true;
        if (serializableString != null) {
            jsonGenerator.writeFieldName(serializableString);
            objectIdWriter.serializer.serialize(this.id, jsonGenerator, serializerProvider);
        }
    }

    public boolean writeAsId(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) {
        if (this.id == null || (!this.idWritten && !objectIdWriter.alwaysAsId)) {
            return false;
        }
        objectIdWriter.serializer.serialize(this.id, jsonGenerator, serializerProvider);
        return true;
    }
}
