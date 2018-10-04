package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.11j */
public final class AnonymousClass11j {
    /* renamed from: B */
    public static boolean m8822B(AnonymousClass0ft anonymousClass0ft, String str, JsonParser jsonParser) {
        if ("megaphone".equals(str)) {
            anonymousClass0ft.f8016F = AnonymousClass11a.parseFromJson(jsonParser);
            return true;
        }
        String str2 = null;
        List arrayList;
        AnonymousClass0P7 B;
        if (DialogModule.KEY_ITEMS.equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    B = AnonymousClass0P7.m3742B(jsonParser, true);
                    if (B != null) {
                        arrayList.add(B);
                    }
                }
            }
            anonymousClass0ft.f8015E = arrayList;
            return true;
        } else if ("ranked_items".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    B = AnonymousClass0P7.m3742B(jsonParser, true);
                    if (B != null) {
                        arrayList.add(B);
                    }
                }
            }
            anonymousClass0ft.f8019I = arrayList;
            return true;
        } else if ("more_available".equals(str)) {
            anonymousClass0ft.f8017G = Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        } else if ("auto_load_more_enabled".equals(str)) {
            anonymousClass0ft.f8013C = jsonParser.getValueAsBoolean();
            return true;
        } else if ("next_max_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0ft.f8018H = str2;
            return true;
        } else if (!"age_gated_info".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass0ft, str, jsonParser);
        } else {
            anonymousClass0ft.f8012B = AnonymousClass2zF.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass0ft parseFromJson(JsonParser jsonParser) {
        AnonymousClass0ft anonymousClass0ft = new AnonymousClass0ft();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass11j.m8822B(anonymousClass0ft, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0ft.mo1553H();
    }
}
