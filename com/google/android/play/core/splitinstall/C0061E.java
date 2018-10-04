package com.google.android.play.core.splitinstall;

import X.AnonymousClass0cQ;
import X.AnonymousClass21Z;
import X.AnonymousClass21a;
import X.AnonymousClass21n;
import X.AnonymousClass21y;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.play.core.splitinstall.p002a.C0060e;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.E */
public class C0061E extends C0060e {
    /* renamed from: B */
    public final AnonymousClass21y f31929B;
    /* renamed from: C */
    private final /* synthetic */ AnonymousClass21n f31930C;

    public C0061E(AnonymousClass21n anonymousClass21n, AnonymousClass21y anonymousClass21y) {
        this.f31930C = anonymousClass21n;
        int I = AnonymousClass0cQ.I(this, -1565320260);
        this.f31929B = anonymousClass21y;
        AnonymousClass0cQ.H(this, -1220532520, I);
    }

    public void GG(int i, Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, -1488917757);
        this.f31930C.f25335B.m14193A();
        AnonymousClass21n.f25333F.m14198A("onStartInstall(%d)", Integer.valueOf(i));
        AnonymousClass0cQ.H(this, -1767102879, I);
    }

    public final void HG(Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, 954997212);
        this.f31930C.f25335B.m14193A();
        AnonymousClass21n.f25333F.m14198A("onGetSplitsForAppUpdate", new Object[0]);
        AnonymousClass0cQ.H(this, -1578173800, I);
    }

    public final void JB(int i, Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, 1215125741);
        this.f31930C.f25335B.m14193A();
        AnonymousClass21n.f25333F.m14198A("onCancelInstall(%d)", Integer.valueOf(i));
        AnonymousClass0cQ.H(this, -1726548538, I);
    }

    public final void KB(Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, 1783759210);
        this.f31930C.f25335B.m14193A();
        AnonymousClass21n.f25333F.m14198A("onCompleteInstallForAppUpdate", new Object[0]);
        AnonymousClass0cQ.H(this, 597836020, I);
    }

    public void PB(List list) {
        int I = AnonymousClass0cQ.I(this, 757904675);
        this.f31930C.f25335B.m14193A();
        AnonymousClass21n.f25333F.m14198A("onGetSessionStates", new Object[0]);
        AnonymousClass0cQ.H(this, -44833738, I);
    }

    public final void bD(int i, Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, -1279447125);
        this.f31930C.f25335B.m14193A();
        AnonymousClass21n.f25333F.m14198A("onGetSession(%d)", Integer.valueOf(i));
        AnonymousClass0cQ.H(this, 1819870151, I);
    }

    public final void cD(Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, 1402284704);
        this.f31930C.f25335B.m14193A();
        AnonymousClass21n.f25333F.m14198A("onDeferredUninstall", new Object[0]);
        AnonymousClass0cQ.H(this, -1813795154, I);
    }

    public void iC(int i, Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, 1007816199);
        this.f31930C.f25335B.m14193A();
        AnonymousClass21n.f25333F.m14198A("onCompleteInstall(%d)", Integer.valueOf(i));
        AnonymousClass0cQ.H(this, -613417988, I);
    }

    public final void jC(Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, -1703006367);
        this.f31930C.f25335B.m14193A();
        AnonymousClass21n.f25333F.m14198A("onDeferredInstall", new Object[0]);
        AnonymousClass0cQ.H(this, 1107193897, I);
    }

    public final void wG(Bundle bundle) {
        int I = AnonymousClass0cQ.I(this, -538401478);
        this.f31930C.f25335B.m14193A();
        AnonymousClass21Z.m14196B(AnonymousClass21n.f25333F, 6, "onError(%d)", new Object[]{Integer.valueOf(bundle.getInt(TraceFieldType.ErrorCode))});
        this.f31929B.m14215A(new AnonymousClass21a(r5));
        AnonymousClass0cQ.H(this, -454549411, I);
    }
}
