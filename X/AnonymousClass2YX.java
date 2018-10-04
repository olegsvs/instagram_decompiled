package X;

import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2YX */
public final class AnonymousClass2YX {
    /* renamed from: B */
    public static boolean m16241B(AnonymousClass2YE anonymousClass2YE, String str, JsonParser jsonParser) {
        if (!TraceFieldType.Uri.equals(str)) {
            return false;
        }
        anonymousClass2YE.f31229B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass2YE parseFromJson(JsonParser jsonParser) {
        AnonymousClass2YE anonymousClass2YE = new AnonymousClass2YE();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2YX.m16241B(anonymousClass2YE, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2YE;
    }
}
