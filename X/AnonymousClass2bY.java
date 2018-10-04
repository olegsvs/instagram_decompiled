package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2bY */
public final class AnonymousClass2bY {
    /* renamed from: B */
    public static boolean m16426B(AnonymousClass2G4 anonymousClass2G4, String str, JsonParser jsonParser) {
        if (!"next_max_id".equals(str)) {
            return false;
        }
        anonymousClass2G4.f28186B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass2G4 parseFromJson(JsonParser jsonParser) {
        AnonymousClass2G4 anonymousClass2G4 = new AnonymousClass2G4();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2bY.m16426B(anonymousClass2G4, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2G4;
    }
}
