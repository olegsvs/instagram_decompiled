package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.HashMap;

public class StdArraySerializers {
    public static final HashMap _arraySerializers;

    static {
        HashMap hashMap = new HashMap();
        _arraySerializers = hashMap;
        hashMap.put(boolean[].class.getName(), new StdArraySerializers$BooleanArraySerializer());
        hashMap = _arraySerializers;
        hashMap.put(byte[].class.getName(), new StdArraySerializers$ByteArraySerializer());
        hashMap.put(char[].class.getName(), new StdArraySerializers$CharArraySerializer());
        hashMap.put(short[].class.getName(), new StdArraySerializers$ShortArraySerializer());
        hashMap.put(int[].class.getName(), new StdArraySerializers$IntArraySerializer());
        hashMap.put(long[].class.getName(), new StdArraySerializers$LongArraySerializer());
        hashMap.put(float[].class.getName(), new StdArraySerializers$FloatArraySerializer());
        hashMap.put(double[].class.getName(), new StdArraySerializers$DoubleArraySerializer());
    }

    public static JsonSerializer findStandardImpl(Class cls) {
        return (JsonSerializer) _arraySerializers.get(cls.getName());
    }
}
