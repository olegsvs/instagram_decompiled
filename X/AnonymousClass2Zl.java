package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Zl */
public final class AnonymousClass2Zl {
    /* renamed from: B */
    public static boolean m16295B(AnonymousClass2Cr anonymousClass2Cr, String str, JsonParser jsonParser) {
        if (!"lynx_url".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass2Cr, str, jsonParser);
        }
        anonymousClass2Cr.f27476B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass2Cr parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Cr anonymousClass2Cr = new AnonymousClass2Cr();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Zl.m16295B(anonymousClass2Cr, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Cr;
    }
}
