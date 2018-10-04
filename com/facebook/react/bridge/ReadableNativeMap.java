package com.facebook.react.bridge;

import X.AnonymousClass0LR;
import com.facebook.jni.HybridData;
import java.util.HashMap;

public class ReadableNativeMap extends NativeMap implements ReadableMap {
    private static int mJniCallCounter;
    private static boolean mUseNativeAccessor;
    private String[] mKeys;
    private HashMap mLocalMap;
    private HashMap mLocalTypeMap;

    public class ReadableNativeMapKeySetIterator implements ReadableMapKeySetIterator {
        private final HybridData mHybridData;
        private final ReadableNativeMap mMap;

        private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

        public native boolean hasNextKey();

        public native String nextKey();

        public ReadableNativeMapKeySetIterator(ReadableNativeMap readableNativeMap) {
            this.mMap = readableNativeMap;
            this.mHybridData = initHybrid(readableNativeMap);
        }
    }

    private native ReadableNativeArray getArrayNative(String str);

    private native boolean getBooleanNative(String str);

    private native double getDoubleNative(String str);

    private native int getIntNative(String str);

    private native ReadableNativeMap getMapNative(String str);

    private native String getStringNative(String str);

    private native ReadableType getTypeNative(String str);

    private native boolean hasKeyNative(String str);

    private native String[] importKeys();

    private native Object[] importTypes();

    private native Object[] importValues();

    private native boolean isNullNative(String str);

    static {
        ReactBridge.staticInit();
    }

    public ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
    }

    private static void checkInstance(String str, Object obj, Class cls) {
        if (obj == null) {
            return;
        }
        if (!cls.isInstance(obj)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Value for ");
            stringBuilder.append(str);
            stringBuilder.append(" cannot be cast from ");
            stringBuilder.append(obj.getClass().getSimpleName());
            stringBuilder.append(" to ");
            stringBuilder.append(cls.getSimpleName());
            throw new ClassCastException(stringBuilder.toString());
        }
    }

    public final ReadableArray getArray(String str) {
        if (!mUseNativeAccessor) {
            return (ReadableArray) getNullableValue(str, ReadableArray.class);
        }
        mJniCallCounter++;
        return getArrayNative(str);
    }

    public final boolean getBoolean(String str) {
        if (!mUseNativeAccessor) {
            return ((Boolean) getValue(str, Boolean.class)).booleanValue();
        }
        mJniCallCounter++;
        return getBooleanNative(str);
    }

    public final double getDouble(String str) {
        if (!mUseNativeAccessor) {
            return ((Double) getValue(str, Double.class)).doubleValue();
        }
        mJniCallCounter++;
        return getDoubleNative(str);
    }

    public final Dynamic getDynamic(String str) {
        return DynamicFromMap.create(this, str);
    }

    public final int getInt(String str) {
        if (!mUseNativeAccessor) {
            return ((Double) getValue(str, Double.class)).intValue();
        }
        mJniCallCounter++;
        return getIntNative(str);
    }

    private HashMap getLocalMap() {
        HashMap hashMap = this.mLocalMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) AnonymousClass0LR.D(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalMap == null) {
                Object[] objArr = (Object[]) AnonymousClass0LR.D(importValues());
                mJniCallCounter++;
                this.mLocalMap = new HashMap();
                for (int i = 0; i < this.mKeys.length; i++) {
                    this.mLocalMap.put(this.mKeys[i], objArr[i]);
                }
            }
        }
        return this.mLocalMap;
    }

    private HashMap getLocalTypeMap() {
        HashMap hashMap = this.mLocalTypeMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) AnonymousClass0LR.D(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalTypeMap == null) {
                Object[] objArr = (Object[]) AnonymousClass0LR.D(importTypes());
                mJniCallCounter++;
                this.mLocalTypeMap = new HashMap();
                for (int i = 0; i < this.mKeys.length; i++) {
                    this.mLocalTypeMap.put(this.mKeys[i], (ReadableType) objArr[i]);
                }
            }
        }
        return this.mLocalTypeMap;
    }

    public final ReadableNativeMap getMap(String str) {
        if (!mUseNativeAccessor) {
            return (ReadableNativeMap) getNullableValue(str, ReadableNativeMap.class);
        }
        mJniCallCounter++;
        return getMapNative(str);
    }

    private Object getNullableValue(String str) {
        if (hasKey(str)) {
            return getLocalMap().get(str);
        }
        throw new NoSuchKeyException(str);
    }

    private Object getNullableValue(String str, Class cls) {
        Object nullableValue = getNullableValue(str);
        checkInstance(str, nullableValue, cls);
        return nullableValue;
    }

    public final String getString(String str) {
        if (!mUseNativeAccessor) {
            return (String) getNullableValue(str, String.class);
        }
        mJniCallCounter++;
        return getStringNative(str);
    }

    public final ReadableType getType(String str) {
        if (mUseNativeAccessor) {
            mJniCallCounter++;
            return getTypeNative(str);
        } else if (getLocalTypeMap().containsKey(str)) {
            return (ReadableType) AnonymousClass0LR.D(getLocalTypeMap().get(str));
        } else {
            throw new NoSuchKeyException(str);
        }
    }

    private Object getValue(String str) {
        if (hasKey(str) && !isNull(str)) {
            return AnonymousClass0LR.D(getLocalMap().get(str));
        }
        throw new NoSuchKeyException(str);
    }

    private Object getValue(String str, Class cls) {
        Object value = getValue(str);
        checkInstance(str, value, cls);
        return value;
    }

    public final boolean hasKey(String str) {
        if (!mUseNativeAccessor) {
            return getLocalMap().containsKey(str);
        }
        mJniCallCounter++;
        return hasKeyNative(str);
    }

    public final boolean isNull(String str) {
        boolean z = true;
        if (mUseNativeAccessor) {
            mJniCallCounter++;
            return isNullNative(str);
        } else if (getLocalMap().containsKey(str)) {
            if (getLocalMap().get(str) != null) {
                z = false;
            }
            return z;
        } else {
            throw new NoSuchKeyException(str);
        }
    }

    public final ReadableMapKeySetIterator keySetIterator() {
        return new ReadableNativeMapKeySetIterator(this);
    }

    public final HashMap toHashMap() {
        String nextKey;
        if (mUseNativeAccessor) {
            ReadableMapKeySetIterator keySetIterator = keySetIterator();
            HashMap hashMap = new HashMap();
            while (keySetIterator.hasNextKey()) {
                mJniCallCounter++;
                nextKey = keySetIterator.nextKey();
                mJniCallCounter++;
                switch (getType(nextKey).ordinal()) {
                    case 0:
                        hashMap.put(nextKey, null);
                        continue;
                    case 1:
                        hashMap.put(nextKey, Boolean.valueOf(getBoolean(nextKey)));
                        continue;
                    case 2:
                        hashMap.put(nextKey, Double.valueOf(getDouble(nextKey)));
                        continue;
                    case 3:
                        hashMap.put(nextKey, getString(nextKey));
                        continue;
                    case 4:
                        hashMap.put(nextKey, ((ReadableNativeMap) AnonymousClass0LR.D(getMap(nextKey))).toHashMap());
                        continue;
                    case 5:
                        hashMap.put(nextKey, ((ReadableArray) AnonymousClass0LR.D(getArray(nextKey))).toArrayList());
                        continue;
                    default:
                        break;
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap(getLocalMap());
        for (String nextKey2 : hashMap2.keySet()) {
            switch (getType(nextKey2).ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    break;
                case 4:
                    hashMap2.put(nextKey2, ((ReadableNativeMap) AnonymousClass0LR.D(getMap(nextKey2))).toHashMap());
                    continue;
                case 5:
                    hashMap2.put(nextKey2, ((ReadableArray) AnonymousClass0LR.D(getArray(nextKey2))).toArrayList());
                    continue;
                default:
                    break;
            }
        }
        return hashMap2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not convert object with key: ");
        stringBuilder.append(nextKey2);
        stringBuilder.append(".");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
