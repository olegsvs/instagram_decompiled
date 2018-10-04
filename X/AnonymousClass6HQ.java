package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6HQ */
public final class AnonymousClass6HQ extends AnonymousClass6GD {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6GA f74086B;

    public AnonymousClass6HQ(AnonymousClass6GA anonymousClass6GA) {
        this.f74086B = anonymousClass6GA;
    }

    /* renamed from: A */
    public final void mo6808A(AnonymousClass0Pq anonymousClass0Pq) {
        if (this.f74086B.f73603H != null) {
            AnonymousClass6G8 anonymousClass6G8 = this.f74086B.f73603H;
            if (anonymousClass0Pq.B()) {
                anonymousClass6G8.f73583D.m29662C(AnonymousClass5MI.SERVER_INITIATED, anonymousClass0Pq.toString(), true);
            }
        }
    }

    /* renamed from: C */
    public final void mo6809C(AnonymousClass5Mp anonymousClass5Mp) {
        AnonymousClass6GA anonymousClass6GA = this.f74086B;
        Object obj = (anonymousClass6GA.f73613R || !"ssi_resource".equals(anonymousClass5Mp.f62665C) || anonymousClass5Mp.f62664B == null || !"IG_SUICIDE_PREVENTION_ACTOR".equals(anonymousClass5Mp.f62664B.get("resource"))) ? null : 1;
        AnonymousClass6G8 anonymousClass6G8 = anonymousClass6GA.f73603H;
        if (anonymousClass6G8 != null && obj != null) {
            anonymousClass6G8.m29699E(anonymousClass5Mp.f62664B);
            anonymousClass6GA.f73613R = true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public final void mo6810D(boolean r3, java.lang.String r4) {
        /*
        r2 = this;
        r0 = r2.f74086B;
        r0 = r0.f73603H;
        if (r0 == 0) goto L_0x0065;
    L_0x0006:
        r0 = r2.f74086B;
        r0 = r0.f73603H;
        r1 = r0.f73583D;
        r1.f73512P = r3;
        r1.f73521Y = r4;
        r0 = r1.f73524b;
        r2 = 0;
        if (r0 != 0) goto L_0x0022;
    L_0x0015:
        if (r3 == 0) goto L_0x0020;
    L_0x0017:
        r0 = "ssi_reason";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0022;
    L_0x0020:
        r0 = 0;
        goto L_0x0023;
    L_0x0022:
        r0 = 1;
    L_0x0023:
        r1.f73524b = r0;
        r0 = r1.f73505I;
        if (r0 != 0) goto L_0x0041;
    L_0x0029:
        if (r3 == 0) goto L_0x0042;
    L_0x002b:
        r0 = "copyright_violation_confirmed";
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x003e;
    L_0x0033:
        r0 = "copyright_music_violation_confirmed";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x003c;
    L_0x003b:
        goto L_0x003e;
    L_0x003c:
        r0 = 0;
        goto L_0x003f;
    L_0x003e:
        r0 = 1;
    L_0x003f:
        if (r0 == 0) goto L_0x0042;
    L_0x0041:
        r2 = 1;
    L_0x0042:
        r1.f73505I = r2;
        if (r3 == 0) goto L_0x0065;
    L_0x0046:
        r0 = "copyrighted_content_matched";
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x0059;
    L_0x004e:
        r0 = "copyrighted_music_matched";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0057;
    L_0x0056:
        goto L_0x0059;
    L_0x0057:
        r0 = 0;
        goto L_0x005a;
    L_0x0059:
        r0 = 1;
    L_0x005a:
        if (r0 == 0) goto L_0x0065;
    L_0x005c:
        r0 = r1.f73516T;
        if (r0 != 0) goto L_0x0065;
    L_0x0060:
        r0 = X.AnonymousClass5NT.STARTED_MATCHING_CONTENT_DETECTED;
        r1.m29666G(r0);
    L_0x0065:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.6HQ.D(boolean, java.lang.String):void");
    }

    /* renamed from: F */
    public final void mo6811F(boolean z) {
        if (this.f74086B.f73603H != null) {
            AnonymousClass6G8 anonymousClass6G8 = this.f74086B.f73603H;
            anonymousClass6G8.f73583D.f73513Q = z;
            anonymousClass6G8.m29701G();
        }
    }

    /* renamed from: G */
    public final void mo6812G(int i, int i2) {
        this.f74086B.f73616U = i2;
        if (this.f74086B.f73604I != null) {
            AnonymousClass5aa anonymousClass5aa = this.f74086B.f73604I;
            AtomicInteger atomicInteger = anonymousClass5aa.f66681Z;
            atomicInteger.set(Math.max(i, atomicInteger.get()));
            anonymousClass5aa.f66694m.set(i2);
            anonymousClass5aa.f66703v.set(i);
        }
        if (this.f74086B.f73603H != null) {
            AnonymousClass6G8 anonymousClass6G8 = this.f74086B.f73603H;
            if (i == 0) {
                anonymousClass6G8.f73585F.f66788B.f63115P.setVisibility(8);
                return;
            }
            CharSequence C = AnonymousClass3nt.C(Integer.valueOf(i));
            AnonymousClass5az anonymousClass5az = anonymousClass6G8.f73585F;
            anonymousClass5az.f66788B.f63116Q.setText(C);
            anonymousClass5az.f66788B.f63115P.setVisibility(0);
        }
    }
}
