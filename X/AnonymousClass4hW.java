package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4hW */
public final class AnonymousClass4hW {
    /* renamed from: B */
    public static boolean m24808B(AnonymousClass4hV anonymousClass4hV, String str, JsonParser jsonParser) {
        if (!"lynx_url".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass4hV, str, jsonParser);
        }
        anonymousClass4hV.f56360B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass4hV parseFromJson(JsonParser jsonParser) {
        AnonymousClass4hV anonymousClass4hV = new AnonymousClass4hV();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4hW.m24808B(anonymousClass4hV, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4hV;
    }
}
