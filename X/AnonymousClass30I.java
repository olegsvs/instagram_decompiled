package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.30I */
public final class AnonymousClass30I {
    /* renamed from: B */
    public static boolean m18158B(AnonymousClass30H anonymousClass30H, String str, JsonParser jsonParser) {
        if ("more_available".equals(str)) {
            Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }
        List list = null;
        if ("max_id".equals(str)) {
            String text;
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass30H.f36796C = text;
            return true;
        } else if (!DialogModule.KEY_ITEMS.equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass30H, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0P7 B = AnonymousClass0P7.B(jsonParser, true);
                    if (B != null) {
                        list.add(B);
                    }
                }
            }
            anonymousClass30H.f36795B = list;
            return true;
        }
    }

    public static AnonymousClass30H parseFromJson(JsonParser jsonParser) {
        AnonymousClass30H anonymousClass30H = new AnonymousClass30H();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass30I.m18158B(anonymousClass30H, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass30H;
    }
}
