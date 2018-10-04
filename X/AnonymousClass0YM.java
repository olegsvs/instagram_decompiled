package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.0YM */
public final class AnonymousClass0YM {
    /* renamed from: B */
    public static boolean m5294B(AnonymousClass0U9 anonymousClass0U9, String str, JsonParser jsonParser) {
        if ("share_target".equals(str)) {
            anonymousClass0U9.f5378M = AnonymousClass0YK.parseFromJson(jsonParser);
            return true;
        }
        String str2 = null;
        if ("reel_owner_user_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0U9.f5376K = str2;
            return true;
        } else if ("reel_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0U9.f5375J = str2;
            return true;
        } else if ("reel_share".equals(str)) {
            anonymousClass0U9.f5377L = AnonymousClass0YL.parseFromJson(jsonParser);
            return true;
        } else if ("reaction_name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0U9.f5373H = str2;
            return true;
        } else if ("interactive_sticker_type".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0U9.f5369D = str2;
            return true;
        } else if ("interact_user_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0U9.f5368C = str2;
            return true;
        } else if ("question_response_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0U9.f5372G = str2;
            return true;
        } else if ("poll_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0U9.f5370E = str2;
            return true;
        } else if ("poll_vote".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0U9.f5371F = str2;
            return true;
        } else if ("slider_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0U9.f5379N = str2;
            return true;
        } else if ("slider_vote".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0U9.f5380O = str2;
            return true;
        } else if ("reaction_type".equals(str)) {
            anonymousClass0U9.f5374I = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if (!"entry_point".equals(str)) {
            return AnonymousClass0XV.m5237B(anonymousClass0U9, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0U9.f5367B = str2;
            return true;
        }
    }

    public static AnonymousClass0U9 parseFromJson(JsonParser jsonParser) {
        AnonymousClass0U9 anonymousClass0U9 = new AnonymousClass0U9();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0YM.m5294B(anonymousClass0U9, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0U9;
    }
}
