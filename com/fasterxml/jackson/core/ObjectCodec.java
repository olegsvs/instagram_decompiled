package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Iterator;

public abstract class ObjectCodec {
    public abstract TreeNode createArrayNode();

    public abstract TreeNode createObjectNode();

    public abstract JsonFactory getJsonFactory();

    public abstract TreeNode readTree(JsonParser jsonParser);

    public abstract Object readValue(JsonParser jsonParser, ResolvedType resolvedType);

    public abstract Object readValue(JsonParser jsonParser, TypeReference typeReference);

    public abstract Object readValue(JsonParser jsonParser, Class cls);

    public abstract Iterator readValues(JsonParser jsonParser, ResolvedType resolvedType);

    public abstract Iterator readValues(JsonParser jsonParser, TypeReference typeReference);

    public abstract Iterator readValues(JsonParser jsonParser, Class cls);

    public abstract JsonParser treeAsTokens(TreeNode treeNode);

    public abstract Object treeToValue(TreeNode treeNode, Class cls);

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj);

    public JsonFactory getFactory() {
        return getJsonFactory();
    }
}
