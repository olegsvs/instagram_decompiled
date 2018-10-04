package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;

public final class ObjectBuffer {
    public static final int INITIAL_CHUNK_SIZE = 12;
    public static final int MAX_CHUNK_SIZE = 262144;
    public static final int SMALL_CHUNK_SIZE = 16384;
    private Node _bufferHead;
    private Node _bufferTail;
    private int _bufferedEntryCount;
    private Object[] _freeBuffer;

    public final class Node {
        public final Object[] _data;
        public Node _next;

        public Node(Object[] objArr) {
            this._data = objArr;
        }

        public Object[] getData() {
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

    public final void _copyTo(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        for (Node node = this._bufferHead; node != null; node = node.next()) {
            Object data = node.getData();
            int length = data.length;
            System.arraycopy(data, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        i3 += i2;
        if (i3 != i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Should have gotten ");
            stringBuilder.append(i);
            stringBuilder.append(" entries, got ");
            stringBuilder.append(i3);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void _reset() {
        Node node = this._bufferTail;
        if (node != null) {
            this._freeBuffer = node.getData();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public Object[] appendCompletedChunk(Object[] objArr) {
        Node node = new Node(objArr);
        if (this._bufferHead == null) {
            this._bufferTail = node;
            this._bufferHead = node;
        } else {
            this._bufferTail.linkNext(node);
            this._bufferTail = node;
        }
        int length = objArr.length;
        this._bufferedEntryCount += length;
        return new Object[(length < 16384 ? length + length : length + (length >> 2))];
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public void completeAndClearBuffer(Object[] objArr, int i, List list) {
        Node node = this._bufferHead;
        while (true) {
            int i2 = 0;
            if (node == null) {
                break;
            }
            Object[] data = node.getData();
            int length = data.length;
            while (i2 < length) {
                list.add(data[i2]);
                i2++;
            }
            node = node.next();
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
    }

    public Object[] completeAndClearBuffer(Object[] objArr, int i) {
        int i2 = this._bufferedEntryCount + i;
        Object obj = new Object[i2];
        _copyTo(obj, i2, objArr, i);
        return obj;
    }

    public Object[] completeAndClearBuffer(Object[] objArr, int i, Class cls) {
        int i2 = this._bufferedEntryCount + i;
        Object[] objArr2 = (Object[]) Array.newInstance(cls, i2);
        _copyTo(objArr2, i2, objArr, i);
        _reset();
        return objArr2;
    }

    public int initialCapacity() {
        Object[] objArr = this._freeBuffer;
        return objArr == null ? 0 : objArr.length;
    }

    public Object[] resetAndStart() {
        _reset();
        Object[] objArr = this._freeBuffer;
        return objArr == null ? new Object[12] : objArr;
    }
}
