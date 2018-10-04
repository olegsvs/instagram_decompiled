package X;

import android.app.Activity;
import android.os.Handler;
import java.util.List;
import java.util.Map;

/* renamed from: X.4M2 */
public final class AnonymousClass4M2 {
    /* renamed from: B */
    public final Activity f53144B;
    /* renamed from: C */
    public final AnonymousClass38H f53145C;
    /* renamed from: D */
    public final AnonymousClass0dF f53146D;
    /* renamed from: E */
    public boolean f53147E = false;
    /* renamed from: F */
    public final AnonymousClass0IP f53148F;
    /* renamed from: G */
    public final AnonymousClass0Cm f53149G;
    /* renamed from: H */
    private final AnonymousClass4Lw f53150H;

    public AnonymousClass4M2(Activity activity, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass38H anonymousClass38H, AnonymousClass4Lw anonymousClass4Lw, AnonymousClass0dF anonymousClass0dF, AnonymousClass0IP anonymousClass0IP) {
        this.f53144B = activity;
        this.f53149G = anonymousClass0Cm;
        this.f53145C = anonymousClass38H;
        this.f53150H = anonymousClass4Lw;
        this.f53146D = anonymousClass0dF;
        this.f53148F = anonymousClass0IP;
        this.f53148F.schedule(new AnonymousClass4Lx(this));
    }

    /* renamed from: A */
    public final void m23975A() {
        if (this.f53147E) {
            this.f53148F.schedule(new AnonymousClass4Ly(this));
        }
    }

    /* renamed from: B */
    public final void m23976B(Map map) {
        List<AnonymousClass36h> I = this.f53145C.m18691I();
        if (!map.isEmpty() || !I.isEmpty()) {
            Object obj = null;
            for (AnonymousClass36h anonymousClass36h : I) {
                if (!anonymousClass36h.f37888R) {
                    if (!anonymousClass36h.m18537C()) {
                        Integer num = (Integer) map.get(anonymousClass36h.f37882L);
                        int i = anonymousClass36h.f37876F;
                        if (num != null && AnonymousClass38R.m18721B(i, num.intValue()) < 0) {
                            anonymousClass36h.f37876F = num.intValue();
                            this.f53147E = true;
                        }
                        if (obj == null && i == 0) {
                            obj = 1;
                        }
                    }
                }
            }
            if (obj == null) {
                AnonymousClass4Lw anonymousClass4Lw = this.f53150H;
                anonymousClass4Lw.f53134B.schedule(new AnonymousClass4Lv(anonymousClass4Lw));
            }
            Handler handler = this.f53144B.getWindow().getDecorView().getHandler();
            if (handler != null) {
                AnonymousClass0OR.D(handler, new AnonymousClass4M0(this), 789459138);
            }
        }
    }
}
