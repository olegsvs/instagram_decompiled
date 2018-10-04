package org.webrtc;

import java.util.Map;
import java.util.Map.Entry;

public class RTCStats {
    private final String id;
    private final Map members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j, String str, String str2, Map map) {
        this.timestampUs = j;
        this.type = str;
        this.id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder stringBuilder, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            stringBuilder.append('[');
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    stringBuilder.append(", ");
                }
                appendValue(stringBuilder, objArr[i]);
            }
            stringBuilder.append(']');
        } else if (obj instanceof String) {
            stringBuilder.append('\"');
            stringBuilder.append(obj);
            stringBuilder.append('\"');
        } else {
            stringBuilder.append(obj);
        }
    }

    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.id;
    }

    public Map getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return (double) this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ timestampUs: ");
        stringBuilder.append(this.timestampUs);
        stringBuilder.append(", type: ");
        stringBuilder.append(this.type);
        stringBuilder.append(", id: ");
        stringBuilder.append(this.id);
        for (Entry entry : this.members.entrySet()) {
            stringBuilder.append(", ");
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append(": ");
            appendValue(stringBuilder, entry.getValue());
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
