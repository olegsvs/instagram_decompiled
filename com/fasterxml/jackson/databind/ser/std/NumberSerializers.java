package com.fasterxml.jackson.databind.ser.std;

import java.util.Map;

public class NumberSerializers {
    public static void addAll(Map map) {
        NumberSerializers$IntegerSerializer numberSerializers$IntegerSerializer = new NumberSerializers$IntegerSerializer();
        map.put(Integer.class.getName(), numberSerializers$IntegerSerializer);
        map.put(Integer.TYPE.getName(), numberSerializers$IntegerSerializer);
        String name = Long.class.getName();
        NumberSerializers$LongSerializer numberSerializers$LongSerializer = NumberSerializers$LongSerializer.instance;
        map.put(name, numberSerializers$LongSerializer);
        map.put(Long.TYPE.getName(), numberSerializers$LongSerializer);
        name = Byte.class.getName();
        NumberSerializers$IntLikeSerializer numberSerializers$IntLikeSerializer = NumberSerializers$IntLikeSerializer.instance;
        map.put(name, numberSerializers$IntLikeSerializer);
        map.put(Byte.TYPE.getName(), numberSerializers$IntLikeSerializer);
        name = Short.class.getName();
        NumberSerializers$ShortSerializer numberSerializers$ShortSerializer = NumberSerializers$ShortSerializer.instance;
        map.put(name, numberSerializers$ShortSerializer);
        map.put(Short.TYPE.getName(), numberSerializers$ShortSerializer);
        name = Float.class.getName();
        NumberSerializers$FloatSerializer numberSerializers$FloatSerializer = NumberSerializers$FloatSerializer.instance;
        map.put(name, numberSerializers$FloatSerializer);
        map.put(Float.TYPE.getName(), numberSerializers$FloatSerializer);
        name = Double.class.getName();
        NumberSerializers$DoubleSerializer numberSerializers$DoubleSerializer = NumberSerializers$DoubleSerializer.instance;
        map.put(name, numberSerializers$DoubleSerializer);
        map.put(Double.TYPE.getName(), numberSerializers$DoubleSerializer);
    }
}
