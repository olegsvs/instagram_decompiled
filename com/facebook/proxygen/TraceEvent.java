package com.facebook.proxygen;

import java.util.Map;
import java.util.Map.Entry;

public class TraceEvent extends NativeHandleImpl {
    private final long mEnd;
    private final int mID;
    private final String mName;
    private final int mParentID;
    private final long mStart;

    public native void close();

    public native Map getMetaData();

    public TraceEvent(String str) {
        this.mName = str;
        this.mID = 0;
        this.mParentID = 0;
        this.mStart = 0;
        this.mEnd = 0;
    }

    public TraceEvent(String str, int i, int i2, long j, long j2) {
        this.mName = str;
        this.mID = i;
        this.mParentID = i2;
        this.mStart = j;
        this.mEnd = j2;
    }

    public void finalize() {
        close();
        super.finalize();
    }

    public long getEnd() {
        return this.mEnd;
    }

    public int getId() {
        return this.mID;
    }

    public String getName() {
        return this.mName;
    }

    public int getParentID() {
        return this.mParentID;
    }

    public long getStart() {
        return this.mStart;
    }

    public String toPrettyJson() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n  \"name\":\"");
        stringBuilder.append(this.mName);
        stringBuilder.append("\",\n");
        stringBuilder.append("  \"id\":");
        stringBuilder.append(this.mID);
        stringBuilder.append(",\n");
        stringBuilder.append("  \"parentID\":");
        stringBuilder.append(this.mParentID);
        stringBuilder.append(",\n");
        stringBuilder.append("  \"start\":");
        stringBuilder.append(this.mStart);
        stringBuilder.append(",\n");
        stringBuilder.append("  \"end\":");
        stringBuilder.append(this.mEnd);
        stringBuilder.append(",\n");
        stringBuilder.append("  \"metaData\":{\n");
        stringBuffer.append(stringBuilder.toString());
        Object obj = 1;
        for (Entry entry : getMetaData().entrySet()) {
            if (obj == null) {
                stringBuffer.append(",\n");
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("    \"");
            stringBuilder2.append((String) entry.getKey());
            stringBuilder2.append("\":\"");
            stringBuffer.append(stringBuilder2.toString());
            if (((String) entry.getValue()).length() > 100) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(((String) entry.getValue()).substring(0, 97));
                stringBuilder.append("...\"");
                stringBuffer.append(stringBuilder.toString());
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append((String) entry.getValue());
                stringBuilder2.append("\"");
                stringBuffer.append(stringBuilder2.toString());
            }
            obj = null;
        }
        stringBuffer.append("\n  }\n}");
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TraceEvent(name='");
        stringBuilder.append(this.mName);
        stringBuilder.append("', ");
        stringBuilder.append("id='");
        stringBuilder.append(this.mID);
        stringBuilder.append("', ");
        stringBuilder.append("parentID='");
        stringBuilder.append(this.mParentID);
        stringBuilder.append("', ");
        stringBuilder.append("start='");
        stringBuilder.append(this.mStart);
        stringBuilder.append("', ");
        stringBuilder.append("end='");
        stringBuilder.append(this.mEnd);
        stringBuilder.append("', ");
        stringBuilder.append("metaData='{");
        stringBuffer.append(stringBuilder.toString());
        for (Entry entry : getMetaData().entrySet()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append((String) entry.getKey());
            stringBuilder2.append(": ");
            stringBuilder2.append((String) entry.getValue());
            stringBuilder2.append(", ");
            stringBuffer.append(stringBuilder2.toString());
        }
        stringBuffer.append("}')");
        return stringBuffer.toString();
    }
}
