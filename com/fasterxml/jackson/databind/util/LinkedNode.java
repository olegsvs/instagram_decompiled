package com.fasterxml.jackson.databind.util;

public final class LinkedNode {
    public final LinkedNode _next;
    public final Object _value;

    public LinkedNode(Object obj, LinkedNode linkedNode) {
        this._value = obj;
        this._next = linkedNode;
    }

    public static boolean contains(LinkedNode linkedNode, Object obj) {
        while (linkedNode != null) {
            if (linkedNode.value() == obj) {
                return true;
            }
            linkedNode = linkedNode.next();
        }
        return false;
    }

    public LinkedNode next() {
        return this._next;
    }

    public Object value() {
        return this._value;
    }
}
