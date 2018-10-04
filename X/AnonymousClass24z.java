package X;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;

/* renamed from: X.24z */
public final class AnonymousClass24z {
    /* renamed from: Q */
    private static final Class f25694Q = AnonymousClass24z.class;
    /* renamed from: B */
    public final Handler f25695B;
    /* renamed from: C */
    public boolean f25696C;
    /* renamed from: D */
    public final Context f25697D;
    /* renamed from: E */
    public final ContentObserver f25698E;
    /* renamed from: F */
    public final ContentObserver f25699F;
    /* renamed from: G */
    private final AnonymousClass0nF f25700G;
    /* renamed from: H */
    private final int f25701H;
    /* renamed from: I */
    private final AnonymousClass0Fz f25702I;
    /* renamed from: J */
    private final long f25703J;
    /* renamed from: K */
    private final AnonymousClass24u f25704K;
    /* renamed from: L */
    private final long f25705L;
    /* renamed from: M */
    private AnonymousClass24y f25706M;
    /* renamed from: N */
    private final boolean f25707N;
    /* renamed from: O */
    private final boolean f25708O;
    /* renamed from: P */
    private final int f25709P;

    public AnonymousClass24z(Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass24y anonymousClass24y, int i, int i2, boolean z, boolean z2, AnonymousClass0nF anonymousClass0nF, long j, long j2, AnonymousClass24u anonymousClass24u) {
        this.f25697D = context;
        this.f25702I = anonymousClass0Fz;
        this.f25695B = new Handler(Looper.getMainLooper());
        this.f25706M = anonymousClass24y;
        this.f25701H = i;
        this.f25709P = i2;
        this.f25707N = z2;
        this.f25700G = anonymousClass0nF;
        this.f25705L = j;
        this.f25703J = j2;
        this.f25704K = anonymousClass24u;
        this.f25708O = z;
        Runnable anonymousClass24w = new AnonymousClass24w(this);
        this.f25698E = new AnonymousClass24x(this, this.f25695B, anonymousClass24w);
        this.f25699F = new AnonymousClass24x(this, this.f25695B, anonymousClass24w);
    }

    public AnonymousClass24z(Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass24y anonymousClass24y, boolean z, AnonymousClass0nF anonymousClass0nF) {
        this(context, anonymousClass0Fz, anonymousClass24y, Integer.MAX_VALUE, 0, true, z, anonymousClass0nF, -1, -1, null);
    }

    /* renamed from: A */
    public final void m14359A() {
        AnonymousClass0GA anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass24v(this.f25697D.getContentResolver(), this.f25706M, this.f25701H, this.f25709P, this.f25707N, this.f25705L, this.f25703J, this.f25704K));
        anonymousClass0n3.f9990B = this.f25700G;
        AnonymousClass0Px.B(this.f25697D, this.f25702I, anonymousClass0n3);
        if (this.f25708O) {
            AnonymousClass24z.m14358B(this);
            this.f25697D.getContentResolver().registerContentObserver(Media.EXTERNAL_CONTENT_URI, false, this.f25698E);
            this.f25697D.getContentResolver().registerContentObserver(Video.Media.EXTERNAL_CONTENT_URI, false, this.f25699F);
            this.f25696C = true;
        }
    }

    /* renamed from: B */
    public static void m14358B(AnonymousClass24z anonymousClass24z) {
        if (anonymousClass24z.f25696C) {
            anonymousClass24z.f25696C = false;
            try {
                anonymousClass24z.f25697D.getContentResolver().unregisterContentObserver(anonymousClass24z.f25698E);
            } catch (Throwable e) {
                AnonymousClass0Dc.C(f25694Q, "Photo ContentObserver not registered", e);
            }
            try {
                anonymousClass24z.f25697D.getContentResolver().unregisterContentObserver(anonymousClass24z.f25699F);
            } catch (Throwable e2) {
                AnonymousClass0Dc.C(f25694Q, "Video ContentObserver not registered", e2);
            }
        }
    }
}
