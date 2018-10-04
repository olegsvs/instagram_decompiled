package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2X5 */
public final class AnonymousClass2X5 {
    /* renamed from: B */
    public static boolean m16201B(AnonymousClass2X3 anonymousClass2X3, String str, JsonParser jsonParser) {
        if ("client_mutation_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if (!"boosted_component".equals(str)) {
            return false;
        } else {
            AnonymousClass2X4.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass2X3 parseFromJson(JsonParser jsonParser) {
        AnonymousClass2X3 anonymousClass2X3 = new AnonymousClass2X3();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2X5.m16201B(anonymousClass2X3, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2X3;
    }
}
