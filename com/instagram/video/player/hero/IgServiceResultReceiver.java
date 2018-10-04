package com.instagram.video.player.hero;

import X.AnonymousClass0vA;
import X.AnonymousClass17P;
import X.AnonymousClass17Z;
import X.AnonymousClass1H0;
import X.AnonymousClass1c2;
import X.AnonymousClass1e2;
import X.AnonymousClass1e5;
import X.AnonymousClass1e6;
import X.AnonymousClass1e7;
import X.AnonymousClass1eB;
import X.AnonymousClass1xb;
import X.AnonymousClass1xi;
import X.AnonymousClass1xl;
import X.AnonymousClass2NP;
import X.AnonymousClass2dZ;
import X.AnonymousClass2da;
import X.AnonymousClass3pR;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class IgServiceResultReceiver extends ResultReceiver {
    /* renamed from: B */
    public final Handler f14706B = new Handler(Looper.getMainLooper());
    /* renamed from: C */
    public final Map f14707C = new HashMap();
    /* renamed from: D */
    public final CopyOnWriteArraySet f14708D = new CopyOnWriteArraySet();

    public IgServiceResultReceiver() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static boolean m9471B(com.instagram.video.player.hero.IgServiceResultReceiver r3, X.AnonymousClass0vA r4) {
        /*
        r0 = r4.f11975I;
        r2 = r0.f8557G;
        r1 = r3.f14707C;
        monitor-enter(r1);
        r0 = r3.f14707C;	 Catch:{ all -> 0x0036 }
        r0 = r0.containsKey(r2);	 Catch:{ all -> 0x0036 }
        if (r0 == 0) goto L_0x0033;
    L_0x000f:
        r0 = r3.f14707C;	 Catch:{ all -> 0x0036 }
        r0 = r0.get(r2);	 Catch:{ all -> 0x0036 }
        r0 = (java.util.Set) r0;	 Catch:{ all -> 0x0036 }
        r0 = r0.remove(r4);	 Catch:{ all -> 0x0036 }
        if (r0 == 0) goto L_0x0033;
    L_0x001d:
        r0 = r3.f14707C;	 Catch:{ all -> 0x0036 }
        r0 = r0.get(r2);	 Catch:{ all -> 0x0036 }
        r0 = (java.util.Set) r0;	 Catch:{ all -> 0x0036 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0036 }
        if (r0 == 0) goto L_0x0030;
    L_0x002b:
        r0 = r3.f14707C;	 Catch:{ all -> 0x0036 }
        r0.remove(r2);	 Catch:{ all -> 0x0036 }
    L_0x0030:
        r0 = 1;
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
        return r0;
    L_0x0033:
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
        r0 = 0;
        return r0;
    L_0x0036:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.player.hero.IgServiceResultReceiver.B(com.instagram.video.player.hero.IgServiceResultReceiver, X.0vA):boolean");
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        Throwable th;
        AnonymousClass17Z B = AnonymousClass17Z.m9485B(i);
        AnonymousClass1H0 anonymousClass1H0 = (AnonymousClass1H0) bundle.getSerializable(AnonymousClass1H0.f16623C);
        IgServiceResultReceiver igServiceResultReceiver = this;
        Set<AnonymousClass0vA> set;
        AnonymousClass17P A;
        switch (B.ordinal()) {
            case 0:
            case 4:
            case 10:
            case 17:
                Iterator it = igServiceResultReceiver.f14708D.iterator();
                while (it.hasNext()) {
                    AnonymousClass1c2 anonymousClass1c2 = (AnonymousClass1c2) it.next();
                    switch (B.ordinal()) {
                        case 0:
                            AnonymousClass1xb anonymousClass1xb = (AnonymousClass1xb) anonymousClass1H0;
                            switch (anonymousClass1xb.f24680B.ordinal()) {
                                case 0:
                                    AnonymousClass2dZ anonymousClass2dZ = (AnonymousClass2dZ) anonymousClass1xb;
                                    if (!(anonymousClass1c2.f20573P == null || anonymousClass1c2.f20576S == null || !anonymousClass2dZ.f30525B.equals(anonymousClass1c2.f20576S.f14750O))) {
                                        anonymousClass1c2.f20573P.f44957C = anonymousClass2dZ.f31847B;
                                        continue;
                                    }
                                case 1:
                                    AnonymousClass2da anonymousClass2da = (AnonymousClass2da) anonymousClass1xb;
                                    if (!(anonymousClass1c2.f20573P == null || anonymousClass1c2.f20576S == null || !anonymousClass2da.f30525B.equals(anonymousClass1c2.f20576S.f14750O))) {
                                        AnonymousClass3pR anonymousClass3pR = anonymousClass1c2.f20573P;
                                        anonymousClass3pR.f44956B += (long) anonymousClass2da.f31848B;
                                        break;
                                    }
                                default:
                                    break;
                            }
                        case 4:
                            Object obj;
                            AnonymousClass1e5 anonymousClass1e5 = (AnonymousClass1e5) anonymousClass1H0;
                            if (anonymousClass1e5.f20907l != AnonymousClass1e7.f20932G.f20939C) {
                                if (anonymousClass1e5.f20907l != AnonymousClass1e7.f20936K.f20939C) {
                                    obj = null;
                                    if (anonymousClass1e5.f20906k == 0 && !anonymousClass1e5.f20883N && r2 != null && anonymousClass1e5.f20916u == 1 && anonymousClass1c2.f20555M != null && AnonymousClass1c2.m12075C(anonymousClass1c2, anonymousClass1e5.f20920y)) {
                                        anonymousClass1c2.f20555M.iFA(anonymousClass1c2, anonymousClass1e5.f20875F.equals(AnonymousClass1e6.f20922E));
                                    }
                                    synchronized (anonymousClass1c2.f20578U) {
                                        try {
                                            if (anonymousClass1c2.f20578U.size() > 3) {
                                                anonymousClass1c2.f20578U.remove(0);
                                            }
                                            anonymousClass1c2.f20578U.add(anonymousClass1e5);
                                        } catch (Throwable th2) {
                                            while (true) {
                                                th = th2;
                                                break;
                                            }
                                        }
                                    }
                                    if (AnonymousClass1c2.m12075C(anonymousClass1c2, anonymousClass1e5.f20920y)) {
                                        anonymousClass1c2.f20560C = anonymousClass1e5.f20872C;
                                    }
                                    continue;
                                }
                            }
                            obj = 1;
                            anonymousClass1c2.f20555M.iFA(anonymousClass1c2, anonymousClass1e5.f20875F.equals(AnonymousClass1e6.f20922E));
                            synchronized (anonymousClass1c2.f20578U) {
                                if (anonymousClass1c2.f20578U.size() > 3) {
                                    anonymousClass1c2.f20578U.remove(0);
                                }
                                anonymousClass1c2.f20578U.add(anonymousClass1e5);
                            }
                            if (AnonymousClass1c2.m12075C(anonymousClass1c2, anonymousClass1e5.f20920y)) {
                                anonymousClass1c2.f20560C = anonymousClass1e5.f20872C;
                            }
                            continue;
                        case 10:
                            AnonymousClass1xl anonymousClass1xl = (AnonymousClass1xl) anonymousClass1H0;
                            if (AnonymousClass1c2.m12075C(anonymousClass1c2, anonymousClass1xl.f24770D)) {
                                AnonymousClass1c2.m12077E(anonymousClass1c2, anonymousClass1xl.f24769C, anonymousClass1xl.f24768B);
                            }
                            continue;
                        case 17:
                            AnonymousClass1e2 anonymousClass1e2 = (AnonymousClass1e2) anonymousClass1H0;
                            if (anonymousClass1c2.f20544B != null) {
                                long j = anonymousClass1e2.f20843L;
                                bundle = anonymousClass1e2.f20840I;
                                long j2 = j;
                                boolean z = bundle;
                                anonymousClass1c2.f20544B.qc(new AnonymousClass2NP(j2, z, anonymousClass1e2.f20844M, anonymousClass1e2.f20842K, anonymousClass1e2.f20845N, anonymousClass1e2.f20834C, anonymousClass1e2.f20833B, anonymousClass1e2.f20838G, anonymousClass1e2.f20841J, anonymousClass1e2.f20835D, anonymousClass1e2.f20839H, anonymousClass1e2.f20837F, anonymousClass1e2.f20836E));
                            }
                            continue;
                        default:
                            continue;
                    }
                }
                return;
            case 1:
                AnonymousClass1eB anonymousClass1eB = (AnonymousClass1eB) anonymousClass1H0;
                Boolean.valueOf(anonymousClass1eB.f20942B);
                synchronized (igServiceResultReceiver.f14707C) {
                    try {
                        set = (Set) igServiceResultReceiver.f14707C.remove(anonymousClass1eB.f20943C);
                    } catch (Throwable th3) {
                        while (true) {
                            th = th3;
                            break;
                        }
                    }
                }
                if (set != null) {
                    for (AnonymousClass0vA anonymousClass0vA : set) {
                        boolean z2 = anonymousClass1eB.f20942B;
                        A = anonymousClass0vA.m8297A();
                        if (A != null) {
                            A.yFA(z2);
                        }
                    }
                }
                return;
            case 16:
                AnonymousClass1xi anonymousClass1xi = (AnonymousClass1xi) anonymousClass1H0;
                Boolean.valueOf(anonymousClass1xi.f24712B);
                synchronized (igServiceResultReceiver.f14707C) {
                    try {
                        set = (Set) igServiceResultReceiver.f14707C.remove(anonymousClass1xi.f24713C);
                    } catch (Throwable th4) {
                        while (true) {
                            th = th4;
                            break;
                        }
                    }
                }
                if (set != null) {
                    boolean z3 = anonymousClass1xi.f24712B;
                    for (AnonymousClass0vA anonymousClass0vA2 : set) {
                        A = anonymousClass0vA2.m8297A();
                        if (A != null) {
                            A.xFA(z3);
                        }
                    }
                }
                return;
            default:
                return;
        }
        throw th;
    }
}
