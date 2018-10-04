package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3Uj */
public final class AnonymousClass3Uj {
    /* renamed from: B */
    public static boolean m19737B(AnonymousClass3Ui anonymousClass3Ui, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("card_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3Ui.f41648D = str2;
            return true;
        } else if ("image_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3Ui.f41650F = str2;
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3Ui.f41652H = str2;
            return true;
        } else if ("message".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3Ui.f41651G = str2;
            return true;
        } else if ("button_text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3Ui.f41646B = str2;
            return true;
        } else if ("face_filter_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3Ui.f41649E = str2;
            return true;
        } else if (!"camera_target".equals(str)) {
            return false;
        } else {
            anonymousClass3Ui.f41647C = AnonymousClass0cD.B(jsonParser.getValueAsString());
            return true;
        }
    }

    public static AnonymousClass3Ui parseFromJson(JsonParser jsonParser) {
        AnonymousClass3Ui anonymousClass3Ui = new AnonymousClass3Ui();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3Uj.m19737B(anonymousClass3Ui, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3Ui;
    }
}
