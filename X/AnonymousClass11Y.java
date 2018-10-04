package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.11Y */
public final class AnonymousClass11Y {
    /* renamed from: B */
    public static boolean m8807B(AnonymousClass1NO anonymousClass1NO, String str, JsonParser jsonParser) {
        String str2 = null;
        if (DialogModule.KEY_ITEMS.equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0nW parseFromJson = AnonymousClass1NP.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass1NO.f17787C = arrayList;
            return true;
        } else if (!"client_session_id".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass1NO, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1NO.f17786B = str2;
            return true;
        }
    }

    public static AnonymousClass1NO parseFromJson(JsonParser jsonParser) {
        AnonymousClass1NO anonymousClass1NO = new AnonymousClass1NO();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass11Y.m8807B(anonymousClass1NO, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1NO;
    }

    public static AnonymousClass1NO parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass11Y.parseFromJson(createParser);
    }
}
