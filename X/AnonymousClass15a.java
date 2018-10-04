package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.15a */
public final class AnonymousClass15a {
    /* renamed from: B */
    public static boolean m9322B(AnonymousClass0n7 anonymousClass0n7, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("channel_pk".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0n7.f10004B = str2;
            return true;
        } else if (!"id".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0n7.f10005C = str2;
            return true;
        }
    }

    public static AnonymousClass0n7 parseFromJson(JsonParser jsonParser) {
        AnonymousClass0n7 anonymousClass0n7 = new AnonymousClass0n7();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass15a.m9322B(anonymousClass0n7, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0n7;
    }
}
