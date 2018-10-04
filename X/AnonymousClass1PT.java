package X;

import android.content.Context;
import android.os.Bundle;
import java.net.CookieHandler;
import java.util.Map;

/* renamed from: X.1PT */
public final class AnonymousClass1PT extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0HE f18165B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2MQ f18166C;
    /* renamed from: D */
    public final /* synthetic */ Context f18167D;
    /* renamed from: E */
    public final /* synthetic */ CookieHandler f18168E;

    public AnonymousClass1PT(AnonymousClass0HE anonymousClass0HE, Context context, CookieHandler cookieHandler, AnonymousClass2MQ anonymousClass2MQ) {
        this.f18165B = anonymousClass0HE;
        this.f18167D = context;
        this.f18168E = cookieHandler;
        this.f18166C = anonymousClass2MQ;
    }

    /* renamed from: A */
    public final void m11266A(AnonymousClass3c8 anonymousClass3c8) {
        int I = AnonymousClass0cQ.m5859I(this, 1698877444);
        if (!this.f18165B.f2580D) {
            if (!anonymousClass3c8.G()) {
                AnonymousClass1TQ.m11546E(anonymousClass3c8);
                if (anonymousClass3c8.f42719D == AnonymousClass3c7.f42712D) {
                    AnonymousClass0S2 B = AnonymousClass0S2.m4299B(anonymousClass3c8.f42721F);
                    AnonymousClass0HE anonymousClass0HE = this.f18165B;
                    Context context = this.f18167D;
                    CookieHandler cookieHandler = this.f18168E;
                    Map F = anonymousClass3c8.F();
                    synchronized (anonymousClass0HE) {
                        if (anonymousClass0HE.f2579C) {
                            if (B != AnonymousClass0S2.UNKNOWN) {
                                anonymousClass0HE.f2580D = true;
                                anonymousClass0HE.f2581E = false;
                                Bundle bundle = new Bundle();
                                String str = "headline";
                                bundle.putString(str, (String) F.get(str));
                                str = "content";
                                bundle.putString(str, (String) F.get(str));
                                str = "download_data_link";
                                bundle.putString(str, (String) F.get(str));
                                AnonymousClass0JY.f2926B.mo611B(AnonymousClass0S2.UNDERAGE, bundle).eOA(Integer.valueOf(335544320)).RSA(AnonymousClass0FL.m1561D(AnonymousClass0G7.m1741H(cookieHandler))).FZ(context);
                            } else {
                                AnonymousClass0Gn.m1876C("Challenge", "Challenge Type Invalid");
                            }
                        }
                    }
                } else {
                    this.f18165B.m1972D(this.f18167D, AnonymousClass0G7.m1741H(this.f18168E), anonymousClass3c8.f42721F, anonymousClass3c8.f42722G, anonymousClass3c8.F());
                }
                this.f18165B.f2578B = false;
                AnonymousClass0cQ.m5858H(this, 1793239, I);
                return;
            }
        }
        AnonymousClass0cQ.m5858H(this, 33757433, I);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, 1340447787);
        if (anonymousClass0Q6.m3972A()) {
            AnonymousClass0Gn.m1880G("Failed to get RN checkpoint", anonymousClass0Q6.f4287B);
        }
        this.f18165B.f2578B = false;
        AnonymousClass0HE.m1968B(this.f18165B, this.f18167D, this.f18168E, this.f18166C);
        AnonymousClass0cQ.m5858H(this, 109629126, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 1276638479);
        m11266A((AnonymousClass3c8) obj);
        AnonymousClass0cQ.m5858H(this, -1449705884, I);
    }
}
