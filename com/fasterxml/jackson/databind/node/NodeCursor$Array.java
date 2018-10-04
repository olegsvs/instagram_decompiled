package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;

public final class NodeCursor$Array extends NodeCursor {
    public Iterator _contents;
    public JsonNode _currentNode;

    public NodeCursor$Array(JsonNode jsonNode, NodeCursor nodeCursor) {
        super(1, nodeCursor);
        this._contents = jsonNode.elements();
    }

    public boolean currentHasChildren() {
        return ((ContainerNode) currentNode()).size() > 0;
    }

    public JsonNode currentNode() {
        return this._currentNode;
    }

    public JsonToken endToken() {
        return JsonToken.END_ARRAY;
    }

    public /* bridge */ /* synthetic */ JsonStreamContext getParent() {
        return super.getParent();
    }

    public JsonToken nextToken() {
        if (this._contents.hasNext()) {
            JsonNode jsonNode = (JsonNode) this._contents.next();
            this._currentNode = jsonNode;
            return jsonNode.asToken();
        }
        this._currentNode = null;
        return null;
    }

    public JsonToken nextValue() {
        return nextToken();
    }
}
