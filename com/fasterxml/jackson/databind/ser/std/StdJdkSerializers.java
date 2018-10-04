package com.fasterxml.jackson.databind.ser.std;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public class StdJdkSerializers {
    public static Collection all() {
        HashMap hashMap = new HashMap();
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        hashMap.put(URL.class, toStringSerializer);
        hashMap.put(URI.class, toStringSerializer);
        hashMap.put(Currency.class, toStringSerializer);
        hashMap.put(UUID.class, toStringSerializer);
        hashMap.put(Pattern.class, toStringSerializer);
        Class cls = Locale.class;
        hashMap.put(cls, toStringSerializer);
        hashMap.put(cls, toStringSerializer);
        hashMap.put(AtomicReference.class, StdJdkSerializers$AtomicReferenceSerializer.class);
        hashMap.put(AtomicBoolean.class, StdJdkSerializers$AtomicBooleanSerializer.class);
        hashMap.put(AtomicInteger.class, StdJdkSerializers$AtomicIntegerSerializer.class);
        hashMap.put(AtomicLong.class, StdJdkSerializers$AtomicLongSerializer.class);
        hashMap.put(File.class, StdJdkSerializers$FileSerializer.class);
        hashMap.put(Class.class, StdJdkSerializers$ClassSerializer.class);
        hashMap.put(Void.TYPE, NullSerializer.class);
        return hashMap.entrySet();
    }
}
