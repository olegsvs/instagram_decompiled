package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.5hX */
public final class AnonymousClass5hX {
    /* renamed from: B */
    public static boolean m28288B(AnonymousClass5hW anonymousClass5hW, String str, JsonParser jsonParser) {
        if (!"batch_size".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass5hW, str, jsonParser);
        }
        Integer.valueOf(jsonParser.getValueAsInt());
        return true;
    }

    public static AnonymousClass5hW parseFromJson(JsonParser jsonParser) {
        AnonymousClass5hW anonymousClass5hW = new AnonymousClass5hW();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5hX.m28288B(anonymousClass5hW, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5hW;
    }
}
