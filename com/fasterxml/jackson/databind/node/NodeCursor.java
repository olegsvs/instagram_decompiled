package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;

public abstract class NodeCursor extends JsonStreamContext {
    public String _currentName;
    public final NodeCursor _parent;

    public abstract boolean currentHasChildren();

    public abstract JsonNode currentNode();

    public abstract JsonToken endToken();

    public abstract JsonToken nextToken();

    public abstract JsonToken nextValue();

    public NodeCursor(int i, NodeCursor nodeCursor) {
        this._type = i;
        this._index = -1;
        this._parent = nodeCursor;
    }

    public final String getCurrentName() {
        return this._currentName;
    }

    public final NodeCursor getParent() {
        return this._parent;
    }

    public final NodeCursor iterateChildren() {
        JsonNode currentNode = currentNode();
        if (currentNode == null) {
            throw new IllegalStateException("No current node");
        } else if (currentNode.isArray()) {
            return new NodeCursor$Array(currentNode, this);
        } else {
            if (currentNode.isObject()) {
                return new NodeCursor$Object(currentNode, this);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Current node of type ");
            stringBuilder.append(currentNode.getClass().getName());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void overrideCurrentName(String str) {
        this._currentName = str;
    }
}
