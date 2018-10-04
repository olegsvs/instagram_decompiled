package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Wg */
public final class AnonymousClass1Wg {
    /* renamed from: B */
    public static boolean m11739B(AnonymousClass3MM anonymousClass3MM, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("parameter_name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3MM.f40443B = str2;
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3MM.f40444C = str2;
            return true;
        } else if ("values".equals(str)) {
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
            anonymousClass3MM.f40445D = arrayList;
            return true;
        } else if (!"current_value".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        }
    }

    public static AnonymousClass3MM parseFromJson(JsonParser jsonParser) {
        AnonymousClass3MM anonymousClass3MM = new AnonymousClass3MM();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Wg.m11739B(anonymousClass3MM, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3MM;
    }
}
