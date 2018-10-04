package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonNodeDeserializer extends BaseNodeDeserializer {
    private static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

    public final class ArrayDeserializer extends BaseNodeDeserializer {
        public static final ArrayDeserializer _instance = new ArrayDeserializer();
        private static final long serialVersionUID = 1;

        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.isExpectedStartArrayToken()) {
                return deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            throw deserializationContext.mappingException(ArrayNode.class);
        }

        public static ArrayDeserializer getInstance() {
            return _instance;
        }
    }

    public final class ObjectDeserializer extends BaseNodeDeserializer {
        public static final ObjectDeserializer _instance = new ObjectDeserializer();
        private static final long serialVersionUID = 1;

        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                jsonParser.nextToken();
                return deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            } else if (jsonParser.getCurrentToken() == JsonToken.FIELD_NAME) {
                return deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            } else {
                throw deserializationContext.mappingException(ObjectNode.class);
            }
        }

        public static ObjectDeserializer getInstance() {
            return _instance;
        }
    }

    public JsonNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        switch (JsonNodeDeserializer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
                return deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            case 2:
                return deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            default:
                return deserializeAny(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
        }
    }

    public static JsonDeserializer getDeserializer(Class cls) {
        if (cls == ObjectNode.class) {
            return ObjectDeserializer.getInstance();
        }
        if (cls == ArrayNode.class) {
            return ArrayDeserializer.getInstance();
        }
        return instance;
    }
}
