package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.11u */
public final class AnonymousClass11u {
    /* renamed from: B */
    public static boolean m8832B(AnonymousClass0X2 anonymousClass0X2, String str, JsonParser jsonParser) {
        if (!"candidates".equals(str)) {
            return false;
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass0Ls parseFromJson = AnonymousClass0Lr.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass0X2.f6093B = list;
        return true;
    }

    /* renamed from: C */
    public static void m8833C(JsonGenerator jsonGenerator, AnonymousClass0X2 anonymousClass0X2, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass0X2.f6093B != null) {
            jsonGenerator.writeFieldName("candidates");
            jsonGenerator.writeStartArray();
            for (AnonymousClass0Ls anonymousClass0Ls : anonymousClass0X2.f6093B) {
                if (anonymousClass0Ls != null) {
                    AnonymousClass0Lr.m3034C(jsonGenerator, anonymousClass0Ls, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass0X2 parseFromJson(JsonParser jsonParser) {
        AnonymousClass0X2 anonymousClass0X2 = new AnonymousClass0X2();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass11u.m8832B(anonymousClass0X2, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0X2;
    }
}
