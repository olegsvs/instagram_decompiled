package X;

import com.instagram.location.impl.LocationPluginImpl;

/* renamed from: X.1G2 */
public final class AnonymousClass1G2 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ LocationPluginImpl f16179B;
    /* renamed from: C */
    public final /* synthetic */ String f16180C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1Fx f16181D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass1DP f16182E;

    public AnonymousClass1G2(LocationPluginImpl locationPluginImpl, AnonymousClass1DP anonymousClass1DP, String str, AnonymousClass1Fx anonymousClass1Fx) {
        this.f16179B = locationPluginImpl;
        this.f16182E = anonymousClass1DP;
        this.f16180C = str;
        this.f16181D = anonymousClass1Fx;
    }

    public final void run() {
        AnonymousClass0Fk anonymousClass0Fk = AnonymousClass0Fj.f2192B;
        anonymousClass0Fk.f2198G.add(new AnonymousClass1hA(this));
    }
}
