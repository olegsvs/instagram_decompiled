package X;

import android.os.SystemClock;

/* renamed from: X.1O6 */
public final class AnonymousClass1O6 extends AnonymousClass1DL {
    /* renamed from: A */
    public final AnonymousClass1Nl mo2241A() {
        return new AnonymousClass1Nv();
    }

    /* renamed from: B */
    public final boolean mo2242B(AnonymousClass1Nl anonymousClass1Nl) {
        AnonymousClass1Nv anonymousClass1Nv = (AnonymousClass1Nv) anonymousClass1Nl;
        AnonymousClass1OK.m11152B(anonymousClass1Nv, "Null value passed to getSnapshot!");
        anonymousClass1Nv.f17842B = SystemClock.elapsedRealtime();
        anonymousClass1Nv.f17843C = SystemClock.uptimeMillis();
        return true;
    }
}
