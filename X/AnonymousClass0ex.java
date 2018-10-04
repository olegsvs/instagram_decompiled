package X;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map.Entry;

/* renamed from: X.0ex */
public final class AnonymousClass0ex implements AnonymousClass0eo {
    public final String NMA(Object obj) {
        AnonymousClass1CR anonymousClass1CR = (AnonymousClass1CR) obj;
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartObject();
        if (anonymousClass1CR.f15523B != null) {
            createGenerator.writeFieldName("pending_saves");
            createGenerator.writeStartArray();
            for (AnonymousClass3gm anonymousClass3gm : anonymousClass1CR.f15523B) {
                if (anonymousClass3gm != null) {
                    createGenerator.writeStartObject();
                    createGenerator.writeNumberField("creation_time", anonymousClass3gm.f43321B);
                    if (anonymousClass3gm.f43325F != null) {
                        createGenerator.writeStringField("saved_id", anonymousClass3gm.f43325F);
                    }
                    if (anonymousClass3gm.f43324E != null) {
                        createGenerator.writeStringField("save_intention", anonymousClass3gm.f43324E);
                    }
                    if (anonymousClass3gm.f43323D != null) {
                        createGenerator.writeStringField("radio_type", anonymousClass3gm.f43323D);
                    }
                    if (anonymousClass3gm.f43326G != null) {
                        createGenerator.writeStringField("saved_item_type", anonymousClass3gm.f43326G.name());
                    }
                    if (anonymousClass3gm.f43322C != null) {
                        createGenerator.writeFieldName("params");
                        createGenerator.writeStartObject();
                        for (Entry entry : anonymousClass3gm.f43322C.entrySet()) {
                            createGenerator.writeFieldName(((String) entry.getKey()).toString());
                            if (entry.getValue() == null) {
                                createGenerator.writeNull();
                            } else {
                                createGenerator.writeString((String) entry.getValue());
                            }
                        }
                        createGenerator.writeEndObject();
                    }
                    createGenerator.writeEndObject();
                }
            }
            createGenerator.writeEndArray();
        }
        createGenerator.writeEndObject();
        createGenerator.close();
        return stringWriter.toString();
    }

    public final /* bridge */ /* synthetic */ Object parseFromJson(String str) {
        return AnonymousClass1CQ.parseFromJson(str);
    }
}
