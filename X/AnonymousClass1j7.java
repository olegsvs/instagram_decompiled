package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1j7 */
public final class AnonymousClass1j7 {
    /* renamed from: B */
    public static boolean m12728B(AnonymousClass3R4 anonymousClass3R4, String str, JsonParser jsonParser) {
        if ("type".equals(str)) {
            Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        }
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
        } else if ("ssrcs".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                List arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    Long valueOf = Long.valueOf(jsonParser.getValueAsLong());
                    if (valueOf != null) {
                        arrayList.add(valueOf);
                    }
                }
            }
        } else if (!"enabled".equals(str)) {
            return false;
        } else {
            jsonParser.getValueAsBoolean();
            return true;
        }
        return true;
    }

    public static AnonymousClass3R4 parseFromJson(JsonParser jsonParser) {
        AnonymousClass3R4 anonymousClass3R4 = new AnonymousClass3R4();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1j7.m12728B(anonymousClass3R4, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3R4;
    }
}
