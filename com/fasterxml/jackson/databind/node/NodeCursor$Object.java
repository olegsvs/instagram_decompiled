package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;
import java.util.Map.Entry;

public final class NodeCursor$Object extends NodeCursor {
    public Iterator _contents;
    public Entry _current;
    public boolean _needEntry = true;

    public NodeCursor$Object(JsonNode jsonNode, NodeCursor nodeCursor) {
        super(2, nodeCursor);
        this._contents = ((ObjectNode) jsonNode).fields();
    }

    public boolean currentHasChildren() {
        return ((ContainerNode) currentNode()).size() > 0;
    }

    public JsonNode currentNode() {
        Entry entry = this._current;
        return entry == null ? null : (JsonNode) entry.getValue();
    }

    public JsonToken endToken() {
        return JsonToken.END_OBJECT;
    }

    public /* bridge */ /* synthetic */ JsonStreamContext getParent() {
        return super.getParent();
    }

    public JsonToken nextToken() {
        if (this._needEntry) {
            String str = null;
            if (this._contents.hasNext()) {
                this._needEntry = false;
                Entry entry = (Entry) this._contents.next();
                this._current = entry;
                if (entry != null) {
                    str = (String) entry.getKey();
                }
                this._currentName = str;
                return JsonToken.FIELD_NAME;
            }
            this._currentName = null;
            this._current = null;
            return null;
        }
        this._needEntry = true;
        return ((JsonNode) this._current.getValue()).asToken();
    }

    public JsonToken nextValue() {
        JsonToken nextToken = nextToken();
        return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
    }
}
