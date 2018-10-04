package com.facebook.react.bridge;

import X.AnonymousClass0KY;

public final class DynamicFromArray implements Dynamic {
    private static final AnonymousClass0KY sPool = new AnonymousClass0KY(10);
    private ReadableArray mArray;
    private int mIndex = -1;

    private DynamicFromArray() {
    }

    public final double asDouble() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getDouble(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final String asString() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getString(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public static DynamicFromArray create(ReadableArray readableArray, int i) {
        DynamicFromArray dynamicFromArray = (DynamicFromArray) sPool.acquire();
        if (dynamicFromArray == null) {
            dynamicFromArray = new DynamicFromArray();
        }
        dynamicFromArray.mArray = readableArray;
        dynamicFromArray.mIndex = i;
        return dynamicFromArray;
    }

    public final ReadableType getType() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getType(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final boolean isNull() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.isNull(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final void recycle() {
        this.mArray = null;
        this.mIndex = -1;
        sPool.release(this);
    }
}
