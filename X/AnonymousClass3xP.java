package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3xP */
public final class AnonymousClass3xP extends AnonymousClass372 {
    /* renamed from: B */
    public AnonymousClass376 f47396B = this.f47394C;
    /* renamed from: C */
    public final Context f47397C;
    /* renamed from: D */
    public String f47398D;
    /* renamed from: E */
    public String f47399E;
    /* renamed from: F */
    public AnonymousClass0Cm f47400F;
    /* renamed from: G */
    private LinkedHashSet f47401G;
    /* renamed from: H */
    private final AnonymousClass0IP f47402H = AnonymousClass0Ix.B();
    /* renamed from: I */
    private final boolean f47403I;

    public AnonymousClass3xP(AnonymousClass36n anonymousClass36n, Context context) {
        super(anonymousClass36n, "fe", "FaceEffectAssetManager");
        this.f47397C = context;
        boolean booleanValue = ((Boolean) AnonymousClass0CC.IN.G()).booleanValue();
        this.f47403I = booleanValue;
        if (booleanValue) {
            this.f47402H.schedule(new AnonymousClass375(this));
        }
    }

    /* renamed from: A */
    public final long mo4718A() {
        return this.f37977E.f37929J;
    }

    /* renamed from: B */
    public final boolean mo4719B() {
        return this.f37977E.m18555I();
    }

    /* renamed from: B */
    public static boolean m21704B(List list, List list2) {
        Set hashSet = new HashSet();
        for (AnonymousClass36h anonymousClass36h : list) {
            if (!anonymousClass36h.f37888R) {
                hashSet.add(anonymousClass36h.f37882L);
            }
        }
        for (AnonymousClass36h anonymousClass36h2 : list2) {
            if (!anonymousClass36h2.f37888R) {
                if (!hashSet.contains(anonymousClass36h2.f37882L)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    private static void m21705C(AnonymousClass3xP anonymousClass3xP, List list) {
        LinkedHashSet linkedHashSet = anonymousClass3xP.f47401G;
        if (linkedHashSet != null) {
            if (!linkedHashSet.isEmpty()) {
                Collection arrayList = new ArrayList(anonymousClass3xP.f47401G.size());
                Collection arrayList2 = new ArrayList(list.size() - anonymousClass3xP.f47401G.size());
                for (AnonymousClass36h anonymousClass36h : list) {
                    if (anonymousClass3xP.f47401G.contains(anonymousClass36h.f37882L)) {
                        arrayList.add(anonymousClass36h);
                    } else {
                        arrayList2.add(anonymousClass36h);
                    }
                }
                list.clear();
                list.addAll(arrayList);
                list.addAll(arrayList2);
            }
        }
    }

    /* renamed from: E */
    public final /* bridge */ /* synthetic */ void mo4720E(Object obj) {
        m21715N((AnonymousClass37n) obj);
    }

    /* renamed from: H */
    public final void mo4721H(AnonymousClass37m anonymousClass37m, AnonymousClass0Iw anonymousClass0Iw) {
        int C = (int) this.f37977E.m18549C();
        if (C == 0) {
            C = AnonymousClass44W.m22653B(this.f47400F);
        }
        String str = this.f47398D;
        String str2 = this.f47399E;
        AnonymousClass0Iw anonymousClass37j = new AnonymousClass37j(anonymousClass37m, anonymousClass0Iw, C, str, str2);
        AnonymousClass0GA D = AnonymousClass37c.m18636D(C, AnonymousClass0JI.getInstance().getLastLocation(), str, str2);
        D.f2849B = anonymousClass37j;
        AnonymousClass0Ix.D(D);
    }

    /* renamed from: I */
    public final void m21710I(String str) {
        if (this.f47401G == null) {
            this.f47401G = new LinkedHashSet();
        }
        if (str != null && !this.f47401G.contains(str)) {
            this.f47401G.add(str);
        }
    }

    /* renamed from: J */
    public final List m21711J() {
        List arrayList = new ArrayList(this.f37977E.f37926G);
        arrayList.addAll(Collections.unmodifiableList(this.f37977E.f37935P));
        r3 = new AnonymousClass36h[5];
        int i = 0;
        r3[0] = this.f37977E.f37921B;
        r3[1] = this.f37977E.f37922C;
        r3[2] = this.f37977E.f37923D;
        r3[3] = this.f37977E.f37928I;
        r3[4] = this.f37977E.f37934O;
        int length = r3.length;
        while (i < length) {
            Object obj = r3[i];
            if (obj != null) {
                arrayList.add(obj);
            }
            i++;
        }
        return arrayList;
    }

    /* renamed from: K */
    public final int m21712K(int i) {
        return Math.min(AnonymousClass0MM.K(this.f47397C) ? 100 : 6, i);
    }

    /* renamed from: L */
    public final boolean m21713L() {
        return this.f37977E.f37928I != null && ((Boolean) AnonymousClass0CC.rX.G()).booleanValue();
    }

    /* renamed from: M */
    public final boolean m21714M() {
        List unmodifiableList = Collections.unmodifiableList(this.f37977E.f37935P);
        return (unmodifiableList == null || unmodifiableList.isEmpty() || !((Boolean) AnonymousClass0CC.lD.G()).booleanValue()) ? false : true;
    }

    /* renamed from: N */
    public final void m21715N(AnonymousClass37n anonymousClass37n) {
        List list = anonymousClass37n.f38115C;
        if (list == null) {
            list = new ArrayList();
        }
        Integer.valueOf(r9.size());
        if (r9.isEmpty()) {
            AnonymousClass0Gn.H("ig_camera", "The FE list received is empty");
            return;
        }
        boolean z;
        Context context = this.f47397C;
        boolean z2 = this.f47403I;
        AnonymousClass0Cm anonymousClass0Cm = this.f47400F;
        List<AnonymousClass36h> list2 = this.f37977E.f37926G;
        if (z2) {
            Map hashMap = new HashMap();
            for (AnonymousClass36h anonymousClass36h : list2) {
                if (!(anonymousClass36h.f37888R || anonymousClass36h.m18537C())) {
                    hashMap.put(anonymousClass36h.f37882L, anonymousClass36h);
                }
            }
            Map J = AnonymousClass38R.m18729J(context, anonymousClass0Cm);
            z = false;
            for (AnonymousClass36h anonymousClass36h2 : r9) {
                if (!anonymousClass36h2.f37888R) {
                    if (!anonymousClass36h2.m18537C()) {
                        Integer num;
                        String str = anonymousClass36h2.f37882L;
                        AnonymousClass36h anonymousClass36h3 = (AnonymousClass36h) hashMap.get(str);
                        Integer num2 = null;
                        if (anonymousClass36h3 == null) {
                            num = null;
                        } else {
                            num = Integer.valueOf(anonymousClass36h3.f37876F);
                        }
                        Integer num3 = J.containsKey(str) ? (Integer) J.get(str) : null;
                        if (num != null) {
                            int max;
                            if (num3 != null) {
                                max = Math.max(num.intValue(), num3.intValue());
                            } else {
                                max = num.intValue();
                            }
                            num2 = Integer.valueOf(max);
                        } else if (num3 != null) {
                            num2 = num3;
                        }
                        int i = anonymousClass36h2.f37876F;
                        if (num2 != null && num2.intValue() > i) {
                            anonymousClass36h2.f37876F = num2.intValue();
                        }
                        if (!z && anonymousClass36h2.f37876F == 0) {
                            z = true;
                        }
                    }
                }
            }
        } else {
            z = AnonymousClass3xP.m21704B(list2, r9);
        }
        int i2 = 0;
        boolean z3 = z && ((Boolean) AnonymousClass0CC.HN.G()).booleanValue();
        this.f47397C.getSharedPreferences("ig_mq_asset_prefs", 0).edit().putInt("prefs_effect_format_version_key", anonymousClass37n.f38116D).apply();
        AnonymousClass3xP.m21705C(this, r9);
        this.f37977E.m18557K(anonymousClass37n.f38114B, r9, anonymousClass37n.f38116D, System.currentTimeMillis());
        AnonymousClass376 anonymousClass376 = this.f47396B;
        LinkedHashSet linkedHashSet = this.f47401G;
        if (linkedHashSet != null) {
            i2 = linkedHashSet.size();
        }
        anonymousClass376.Ll(r9, anonymousClass37n, z3, i2);
    }
}
