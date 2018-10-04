package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.net.InetAddress;

public class JdkDeserializers$InetAddressDeserializer extends FromStringDeserializer {
    public static final JdkDeserializers$InetAddressDeserializer instance = new JdkDeserializers$InetAddressDeserializer();

    public JdkDeserializers$InetAddressDeserializer() {
        super(InetAddress.class);
    }

    public InetAddress _deserialize(String str, DeserializationContext deserializationContext) {
        return InetAddress.getByName(str);
    }
}
