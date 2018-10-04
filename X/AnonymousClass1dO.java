package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1dO */
public final class AnonymousClass1dO {
    public static AnonymousClass0YB parseFromJson(JsonParser jsonParser) {
        AnonymousClass0YB anonymousClass0YB = new AnonymousClass0YB();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            jsonParser.getCurrentName();
            jsonParser.nextToken();
            jsonParser.skipChildren();
        }
        return anonymousClass0YB;
    }
}
