package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3QT */
public final class AnonymousClass3QT {
    /* renamed from: B */
    public static boolean m19611B(AnonymousClass0mw anonymousClass0mw, String str, JsonParser jsonParser) {
        String str2 = null;
        if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0mw.f9945I = str2;
            return true;
        } else if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0mw.f9942F = str2;
            return true;
        } else if ("submit_optional".equals(str)) {
            anonymousClass0mw.f9943G = jsonParser.getValueAsBoolean();
            return true;
        } else if ("type".equals(str)) {
            anonymousClass0mw.f9946J = AnonymousClass1W0.B(jsonParser);
            return true;
        } else if ("answers".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass3QR parseFromJson = AnonymousClass3QS.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass0mw.f9944H = arrayList;
            return true;
        } else if (!"placeholder".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0mw.f9941E = str2;
            return true;
        }
    }

    public static AnonymousClass0mw parseFromJson(JsonParser jsonParser) {
        AnonymousClass0mw anonymousClass0mw = new AnonymousClass0mw();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3QT.m19611B(anonymousClass0mw, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0mw;
    }
}
