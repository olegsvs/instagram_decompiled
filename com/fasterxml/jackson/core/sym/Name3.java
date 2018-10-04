package com.fasterxml.jackson.core.sym;

public final class Name3 extends Name {
    public final int mQuad1;
    public final int mQuad2;
    public final int mQuad3;

    public final boolean equals(int i) {
        return false;
    }

    public final boolean equals(int i, int i2) {
        return false;
    }

    public Name3(String str, int i, int i2, int i3, int i4) {
        super(str, i);
        this.mQuad1 = i2;
        this.mQuad2 = i3;
        this.mQuad3 = i4;
    }

    public final boolean equals(int[] iArr, int i) {
        return i == 3 && iArr[0] == this.mQuad1 && iArr[1] == this.mQuad2 && iArr[2] == this.mQuad3;
    }
}
