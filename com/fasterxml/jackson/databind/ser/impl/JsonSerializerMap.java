package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey;
import java.util.Map;
import java.util.Map.Entry;

public class JsonSerializerMap {
    private final Bucket[] _buckets;
    private final int _size;

    public final class Bucket {
        public final TypeKey key;
        public final Bucket next;
        public final JsonSerializer value;

        public Bucket(Bucket bucket, TypeKey typeKey, JsonSerializer jsonSerializer) {
            this.next = bucket;
            this.key = typeKey;
            this.value = jsonSerializer;
        }
    }

    private static final int findSize(int i) {
        int i2 = 8;
        while (i2 < (i <= 64 ? i + i : i + (i >> 2))) {
            i2 += i2;
        }
        return i2;
    }

    public JsonSerializerMap(Map map) {
        int findSize = findSize(map.size());
        this._size = findSize;
        int i = findSize - 1;
        Bucket[] bucketArr = new Bucket[findSize];
        for (Entry entry : map.entrySet()) {
            TypeKey typeKey = (TypeKey) entry.getKey();
            int hashCode = typeKey.hashCode() & i;
            bucketArr[hashCode] = new Bucket(bucketArr[hashCode], typeKey, (JsonSerializer) entry.getValue());
        }
        this._buckets = bucketArr;
    }

    public JsonSerializer find(TypeKey typeKey) {
        int hashCode = typeKey.hashCode();
        Bucket[] bucketArr = this._buckets;
        Bucket bucket = bucketArr[hashCode & (bucketArr.length - 1)];
        if (bucket != null) {
            while (!typeKey.equals(bucket.key)) {
                bucket = bucket.next;
                if (bucket != null) {
                }
            }
            return bucket.value;
        }
        return null;
    }

    public int size() {
        return this._size;
    }
}
