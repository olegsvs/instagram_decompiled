package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.0Ea */
public final class AnonymousClass0Ea extends AnonymousClass0Eb {
    /* renamed from: C */
    public static AnonymousClass0Ea f1980C;
    /* renamed from: B */
    private final AnonymousClass0EW f1981B;

    private AnonymousClass0Ea(Context context, AnonymousClass0EW anonymousClass0EW, AnonymousClass0G4 anonymousClass0G4, AnonymousClass0G4 anonymousClass0G42, AnonymousClass0EX[] anonymousClass0EXArr) {
        AnonymousClass0EW anonymousClass0EW2 = anonymousClass0EW;
        AnonymousClass0Jw anonymousClass0Jw = new AnonymousClass0Jw(anonymousClass0EW2);
        AnonymousClass0Jx anonymousClass0Kc = new AnonymousClass0Kc();
        AnonymousClass0C9 anonymousClass0C9 = AwakeTimeSinceBootClock.get();
        AnonymousClass0Jy anonymousClass0Jy = AnonymousClass0Kd.f3087B;
        AnonymousClass0Jz anonymousClass0Jz = new AnonymousClass0Jz();
        AnonymousClass0K0 anonymousClass0K0 = new AnonymousClass0K0();
        if (AnonymousClass0K1.f2952B == null) {
            AnonymousClass0K1.f2952B = new AnonymousClass0K1();
        }
        super(anonymousClass0G4, anonymousClass0Jw, anonymousClass0Kc, anonymousClass0G42, anonymousClass0C9, anonymousClass0Jy, anonymousClass0Jz, anonymousClass0K0, AnonymousClass0K1.f2952B, new AnonymousClass0Ke(context), anonymousClass0EXArr, new AnonymousClass0K3[]{new AnonymousClass0Kf()}, null, null, null);
        this.f1981B = anonymousClass0EW2;
    }

    /* renamed from: B */
    public static void m1405B(Context context, AnonymousClass0EW anonymousClass0EW, AnonymousClass0EX... anonymousClass0EXArr) {
        Context context2 = context;
        AnonymousClass0EW anonymousClass0EW2 = anonymousClass0EW;
        f1980C = new AnonymousClass0Ea(context2, anonymousClass0EW2, new AnonymousClass0Ka(new AnonymousClass0KR()), new AnonymousClass0Kb(new AnonymousClass0KU()), anonymousClass0EXArr);
    }

    /* renamed from: i */
    public final void m1406i(int i, long j) {
        m1457e(i);
        AnonymousClass0OR.m3626F(new Handler(Looper.getMainLooper()), new AnonymousClass23a(this, i), j, -443276263);
    }

    /* renamed from: j */
    public final void m1407j(int i, int i2) {
        AnonymousClass0EW anonymousClass0EW = this.f1981B;
        synchronized (anonymousClass0EW) {
            Object obj = (anonymousClass0EW.f1978B.containsKey(Integer.valueOf(i)) && ((Integer) anonymousClass0EW.f1978B.get(Integer.valueOf(i))).intValue() == i2) ? 1 : null;
        }
        if (obj != null) {
            return;
        }
        if (m1429C(i)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Sampling rate must be set before calling markerStart(). markerId: ");
            stringBuilder.append(i);
            stringBuilder.append(" samplingRate: ");
            stringBuilder.append(i2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        AnonymousClass0EW anonymousClass0EW2 = this.f1981B;
        synchronized (anonymousClass0EW2) {
            anonymousClass0EW2.f1978B.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
