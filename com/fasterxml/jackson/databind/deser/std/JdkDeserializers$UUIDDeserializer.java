package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.UUID;

public class JdkDeserializers$UUIDDeserializer extends FromStringDeserializer {
    public static final JdkDeserializers$UUIDDeserializer instance = new JdkDeserializers$UUIDDeserializer();

    public JdkDeserializers$UUIDDeserializer() {
        super(UUID.class);
    }

    public UUID _deserialize(String str, DeserializationContext deserializationContext) {
        return UUID.fromString(str);
    }

    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr.length != 16) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can only construct UUIDs from 16 byte arrays; got ");
                stringBuilder.append(bArr.length);
                stringBuilder.append(" bytes");
                deserializationContext.mappingException(stringBuilder.toString());
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            return new UUID(dataInputStream.readLong(), dataInputStream.readLong());
        }
        super._deserializeEmbedded(obj, deserializationContext);
        return null;
    }
}
