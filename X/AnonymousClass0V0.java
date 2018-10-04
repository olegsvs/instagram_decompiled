package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0V0 */
public enum AnonymousClass0V0 {
    PLACEHOLDER("placeholder", false),
    TEXT("text", true),
    HASHTAG("hashtag", true),
    LOCATION("location", true),
    PROFILE("profile", true),
    MEDIA("media", true),
    MEDIA_SHARE("media_share", true),
    EXPIRING_MEDIA("raven_media", true),
    LIKE("like", false),
    ACTION_LOG("action_log", false),
    REACTION("reaction", false),
    REEL_SHARE("reel_share", true),
    STORY_SHARE("story_share", true),
    LIVE_VIDEO_SHARE("live_video_share", true),
    LIVE_VIEWER_INVITE("live_viewer_invite", true),
    LINK("link", true),
    SHOPPING_PRODUCT("product_share", false),
    VIDEO_CALL_EVENT("video_call_event", false),
    FELIX_SHARE("felix_share", true),
    ANIMATED_MEDIA("animated_media", true),
    VOICE_MEDIA("voice_media", true),
    CTA_LINK("cta_link", true);
    
    /* renamed from: a */
    private static final Map f5628a = null;
    /* renamed from: B */
    private final String f5629B;
    /* renamed from: C */
    private final boolean f5630C;

    static {
        f5628a = new HashMap();
        AnonymousClass0V0[] values = AnonymousClass0V0.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass0V0 anonymousClass0V0 = values[i];
            f5628a.put(anonymousClass0V0.f5629B, anonymousClass0V0);
            i++;
        }
    }

    private AnonymousClass0V0(String str, boolean z) {
        this.f5629B = str;
        this.f5630C = z;
    }

    /* renamed from: A */
    public final String m4811A() {
        return this.f5629B;
    }

    /* renamed from: B */
    public static AnonymousClass0V0 m4810B(String str) {
        return (AnonymousClass0V0) f5628a.get(str);
    }

    /* renamed from: B */
    public final boolean m4812B() {
        return this.f5630C;
    }
}
