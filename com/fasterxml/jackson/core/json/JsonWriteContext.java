package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonStreamContext;

public final class JsonWriteContext extends JsonStreamContext {
    public JsonWriteContext _child = null;
    public String _currentName;
    public final JsonWriteContext _parent;

    public JsonWriteContext(int i, JsonWriteContext jsonWriteContext) {
        this._type = i;
        this._parent = jsonWriteContext;
        this._index = -1;
    }

    public final void appendDesc(StringBuilder stringBuilder) {
        if (this._type == 2) {
            stringBuilder.append('{');
            if (this._currentName != null) {
                stringBuilder.append('\"');
                stringBuilder.append(this._currentName);
                stringBuilder.append('\"');
            } else {
                stringBuilder.append('?');
            }
            stringBuilder.append('}');
        } else if (this._type == 1) {
            stringBuilder.append('[');
            stringBuilder.append(getCurrentIndex());
            stringBuilder.append(']');
        } else {
            stringBuilder.append("/");
        }
    }

    public final JsonWriteContext createChildArrayContext() {
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(1);
        }
        jsonWriteContext = new JsonWriteContext(1, this);
        this._child = jsonWriteContext;
        return jsonWriteContext;
    }

    public final JsonWriteContext createChildObjectContext() {
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(2);
        }
        jsonWriteContext = new JsonWriteContext(2, this);
        this._child = jsonWriteContext;
        return jsonWriteContext;
    }

    public static JsonWriteContext createRootContext() {
        return new JsonWriteContext(0, null);
    }

    public final String getCurrentName() {
        return this._currentName;
    }

    public final JsonWriteContext getParent() {
        return this._parent;
    }

    private JsonWriteContext reset(int i) {
        this._type = i;
        this._index = -1;
        this._currentName = null;
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        appendDesc(stringBuilder);
        return stringBuilder.toString();
    }

    public final int writeFieldName(String str) {
        if (this._type != 2 || this._currentName != null) {
            return 4;
        }
        this._currentName = str;
        return this._index < 0 ? 0 : 1;
    }

    public final int writeValue() {
        if (this._type != 2) {
            int i = 0;
            if (this._type == 1) {
                int i2 = this._index;
                this._index = this._index + 1;
                if (i2 >= 0) {
                    i = 1;
                }
            } else {
                this._index = this._index + 1;
                if (this._index != 0) {
                    i = 3;
                }
            }
            return i;
        } else if (this._currentName == null) {
            return 5;
        } else {
            this._currentName = null;
            this._index = this._index + 1;
            return 2;
        }
    }
}
