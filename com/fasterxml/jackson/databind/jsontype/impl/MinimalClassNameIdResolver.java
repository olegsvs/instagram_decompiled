package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class MinimalClassNameIdResolver extends ClassNameIdResolver {
    public final String _basePackageName;
    public final String _basePackagePrefix;

    public MinimalClassNameIdResolver(JavaType javaType, TypeFactory typeFactory) {
        super(javaType, typeFactory);
        String name = javaType.getRawClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this._basePackageName = JsonProperty.USE_DEFAULT_NAME;
            this._basePackagePrefix = ".";
            return;
        }
        this._basePackagePrefix = name.substring(0, lastIndexOf + 1);
        this._basePackageName = name.substring(0, lastIndexOf);
    }

    public Id getMechanism() {
        return Id.MINIMAL_CLASS;
    }

    public String idFromValue(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this._basePackagePrefix) ? name.substring(this._basePackagePrefix.length() - 1) : name;
    }

    public JavaType typeFromId(String str) {
        if (str.startsWith(".")) {
            StringBuilder stringBuilder = new StringBuilder(str.length() + this._basePackageName.length());
            if (this._basePackageName.length() == 0) {
                stringBuilder.append(str.substring(1));
            } else {
                stringBuilder.append(this._basePackageName);
                stringBuilder.append(str);
            }
            str = stringBuilder.toString();
        }
        return super.typeFromId(str);
    }
}
