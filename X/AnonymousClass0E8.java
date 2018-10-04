package X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0E8 */
public final class AnonymousClass0E8 implements AnonymousClass0E9 {
    /* renamed from: B */
    private final Handler f1946B = new Handler(Looper.getMainLooper());

    public final boolean WTA(AnonymousClass0R2 anonymousClass0R2, AnonymousClass0Cm anonymousClass0Cm, String str) {
        return false;
    }

    public final boolean bTA(AnonymousClass0R2 anonymousClass0R2, String str, AnonymousClass0Cm anonymousClass0Cm) {
        return false;
    }

    public final String fJ() {
        return "iglive";
    }

    public final void ps(AnonymousClass0R2 anonymousClass0R2, String str, AnonymousClass0Cm anonymousClass0Cm) {
    }

    public final void qs(AnonymousClass0R2 anonymousClass0R2, String str, AnonymousClass0Cm anonymousClass0Cm, boolean z) {
    }

    public final void rHA(AnonymousClass0R2 anonymousClass0R2, AnonymousClass0Cm anonymousClass0Cm, String str) {
    }

    /* renamed from: B */
    private static long m1320B(String str) {
        if (str != null) {
            return Long.parseLong(str);
        }
        return AnonymousClass0Gd.m1838C();
    }

    /* renamed from: C */
    private static long m1321C(String str, long j) {
        SharedPreferences C = AnonymousClass0Mu.m3254C("insta_video_notifications");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("#recent-check");
        String stringBuilder2 = stringBuilder.toString();
        long j2 = C.getLong(stringBuilder2, -1);
        if (j2 < j) {
            C.edit().putLong(stringBuilder2, j).apply();
        }
        return j2;
    }

    public final boolean eTA(AnonymousClass0R2 anonymousClass0R2, String str, AnonymousClass0Cm anonymousClass0Cm) {
        Uri parse = Uri.parse(anonymousClass0R2.m4106A());
        if (AnonymousClass0Cd.f1698B.m963G().contains(parse.getQueryParameter("reel_id"))) {
            return false;
        }
        String str2 = anonymousClass0R2.f4565C;
        if (str2.equals("live_broadcast_revoke")) {
            return false;
        }
        if (str2.equals("live_broadcast")) {
            long B = AnonymousClass0E8.m1320B(parse.getQueryParameter("published_time"));
            if (AnonymousClass0E8.m1321C(str, B) < B) {
                return true;
            }
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Collapse key not supported: ");
        stringBuilder.append(str2);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public final String iT(AnonymousClass0R2 anonymousClass0R2) {
        anonymousClass0R2 = Uri.parse(anonymousClass0R2.m4106A());
        if ("broadcast".equals(anonymousClass0R2.getPath())) {
            return AnonymousClass0St.m4426B(anonymousClass0R2.getQueryParameter("reel_id"), "live_broadcast");
        }
        throw new UnsupportedOperationException("Live notification not handled");
    }

    public final void os(AnonymousClass0R2 anonymousClass0R2, String str, AnonymousClass0Cm anonymousClass0Cm) {
        if (anonymousClass0R2.f4565C.equals("live_broadcast_revoke")) {
            Uri parse = Uri.parse(anonymousClass0R2.m4106A());
            if (!AnonymousClass0Cd.f1698B.m963G().contains(parse.getQueryParameter("reel_id"))) {
                long B = AnonymousClass0E8.m1320B(parse.getQueryParameter("published_time"));
                if (AnonymousClass0E8.m1321C(str, B) <= B) {
                    AnonymousClass55Q.C().B("iglive", str);
                    AnonymousClass0OR.m3624D(this.f1946B, new AnonymousClass0bl(this, parse, anonymousClass0Cm), 2078929964);
                }
            }
        }
    }
}
