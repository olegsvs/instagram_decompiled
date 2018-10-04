package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.0m5 */
public final class AnonymousClass0m5 {
    /* renamed from: B */
    public static boolean m7473B(AnonymousClass0fH anonymousClass0fH, String str, JsonParser jsonParser) {
        if ("suggested_businesses".equals(str)) {
            anonymousClass0fH.f7912b = AnonymousClass1Ms.parseFromJson(jsonParser);
            return true;
        } else if ("suggested_users".equals(str)) {
            anonymousClass0fH.f7919i = AnonymousClass11h.parseFromJson(jsonParser);
            return true;
        } else if ("suggested_interest_accounts".equals(str)) {
            anonymousClass0fH.f7915e = AnonymousClass11h.parseFromJson(jsonParser);
            return true;
        } else if ("suggested_hashtags".equals(str)) {
            anonymousClass0fH.f7914d = AnonymousClass11h.parseFromJson(jsonParser);
            return true;
        } else if ("suggested_top_accounts".equals(str)) {
            anonymousClass0fH.f7918h = AnonymousClass11h.parseFromJson(jsonParser);
            return true;
        } else if ("suggested_producers".equals(str)) {
            anonymousClass0fH.f7917g = AnonymousClass11h.parseFromJson(jsonParser);
            return true;
        } else if ("suggested_close_friends".equals(str)) {
            anonymousClass0fH.f7913c = AnonymousClass11h.parseFromJson(jsonParser);
            return true;
        } else if ("follow_chain_users".equals(str)) {
            anonymousClass0fH.f7896L = AnonymousClass11h.parseFromJson(jsonParser);
            return true;
        } else if ("suggested_invites".equals(str)) {
            anonymousClass0fH.f7916f = AnonymousClass1Oe.parseFromJson(jsonParser);
            return true;
        } else if ("visit_explore".equals(str)) {
            anonymousClass0fH.f7922l = AnonymousClass1Vm.parseFromJson(jsonParser);
            return true;
        } else if ("media_or_ad".equals(str)) {
            anonymousClass0fH.f7906V = AnonymousClass0P7.m3742B(jsonParser, true);
            return true;
        } else if ("igtv_for_you_tray".equals(str)) {
            anonymousClass0fH.f7903S = AnonymousClass3ML.parseFromJson(jsonParser);
            return true;
        } else if ("simple_action".equals(str)) {
            anonymousClass0fH.f7910Z = AnonymousClass1Wk.parseFromJson(jsonParser);
            return true;
        } else if ("ad4ad".equals(str)) {
            anonymousClass0fH.f7886B = AnonymousClass1Jz.parseFromJson(jsonParser);
            return true;
        } else if ("in_feed_survey".equals(str)) {
            anonymousClass0fH.f7895K = AnonymousClass1XB.parseFromJson(jsonParser);
            return true;
        } else if ("tagged_edge_story".equals(str)) {
            anonymousClass0fH.f7920j = AnonymousClass1We.parseFromJson(jsonParser);
            return true;
        } else if ("stories_netego".equals(str)) {
            anonymousClass0fH.f7911a = AnonymousClass1Cv.parseFromJson(jsonParser);
            return true;
        } else if ("business_conversion_netego".equals(str)) {
            anonymousClass0fH.f7887C = AnonymousClass1Wf.parseFromJson(jsonParser);
            return true;
        } else if ("separator".equals(str)) {
            anonymousClass0fH.f7908X = AnonymousClass1Vx.parseFromJson(jsonParser);
            return true;
        } else if ("separator_header".equals(str)) {
            anonymousClass0fH.f7909Y = AnonymousClass1Vx.parseFromJson(jsonParser);
            return true;
        } else if ("group_header".equals(str)) {
            anonymousClass0fH.f7898N = AnonymousClass1Vx.parseFromJson(jsonParser);
            return true;
        } else if ("end_of_feed_unit".equals(str)) {
            anonymousClass0fH.f7888D = AnonymousClass3M8.parseFromJson(jsonParser);
            return true;
        } else if ("explore_story".equals(str)) {
            anonymousClass0fH.f7890F = AnonymousClass1Wh.parseFromJson(jsonParser);
            return true;
        } else if ("invite_from_fb".equals(str)) {
            anonymousClass0fH.f7905U = AnonymousClass1WQ.parseFromJson(jsonParser);
            return true;
        } else if ("fb_upsell_non_user".equals(str)) {
            anonymousClass0fH.f7891G = AnonymousClass3MB.parseFromJson(jsonParser);
            return true;
        } else if ("fb_upsell_stale_user".equals(str)) {
            anonymousClass0fH.f7892H = AnonymousClass1UO.parseFromJson(jsonParser);
            return true;
        } else if ("see_more_recs".equals(str)) {
            anonymousClass0fH.f7907W = AnonymousClass3MN.parseFromJson(jsonParser);
            return true;
        } else if ("end_of_feed_demarcator".equals(str)) {
            anonymousClass0fH.f7889E = AnonymousClass1JO.parseFromJson(jsonParser);
            return true;
        } else if ("tile_unit".equals(str)) {
            anonymousClass0fH.f7921k = AnonymousClass1Rj.parseFromJson(jsonParser);
            return true;
        } else if ("group_set".equals(str)) {
            anonymousClass0fH.f7899O = AnonymousClass3MG.parseFromJson(jsonParser);
            return true;
        } else if ("highlights_netego".equals(str)) {
            anonymousClass0fH.f7902R = AnonymousClass1NB.parseFromJson(jsonParser);
            return true;
        } else if ("follow_showcase".equals(str)) {
            anonymousClass0fH.f7897M = AnonymousClass3MD.parseFromJson(jsonParser);
            return true;
        } else if ("header_text".equals(str)) {
            anonymousClass0fH.f7901Q = AnonymousClass3MJ.parseFromJson(jsonParser);
            return true;
        } else if (!"has_feed_preview".equals(str)) {
            return false;
        } else {
            anonymousClass0fH.f7900P = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass0fH parseFromJson(JsonParser jsonParser) {
        AnonymousClass0fH anonymousClass0fH = new AnonymousClass0fH();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0m5.m7473B(anonymousClass0fH, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0fH.m6527F();
    }

    public static AnonymousClass0fH parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass0m5.parseFromJson(createParser);
    }
}
