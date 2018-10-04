package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.18b */
public final class AnonymousClass18b {
    /* renamed from: B */
    public static boolean m9629B(AnonymousClass0R2 anonymousClass0R2, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("t".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4578P = str2;
            return true;
        } else if ("m".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4570H = str2;
            return true;
        } else if ("tt".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4577O = str2;
            return true;
        } else if ("ig".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4566D = str2;
            return true;
        } else if ("collapse_key".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4565C = str2;
            return true;
        } else if ("i".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4572J = str2;
            return true;
        } else if ("a".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4571I = str2;
            return true;
        } else if ("sound".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4575M = str2;
            return true;
        } else if ("pi".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4574L = str2;
            return true;
        } else if ("c".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4573K = str2;
            return true;
        } else if ("u".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4569G = str2;
            return true;
        } else if ("s".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4576N = str2;
            return true;
        } else if ("igo".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4567E = str2;
            return true;
        } else if ("bc".equals(str)) {
            anonymousClass0R2.f4564B = AnonymousClass18c.parseFromJson(jsonParser.getText());
            return true;
        } else if (!"ia".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0R2.f4568F = str2;
            return true;
        }
    }

    public static AnonymousClass0R2 parseFromJson(JsonParser jsonParser) {
        AnonymousClass0R2 anonymousClass0R2 = new AnonymousClass0R2();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass18b.m9629B(anonymousClass0R2, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0R2;
    }

    public static AnonymousClass0R2 parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass18b.parseFromJson(createParser);
    }
}
