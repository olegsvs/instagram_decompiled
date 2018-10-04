package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.forker.Process;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Cx */
public final class AnonymousClass5Cx extends BaseAdapter {
    /* renamed from: B */
    public final Map f61194B = new HashMap();
    /* renamed from: C */
    public final List f61195C = new ArrayList();
    /* renamed from: D */
    private final AnonymousClass0QM f61196D;
    /* renamed from: E */
    private final AnonymousClass0QY f61197E;
    /* renamed from: F */
    private final Context f61198F;
    /* renamed from: G */
    private int f61199G = Integer.MAX_VALUE;
    /* renamed from: H */
    private final AnonymousClass0p8 f61200H = new AnonymousClass0p7();
    /* renamed from: I */
    private final AnonymousClass0QE f61201I;
    /* renamed from: J */
    private int f61202J = Process.WAIT_RESULT_TIMEOUT;
    /* renamed from: K */
    private final AnonymousClass0QR f61203K;
    /* renamed from: L */
    private final AnonymousClass0QX f61204L;
    /* renamed from: M */
    private final AnonymousClass0EE f61205M;
    /* renamed from: N */
    private final AnonymousClass0ag f61206N = new AnonymousClass0ag();
    /* renamed from: O */
    private final Map f61207O = new HashMap();
    /* renamed from: P */
    private final AnonymousClass0Qf f61208P;
    /* renamed from: Q */
    private final boolean f61209Q;
    /* renamed from: R */
    private final AnonymousClass0Cm f61210R;

    public final int getViewTypeCount() {
        return 5;
    }

    public AnonymousClass5Cx(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0QE anonymousClass0QE, AnonymousClass0QR anonymousClass0QR, AnonymousClass0QX anonymousClass0QX, AnonymousClass0QM anonymousClass0QM, AnonymousClass0QY anonymousClass0QY, AnonymousClass0Qf anonymousClass0Qf, AnonymousClass0EE anonymousClass0EE, boolean z) {
        this.f61198F = context;
        this.f61210R = anonymousClass0Cm;
        this.f61201I = anonymousClass0QE;
        this.f61203K = anonymousClass0QR;
        this.f61204L = anonymousClass0QX;
        this.f61196D = anonymousClass0QM;
        this.f61197E = anonymousClass0QY;
        this.f61208P = anonymousClass0Qf;
        this.f61205M = anonymousClass0EE;
        this.f61209Q = z;
    }

    /* renamed from: A */
    public final void m25971A(int i, AnonymousClass14t anonymousClass14t) {
        if (!this.f61194B.containsKey(anonymousClass14t.E())) {
            this.f61195C.add(i, anonymousClass14t);
            this.f61194B.put(anonymousClass14t.E(), anonymousClass14t);
        }
    }

    /* renamed from: B */
    public final void m25972B(View view, int i) {
        int i2 = i;
        AnonymousClass14t anonymousClass14t = (AnonymousClass14t) this.f61195C.get(i2);
        AnonymousClass0Pj C = anonymousClass14t.C();
        AnonymousClass14s F = m25976F(C);
        Object tag = view.getTag();
        switch (getItemViewType(i2)) {
            case 0:
                AnonymousClass14q anonymousClass14q = (AnonymousClass14q) tag;
                AnonymousClass14u.E(r0.f61210R, anonymousClass14q, anonymousClass14t, C, F, r0.f61208P);
                anonymousClass14q.f14053E.ip(anonymousClass14q, anonymousClass14t, C);
                return;
            case 1:
                AnonymousClass14Y.F(r0.f61210R, (AnonymousClass14Z) tag, anonymousClass14t, C, F, anonymousClass14t.P(), anonymousClass14t.L(C), AnonymousClass0LQ.B(anonymousClass14t.H().pT(), r0.f61210R.B()), r0.f61201I, r0.f61208P, r0.f61209Q, r0.f61205M);
                return;
            case 2:
                AnonymousClass14n anonymousClass14n = (AnonymousClass14n) tag;
                AnonymousClass14v.D(r0.f61210R, anonymousClass14n, anonymousClass14t, C, F, anonymousClass14t.P(), anonymousClass14t.L(C), r0.f61201I, r0.f61208P, false, r0.f61209Q);
                anonymousClass14n.f13983J.hp(anonymousClass14n, anonymousClass14t, C);
                return;
            case 3:
                AnonymousClass14w.B(r0.f61210R, (AnonymousClass14p) tag, anonymousClass14t, C, F, anonymousClass14t.P(), anonymousClass14t.L(C), AnonymousClass0LQ.B(anonymousClass14t.H().pT(), r0.f61210R.B()), r0.f61196D, r0.f61208P, r0.f61205M);
                return;
            case 4:
                AnonymousClass14o anonymousClass14o = (AnonymousClass14o) tag;
                int P = anonymousClass14t.P();
                int L = anonymousClass14t.L(C);
                AnonymousClass0QY anonymousClass0QY = r0.f61197E;
                AnonymousClass14x.C(anonymousClass14o, anonymousClass14t, C, F, P, L, anonymousClass0QY);
                anonymousClass0QY.le(anonymousClass14o, anonymousClass14t, C);
                return;
            default:
                return;
        }
    }

    /* renamed from: C */
    public final AnonymousClass0Pj m25973C(AnonymousClass14t anonymousClass14t) {
        int i = anonymousClass14t.f14107L + 1;
        if (i < anonymousClass14t.P()) {
            return anonymousClass14t.F(i);
        }
        i = m25978H(anonymousClass14t) + 1;
        return i < getCount() ? m25974D(i).C() : null;
    }

    /* renamed from: D */
    public final AnonymousClass14t m25974D(int i) {
        if (i < this.f61195C.size()) {
            if (i >= 0) {
                return (AnonymousClass14t) this.f61195C.get(i);
            }
        }
        return null;
    }

    /* renamed from: E */
    public final AnonymousClass14t m25975E(String str) {
        return (AnonymousClass14t) this.f61194B.get(str);
    }

    /* renamed from: F */
    public final AnonymousClass14s m25976F(AnonymousClass0Pj anonymousClass0Pj) {
        AnonymousClass14s anonymousClass14s = (AnonymousClass14s) this.f61207O.get(anonymousClass0Pj);
        if (anonymousClass14s != null) {
            return anonymousClass14s;
        }
        anonymousClass14s = new AnonymousClass14s();
        this.f61207O.put(anonymousClass0Pj, anonymousClass14s);
        return anonymousClass14s;
    }

    /* renamed from: G */
    public final int m25977G(AnonymousClass0MI anonymousClass0MI) {
        for (int i = 0; i < this.f61195C.size(); i++) {
            if (((AnonymousClass14t) this.f61195C.get(i)).f14103H.getId().equals(anonymousClass0MI.getId())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: H */
    public final int m25978H(AnonymousClass14t anonymousClass14t) {
        return this.f61195C.indexOf(anonymousClass14t);
    }

    /* renamed from: I */
    public final void m25979I(List list) {
        this.f61195C.clear();
        this.f61194B.clear();
        this.f61207O.clear();
        for (int i = 0; i < list.size(); i++) {
            m25971A(this.f61195C.size(), (AnonymousClass14t) list.get(i));
        }
        AnonymousClass0rF.B(this, -1473156175);
    }

    /* renamed from: J */
    public final void m25980J(AnonymousClass14t anonymousClass14t, AnonymousClass0MI anonymousClass0MI) {
        AnonymousClass14t anonymousClass14t2 = new AnonymousClass14t(anonymousClass0MI, anonymousClass14t.f14105J);
        int indexOf = this.f61195C.indexOf(anonymousClass14t);
        this.f61194B.remove(anonymousClass14t.E());
        this.f61195C.remove(anonymousClass14t);
        m25971A(indexOf, anonymousClass14t2);
    }

    /* renamed from: K */
    public final void m25981K(String str, String str2) {
        AnonymousClass14t E = m25975E(str);
        AnonymousClass0MI D = AnonymousClass0MB.C(this.f61210R).D(str2);
        if (E != null) {
            if (D != null) {
                m25980J(E, D);
            }
        }
    }

    /* renamed from: L */
    public final void m25982L(List list, int i) {
        if (!list.isEmpty()) {
            Object obj = null;
            for (AnonymousClass0MI anonymousClass0MI : list) {
                boolean z;
                AnonymousClass0P7 anonymousClass0P7;
                AnonymousClass28S anonymousClass28S;
                int i2 = ((int) anonymousClass0MI.f3387T) + i;
                AnonymousClass14t anonymousClass14t = new AnonymousClass14t(anonymousClass0MI, i2, true);
                Object obj2 = (i2 < this.f61199G || i2 > this.f61202J) ? null : 1;
                Object obj3 = (i2 <= 0 || i2 > this.f61195C.size()) ? null : 1;
                if (obj2 != null) {
                    this.f61201I.Cd(anonymousClass14t, "ad_position_is_passed");
                } else if (obj3 == null) {
                    this.f61201I.Cd(anonymousClass14t, "ad_position_out_of_bound");
                } else if (this.f61194B.containsKey(anonymousClass0MI.getId())) {
                    this.f61201I.Cd(anonymousClass14t, "duplicate_ad_received");
                } else if (i2 >= this.f61195C.size() || !((AnonymousClass14t) this.f61195C.get(i2)).E().equals(anonymousClass0MI.getId())) {
                    z = true;
                    for (AnonymousClass0Pj anonymousClass0Pj : anonymousClass0MI.F()) {
                        anonymousClass0P7 = anonymousClass0Pj.f4134F;
                        if (0.5725f >= anonymousClass0P7.L()) {
                            if (anonymousClass0P7.L() > 1.93f) {
                                if (anonymousClass0P7.L() < 0.79f) {
                                    anonymousClass28S = anonymousClass0P7.PC;
                                    obj3 = (anonymousClass28S != null || anonymousClass28S.f26522C == null || anonymousClass0P7.PC.f26522C.f26523B == null || anonymousClass0P7.PC.f26521B == null || anonymousClass0P7.PC.f26521B.f26523B == null) ? null : 1;
                                    if (obj3 == null || (anonymousClass0P7.SA() && anonymousClass0P7.f4028c.f4883C == null)) {
                                        this.f61201I.Cd(anonymousClass14t, "missing_rendering_color");
                                        z = false;
                                        break;
                                    }
                                }
                            }
                            this.f61201I.Cd(anonymousClass14t, "invalid_media_aspect_ratio");
                            z = false;
                            break;
                        }
                    }
                    if (AnonymousClass0SS.B().f4920B.getBoolean(anonymousClass0MI.getId(), false)) {
                        this.f61201I.Cd(anonymousClass14t, "INSTAGRAM_MEDIA_WAS_HIDDEN");
                        z = false;
                    }
                    this.f61201I.Dd(anonymousClass14t, z);
                    if (z) {
                        m25971A(i2, anonymousClass14t);
                        DLog.d(DLogTag.REEL, AnonymousClass0IE.E("inserted ad at position %d", new Object[]{Integer.valueOf(i2)}), new Object[0]);
                        obj = 1;
                    }
                } else {
                    this.f61201I.Cd(anonymousClass14t, "position_contains_ad");
                }
                z = false;
                while (r9.hasNext()) {
                    anonymousClass0P7 = anonymousClass0Pj.f4134F;
                    if (0.5725f >= anonymousClass0P7.L()) {
                        if (anonymousClass0P7.L() > 1.93f) {
                            if (anonymousClass0P7.L() < 0.79f) {
                                anonymousClass28S = anonymousClass0P7.PC;
                                if (anonymousClass28S != null) {
                                }
                                this.f61201I.Cd(anonymousClass14t, "missing_rendering_color");
                                z = false;
                                break;
                            }
                        }
                        this.f61201I.Cd(anonymousClass14t, "invalid_media_aspect_ratio");
                        z = false;
                        break;
                    }
                }
                if (AnonymousClass0SS.B().f4920B.getBoolean(anonymousClass0MI.getId(), false)) {
                    this.f61201I.Cd(anonymousClass14t, "INSTAGRAM_MEDIA_WAS_HIDDEN");
                    z = false;
                }
                this.f61201I.Dd(anonymousClass14t, z);
                if (z) {
                    m25971A(i2, anonymousClass14t);
                    DLog.d(DLogTag.REEL, AnonymousClass0IE.E("inserted ad at position %d", new Object[]{Integer.valueOf(i2)}), new Object[0]);
                    obj = 1;
                }
            }
            if (obj != null) {
                AnonymousClass0rF.B(this, -1458432821);
            }
        }
    }

    /* renamed from: M */
    public final void m25983M(int i) {
        if (i > this.f61202J) {
            this.f61202J = i;
        }
        if (i < this.f61199G) {
            this.f61199G = i;
        }
        Integer.valueOf(this.f61199G);
        Integer.valueOf(this.f61202J);
    }

    public final int getCount() {
        return this.f61195C.size();
    }

    public final Object getItem(int i) {
        return this.f61195C.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((AnonymousClass14t) this.f61195C.get(i)).E().hashCode();
    }

    public final int getItemViewType(int i) {
        i = ((AnonymousClass14t) this.f61195C.get(i)).f14103H;
        if (i.Q()) {
            return 0;
        }
        if (i.R()) {
            return 2;
        }
        if (i.eY()) {
            return 3;
        }
        return i.S() ? 4 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            ViewGroup viewGroup2 = viewGroup;
            switch (getItemViewType(i)) {
                case 0:
                    view = AnonymousClass14u.F(this.f61198F, viewGroup, this.f61203K, this.f61200H, this.f61206N);
                    break;
                case 1:
                    view = AnonymousClass14Y.J(this.f61198F, viewGroup, this.f61200H, this.f61206N, this.f61210R);
                    break;
                case 2:
                    view = AnonymousClass14v.E(this.f61198F, viewGroup2, this.f61204L, this.f61200H, this.f61206N, this.f61210R);
                    break;
                case 3:
                    view = AnonymousClass14w.E(this.f61198F, viewGroup, this.f61200H, this.f61206N, this.f61210R);
                    break;
                case 4:
                    view = AnonymousClass14x.D(this.f61198F, viewGroup);
                    break;
                default:
                    break;
            }
        }
        m25972B(view, i);
        return view;
    }
}
