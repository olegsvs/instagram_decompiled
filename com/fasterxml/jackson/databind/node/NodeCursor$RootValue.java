package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;

public final class NodeCursor$RootValue extends NodeCursor {
    public boolean _done = false;
    public JsonNode _node;

    public boolean currentHasChildren() {
        return false;
    }

    public JsonToken endToken() {
        return null;
    }

    public void overrideCurrentName(String str) {
    }

    public NodeCursor$RootValue(JsonNode jsonNode, NodeCursor nodeCursor) {
        super(0, nodeCursor);
        this._node = jsonNode;
    }

    public JsonNode currentNode() {
        return this._node;
    }

    public /* bridge */ /* synthetic */ JsonStreamContext getParent() {
        return super.getParent();
    }

    public JsonToken nextToken() {
        if (this._done) {
            this._node = null;
            return null;
        }
        this._done = true;
        return this._node.asToken();
    }

    public JsonToken nextValue() {
        return nextToken();
    }
}
