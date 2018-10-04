package com.fasterxml.jackson.core.sym;

import java.util.Arrays;

public final class CharsToNameCanonicalizer {
    public static final CharsToNameCanonicalizer sBootstrapSymbolTable = new CharsToNameCanonicalizer();
    public Bucket[] _buckets;
    public final boolean _canonicalize;
    public boolean _dirty;
    private final int _hashSeed;
    public int _indexMask;
    public final boolean _intern;
    public int _longestCollisionList;
    public CharsToNameCanonicalizer _parent;
    public int _size;
    public int _sizeThreshold;
    public String[] _symbols;

    public final class Bucket {
        private final int _length;
        private final Bucket _next;
        private final String _symbol;

        public Bucket(String str, Bucket bucket) {
            this._symbol = str;
            this._next = bucket;
            int i = 1;
            if (bucket != null) {
                i = 1 + bucket._length;
            }
            this._length = i;
        }

        public final String find(char[] cArr, int i, int i2) {
            String str = this._symbol;
            Bucket bucket = this._next;
            while (true) {
                if (str.length() == i2) {
                    int i3 = 0;
                    while (str.charAt(i3) == cArr[i + i3]) {
                        i3++;
                        if (i3 >= i2) {
                            break;
                        }
                    }
                    if (i3 == i2) {
                        return str;
                    }
                }
                if (bucket == null) {
                    return null;
                }
                str = bucket.getSymbol();
                bucket = bucket.getNext();
            }
        }

        public final Bucket getNext() {
            return this._next;
        }

        public final String getSymbol() {
            return this._symbol;
        }

        public final int length() {
            return this._length;
        }
    }

    private static int _thresholdSize(int i) {
        return i - (i >> 2);
    }

    private CharsToNameCanonicalizer() {
        this._canonicalize = true;
        this._intern = true;
        this._dirty = true;
        this._hashSeed = 0;
        this._longestCollisionList = 0;
        initTables(64);
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, boolean z, boolean z2, String[] strArr, Bucket[] bucketArr, int i, int i2, int i3) {
        this._parent = charsToNameCanonicalizer;
        this._canonicalize = z;
        this._intern = z2;
        this._symbols = strArr;
        this._buckets = bucketArr;
        this._size = i;
        this._hashSeed = i2;
        int length = strArr.length;
        this._sizeThreshold = _thresholdSize(length);
        this._indexMask = length - 1;
        this._longestCollisionList = i3;
        this._dirty = false;
    }

    public final int _hashToIndex(int i) {
        return (i + (i >>> 15)) & this._indexMask;
    }

    public final int calcHash(String str) {
        int length = str.length();
        int i = this._hashSeed;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        return i == 0 ? 1 : i;
    }

    public final int calcHash(char[] cArr, int i, int i2) {
        int i3 = this._hashSeed;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 33) + cArr[i4];
        }
        return i3 == 0 ? 1 : i3;
    }

    private void copyArrays() {
        Object obj = this._symbols;
        int length = obj.length;
        Object obj2 = new String[length];
        this._symbols = obj2;
        System.arraycopy(obj, 0, obj2, 0, length);
        obj = this._buckets;
        length = obj.length;
        obj2 = new Bucket[length];
        this._buckets = obj2;
        System.arraycopy(obj, 0, obj2, 0, length);
    }

    public static CharsToNameCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    public static CharsToNameCanonicalizer createRoot(int i) {
        return sBootstrapSymbolTable.makeOrphan(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String findSymbol(char[] r7, int r8, int r9, int r10) {
        /*
        r6 = this;
        r2 = 1;
        if (r9 >= r2) goto L_0x0006;
    L_0x0003:
        r0 = "";
        return r0;
    L_0x0006:
        r0 = r6._canonicalize;
        if (r0 != 0) goto L_0x0010;
    L_0x000a:
        r0 = new java.lang.String;
        r0.<init>(r7, r8, r9);
        return r0;
    L_0x0010:
        r5 = r6._hashToIndex(r10);
        r0 = r6._symbols;
        r3 = r0[r5];
        if (r3 == 0) goto L_0x0042;
    L_0x001a:
        r0 = r3.length();
        if (r0 != r9) goto L_0x0033;
    L_0x0020:
        r4 = 0;
    L_0x0021:
        r1 = r3.charAt(r4);
        r0 = r8 + r4;
        r0 = r7[r0];
        if (r1 == r0) goto L_0x002c;
    L_0x002b:
        goto L_0x0030;
    L_0x002c:
        r4 = r4 + 1;
        if (r4 < r9) goto L_0x0021;
    L_0x0030:
        if (r4 != r9) goto L_0x0033;
    L_0x0032:
        return r3;
    L_0x0033:
        r1 = r6._buckets;
        r0 = r5 >> 1;
        r0 = r1[r0];
        if (r0 == 0) goto L_0x0042;
    L_0x003b:
        r3 = r0.find(r7, r8, r9);
        if (r3 == 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0032;
    L_0x0042:
        r0 = r6._dirty;
        if (r0 != 0) goto L_0x004c;
    L_0x0046:
        r6.copyArrays();
        r6._dirty = r2;
        goto L_0x005d;
    L_0x004c:
        r1 = r6._size;
        r0 = r6._sizeThreshold;
        if (r1 < r0) goto L_0x005d;
    L_0x0052:
        r6.rehash();
        r0 = r6.calcHash(r7, r8, r9);
        r5 = r6._hashToIndex(r0);
    L_0x005d:
        r3 = new java.lang.String;
        r3.<init>(r7, r8, r9);
        r0 = r6._intern;
        if (r0 == 0) goto L_0x006c;
    L_0x0066:
        r0 = com.fasterxml.jackson.core.util.InternCache.instance;
        r3 = r0.intern(r3);
    L_0x006c:
        r0 = r6._size;
        r0 = r0 + r2;
        r6._size = r0;
        r1 = r6._symbols;
        r0 = r1[r5];
        if (r0 != 0) goto L_0x007a;
    L_0x0077:
        r1[r5] = r3;
        goto L_0x0032;
    L_0x007a:
        r2 = r5 >> 1;
        r1 = new com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Bucket;
        r0 = r6._buckets;
        r0 = r0[r2];
        r1.<init>(r3, r0);
        r0 = r6._buckets;
        r0[r2] = r1;
        r1 = r1.length();
        r0 = r6._longestCollisionList;
        r1 = java.lang.Math.max(r1, r0);
        r6._longestCollisionList = r1;
        r0 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r1 <= r0) goto L_0x0032;
    L_0x0099:
        r6.reportTooManyCollisions(r0);
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.findSymbol(char[], int, int, int):java.lang.String");
    }

    public final int hashSeed() {
        return this._hashSeed;
    }

    private void initTables(int i) {
        this._symbols = new String[i];
        this._buckets = new Bucket[(i >> 1)];
        this._indexMask = i - 1;
        this._size = 0;
        this._longestCollisionList = 0;
        this._sizeThreshold = _thresholdSize(i);
    }

    public final CharsToNameCanonicalizer makeChild(boolean z, boolean z2) {
        synchronized (this) {
            String[] strArr = this._symbols;
            Bucket[] bucketArr = this._buckets;
            int i = this._size;
            int i2 = this._hashSeed;
            int i3 = this._longestCollisionList;
            return new CharsToNameCanonicalizer(r1, z, z2, strArr, bucketArr, i, i2, i3);
        }
    }

    private CharsToNameCanonicalizer makeOrphan(int i) {
        return new CharsToNameCanonicalizer(null, true, true, this._symbols, this._buckets, this._size, i, this._longestCollisionList);
    }

    public final boolean maybeDirty() {
        return this._dirty;
    }

    private void mergeChild(CharsToNameCanonicalizer charsToNameCanonicalizer) {
        if (charsToNameCanonicalizer.size() <= 12000) {
            if (charsToNameCanonicalizer._longestCollisionList <= 63) {
                if (charsToNameCanonicalizer.size() > size()) {
                    synchronized (this) {
                        try {
                            this._symbols = charsToNameCanonicalizer._symbols;
                            this._buckets = charsToNameCanonicalizer._buckets;
                            this._size = charsToNameCanonicalizer._size;
                            this._sizeThreshold = charsToNameCanonicalizer._sizeThreshold;
                            this._indexMask = charsToNameCanonicalizer._indexMask;
                            this._longestCollisionList = charsToNameCanonicalizer._longestCollisionList;
                            this._dirty = false;
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            }
        }
        synchronized (this) {
            try {
                initTables(64);
                this._dirty = false;
            } catch (Throwable th3) {
                th2 = th3;
                throw th2;
            }
        }
    }

    private void rehash() {
        String[] strArr = this._symbols;
        int i = r8 + r8;
        int i2 = 0;
        if (i > 65536) {
            this._size = 0;
            Arrays.fill(strArr, null);
            Arrays.fill(this._buckets, null);
            this._dirty = true;
            return;
        }
        int _hashToIndex;
        String[] strArr2;
        Bucket[] bucketArr = this._buckets;
        this._symbols = new String[i];
        this._buckets = new Bucket[(i >> 1)];
        this._indexMask = i - 1;
        this._sizeThreshold = _thresholdSize(i);
        int i3 = 0;
        int i4 = 0;
        for (String str : strArr) {
            if (str != null) {
                i3++;
                _hashToIndex = _hashToIndex(calcHash(str));
                strArr2 = this._symbols;
                if (strArr2[_hashToIndex] == null) {
                    strArr2[_hashToIndex] = str;
                } else {
                    _hashToIndex >>= 1;
                    Bucket bucket = new Bucket(str, this._buckets[_hashToIndex]);
                    this._buckets[_hashToIndex] = bucket;
                    i4 = Math.max(i4, bucket.length());
                }
            }
        }
        int i5 = r8 >> 1;
        while (i2 < i5) {
            for (Bucket bucket2 = bucketArr[i2]; bucket2 != null; bucket2 = bucket2.getNext()) {
                i3++;
                String symbol = bucket2.getSymbol();
                _hashToIndex = _hashToIndex(calcHash(symbol));
                strArr2 = this._symbols;
                if (strArr2[_hashToIndex] == null) {
                    strArr2[_hashToIndex] = symbol;
                } else {
                    _hashToIndex >>= 1;
                    bucket = new Bucket(symbol, this._buckets[_hashToIndex]);
                    this._buckets[_hashToIndex] = bucket;
                    i4 = Math.max(i4, bucket.length());
                }
            }
            i2++;
        }
        this._longestCollisionList = i4;
        if (i3 != this._size) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Internal error on SymbolTable.rehash(): had ");
            stringBuilder.append(this._size);
            stringBuilder.append(" entries; now have ");
            stringBuilder.append(i3);
            stringBuilder.append(".");
            throw new Error(stringBuilder.toString());
        }
    }

    public final void release() {
        if (maybeDirty()) {
            CharsToNameCanonicalizer charsToNameCanonicalizer = this._parent;
            if (charsToNameCanonicalizer != null) {
                charsToNameCanonicalizer.mergeChild(this);
                this._dirty = false;
            }
        }
    }

    public final void reportTooManyCollisions(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Longest collision chain in symbol table (of size ");
        stringBuilder.append(this._size);
        stringBuilder.append(") now exceeds maximum, ");
        stringBuilder.append(i);
        stringBuilder.append(" -- suspect a DoS attack based on hash collisions");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final int size() {
        return this._size;
    }
}
