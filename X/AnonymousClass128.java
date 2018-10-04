package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.128 */
public final class AnonymousClass128 {
    /* renamed from: B */
    public static boolean m8845B(AnonymousClass0zN anonymousClass0zN, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("label".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0zN.f13015T = str2;
            return true;
        } else if ("hide_label".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0zN.f13010O = str2;
            return true;
        } else if ("contextual_label_info".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0zN.f13002G = str2;
            return true;
        } else if ("show_page_name_in_headline".equals(str)) {
            anonymousClass0zN.f13009N = jsonParser.getValueAsBoolean();
            return true;
        } else if ("display_fb_page_name".equals(str)) {
            anonymousClass0zN.f13004I = jsonParser.getValueAsBoolean();
            return true;
        } else if ("hide_reasons_v2".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0yT parseFromJson = AnonymousClass129.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass0zN.f13011P = arrayList;
            return true;
        } else if ("invalidation".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0zN.f13012Q = str2;
            return true;
        } else if ("is_demo".equals(str)) {
            anonymousClass0zN.f13013R = jsonParser.getValueAsBoolean();
            return true;
        } else if ("is_holdout".equals(str)) {
            anonymousClass0zN.f13014S = jsonParser.getValueAsBoolean();
            return true;
        } else if ("display_viewability_eligible".equals(str)) {
            anonymousClass0zN.f13005J = jsonParser.getValueAsBoolean();
            return true;
        } else if ("tracking_token".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0zN.f13016U = str2;
            return true;
        } else if ("show_ad_choices".equals(str)) {
            anonymousClass0zN.f13008M = jsonParser.getValueAsBoolean();
            return true;
        } else if ("ad_title".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0zN.f12998C = str2;
            return true;
        } else if ("cookies".equals(str)) {
            List arrayList2;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList2 = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    Object text = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                    if (text != null) {
                        arrayList2.add(text);
                    }
                }
            } else {
                arrayList2 = null;
            }
            anonymousClass0zN.f13003H = arrayList2;
            return true;
        } else if ("direct_share".equals(str)) {
            anonymousClass0zN.f12999D = jsonParser.getValueAsBoolean();
            return true;
        } else if ("ad_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0zN.f12997B = str2;
            return true;
        } else if ("political_context".equals(str)) {
            anonymousClass0zN.f13007L = AnonymousClass2Va.parseFromJson(jsonParser);
            return true;
        } else if ("is_leadgen_native_eligible".equals(str)) {
            anonymousClass0zN.f13006K = jsonParser.getValueAsBoolean();
            return true;
        } else if ("can_skip".equals(str)) {
            anonymousClass0zN.f13000E = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"can_skip_after".equals(str)) {
            return false;
        } else {
            anonymousClass0zN.f13001F = jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass0zN parseFromJson(JsonParser jsonParser) {
        AnonymousClass0zN anonymousClass0zN = new AnonymousClass0zN();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass128.m8845B(anonymousClass0zN, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0zN;
    }
}
