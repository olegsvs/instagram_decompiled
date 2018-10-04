package X;

/* renamed from: X.41l */
public enum AnonymousClass41l extends AnonymousClass3ew {
    public AnonymousClass41l(String str, int i, int i2, String str2, int i3) {
        super(str, i, i2, str2, i3);
    }

    /* renamed from: A */
    public final void mo5015A(AnonymousClass0IL anonymousClass0IL, AnonymousClass0iO anonymousClass0iO, AnonymousClass0mR anonymousClass0mR, AnonymousClass0Cm anonymousClass0Cm) {
        if (AnonymousClass0a3.B()) {
            AnonymousClass0Mt.H(anonymousClass0Cm).edit().putBoolean("personal_linked", true).apply();
        } else {
            AnonymousClass0Mt.G().edit().putBoolean("personal_linked", true).apply();
        }
        if (!AnonymousClass0Ce.G(anonymousClass0IL.getArguments()).B().i()) {
            anonymousClass0iO.A(anonymousClass0mR);
        } else if (anonymousClass0mR == AnonymousClass0mR.SHARE_PHOTO) {
            anonymousClass0iO.C(anonymousClass0mR);
        } else {
            anonymousClass0iO.B(AnonymousClass2HL.PUBLISH_AS_SELF_OR_MANAGED_PAGE, anonymousClass0mR);
        }
    }

    /* renamed from: F */
    public final String mo5016F(AnonymousClass0Cm anonymousClass0Cm) {
        if (anonymousClass0Cm.B().i()) {
            return anonymousClass0Cm.B().mB;
        }
        return AnonymousClass0a2.J(anonymousClass0Cm);
    }

    /* renamed from: G */
    public final boolean mo5017G(AnonymousClass0Cm anonymousClass0Cm) {
        return AnonymousClass0a2.K(anonymousClass0Cm) && AnonymousClass0FO.S(anonymousClass0Cm, AnonymousClass2HL.PUBLISH_AS_SELF_OR_MANAGED_PAGE);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: H */
    public final boolean mo5018H(X.AnonymousClass0Cm r7, boolean r8) {
        /*
        r6 = this;
        r0 = r6.mo5017G(r7);
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        r0 = 1;
        return r0;
    L_0x0008:
        r2 = new X.2HF;
        r2.<init>(r7);
        r0 = r2.f28453C;
        r0 = r0.f28436B;
        r0 = android.text.TextUtils.isEmpty(r0);
        r7 = r0 ^ 1;
        if (r7 != 0) goto L_0x0056;
    L_0x0019:
        if (r8 != 0) goto L_0x0033;
    L_0x001b:
        r0 = r2.f28454D;
        if (r0 != 0) goto L_0x0030;
    L_0x001f:
        r0 = r2.f28453C;
        r5 = r0.f28437C;
        r3 = java.lang.System.currentTimeMillis();
        r0 = X.AnonymousClass2HF.f28451F;
        r3 = r3 - r0;
        r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r0 >= 0) goto L_0x0030;
    L_0x002e:
        r0 = 1;
        goto L_0x0031;
    L_0x0030:
        r0 = 0;
    L_0x0031:
        if (r0 == 0) goto L_0x0056;
    L_0x0033:
        r0 = 1;
        r2.f28454D = r0;
        r1 = new X.0Pt;
        r0 = r2.f28455E;
        r1.<init>(r0);
        r0 = X.AnonymousClass0Pu.f4247G;
        r1.f4226J = r0;
        r0 = "fb/get_connected_fbid/";
        r1.f4229M = r0;
        r0 = X.AnonymousClass0lI.class;
        r0 = r1.M(r0);
        r1 = r0.H();
        r0 = r2.f28452B;
        r1.f2849B = r0;
        X.AnonymousClass0Ix.D(r1);
    L_0x0056:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.41l.H(X.0Cm, boolean):boolean");
    }

    /* renamed from: I */
    public final boolean mo5019I(AnonymousClass0OB anonymousClass0OB) {
        return anonymousClass0OB.TX();
    }

    /* renamed from: J */
    public final boolean mo5020J(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0OB anonymousClass0OB) {
        boolean z = false;
        if (!(anonymousClass0OB.IV() && AnonymousClass0FO.U(anonymousClass0Cm))) {
            if (!((Boolean) AnonymousClass0CC.TC.H(anonymousClass0Cm)).booleanValue()) {
                return super.mo5020J(anonymousClass0Cm, anonymousClass0OB);
            }
            if (anonymousClass0OB.eI() == AnonymousClass0ZS.DEFAULT) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: M */
    public final void mo5021M(AnonymousClass0OB anonymousClass0OB, boolean z) {
        anonymousClass0OB.lOA(z);
    }

    /* renamed from: O */
    public final void mo5022O(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0FO.G(anonymousClass0Cm, true);
    }
}
