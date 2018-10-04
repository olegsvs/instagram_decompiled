package com.facebook.react.bridge;

import X.AnonymousClass0KY;

public final class DynamicFromMap implements Dynamic {
    private static final AnonymousClass0KY sPool = new AnonymousClass0KY(10);
    private ReadableMap mMap;
    private String mName;

    private DynamicFromMap() {
    }

    public final double asDouble() {
        ReadableMap readableMap = this.mMap;
        if (readableMap != null) {
            String str = this.mName;
            if (str != null) {
                return readableMap.getDouble(str);
            }
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final String asString() {
        ReadableMap readableMap = this.mMap;
        if (readableMap != null) {
            String str = this.mName;
            if (str != null) {
                return readableMap.getString(str);
            }
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public static DynamicFromMap create(ReadableMap readableMap, String str) {
        DynamicFromMap dynamicFromMap = (DynamicFromMap) sPool.acquire();
        if (dynamicFromMap == null) {
            dynamicFromMap = new DynamicFromMap();
        }
        dynamicFromMap.mMap = readableMap;
        dynamicFromMap.mName = str;
        return dynamicFromMap;
    }

    public final ReadableType getType() {
        ReadableMap readableMap = this.mMap;
        if (readableMap != null) {
            String str = this.mName;
            if (str != null) {
                return readableMap.getType(str);
            }
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final boolean isNull() {
        ReadableMap readableMap = this.mMap;
        if (readableMap != null) {
            String str = this.mName;
            if (str != null) {
                return readableMap.isNull(str);
            }
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final void recycle() {
        this.mMap = null;
        this.mName = null;
        sPool.release(this);
    }
}
