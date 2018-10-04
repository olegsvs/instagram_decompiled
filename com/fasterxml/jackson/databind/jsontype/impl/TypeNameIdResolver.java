package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.Collection;
import java.util.HashMap;

public class TypeNameIdResolver extends TypeIdResolverBase {
    public final MapperConfig _config;
    public final HashMap _idToType;
    public final HashMap _typeToId;

    public TypeNameIdResolver(MapperConfig mapperConfig, JavaType javaType, HashMap hashMap, HashMap hashMap2) {
        super(javaType, mapperConfig.getTypeFactory());
        this._config = mapperConfig;
        this._typeToId = hashMap;
        this._idToType = hashMap2;
    }

    public static String _defaultTypeId(Class cls) {
        cls = cls.getName();
        int lastIndexOf = cls.lastIndexOf(46);
        return lastIndexOf < 0 ? cls : cls.substring(lastIndexOf + 1);
    }

    public static TypeNameIdResolver construct(MapperConfig mapperConfig, JavaType javaType, Collection collection, boolean z, boolean z2) {
        if (z != z2) {
            HashMap hashMap = null;
            HashMap hashMap2 = z ? new HashMap() : null;
            if (z2) {
                hashMap = new HashMap();
            }
            if (collection != null) {
                for (NamedType namedType : collection) {
                    Class type = namedType.getType();
                    Object name = namedType.hasName() ? namedType.getName() : _defaultTypeId(type);
                    if (z) {
                        hashMap2.put(type.getName(), name);
                    }
                    if (z2) {
                        JavaType javaType2 = (JavaType) hashMap.get(name);
                        if (javaType2 == null || !type.isAssignableFrom(javaType2.getRawClass())) {
                            hashMap.put(name, mapperConfig.constructType(type));
                        }
                    }
                }
            }
            return new TypeNameIdResolver(mapperConfig, javaType, hashMap2, hashMap);
        }
        throw new IllegalArgumentException();
    }

    public Id getMechanism() {
        return Id.NAME;
    }

    public String idFromValue(Object obj) {
        String str;
        Class cls = obj.getClass();
        String name = cls.getName();
        synchronized (this._typeToId) {
            str = (String) this._typeToId.get(name);
            if (str == null) {
                if (this._config.isAnnotationProcessingEnabled()) {
                    str = this._config.getAnnotationIntrospector().findTypeName(this._config.introspectClassAnnotations(cls).getClassInfo());
                }
                if (str == null) {
                    str = _defaultTypeId(cls);
                }
                this._typeToId.put(name, str);
            }
        }
        return str;
    }

    public String idFromValueAndType(Object obj, Class cls) {
        return obj == null ? null : idFromValue(obj);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(getClass().getName());
        stringBuilder.append("; id-to-type=");
        stringBuilder.append(this._idToType);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public JavaType typeFromId(String str) {
        return (JavaType) this._idToType.get(str);
    }
}
