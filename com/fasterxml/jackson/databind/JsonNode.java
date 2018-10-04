package com.fasterxml.jackson.databind;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.util.EmptyIterator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class JsonNode implements Iterable, TreeNode {

    /* renamed from: com.fasterxml.jackson.databind.JsonNode$1 */
    public /* synthetic */ class C01491 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType = new int[JsonNodeType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.fasterxml.jackson.databind.node.JsonNodeType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType = r0;
            r2 = $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = com.fasterxml.jackson.databind.node.JsonNodeType.ARRAY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = com.fasterxml.jackson.databind.node.JsonNodeType.MISSING;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonNode.1.<clinit>():void");
        }
    }

    public boolean asBoolean(boolean z) {
        return z;
    }

    public double asDouble(double d) {
        return d;
    }

    public int asInt(int i) {
        return i;
    }

    public long asLong(long j) {
        return j;
    }

    public abstract String asText();

    public byte[] binaryValue() {
        return null;
    }

    public boolean booleanValue() {
        return false;
    }

    public boolean canConvertToInt() {
        return false;
    }

    public boolean canConvertToLong() {
        return false;
    }

    public abstract JsonNode deepCopy();

    public double doubleValue() {
        return StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    public abstract boolean equals(Object obj);

    public abstract JsonNode findParent(String str);

    public abstract List findParents(String str, List list);

    public abstract JsonNode findPath(String str);

    public abstract JsonNode findValue(String str);

    public abstract List findValues(String str, List list);

    public abstract List findValuesAsText(String str, List list);

    public float floatValue() {
        return 0.0f;
    }

    public abstract JsonNode get(int i);

    public JsonNode get(String str) {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public int intValue() {
        return 0;
    }

    public boolean isBigDecimal() {
        return false;
    }

    public boolean isBigInteger() {
        return false;
    }

    public boolean isDouble() {
        return false;
    }

    public boolean isFloat() {
        return false;
    }

    public boolean isFloatingPointNumber() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isIntegralNumber() {
        return false;
    }

    public boolean isLong() {
        return false;
    }

    public boolean isShort() {
        return false;
    }

    public long longValue() {
        return 0;
    }

    public Number numberValue() {
        return null;
    }

    public abstract JsonNode path(int i);

    public abstract JsonNode path(String str);

    public short shortValue() {
        return (short) 0;
    }

    public int size() {
        return 0;
    }

    public String textValue() {
        return null;
    }

    public abstract String toString();

    public boolean asBoolean() {
        return asBoolean(false);
    }

    public double asDouble() {
        return asDouble(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    public int asInt() {
        return asInt(0);
    }

    public long asLong() {
        return asLong(0);
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.ZERO;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.ZERO;
    }

    public Iterator elements() {
        return EmptyIterator.instance();
    }

    public Iterator fieldNames() {
        return EmptyIterator.instance();
    }

    public Iterator fields() {
        return EmptyIterator.instance();
    }

    public final List findParents(String str) {
        List findParents = findParents(str, null);
        return findParents == null ? Collections.emptyList() : findParents;
    }

    public final List findValues(String str) {
        List findValues = findValues(str, null);
        return findValues == null ? Collections.emptyList() : findValues;
    }

    public final List findValuesAsText(String str) {
        List findValuesAsText = findValuesAsText(str, null);
        return findValuesAsText == null ? Collections.emptyList() : findValuesAsText;
    }

    public boolean has(int i) {
        return get(i) != null;
    }

    public boolean has(String str) {
        return get(str) != null;
    }

    public boolean hasNonNull(int i) {
        this = get(i);
        return (this == null || isNull()) ? false : true;
    }

    public boolean hasNonNull(String str) {
        this = get(str);
        return (this == null || isNull()) ? false : true;
    }

    public final boolean isArray() {
        return getNodeType() == JsonNodeType.ARRAY;
    }

    public final boolean isBinary() {
        return getNodeType() == JsonNodeType.BINARY;
    }

    public final boolean isBoolean() {
        return getNodeType() == JsonNodeType.BOOLEAN;
    }

    public final boolean isContainerNode() {
        JsonNodeType nodeType = getNodeType();
        if (nodeType != JsonNodeType.OBJECT) {
            if (nodeType != JsonNodeType.ARRAY) {
                return false;
            }
        }
        return true;
    }

    public final boolean isMissingNode() {
        return getNodeType() == JsonNodeType.MISSING;
    }

    public final boolean isNull() {
        return getNodeType() == JsonNodeType.NULL;
    }

    public final boolean isNumber() {
        return getNodeType() == JsonNodeType.NUMBER;
    }

    public final boolean isObject() {
        return getNodeType() == JsonNodeType.OBJECT;
    }

    public final boolean isPojo() {
        return getNodeType() == JsonNodeType.POJO;
    }

    public final boolean isTextual() {
        return getNodeType() == JsonNodeType.STRING;
    }

    public final boolean isValueNode() {
        switch (getNodeType().ordinal()) {
            case 0:
            case 3:
            case 6:
                return false;
            default:
                return true;
        }
    }

    public final Iterator iterator() {
        return elements();
    }

    public JsonNode with(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JsonNode not of type ObjectNode (but ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append("), can not call with() on it");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public JsonNode withArray(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JsonNode not of type ObjectNode (but ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append("), can not call withArray() on it");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }
}
