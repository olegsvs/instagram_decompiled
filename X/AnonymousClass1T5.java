package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1T5 */
public final class AnonymousClass1T5 {
    public static AnonymousClass0Z2 parseFromJson(JsonParser jsonParser) {
        AnonymousClass0WG anonymousClass0Z2 = new AnonymousClass0Z2();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0Z3.m5331B(anonymousClass0Z2, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0Z2;
    }
}
