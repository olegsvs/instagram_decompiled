package X;

import android.content.Context;
import android.os.HandlerThread;

/* renamed from: X.6B4 */
public final class AnonymousClass6B4 {
    /* renamed from: B */
    public final AnonymousClass6H2 f72668B;
    /* renamed from: C */
    private final boolean f72669C;
    /* renamed from: D */
    private long f72670D;
    /* renamed from: E */
    private long f72671E;
    /* renamed from: F */
    private final boolean f72672F;

    public AnonymousClass6B4(AnonymousClass6H2 anonymousClass6H2, boolean z, boolean z2) {
        this.f72668B = anonymousClass6H2;
        this.f72672F = z;
        this.f72669C = z2;
    }

    /* renamed from: A */
    public final void m29307A() {
        AnonymousClass6H2 anonymousClass6H2 = this.f72668B;
        anonymousClass6H2.m29850B();
        anonymousClass6H2.f73882C.getLooper().quitSafely();
    }

    /* renamed from: B */
    public static AnonymousClass6B4 m29305B(AnonymousClass0Cm anonymousClass0Cm, Context context) {
        HandlerThread handlerThread = new HandlerThread("videocall-soundplayer-thread");
        handlerThread.start();
        return new AnonymousClass6B4(new AnonymousClass6H2(context, new AnonymousClass6B3(context, handlerThread.getLooper())), ((Boolean) AnonymousClass0CC.Vj.H(anonymousClass0Cm)).booleanValue(), ((Boolean) AnonymousClass0CC.Gj.H(anonymousClass0Cm)).booleanValue());
    }

    /* renamed from: B */
    public final void m29308B(AnonymousClass6Ge anonymousClass6Ge) {
        if (this.f72669C) {
            this.f72668B.m29849A(AnonymousClass6Az.END_CALL, 0, false, anonymousClass6Ge);
            return;
        }
        if (anonymousClass6Ge != null) {
            anonymousClass6Ge.m29801A();
        }
    }

    /* renamed from: C */
    public final void m29309C() {
        if (this.f72669C) {
            if (!AnonymousClass6B4.m29306C(this.f72670D)) {
                this.f72670D = System.currentTimeMillis();
                this.f72668B.m29849A(AnonymousClass6Az.JOIN, 0, false, null);
            }
        }
    }

    /* renamed from: C */
    private static boolean m29306C(long j) {
        return System.currentTimeMillis() - j < 500;
    }

    /* renamed from: D */
    public final void m29310D() {
        if (this.f72669C) {
            if (!AnonymousClass6B4.m29306C(this.f72671E)) {
                this.f72671E = System.currentTimeMillis();
                this.f72668B.m29849A(AnonymousClass6Az.LEAVE, 0, false, null);
            }
        }
    }

    /* renamed from: E */
    public final void m29311E() {
        if (this.f72669C) {
            this.f72668B.m29849A(AnonymousClass6Az.RINGBACK, 0, true, null);
        }
    }

    /* renamed from: F */
    public final void m29312F() {
        if (this.f72672F) {
            this.f72668B.m29849A(AnonymousClass6Az.RINGTONE, 5, true, null);
        }
    }
}
