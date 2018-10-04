package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3JG */
public final class AnonymousClass3JG {
    /* renamed from: B */
    public static boolean m19334B(AnonymousClass3JE anonymousClass3JE, String str, JsonParser jsonParser) {
        List list = null;
        if ("type".equals(str)) {
            String text;
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass3JE.f40010B = text;
            return true;
        } else if (!"users".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0Ci B = AnonymousClass0Ci.B(jsonParser);
                    if (B != null) {
                        list.add(B);
                    }
                }
            }
            anonymousClass3JE.f40012D = list;
            return true;
        }
    }

    public static AnonymousClass3JE parseFromJson(JsonParser jsonParser) {
        AnonymousClass3JE anonymousClass3JE = new AnonymousClass3JE();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3JG.m19334B(anonymousClass3JE, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        anonymousClass3JE.f40011C = AnonymousClass3JF.m19333B(anonymousClass3JE.f40010B);
        anonymousClass3JE.f40012D = Collections.unmodifiableList(anonymousClass3JE.f40012D);
        return anonymousClass3JE;
    }
}
