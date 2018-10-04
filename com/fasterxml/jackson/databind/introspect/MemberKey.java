package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class MemberKey {
    public static final Class[] NO_CLASSES = new Class[0];
    public final Class[] _argTypes;
    public final String _name;

    public MemberKey(String str, Class[] clsArr) {
        this._name = str;
        if (clsArr == null) {
            clsArr = NO_CLASSES;
        }
        this._argTypes = clsArr;
    }

    public MemberKey(Constructor constructor) {
        this(JsonProperty.USE_DEFAULT_NAME, constructor.getParameterTypes());
    }

    public MemberKey(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    MemberKey memberKey = (MemberKey) obj;
                    if (this._name.equals(memberKey._name)) {
                        Class[] clsArr = memberKey._argTypes;
                        int length = this._argTypes.length;
                        if (clsArr.length == length) {
                            for (int i = 0; i < length; i++) {
                                Class cls = clsArr[i];
                                Class cls2 = this._argTypes[i];
                                if (cls != cls2) {
                                    if (!(cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls))) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this._name.hashCode() + this._argTypes.length;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this._name);
        stringBuilder.append("(");
        stringBuilder.append(this._argTypes.length);
        stringBuilder.append("-args)");
        return stringBuilder.toString();
    }
}
