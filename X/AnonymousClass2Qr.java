package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Qr */
public final class AnonymousClass2Qr {
    /* renamed from: B */
    public static boolean m15703B(AnonymousClass1uS anonymousClass1uS, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("segmentPath".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1uS.f24005C = str2;
            return true;
        } else if ("mimeType".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1uS.f24004B = str2;
            return true;
        } else if ("segmentType".equals(str)) {
            anonymousClass1uS.f24006D = jsonParser.getValueAsInt();
            return true;
        } else if (!"startOffset".equals(str)) {
            return false;
        } else {
            anonymousClass1uS.f24007E = jsonParser.getValueAsLong();
            return true;
        }
    }

    /* renamed from: C */
    public static void m15704C(JsonGenerator jsonGenerator, AnonymousClass1uS anonymousClass1uS, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass1uS.f24005C != null) {
            jsonGenerator.writeStringField("segmentPath", anonymousClass1uS.f24005C);
        }
        if (anonymousClass1uS.f24004B != null) {
            jsonGenerator.writeStringField("mimeType", anonymousClass1uS.f24004B);
        }
        jsonGenerator.writeNumberField("segmentType", anonymousClass1uS.f24006D);
        jsonGenerator.writeNumberField("startOffset", anonymousClass1uS.f24007E);
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass1uS parseFromJson(JsonParser jsonParser) {
        AnonymousClass1uS anonymousClass1uS = new AnonymousClass1uS();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Qr.m15703B(anonymousClass1uS, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1uS;
    }
}
