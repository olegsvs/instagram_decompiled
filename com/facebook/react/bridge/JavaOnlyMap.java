package com.facebook.react.bridge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class JavaOnlyMap implements ReadableMap, WritableMap {
    public final Map mBackingMap;

    /* renamed from: com.facebook.react.bridge.JavaOnlyMap$1 */
    public final class C00901 implements ReadableMapKeySetIterator {
        public Iterator mIterator = JavaOnlyMap.this.mBackingMap.keySet().iterator();

        public final boolean hasNextKey() {
            return this.mIterator.hasNext();
        }

        public final String nextKey() {
            return (String) this.mIterator.next();
        }
    }

    public JavaOnlyMap() {
        this.mBackingMap = new HashMap();
    }

    private JavaOnlyMap(Object... objArr) {
        if (objArr.length % 2 == 0) {
            this.mBackingMap = new HashMap();
            for (int i = 0; i < objArr.length; i += 2) {
                this.mBackingMap.put(objArr[i], objArr[i + 1]);
            }
            return;
        }
        throw new IllegalArgumentException("You must provide the same number of keys and values");
    }

    public static JavaOnlyMap deepClone(ReadableMap readableMap) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap.getType(nextKey).ordinal()) {
                case 0:
                    javaOnlyMap.putNull(nextKey);
                    break;
                case 1:
                    javaOnlyMap.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 2:
                    javaOnlyMap.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 3:
                    javaOnlyMap.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 4:
                    javaOnlyMap.putMap(nextKey, deepClone(readableMap.getMap(nextKey)));
                    break;
                case 5:
                    javaOnlyMap.putArray(nextKey, JavaOnlyArray.deepClone(readableMap.getArray(nextKey)));
                    break;
                default:
                    break;
            }
        }
        return javaOnlyMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    JavaOnlyMap javaOnlyMap = (JavaOnlyMap) obj;
                    Map map = this.mBackingMap;
                    if (map != null) {
                        if (!map.equals(javaOnlyMap.mBackingMap)) {
                        }
                    } else if (javaOnlyMap.mBackingMap != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final JavaOnlyArray getArray(String str) {
        return (JavaOnlyArray) this.mBackingMap.get(str);
    }

    public final boolean getBoolean(String str) {
        return ((Boolean) this.mBackingMap.get(str)).booleanValue();
    }

    public final double getDouble(String str) {
        return ((Number) this.mBackingMap.get(str)).doubleValue();
    }

    public final Dynamic getDynamic(String str) {
        return DynamicFromMap.create(this, str);
    }

    public final int getInt(String str) {
        return ((Number) this.mBackingMap.get(str)).intValue();
    }

    public final ReadableMap getMap(String str) {
        return (ReadableMap) this.mBackingMap.get(str);
    }

    public final String getString(String str) {
        return (String) this.mBackingMap.get(str);
    }

    public final ReadableType getType(String str) {
        Object obj = this.mBackingMap.get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof Dynamic) {
            return ((Dynamic) obj).getType();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid value ");
        stringBuilder.append(obj.toString());
        stringBuilder.append(" for key ");
        stringBuilder.append(str);
        stringBuilder.append("contained in JavaOnlyMap");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final boolean hasKey(String str) {
        return this.mBackingMap.containsKey(str);
    }

    public final int hashCode() {
        Map map = this.mBackingMap;
        return map != null ? map.hashCode() : 0;
    }

    public final boolean isNull(String str) {
        return this.mBackingMap.get(str) == null;
    }

    public final ReadableMapKeySetIterator keySetIterator() {
        return new C00901();
    }

    public static JavaOnlyMap of(Object... objArr) {
        return new JavaOnlyMap(objArr);
    }

    public final void putArray(String str, WritableArray writableArray) {
        this.mBackingMap.put(str, writableArray);
    }

    public final void putBoolean(String str, boolean z) {
        this.mBackingMap.put(str, Boolean.valueOf(z));
    }

    public final void putDouble(String str, double d) {
        this.mBackingMap.put(str, Double.valueOf(d));
    }

    public final void putInt(String str, int i) {
        this.mBackingMap.put(str, Integer.valueOf(i));
    }

    public final void putMap(String str, WritableMap writableMap) {
        this.mBackingMap.put(str, writableMap);
    }

    public final void putNull(String str) {
        this.mBackingMap.put(str, null);
    }

    public final void putString(String str, String str2) {
        this.mBackingMap.put(str, str2);
    }

    public final String toString() {
        return this.mBackingMap.toString();
    }
}
