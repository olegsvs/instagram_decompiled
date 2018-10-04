package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Rk */
public final class AnonymousClass1Rk {
    /* renamed from: B */
    public static boolean m11443B(AnonymousClass0SE anonymousClass0SE, String str, JsonParser jsonParser) {
        if ("more_available".equals(str)) {
            Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        } else if ("auto_load_more_enabled".equals(str)) {
            anonymousClass0SE.f4869B = jsonParser.getValueAsBoolean();
            return true;
        } else {
            List list = null;
            if ("next_max_id".equals(str)) {
                String text;
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    text = jsonParser.getText();
                }
                anonymousClass0SE.f4872E = text;
                return true;
            } else if (!DialogModule.KEY_ITEMS.equals(str)) {
                return AnonymousClass0Pv.m3947B(anonymousClass0SE, str, jsonParser);
            } else {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    list = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        AnonymousClass1UV parseFromJson = AnonymousClass1dt.parseFromJson(jsonParser);
                        if (parseFromJson != null) {
                            list.add(parseFromJson);
                        }
                    }
                }
                anonymousClass0SE.f4871D = list;
                return true;
            }
        }
    }

    public static AnonymousClass0SE parseFromJson(JsonParser jsonParser) {
        AnonymousClass0SE anonymousClass0SE = new AnonymousClass0SE();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Rk.m11443B(anonymousClass0SE, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0SE;
    }
}
