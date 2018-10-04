package com.fasterxml.jackson.core.sym;

public final class NameN extends Name {
    public final int mQuadLen;
    public final int[] mQuads;

    public final boolean equals(int i) {
        return false;
    }

    public final boolean equals(int i, int i2) {
        return false;
    }

    public NameN(String str, int i, int[] iArr, int i2) {
        super(str, i);
        if (i2 >= 3) {
            this.mQuads = iArr;
            this.mQuadLen = i2;
            return;
        }
        throw new IllegalArgumentException("Qlen must >= 3");
    }

    public final boolean equals(int[] iArr, int i) {
        if (i == this.mQuadLen) {
            int i2 = 0;
            while (i2 < i) {
                if (iArr[i2] == this.mQuads[i2]) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }
}
