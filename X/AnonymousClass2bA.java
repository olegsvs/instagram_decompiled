package X;

import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2bA */
public final class AnonymousClass2bA {
    /* renamed from: B */
    public static boolean m16388B(AnonymousClass2b9 anonymousClass2b9, String str, JsonParser jsonParser) {
        if ("file_path".equals(str)) {
            anonymousClass2b9.f31391C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        } else if (!TraceFieldType.Duration.equals(str)) {
            return false;
        } else {
            anonymousClass2b9.f31390B = jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass2b9 parseFromJson(JsonParser jsonParser) {
        AnonymousClass2b9 anonymousClass2b9 = new AnonymousClass2b9();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2bA.m16388B(anonymousClass2b9, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2b9;
    }
}
