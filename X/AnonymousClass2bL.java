package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2bL */
public final class AnonymousClass2bL {
    /* renamed from: B */
    public static boolean m16408B(AnonymousClass2FX anonymousClass2FX, String str, JsonParser jsonParser) {
        if ("header".equals(str)) {
            anonymousClass2FX.f28055C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        } else if ("iterations".equals(str)) {
            anonymousClass2FX.f28056D = jsonParser.getValueAsInt();
            return true;
        } else if ("shift".equals(str)) {
            anonymousClass2FX.f28057E = jsonParser.getValueAsInt();
            return true;
        } else if ("size".equals(str)) {
            anonymousClass2FX.f28058F = jsonParser.getValueAsInt();
            return true;
        } else if (!"edges".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass2FX, str, jsonParser);
        } else {
            anonymousClass2FX.f28054B = jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass2FX parseFromJson(JsonParser jsonParser) {
        AnonymousClass2FX anonymousClass2FX = new AnonymousClass2FX();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2bL.m16408B(anonymousClass2FX, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2FX;
    }
}
