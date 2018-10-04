package com.fasterxml.jackson.databind.ser.std;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.lang.reflect.Type;
import java.util.Collection;

public abstract class StaticListSerializerBase extends StdSerializer {
    public abstract void acceptContentVisitor(JsonArrayFormatVisitor jsonArrayFormatVisitor);

    public abstract JsonNode contentSchema();

    public StaticListSerializerBase(Class cls) {
        super(cls, false);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        acceptContentVisitor(jsonFormatVisitorWrapper.expectArrayFormat(javaType));
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put(DialogModule.KEY_ITEMS, contentSchema());
        return createSchemaNode;
    }

    public boolean isEmpty(Collection collection) {
        if (collection != null) {
            if (collection.size() != 0) {
                return false;
            }
        }
        return true;
    }
}
