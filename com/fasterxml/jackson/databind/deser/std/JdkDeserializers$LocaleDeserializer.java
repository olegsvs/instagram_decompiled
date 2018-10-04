package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.Locale;

public class JdkDeserializers$LocaleDeserializer extends FromStringDeserializer {
    public static final JdkDeserializers$LocaleDeserializer instance = new JdkDeserializers$LocaleDeserializer();

    public JdkDeserializers$LocaleDeserializer() {
        super(Locale.class);
    }

    public Locale _deserialize(String str, DeserializationContext deserializationContext) {
        int indexOf = str.indexOf(95);
        if (indexOf < 0) {
            return new Locale(str);
        }
        deserializationContext = str.substring(0, indexOf);
        str = str.substring(indexOf + 1);
        indexOf = str.indexOf(95);
        if (indexOf < 0) {
            return new Locale(deserializationContext, str);
        }
        return new Locale(deserializationContext, str.substring(0, indexOf), str.substring(indexOf + 1));
    }
}
