package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.react.modules.appstate.AppStateModule;

/* renamed from: X.1OC */
public final class AnonymousClass1OC extends AnonymousClass17n {
    /* renamed from: B */
    public final /* synthetic */ Context f17877B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0GX f17878C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass1O0 f17879D;

    public AnonymousClass1OC(Context context, AnonymousClass1O0 anonymousClass1O0, AnonymousClass0GX anonymousClass0GX) {
        this.f17877B = context;
        this.f17879D = anonymousClass1O0;
        this.f17878C = anonymousClass0GX;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass1OD anonymousClass1OD = new AnonymousClass1OD(this.f17877B, this.f17879D);
        this.f17878C.f2384B = anonymousClass1OD;
        AnonymousClass0GX anonymousClass0GX = this.f17878C;
        AnonymousClass1OD anonymousClass1OD2 = anonymousClass0GX.f2384B;
        if (anonymousClass1OD2 != null) {
            Pair A = anonymousClass1OD2.m11131A();
            if (A != null) {
                AnonymousClass1Nz A2 = anonymousClass0GX.f2385C.m11064A((AnonymousClass1Nl) A.second, ((Boolean) A.first).booleanValue() ? AppStateModule.APP_STATE_BACKGROUND : "foreground");
                if (A2 != null) {
                    A2.f17847B.m3298F("source", "disk");
                    A2.f17847B.m3310R();
                    A2.f17847B = null;
                }
            }
        }
        AnonymousClass0Ix.m2385E(anonymousClass1OD.f17882D, 600000);
        return null;
    }
}
