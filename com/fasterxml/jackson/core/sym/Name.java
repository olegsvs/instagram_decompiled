package com.fasterxml.jackson.core.sym;

public abstract class Name {
    public final int _hashCode;
    public final String _name;

    public abstract boolean equals(int i);

    public abstract boolean equals(int i, int i2);

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public abstract boolean equals(int[] iArr, int i);

    public Name(String str, int i) {
        this._name = str;
        this._hashCode = i;
    }

    public final String getName() {
        return this._name;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public final String toString() {
        return this._name;
    }
}
