package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3UY */
public final class AnonymousClass3UY {
    /* renamed from: B */
    public static boolean m19732B(AnonymousClass3UX anonymousClass3UX, String str, JsonParser jsonParser) {
        List list = null;
        if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if (!"suggestions_with_media".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3UX, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0mf parseFromJson = AnonymousClass1Kn.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass3UX.f41634B = list;
            return true;
        }
    }

    public static AnonymousClass3UX parseFromJson(JsonParser jsonParser) {
        AnonymousClass3UX anonymousClass3UX = new AnonymousClass3UX();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3UY.m19732B(anonymousClass3UX, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3UX;
    }
}
