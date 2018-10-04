package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.List;

public final class JavaOnlyArray implements ReadableArray, WritableArray {
    private final List mBackingList;

    public JavaOnlyArray() {
        this.mBackingList = new ArrayList();
    }

    private JavaOnlyArray(List list) {
        this.mBackingList = new ArrayList(list);
    }

    public static JavaOnlyArray deepClone(ReadableArray readableArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (readableArray.getType(i).ordinal()) {
                case 0:
                    javaOnlyArray.pushNull();
                    break;
                case 1:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 2:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i));
                    break;
                case 3:
                    javaOnlyArray.pushString(readableArray.getString(i));
                    break;
                case 4:
                    javaOnlyArray.pushMap(JavaOnlyMap.deepClone(readableArray.getMap(i)));
                    break;
                case 5:
                    javaOnlyArray.pushArray(deepClone(readableArray.getArray(i)));
                    break;
                default:
                    break;
            }
        }
        return javaOnlyArray;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    JavaOnlyArray javaOnlyArray = (JavaOnlyArray) obj;
                    List list = this.mBackingList;
                    if (list != null) {
                        if (!list.equals(javaOnlyArray.mBackingList)) {
                        }
                    } else if (javaOnlyArray.mBackingList != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static JavaOnlyArray from(List list) {
        return new JavaOnlyArray(list);
    }

    public final JavaOnlyArray getArray(int i) {
        return (JavaOnlyArray) this.mBackingList.get(i);
    }

    public final boolean getBoolean(int i) {
        return ((Boolean) this.mBackingList.get(i)).booleanValue();
    }

    public final double getDouble(int i) {
        return ((Number) this.mBackingList.get(i)).doubleValue();
    }

    public final int getInt(int i) {
        return ((Number) this.mBackingList.get(i)).intValue();
    }

    public final JavaOnlyMap getMap(int i) {
        return (JavaOnlyMap) this.mBackingList.get(i);
    }

    public final String getString(int i) {
        return (String) this.mBackingList.get(i);
    }

    public final ReadableType getType(int i) {
        i = this.mBackingList.get(i);
        if (i == 0) {
            return ReadableType.Null;
        }
        if (i instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (!((i instanceof Double) || (i instanceof Float))) {
            if (!(i instanceof Integer)) {
                if (i instanceof String) {
                    return ReadableType.String;
                }
                if (i instanceof ReadableArray) {
                    return ReadableType.Array;
                }
                return i instanceof ReadableMap ? ReadableType.Map : null;
            }
        }
        return ReadableType.Number;
    }

    public final int hashCode() {
        List list = this.mBackingList;
        return list != null ? list.hashCode() : 0;
    }

    public final boolean isNull(int i) {
        return this.mBackingList.get(i) == null;
    }

    public final void pushArray(WritableArray writableArray) {
        this.mBackingList.add(writableArray);
    }

    public final void pushBoolean(boolean z) {
        this.mBackingList.add(Boolean.valueOf(z));
    }

    public final void pushDouble(double d) {
        this.mBackingList.add(Double.valueOf(d));
    }

    public final void pushInt(int i) {
        this.mBackingList.add(Integer.valueOf(i));
    }

    public final void pushMap(WritableMap writableMap) {
        this.mBackingList.add(writableMap);
    }

    public final void pushNull() {
        this.mBackingList.add(null);
    }

    public final void pushString(String str) {
        this.mBackingList.add(str);
    }

    public final int size() {
        return this.mBackingList.size();
    }

    public final ArrayList toArrayList() {
        return new ArrayList(this.mBackingList);
    }

    public final String toString() {
        return this.mBackingList.toString();
    }
}
