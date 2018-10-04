package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;

/* renamed from: X.14E */
public final class AnonymousClass14E {
    /* renamed from: B */
    public static boolean m9155B(AnonymousClass0r7 anonymousClass0r7, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0r7.f11115K = str2;
            return true;
        } else if ("user".equals(str)) {
            anonymousClass0r7.f11134d = AnonymousClass0Ci.m980B(jsonParser);
            return true;
        } else if ("owner".equals(str)) {
            anonymousClass0r7.f11120P = AnonymousClass1Cw.parseFromJson(jsonParser);
            return true;
        } else if ("social_context".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0r7.f11110F = str2;
            return true;
        } else if ("source_token".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0r7.f11111G = str2;
            return true;
        } else if ("latest_reel_media".equals(str)) {
            anonymousClass0r7.f11119O = jsonParser.getValueAsLong();
            return true;
        } else if ("seen".equals(str)) {
            anonymousClass0r7.f11127W = jsonParser.getValueAsInt();
            return true;
        } else if ("ranked_position".equals(str)) {
            anonymousClass0r7.f11122R = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        } else if ("seen_ranked_position".equals(str)) {
            anonymousClass0r7.f11128X = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        } else if ("can_reply".equals(str)) {
            anonymousClass0r7.f11106B = jsonParser.getValueAsBoolean();
            return true;
        } else if ("can_reshare".equals(str)) {
            anonymousClass0r7.f11107C = jsonParser.getValueAsBoolean();
            return true;
        } else if ("is_nux".equals(str)) {
            anonymousClass0r7.f11117M = jsonParser.getValueAsBoolean();
            return true;
        } else if ("show_nux_tooltip".equals(str)) {
            anonymousClass0r7.f11129Y = jsonParser.getValueAsBoolean();
            return true;
        } else if (DialogModule.KEY_ITEMS.equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                r3 = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0P7 B = AnonymousClass0P7.m3742B(jsonParser, true);
                    if (B != null) {
                        r3.add(B);
                    }
                }
            }
            anonymousClass0r7.f11118N = r3;
            return true;
        } else if ("thumbnail_items".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                r3 = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass1dN parseFromJson = AnonymousClass1dM.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        r3.add(parseFromJson);
                    }
                }
            }
            anonymousClass0r7.f11130Z = r3;
            return true;
        } else if ("muted".equals(str)) {
            anonymousClass0r7.f11121Q = Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        } else if ("prefetch_count".equals(str)) {
            anonymousClass0r7.f11132b = jsonParser.getValueAsInt();
            return true;
        } else if ("viewer_prefetch_count".equals(str)) {
            anonymousClass0r7.f11135e = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if ("dismiss_card".equals(str)) {
            anonymousClass0r7.f11109E = AnonymousClass3Uj.parseFromJson(jsonParser);
            return true;
        } else if ("reel_subtitle".equals(str)) {
            anonymousClass0r7.f11131a = AnonymousClass1TL.parseFromJson(jsonParser);
            return true;
        } else if ("has_besties_media".equals(str)) {
            anonymousClass0r7.f11113I = Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        } else if ("cover_media".equals(str)) {
            anonymousClass0r7.f11123S = AnonymousClass1NC.parseFromJson(jsonParser);
            return true;
        } else if ("unique_integer_reel_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0r7.f11133c = str2;
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0r7.f11125U = str2;
            return true;
        } else if ("created_at".equals(str)) {
            anonymousClass0r7.f11108D = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        } else if ("first_item_photo_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0r7.f11112H = str2;
            return true;
        } else if ("media_count".equals(str)) {
            anonymousClass0r7.f11124T = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if ("interaction_timestamp".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0r7.f11116L = str2;
            return true;
        } else if ("has_preview_hint".equals(str)) {
            anonymousClass0r7.f11114J = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"reel_type".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass0r7, str, jsonParser);
        } else {
            anonymousClass0r7.f11126V = AnonymousClass0Zg.m5379B(jsonParser.getValueAsString());
            return true;
        }
    }

    public static AnonymousClass0r7 parseFromJson(JsonParser jsonParser) {
        AnonymousClass0r7 anonymousClass0r7 = new AnonymousClass0r7();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass14E.m9155B(anonymousClass0r7, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0r7;
    }
}
