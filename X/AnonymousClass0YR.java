package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.0YR */
public final class AnonymousClass0YR {
    /* renamed from: B */
    public static boolean m5297B(AnonymousClass0YQ anonymousClass0YQ, String str, JsonParser jsonParser) {
        if ("text".equals(str)) {
            anonymousClass0YQ.f6266C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        } else if ("broadcast".equals(str)) {
            anonymousClass0YQ.f6265B = AnonymousClass19k.parseFromJson(jsonParser);
            return true;
        } else if (!"video_offset".equals(str)) {
            return false;
        } else {
            anonymousClass0YQ.f6267D = jsonParser.getValueAsInt();
            return true;
        }
    }

    /* renamed from: C */
    public static void m5298C(JsonGenerator jsonGenerator, AnonymousClass0YQ anonymousClass0YQ, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass0YQ.f6266C != null) {
            jsonGenerator.writeStringField("text", anonymousClass0YQ.f6266C);
        }
        if (anonymousClass0YQ.f6265B != null) {
            jsonGenerator.writeFieldName("broadcast");
            AnonymousClass19k.m9698C(jsonGenerator, anonymousClass0YQ.f6265B, true);
        }
        jsonGenerator.writeNumberField("video_offset", anonymousClass0YQ.f6267D);
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass0YQ parseFromJson(JsonParser jsonParser) {
        AnonymousClass0YQ anonymousClass0YQ = new AnonymousClass0YQ();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0YR.m5297B(anonymousClass0YQ, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0YQ;
    }
}
