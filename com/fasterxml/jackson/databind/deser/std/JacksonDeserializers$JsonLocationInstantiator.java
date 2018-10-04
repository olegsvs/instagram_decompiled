package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

public class JacksonDeserializers$JsonLocationInstantiator extends ValueInstantiator {
    public static final JacksonDeserializers$JsonLocationInstantiator instance = new JacksonDeserializers$JsonLocationInstantiator();

    public boolean canCreateFromObjectWith() {
        return true;
    }

    private static final int _int(Object obj) {
        return obj == null ? null : ((Number) obj).intValue();
    }

    private static final long _long(Object obj) {
        return obj == null ? 0 : ((Number) obj).longValue();
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        return new JsonLocation(objArr[0], _long(objArr[1]), _long(objArr[2]), _int(objArr[3]), _int(objArr[4]));
    }

    private static CreatorProperty creatorProp(String str, JavaType javaType, int i) {
        return new CreatorProperty(str, javaType, null, null, null, null, i, null, true);
    }

    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        JavaType constructType = deserializationConfig.constructType(Integer.TYPE);
        JavaType constructType2 = deserializationConfig.constructType(Long.TYPE);
        return (SettableBeanProperty[]) new CreatorProperty[]{creatorProp("sourceRef", deserializationConfig.constructType(Object.class), 0), creatorProp("byteOffset", constructType2, 1), creatorProp("charOffset", constructType2, 2), creatorProp("lineNr", constructType, 3), creatorProp("columnNr", constructType, 4)};
    }

    public String getValueTypeDesc() {
        return JsonLocation.class.getName();
    }
}
