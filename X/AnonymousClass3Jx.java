package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3Jx */
public final class AnonymousClass3Jx {
    /* renamed from: B */
    public static boolean m19383B(AnonymousClass3Jw anonymousClass3Jw, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("remote_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3Jw.f40128F = str2;
            return true;
        } else if ("file_path".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3Jw.f40124B = str2;
            return true;
        } else if ("release_number".equals(str)) {
            anonymousClass3Jw.f40127E = jsonParser.getValueAsInt();
            return true;
        } else if ("file_size".equals(str)) {
            anonymousClass3Jw.f40125C = jsonParser.getValueAsLong();
            return true;
        } else if (!"release_notes".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3Jw.f40126D = str2;
            return true;
        }
    }

    public static AnonymousClass3Jw parseFromJson(JsonParser jsonParser) {
        AnonymousClass3Jw anonymousClass3Jw = new AnonymousClass3Jw();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3Jx.m19383B(anonymousClass3Jw, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3Jw;
    }

    public static AnonymousClass3Jw parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass3Jx.parseFromJson(createParser);
    }
}
