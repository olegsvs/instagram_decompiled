package X;

/* renamed from: X.5Cj */
public final class AnonymousClass5Cj {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static void m25962B(X.AnonymousClass5Ci r13, X.AnonymousClass0Pj r14, X.AnonymousClass0Cm r15) {
        /*
        r0 = X.AnonymousClass15c.MUSIC_OVERLAY;
        r0 = r14.N(r0);
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r3 = X.AnonymousClass0Ww.F(r0);
        r3 = (X.AnonymousClass0ZF) r3;
        goto L_0x0010;
    L_0x000f:
        r3 = 0;
    L_0x0010:
        if (r3 == 0) goto L_0x0123;
    L_0x0012:
        r0 = r3.f6314V;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0123;
    L_0x001a:
        r0 = X.AnonymousClass0CC.hf;
        r0 = r0.H(r15);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x002a;
    L_0x0028:
        goto L_0x0123;
    L_0x002a:
        r0 = r13.f61135B;
        if (r0 != 0) goto L_0x0043;
    L_0x002e:
        r0 = r13.f61136C;
        r1 = r0.inflate();
        r1 = (android.widget.FrameLayout) r1;
        r13.f61135B = r1;
        r0 = 2131298249; // 0x7f0907c9 float:1.8214466E38 double:1.053001246E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r13.f61137D = r0;
    L_0x0043:
        r1 = r13.f61135B;
        r0 = 0;
        r1.setVisibility(r0);
        r0 = r13.f61135B;
        r9 = r0.getContext();
        r10 = r9.getResources();
        r2 = r3.f6306N;
        r1 = r3.f6314V;
        r0 = 2131166398; // 0x7f0704be float:1.794704E38 double:1.052936103E-314;
        r11 = r10.getDimensionPixelSize(r0);
        r0 = X.AnonymousClass2Fx.SMALL_ART_SOLID;
        r0 = r0.toString();
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x00ab;
    L_0x006a:
        r0 = X.AnonymousClass2Fx.SMALL_ART_FROSTED;
        r0 = r0.toString();
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0077;
    L_0x0076:
        goto L_0x00ab;
    L_0x0077:
        r0 = X.AnonymousClass2Fx.LARGE_ART_ALBUM;
        r0 = r0.toString();
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00a1;
    L_0x0083:
        r0 = new X.2ba;
        r0.<init>(r9, r2);
        r5 = r0.getIntrinsicWidth();
        r4 = r0.getIntrinsicHeight();
        r0 = 2131166401; // 0x7f0704c1 float:1.7947046E38 double:1.0529361043E-314;
        r6 = r10.getDimensionPixelSize(r0);
        r0 = 2131165263; // 0x7f07004f float:1.7944738E38 double:1.052935542E-314;
        r7 = r10.getDimensionPixelSize(r0);
        r7 = r7 - r6;
        r7 = r7 - r11;
        goto L_0x00c2;
    L_0x00a1:
        r1 = r13.f61135B;
        if (r1 == 0) goto L_0x00aa;
    L_0x00a5:
        r0 = 8;
        r1.setVisibility(r0);
    L_0x00aa:
        return;
    L_0x00ab:
        r1 = new X.2bb;
        r0 = X.AnonymousClass2G8.SOLID;
        r1.<init>(r9, r2, r0);
        r5 = r1.getIntrinsicWidth();
        r4 = r1.getIntrinsicHeight();
        r0 = 2131166397; // 0x7f0704bd float:1.7947038E38 double:1.0529361023E-314;
        r7 = r10.getDimensionPixelSize(r0);
        r6 = r7;
    L_0x00c2:
        r8 = new X.2G9;
        r0 = 2131166405; // 0x7f0704c5 float:1.7947054E38 double:1.0529361063E-314;
        r12 = r10.getDimensionPixelSize(r0);
        r0 = 2131166402; // 0x7f0704c2 float:1.7947048E38 double:1.052936105E-314;
        r2 = r10.getDimensionPixelSize(r0);
        r0 = 2131166403; // 0x7f0704c3 float:1.794705E38 double:1.0529361053E-314;
        r1 = r10.getDimensionPixelSize(r0);
        r0 = 2131166404; // 0x7f0704c4 float:1.7947052E38 double:1.052936106E-314;
        r0 = r10.getDimensionPixelSize(r0);
        r8.<init>(r12, r2, r1, r0);
        r0 = 0;
        r8.setBounds(r0, r0, r11, r11);
        r0 = 2131166399; // 0x7f0704bf float:1.7947042E38 double:1.0529361033E-314;
        r2 = r10.getDimensionPixelSize(r0);
        r0 = 2131099671; // 0x7f060017 float:1.7811702E38 double:1.0529031353E-314;
        r1 = X.AnonymousClass0Ca.C(r9, r0);
        r8.f28204B = r2;
        r0 = r8.f28205C;
        r0.setColor(r1);
        r8.invalidateSelf();
        r0 = r13.f61137D;
        r0.setImageDrawable(r8);
        r0 = r13.f61137D;
        X.AnonymousClass0Nm.h(r0, r7);
        r0 = r13.f61137D;
        X.AnonymousClass0Nm.g(r0, r6);
        r1 = r13.f61135B;
        r0 = new android.widget.FrameLayout$LayoutParams;
        r0.<init>(r5, r4);
        r1.setLayoutParams(r0);
        r1 = r13.f61135B;
        r0 = new X.5Ch;
        r0.<init>(r13, r14, r3);
        X.AnonymousClass0Nm.T(r1, r0);
        return;
    L_0x0123:
        r1 = r13.f61135B;
        if (r1 == 0) goto L_0x00aa;
    L_0x0127:
        goto L_0x00a5;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5Cj.B(X.5Ci, X.0Pj, X.0Cm):void");
    }
}
