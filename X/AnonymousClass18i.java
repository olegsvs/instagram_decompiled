package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.18i */
public final class AnonymousClass18i {
    /* renamed from: B */
    public static boolean m9636B(AnonymousClass0mW anonymousClass0mW, String str, JsonParser jsonParser) {
        if ("is_new_suggestion".equals(str)) {
            anonymousClass0mW.f9805D = jsonParser.getValueAsBoolean();
            return true;
        } else if ("user".equals(str)) {
            anonymousClass0mW.f9808G = AnonymousClass0Ci.m980B(jsonParser);
            return true;
        } else {
            List list = null;
            String text;
            if ("algorithm".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    text = jsonParser.getText();
                }
                anonymousClass0mW.f9803B = text;
                return true;
            } else if ("uuid".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    text = jsonParser.getText();
                }
                anonymousClass0mW.f9810I = text;
                return true;
            } else if ("social_context".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    text = jsonParser.getText();
                }
                anonymousClass0mW.f9807F = text;
                return true;
            } else if ("user_story".equals(str)) {
                anonymousClass0mW.f9809H = AnonymousClass3V7.parseFromJson(jsonParser);
                return true;
            } else if ("media_infos".equals(str)) {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    list = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        AnonymousClass0P7 B = AnonymousClass0P7.m3742B(jsonParser, true);
                        if (B != null) {
                            list.add(B);
                        }
                    }
                }
                anonymousClass0mW.f9806E = list;
                return true;
            } else if (!"followed_by".equals(str)) {
                return false;
            } else {
                anonymousClass0mW.f9804C = jsonParser.getValueAsBoolean();
                return true;
            }
        }
    }

    public static AnonymousClass0mW parseFromJson(JsonParser jsonParser) {
        AnonymousClass0mW anonymousClass0mW = new AnonymousClass0mW();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass18i.m9636B(anonymousClass0mW, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass0mW.f9808G;
        if (anonymousClass0Ci != null) {
            anonymousClass0Ci.f1751t = AnonymousClass0Lq.FollowStatusNotFollowing;
            anonymousClass0mW.f9808G.f1754w = Boolean.valueOf(anonymousClass0mW.f9804C);
        }
        return anonymousClass0mW;
    }
}
