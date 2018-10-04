package com.fasterxml.jackson.databind.util;

public abstract class PrimitiveArrayBuilder {
    public static final int INITIAL_CHUNK_SIZE = 12;
    public static final int MAX_CHUNK_SIZE = 262144;
    public static final int SMALL_CHUNK_SIZE = 16384;
    public Node _bufferHead;
    public Node _bufferTail;
    public int _bufferedEntryCount;
    public Object _freeBuffer;

    public final class Node {
        public final Object _data;
        public final int _dataLength;
        public Node _next;

        public Node(Object obj, int i) {
            this._data = obj;
            this._dataLength = i;
        }

        public int copyData(Object obj, int i) {
            System.arraycopy(this._data, 0, obj, i, this._dataLength);
            return i + this._dataLength;
        }

        public Object getData() {
            return this._data;
        }

        public void linkNext(Node node) {
            if (this._next == null) {
                this._next = node;
                return;
            }
            throw new IllegalStateException();
        }

        public Node next() {
            return this._next;
        }
    }

    public abstract Object _constructArray(int i);

    public void _reset() {
        Node node = this._bufferTail;
        if (node != null) {
            this._freeBuffer = node.getData();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final Object appendCompletedChunk(Object obj, int i) {
        Node node = new Node(obj, i);
        if (this._bufferHead == null) {
            this._bufferTail = node;
            this._bufferHead = node;
        } else {
            this._bufferTail.linkNext(node);
            this._bufferTail = node;
        }
        this._bufferedEntryCount += i;
        return _constructArray(i < 16384 ? i + i : i + (i >> 2));
    }

    public Object completeAndClearBuffer(Object obj, int i) {
        int i2 = this._bufferedEntryCount + i;
        Object _constructArray = _constructArray(i2);
        int i3 = 0;
        for (Node node = this._bufferHead; node != null; node = node.next()) {
            i3 = node.copyData(_constructArray, i3);
        }
        System.arraycopy(obj, 0, _constructArray, i3, i);
        i3 += i;
        if (i3 == i2) {
            return _constructArray;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Should have gotten ");
        stringBuilder.append(i2);
        stringBuilder.append(" entries, got ");
        stringBuilder.append(i3);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public Object resetAndStart() {
        _reset();
        Object obj = this._freeBuffer;
        return obj == null ? _constructArray(12) : obj;
    }
}
