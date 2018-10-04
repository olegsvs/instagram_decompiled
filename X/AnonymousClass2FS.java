package X;

import android.content.SharedPreferences;

/* renamed from: X.2FS */
public final class AnonymousClass2FS {
    /* renamed from: D */
    public static AnonymousClass2FS f28043D;
    /* renamed from: B */
    public SharedPreferences f28044B;
    /* renamed from: C */
    public SharedPreferences f28045C;

    private AnonymousClass2FS(AnonymousClass0Cm anonymousClass0Cm) {
        this.f28045C = AnonymousClass0Mu.B(anonymousClass0Cm, "igLivePreferences");
        this.f28044B = AnonymousClass0Mu.B(anonymousClass0Cm, "hiddenLiveCommentPreferences");
    }

    /* renamed from: B */
    public static synchronized AnonymousClass2FS m14832B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass2FS anonymousClass2FS;
        synchronized (AnonymousClass2FS.class) {
            if (f28043D == null) {
                f28043D = new AnonymousClass2FS(anonymousClass0Cm);
            }
            anonymousClass2FS = f28043D;
        }
        return anonymousClass2FS;
    }
}
