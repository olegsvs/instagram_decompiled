package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4RN */
public final class AnonymousClass4RN {
    /* renamed from: B */
    public static boolean m24218B(AnonymousClass4RM anonymousClass4RM, String str, JsonParser jsonParser) {
        String str2 = null;
        if (DialogModule.KEY_ITEMS.equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass2G1 parseFromJson = AnonymousClass2bW.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass4RM.f54072C = arrayList;
            return true;
        } else if ("page_info".equals(str)) {
            anonymousClass4RM.f54073D = AnonymousClass2bY.parseFromJson(jsonParser);
            return true;
        } else if (!"alacorn_session_id".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass4RM, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass4RM.f54071B = str2;
            return true;
        }
    }

    public static AnonymousClass4RM parseFromJson(JsonParser jsonParser) {
        AnonymousClass4RM anonymousClass4RM = new AnonymousClass4RM();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4RN.m24218B(anonymousClass4RM, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        for (AnonymousClass2G1 anonymousClass2G1 : anonymousClass4RM.f54072C) {
            if (AnonymousClass4RL.f54070B[anonymousClass2G1.f28180E.ordinal()] == 1) {
                anonymousClass2G1.f28179D.f28187B = anonymousClass4RM.f54071B;
            }
        }
        return anonymousClass4RM;
    }
}
