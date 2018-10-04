package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1LG */
public final class AnonymousClass1LG {
    /* renamed from: B */
    public static boolean m10816B(AnonymousClass29M anonymousClass29M, String str, JsonParser jsonParser) {
        if ("code".equals(str)) {
            anonymousClass29M.f26708B = jsonParser.getValueAsInt();
            return true;
        }
        String str2 = null;
        if ("summary".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass29M.f26715I = str2;
            return true;
        } else if ("description".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass29M.f26710D = str2;
            return true;
        } else if ("is_silent".equals(str)) {
            anonymousClass29M.f26711E = jsonParser.getValueAsBoolean();
            return true;
        } else if ("is_transient".equals(str)) {
            anonymousClass29M.f26712F = jsonParser.getValueAsBoolean();
            return true;
        } else if ("requires_reauth".equals(str)) {
            anonymousClass29M.f26714H = jsonParser.getValueAsBoolean();
            return true;
        } else if ("debug_info".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass29M.f26709C = str2;
            return true;
        } else if (!"query_path".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass29M.f26713G = str2;
            return true;
        }
    }

    public static AnonymousClass29M parseFromJson(JsonParser jsonParser) {
        AnonymousClass29M anonymousClass29M = new AnonymousClass29M();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1LG.m10816B(anonymousClass29M, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass29M;
    }
}
