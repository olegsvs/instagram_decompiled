package X;

import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2WE */
public final class AnonymousClass2WE {
    /* renamed from: B */
    public static boolean m16171B(AnonymousClass2W2 anonymousClass2W2, String str, JsonParser jsonParser) {
        if (!TraceFieldType.Uri.equals(str)) {
            return false;
        }
        anonymousClass2W2.f31087B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass2W2 parseFromJson(JsonParser jsonParser) {
        AnonymousClass2W2 anonymousClass2W2 = new AnonymousClass2W2();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2WE.m16171B(anonymousClass2W2, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2W2;
    }
}
