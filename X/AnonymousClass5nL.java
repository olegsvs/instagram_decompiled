package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5nL */
public final class AnonymousClass5nL {
    /* renamed from: B */
    public static boolean m28454B(AnonymousClass5nK anonymousClass5nK, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("results".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass5nM parseFromJson = AnonymousClass5nN.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass5nK.f69018B = arrayList;
            return true;
        } else if (!"rank_token".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass5nK, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass5nK.f69019C = str2;
            return true;
        }
    }

    public static AnonymousClass5nK parseFromJson(JsonParser jsonParser) {
        AnonymousClass5nK anonymousClass5nK = new AnonymousClass5nK();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5nL.m28454B(anonymousClass5nK, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5nK;
    }
}
