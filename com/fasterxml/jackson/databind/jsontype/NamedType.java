package com.fasterxml.jackson.databind.jsontype;

import java.io.Serializable;

public final class NamedType implements Serializable {
    private static final long serialVersionUID = 1;
    public final Class _class;
    public final int _hashCode;
    public String _name;

    public NamedType(Class cls) {
        this(cls, null);
    }

    public NamedType(Class cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode();
        setName(str);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    if (this._class != ((NamedType) obj)._class) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public String getName() {
        return this._name;
    }

    public Class getType() {
        return this._class;
    }

    public boolean hasName() {
        return this._name != null;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public void setName(String str) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        this._name = str;
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[NamedType, class ");
        stringBuilder.append(this._class.getName());
        stringBuilder.append(", name: ");
        if (this._name == null) {
            str = "null";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("'");
            stringBuilder2.append(this._name);
            stringBuilder2.append("'");
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
