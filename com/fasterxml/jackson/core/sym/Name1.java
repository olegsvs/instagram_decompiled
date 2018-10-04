package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class Name1 extends Name {
    public static final Name1 sEmptyName = new Name1(JsonProperty.USE_DEFAULT_NAME, 0, 0);
    public final int mQuad;

    public Name1(String str, int i, int i2) {
        super(str, i);
        this.mQuad = i2;
    }

    public final boolean equals(int i) {
        return i == this.mQuad;
    }

    public final boolean equals(int i, int i2) {
        return i == this.mQuad && i2 == 0;
    }

    public final boolean equals(int[] iArr, int i) {
        return i == 1 && iArr[0] == this.mQuad;
    }

    public static Name1 getEmptyName() {
        return sEmptyName;
    }
}
