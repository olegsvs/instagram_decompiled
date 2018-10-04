package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.36s */
public final class AnonymousClass36s {
    /* renamed from: B */
    public static boolean m18565B(AnonymousClass36r anonymousClass36r, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass36r.f37944C = str2;
            return true;
        } else if (!"asset_url".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass36r.f37943B = str2;
            return true;
        }
    }

    /* renamed from: C */
    public static void m18566C(JsonGenerator jsonGenerator, AnonymousClass36r anonymousClass36r, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass36r.f37944C != null) {
            jsonGenerator.writeStringField("id", anonymousClass36r.f37944C);
        }
        if (anonymousClass36r.f37943B != null) {
            jsonGenerator.writeStringField("asset_url", anonymousClass36r.f37943B);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass36r parseFromJson(JsonParser jsonParser) {
        AnonymousClass36r anonymousClass36r = new AnonymousClass36r();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass36s.m18565B(anonymousClass36r, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass36r;
    }
}
