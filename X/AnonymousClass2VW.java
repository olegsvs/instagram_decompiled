package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;

/* renamed from: X.2VW */
public final class AnonymousClass2VW {
    /* renamed from: B */
    public static boolean m16140B(AnonymousClass0wA anonymousClass0wA, String str, JsonParser jsonParser) {
        if ("gating_type".equals(str)) {
            anonymousClass0wA.f12230E = AnonymousClass0wB.B(jsonParser.getValueAsString());
            return true;
        }
        String str2 = null;
        if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0wA.f12229D = str2;
            return true;
        } else if ("description".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0wA.f12228C = str2;
            return true;
        } else if (!"buttons".equals(str)) {
            return false;
        } else {
            ArrayList arrayList;
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
            anonymousClass0wA.f12227B = arrayList;
            return true;
        }
    }

    public static AnonymousClass0wA parseFromJson(JsonParser jsonParser) {
        AnonymousClass0wA anonymousClass0wA = new AnonymousClass0wA();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2VW.m16140B(anonymousClass0wA, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0wA;
    }
}
