package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2b6 */
public final class AnonymousClass2b6 {
    /* renamed from: B */
    public static boolean m16384B(AnonymousClass2Em anonymousClass2Em, String str, JsonParser jsonParser) {
        if ("suggestions".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    Object text = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                    if (text != null) {
                        arrayList.add(text);
                    }
                }
            } else {
                arrayList = null;
            }
            anonymousClass2Em.f27926B = arrayList;
            return true;
        } else if (!"suggestions_with_metadata".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass2Em, str, jsonParser);
        } else {
            anonymousClass2Em.f27927C = AnonymousClass2b5.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass2Em parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Em anonymousClass2Em = new AnonymousClass2Em();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2b6.m16384B(anonymousClass2Em, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Em;
    }
}
