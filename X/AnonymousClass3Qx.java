package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Qx */
public final class AnonymousClass3Qx implements AnonymousClass0F8 {
    /* renamed from: B */
    public final List f41189B = new ArrayList();

    /* renamed from: A */
    public final void m19628A(AnonymousClass14V anonymousClass14V) {
        int I = AnonymousClass0cQ.I(this, 395138950);
        if (AnonymousClass3Qx.m19627C(anonymousClass14V.f13901C, anonymousClass14V.f13900B)) {
            AnonymousClass3Qx.m19626B(this, anonymousClass14V.f13900B);
            AnonymousClass0cQ.H(this, -414128894, I);
            return;
        }
        AnonymousClass0cQ.H(this, 715002217, I);
    }

    /* renamed from: B */
    public static void m19626B(AnonymousClass3Qx anonymousClass3Qx, String str) {
        for (int size = anonymousClass3Qx.f41189B.size() - 1; size >= 0; size--) {
            ((AnonymousClass3Qw) anonymousClass3Qx.f41189B.get(size)).Al(str);
        }
    }

    /* renamed from: C */
    private static boolean m19627C(String str, String str2) {
        if (("feed_contextual_hashtag".equals(str) || "feed_hashtag".equals(str)) && !"feed_contextual_hashtag".equals(str2)) {
            if (!"feed_hashtag".equals(str2)) {
                String str3 = "peek_media_feed_hashtag";
                if (!str3.equals(str)) {
                    if (!str3.equals(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, 539895308);
        m19628A((AnonymousClass14V) anonymousClass0F6);
        AnonymousClass0cQ.H(this, -1116559030, I);
    }
}
