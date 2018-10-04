package X;

import com.instagram.creation.fragment.FollowersShareFragment;

/* renamed from: X.4VM */
public final class AnonymousClass4VM implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ FollowersShareFragment f54733B;

    public AnonymousClass4VM(FollowersShareFragment followersShareFragment) {
        this.f54733B = followersShareFragment;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r7 = this;
        r0 = r7.f54733B;
        r0 = r0.f64934R;
        r0 = r0.m18980Q();
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r0 = r7.f54733B;
        r0 = r0.f64934R;
        r2 = r0.f38949C;
        goto L_0x0019;
    L_0x0011:
        r0 = r7.f54733B;
        r0 = r0.f64934R;
        r2 = r0.m18973J();
    L_0x0019:
        r1 = r7.f54733B;
        r0 = com.instagram.pendingmedia.store.PendingMediaStore.C();
        r0 = r0.A(r2);
        r1.f64927K = r0;
        r1 = r7.f54733B;
        r0 = new X.2MW;
        r0.<init>();
        r1.f64922F = r0;
        r0 = r7.f54733B;
        r0 = r0.f64919C;
        if (r0 == 0) goto L_0x0041;
    L_0x0034:
        r2 = X.AnonymousClass3ew.FACEBOOK;
        r0 = r7.f54733B;
        r1 = r0.f64927K;
        r0 = X.AnonymousClass0Mt.C();
        r2.mo5021M(r1, r0);
    L_0x0041:
        r0 = r7.f54733B;
        r0 = r0.f64927K;
        r0 = r0.tB;
        r6 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x006e;
    L_0x004b:
        r0 = r7.f54733B;
        r0 = r0.f64927K;
        r1 = r0.tB;
        r0 = "date_time_original";
        r4 = r1.get(r0);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x006e;
    L_0x005b:
        r3 = r7.f54733B;
        r0 = r3.f64927K;
        r1 = r0.gB;
        r0 = X.AnonymousClass0ON.PHOTO;
        if (r1 != r0) goto L_0x0067;
    L_0x0065:
        r0 = 1;
        goto L_0x0068;
    L_0x0067:
        r0 = 0;
    L_0x0068:
        r0 = X.AnonymousClass2Mc.m15229B(r4, r0);
        r3.f64937U = r0;
    L_0x006e:
        r0 = r7.f54733B;
        r0 = r0.f64934R;
        r0 = r0.m18980Q();
        if (r0 == 0) goto L_0x00ac;
    L_0x0078:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0 = r7.f54733B;
        r0 = r0.f64934R;
        r0 = r0.m18972I();
        r4 = r0.iterator();
    L_0x0089:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00a5;
    L_0x008f:
        r3 = r4.next();
        r3 = (com.instagram.creation.base.MediaSession) r3;
        r0 = r7.f54733B;
        r1 = r0.f64929M;
        r0 = r3.m18991B();
        r0 = r1.LP(r0);
        r5.add(r0);
        goto L_0x0089;
    L_0x00a5:
        r0 = r7.f54733B;
        r0 = r0.f64927K;
        r0.z(r5);
    L_0x00ac:
        r3 = r7.f54733B;
        r1 = r3.getContext();
        r0 = r7.f54733B;
        r0 = r0.f64938V;
        r0 = X.AnonymousClass3ew.m20318C(r1, r0);
        r3.f64918B = r0;
        r3 = X.AnonymousClass0F4.f2058E;
        r1 = X.AnonymousClass4XW.class;
        r0 = r7.f54733B;
        r0 = r0.f64939W;
        r3.A(r1, r0);
        r0 = r7.f54733B;
        r0 = r0.f64938V;
        r4 = X.AnonymousClass0HV.D(r0);
        r1 = X.AnonymousClass3ew.FACEBOOK;
        r0 = r7.f54733B;
        r0 = r0.f64938V;
        r0 = r1.mo5023L(r0);
        if (r0 != 0) goto L_0x00f9;
    L_0x00db:
        r0 = r7.f54733B;
        r0 = r0.f64938V;
        r0 = X.AnonymousClass3ev.m20315D(r0);
        if (r0 != 0) goto L_0x00f9;
    L_0x00e5:
        r0 = r7.f54733B;
        r0 = r0.f64927K;
        r0 = r0.Cc();
        if (r0 == 0) goto L_0x00fa;
    L_0x00ef:
        r0 = r7.f54733B;
        r0 = r0.f64938V;
        r0 = X.AnonymousClass0FO.V(r0);
        if (r0 != 0) goto L_0x00fa;
    L_0x00f9:
        r6 = 1;
    L_0x00fa:
        r3 = X.AnonymousClass3ew.FACEBOOK;
        r0 = r7.f54733B;
        r1 = r0.f64938V;
        r0 = r7.f54733B;
        r0 = r0.f64927K;
        r0 = r3.m20329K(r1, r0);
        if (r0 == 0) goto L_0x0171;
    L_0x010a:
        if (r6 == 0) goto L_0x0158;
    L_0x010c:
        r0 = r7.f54733B;
        r0 = r0.f64938V;
        r0 = r0.B();
        r0 = r0.I();
        if (r0 == 0) goto L_0x0171;
    L_0x011a:
        r1 = X.AnonymousClass0CC.kC;
        r0 = r7.f54733B;
        r0 = r0.f64938V;
        r0 = r1.H(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0171;
    L_0x012c:
        r1 = X.AnonymousClass0CC.jC;
        r0 = r7.f54733B;
        r0 = r0.f64938V;
        r0 = r1.H(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0171;
    L_0x013e:
        r0 = r4.a();
        if (r0 == 0) goto L_0x0150;
    L_0x0144:
        r1 = r4.a();
        r0 = "on";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0171;
    L_0x0150:
        r0 = r7.f54733B;
        r0 = r0.f64927K;
        r3.mo5021M(r0, r2);
        goto L_0x0171;
    L_0x0158:
        r1 = X.AnonymousClass0CC.kC;
        r0 = r7.f54733B;
        r0 = r0.f64938V;
        r0 = r1.H(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0171;
    L_0x016a:
        r0 = r4.a();
        if (r0 == 0) goto L_0x0150;
    L_0x0170:
        goto L_0x0144;
    L_0x0171:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.4VM.run():void");
    }
}
