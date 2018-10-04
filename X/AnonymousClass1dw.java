package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1dw */
public final class AnonymousClass1dw {
    /* renamed from: B */
    public static boolean m12261B(AnonymousClass1dx anonymousClass1dx, String str, JsonParser jsonParser) {
        if ("num_columns".equals(str)) {
            anonymousClass1dx.f20805D = jsonParser.getValueAsInt();
            return true;
        } else if ("total_num_columns".equals(str)) {
            anonymousClass1dx.f20808G = jsonParser.getValueAsInt();
            return true;
        } else if ("aspect_ratio".equals(str)) {
            anonymousClass1dx.f20803B = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("autoplay".equals(str)) {
            anonymousClass1dx.f20804C = jsonParser.getValueAsBoolean();
            return true;
        } else if ("social_context".equals(str)) {
            anonymousClass1dx.f20806E = AnonymousClass3JG.parseFromJson(jsonParser);
            return true;
        } else if (!"tv_guide".equals(str)) {
            return false;
        } else {
            anonymousClass1dx.f20807F = AnonymousClass11p.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass1dx parseFromJson(JsonParser jsonParser) {
        AnonymousClass1dx anonymousClass1dx = new AnonymousClass1dx();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1dw.m12261B(anonymousClass1dx, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1dx;
    }
}
