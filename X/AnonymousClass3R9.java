package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3R9 */
public final class AnonymousClass3R9 {
    /* renamed from: B */
    public static boolean m19636B(AnonymousClass3R8 anonymousClass3R8, String str, JsonParser jsonParser) {
        if ("semanitcs".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if (!"ssrcs".equals(str)) {
            return false;
        } else {
            Long.valueOf(jsonParser.getValueAsLong());
            return true;
        }
    }

    public static AnonymousClass3R8 parseFromJson(JsonParser jsonParser) {
        AnonymousClass3R8 anonymousClass3R8 = new AnonymousClass3R8();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3R9.m19636B(anonymousClass3R8, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3R8;
    }
}
