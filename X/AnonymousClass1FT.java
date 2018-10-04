package X;

import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.1FT */
public final class AnonymousClass1FT extends AnonymousClass0Ut {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0UX f16017B;

    public AnonymousClass1FT(AnonymousClass0UX anonymousClass0UX) {
        this.f16017B = anonymousClass0UX;
        super(anonymousClass0UX.f5472H);
    }

    /* renamed from: B */
    public final void mo2252B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0fq anonymousClass0fq) {
        int I = AnonymousClass0cQ.m5859I(this, -1052770323);
        synchronized (this.f16017B) {
            try {
                this.f16017B.f5467C = false;
                Object<DirectShareTarget> A = this.f16017B.f5470F.m10628A();
                if (!A.isEmpty()) {
                    this.f16017B.f5471G.clear();
                    this.f16017B.f5471G.addAll(A);
                    this.f16017B.f5473I.clear();
                    for (DirectShareTarget directShareTarget : A) {
                        if (!directShareTarget.m4806D()) {
                            this.f16017B.f5473I.add(directShareTarget.m4804B().get(0));
                        }
                    }
                    this.f16017B.f5468D = true;
                }
            } finally {
                while (true) {
                }
                AnonymousClass0cQ.m5858H(this, 1662700741, I);
            }
        }
    }

    /* renamed from: C */
    public final void mo2171C(AnonymousClass0Cm anonymousClass0Cm) {
        int I = AnonymousClass0cQ.m5859I(this, 1175657262);
        synchronized (this.f16017B) {
            try {
                this.f16017B.f5469E = false;
                AnonymousClass0F4.f2058E.m1505B(new AnonymousClass1EM());
            } finally {
                while (true) {
                }
                AnonymousClass0cQ.m5858H(this, -1699934643, I);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: F */
    public final /* bridge */ /* synthetic */ void mo1341F(X.AnonymousClass0Cm r9, java.lang.Object r10) {
        /*
        r8 = this;
        r0 = 1028770788; // 0x3d51cbe4 float:0.051219836 double:5.08280304E-315;
        r3 = X.AnonymousClass0cQ.m5859I(r8, r0);
        r10 = (X.AnonymousClass1FY) r10;
        r0 = -838832231; // 0xffffffffce006f99 float:-5.3869933E8 double:NaN;
        r2 = X.AnonymousClass0cQ.m5859I(r8, r0);
        r4 = r8.f16017B;
        monitor-enter(r4);
        r1 = r8.f16017B;	 Catch:{ all -> 0x0097 }
        r0 = 1;
        r1.f5467C = r0;	 Catch:{ all -> 0x0097 }
        r0 = r8.f16017B;	 Catch:{ all -> 0x0097 }
        r0 = r0.f5471G;	 Catch:{ all -> 0x0097 }
        r0.clear();	 Catch:{ all -> 0x0097 }
        r0 = r8.f16017B;	 Catch:{ all -> 0x0097 }
        r1 = r0.f5466B;	 Catch:{ all -> 0x0097 }
        r0 = r10.f16023E;	 Catch:{ all -> 0x0097 }
        r0 = X.AnonymousClass1Hp.m10632C(r1, r9, r0);	 Catch:{ all -> 0x0097 }
        r7 = r0.iterator();	 Catch:{ all -> 0x0097 }
    L_0x002d:
        r0 = r7.hasNext();	 Catch:{ all -> 0x0097 }
        if (r0 == 0) goto L_0x006a;
    L_0x0033:
        r1 = r7.next();	 Catch:{ all -> 0x0097 }
        r1 = (com.instagram.model.direct.DirectShareTarget) r1;	 Catch:{ all -> 0x0097 }
        r0 = r1.m4804B();	 Catch:{ all -> 0x0097 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0097 }
        if (r0 == 0) goto L_0x0062;
    L_0x0043:
        r0 = r1.f5604E;	 Catch:{ all -> 0x0097 }
        if (r0 != 0) goto L_0x0049;
    L_0x0047:
        r6 = 0;
        goto L_0x004b;
    L_0x0049:
        r6 = r0.f5871C;	 Catch:{ all -> 0x0097 }
    L_0x004b:
        r5 = "DirectStoryRecipientSource";
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0097 }
        r1.<init>();	 Catch:{ all -> 0x0097 }
        r0 = "No users in story share target with thread ID: ";
        r1.append(r0);	 Catch:{ all -> 0x0097 }
        r1.append(r6);	 Catch:{ all -> 0x0097 }
        r0 = r1.toString();	 Catch:{ all -> 0x0097 }
        X.AnonymousClass0Gn.m1876C(r5, r0);	 Catch:{ all -> 0x0097 }
        goto L_0x002d;
    L_0x0062:
        r0 = r8.f16017B;	 Catch:{ all -> 0x0097 }
        r0 = r0.f5471G;	 Catch:{ all -> 0x0097 }
        r0.add(r1);	 Catch:{ all -> 0x0097 }
        goto L_0x002d;
    L_0x006a:
        r0 = r8.f16017B;	 Catch:{ all -> 0x0097 }
        r0 = r0.f5473I;	 Catch:{ all -> 0x0097 }
        r0.clear();	 Catch:{ all -> 0x0097 }
        r0 = r8.f16017B;	 Catch:{ all -> 0x0097 }
        r1 = r0.f5473I;	 Catch:{ all -> 0x0097 }
        r0 = r10.f16023E;	 Catch:{ all -> 0x0097 }
        r0 = X.AnonymousClass1Hp.m10633D(r0);	 Catch:{ all -> 0x0097 }
        r1.addAll(r0);	 Catch:{ all -> 0x0097 }
        r0 = r8.f16017B;	 Catch:{ all -> 0x0097 }
        r1 = r0.f5470F;	 Catch:{ all -> 0x0097 }
        r0 = r8.f16017B;	 Catch:{ all -> 0x0097 }
        r0 = r0.f5471G;	 Catch:{ all -> 0x0097 }
        r1.m10629B(r0);	 Catch:{ all -> 0x0097 }
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        r0 = -1205240493; // 0xffffffffb8297d53 float:-4.0409457E-5 double:NaN;
        X.AnonymousClass0cQ.m5858H(r8, r0, r2);
        r0 = -478051548; // 0xffffffffe3818324 float:-4.7781593E21 double:NaN;
        X.AnonymousClass0cQ.m5858H(r8, r0, r3);
        return;
    L_0x0097:
        r1 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        r0 = 1507489664; // 0x59da7780 float:7.6866171E15 double:7.447988544E-315;
        X.AnonymousClass0cQ.m5858H(r8, r0, r2);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1FT.F(X.0Cm, java.lang.Object):void");
    }
}
