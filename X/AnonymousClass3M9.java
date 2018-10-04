package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3M9 */
public final class AnonymousClass3M9 {
    /* renamed from: B */
    public static boolean m19461B(AnonymousClass0qv anonymousClass0qv, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qv.f11051F = str2;
            return true;
        } else if ("tracking_token".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qv.f11058M = str2;
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qv.f11057L = str2;
            return true;
        } else if ("facepile_photo_urls".equals(str)) {
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
            anonymousClass0qv.f11049D = arrayList;
            return true;
        } else if ("facepile_outline_color_hex".equals(str)) {
            anonymousClass0qv.f11048C = jsonParser.getValueAsLong();
            return true;
        } else if ("media_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qv.f11053H = str2;
            return true;
        } else if ("media_aspect_ratio".equals(str)) {
            anonymousClass0qv.f11052G = (float) jsonParser.getValueAsDouble();
            return true;
        } else if ("message".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qv.f11054I = str2;
            return true;
        } else if ("message_background_media_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qv.f11055J = str2;
            return true;
        } else if ("action_text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qv.f11047B = str2;
            return true;
        } else if ("fb_app_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qv.f11050E = str2;
            return true;
        } else if (!"msite_url".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qv.f11056K = str2;
            return true;
        }
    }
}
