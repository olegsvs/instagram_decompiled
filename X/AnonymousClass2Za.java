package X;

import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Za */
public final class AnonymousClass2Za {
    /* renamed from: B */
    public static boolean m16287B(AnonymousClass2ZT anonymousClass2ZT, String str, JsonParser jsonParser) {
        if ("height".equals(str)) {
            anonymousClass2ZT.f31312B = jsonParser.getValueAsInt();
            return true;
        } else if ("width".equals(str)) {
            anonymousClass2ZT.f31314D = jsonParser.getValueAsInt();
            return true;
        } else if (!TraceFieldType.Uri.equals(str)) {
            return false;
        } else {
            anonymousClass2ZT.f31313C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    public static AnonymousClass2ZT parseFromJson(JsonParser jsonParser) {
        AnonymousClass2ZT anonymousClass2ZT = new AnonymousClass2ZT();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Za.m16287B(anonymousClass2ZT, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2ZT;
    }
}
