package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.io.CharTypes;

public final class JsonReadContext extends JsonStreamContext {
    public JsonReadContext _child = null;
    public int _columnNr;
    public String _currentName;
    public int _lineNr;
    public final JsonReadContext _parent;

    public JsonReadContext(JsonReadContext jsonReadContext, int i, int i2, int i3) {
        this._type = i;
        this._parent = jsonReadContext;
        this._lineNr = i2;
        this._columnNr = i3;
        this._index = -1;
    }

    public final JsonReadContext createChildArrayContext(int i, int i2) {
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext == null) {
            jsonReadContext = new JsonReadContext(this, 1, i, i2);
            this._child = jsonReadContext;
            return jsonReadContext;
        }
        jsonReadContext.reset(1, i, i2);
        return jsonReadContext;
    }

    public final JsonReadContext createChildObjectContext(int i, int i2) {
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext == null) {
            jsonReadContext = new JsonReadContext(this, 2, i, i2);
            this._child = jsonReadContext;
            return jsonReadContext;
        }
        jsonReadContext.reset(2, i, i2);
        return jsonReadContext;
    }

    public static JsonReadContext createRootContext() {
        return new JsonReadContext(null, 0, 1, 0);
    }

    public static JsonReadContext createRootContext(int i, int i2) {
        return new JsonReadContext(null, 0, i, i2);
    }

    public final boolean expectComma() {
        int i = this._index + 1;
        this._index = i;
        if (this._type == 0 || i <= 0) {
            return false;
        }
        return true;
    }

    public final String getCurrentName() {
        return this._currentName;
    }

    public final JsonReadContext getParent() {
        return this._parent;
    }

    public final JsonLocation getStartLocation(Object obj) {
        return new JsonLocation(obj, -1, this._lineNr, this._columnNr);
    }

    public final void reset(int i, int i2, int i3) {
        this._type = i;
        this._index = -1;
        this._lineNr = i2;
        this._columnNr = i3;
        this._currentName = null;
    }

    public final void setCurrentName(String str) {
        this._currentName = str;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        switch (this._type) {
            case 0:
                stringBuilder.append("/");
                break;
            case 1:
                stringBuilder.append('[');
                stringBuilder.append(getCurrentIndex());
                stringBuilder.append(']');
                break;
            case 2:
                stringBuilder.append('{');
                if (this._currentName != null) {
                    stringBuilder.append('\"');
                    CharTypes.appendQuoted(stringBuilder, this._currentName);
                    stringBuilder.append('\"');
                } else {
                    stringBuilder.append('?');
                }
                stringBuilder.append('}');
                break;
            default:
                break;
        }
        return stringBuilder.toString();
    }
}
