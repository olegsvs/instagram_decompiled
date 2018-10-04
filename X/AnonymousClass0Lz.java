package X;

import com.fasterxml.jackson.core.JsonGenerator;

/* renamed from: X.0Lz */
public final class AnonymousClass0Lz {
    /* renamed from: B */
    public static void m3038B(AnonymousClass0Ci anonymousClass0Ci, JsonGenerator jsonGenerator) {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("id", anonymousClass0Ci.getId());
        if (anonymousClass0Ci.m998O() != null) {
            jsonGenerator.writeStringField("biography", anonymousClass0Ci.m998O());
        }
        jsonGenerator.writeBooleanField("blocking", anonymousClass0Ci.f1721P);
        jsonGenerator.writeBooleanField("blocking_reel", anonymousClass0Ci.f1722Q);
        if (anonymousClass0Ci.f1742k != null) {
            jsonGenerator.writeStringField("external_url", anonymousClass0Ci.f1742k);
        }
        jsonGenerator.writeObjectField("follower_count", anonymousClass0Ci.f1752u);
        jsonGenerator.writeObjectField("following_count", anonymousClass0Ci.f1753v);
        jsonGenerator.writeStringField("follow_status", anonymousClass0Ci.f1751t.toString());
        jsonGenerator.writeStringField("full_name", anonymousClass0Ci.f1757z);
        jsonGenerator.writeBooleanField("usertag_review_enabled", anonymousClass0Ci.nB);
        if (anonymousClass0Ci.eB != null) {
            jsonGenerator.writeStringField("last_follow_status", anonymousClass0Ci.eB.toString());
        }
        jsonGenerator.writeObjectField("media_count", anonymousClass0Ci.hB);
        jsonGenerator.writeStringField("privacy_status", anonymousClass0Ci.qB.toString());
        jsonGenerator.writeStringField("profile_pic_url", anonymousClass0Ci.DQ());
        if (anonymousClass0Ci.uB != null) {
            jsonGenerator.writeStringField("profile_pic_id", anonymousClass0Ci.uB);
        }
        if (anonymousClass0Ci.LB != null) {
            jsonGenerator.writeFieldName("hd_profile_pic_info");
            AnonymousClass0Lr.m3034C(jsonGenerator, anonymousClass0Ci.LB, true);
        }
        if (anonymousClass0Ci.CB != null) {
            jsonGenerator.writeBooleanField("has_anonymous_profile_pic", anonymousClass0Ci.CB.booleanValue());
        }
        jsonGenerator.writeStringField("username", anonymousClass0Ci.uT());
        jsonGenerator.writeObjectField("geo_media_count", anonymousClass0Ci.BB);
        jsonGenerator.writeObjectField("usertags_count", anonymousClass0Ci.oB);
        jsonGenerator.writeBooleanField("is_verified", anonymousClass0Ci.m1030u());
        jsonGenerator.writeStringField("byline", anonymousClass0Ci.f1723R);
        jsonGenerator.writeObjectField("coeff_weight", anonymousClass0Ci.f1737f);
        jsonGenerator.writeBooleanField("can_see_organic_insights", anonymousClass0Ci.m993J());
        jsonGenerator.writeBooleanField("aggregate_promote_engagement", anonymousClass0Ci.m984A());
        jsonGenerator.writeBooleanField("can_boost_post", anonymousClass0Ci.m989F());
        if ((anonymousClass0Ci.f1729X == null ? 1 : null) == null) {
            jsonGenerator.writeBooleanField("can_create_sponsor_tags", anonymousClass0Ci.m991H());
        }
        jsonGenerator.writeBooleanField("can_be_tagged_as_sponsor", anonymousClass0Ci.m988E());
        jsonGenerator.writeBooleanField("is_business", anonymousClass0Ci.m1018i());
        if (anonymousClass0Ci.lB != null) {
            jsonGenerator.writeStringField("page_id", anonymousClass0Ci.lB);
        }
        if (anonymousClass0Ci.mB != null) {
            jsonGenerator.writeStringField("page_name", anonymousClass0Ci.mB);
        }
        if (anonymousClass0Ci.f1717L != null) {
            jsonGenerator.writeNumberField("besties_count", anonymousClass0Ci.f1717L.intValue());
        }
        if (anonymousClass0Ci.m1007X() != AnonymousClass0Lt.UNSET) {
            jsonGenerator.writeStringField("reel_auto_archive", anonymousClass0Ci.m1007X().m3036A());
        }
        String str = "can_follow_hashtag";
        Boolean bool = anonymousClass0Ci.f1731Z;
        boolean z = bool != null && bool.booleanValue();
        jsonGenerator.writeBooleanField(str, z);
        if (anonymousClass0Ci.iB != null) {
            jsonGenerator.writeObjectFieldStart("nametag_config");
            jsonGenerator.writeObjectField("mode", Integer.valueOf(anonymousClass0Ci.iB.f3306E));
            jsonGenerator.writeNumberField("gradient", anonymousClass0Ci.iB.f3305D);
            jsonGenerator.writeStringField("emoji", anonymousClass0Ci.iB.f3303B);
            jsonGenerator.writeNumberField("emoji_color", anonymousClass0Ci.iB.f3304C);
            jsonGenerator.writeNumberField("selfie_sticker", anonymousClass0Ci.iB.f3307F);
            jsonGenerator.writeStringField("selfie_url", anonymousClass0Ci.iB.f3308G);
            jsonGenerator.writeEndObject();
        }
        if (anonymousClass0Ci.GC != null) {
            jsonGenerator.writeStringField("shopping_onboarding_state", anonymousClass0Ci.GC.A());
        }
        if (anonymousClass0Ci.f1740i != null) {
            jsonGenerator.writeStringField("current_product_catalog_id", anonymousClass0Ci.f1740i);
        }
        jsonGenerator.writeEndObject();
    }
}
