package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class BytesToNameCanonicalizer {
    public int _collCount;
    public int _collEnd;
    public Bucket[] _collList;
    private boolean _collListShared;
    public int _count;
    private final int _hashSeed;
    public final boolean _intern;
    public int _longestCollisionList;
    public int[] _mainHash;
    public int _mainHashMask;
    private boolean _mainHashShared;
    public Name[] _mainNames;
    private boolean _mainNamesShared;
    private transient boolean _needRehash;
    public final BytesToNameCanonicalizer _parent;
    public final AtomicReference _tableInfo;

    public final class TableInfo {
        public final int collCount;
        public final int collEnd;
        public final Bucket[] collList;
        public final int count;
        public final int longestCollisionList;
        public final int[] mainHash;
        public final int mainHashMask;
        public final Name[] mainNames;

        public TableInfo(int i, int i2, int[] iArr, Name[] nameArr, Bucket[] bucketArr, int i3, int i4, int i5) {
            this.count = i;
            this.mainHashMask = i2;
            this.mainHash = iArr;
            this.mainNames = nameArr;
            this.collList = bucketArr;
            this.collCount = i3;
            this.collEnd = i4;
            this.longestCollisionList = i5;
        }

        public TableInfo(BytesToNameCanonicalizer bytesToNameCanonicalizer) {
            this.count = bytesToNameCanonicalizer._count;
            this.mainHashMask = bytesToNameCanonicalizer._mainHashMask;
            this.mainHash = bytesToNameCanonicalizer._mainHash;
            this.mainNames = bytesToNameCanonicalizer._mainNames;
            this.collList = bytesToNameCanonicalizer._collList;
            this.collCount = bytesToNameCanonicalizer._collCount;
            this.collEnd = bytesToNameCanonicalizer._collEnd;
            this.longestCollisionList = bytesToNameCanonicalizer._longestCollisionList;
        }
    }

    public final class Bucket {
        private final int _length;
        public final Name _name;
        public final Bucket _next;

        public Bucket(Name name, Bucket bucket) {
            this._name = name;
            this._next = bucket;
            int i = 1;
            if (bucket != null) {
                i = 1 + bucket._length;
            }
            this._length = i;
        }

        public final Name find(int i, int i2, int i3) {
            if (this._name.hashCode() == i && this._name.equals(i2, i3)) {
                return this._name;
            }
            while (true) {
                this = this._next;
                if (this == null) {
                    return null;
                }
                Name name = this._name;
                if (name.hashCode() == i && name.equals(i2, i3)) {
                    return name;
                }
            }
        }

        public final Name find(int i, int[] iArr, int i2) {
            if (this._name.hashCode() == i && this._name.equals(iArr, i2)) {
                return this._name;
            }
            while (true) {
                this = this._next;
                if (this == null) {
                    return null;
                }
                Name name = this._name;
                if (name.hashCode() == i && name.equals(iArr, i2)) {
                    return name;
                }
            }
        }

        public final int length() {
            return this._length;
        }
    }

    private BytesToNameCanonicalizer(int i, boolean z, int i2) {
        this._parent = null;
        this._hashSeed = i2;
        this._intern = z;
        int i3 = 16;
        if (i >= 16) {
            if (((i - 1) & i) != 0) {
                while (i3 < i) {
                    i3 += i3;
                }
            } else {
                i3 = i;
            }
        }
        this._tableInfo = new AtomicReference(initTableInfo(i3));
    }

    private BytesToNameCanonicalizer(BytesToNameCanonicalizer bytesToNameCanonicalizer, boolean z, int i, TableInfo tableInfo) {
        this._parent = bytesToNameCanonicalizer;
        this._hashSeed = i;
        this._intern = z;
        this._tableInfo = null;
        this._count = tableInfo.count;
        this._mainHashMask = tableInfo.mainHashMask;
        this._mainHash = tableInfo.mainHash;
        this._mainNames = tableInfo.mainNames;
        this._collList = tableInfo.collList;
        this._collCount = tableInfo.collCount;
        this._collEnd = tableInfo.collEnd;
        this._longestCollisionList = tableInfo.longestCollisionList;
        this._needRehash = false;
        this._mainHashShared = true;
        this._mainNamesShared = true;
        this._collListShared = true;
    }

    private void _addSymbol(int i, Name name) {
        int i2;
        int i3;
        if (this._mainHashShared) {
            unshareMain();
        }
        if (this._needRehash) {
            rehash();
        }
        this._count++;
        int i4 = this._mainHashMask & i;
        if (this._mainNames[i4] == null) {
            this._mainHash[i4] = i << 8;
            if (this._mainNamesShared) {
                unshareNames();
            }
            this._mainNames[i4] = name;
        } else {
            if (this._collListShared) {
                unshareCollision();
            }
            this._collCount++;
            i2 = this._mainHash[i4];
            int i5 = i2 & 255;
            if (i5 == 0) {
                i3 = this._collEnd;
                if (i3 <= 254) {
                    this._collEnd = i3 + 1;
                    if (i3 >= this._collList.length) {
                        expandCollision();
                    }
                } else {
                    i3 = findBestBucket();
                }
                this._mainHash[i4] = (i2 & -256) | (i3 + 1);
            } else {
                i3 = i5 - 1;
            }
            Bucket bucket = new Bucket(name, this._collList[i3]);
            this._collList[i3] = bucket;
            i2 = Math.max(bucket.length(), this._longestCollisionList);
            this._longestCollisionList = i2;
            if (i2 > 255) {
                reportTooManyCollisions(255);
            }
        }
        i3 = this._mainHash.length;
        int i6 = this._count;
        if (i6 > (i3 >> 1)) {
            i2 = i3 >> 2;
            if (i6 <= i3 - i2) {
                if (this._collCount < i2) {
                    return;
                }
            }
            this._needRehash = true;
        }
    }

    public final Name addName(String str, int[] iArr, int i) {
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int calcHash = i < 3 ? i == 1 ? calcHash(iArr[0]) : calcHash(iArr[0], iArr[1]) : calcHash(iArr, i);
        Name constructName = constructName(calcHash, str, iArr, i);
        _addSymbol(calcHash, constructName);
        return constructName;
    }

    public final int calcHash(int i) {
        i ^= this._hashSeed;
        i += i >>> 15;
        return i ^ (i >>> 9);
    }

    public final int calcHash(int i, int i2) {
        i = ((i ^ (i >>> 15)) + (i2 * 33)) ^ this._hashSeed;
        return i + (i >>> 7);
    }

    public final int calcHash(int[] iArr, int i) {
        int i2 = 3;
        if (i >= 3) {
            int i3 = iArr[0] ^ this._hashSeed;
            i3 = (((i3 + (i3 >>> 9)) * 33) + iArr[1]) * 65599;
            i3 = (i3 + (i3 >>> 15)) ^ iArr[2];
            i3 += i3 >>> 17;
            while (i2 < i) {
                i3 = (i3 * 31) ^ iArr[i2];
                i3 += i3 >>> 3;
                i3 ^= i3 << 7;
                i2++;
            }
            i3 += i3 >>> 15;
            return (i3 << 9) ^ i3;
        }
        throw new IllegalArgumentException();
    }

    private static Name constructName(int i, String str, int[] iArr, int i2) {
        int i3 = 0;
        int i4 = i;
        String str2 = str;
        if (i2 < 4) {
            switch (i2) {
                case 1:
                    return new Name1(str, i, iArr[0]);
                case 2:
                    return new Name2(str, i, iArr[0], iArr[1]);
                case 3:
                    return new Name3(str2, i4, iArr[0], iArr[1], iArr[2]);
                default:
                    break;
            }
        }
        int[] iArr2 = new int[i2];
        while (i3 < i2) {
            iArr2[i3] = iArr[i3];
            i3++;
        }
        return new NameN(str, i, iArr2, i2);
    }

    public static BytesToNameCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    public static BytesToNameCanonicalizer createRoot(int i) {
        return new BytesToNameCanonicalizer(64, true, i);
    }

    private void expandCollision() {
        Object obj = this._collList;
        int length = obj.length;
        Object obj2 = new Bucket[(length + length)];
        this._collList = obj2;
        System.arraycopy(obj, 0, obj2, 0, length);
    }

    private int findBestBucket() {
        Bucket[] bucketArr = this._collList;
        int i = this._collEnd;
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int length = bucketArr[i4].length();
            if (length < i2) {
                if (length == 1) {
                    return i4;
                }
                i3 = i4;
                i2 = length;
            }
        }
        return i3;
    }

    public final Name findName(int i) {
        int calcHash = calcHash(i);
        int i2 = this._mainHashMask & calcHash;
        int i3 = this._mainHash[i2];
        int i4;
        Bucket bucket;
        if ((((i3 >> 8) ^ calcHash) << 8) == 0) {
            Name name = this._mainNames[i2];
            if (name != null) {
                if (name.equals(i)) {
                    return name;
                }
                i4 = i3 & 255;
                if (i4 > 0) {
                    bucket = this._collList[i4 - 1];
                    if (bucket != null) {
                        return bucket.find(calcHash, i, 0);
                    }
                }
            }
        }
        if (i3 == 0) {
        }
        i4 = i3 & 255;
        if (i4 > 0) {
            bucket = this._collList[i4 - 1];
            if (bucket != null) {
                return bucket.find(calcHash, i, 0);
            }
        }
        return null;
    }

    public final Name findName(int i, int i2) {
        int calcHash = i2 == 0 ? calcHash(i) : calcHash(i, i2);
        int i3 = this._mainHashMask & calcHash;
        int i4 = this._mainHash[i3];
        int i5;
        Bucket bucket;
        if ((((i4 >> 8) ^ calcHash) << 8) == 0) {
            Name name = this._mainNames[i3];
            if (name != null) {
                if (name.equals(i, i2)) {
                    return name;
                }
                i5 = i4 & 255;
                if (i5 > 0) {
                    bucket = this._collList[i5 - 1];
                    if (bucket != null) {
                        return bucket.find(calcHash, i, i2);
                    }
                }
            }
        }
        if (i4 == 0) {
        }
        i5 = i4 & 255;
        if (i5 > 0) {
            bucket = this._collList[i5 - 1];
            if (bucket != null) {
                return bucket.find(calcHash, i, i2);
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.sym.Name findName(int[] r6, int r7) {
        /*
        r5 = this;
        r0 = 3;
        if (r7 >= r0) goto L_0x0012;
    L_0x0003:
        r2 = 0;
        r1 = r6[r2];
        r0 = 2;
        if (r7 >= r0) goto L_0x000a;
    L_0x0009:
        goto L_0x000d;
    L_0x000a:
        r0 = 1;
        r2 = r6[r0];
    L_0x000d:
        r0 = r5.findName(r1, r2);
        return r0;
    L_0x0012:
        r4 = r5.calcHash(r6, r7);
        r1 = r5._mainHashMask;
        r1 = r1 & r4;
        r0 = r5._mainHash;
        r3 = r0[r1];
        r0 = r3 >> 8;
        r0 = r0 ^ r4;
        r0 = r0 << 8;
        r2 = 0;
        if (r0 != 0) goto L_0x0032;
    L_0x0025:
        r0 = r5._mainNames;
        r1 = r0[r1];
        if (r1 == 0) goto L_0x0031;
    L_0x002b:
        r0 = r1.equals(r6, r7);
        if (r0 == 0) goto L_0x0035;
    L_0x0031:
        return r1;
    L_0x0032:
        if (r3 != 0) goto L_0x0035;
    L_0x0034:
        return r2;
    L_0x0035:
        r0 = r3 & 255;
        if (r0 <= 0) goto L_0x0034;
    L_0x0039:
        r1 = r0 + -1;
        r0 = r5._collList;
        r0 = r0[r1];
        if (r0 == 0) goto L_0x0034;
    L_0x0041:
        r0 = r0.find(r4, r6, r7);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.findName(int[], int):com.fasterxml.jackson.core.sym.Name");
    }

    private static TableInfo initTableInfo(int i) {
        return new TableInfo(0, i - 1, new int[i], new Name[i], null, 0, 0, 0);
    }

    public final BytesToNameCanonicalizer makeChild(boolean z, boolean z2) {
        return new BytesToNameCanonicalizer(this, z2, this._hashSeed, (TableInfo) this._tableInfo.get());
    }

    public final boolean maybeDirty() {
        return this._mainHashShared ^ 1;
    }

    private void mergeChild(TableInfo tableInfo) {
        int i = tableInfo.count;
        TableInfo tableInfo2 = (TableInfo) this._tableInfo.get();
        if (i > tableInfo2.count) {
            if (i > 6000 || tableInfo.longestCollisionList > 63) {
                tableInfo = initTableInfo(64);
            }
            this._tableInfo.compareAndSet(tableInfo2, tableInfo);
        }
    }

    private void nukeSymbols() {
        this._count = 0;
        this._longestCollisionList = 0;
        Arrays.fill(this._mainHash, 0);
        Arrays.fill(this._mainNames, null);
        Arrays.fill(this._collList, null);
        this._collCount = 0;
        this._collEnd = 0;
    }

    private void rehash() {
        int i = 0;
        this._needRehash = false;
        this._mainNamesShared = false;
        int length = this._mainHash.length;
        int i2 = length + length;
        if (i2 > 65536) {
            nukeSymbols();
            return;
        }
        int i3;
        this._mainHash = new int[i2];
        this._mainHashMask = i2 - 1;
        Name[] nameArr = this._mainNames;
        this._mainNames = new Name[i2];
        int i4 = 0;
        for (i3 = 0; i3 < length; i3++) {
            Name name = nameArr[i3];
            if (name != null) {
                i4++;
                int hashCode = name.hashCode();
                int i5 = this._mainHashMask & hashCode;
                this._mainNames[i5] = name;
                this._mainHash[i5] = hashCode << 8;
            }
        }
        length = this._collEnd;
        if (length == 0) {
            this._longestCollisionList = 0;
            return;
        }
        this._collCount = 0;
        this._collEnd = 0;
        this._collListShared = false;
        Bucket[] bucketArr = this._collList;
        this._collList = new Bucket[bucketArr.length];
        i3 = 0;
        while (i < length) {
            for (Bucket bucket = bucketArr[i]; bucket != null; bucket = bucket._next) {
                i4++;
                Name name2 = bucket._name;
                int hashCode2 = name2.hashCode();
                int i6 = this._mainHashMask & hashCode2;
                int[] iArr = this._mainHash;
                i2 = iArr[i6];
                Name[] nameArr2 = this._mainNames;
                if (nameArr2[i6] == null) {
                    iArr[i6] = hashCode2 << 8;
                    nameArr2[i6] = name2;
                } else {
                    int i7;
                    this._collCount++;
                    int i8 = i2 & 255;
                    if (i8 == 0) {
                        i7 = this._collEnd;
                        if (i7 <= 254) {
                            this._collEnd = i7 + 1;
                            if (i7 >= this._collList.length) {
                                expandCollision();
                            }
                        } else {
                            i7 = findBestBucket();
                        }
                        this._mainHash[i6] = (i2 & -256) | (i7 + 1);
                    } else {
                        i7 = i8 - 1;
                    }
                    Bucket bucket2 = new Bucket(name2, this._collList[i7]);
                    this._collList[i7] = bucket2;
                    i3 = Math.max(i3, bucket2.length());
                }
            }
            i++;
        }
        this._longestCollisionList = i3;
        if (i4 != this._count) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Internal error: count after rehash ");
            stringBuilder.append(i4);
            stringBuilder.append("; should be ");
            stringBuilder.append(this._count);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final void release() {
        if (this._parent != null && maybeDirty()) {
            this._parent.mergeChild(new TableInfo(this));
            this._mainHashShared = true;
            this._mainNamesShared = true;
            this._collListShared = true;
        }
    }

    public final void reportTooManyCollisions(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Longest collision chain in symbol table (of size ");
        stringBuilder.append(this._count);
        stringBuilder.append(") now exceeds maximum, ");
        stringBuilder.append(i);
        stringBuilder.append(" -- suspect a DoS attack based on hash collisions");
        throw new IllegalStateException(stringBuilder.toString());
    }

    private void unshareCollision() {
        Object obj = this._collList;
        if (obj == null) {
            this._collList = new Bucket[32];
        } else {
            int length = obj.length;
            Object obj2 = new Bucket[length];
            this._collList = obj2;
            System.arraycopy(obj, 0, obj2, 0, length);
        }
        this._collListShared = false;
    }

    private void unshareMain() {
        Object obj = this._mainHash;
        int length = obj.length;
        Object obj2 = new int[length];
        this._mainHash = obj2;
        System.arraycopy(obj, 0, obj2, 0, length);
        this._mainHashShared = false;
    }

    private void unshareNames() {
        Object obj = this._mainNames;
        int length = obj.length;
        Object obj2 = new Name[length];
        this._mainNames = obj2;
        System.arraycopy(obj, 0, obj2, 0, length);
        this._mainNamesShared = false;
    }
}
