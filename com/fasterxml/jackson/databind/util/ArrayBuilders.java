package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public final class ArrayBuilders {
    private ArrayBuilders$BooleanBuilder _booleanBuilder = null;
    private ArrayBuilders$ByteBuilder _byteBuilder = null;
    private ArrayBuilders$DoubleBuilder _doubleBuilder = null;
    private ArrayBuilders$FloatBuilder _floatBuilder = null;
    private ArrayBuilders$IntBuilder _intBuilder = null;
    private ArrayBuilders$LongBuilder _longBuilder = null;
    private ArrayBuilders$ShortBuilder _shortBuilder = null;

    /* renamed from: com.fasterxml.jackson.databind.util.ArrayBuilders$1 */
    public final class C01561 {
        public final /* synthetic */ Object val$defaultValue;
        public final /* synthetic */ Class val$defaultValueType;
        public final /* synthetic */ int val$length;

        public C01561(Class cls, int i, Object obj) {
            this.val$defaultValueType = cls;
            this.val$length = i;
            this.val$defaultValue = obj;
        }

        public boolean equals(Object obj) {
            if (obj != this) {
                if (obj != null) {
                    if (obj.getClass() == this.val$defaultValueType) {
                        if (Array.getLength(obj) == this.val$length) {
                            for (int i = 0; i < this.val$length; i++) {
                                Object obj2 = Array.get(this.val$defaultValue, i);
                                Object obj3 = Array.get(obj, i);
                                if (obj2 != obj3) {
                                    if (!(obj2 == null || obj2.equals(obj3))) {
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
    }

    public final class ArrayIterator implements Iterator, Iterable {
        private final Object[] _array;
        private int _index = 0;

        public Iterator iterator() {
            return this;
        }

        public ArrayIterator(Object[] objArr) {
            this._array = objArr;
        }

        public boolean hasNext() {
            return this._index < this._array.length;
        }

        public Object next() {
            int i = this._index;
            Object[] objArr = this._array;
            if (i < objArr.length) {
                this._index = i + 1;
                return objArr[i];
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static List addToList(List list, Object obj) {
        if (list == null) {
            list = new ArrayList();
        }
        list.add(obj);
        return list;
    }

    public static Iterable arrayAsIterable(Object[] objArr) {
        return new ArrayIterator(objArr);
    }

    public static Iterator arrayAsIterator(Object[] objArr) {
        return new ArrayIterator(objArr);
    }

    public static ArrayList arrayToList(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        if (objArr != null) {
            for (Object add : objArr) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }

    public static HashSet arrayToSet(Object[] objArr) {
        HashSet hashSet = new HashSet();
        if (objArr != null) {
            for (Object add : objArr) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }

    public static Object getArrayComparator(Object obj) {
        return new C01561(obj.getClass(), Array.getLength(obj), obj);
    }

    public ArrayBuilders$BooleanBuilder getBooleanBuilder() {
        if (this._booleanBuilder == null) {
            this._booleanBuilder = new ArrayBuilders$BooleanBuilder();
        }
        return this._booleanBuilder;
    }

    public ArrayBuilders$ByteBuilder getByteBuilder() {
        if (this._byteBuilder == null) {
            this._byteBuilder = new ArrayBuilders$ByteBuilder();
        }
        return this._byteBuilder;
    }

    public ArrayBuilders$DoubleBuilder getDoubleBuilder() {
        if (this._doubleBuilder == null) {
            this._doubleBuilder = new ArrayBuilders$DoubleBuilder();
        }
        return this._doubleBuilder;
    }

    public ArrayBuilders$FloatBuilder getFloatBuilder() {
        if (this._floatBuilder == null) {
            this._floatBuilder = new ArrayBuilders$FloatBuilder();
        }
        return this._floatBuilder;
    }

    public ArrayBuilders$IntBuilder getIntBuilder() {
        if (this._intBuilder == null) {
            this._intBuilder = new ArrayBuilders$IntBuilder();
        }
        return this._intBuilder;
    }

    public ArrayBuilders$LongBuilder getLongBuilder() {
        if (this._longBuilder == null) {
            this._longBuilder = new ArrayBuilders$LongBuilder();
        }
        return this._longBuilder;
    }

    public ArrayBuilders$ShortBuilder getShortBuilder() {
        if (this._shortBuilder == null) {
            this._shortBuilder = new ArrayBuilders$ShortBuilder();
        }
        return this._shortBuilder;
    }

    public static Object[] insertInList(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length + 1);
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 1, length);
        }
        objArr2[0] = obj;
        return objArr2;
    }

    public static Object[] insertInListNoDup(Object[] objArr, Object obj) {
        Object[] objArr2;
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (objArr[i] != obj) {
                i++;
            } else if (i == 0) {
                return objArr;
            } else {
                objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
                System.arraycopy(objArr, 0, objArr2, 1, i);
                objArr2[0] = obj;
                i++;
                length -= i;
                if (length > 0) {
                    System.arraycopy(objArr, i, objArr2, i, length);
                }
                return objArr2;
            }
        }
        objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length + 1);
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 1, length);
        }
        objArr2[0] = obj;
        return objArr2;
    }

    public static HashSet setAndArray(Set set, Object[] objArr) {
        HashSet hashSet = new HashSet();
        if (set != null) {
            hashSet.addAll(set);
        }
        if (objArr != null) {
            for (Object add : objArr) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }
}
