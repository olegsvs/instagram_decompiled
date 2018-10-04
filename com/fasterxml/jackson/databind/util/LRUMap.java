package com.fasterxml.jackson.databind.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LRUMap extends LinkedHashMap implements Serializable {
    private static final long serialVersionUID = 1;
    public transient int _jdkSerializeMaxEntries;
    public final int _maxEntries;

    public LRUMap(int i, int i2) {
        super(i, 0.8f, true);
        this._maxEntries = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this._jdkSerializeMaxEntries = objectInputStream.readInt();
    }

    public Object readResolve() {
        int i = this._jdkSerializeMaxEntries;
        return new LRUMap(i, i);
    }

    public boolean removeEldestEntry(Entry entry) {
        return size() > this._maxEntries;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this._jdkSerializeMaxEntries);
    }
}
