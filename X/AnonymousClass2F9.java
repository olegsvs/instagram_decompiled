package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2F9 */
public enum AnonymousClass2F9 {
    INTERNAL_BRUSH("internal_brush"),
    INTERNAL_STICKER("internal_sticker"),
    IGTV_VIDEO_LINK_TYPE("felix_video_link_type"),
    MQ_EFFECT_INTERNAL_ONLY("mq_effect_internal_only"),
    RICH_TEXT("rich_text"),
    SUPERZOOMV3("superzoomv3"),
    FRIEND_LIST("friend_list"),
    HIGHLIGHT("highlight");
    
    /* renamed from: L */
    private static final Map f27978L = null;
    /* renamed from: B */
    private final String f27979B;

    static {
        f27978L = new HashMap();
        AnonymousClass2F9[] values = AnonymousClass2F9.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass2F9 anonymousClass2F9 = values[i];
            f27978L.put(anonymousClass2F9.f27979B, anonymousClass2F9);
            i++;
        }
    }

    private AnonymousClass2F9(String str) {
        this.f27979B = str;
    }

    /* renamed from: B */
    public static AnonymousClass2F9 m14803B(String str) {
        return (AnonymousClass2F9) f27978L.get(str);
    }

    public final String toString() {
        return this.f27979B;
    }
}
