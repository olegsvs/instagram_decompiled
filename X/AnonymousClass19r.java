package X;

import android.content.SharedPreferences;

/* renamed from: X.19r */
public final class AnonymousClass19r {
    /* renamed from: C */
    public static AnonymousClass19r f15188C;
    /* renamed from: B */
    public SharedPreferences f15189B = AnonymousClass0Mu.m3254C("hiddenLiveVideoPreferences");

    private AnonymousClass19r() {
    }

    /* renamed from: A */
    public final boolean m9707A(AnonymousClass0Pm anonymousClass0Pm) {
        return this.f15189B.getBoolean(anonymousClass0Pm.f4148B, false);
    }

    /* renamed from: B */
    public static synchronized AnonymousClass19r m9706B() {
        AnonymousClass19r anonymousClass19r;
        synchronized (AnonymousClass19r.class) {
            if (f15188C == null) {
                f15188C = new AnonymousClass19r();
            }
            anonymousClass19r = f15188C;
        }
        return anonymousClass19r;
    }
}
