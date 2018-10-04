package com.instagram.tagging.model;

import X.AnonymousClass0Lm;
import android.graphics.PointF;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public final class TagSerializer {
    /* renamed from: B */
    public static String m14915B(List list, List list2) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartObject();
        createGenerator.writeArrayFieldStart("in");
        if (list != null) {
            for (Tag C : list) {
                m14916C(C, createGenerator);
            }
        }
        createGenerator.writeEndArray();
        if (!(list2 == null || list2.isEmpty())) {
            createGenerator.writeFieldName("removed");
            createGenerator.writeStartArray();
            for (Tag C2 : list2) {
                createGenerator.writeString(C2.A());
            }
            createGenerator.writeEndArray();
        }
        createGenerator.writeEndObject();
        createGenerator.close();
        return stringWriter.toString();
    }

    /* renamed from: C */
    public static void m14916C(Tag tag, JsonGenerator jsonGenerator) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField(tag.B(), Long.parseLong(tag.A()));
        PointF pointF = tag.f15363B;
        if (pointF != null) {
            jsonGenerator.writeFieldName("position");
            jsonGenerator.writeStartArray();
            jsonGenerator.writeNumber(pointF.x);
            jsonGenerator.writeNumber(pointF.y);
            jsonGenerator.writeEndArray();
        }
        jsonGenerator.writeEndObject();
    }
}
