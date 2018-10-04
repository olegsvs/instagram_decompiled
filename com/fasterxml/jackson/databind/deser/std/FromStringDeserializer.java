package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;

public abstract class FromStringDeserializer extends StdScalarDeserializer {
    private static final long serialVersionUID = 1;

    public abstract Object _deserialize(String str, DeserializationContext deserializationContext);

    public FromStringDeserializer(Class cls) {
        super(cls);
    }

    public Object _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Don't know how to convert embedded Object of type ");
        stringBuilder.append(obj.getClass().getName());
        stringBuilder.append(" into ");
        stringBuilder.append(this._valueClass.getName());
        throw deserializationContext.mappingException(stringBuilder.toString());
    }

    public final java.lang.Object deserialize(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r1 = r5.getValueAsString();
        r3 = 0;
        if (r1 == 0) goto L_0x0029;
    L_0x0007:
        r0 = r1.length();
        if (r0 == 0) goto L_0x0028;
    L_0x000d:
        r2 = r1.trim();
        r0 = r2.length();
        if (r0 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0028;
    L_0x0018:
        r0 = r4._deserialize(r2, r6);	 Catch:{ IllegalArgumentException -> 0x001f }
        if (r0 == 0) goto L_0x001f;	 Catch:{ IllegalArgumentException -> 0x001f }
    L_0x001e:
        return r0;	 Catch:{ IllegalArgumentException -> 0x001f }
    L_0x001f:
        r1 = r4._valueClass;
        r0 = "not a valid textual representation";
        r0 = r6.weirdStringException(r2, r1, r0);
        throw r0;
    L_0x0028:
        return r3;
    L_0x0029:
        r1 = r5.getCurrentToken();
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT;
        if (r1 != r0) goto L_0x004a;
    L_0x0031:
        r2 = r5.getEmbeddedObject();
        if (r2 != 0) goto L_0x0038;
    L_0x0037:
        goto L_0x0028;
    L_0x0038:
        r1 = r4._valueClass;
        r0 = r2.getClass();
        r0 = r1.isAssignableFrom(r0);
        if (r0 == 0) goto L_0x0045;
    L_0x0044:
        return r2;
    L_0x0045:
        r0 = r4._deserializeEmbedded(r2, r6);
        return r0;
    L_0x004a:
        r0 = r4._valueClass;
        r0 = r6.mappingException(r0);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Object");
    }
}
