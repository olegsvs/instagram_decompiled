package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.List;

/* renamed from: X.4e8 */
public final class AnonymousClass4e8 {
    /* renamed from: B */
    public final AnonymousClass0F8 f55931B = new AnonymousClass4e6(this);
    /* renamed from: C */
    public Handler f55932C;
    /* renamed from: D */
    private final Context f55933D;
    /* renamed from: E */
    private final AnonymousClass0hK f55934E;
    /* renamed from: F */
    private final int f55935F;
    /* renamed from: G */
    private final AnonymousClass0Cm f55936G;

    public AnonymousClass4e8(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0hK anonymousClass0hK) {
        this.f55933D = context;
        this.f55936G = anonymousClass0Cm;
        this.f55934E = anonymousClass0hK;
        this.f55935F = ((Integer) AnonymousClass0CC.pG.G()).intValue();
    }

    /* renamed from: A */
    public final void m24646A() {
        if (AnonymousClass0Tt.C(this.f55936G).f5274D) {
            AnonymousClass4e8.m24644B(this);
            return;
        }
        AnonymousClass0F4 anonymousClass0F4 = AnonymousClass0F4.f2058E;
        anonymousClass0F4.A(AnonymousClass0Wd.class, this.f55931B);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f55932C = handler;
        AnonymousClass0OR.F(handler, new AnonymousClass4e7(this, anonymousClass0F4), (long) this.f55935F, -471482746);
    }

    /* renamed from: B */
    public static void m24644B(AnonymousClass4e8 anonymousClass4e8) {
        AnonymousClass2E7 C = anonymousClass4e8.m24645C();
        AnonymousClass0HV.D(anonymousClass4e8.f55936G).v(System.currentTimeMillis());
        AnonymousClass0hK anonymousClass0hK = anonymousClass4e8.f55934E;
        if (anonymousClass0hK != null && C != null) {
            String str = C.f27806C;
            String str2 = C.f27805B;
            anonymousClass4e8 = anonymousClass0hK.f8382B.f7243G;
            AnonymousClass0LH.E(anonymousClass4e8.f7078F);
            View view = anonymousClass4e8.f7078F.f41550B;
            if (view != null && view.getWidth() != 0 && view.getHeight() != 0 && anonymousClass4e8.f7077E.EX(AnonymousClass0cA.FEED) && !anonymousClass4e8.f7080H) {
                anonymousClass4e8.f7080H = true;
                anonymousClass4e8.f7078F.m19720D(new AnonymousClass3Tj(str, str2), JsonMappingException.MAX_REFS_TO_LIST, 5000, new AnonymousClass3Tw(anonymousClass4e8));
            }
        }
    }

    /* renamed from: C */
    private AnonymousClass2E7 m24645C() {
        long longValue = Long.valueOf(AnonymousClass0HV.D(this.f55936G).f2646B.getLong("direct_tab_tooltip_timestamp_ms", 0)).longValue();
        List<AnonymousClass0Vw> b = AnonymousClass0Tw.C(this.f55936G).b(false, AnonymousClass0Ws.UNREAD);
        if (longValue > 0) {
            for (AnonymousClass0Vw anonymousClass0Vw : b) {
                AnonymousClass0W7 H = anonymousClass0Vw.H();
                if (!H.S(this.f55936G.B()) && H.K() / 1000 > longValue) {
                    return new AnonymousClass2E7(anonymousClass0Vw.S(), AnonymousClass0WB.B(anonymousClass0Vw.d(), this.f55936G, H, this.f55933D.getResources()));
                }
            }
        }
        return null;
    }
}
