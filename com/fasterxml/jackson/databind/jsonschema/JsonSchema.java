package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonSchema {
    private final ObjectNode schema;

    @JsonCreator
    public JsonSchema(ObjectNode objectNode) {
        this.schema = objectNode;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj instanceof JsonSchema) {
                    JsonSchema jsonSchema = (JsonSchema) obj;
                    ObjectNode objectNode = this.schema;
                    if (objectNode != null) {
                        return objectNode.equals(jsonSchema.schema);
                    }
                    if (jsonSchema.schema != null) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public static JsonNode getDefaultSchemaNode() {
        JsonNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", "any");
        return objectNode;
    }

    @JsonValue
    public ObjectNode getSchemaNode() {
        return this.schema;
    }

    public int hashCode() {
        return this.schema.hashCode();
    }

    public String toString() {
        return this.schema.toString();
    }
}
