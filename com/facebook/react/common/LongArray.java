package com.facebook.react.common;

public final class LongArray {
    private long[] mArray;
    private int mLength = 0;

    private LongArray(int i) {
        this.mArray = new long[i];
    }

    public final void add(long j) {
        growArrayIfNeeded();
        long[] jArr = this.mArray;
        int i = this.mLength;
        this.mLength = i + 1;
        jArr[i] = j;
    }

    public static LongArray createWithInitialCapacity(int i) {
        return new LongArray(i);
    }

    public final void dropTail(int i) {
        int i2 = this.mLength;
        if (i <= i2) {
            this.mLength = i2 - i;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to drop ");
        stringBuilder.append(i);
        stringBuilder.append(" items from array of length ");
        stringBuilder.append(this.mLength);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public final long get(int i) {
        if (i < this.mLength) {
            return this.mArray[i];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append(" >= ");
        stringBuilder.append(this.mLength);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    private void growArrayIfNeeded() {
        int i = this.mLength;
        if (i == this.mArray.length) {
            int i2 = i + 1;
            double d = (double) i;
            Double.isNaN(d);
            Object obj = new long[Math.max(i2, (int) (d * 1.8d))];
            System.arraycopy(this.mArray, 0, obj, 0, this.mLength);
            this.mArray = obj;
        }
    }

    public final void set(int i, long j) {
        if (i < this.mLength) {
            this.mArray[i] = j;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append(" >= ");
        stringBuilder.append(this.mLength);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public final int size() {
        return this.mLength;
    }
}
