package X;

import android.content.Context;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0jQ */
public final class AnonymousClass0jQ extends AnonymousClass0VA implements OnScrollListener {
    /* renamed from: B */
    public final AnonymousClass0iA f9145B;
    /* renamed from: C */
    public HashMap f9146C = null;
    /* renamed from: D */
    public final AnonymousClass0PZ f9147D;
    /* renamed from: E */
    private final AnonymousClass0F8 f9148E = new AnonymousClass1Ip(this);
    /* renamed from: F */
    private final Context f9149F;
    /* renamed from: G */
    private final AnonymousClass10t f9150G;
    /* renamed from: H */
    private boolean f9151H;
    /* renamed from: I */
    private final AnonymousClass0jP f9152I;
    /* renamed from: J */
    private final AnonymousClass0Ns f9153J;
    /* renamed from: K */
    private boolean f9154K;
    /* renamed from: L */
    private long f9155L;
    /* renamed from: M */
    private int f9156M = 0;
    /* renamed from: N */
    private int f9157N;
    /* renamed from: O */
    private final long f9158O;
    /* renamed from: P */
    private long f9159P;
    /* renamed from: Q */
    private final int f9160Q;
    /* renamed from: R */
    private final AnonymousClass0Cm f9161R;

    public AnonymousClass0jQ(AnonymousClass0iA anonymousClass0iA, AnonymousClass0PZ anonymousClass0PZ, Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ns anonymousClass0Ns, AnonymousClass0jP anonymousClass0jP, int i, boolean z, long j) {
        this.f9145B = anonymousClass0iA;
        this.f9147D = anonymousClass0PZ;
        this.f9150G = new AnonymousClass10t(AnonymousClass0ke.DOWN);
        this.f9149F = context;
        this.f9161R = anonymousClass0Cm;
        this.f9153J = anonymousClass0Ns;
        this.f9152I = anonymousClass0jP;
        this.f9151H = z;
        this.f9160Q = i;
        this.f9158O = j;
        this.f9159P = (long) AnonymousClass0J1.m2415B(this.f9161R).f2876M;
        if (AnonymousClass0J1.m2415B(this.f9161R).f2871H) {
            this.f9146C = new HashMap();
        }
    }

    /* renamed from: B */
    public static boolean m7112B(AnonymousClass0jQ anonymousClass0jQ, AnonymousClass0nW anonymousClass0nW, boolean z) {
        AnonymousClass0jQ anonymousClass0jQ2 = anonymousClass0jQ;
        AnonymousClass0nW anonymousClass0nW2 = anonymousClass0nW;
        if (AnonymousClass0fk.m6549B(anonymousClass0jQ2.f9161R).f7984D.contains(anonymousClass0nW2.f10079F)) {
            AnonymousClass11X.m8805D(anonymousClass0nW2.f10076C.m6526E(), anonymousClass0nW2.f10075B.m7663A(), anonymousClass0nW2.f10078E.toString(), 5, anonymousClass0jQ2.f9153J.m3472A(), anonymousClass0jQ2.f9157N, anonymousClass0jQ2.f9145B.m6851P(anonymousClass0nW2.f10079F));
            DLog.m8809e(DLogTag.ASYNC_ADS, "[AA] Target item id already exist, ignore this item", new Object[0]);
            return false;
        }
        if (anonymousClass0jQ2.f9145B.f8581J.m7394F(anonymousClass0nW2.f10079F)) {
            boolean P = anonymousClass0jQ2.f9145B.m6851P(anonymousClass0nW2.f10079F);
            while (anonymousClass0jQ2.f9145B.m6847L(P).f7894J == AnonymousClass0mZ.MEDIA && "explore_story".equals(anonymousClass0jQ2.f9145B.m6847L(P).m6523B().XB)) {
                P++;
            }
            if (anonymousClass0jQ2.f9145B.f8581J.m7394F(anonymousClass0nW2.f10076C.f7904T)) {
                DLog.m8809e(DLogTag.ASYNC_ADS, "[AA] Ad from %s already exists", anonymousClass0nW2.f10078E.toString());
                AnonymousClass11X.m8804C(anonymousClass0nW2.f10076C.m6526E(), anonymousClass0nW2.f10075B.m7663A(), anonymousClass0nW2.f10078E.toString(), 3, P);
                return false;
            }
            Boolean bool = anonymousClass0jQ2.f9153J.f3735B;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            int i = anonymousClass0nW2.f10077D;
            int i2 = anonymousClass0jQ2.f9160Q;
            if (i < i2) {
                i2 = anonymousClass0nW2.f10077D;
            }
            AnonymousClass1Ce anonymousClass1Ce = AnonymousClass1Ce.FAIL_UNKNOWN;
            int i3 = 0;
            while (i3 <= i2) {
                anonymousClass1Ce = anonymousClass0jQ2.m7114D(P + i3, booleanValue, anonymousClass0nW2);
                if (anonymousClass1Ce == AnonymousClass1Ce.SUCCESS) {
                    break;
                } else if (anonymousClass0nW2.f10075B == AnonymousClass0nY.f10087F) {
                    break;
                } else {
                    i3++;
                }
            }
            boolean z2 = anonymousClass1Ce == AnonymousClass1Ce.SUCCESS;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[AA] ");
            stringBuilder.append(anonymousClass0nW2.f10075B.toString());
            stringBuilder.append(z2 ? " succeed. " : " failed.");
            stringBuilder.append(" LVP=");
            stringBuilder.append(anonymousClass0jQ2.f9157N);
            stringBuilder.append(" TP=");
            stringBuilder.append(P);
            stringBuilder.append(" Offset=");
            stringBuilder.append(i3);
            String stringBuilder2 = stringBuilder.toString();
            if (z2) {
                if (anonymousClass0nW2.f10076C.f7894J == AnonymousClass0mZ.MEDIA) {
                    AnonymousClass0P7 B = anonymousClass0nW2.f10076C.m6523B();
                    AnonymousClass0vq B2 = AnonymousClass0vv.m8374B(B, 0, anonymousClass0jQ2.f9149F);
                    if (B2 != null) {
                        if (B2.f12147F == AnonymousClass0xM.AD_DESTINATION_CANVAS) {
                            AnonymousClass11b anonymousClass11b = new AnonymousClass11b(B2.f12144C);
                            anonymousClass11b.f13425E = AnonymousClass0Nm.m3430I(anonymousClass0jQ2.f9149F);
                            anonymousClass11b.f13426F = AnonymousClass0Nm.m3431J(anonymousClass0jQ2.f9149F);
                            anonymousClass11b.f13427G = anonymousClass0jQ2.f9161R;
                            new AnonymousClass11c(anonymousClass11b).m8811A();
                        } else if (B2.f12147F == AnonymousClass0xM.AD_DESTINATION_LEAD_AD && B.rA()) {
                            AnonymousClass11m.m8823B(new AnonymousClass11l(new AnonymousClass11k(B2.f12146E, anonymousClass0jQ2.f9161R)));
                        }
                    }
                    if (anonymousClass0jQ2.f9151H && B.eA()) {
                        AnonymousClass0jP anonymousClass0jP = anonymousClass0jQ2.f9152I;
                        Context context = anonymousClass0jQ2.f9149F;
                        AnonymousClass0iE anonymousClass0iE = anonymousClass0jQ2.f9145B;
                        AnonymousClass0ts anonymousClass0ts = anonymousClass0jP.f9139B;
                        if (anonymousClass0ts != null) {
                            anonymousClass0ts.m8191C(B.m3794x(context));
                            AnonymousClass0m3 RO = anonymousClass0iE.RO(B);
                            anonymousClass0jP.f9141D.m7102I(B, AnonymousClass0ty.m8207B(RO.f9688W, AnonymousClass0Gk.m1858J(B, RO.f9673H), RO.HB == AnonymousClass0tx.f11780F));
                        } else if (anonymousClass0jP.f9140C) {
                            AnonymousClass0Gn.m1876C("AsyncAdsMediaWarmUp::NeverInitialized", "mIgCacheImageView was never initialized");
                        } else {
                            AnonymousClass0Gn.m1876C("AsyncAdsMediaWarmUp::WasDisposed", "mIgCacheImageView was disposed");
                        }
                    }
                }
                String E = anonymousClass0nW2.f10076C.m6526E();
                int A = anonymousClass0nW2.f10075B.m7663A();
                String anonymousClass0nX = anonymousClass0nW2.f10078E.toString();
                String A2 = anonymousClass0jQ2.f9153J.m3472A();
                int i4 = anonymousClass0jQ2.f9157N;
                AnonymousClass0bP B3 = AnonymousClass11X.m8803B("controller_action_success");
                B3.EE = E;
                B3.f6740P = A;
                B3.f6753c = anonymousClass0nX;
                B3.zB = A2;
                B3.qB = Boolean.valueOf(z);
                B3.f6747W = i4;
                B3.f6743S = P;
                B3.f6749Y = i3;
                B3.f6744T = AnonymousClass0Gd.m1838C() - AnonymousClass11X.f13420C;
                AnonymousClass0qj anonymousClass0qj = AnonymousClass0qj.f10992C;
                int i5 = P + 1;
                B3.TB = Integer.toString(anonymousClass0qj.m7936A(AnonymousClass0qk.AD, i5));
                B3.UB = Integer.toString(anonymousClass0qj.m7936A(AnonymousClass0qk.NETEGO, i5));
                B3.m5577B().m3311S();
                DLog.m8808d(DLogTag.ASYNC_ADS, stringBuilder2, new Object[0]);
            } else {
                if (!z) {
                    int i6;
                    switch (anonymousClass1Ce.ordinal()) {
                        case 1:
                            i6 = 2;
                            break;
                        case 2:
                            i6 = 6;
                            break;
                        case 4:
                            i6 = 7;
                            break;
                        default:
                            i6 = 0;
                            break;
                    }
                    AnonymousClass11X.m8805D(anonymousClass0nW2.f10076C.m6526E(), anonymousClass0nW2.f10075B.m7663A(), anonymousClass0nW2.f10078E.toString(), i6, anonymousClass0jQ2.f9153J.m3472A(), anonymousClass0jQ2.f9157N, P);
                }
                AnonymousClass11V.m8801B(anonymousClass0jQ2.f9161R).f13417B.add(new AnonymousClass1Iq(anonymousClass0nW2));
                DLog.m8809e(DLogTag.ASYNC_ADS, stringBuilder2, new Object[0]);
            }
            return z2;
        }
        if (!z) {
            String E2 = anonymousClass0nW2.f10076C.m6526E();
            int A3 = anonymousClass0nW2.f10075B.m7663A();
            String anonymousClass0nX2 = anonymousClass0nW2.f10078E.toString();
            String A4 = anonymousClass0jQ2.f9153J.m3472A();
            anonymousClass0nX = anonymousClass0nW2.f10079F;
            String A5 = AnonymousClass0fk.m6549B(anonymousClass0jQ2.f9161R).m6550A();
            AnonymousClass0bP B4 = AnonymousClass11X.m8803B("controller_action_fail");
            B4.EE = E2;
            B4.f6740P = A3;
            B4.f6753c = anonymousClass0nX2;
            B4.f6741Q = Integer.valueOf(1).intValue();
            B4.zB = A4;
            B4.f6754d = anonymousClass0nX;
            B4.f6746V = A5;
            B4.m5577B().m3311S();
        }
        AnonymousClass11V.m8801B(anonymousClass0jQ2.f9161R).f13417B.add(new AnonymousClass1Iq(anonymousClass0nW2));
        DLog.m8809e(DLogTag.ASYNC_ADS, "[AA] Target media doesn't exist", new Object[0]);
        return false;
    }

    /* renamed from: C */
    private void m7113C() {
        long B = AnonymousClass0Gd.m1837B();
        if (B - this.f9155L > this.f9159P && !AnonymousClass11V.m8801B(this.f9161R).f13417B.isEmpty()) {
            int i;
            this.f9155L = B;
            ArrayList arrayList = new ArrayList();
            Iterator it = AnonymousClass11V.m8801B(this.f9161R).f13417B.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass1Iq anonymousClass1Iq = (AnonymousClass1Iq) it.next();
                AnonymousClass0nW anonymousClass0nW = anonymousClass1Iq.f16910B;
                if (this.f9158O != 0) {
                    if (B - anonymousClass1Iq.f16911C >= this.f9158O) {
                        AnonymousClass11V.m8801B(this.f9161R).f13417B.remove(anonymousClass1Iq);
                        AnonymousClass11X.m8804C(anonymousClass0nW.f10076C.m6526E(), anonymousClass0nW.f10075B.m7663A(), anonymousClass0nW.f10078E.toString(), 4, this.f9145B.m6851P(anonymousClass0nW.f10079F));
                        DLog.m8808d(DLogTag.ASYNC_ADS, "[AA] Removed expired ad in pool", new Object[0]);
                    }
                }
                if (AnonymousClass0jQ.m7112B(this, anonymousClass0nW, true)) {
                    DLogTag dLogTag = DLogTag.ASYNC_ADS;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("[AA] Ad successfully inserted/replaced after ");
                    stringBuilder.append(B - anonymousClass1Iq.f16911C);
                    stringBuilder.append("ms");
                    DLog.m8808d(dLogTag, stringBuilder.toString(), new Object[0]);
                    arrayList.add(anonymousClass1Iq);
                }
            }
            int size = arrayList.size();
            while (i < size) {
                AnonymousClass11V.m8801B(this.f9161R).f13417B.remove((AnonymousClass1Iq) arrayList.get(i));
                i++;
            }
        }
    }

    /* renamed from: D */
    private AnonymousClass1Ce m7114D(int i, boolean z, AnonymousClass0nW anonymousClass0nW) {
        List list = this.f9145B.f8581J.f9605C;
        if (i >= 0) {
            if (i < list.size()) {
                if (AnonymousClass0J1.m2415B(this.f9161R).f2867D && ((AnonymousClass0fH) list.get(i)).f7894J == AnonymousClass0mZ.END_OF_FEED_DEMARCATOR) {
                    return AnonymousClass1Ce.FAIL_BELOW_EOF_DEMARCATOR;
                }
                boolean z2;
                if (!AnonymousClass0J1.m2415B(this.f9161R).f2868E || AnonymousClass0J1.m2415B(this.f9161R).f2870G == null) {
                    z2 = true;
                } else {
                    AnonymousClass0nP anonymousClass0nP = AnonymousClass0J1.m2415B(this.f9161R).f2870G;
                    z2 = true;
                    if (anonymousClass0nW.f10075B == AnonymousClass0nY.f10086E) {
                        if (!AnonymousClass1Ir.m10677B(list, anonymousClass0nW, i, anonymousClass0nP, true) || !AnonymousClass1Ir.m10677B(list, anonymousClass0nW, i, anonymousClass0nP, false)) {
                            z2 = false;
                        }
                    }
                }
                if (!z2) {
                    return AnonymousClass1Ce.FAIL_MIN_GAP;
                }
                if (z) {
                    int i2 = this.f9157N;
                    if (i <= i2) {
                        if (i == i2) {
                            if (!(this.f9150G.f13334B.equals(AnonymousClass0ke.UP) || this.f9156M == 0)) {
                                if (!this.f9154K) {
                                }
                            }
                        }
                        return AnonymousClass1Ce.FAIL_VIEWPORT;
                    }
                }
                switch (anonymousClass0nW.f10075B.ordinal()) {
                    case 0:
                        AnonymousClass0iA anonymousClass0iA = this.f9145B;
                        AnonymousClass0fH anonymousClass0fH = (AnonymousClass0fH) anonymousClass0iA.f8581J.m7398J(i);
                        AnonymousClass0lo.m7388B(anonymousClass0iA.f8581J, anonymousClass0nW.f10076C, i);
                        anonymousClass0iA.f8581J.m7406R(anonymousClass0fH);
                        AnonymousClass0iA.m6838B(anonymousClass0iA);
                        break;
                    case 1:
                        HashMap hashMap = this.f9146C;
                        if (hashMap == null) {
                            this.f9145B.m6841F(anonymousClass0nW.f10076C, i + 1);
                            break;
                        }
                        synchronized (hashMap) {
                            this.f9146C.put(anonymousClass0nW.f10076C, Integer.valueOf(i + 1));
                        }
                        break;
                    default:
                        break;
                }
                AnonymousClass0fk B = AnonymousClass0fk.m6549B(this.f9161R);
                B.f7984D.add(anonymousClass0nW.f10079F);
                AnonymousClass11W.f13418B.put(anonymousClass0nW.f10076C.f7904T, anonymousClass0nW.f10078E.toString());
                return AnonymousClass1Ce.SUCCESS;
            }
        }
        return AnonymousClass1Ce.FAIL_INVALID_TARGET_POSITION;
    }

    public final void ei() {
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass0nR.class, this.f9148E);
    }

    public final void oh() {
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass0nR.class, this.f9148E);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.m5859I(this, 1826337021);
        this.f9150G.m8771A(i);
        int lastVisiblePosition = absListView.getLastVisiblePosition();
        if (absListView.getItemAtPosition(lastVisiblePosition) instanceof AnonymousClass0P8) {
            this.f9157N = this.f9145B.m6851P(((AnonymousClass0P8) absListView.getItemAtPosition(lastVisiblePosition)).getId());
            boolean z = true;
            Object tag = absListView.getChildAt(absListView.getChildCount() - 1).getTag();
            if (tag == null || !(tag instanceof AnonymousClass0pz)) {
                z = false;
            }
            this.f9154K = z;
        }
        if (this.f9159P > 0) {
            m7113C();
        }
        AnonymousClass0cQ.m5858H(this, 871812565, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.m5859I(this, 1188463670);
        this.f9156M = i;
        if (this.f9159P > 0 && this.f9156M == 0) {
            m7113C();
        }
        AnonymousClass0cQ.m5858H(this, 1339694163, I);
    }
}
