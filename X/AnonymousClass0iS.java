package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import java.util.Date;
import java.util.Random;

/* renamed from: X.0iS */
public final class AnonymousClass0iS extends AnonymousClass0VA {
    /* renamed from: B */
    public AnonymousClass0iA f8733B;
    /* renamed from: C */
    public AnonymousClass0jQ f8734C;
    /* renamed from: D */
    public boolean f8735D;
    /* renamed from: E */
    public boolean f8736E;
    /* renamed from: F */
    public AnonymousClass0kj f8737F;
    /* renamed from: G */
    public AnonymousClass0jP f8738G;
    /* renamed from: H */
    public boolean f8739H;
    /* renamed from: I */
    public boolean f8740I;
    /* renamed from: J */
    public volatile Boolean f8741J;
    /* renamed from: K */
    public AnonymousClass0PY f8742K;
    /* renamed from: L */
    public AnonymousClass0iT f8743L;
    /* renamed from: M */
    public AnonymousClass0jO f8744M;
    /* renamed from: N */
    public final AnonymousClass0hq f8745N;
    /* renamed from: O */
    public AnonymousClass0Cm f8746O;
    /* renamed from: P */
    private AnonymousClass3U0 f8747P;
    /* renamed from: Q */
    private final Handler f8748Q = new Handler();
    /* renamed from: R */
    private final AnonymousClass5lO f8749R;
    /* renamed from: S */
    private boolean f8750S;

    static {
        Random random = new Random();
    }

    public AnonymousClass0iS(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0PY anonymousClass0PY, AnonymousClass0iT anonymousClass0iT, AnonymousClass0hq anonymousClass0hq, boolean z, AnonymousClass5lO anonymousClass5lO, AnonymousClass3U0 anonymousClass3U0) {
        this.f8746O = anonymousClass0Cm;
        this.f8742K = anonymousClass0PY;
        this.f8743L = anonymousClass0iT;
        this.f8750S = z;
        this.f8745N = anonymousClass0hq;
        this.f8739H = AnonymousClass0CS.f1676u.m911I() ^ 1;
        this.f8744M = new AnonymousClass0jO(this.f8742K.getContext(), this.f8742K, this.f8746O, ((Boolean) AnonymousClass0CC.wS.m846H(anonymousClass0Cm)).booleanValue());
        this.f8737F = new AnonymousClass0kj(this.f8746O);
        this.f8749R = anonymousClass5lO;
        this.f8747P = anonymousClass3U0;
    }

    /* renamed from: A */
    public final boolean m6899A() {
        return this.f8737F.f9357C != null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    private static void m6898B(X.AnonymousClass0iS r17, X.AnonymousClass0fs r18, boolean r19) {
        /*
        r9 = r17;
        r3 = r9.f8742K;
        r1 = r3.getContext();
        r0 = "accessibility";
        r0 = r1.getSystemService(r0);
        r0 = (android.view.accessibility.AccessibilityManager) r0;
        r1 = r0.isEnabled();
        r0 = r0.isTouchExplorationEnabled();
        if (r1 == 0) goto L_0x0030;
    L_0x001a:
        if (r0 == 0) goto L_0x0030;
    L_0x001c:
        r0 = r3.f4097T;
        if (r0 == 0) goto L_0x0030;
    L_0x0020:
        r2 = r3.f4116m;
        r1 = r3.getResources();
        r0 = 2131690975; // 0x7f0f05df float:1.9011009E38 double:1.0531952783E-314;
        r0 = r1.getString(r0);
        r2.announceForAccessibility(r0);
    L_0x0030:
        r1 = r9.f8742K;
        r0 = 0;
        r1.f4097T = r0;
        if (r19 == 0) goto L_0x006d;
    L_0x0037:
        r0 = r9.f8742K;
        r1 = r0.f4115l;
        r0 = java.util.UUID.randomUUID();
        r0 = r0.toString();
        r1.f8537B = r0;
        r0 = r9.f8742K;
        r1 = r0.getListView();
        r0 = new X.0nG;
        r0.<init>(r9);
        r1.post(r0);
        r1 = r9.f8733B;
        r0 = r1.f8581J;
        r0.m7392D();
        r0 = r1.f8602e;
        r0 = r0.f10032B;
        if (r0 == 0) goto L_0x0065;
    L_0x0060:
        r0 = r0.f10043G;
        r0.clear();
    L_0x0065:
        X.AnonymousClass0iA.m6838B(r1);
        r1 = r9.f8733B;
        r0 = 0;
        r1.f8585N = r0;
    L_0x006d:
        r0 = r9.f8750S;
        r8 = r18;
        if (r0 == 0) goto L_0x0200;
    L_0x0073:
        r14 = r9.f8742K;
        r0 = r9.f8733B;
        r18 = r0.m6850O();
        r15 = r8.m6571I();
        r13 = r15.size();
        r12 = new java.util.ArrayList;
        r12.<init>(r13);
        r11 = 0;
    L_0x0089:
        if (r11 >= r13) goto L_0x0164;
    L_0x008b:
        r1 = r15.get(r11);
        r1 = (X.AnonymousClass0fH) r1;
        r17 = r18 + r11;
        r0 = r1.f7894J;
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x0109;
            case 3: goto L_0x009e;
            case 4: goto L_0x009e;
            default: goto L_0x009c;
        };
    L_0x009c:
        goto L_0x0160;
    L_0x009e:
        r0 = r1.m6525D();
        r10 = r0.f9626D;
        if (r10 == 0) goto L_0x0160;
    L_0x00a6:
        r1 = r10.size();
        r0 = 2;
        r7 = java.lang.Math.min(r1, r0);
        r6 = 0;
    L_0x00b0:
        if (r6 >= r7) goto L_0x0160;
    L_0x00b2:
        r5 = r10.get(r6);
        r5 = (X.AnonymousClass0mf) r5;
        r0 = r5.f9876F;
        r16 = r0.iterator();
    L_0x00be:
        r0 = r16.hasNext();
        if (r0 == 0) goto L_0x0106;
    L_0x00c4:
        r2 = r16.next();
        r2 = (X.AnonymousClass0P7) r2;
        r1 = X.AnonymousClass0Gs.f2431j;
        r0 = r14.getContext();
        r0 = r2.m3794x(r0);
        r1 = r1.m1908D(r0);
        r0 = 1;
        r1.f4635F = r0;
        r0 = r2.wB;
        r1.f4640K = r0;
        r0 = r14.getModuleName();
        r1.f4645P = r0;
        r1 = r1.m4147A();
        r4 = new X.0i6;
        r0 = r5.f9877G;
        r4.<init>(r0, r1);
        r3 = new X.0nO;
        r2 = new android.util.Pair;
        r1 = java.lang.Integer.valueOf(r17);
        r0 = java.lang.Integer.valueOf(r6);
        r2.<init>(r1, r0);
        r3.<init>(r4, r2);
        r12.add(r3);
        goto L_0x00be;
    L_0x0106:
        r6 = r6 + 1;
        goto L_0x00b0;
    L_0x0109:
        r6 = r1.m6523B();
        r0 = r6.eA();
        if (r0 == 0) goto L_0x0160;
    L_0x0113:
        r0 = r6.kA();
        if (r0 == 0) goto L_0x0146;
    L_0x0119:
        r5 = 0;
    L_0x011a:
        r0 = r6.m3761Q();
        if (r5 >= r0) goto L_0x0160;
    L_0x0120:
        r0 = r6.m3779i();
        r7 = r5 - r0;
        r0 = r6.m3763S(r5);
        r4 = X.AnonymousClass0PY.m3823B(r14, r0);
        r3 = new X.0nO;
        r2 = new android.util.Pair;
        r1 = java.lang.Integer.valueOf(r17);
        r0 = java.lang.Integer.valueOf(r7);
        r2.<init>(r1, r0);
        r3.<init>(r4, r2);
        r12.add(r3);
        r5 = r5 + 1;
        goto L_0x011a;
    L_0x0146:
        r4 = X.AnonymousClass0PY.m3823B(r14, r6);
        r3 = new X.0nO;
        r2 = new android.util.Pair;
        r1 = java.lang.Integer.valueOf(r17);
        r0 = 0;
        r0 = java.lang.Integer.valueOf(r0);
        r2.<init>(r1, r0);
        r3.<init>(r4, r2);
        r12.add(r3);
    L_0x0160:
        r11 = r11 + 1;
        goto L_0x0089;
    L_0x0164:
        if (r19 != 0) goto L_0x01b4;
    L_0x0166:
        r0 = r14.f4079B;
        r0 = r0.m6850O();
        if (r0 != 0) goto L_0x016f;
    L_0x016e:
        goto L_0x01b4;
    L_0x016f:
        r0 = r14.f4119p;
        r4 = X.AnonymousClass0cY.m5900D(r0);
        r3 = r14.getModuleName();
        X.AnonymousClass0Sy.m4434C();
        r0 = 1;
        r4.f7178I = r0;
        r1 = r4.f7176G;
        r0 = X.AnonymousClass0cY.m5899C(r3);
        r2 = r1.get(r0);
        r2 = (java.util.LinkedHashSet) r2;
        if (r2 != 0) goto L_0x0199;
    L_0x018d:
        r2 = new java.util.LinkedHashSet;
        r2.<init>();
        r1 = "PrefetchScheduler";
        r0 = "Trying to append to non existing graph";
        X.AnonymousClass0Gn.m1876C(r1, r0);
    L_0x0199:
        r2.addAll(r12);
        r1 = r12.iterator();
    L_0x01a0:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x01b0;
    L_0x01a6:
        r0 = r1.next();
        r0 = (X.AnonymousClass0nO) r0;
        X.AnonymousClass0cY.m5901E(r4, r0, r3);
        goto L_0x01a0;
    L_0x01b0:
        r4.m5916G();
        goto L_0x0200;
    L_0x01b4:
        r0 = r14.f4119p;
        r5 = X.AnonymousClass0cY.m5900D(r0);
        r4 = new android.util.Pair;
        r0 = 0;
        r1 = java.lang.Integer.valueOf(r0);
        r0 = java.lang.Integer.valueOf(r0);
        r4.<init>(r1, r0);
        r3 = r14.getModuleName();
        X.AnonymousClass0Sy.m4434C();
        r5.m5911B(r3);
        r2 = r5.f7176G;
        r1 = X.AnonymousClass0cY.m5899C(r3);
        r0 = new java.util.LinkedHashSet;
        r0.<init>(r12);
        r2.put(r1, r0);
        r1 = r12.iterator();
    L_0x01e4:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x01f4;
    L_0x01ea:
        r0 = r1.next();
        r0 = (X.AnonymousClass0nO) r0;
        X.AnonymousClass0cY.m5901E(r5, r0, r3);
        goto L_0x01e4;
    L_0x01f4:
        r1 = r5.f7175F;
        r0 = X.AnonymousClass0cY.m5899C(r3);
        r1.put(r0, r4);
        r5.m5916G();
    L_0x0200:
        r0 = r9.f8746O;
        r0 = X.AnonymousClass0J1.m2415B(r0);
        r0 = r0.f2868E;
        if (r0 == 0) goto L_0x0214;
    L_0x020a:
        r0 = r9.f8746O;
        r1 = X.AnonymousClass0J1.m2415B(r0);
        r0 = r8.f8005F;
        r1.f2870G = r0;
    L_0x0214:
        r0 = r9.f8746O;
        r0 = X.AnonymousClass0J1.m2415B(r0);
        r0 = r0.f2883T;
        r4 = 1;
        if (r0 == 0) goto L_0x0294;
    L_0x021f:
        r0 = r9.f8746O;
        r0 = X.AnonymousClass0J1.m2415B(r0);
        r0 = r0.f2869F;
        if (r0 == 0) goto L_0x022b;
    L_0x0229:
        if (r19 != 0) goto L_0x0294;
    L_0x022b:
        r7 = r8.m6571I();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r3 = new java.util.ArrayList;
        r3.<init>();
        r6 = 0;
        r11 = 1;
    L_0x023b:
        r0 = r7.size();
        if (r6 >= r0) goto L_0x0282;
    L_0x0241:
        r10 = r7.get(r6);
        r10 = (X.AnonymousClass0fH) r10;
        r0 = X.AnonymousClass0nQ.m7658B(r10);
        if (r0 != 0) goto L_0x0258;
    L_0x024d:
        r0 = X.AnonymousClass0nQ.m7659C(r10);
        if (r0 == 0) goto L_0x0254;
    L_0x0253:
        goto L_0x0258;
    L_0x0254:
        r3.add(r10);
        goto L_0x027f;
    L_0x0258:
        if (r19 == 0) goto L_0x0261;
    L_0x025a:
        if (r11 == 0) goto L_0x0261;
    L_0x025c:
        r3.add(r10);
        r11 = 0;
        goto L_0x027f;
    L_0x0261:
        if (r6 < r4) goto L_0x027f;
    L_0x0263:
        r2 = new X.0nW;
        r0 = r6 + -1;
        r0 = r7.get(r0);
        r0 = (X.AnonymousClass0fH) r0;
        r1 = r0.f7904T;
        r0 = r9.f8746O;
        r2.<init>(r10, r1, r0);
        r0 = X.AnonymousClass0nX.TIMELINE_REQUEST;
        r2.f10078E = r0;
        r0 = X.AnonymousClass0nY.f10086E;
        r2.f10075B = r0;
        r5.add(r2);
    L_0x027f:
        r6 = r6 + 1;
        goto L_0x023b;
    L_0x0282:
        r1 = X.AnonymousClass0F4.f2058E;
        r0 = new X.0nR;
        r0.<init>(r5);
        r1.m1505B(r0);
        r1 = r9.f8733B;
        r0 = r8.f8010K;
        r1.m6842G(r3, r0);
        goto L_0x02ec;
    L_0x0294:
        r0 = r9.f8733B;
        r0 = r0.f8585N;
        if (r0 == 0) goto L_0x02a6;
    L_0x029a:
        r0 = r8.f8008I;
        if (r0 == 0) goto L_0x02a6;
    L_0x029e:
        r0 = r8.f8008I;
        r0 = r0.f10104D;
        if (r0 == 0) goto L_0x02a6;
    L_0x02a4:
        r0 = 1;
        goto L_0x02a7;
    L_0x02a6:
        r0 = 0;
    L_0x02a7:
        if (r0 == 0) goto L_0x02e1;
    L_0x02a9:
        r0 = r9.f8733B;
        r1 = r0.f8585N;
        r0 = r8.f8008I;
        r3 = r1.C(r0);
        r2 = r8.m6571I();
        r1 = r8.f8008I;
        r0 = r3.f40401B;
        r0.addAll(r2);
        r3.f40403D = r1;
        r0 = r8.f8008I;
        r0 = r0.f10104D;
        if (r0 == 0) goto L_0x02de;
    L_0x02c6:
        r0 = r9.f8733B;
        r0 = r0.f8585N;
        r0 = r0.B();
        r0 = r0.f40403D;
        r1 = r0.f10104D;
        r0 = r8.f8008I;
        r0 = r0.f10104D;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x02de;
    L_0x02dc:
        r0 = 1;
        goto L_0x02df;
    L_0x02de:
        r0 = 0;
    L_0x02df:
        if (r0 == 0) goto L_0x02ec;
    L_0x02e1:
        r2 = r9.f8733B;
        r1 = r8.m6571I();
        r0 = r8.f8010K;
        r2.m6842G(r1, r0);
    L_0x02ec:
        r0 = r9.f8750S;
        if (r0 != 0) goto L_0x0371;
    L_0x02f0:
        r3 = r9.f8744M;
        r11 = X.AnonymousClass0nS.FEED;
        r2 = r8.m6571I();
        if (r19 == 0) goto L_0x0308;
    L_0x02fa:
        r0 = r3.f9133B;
        r0 = X.AnonymousClass0MN.m3162F(r0);
        if (r0 == 0) goto L_0x0308;
    L_0x0302:
        r0 = r3.f9136E;
        if (r0 != 0) goto L_0x0308;
    L_0x0306:
        r5 = 1;
        goto L_0x0309;
    L_0x0308:
        r5 = 0;
    L_0x0309:
        r13 = 0;
    L_0x030a:
        r0 = r2.size();
        if (r13 >= r0) goto L_0x036e;
    L_0x0310:
        r1 = r2.get(r13);
        r1 = (X.AnonymousClass0fH) r1;
        r0 = r1.f7894J;
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x032c;
            case 3: goto L_0x0320;
            case 4: goto L_0x0320;
            default: goto L_0x031f;
        };
    L_0x031f:
        goto L_0x036b;
    L_0x0320:
        r0 = r1.m6525D();
        r0 = r0.f9626D;
        if (r0 == 0) goto L_0x036b;
    L_0x0328:
        r3.m7107A(r0, r13);
        goto L_0x036b;
    L_0x032c:
        r12 = r1.m6523B();
        if (r12 == 0) goto L_0x036b;
    L_0x0332:
        r0 = r12.eA();
        if (r0 == 0) goto L_0x036b;
    L_0x0338:
        if (r5 == 0) goto L_0x0348;
    L_0x033a:
        r0 = r3.f9137F;
        if (r0 != 0) goto L_0x0348;
    L_0x033e:
        r0 = r3.f9138G;
        r0 = X.AnonymousClass0jO.m7104C(r12, r0);
        if (r0 == 0) goto L_0x0348;
    L_0x0346:
        r14 = 1;
        goto L_0x0349;
    L_0x0348:
        r14 = 0;
    L_0x0349:
        r15 = new X.0nb;
        r15.<init>(r3, r11);
        r10 = r3;
        X.AnonymousClass0jO.m7105D(r10, r11, r12, r13, r14, r15);
        r0 = r3.f9138G;
        r0 = X.AnonymousClass0jO.m7104C(r12, r0);
        if (r0 == 0) goto L_0x036b;
    L_0x035a:
        r1 = X.AnonymousClass0CC.sk;
        r0 = r3.f9138G;
        r0 = r1.m846H(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x036b;
    L_0x036a:
        r5 = 0;
    L_0x036b:
        r13 = r13 + 1;
        goto L_0x030a;
    L_0x036e:
        X.AnonymousClass0jO.m7103B(r3);
    L_0x0371:
        r1 = r9.f8749R;
        if (r1 == 0) goto L_0x0379;
    L_0x0375:
        r0 = r8.f8008I;
        r1.f68786B = r0;
    L_0x0379:
        r0 = r9.f8742K;
        r0.m3845B(r4);
        r0 = r8.m6571I();
        if (r0 == 0) goto L_0x03a0;
    L_0x0384:
        r0 = r9.f8742K;
        r1 = r0.getContext();
        r0 = r9.f8746O;
        r3 = X.AnonymousClass0jM.m7091B(r1, r0);
        r2 = r8.m6571I();
        r1 = r3.f9127N;
        r0 = 1;
        r1 = r1.obtainMessage(r0, r2);
        r0 = r3.f9127N;
        r0.sendMessage(r1);
    L_0x03a0:
        r0 = java.lang.Boolean.valueOf(r4);
        r9.f8741J = r0;
        r0 = r8.f8007H;
        if (r0 == 0) goto L_0x03bc;
    L_0x03aa:
        r1 = r9.f8742K;
        r0 = r8.f8007H;
        r1 = r1.f4117n;
        r1.f9375J = r0;
        r0 = r1.f9371F;
        if (r0 == 0) goto L_0x03b9;
    L_0x03b6:
        r0.GJA(r1);
    L_0x03b9:
        X.AnonymousClass0kn.m7214E(r1);
    L_0x03bc:
        r3 = r9.f8742K;
        r2 = r3.getContext();
        r1 = r3.f4119p;
        r0 = r8.mo1552F();
        r1 = X.AnonymousClass0iJ.m6869B(r2, r1, r0);
        if (r1 == 0) goto L_0x03d4;
    L_0x03ce:
        r2 = r1.f6156J;
        r0 = X.AnonymousClass0lg.SELF_UPDATE;
        if (r2 == r0) goto L_0x03db;
    L_0x03d4:
        if (r19 == 0) goto L_0x03db;
    L_0x03d6:
        r0 = r3.f4110g;
        r0.m4482A();
    L_0x03db:
        if (r1 == 0) goto L_0x042c;
    L_0x03dd:
        r2 = r1.f6156J;
        r0 = X.AnonymousClass0lg.GENERIC;
        if (r2 != r0) goto L_0x042c;
    L_0x03e3:
        r0 = r1.f6154H;
        r0 = (X.AnonymousClass0lz) r0;
        r2 = r0.f9656S;
        r0 = "data_saver";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x042c;
    L_0x03f1:
        r0 = X.AnonymousClass0cW.m5884G();
        if (r0 == 0) goto L_0x0443;
    L_0x03f7:
        r0 = r3.f4119p;
        r0 = X.AnonymousClass0cW.m5883F(r0);
        if (r0 != 0) goto L_0x0443;
    L_0x03ff:
        r0 = r3.getContext();
        r0 = X.AnonymousClass0MM.m3155K(r0);
        if (r0 == 0) goto L_0x040f;
    L_0x0409:
        r0 = X.AnonymousClass0cW.m5891N();
        if (r0 == 0) goto L_0x0443;
    L_0x040f:
        X.AnonymousClass0PY.m3832K(r3, r8);
        r0 = r3.f4079B;
        r0.m6857V(r1);
        r1 = "ig_low_data_mode_megaphone";
        r0 = 0;
        r2 = X.AnonymousClass0NN.m3291B(r1, r0);
        r1 = "promoted_on_wifi";
        r0 = X.AnonymousClass0cW.m5891N();
        r0 = r2.m3300H(r1, r0);
        r0.m3310R();
        goto L_0x0443;
    L_0x042c:
        if (r1 == 0) goto L_0x0430;
    L_0x042e:
        r0 = 1;
        goto L_0x0431;
    L_0x0430:
        r0 = 0;
    L_0x0431:
        r3.f4092O = r0;
        if (r1 == 0) goto L_0x0443;
    L_0x0435:
        r0 = r1.m5231B();
        if (r0 != 0) goto L_0x0443;
    L_0x043b:
        X.AnonymousClass0PY.m3832K(r3, r8);
        r0 = r3.f4079B;
        r0.m6857V(r1);
    L_0x0443:
        if (r19 == 0) goto L_0x0490;
    L_0x0445:
        r1 = X.AnonymousClass0CC.Ca;
        r0 = r9.f8746O;
        r0 = r1.m846H(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0490;
    L_0x0455:
        r0 = r9.f8742K;
        r1 = r0.getActivity();
        r0 = r9.f8746O;
        r3 = r0.f1759C;
        r0 = X.AnonymousClass0nU.f10072E;
        if (r0 == 0) goto L_0x0477;
    L_0x0463:
        r0 = X.AnonymousClass0nU.f10069B;
        if (r0 != 0) goto L_0x0477;
    L_0x0467:
        r0 = new X.1EZ;
        r0.<init>(r1);
        r0 = r0.m10210A();
        X.AnonymousClass0nU.f10069B = r0;
        if (r0 != 0) goto L_0x0477;
    L_0x0474:
        r0 = 0;
        X.AnonymousClass0nU.f10072E = r0;
    L_0x0477:
        r0 = X.AnonymousClass0nU.f10071D;
        if (r0 != 0) goto L_0x0490;
    L_0x047b:
        r2 = new java.lang.ref.WeakReference;
        r0 = r1.getApplicationContext();
        r2.<init>(r0);
        r1 = android.os.Looper.myQueue();
        r0 = new X.0nV;
        r0.<init>(r2, r3);
        r1.addIdleHandler(r0);
    L_0x0490:
        if (r19 != 0) goto L_0x049f;
    L_0x0492:
        r0 = r9.f8742K;
        r2 = r0.getActivity();
        r1 = r9.f8746O;
        r0 = "765399463563089";
        X.AnonymousClass0SZ.m4356B(r2, r1, r0);
    L_0x049f:
        r2 = r9.f8747P;
        r1 = new java.util.ArrayList;
        r0 = r9.f8733B;
        r0 = r0.f8581J;
        r0 = r0.f9605C;
        r1.<init>(r0);
        r2.rl(r1);
        r1 = r9.f8742K;
        r0 = r9.f8733B;
        r0 = r0.m6858W();
        if (r0 == 0) goto L_0x04ca;
    L_0x04b9:
        r2 = r1.f4116m;
        r1 = r1.getContext();
        r0 = 2131099791; // 0x7f06008f float:1.7811945E38 double:1.0529031946E-314;
        r0 = X.AnonymousClass0Ca.m937C(r1, r0);
        r2.setBackgroundColor(r0);
        goto L_0x04d8;
    L_0x04ca:
        r0 = r1.f4116m;
        r0 = r0.getBackground();
        if (r0 == 0) goto L_0x04d8;
    L_0x04d2:
        r1 = r1.f4116m;
        r0 = 0;
        r1.setBackgroundResource(r0);
    L_0x04d8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0iS.B(X.0iS, X.0fs, boolean):void");
    }

    /* renamed from: B */
    public final void m6900B(AnonymousClass5l9 anonymousClass5l9) {
        AnonymousClass0fs anonymousClass0fs = this.f8737F.f9357C;
        if (anonymousClass0fs != null) {
            AnonymousClass0iS.m6898B(this, anonymousClass0fs, true);
            AnonymousClass0NN.m3291B("ig_main_feed_deferred_response_loaded", this.f8742K).m3298F("reason", anonymousClass5l9.f68754B).m3310R();
            this.f8737F.m7207A(true);
        }
    }

    /* renamed from: C */
    public final boolean m6901C(AnonymousClass0fs anonymousClass0fs, boolean z) {
        if (this.f8746O.f1758B) {
            return false;
        }
        AnonymousClass0fs anonymousClass0fs2 = anonymousClass0fs;
        boolean U = r5.f8733B.m6856U(anonymousClass0fs2.m6571I()) ^ true;
        boolean z2 = z;
        boolean B = r5.f8737F.m7208B(z2, U, r5.f8742K.isVisible(), AnonymousClass0m2.m7437Q(r5.f8742K.getListView()), r5.f8742K.f4097T, r5.f8742K.f4102Y.m7054B().isEmpty() ^ 1);
        if (!r5.f8740I) {
            boolean z3;
            AnonymousClass0FM.m1565B("init_to_load_feed_from_network_ms", "AppStartPerformanceTracer");
            if (B) {
                AnonymousClass0iT anonymousClass0iT = r5.f8743L;
                synchronized (anonymousClass0iT) {
                    AnonymousClass0F9 anonymousClass0F9 = anonymousClass0iT.f8758C;
                    String str = "is_feed_deferred";
                    if (anonymousClass0F9.f2070C != null) {
                        anonymousClass0F9.f2069B.m1437K(15335435, str, true);
                    }
                }
            }
            r5.f8743L.m6904C(true);
            AnonymousClass0nK.m7648B(r5.f8742K.getContext(), r5.f8746O).m7651A(true);
            AnonymousClass0Ie anonymousClass0Ie = r5.f8742K;
            long time = new Date().getTime();
            AnonymousClass0nL B2 = AnonymousClass0nL.m7653B();
            String str2 = "lastSyncMediaIdsTime";
            if (time < B2.f10054B.getLong(str2, 0) || time > B2.f10054B.getLong(str2, 0) + AnonymousClass0PY.uB.longValue()) {
                AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Ie.f4119p);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
                anonymousClass0Pt.f4229M = "media/blocked/";
                AnonymousClass0GA H = anonymousClass0Pt.m3944M(AnonymousClass0nM.class).m3939H();
                H.f2849B = new AnonymousClass0kk(anonymousClass0Ie, B2);
                anonymousClass0Ie.schedule(H);
            }
            AnonymousClass3UD anonymousClass3UD = anonymousClass0fs2.f8009J;
            if (anonymousClass3UD == null) {
                anonymousClass3UD = AnonymousClass3UD.f41583C;
            }
            if ((anonymousClass3UD.f41584B != null ? 1 : null) != null) {
                AnonymousClass3UD anonymousClass3UD2 = anonymousClass0fs2.f8009J;
                if (anonymousClass3UD2 == null) {
                    anonymousClass3UD2 = AnonymousClass3UD.f41583C;
                }
                if ((anonymousClass3UD2.f41584B != null ? 1 : null) != null) {
                    z3 = anonymousClass3UD2.f41584B.f41582B;
                } else {
                    throw new IllegalStateException("explore config is not available");
                }
            }
            z3 = true;
            if (z3) {
                AnonymousClass0Ib.f2781B.mo612A(r5.f8746O, AnonymousClass0MM.m3155K(r5.f8742K.getContext()));
            }
            r5.f8733B.f8583L = true;
            r5.f8740I = true;
        }
        if (z && ((Integer) AnonymousClass0CC.jE.m846H(r5.f8746O)).intValue() > 0) {
            AnonymousClass0HV.m2008D(r5.f8746O).f2646B.edit().putLong("last_feed_head_load_success", AnonymousClass0Gd.m1838C()).apply();
        }
        if (B) {
            AnonymousClass0kj anonymousClass0kj = r5.f8737F;
            if (anonymousClass0kj.f9357C != anonymousClass0fs2) {
                anonymousClass0kj.f9357C = anonymousClass0fs2;
                AnonymousClass0m8 anonymousClass0m8 = anonymousClass0kj.f9356B;
                if (anonymousClass0m8 != null) {
                    if (anonymousClass0m8.f9719B.f4083F != null && anonymousClass0m8.f9719B.f4083F.B()) {
                        AnonymousClass0Ie anonymousClass0Ie2 = anonymousClass0m8.f9719B;
                        AnonymousClass5lM anonymousClass5lM = new AnonymousClass5lM(anonymousClass0Ie2, anonymousClass0Ie2.f4079B);
                        AnonymousClass5lC.B(anonymousClass0m8.f9719B, AnonymousClass5lA.f68756D, anonymousClass5lM.B(), anonymousClass5lM.A());
                    }
                    AnonymousClass0kd anonymousClass0kd = anonymousClass0m8.f9719B.f4080C;
                    AnonymousClass0Cm anonymousClass0Cm = anonymousClass0m8.f9719B.f4119p;
                    anonymousClass0kd.m7202A(!AnonymousClass5lN.C(anonymousClass0Cm) ? ((Integer) AnonymousClass0CC.bV.m846H(anonymousClass0Cm)).intValue() : 4);
                }
            }
            return U;
        }
        AnonymousClass0iS.m6898B(r5, anonymousClass0fs2, z2);
        return U;
    }

    public final void PGA(View view, Bundle bundle) {
        super.PGA(view, bundle);
        this.f8742K.GJA(this.f8738G);
    }

    public final void ei() {
        this.f8748Q.removeCallbacksAndMessages(null);
    }

    public final void gi() {
        super.gi();
        this.f8742K.pVA(this.f8738G);
    }
}
