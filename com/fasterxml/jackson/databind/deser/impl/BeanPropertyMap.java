package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class BeanPropertyMap implements Iterable, Serializable {
    private static final long serialVersionUID = 1;
    private final Bucket[] _buckets;
    private final int _hashMask;
    private int _nextBucketIndex = 0;
    private final int _size;

    public final class Bucket implements Serializable {
        private static final long serialVersionUID = 1;
        public final int index;
        public final String key;
        public final Bucket next;
        public final SettableBeanProperty value;

        public Bucket(Bucket bucket, String str, SettableBeanProperty settableBeanProperty, int i) {
            this.next = bucket;
            this.key = str;
            this.value = settableBeanProperty;
            this.index = i;
        }
    }

    public final class IteratorImpl implements Iterator {
        private final Bucket[] _buckets;
        private Bucket _currentBucket;
        private int _nextBucketIndex;

        public IteratorImpl(Bucket[] bucketArr) {
            this._buckets = bucketArr;
            int length = bucketArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                Bucket bucket = this._buckets[i];
                if (bucket != null) {
                    this._currentBucket = bucket;
                    i = i2;
                    break;
                }
                i = i2;
            }
            this._nextBucketIndex = i;
        }

        public boolean hasNext() {
            return this._currentBucket != null;
        }

        public SettableBeanProperty next() {
            Bucket bucket = this._currentBucket;
            if (bucket != null) {
                Bucket bucket2 = bucket.next;
                while (bucket2 == null) {
                    int i = this._nextBucketIndex;
                    Bucket[] bucketArr = this._buckets;
                    if (i >= bucketArr.length) {
                        break;
                    }
                    this._nextBucketIndex = i + 1;
                    bucket2 = bucketArr[i];
                }
                this._currentBucket = bucket2;
                return bucket.value;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final int findSize(int i) {
        int i2 = 2;
        while (i2 < (i <= 32 ? i + i : i + (i >> 2))) {
            i2 += i2;
        }
        return i2;
    }

    public BeanPropertyMap(Collection collection) {
        int size = collection.size();
        this._size = size;
        int findSize = findSize(size);
        this._hashMask = findSize - 1;
        Bucket[] bucketArr = new Bucket[findSize];
        for (SettableBeanProperty settableBeanProperty : collection) {
            String name = settableBeanProperty.getName();
            int hashCode = name.hashCode() & this._hashMask;
            Bucket bucket = bucketArr[hashCode];
            findSize = this._nextBucketIndex;
            this._nextBucketIndex = findSize + 1;
            bucketArr[hashCode] = new Bucket(bucket, name, settableBeanProperty, findSize);
        }
        this._buckets = bucketArr;
    }

    private BeanPropertyMap(Bucket[] bucketArr, int i, int i2) {
        this._buckets = bucketArr;
        this._size = i;
        this._hashMask = bucketArr.length - 1;
        this._nextBucketIndex = i2;
    }

    private SettableBeanProperty _findWithEquals(String str, int i) {
        for (Bucket bucket = this._buckets[i]; bucket != null; bucket = bucket.next) {
            if (str.equals(bucket.key)) {
                return bucket.value;
            }
        }
        return null;
    }

    public BeanPropertyMap assignIndexes() {
        int i = 0;
        for (Bucket bucket : this._buckets) {
            Bucket bucket2;
            while (bucket2 != null) {
                int i2 = i + 1;
                bucket2.value.assignIndex(i);
                bucket2 = bucket2.next;
                i = i2;
            }
        }
        return this;
    }

    public SettableBeanProperty find(String str) {
        int hashCode = str.hashCode() & this._hashMask;
        Bucket bucket = this._buckets[hashCode];
        if (bucket == null) {
            return null;
        }
        while (bucket.key != str) {
            bucket = bucket.next;
            if (bucket == null) {
                return _findWithEquals(str, hashCode);
            }
        }
        return bucket.value;
    }

    public SettableBeanProperty[] getPropertiesInInsertionOrder() {
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[this._nextBucketIndex];
        for (Bucket bucket : this._buckets) {
            for (Bucket bucket2 = r5[r3]; bucket2 != null; bucket2 = bucket2.next) {
                settableBeanPropertyArr[bucket2.index] = bucket2.value;
            }
        }
        return settableBeanPropertyArr;
    }

    public Iterator iterator() {
        return new IteratorImpl(this._buckets);
    }

    public void remove(SettableBeanProperty settableBeanProperty) {
        String name = settableBeanProperty.getName();
        int hashCode = name.hashCode();
        Bucket[] bucketArr = this._buckets;
        hashCode &= bucketArr.length - 1;
        Bucket bucket = bucketArr[hashCode];
        Bucket bucket2 = null;
        Object obj = null;
        while (bucket != null) {
            if (obj == null && bucket.key.equals(name)) {
                obj = 1;
            } else {
                bucket2 = new Bucket(bucket2, bucket.key, bucket.value, bucket.index);
            }
            bucket = bucket.next;
        }
        if (obj != null) {
            this._buckets[hashCode] = bucket2;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No entry '");
        stringBuilder.append(settableBeanProperty);
        stringBuilder.append("' found, can't remove");
        throw new NoSuchElementException(stringBuilder.toString());
    }

    public BeanPropertyMap renameAll(NameTransformer nameTransformer) {
        if (nameTransformer != null) {
            if (nameTransformer != NameTransformer.NOP) {
                Iterator it = iterator();
                Collection arrayList = new ArrayList();
                while (it.hasNext()) {
                    SettableBeanProperty settableBeanProperty = (SettableBeanProperty) it.next();
                    Object withName = settableBeanProperty.withName(nameTransformer.transform(settableBeanProperty.getName()));
                    JsonDeserializer valueDeserializer = withName.getValueDeserializer();
                    if (valueDeserializer != null) {
                        JsonDeserializer unwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer);
                        if (unwrappingDeserializer != valueDeserializer) {
                            withName = withName.withValueDeserializer(unwrappingDeserializer);
                        }
                    }
                    arrayList.add(withName);
                }
                return new BeanPropertyMap(arrayList);
            }
        }
        return this;
    }

    public void replace(SettableBeanProperty settableBeanProperty) {
        String name = settableBeanProperty.getName();
        int hashCode = name.hashCode();
        Bucket[] bucketArr = this._buckets;
        hashCode &= bucketArr.length - 1;
        Bucket bucket = bucketArr[hashCode];
        Bucket bucket2 = null;
        int i = -1;
        while (bucket != null) {
            if (i >= 0 || !bucket.key.equals(name)) {
                bucket2 = new Bucket(bucket2, bucket.key, bucket.value, bucket.index);
            } else {
                i = bucket.index;
            }
            bucket = bucket.next;
        }
        if (i >= 0) {
            this._buckets[hashCode] = new Bucket(bucket2, name, settableBeanProperty, i);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No entry '");
        stringBuilder.append(settableBeanProperty);
        stringBuilder.append("' found, can't replace");
        throw new NoSuchElementException(stringBuilder.toString());
    }

    public int size() {
        return this._size;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Properties=[");
        int i = 0;
        for (SettableBeanProperty settableBeanProperty : getPropertiesInInsertionOrder()) {
            if (settableBeanProperty != null) {
                int i2 = i + 1;
                if (i > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(settableBeanProperty.getName());
                stringBuilder.append('(');
                stringBuilder.append(settableBeanProperty.getType());
                stringBuilder.append(')');
                i = i2;
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public BeanPropertyMap withProperty(SettableBeanProperty settableBeanProperty) {
        Object obj = this._buckets;
        int length = obj.length;
        Object obj2 = new Bucket[length];
        System.arraycopy(obj, 0, obj2, 0, length);
        String name = settableBeanProperty.getName();
        if (find(settableBeanProperty.getName()) == null) {
            int hashCode = name.hashCode() & this._hashMask;
            Bucket bucket = obj2[hashCode];
            int i = this._nextBucketIndex;
            this._nextBucketIndex = i + 1;
            obj2[hashCode] = new Bucket(bucket, name, settableBeanProperty, i);
            return new BeanPropertyMap(obj2, this._size + 1, this._nextBucketIndex);
        }
        BeanPropertyMap beanPropertyMap = new BeanPropertyMap(obj2, length, this._nextBucketIndex);
        beanPropertyMap.replace(settableBeanProperty);
        return beanPropertyMap;
    }
}
