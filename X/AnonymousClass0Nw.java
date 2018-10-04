package X;

import android.content.Context;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: X.0Nw */
public final class AnonymousClass0Nw implements AnonymousClass0G2 {
    /* renamed from: B */
    public final Set f3741B;
    /* renamed from: C */
    public boolean f3742C;
    /* renamed from: D */
    public final Set f3743D;
    /* renamed from: E */
    public final Set f3744E;
    /* renamed from: F */
    public final AnonymousClass0Nx f3745F;
    /* renamed from: G */
    public final Set f3746G;
    /* renamed from: H */
    public final AnonymousClass0Cm f3747H;
    /* renamed from: I */
    public final Set f3748I;
    /* renamed from: J */
    private final Context f3749J = AnonymousClass0EV.f1977B;
    /* renamed from: K */
    private AnonymousClass41X f3750K;
    /* renamed from: L */
    private final Comparator f3751L;

    private AnonymousClass0Nw(X.AnonymousClass0Cm r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r9 = this;
        r9.<init>();
        r9.f3747H = r10;
        r0 = X.AnonymousClass0EV.f1977B;
        r9.f3749J = r0;
        r1 = r9.f3747H;
        r0 = X.AnonymousClass0Nw.class;
        r1.m1039D(r0, r9);
        r0 = new java.util.HashSet;
        r0.<init>();
        r9.f3746G = r0;
        r0 = new java.util.HashSet;
        r0.<init>();
        r9.f3748I = r0;
        r0 = new java.util.HashSet;
        r0.<init>();
        r9.f3741B = r0;
        r0 = new java.util.HashSet;
        r0.<init>();
        r9.f3744E = r0;
        r0 = new java.util.concurrent.CopyOnWriteArraySet;
        r0.<init>();
        r9.f3743D = r0;
        r7 = new X.0Nx;
        r0 = r9.f3747H;
        r7.<init>(r0);
        r9.f3745F = r7;
        r0 = r7.f3754D;
        r1 = r0.f2646B;
        r0 = "stories_preloaded_reel_ids";
        r8 = "";
        r4 = r1.getString(r0, r8);
        r0 = r8.equals(r4);
        if (r0 != 0) goto L_0x009f;
    L_0x004e:
        r0 = ",";
        r6 = r4.split(r0);
        r0 = r7.f3754D;
        r2 = r0.f2646B;
        r1 = "stories_preloaded_reel_timestamp";
        r3 = r2.getString(r1, r8);
        r0 = ",";
        r5 = r3.split(r0);
        r1 = r6.length;
        r0 = r5.length;
        if (r1 != r0) goto L_0x0081;
    L_0x0068:
        r0 = r6.length;
        r4 = r0 + -1;
    L_0x006b:
        if (r4 < 0) goto L_0x009f;
    L_0x006d:
        r3 = r7.f3752B;	 Catch:{ NumberFormatException -> 0x007e }
        r2 = r6[r4];	 Catch:{ NumberFormatException -> 0x007e }
        r0 = r5[r4];	 Catch:{ NumberFormatException -> 0x007e }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x007e }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ NumberFormatException -> 0x007e }
        r3.put(r2, r0);	 Catch:{ NumberFormatException -> 0x007e }
    L_0x007e:
        r4 = r4 + -1;
        goto L_0x006b;
    L_0x0081:
        r1 = r7.f3754D;
        r1.fA(r8, r8);
        r2 = "preloaded_reel_mismatch";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r4);
        r0 = " ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        X.AnonymousClass0Gn.m1876C(r2, r0);
    L_0x009f:
        r0 = new X.0Qt;
        r0.<init>(r9);
        r9.f3751L = r0;
        r1 = X.AnonymousClass0Kq.m2860B();
        r0 = "ReelMediaPreloaderSerialExecutor";
        r1.f3132F = r0;
        r1.m2861A();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Nw.<init>(X.0Cm):void");
    }

    /* renamed from: A */
    public final void m3481A(AnonymousClass3b7 anonymousClass3b7) {
        Object obj;
        for (WeakReference weakReference : this.f3743D) {
            AnonymousClass3b7 anonymousClass3b72 = (AnonymousClass3b7) weakReference.get();
            if (anonymousClass3b72 == null) {
                this.f3743D.remove(weakReference);
            } else if (anonymousClass3b72 == anonymousClass3b7) {
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj == null) {
            this.f3743D.add(new WeakReference(anonymousClass3b7));
        }
    }

    /* renamed from: B */
    public static AnonymousClass0Nw m3475B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Nw anonymousClass0Nw = (AnonymousClass0Nw) anonymousClass0Cm.m1036A(AnonymousClass0Nw.class);
        if (anonymousClass0Nw == null || anonymousClass0Nw.f3742C) {
            anonymousClass0Cm.m1039D(AnonymousClass0Nw.class, new AnonymousClass0Nw(anonymousClass0Cm));
        }
        return (AnonymousClass0Nw) anonymousClass0Cm.m1036A(AnonymousClass0Nw.class);
    }

    /* renamed from: B */
    public final String m3482B() {
        return this.f3745F.f3754D.f2646B.getString("stories_preloaded_reel_ids", JsonProperty.USE_DEFAULT_NAME);
    }

    /* renamed from: C */
    public final String m3483C() {
        return this.f3745F.f3754D.f2646B.getString("stories_preloaded_reel_timestamp", JsonProperty.USE_DEFAULT_NAME);
    }

    /* renamed from: C */
    public static boolean m3476C(AnonymousClass0Nw anonymousClass0Nw, AnonymousClass16q anonymousClass16q, String str, Set set, Set set2) {
        if (anonymousClass0Nw.f3742C) {
            return true;
        }
        if (!set.isEmpty() || !set2.isEmpty()) {
            return false;
        }
        anonymousClass16q.m9446A(str);
        anonymousClass0Nw.f3745F.f3753C.sendEmptyMessageDelayed(0, 2000);
        return true;
    }

    /* renamed from: D */
    public static void m3477D(AnonymousClass0Nw anonymousClass0Nw, AnonymousClass0MI anonymousClass0MI, int i, int i2, AnonymousClass16q anonymousClass16q, String str) {
        int i3 = i2;
        AnonymousClass0Nw anonymousClass0Nw2 = anonymousClass0Nw;
        if (!anonymousClass0Nw2.f3742C) {
            int intValue;
            AnonymousClass0i5 JU;
            anonymousClass0Nw2.f3745F.f3753C.removeCallbacksAndMessages(null);
            Integer.valueOf(i);
            AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
            anonymousClass0MI2.getId();
            anonymousClass0MI2.f3385R.getName();
            String id = anonymousClass0MI2.getId();
            if (i3 == -1) {
                i3 = anonymousClass0MI2.m3143i();
            }
            int min = Math.min(i3 + i, anonymousClass0MI2.m3136b());
            Map linkedHashMap = new LinkedHashMap();
            Set hashSet = new HashSet();
            Map linkedHashMap2 = new LinkedHashMap();
            Set hashSet2 = new HashSet();
            Map linkedHashMap3 = new LinkedHashMap();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(id);
            stringBuilder.append("-cover");
            linkedHashMap3.put(stringBuilder.toString(), anonymousClass0MI2.m3112D());
            hashSet2.add(anonymousClass0MI2.m3112D());
            while (i3 < min) {
                AnonymousClass0Pj E = anonymousClass0MI2.m3113E(i3);
                if (E.m3888l()) {
                    String w;
                    linkedHashMap.put(E.getId(), E);
                    Object obj = (E.m3893q() && !E.eY() && ((Boolean) AnonymousClass0CC.ij.m846H(anonymousClass0Nw2.f3747H)).booleanValue()) ? 1 : null;
                    if (obj != null) {
                        w = E.f4134F.m3793w(0);
                    } else {
                        w = E.f4134F.m3794x(anonymousClass0Nw2.f3749J);
                    }
                    intValue = ((Integer) AnonymousClass0CC.GF.m846H(anonymousClass0Nw2.f3747H)).intValue();
                    if (intValue != -1 && ((double) intValue) > AnonymousClass0Fu.m1694B().m1696A()) {
                        w = E.f4134F.HA();
                    }
                    if (AnonymousClass0Nw.m3480G(w, E.getId(), id)) {
                        hashSet2.add(w);
                        linkedHashMap3.put(E.getId(), w);
                    }
                    Object k = E.f4134F.m3781k(anonymousClass0Nw2.f3749J);
                    if (!TextUtils.isEmpty(k) && AnonymousClass0Nw.m3480G(k, E.getId(), id)) {
                        hashSet2.add(k);
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(E.getId());
                        stringBuilder2.append("-overlay");
                        linkedHashMap3.put(stringBuilder2.toString(), k);
                    }
                    if (E.f4134F.wY() && !E.PV() && AnonymousClass0Nw.m3480G(E.JU().m6825A(), E.getId(), id)) {
                        JU = E.JU();
                        hashSet.add(JU);
                        linkedHashMap2.put(E.getId(), JU);
                    }
                } else if (E.pW()) {
                    linkedHashMap.put(E.getId(), E);
                    JU = E.JU();
                    if (JU != null) {
                        hashSet.add(JU);
                        linkedHashMap2.put(E.getId(), JU);
                    }
                }
                i3++;
            }
            AnonymousClass16q anonymousClass16q2 = anonymousClass16q;
            if (!AnonymousClass0Nw.m3476C(anonymousClass0Nw2, anonymousClass16q2, id, hashSet, hashSet2)) {
                String str2;
                String str3 = str;
                boolean B = AnonymousClass0RC.m4119B(str3);
                if (B) {
                    Map hashMap = new HashMap();
                    for (Entry entry : linkedHashMap3.entrySet()) {
                        String str4 = (String) entry.getKey();
                        str2 = (String) entry.getValue();
                        boolean z = false;
                        boolean z2 = linkedHashMap.containsKey(str4) && !((AnonymousClass0Pj) linkedHashMap.get(str4)).m3893q();
                        AnonymousClass0RL anonymousClass3bl = new AnonymousClass3bl(anonymousClass0Nw2, z2, id, str4);
                        anonymousClass0Nw2.f3741B.add(anonymousClass3bl);
                        if (str2 != null) {
                            AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.m1908D(str2);
                            D.f4645P = str3;
                            D.f4635F = true;
                            if (!("reel_background_prefetch".equals(str3) && ((Boolean) AnonymousClass0CC.mB.m846H(anonymousClass0Nw2.f3747H)).booleanValue())) {
                                z = true;
                            }
                            D.f4633D = z;
                            hashMap.put(str4, D.m4149C(anonymousClass3bl).m4147A());
                        }
                    }
                    for (Entry entry2 : linkedHashMap.entrySet()) {
                        String str5 = (String) entry2.getKey();
                        AnonymousClass0Pj anonymousClass0Pj = (AnonymousClass0Pj) entry2.getValue();
                        AnonymousClass0aa anonymousClass0aa = (AnonymousClass0aa) hashMap.get(str5);
                        JU = (AnonymousClass0i5) linkedHashMap2.get(str5);
                        AnonymousClass41Y anonymousClass41Y = null;
                        if (JU != null) {
                            anonymousClass41Y = new AnonymousClass41Y(anonymousClass0Nw2, id, str5);
                        }
                        if (AnonymousClass0cY.m5900D(anonymousClass0Nw2.f3747H).m5910A(str3, new AnonymousClass0nO(new AnonymousClass0i6(str5, anonymousClass0aa, JU), anonymousClass0Pj, anonymousClass41Y))) {
                            anonymousClass0Nw2.m3489I(new AnonymousClass3bi(anonymousClass0Nw2, id, str5));
                            anonymousClass0Nw2.f3744E.add(anonymousClass41Y);
                        }
                    }
                } else {
                    for (Entry entry22 : linkedHashMap2.entrySet()) {
                        str2 = (String) entry22.getKey();
                        AnonymousClass0i5 anonymousClass0i5 = (AnonymousClass0i5) entry22.getValue();
                        i = (linkedHashMap.containsKey(str2) && ((AnonymousClass0Pj) linkedHashMap.get(str2)).m3893q()) ? 1 : 0;
                        i2 = linkedHashMap.containsKey(str2) ? ((AnonymousClass0Pj) linkedHashMap.get(str2)).m3872V() : 0;
                        AnonymousClass0vA anonymousClass0vA = new AnonymousClass0vA(anonymousClass0i5);
                        anonymousClass0vA.f11974H = str3;
                        AnonymousClass17O anonymousClass17O = r19;
                        AnonymousClass17O anonymousClass17O2 = new AnonymousClass17O(anonymousClass0Nw2, id, hashSet, anonymousClass0i5, anonymousClass16q2, hashSet2, i, i2, str2);
                        anonymousClass0Nw2.f3748I.add(anonymousClass17O);
                        intValue = ((Integer) AnonymousClass0CC.dg.m846H(anonymousClass0Nw2.f3747H)).intValue();
                        if (intValue > 0) {
                            anonymousClass0vA.m8299C(intValue);
                        }
                        anonymousClass0vA.m8298B(anonymousClass17O);
                        AnonymousClass0vB.m8301C(anonymousClass0vA, anonymousClass0Nw2.f3747H);
                        if (i != 0) {
                            anonymousClass0Nw2.m3489I(new AnonymousClass1Zw(anonymousClass0Nw2, id, str2));
                        }
                    }
                }
                if (!B) {
                    for (Entry entry222 : linkedHashMap3.entrySet()) {
                        str2 = (String) entry222.getKey();
                        String str6 = (String) entry222.getValue();
                        boolean z3 = linkedHashMap.containsKey(str2) && !((AnonymousClass0Pj) linkedHashMap.get(str2)).m3893q();
                        AnonymousClass0RL anonymousClass17d = new AnonymousClass17d(anonymousClass0Nw2, id, str6, hashSet2, anonymousClass16q2, hashSet, z3, str2, linkedHashMap.containsKey(str2) ? ((AnonymousClass0Pj) linkedHashMap.get(str2)).f4134F.FA().longValue() : 0);
                        anonymousClass0Nw2.f3741B.add(anonymousClass17d);
                        if (str6 != null) {
                            AnonymousClass0RJ D2 = AnonymousClass0Gs.f2431j.m1908D(str6);
                            D2.f4645P = str3;
                            boolean z4 = true;
                            D2.f4635F = true;
                            if ("reel_background_prefetch".equals(str3)) {
                                if (((Boolean) AnonymousClass0CC.mB.m846H(anonymousClass0Nw2.f3747H)).booleanValue()) {
                                    z4 = false;
                                }
                            }
                            D2.f4633D = z4;
                            D2.m4149C(anonymousClass17d).m4148B();
                        }
                        if (z3) {
                            anonymousClass0Nw2.m3489I(new AnonymousClass17e(anonymousClass0Nw2, id, str2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: D */
    public final void m3484D(String str, int i, int i2, AnonymousClass3b8 anonymousClass3b8, String str2) {
        AnonymousClass10S anonymousClass10S = new AnonymousClass10S(str, i, i2, -1);
        List arrayList = new ArrayList();
        arrayList.add(anonymousClass10S);
        m3486F(arrayList, anonymousClass3b8, str2);
    }

    /* renamed from: E */
    private void m3478E() {
        if (!this.f3742C) {
            this.f3742C = true;
            AnonymousClass0xy.m8595B().m8603H(this.f3746G);
            this.f3741B.clear();
            this.f3748I.clear();
            this.f3744E.clear();
            this.f3746G.clear();
            this.f3743D.clear();
        }
    }

    /* renamed from: E */
    public final void m3485E(String str, int i, AnonymousClass3b8 anonymousClass3b8, String str2) {
        m3484D(str, i, -1, anonymousClass3b8, str2);
    }

    /* renamed from: F */
    public final void m3486F(List list, AnonymousClass3b8 anonymousClass3b8, String str) {
        AnonymousClass0Nw anonymousClass0Nw = this;
        if (!this.f3742C) {
            if (!list.isEmpty()) {
                Collections.sort(list, this.f3751L);
                AnonymousClass16q anonymousClass16q = new AnonymousClass16q(list, anonymousClass3b8);
                Object linkedHashSet = new LinkedHashSet();
                int i = 0;
                while (true) {
                    String str2 = str;
                    if (i >= list.size()) {
                        break;
                    }
                    AnonymousClass10S anonymousClass10S = (AnonymousClass10S) list.get(i);
                    AnonymousClass0MI D = AnonymousClass0MB.m3078C(anonymousClass0Nw.f3747H).m3085D(anonymousClass10S.f13271D);
                    int i2 = anonymousClass10S.f13270C;
                    int i3 = anonymousClass10S.f13272E;
                    if (D == null || !D.m3121M()) {
                        linkedHashSet.add(anonymousClass10S);
                    } else {
                        AnonymousClass0Nw.m3477D(anonymousClass0Nw, D, i2, i3, anonymousClass16q, str2);
                    }
                    i++;
                }
                if (AnonymousClass0RC.m4119B(str)) {
                    AnonymousClass0cY.m5900D(anonymousClass0Nw.f3747H).m5916G();
                }
                if (!linkedHashSet.isEmpty()) {
                    m3479F(new LinkedHashSet(linkedHashSet), anonymousClass16q, str);
                    linkedHashSet.clear();
                }
            } else if (anonymousClass3b8 != null) {
                anonymousClass3b8.onFinish();
            }
        }
    }

    /* renamed from: F */
    private void m3479F(Set set, AnonymousClass16q anonymousClass16q, String str) {
        if (!this.f3742C) {
            String str2;
            Set linkedHashSet = new LinkedHashSet();
            for (AnonymousClass10S anonymousClass10S : set) {
                linkedHashSet.add(anonymousClass10S.f13271D);
            }
            AnonymousClass0IE.m2145M(",", linkedHashSet);
            Iterator it = set.iterator();
            while (true) {
                str2 = str;
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass10S anonymousClass10S2 = (AnonymousClass10S) it.next();
                AnonymousClass3b5 anonymousClass16r = new AnonymousClass16r(this, anonymousClass10S2, anonymousClass16q, str);
                m3489I(new AnonymousClass16s(this, anonymousClass10S2));
                this.f3746G.add(anonymousClass16r);
                AnonymousClass0xy.m8595B().yIA(anonymousClass10S2.f13271D, this.f3747H, anonymousClass16r);
            }
            if (AnonymousClass0RC.m4119B(str)) {
                if (this.f3750K == null) {
                    this.f3750K = new AnonymousClass41X(this);
                }
                AnonymousClass0xy.m8595B().m8600E(linkedHashSet, this.f3747H, this.f3750K, null, str2);
                return;
            }
            AnonymousClass0xy.m8595B().m8599D(linkedHashSet, this.f3747H, str);
        }
    }

    /* renamed from: G */
    public final void m3487G(List list, int i, AnonymousClass3b8 anonymousClass3b8, String str) {
        List arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(new AnonymousClass10S((String) list.get(i2), i, -1, -1));
        }
        m3486F(arrayList, anonymousClass3b8, str);
    }

    /* renamed from: G */
    private static boolean m3480G(String str, String str2, String str3) {
        try {
            AnonymousClass0Gz.f2522C.AHA(str);
            return true;
        } catch (Throwable e) {
            AnonymousClass0Dc.m1244G("ReelMediaPreloader", "invalid uri", e);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("uri: ");
            stringBuilder.append(str);
            stringBuilder.append(" mediaId: ");
            stringBuilder.append(str2);
            stringBuilder.append(" reelId: ");
            stringBuilder.append(str3);
            AnonymousClass0Gn.m1878E("ReelMediaPreloader#invalidUri", stringBuilder.toString(), e);
            return false;
        }
    }

    /* renamed from: H */
    public final void m3488H(AnonymousClass3b7 anonymousClass3b7) {
        for (WeakReference weakReference : this.f3743D) {
            AnonymousClass3b7 anonymousClass3b72 = (AnonymousClass3b7) weakReference.get();
            if (anonymousClass3b72 == null) {
                this.f3743D.remove(weakReference);
            } else if (anonymousClass3b72 == anonymousClass3b7) {
                this.f3743D.remove(weakReference);
                return;
            }
        }
    }

    /* renamed from: I */
    public final void m3489I(AnonymousClass16t anonymousClass16t) {
        for (WeakReference weakReference : this.f3743D) {
            AnonymousClass3b7 anonymousClass3b7 = (AnonymousClass3b7) weakReference.get();
            if (anonymousClass3b7 == null) {
                this.f3743D.remove(weakReference);
            } else {
                anonymousClass16t.gD(anonymousClass3b7);
            }
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        m3478E();
    }
}
