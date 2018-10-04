package com.facebook.react.bridge;

import X.AnonymousClass0LR;
import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadableNativeArray extends NativeArray implements ReadableArray {
    private static int jniPassCounter = 0;
    private static boolean mUseNativeAccessor = false;
    private Object[] mLocalArray;
    private ReadableType[] mLocalTypeArray;

    private native ReadableNativeArray getArrayNative(int i);

    private native boolean getBooleanNative(int i);

    private native double getDoubleNative(int i);

    private native int getIntNative(int i);

    private native ReadableNativeMap getMapNative(int i);

    private native String getStringNative(int i);

    private native ReadableType getTypeNative(int i);

    private native Object[] importArray();

    private native Object[] importTypeArray();

    private native boolean isNullNative(int i);

    private native int sizeNative();

    static {
        ReactBridge.staticInit();
    }

    public ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
    }

    public final ReadableNativeArray getArray(int i) {
        if (!mUseNativeAccessor) {
            return (ReadableNativeArray) getLocalArray()[i];
        }
        jniPassCounter++;
        return getArrayNative(i);
    }

    public final boolean getBoolean(int i) {
        if (!mUseNativeAccessor) {
            return ((Boolean) getLocalArray()[i]).booleanValue();
        }
        jniPassCounter++;
        return getBooleanNative(i);
    }

    public final double getDouble(int i) {
        if (!mUseNativeAccessor) {
            return ((Double) getLocalArray()[i]).doubleValue();
        }
        jniPassCounter++;
        return getDoubleNative(i);
    }

    public final int getInt(int i) {
        if (!mUseNativeAccessor) {
            return ((Double) getLocalArray()[i]).intValue();
        }
        jniPassCounter++;
        return getIntNative(i);
    }

    private Object[] getLocalArray() {
        Object[] objArr = this.mLocalArray;
        if (objArr != null) {
            return objArr;
        }
        synchronized (this) {
            if (this.mLocalArray == null) {
                jniPassCounter++;
                this.mLocalArray = (Object[]) AnonymousClass0LR.D(importArray());
            }
        }
        return this.mLocalArray;
    }

    private ReadableType[] getLocalTypeArray() {
        ReadableType[] readableTypeArr = this.mLocalTypeArray;
        if (readableTypeArr != null) {
            return readableTypeArr;
        }
        synchronized (this) {
            if (this.mLocalTypeArray == null) {
                jniPassCounter++;
                Object[] objArr = (Object[]) AnonymousClass0LR.D(importTypeArray());
                this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(objArr, objArr.length, ReadableType[].class);
            }
        }
        return this.mLocalTypeArray;
    }

    public final ReadableNativeMap getMap(int i) {
        if (!mUseNativeAccessor) {
            return (ReadableNativeMap) getLocalArray()[i];
        }
        jniPassCounter++;
        return getMapNative(i);
    }

    public final String getString(int i) {
        if (!mUseNativeAccessor) {
            return (String) getLocalArray()[i];
        }
        jniPassCounter++;
        return getStringNative(i);
    }

    public final ReadableType getType(int i) {
        if (!mUseNativeAccessor) {
            return getLocalTypeArray()[i];
        }
        jniPassCounter++;
        return getTypeNative(i);
    }

    public final boolean isNull(int i) {
        boolean z = true;
        if (mUseNativeAccessor) {
            jniPassCounter++;
            return isNullNative(i);
        }
        if (getLocalArray()[i] != null) {
            z = false;
        }
        return z;
    }

    public final int size() {
        if (!mUseNativeAccessor) {
            return getLocalArray().length;
        }
        jniPassCounter++;
        return sizeNative();
    }

    public final ArrayList toArrayList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size(); i++) {
            switch (getType(i).ordinal()) {
                case 0:
                    arrayList.add(null);
                    break;
                case 1:
                    arrayList.add(Boolean.valueOf(getBoolean(i)));
                    break;
                case 2:
                    arrayList.add(Double.valueOf(getDouble(i)));
                    break;
                case 3:
                    arrayList.add(getString(i));
                    break;
                case 4:
                    arrayList.add(getMap(i).toHashMap());
                    break;
                case 5:
                    arrayList.add(getArray(i).toArrayList());
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not convert object at index: ");
                    stringBuilder.append(i);
                    stringBuilder.append(".");
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return arrayList;
    }
}
