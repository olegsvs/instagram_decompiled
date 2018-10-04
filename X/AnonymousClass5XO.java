package X;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5XO */
public final class AnonymousClass5XO implements AnonymousClass4ob {
    /* renamed from: B */
    private final Map f65832B = new HashMap();
    /* renamed from: C */
    private AnonymousClass1Ri f65833C;
    /* renamed from: D */
    private List f65834D = Collections.unmodifiableList(new ArrayList());
    /* renamed from: E */
    private final List f65835E = new ArrayList();
    /* renamed from: F */
    private final Map f65836F = new HashMap();
    /* renamed from: G */
    private final AnonymousClass0EE f65837G;
    /* renamed from: H */
    private AnonymousClass0nS f65838H;

    public AnonymousClass5XO(AnonymousClass1Ri anonymousClass1Ri, AnonymousClass0nS anonymousClass0nS, AnonymousClass0EE anonymousClass0EE) {
        this.f65833C = anonymousClass1Ri;
        this.f65838H = anonymousClass0nS;
        this.f65837G = anonymousClass0EE;
    }

    public final boolean DKA(String str, AnonymousClass0P7 anonymousClass0P7) {
        if (!this.f65836F.containsKey(anonymousClass0P7.getId()) && this.f65836F.containsKey(str)) {
            this.f65836F.remove(str);
            this.f65836F.put(anonymousClass0P7.getId(), anonymousClass0P7);
            for (AnonymousClass1UV anonymousClass1UV : this.f65835E) {
                if (anonymousClass1UV.f20802L == AnonymousClass1dy.MEDIA && anonymousClass1UV.B().equals(str)) {
                    anonymousClass1UV.E(anonymousClass0P7);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean JF(AnonymousClass0P7 anonymousClass0P7) {
        return this.f65836F.containsValue(anonymousClass0P7);
    }

    public final boolean LF(String str) {
        for (int i = 0; i < this.f65834D.size(); i++) {
            AnonymousClass1UV anonymousClass1UV = (AnonymousClass1UV) this.f65834D.get(i);
            Object obj = null;
            switch (anonymousClass1UV.f20802L.ordinal()) {
                case 1:
                    obj = ((AnonymousClass0P7) anonymousClass1UV.f20795E).MA().getId();
                    break;
                case 2:
                    obj = ((AnonymousClass1e0) anonymousClass1UV.f20795E).f20830E.MA().getId();
                    break;
                case ParserMinimalBase.INT_CR /*13*/:
                    obj = ((AnonymousClass3JH) anonymousClass1UV.f20795E).f40019B.f15179I.getId();
                    break;
                default:
                    break;
            }
            if (str.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean NV() {
        return this.f65834D.isEmpty() ^ 1;
    }

    public final void YB(List list, String str) {
        int i = 0;
        for (AnonymousClass1UV anonymousClass1UV : list) {
            Object obj = null;
            String B = anonymousClass1UV.B();
            switch (anonymousClass1UV.f20802L.ordinal()) {
                case 1:
                    obj = (AnonymousClass0P7) anonymousClass1UV.f20795E;
                    break;
                case 2:
                    AnonymousClass1e0 anonymousClass1e0 = (AnonymousClass1e0) anonymousClass1UV.f20795E;
                    this.f65832B.put(anonymousClass1e0, anonymousClass1UV);
                    obj = anonymousClass1e0.f20830E;
                    break;
                default:
                    break;
            }
            if (B == null || obj == null) {
                this.f65835E.add(anonymousClass1UV);
            } else if (this.f65836F.containsKey(B)) {
                i++;
            } else {
                this.f65836F.put(B, obj);
                this.f65835E.add(anonymousClass1UV);
            }
        }
        if (i > 0) {
            AnonymousClass4pE.m25149B(this.f65837G, i, str);
        }
    }

    public final void clear() {
        this.f65836F.clear();
        this.f65832B.clear();
        this.f65835E.clear();
        this.f65834D = Collections.unmodifiableList(new ArrayList());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dH(java.util.List r8, X.AnonymousClass3JJ r9) {
        /*
        r7 = this;
        r6 = new java.util.ArrayList;
        r6.<init>();
        r5 = 0;
    L_0x0006:
        r0 = r7.f65835E;
        r0 = r0.size();
        if (r5 >= r0) goto L_0x0065;
    L_0x000e:
        r0 = r7.f65835E;
        r4 = r0.get(r5);
        r4 = (X.AnonymousClass1UV) r4;
        r1 = X.AnonymousClass4oa.f57574B;
        r0 = r4.f20802L;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 0;
        switch(r0) {
            case 1: goto L_0x0032;
            case 2: goto L_0x002d;
            case 3: goto L_0x0026;
            default: goto L_0x0024;
        };
    L_0x0024:
        r3 = r1;
        goto L_0x0038;
    L_0x0026:
        r0 = r4.f20795E;
        r0 = (X.AnonymousClass3JH) r0;
        r3 = r1;
        r1 = r0;
        goto L_0x0038;
    L_0x002d:
        r3 = r4.f20795E;
        r3 = (X.AnonymousClass0P7) r3;
        goto L_0x0038;
    L_0x0032:
        r0 = r4.f20795E;
        r0 = (X.AnonymousClass1e0) r0;
        r3 = r0.f20830E;
    L_0x0038:
        r2 = 1;
        if (r3 == 0) goto L_0x0052;
    L_0x003b:
        r1 = r8.iterator();
    L_0x003f:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x005d;
    L_0x0045:
        r0 = r1.next();
        r0 = (X.AnonymousClass1ew) r0;
        r0 = r0.aTA(r3);
        if (r0 != 0) goto L_0x003f;
    L_0x0051:
        goto L_0x005c;
    L_0x0052:
        if (r1 == 0) goto L_0x005d;
    L_0x0054:
        if (r9 == 0) goto L_0x005d;
    L_0x0056:
        r0 = r9.aTA(r1);
        if (r0 != 0) goto L_0x005d;
    L_0x005c:
        r2 = 0;
    L_0x005d:
        if (r2 == 0) goto L_0x0062;
    L_0x005f:
        r6.add(r4);
    L_0x0062:
        r5 = r5 + 1;
        goto L_0x0006;
    L_0x0065:
        r0 = java.util.Collections.unmodifiableList(r6);
        r7.f65834D = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5XO.dH(java.util.List, X.3JJ):void");
    }

    public final AnonymousClass1UV hJ(AnonymousClass1e0 anonymousClass1e0) {
        return (AnonymousClass1UV) this.f65832B.get(anonymousClass1e0);
    }

    public final void iPA(AnonymousClass0nS anonymousClass0nS, boolean z) {
        this.f65838H = anonymousClass0nS;
        if (z) {
            this.f65833C.A(this.f65838H, this.f65834D, true);
        }
    }

    public final Iterator iterator() {
        if (this.f65838H == AnonymousClass0nS.FEED) {
            return new AnonymousClass5XM(this.f65834D);
        }
        return new AnonymousClass5XN(this.f65834D);
    }
}
