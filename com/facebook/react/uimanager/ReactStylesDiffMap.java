package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public final class ReactStylesDiffMap {
    public final ReadableMap mBackingMap;

    public ReactStylesDiffMap(ReadableMap readableMap) {
        this.mBackingMap = readableMap;
    }

    public final ReadableArray getArray(String str) {
        return this.mBackingMap.getArray(str);
    }

    public final boolean getBoolean(String str, boolean z) {
        return this.mBackingMap.isNull(str) ? z : this.mBackingMap.getBoolean(str);
    }

    public final double getDouble(String str, double d) {
        return this.mBackingMap.isNull(str) ? d : this.mBackingMap.getDouble(str);
    }

    public final Dynamic getDynamic(String str) {
        return this.mBackingMap.getDynamic(str);
    }

    public final float getFloat(String str, float f) {
        return this.mBackingMap.isNull(str) ? f : (float) this.mBackingMap.getDouble(str);
    }

    public final int getInt(String str, int i) {
        return this.mBackingMap.isNull(str) ? i : this.mBackingMap.getInt(str);
    }

    public final ReadableMap getMap(String str) {
        return this.mBackingMap.getMap(str);
    }

    public final String getString(String str) {
        return this.mBackingMap.getString(str);
    }

    public final boolean hasKey(String str) {
        return this.mBackingMap.hasKey(str);
    }

    public final boolean isNull(String str) {
        return this.mBackingMap.isNull(str);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ ");
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(this.mBackingMap.toString());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
