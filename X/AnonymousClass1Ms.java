package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ms */
public final class AnonymousClass1Ms {
    /* renamed from: B */
    public static boolean m11026B(AnonymousClass0rD anonymousClass0rD, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0rD.f11152B = str2;
            return true;
        } else if ("type".equals(str)) {
            anonymousClass0rD.f11156F = jsonParser.getValueAsInt();
            return true;
        } else if ("tracking_token".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0rD.f11155E = str2;
            return true;
        } else if ("uuid".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if ("suggestions".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0mW parseFromJson = AnonymousClass18i.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass0rD.f11153C = arrayList;
            return true;
        } else if (!DialogModule.KEY_TITLE.equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0rD.f11154D = str2;
            return true;
        }
    }

    public static AnonymousClass0rD parseFromJson(JsonParser jsonParser) {
        AnonymousClass0rD anonymousClass0rD = new AnonymousClass0rD();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Ms.m11026B(anonymousClass0rD, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0rD;
    }
}
