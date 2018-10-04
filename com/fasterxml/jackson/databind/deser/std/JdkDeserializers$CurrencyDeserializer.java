package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.Currency;

public class JdkDeserializers$CurrencyDeserializer extends FromStringDeserializer {
    public static final JdkDeserializers$CurrencyDeserializer instance = new JdkDeserializers$CurrencyDeserializer();

    public JdkDeserializers$CurrencyDeserializer() {
        super(Currency.class);
    }

    public Currency _deserialize(String str, DeserializationContext deserializationContext) {
        return Currency.getInstance(str);
    }
}
