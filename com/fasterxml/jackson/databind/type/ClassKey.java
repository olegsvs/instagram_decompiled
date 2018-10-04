package com.fasterxml.jackson.databind.type;

import java.io.Serializable;

public final class ClassKey implements Comparable, Serializable {
    private static final long serialVersionUID = 1;
    private Class _class;
    private String _className;
    private int _hashCode;

    public ClassKey() {
        this._class = null;
        this._className = null;
        this._hashCode = 0;
    }

    public ClassKey(Class cls) {
        this._class = cls;
        String name = cls.getName();
        this._className = name;
        this._hashCode = name.hashCode();
    }

    public int compareTo(ClassKey classKey) {
        return this._className.compareTo(classKey._className);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    if (((ClassKey) obj)._class != this._class) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public void reset(Class cls) {
        this._class = cls;
        String name = cls.getName();
        this._className = name;
        this._hashCode = name.hashCode();
    }

    public String toString() {
        return this._className;
    }
}
