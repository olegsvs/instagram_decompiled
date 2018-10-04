package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1WD */
public final class AnonymousClass1WD {
    public static AnonymousClass0rZ parseFromJson(JsonParser jsonParser) {
        AnonymousClass0rY anonymousClass0rZ = new AnonymousClass0rZ();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1b0.m11960B(anonymousClass0rZ, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0rZ;
    }
}
