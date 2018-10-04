package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;

public class RootNameLookup implements Serializable {
    private static final long serialVersionUID = 1;
    public LRUMap _rootNames;

    public SerializedString findRootName(JavaType javaType, MapperConfig mapperConfig) {
        return findRootName(javaType.getRawClass(), mapperConfig);
    }

    public synchronized SerializedString findRootName(Class cls, MapperConfig mapperConfig) {
        String simpleName;
        SerializedString serializedString;
        ClassKey classKey = new ClassKey(cls);
        if (this._rootNames == null) {
            this._rootNames = new LRUMap(20, 200);
        } else {
            SerializedString serializedString2 = (SerializedString) this._rootNames.get(classKey);
            if (serializedString2 != null) {
                return serializedString2;
            }
        }
        PropertyName findRootName = mapperConfig.getAnnotationIntrospector().findRootName(mapperConfig.introspectClassAnnotations(cls).getClassInfo());
        if (findRootName != null) {
            if (findRootName.hasSimpleName()) {
                simpleName = findRootName.getSimpleName();
                serializedString = new SerializedString(simpleName);
                this._rootNames.put(classKey, serializedString);
                return serializedString;
            }
        }
        simpleName = cls.getSimpleName();
        serializedString = new SerializedString(simpleName);
        this._rootNames.put(classKey, serializedString);
        return serializedString;
    }
}
