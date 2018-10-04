package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.net.InetAddress;

public class InetAddressSerializer extends StdScalarSerializer {
    public static final InetAddressSerializer instance = new InetAddressSerializer();

    public InetAddressSerializer() {
        super(InetAddress.class);
    }

    public void serialize(InetAddress inetAddress, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        inetAddress = inetAddress.toString().trim();
        int indexOf = inetAddress.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                inetAddress = inetAddress.substring(1);
            } else {
                inetAddress = inetAddress.substring(0, indexOf);
            }
        }
        jsonGenerator.writeString(inetAddress);
    }

    public void serializeWithType(InetAddress inetAddress, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForScalar(inetAddress, jsonGenerator, InetAddress.class);
        serialize(inetAddress, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForScalar(inetAddress, jsonGenerator);
    }
}
