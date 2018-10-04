package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1dy */
public enum AnonymousClass1dy {
    UNKNOWN(-1),
    MEDIA(0),
    CHANNEL(1),
    INTEREST_SELECTION(2),
    REELS(3),
    TITLE(4),
    REELS_TOP_LIVE(5),
    VIDEO_CAROUSEL(6),
    ACCOUNT_RECS_AS_NETEGO(7),
    ACCOUNT_RECS(8),
    RELATED_ITEMS(9),
    SPOTLIGHT(10),
    SUGGESTED_HASHTAG(11),
    LIVE_REPLAY(12),
    IGTV_TRAY(13);
    
    /* renamed from: S */
    private static final Map f20825S = null;
    /* renamed from: B */
    private final int f20826B;

    static {
        f20825S = new HashMap();
        AnonymousClass1dy[] values = AnonymousClass1dy.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass1dy anonymousClass1dy = values[i];
            f20825S.put(Integer.valueOf(anonymousClass1dy.f20826B), anonymousClass1dy);
            i++;
        }
    }

    private AnonymousClass1dy(int i) {
        this.f20826B = i;
    }

    /* renamed from: A */
    public final int m12262A() {
        return this.f20826B;
    }
}
