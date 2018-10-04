package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.File;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class JdkDeserializers {
    private static final HashSet _classNames = new HashSet();

    static {
        r4 = new Class[12];
        int i = 0;
        r4[0] = UUID.class;
        r4[1] = URL.class;
        r4[2] = URI.class;
        r4[3] = File.class;
        r4[4] = Currency.class;
        r4[5] = Pattern.class;
        r4[6] = Locale.class;
        r4[7] = InetAddress.class;
        r4[8] = Charset.class;
        r4[9] = AtomicBoolean.class;
        r4[10] = Class.class;
        r4[11] = StackTraceElement.class;
        int length = r4.length;
        while (i < length) {
            _classNames.add(r4[i].getName());
            i++;
        }
    }

    public static StdDeserializer[] all() {
        return new StdDeserializer[]{JdkDeserializers$UUIDDeserializer.instance, JdkDeserializers$URLDeserializer.instance, JdkDeserializers$URIDeserializer.instance, JdkDeserializers$FileDeserializer.instance, JdkDeserializers$CurrencyDeserializer.instance, JdkDeserializers$PatternDeserializer.instance, JdkDeserializers$LocaleDeserializer.instance, JdkDeserializers$InetAddressDeserializer.instance, JdkDeserializers$CharsetDeserializer.instance, JdkDeserializers$AtomicBooleanDeserializer.instance, ClassDeserializer.instance, JdkDeserializers$StackTraceElementDeserializer.instance};
    }

    public static JsonDeserializer find(Class cls, String str) {
        if (!_classNames.contains(str)) {
            return null;
        }
        if (cls == URI.class) {
            return JdkDeserializers$URIDeserializer.instance;
        }
        if (cls == URL.class) {
            return JdkDeserializers$URLDeserializer.instance;
        }
        if (cls == File.class) {
            return JdkDeserializers$FileDeserializer.instance;
        }
        if (cls == UUID.class) {
            return JdkDeserializers$UUIDDeserializer.instance;
        }
        if (cls == Currency.class) {
            return JdkDeserializers$CurrencyDeserializer.instance;
        }
        if (cls == Pattern.class) {
            return JdkDeserializers$PatternDeserializer.instance;
        }
        if (cls == Locale.class) {
            return JdkDeserializers$LocaleDeserializer.instance;
        }
        if (cls == InetAddress.class) {
            return JdkDeserializers$InetAddressDeserializer.instance;
        }
        if (cls == Charset.class) {
            return JdkDeserializers$CharsetDeserializer.instance;
        }
        if (cls == Class.class) {
            return ClassDeserializer.instance;
        }
        if (cls == StackTraceElement.class) {
            return JdkDeserializers$StackTraceElementDeserializer.instance;
        }
        if (cls == AtomicBoolean.class) {
            return JdkDeserializers$AtomicBooleanDeserializer.instance;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Internal error: can't find deserializer for ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
