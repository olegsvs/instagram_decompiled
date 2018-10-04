package com.fasterxml.jackson.databind.introspect;

public class ObjectIdInfo {
    public final boolean _alwaysAsId;
    public final Class _generator;
    public final String _propertyName;
    public final Class _scope;

    public ObjectIdInfo(String str, Class cls, Class cls2) {
        this(str, cls, cls2, false);
    }

    public ObjectIdInfo(String str, Class cls, Class cls2, boolean z) {
        this._propertyName = str;
        this._scope = cls;
        this._generator = cls2;
        this._alwaysAsId = z;
    }

    public boolean getAlwaysAsId() {
        return this._alwaysAsId;
    }

    public Class getGeneratorType() {
        return this._generator;
    }

    public String getPropertyName() {
        return this._propertyName;
    }

    public Class getScope() {
        return this._scope;
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ObjectIdInfo: propName=");
        stringBuilder.append(this._propertyName);
        stringBuilder.append(", scope=");
        Class cls = this._scope;
        if (cls == null) {
            str = "null";
        } else {
            str = cls.getName();
        }
        stringBuilder.append(str);
        stringBuilder.append(", generatorType=");
        cls = this._generator;
        if (cls == null) {
            str = "null";
        } else {
            str = cls.getName();
        }
        stringBuilder.append(str);
        stringBuilder.append(", alwaysAsId=");
        stringBuilder.append(this._alwaysAsId);
        return stringBuilder.toString();
    }

    public ObjectIdInfo withAlwaysAsId(boolean z) {
        if (this._alwaysAsId == z) {
            return this;
        }
        return new ObjectIdInfo(this._propertyName, this._scope, this._generator, z);
    }
}
