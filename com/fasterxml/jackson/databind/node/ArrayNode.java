package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ArrayNode extends ContainerNode {
    private final List _children = new ArrayList();

    public JsonNode get(String str) {
        return null;
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
    }

    private ArrayNode _add(JsonNode jsonNode) {
        this._children.add(jsonNode);
        return this;
    }

    private ArrayNode _insert(int i, JsonNode jsonNode) {
        if (i < 0) {
            this._children.add(0, jsonNode);
        } else if (i >= this._children.size()) {
            this._children.add(jsonNode);
        } else {
            this._children.add(i, jsonNode);
        }
        return this;
    }

    public ArrayNode add(double d) {
        return _add(numberNode(d));
    }

    public ArrayNode add(float f) {
        return _add(numberNode(f));
    }

    public ArrayNode add(int i) {
        _add(numberNode(i));
        return this;
    }

    public ArrayNode add(long j) {
        return _add(numberNode(j));
    }

    public ArrayNode add(JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _add(jsonNode);
        return this;
    }

    public ArrayNode add(Boolean bool) {
        if (bool == null) {
            return addNull();
        }
        return _add(booleanNode(bool.booleanValue()));
    }

    public ArrayNode add(Double d) {
        if (d == null) {
            return addNull();
        }
        return _add(numberNode(d.doubleValue()));
    }

    public ArrayNode add(Float f) {
        if (f == null) {
            return addNull();
        }
        return _add(numberNode(f.floatValue()));
    }

    public ArrayNode add(Integer num) {
        if (num == null) {
            return addNull();
        }
        return _add(numberNode(num.intValue()));
    }

    public ArrayNode add(Long l) {
        if (l == null) {
            return addNull();
        }
        return _add(numberNode(l.longValue()));
    }

    public ArrayNode add(String str) {
        if (str == null) {
            return addNull();
        }
        return _add(textNode(str));
    }

    public ArrayNode add(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return addNull();
        }
        return _add(numberNode(bigDecimal));
    }

    public ArrayNode add(boolean z) {
        return _add(booleanNode(z));
    }

    public ArrayNode add(byte[] bArr) {
        if (bArr == null) {
            return addNull();
        }
        return _add(binaryNode(bArr));
    }

    public ArrayNode addAll(ArrayNode arrayNode) {
        this._children.addAll(arrayNode._children);
        return this;
    }

    public ArrayNode addAll(Collection collection) {
        this._children.addAll(collection);
        return this;
    }

    public ArrayNode addArray() {
        JsonNode arrayNode = arrayNode();
        _add(arrayNode);
        return arrayNode;
    }

    public ArrayNode addNull() {
        _add(nullNode());
        return this;
    }

    public ObjectNode addObject() {
        JsonNode objectNode = objectNode();
        _add(objectNode);
        return objectNode;
    }

    public ArrayNode addPOJO(Object obj) {
        if (obj == null) {
            addNull();
        } else {
            _add(pojoNode(obj));
        }
        return this;
    }

    public JsonToken asToken() {
        return JsonToken.START_ARRAY;
    }

    public ArrayNode deepCopy() {
        ArrayNode arrayNode = new ArrayNode(this._nodeFactory);
        for (JsonNode deepCopy : this._children) {
            arrayNode._children.add(deepCopy.deepCopy());
        }
        return arrayNode;
    }

    public Iterator elements() {
        return this._children.iterator();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return this._children.equals(((ArrayNode) obj)._children);
            }
        }
        return false;
    }

    public ObjectNode findParent(String str) {
        for (JsonNode findParent : this._children) {
            JsonNode findParent2 = findParent2.findParent(str);
            if (findParent2 != null) {
                return (ObjectNode) findParent2;
            }
        }
        return null;
    }

    public List findParents(String str, List list) {
        for (JsonNode findParents : this._children) {
            list = findParents.findParents(str, list);
        }
        return list;
    }

    public JsonNode findValue(String str) {
        for (JsonNode findValue : this._children) {
            JsonNode findValue2 = findValue2.findValue(str);
            if (findValue2 != null) {
                return findValue2;
            }
        }
        return null;
    }

    public List findValues(String str, List list) {
        for (JsonNode findValues : this._children) {
            list = findValues.findValues(str, list);
        }
        return list;
    }

    public List findValuesAsText(String str, List list) {
        for (JsonNode findValuesAsText : this._children) {
            list = findValuesAsText.findValuesAsText(str, list);
        }
        return list;
    }

    public JsonNode get(int i) {
        return (i < 0 || i >= this._children.size()) ? null : (JsonNode) this._children.get(i);
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    public ArrayNode insert(int i, double d) {
        return _insert(i, numberNode(d));
    }

    public ArrayNode insert(int i, float f) {
        return _insert(i, numberNode(f));
    }

    public ArrayNode insert(int i, int i2) {
        _insert(i, numberNode(i2));
        return this;
    }

    public ArrayNode insert(int i, long j) {
        return _insert(i, numberNode(j));
    }

    public ArrayNode insert(int i, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _insert(i, jsonNode);
        return this;
    }

    public ArrayNode insert(int i, Boolean bool) {
        if (bool == null) {
            return insertNull(i);
        }
        return _insert(i, booleanNode(bool.booleanValue()));
    }

    public ArrayNode insert(int i, Double d) {
        if (d == null) {
            return insertNull(i);
        }
        return _insert(i, numberNode(d.doubleValue()));
    }

    public ArrayNode insert(int i, Float f) {
        if (f == null) {
            return insertNull(i);
        }
        return _insert(i, numberNode(f.floatValue()));
    }

    public ArrayNode insert(int i, Integer num) {
        if (num == null) {
            insertNull(i);
        } else {
            _insert(i, numberNode(num.intValue()));
        }
        return this;
    }

    public ArrayNode insert(int i, Long l) {
        if (l == null) {
            return insertNull(i);
        }
        return _insert(i, numberNode(l.longValue()));
    }

    public ArrayNode insert(int i, String str) {
        if (str == null) {
            return insertNull(i);
        }
        return _insert(i, textNode(str));
    }

    public ArrayNode insert(int i, BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return insertNull(i);
        }
        return _insert(i, numberNode(bigDecimal));
    }

    public ArrayNode insert(int i, boolean z) {
        return _insert(i, booleanNode(z));
    }

    public ArrayNode insert(int i, byte[] bArr) {
        if (bArr == null) {
            return insertNull(i);
        }
        return _insert(i, binaryNode(bArr));
    }

    public ArrayNode insertArray(int i) {
        JsonNode arrayNode = arrayNode();
        _insert(i, arrayNode);
        return arrayNode;
    }

    public ArrayNode insertNull(int i) {
        _insert(i, nullNode());
        return this;
    }

    public ObjectNode insertObject(int i) {
        JsonNode objectNode = objectNode();
        _insert(i, objectNode);
        return objectNode;
    }

    public ArrayNode insertPOJO(int i, Object obj) {
        if (obj == null) {
            return insertNull(i);
        }
        return _insert(i, pojoNode(obj));
    }

    public JsonNode path(int i) {
        if (i < 0 || i >= this._children.size()) {
            return MissingNode.getInstance();
        }
        return (JsonNode) this._children.get(i);
    }

    public JsonNode path(String str) {
        return MissingNode.getInstance();
    }

    public JsonNode remove(int i) {
        return (i < 0 || i >= this._children.size()) ? null : (JsonNode) this._children.remove(i);
    }

    public ArrayNode removeAll() {
        this._children.clear();
        return this;
    }

    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartArray();
        for (JsonNode jsonNode : this._children) {
            ((BaseJsonNode) jsonNode).serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndArray();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForArray(this, jsonGenerator);
        for (JsonNode jsonNode : this._children) {
            ((BaseJsonNode) jsonNode).serialize(jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffixForArray(this, jsonGenerator);
    }

    public JsonNode set(int i, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        if (i >= 0 && i < this._children.size()) {
            return (JsonNode) this._children.set(i, jsonNode);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal index ");
        stringBuilder.append(i);
        stringBuilder.append(", array size ");
        stringBuilder.append(size());
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public int size() {
        return this._children.size();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder((size() << 4) + 16);
        stringBuilder.append('[');
        int size = this._children.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(((JsonNode) this._children.get(i)).toString());
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
