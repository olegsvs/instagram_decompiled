package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.webrtc.audio.WebRtcAudioRecord;

public abstract class BaseNodeDeserializer extends StdDeserializer {
    public void _handleDuplicateField(String str, ObjectNode objectNode, JsonNode jsonNode, JsonNode jsonNode2) {
    }

    public BaseNodeDeserializer() {
        super(JsonNode.class);
    }

    public void _reportProblem(JsonParser jsonParser, String str) {
        throw new JsonMappingException(str, jsonParser.getTokenLocation());
    }

    public final JsonNode deserializeAny(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        switch (BaseNodeDeserializer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
            case 5:
                return deserializeObject(jsonParser, deserializationContext, jsonNodeFactory);
            case 2:
                return deserializeArray(jsonParser, deserializationContext, jsonNodeFactory);
            case 3:
                return jsonNodeFactory.textNode(jsonParser.getText());
            case 6:
                Object embeddedObject = jsonParser.getEmbeddedObject();
                if (embeddedObject == null) {
                    break;
                } else if (embeddedObject.getClass() == byte[].class) {
                    return jsonNodeFactory.binaryNode((byte[]) embeddedObject);
                } else {
                    return jsonNodeFactory.pojoNode(embeddedObject);
                }
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                JsonParser$NumberType numberType = jsonParser.getNumberType();
                if (numberType != JsonParser$NumberType.BIG_INTEGER) {
                    if (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                        if (numberType == JsonParser$NumberType.INT) {
                            return jsonNodeFactory.numberNode(jsonParser.getIntValue());
                        }
                        return jsonNodeFactory.numberNode(jsonParser.getLongValue());
                    }
                }
                return jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
            case 8:
                if (jsonParser.getNumberType() != JsonParser$NumberType.BIG_DECIMAL) {
                    if (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonNodeFactory.numberNode(jsonParser.getDoubleValue());
                    }
                }
                return jsonNodeFactory.numberNode(jsonParser.getDecimalValue());
            case 9:
                return jsonNodeFactory.booleanNode(true);
            case 10:
                return jsonNodeFactory.booleanNode(false);
            case 11:
                break;
            default:
                throw deserializationContext.mappingException(getValueClass());
        }
        return jsonNodeFactory.nullNode();
    }

    public final ArrayNode deserializeArray(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        ArrayNode arrayNode = jsonNodeFactory.arrayNode();
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken != null) {
                switch (BaseNodeDeserializer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[nextToken.ordinal()]) {
                    case 1:
                        arrayNode.add(deserializeObject(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                    case 2:
                        arrayNode.add(deserializeArray(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                    case 3:
                        arrayNode.add(jsonNodeFactory.textNode(jsonParser.getText()));
                        break;
                    case 4:
                        return arrayNode;
                    default:
                        arrayNode.add(deserializeAny(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                }
            }
            throw deserializationContext.mappingException("Unexpected end-of-input when binding data into ArrayNode");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.node.ObjectNode deserializeObject(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.node.JsonNodeFactory r7) {
        /*
        r4 = this;
        r3 = r7.objectNode();
        r1 = r5.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        if (r1 != r0) goto L_0x0010;
    L_0x000c:
        r1 = r5.nextToken();
    L_0x0010:
        r0 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        if (r1 != r0) goto L_0x0048;
    L_0x0014:
        r2 = r5.getCurrentName();
        r1 = com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken;
        r0 = r5.nextToken();
        r0 = r0.ordinal();
        r0 = r1[r0];
        switch(r0) {
            case 1: goto L_0x003a;
            case 2: goto L_0x0035;
            case 3: goto L_0x002c;
            default: goto L_0x0027;
        };
    L_0x0027:
        r1 = r4.deserializeAny(r5, r6, r7);
        goto L_0x003e;
    L_0x002c:
        r0 = r5.getText();
        r1 = r7.textNode(r0);
        goto L_0x003e;
    L_0x0035:
        r1 = r4.deserializeArray(r5, r6, r7);
        goto L_0x003e;
    L_0x003a:
        r1 = r4.deserializeObject(r5, r6, r7);
    L_0x003e:
        r0 = r3.replace(r2, r1);
        if (r0 == 0) goto L_0x000c;
    L_0x0044:
        r4._handleDuplicateField(r2, r3, r0, r1);
        goto L_0x000c;
    L_0x0048:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.node.JsonNodeFactory):com.fasterxml.jackson.databind.node.ObjectNode");
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public JsonNode getNullValue() {
        return NullNode.getInstance();
    }
}
