package com.fasterxml.jackson.databind;

import java.io.Serializable;

public class PropertyName implements Serializable {
    public static final PropertyName NO_NAME = new PropertyName(new String(_NO_NAME), null);
    public static final PropertyName USE_DEFAULT = new PropertyName("", null);
    private static final String _NO_NAME = "#disabled";
    private static final String _USE_DEFAULT = "";
    private static final long serialVersionUID = 7930806520033045126L;
    public final String _namespace;
    public final String _simpleName;

    public PropertyName(String str) {
        this(str, null);
    }

    public PropertyName(String str, String str2) {
        if (str == null) {
            str = "";
        }
        this._simpleName = str;
        this._namespace = str2;
    }

    public static PropertyName construct(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null && str.length() == 0) {
            return USE_DEFAULT;
        }
        return new PropertyName(str, str2);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    PropertyName propertyName = (PropertyName) obj;
                    String str = this._simpleName;
                    if (str == null) {
                        if (propertyName._simpleName != null) {
                        }
                    } else if (!str.equals(propertyName._simpleName)) {
                    }
                    str = this._namespace;
                    if (str != null) {
                        return str.equals(propertyName._namespace);
                    }
                    if (propertyName._namespace != null) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public String getNamespace() {
        return this._namespace;
    }

    public String getSimpleName() {
        return this._simpleName;
    }

    public boolean hasNamespace() {
        return this._namespace != null;
    }

    public boolean hasSimpleName() {
        return this._simpleName.length() > 0;
    }

    public int hashCode() {
        String str = this._namespace;
        if (str == null) {
            return this._simpleName.hashCode();
        }
        return str.hashCode() ^ this._simpleName.hashCode();
    }

    public Object readResolve() {
        String str = this._simpleName;
        if (str != null) {
            if (!"".equals(str)) {
                return this._simpleName.equals(_NO_NAME) ? NO_NAME : this;
            }
        }
        return USE_DEFAULT;
    }

    public String toString() {
        if (this._namespace == null) {
            return this._simpleName;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        stringBuilder.append(this._namespace);
        stringBuilder.append("}");
        stringBuilder.append(this._simpleName);
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.PropertyName withNamespace(java.lang.String r3) {
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0007;
    L_0x0002:
        r0 = r2._namespace;
        if (r0 != 0) goto L_0x0010;
    L_0x0006:
        return r2;
    L_0x0007:
        r0 = r2._namespace;
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0006;
    L_0x0010:
        r1 = new com.fasterxml.jackson.databind.PropertyName;
        r0 = r2._simpleName;
        r1.<init>(r0, r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.PropertyName.withNamespace(java.lang.String):com.fasterxml.jackson.databind.PropertyName");
    }

    public PropertyName withSimpleName(String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(this._simpleName)) {
            return this;
        }
        return new PropertyName(str, this._namespace);
    }
}
