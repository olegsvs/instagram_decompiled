package com.fasterxml.jackson.core;

public abstract class JsonStreamContext {
    public static final int TYPE_ARRAY = 1;
    public static final int TYPE_OBJECT = 2;
    public static final int TYPE_ROOT = 0;
    public int _index;
    public int _type;

    public abstract String getCurrentName();

    public abstract JsonStreamContext getParent();

    public final int getCurrentIndex() {
        int i = this._index;
        return i < 0 ? 0 : i;
    }

    public final int getEntryCount() {
        return this._index + 1;
    }

    public final String getTypeDesc() {
        switch (this._type) {
            case 0:
                return "ROOT";
            case 1:
                return "ARRAY";
            case 2:
                return "OBJECT";
            default:
                return "?";
        }
    }

    public final boolean inArray() {
        return this._type == 1;
    }

    public final boolean inObject() {
        return this._type == 2;
    }

    public final boolean inRoot() {
        return this._type == 0;
    }
}
