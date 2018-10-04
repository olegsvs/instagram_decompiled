package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5Lr */
public final class AnonymousClass5Lr extends AnonymousClass0nJ {
    /* renamed from: M */
    public static int f62453M = 500;
    /* renamed from: B */
    public int f62454B = 0;
    /* renamed from: C */
    public Set f62455C;
    /* renamed from: D */
    public final List f62456D;
    /* renamed from: E */
    public AnonymousClass5cF f62457E;
    /* renamed from: F */
    public AnonymousClass5ag f62458F;
    /* renamed from: G */
    public AnonymousClass5ae f62459G;
    /* renamed from: H */
    private final AnonymousClass0Ci f62460H;
    /* renamed from: I */
    private final AnonymousClass5Lq f62461I;
    /* renamed from: J */
    private final AnonymousClass67B f62462J;
    /* renamed from: K */
    private final boolean f62463K;
    /* renamed from: L */
    private final AnonymousClass0Cm f62464L;

    public AnonymousClass5Lr(AnonymousClass67B anonymousClass67B, AnonymousClass5Lq anonymousClass5Lq, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, boolean z) {
        this.f62462J = anonymousClass67B;
        this.f62461I = anonymousClass5Lq;
        this.f62455C = new LinkedHashSet();
        this.f62456D = new ArrayList();
        this.f62464L = anonymousClass0Cm;
        this.f62460H = anonymousClass0Ci;
        this.f62463K = z;
    }

    /* renamed from: B */
    public final int m26298B() {
        return this.f62456D.size();
    }

    /* renamed from: B */
    public static int m26297B(AnonymousClass5Lr anonymousClass5Lr, int i) {
        if (anonymousClass5Lr.B() == 0) {
            return 0;
        }
        return (anonymousClass5Lr.B() - i) - 1;
    }

    /* renamed from: I */
    public final void m26299I(AnonymousClass0oo anonymousClass0oo, int i) {
        int itemViewType = getItemViewType(i);
        AnonymousClass5NU anonymousClass5NU = (AnonymousClass5NU) this.f62456D.get(AnonymousClass5Lr.m26297B(this, i));
        if (itemViewType == AnonymousClass5NW.TypingIndicator.m26369B()) {
            AnonymousClass5M2 anonymousClass5M2 = (AnonymousClass5M2) anonymousClass0oo;
            AnonymousClass5ae anonymousClass5ae = (AnonymousClass5ae) anonymousClass5NU;
            anonymousClass5M2.f62493B.setUrl(anonymousClass5ae.pT().DQ());
            int i2 = anonymousClass5ae.f66730C;
            if (i2 == 1) {
                anonymousClass5M2.f62496E.setText(anonymousClass5M2.f62495D.getResources().getString(C0164R.string.typing_indicator_one, new Object[]{r9.uT()}));
            } else {
                anonymousClass5M2.f62496E.setText(anonymousClass5M2.f62495D.getResources().getQuantityString(C0164R.plurals.typing_indicator_many, i2 - 1, new Object[]{r9.uT(), Integer.valueOf(i2 - 1)}));
            }
            if ((anonymousClass5ae.f66729B ^ 1) != 0) {
                anonymousClass5ae.f66729B = true;
                anonymousClass5M2.f62495D.setVisibility(4);
                anonymousClass5M2.f62495D.postDelayed(new AnonymousClass5Ly(anonymousClass5M2), 300);
            }
        } else if (itemViewType == AnonymousClass5NW.Normal.m26369B()) {
            AnonymousClass5Lx.m26311B((AnonymousClass5Lw) anonymousClass0oo, (AnonymousClass5ag) anonymousClass5NU, this.f62462J, false);
        } else if (itemViewType == AnonymousClass5NW.Nux.m26369B()) {
            AnonymousClass5Lw anonymousClass5Lw = (AnonymousClass5Lw) anonymousClass0oo;
            AnonymousClass5ah anonymousClass5ah = (AnonymousClass5ah) anonymousClass5NU;
            AnonymousClass5Lx.m26314E(anonymousClass5Lw, anonymousClass5ah, this.f62462J, anonymousClass5ah.f66733B);
            Context context = anonymousClass5Lw.f62480D.getContext();
            anonymousClass5Lw.f62486J.setVisibility(8);
            anonymousClass5Lw.f62480D.setTextColor(AnonymousClass0Ca.C(context, C0164R.color.white_60_transparent));
            anonymousClass5Lw.f62480D.setTextSize(0, (float) context.getResources().getDimensionPixelSize(C0164R.dimen.font_small));
        } else {
            if (itemViewType != AnonymousClass5NW.SingleUserJoined.m26369B()) {
                if (itemViewType != AnonymousClass5NW.MultipleUsersJoined.m26369B()) {
                    if (itemViewType == AnonymousClass5NW.SendJoinRequest.m26369B() || itemViewType == AnonymousClass5NW.SentJoinRequest.m26369B() || itemViewType == AnonymousClass5NW.ViewJoinRequest.m26369B()) {
                        AnonymousClass5MB.m26318B((AnonymousClass5aY) anonymousClass0oo, (AnonymousClass5af) anonymousClass5NU, this.f62462J);
                        return;
                    }
                    return;
                }
            }
            AnonymousClass5aX anonymousClass5aX = (AnonymousClass5aX) anonymousClass0oo;
            AnonymousClass5ai anonymousClass5ai = (AnonymousClass5ai) anonymousClass5NU;
            AnonymousClass67B anonymousClass67B = this.f62462J;
            AnonymousClass0Ci anonymousClass0Ci = this.f62460H;
            boolean z = this.f62463K;
            AnonymousClass5Lx.m26314E(anonymousClass5aX, anonymousClass5ai, anonymousClass67B, anonymousClass5ai.f4910d);
            anonymousClass5aX.f62487K.setUrl(anonymousClass5ai.pT().DQ());
            AnonymousClass5M9.m26317C(anonymousClass5aX, anonymousClass5ai, z, anonymousClass67B);
            if (!z && anonymousClass5ai.lN() == AnonymousClass5NW.SingleUserJoined) {
                switch (anonymousClass5ai.f66736B) {
                    case 0:
                        ((CircularImageView) anonymousClass5aX.f66633C.A()).setUrl(AnonymousClass2Hj.B("👋"));
                        ((CircularImageView) anonymousClass5aX.f66633C.A()).setVisibility(0);
                        AnonymousClass5M9.m26316B(anonymousClass5aX, anonymousClass5ai, anonymousClass5aX.f62480D.getResources().getString(C0164R.string.live_wave_viewer_success_text, new Object[]{anonymousClass0Ci.uT()}));
                        return;
                    case 1:
                        ((CircularImageView) anonymousClass5aX.f66633C.A()).setUrl(AnonymousClass2Hj.B("👋"));
                        ((CircularImageView) anonymousClass5aX.f66633C.A()).setVisibility(0);
                        AnonymousClass14H B = AnonymousClass5PI.m26430B(anonymousClass5aX.f66633C.A());
                        B.f13848N = new AnonymousClass5M4(anonymousClass5aX, anonymousClass5ai, anonymousClass0Ci);
                        B.N();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: J */
    public final AnonymousClass0oo m26300J(ViewGroup viewGroup, int i) {
        if (i == AnonymousClass5NW.TypingIndicator.m26369B()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.layout_iglive_comment_typing_indicator, viewGroup, false);
            AnonymousClass0oo anonymousClass5M2 = new AnonymousClass5M2(inflate);
            inflate.setTag(anonymousClass5M2);
            return anonymousClass5M2;
        }
        View inflate2;
        AnonymousClass0oo anonymousClass5aY;
        if (i != AnonymousClass5NW.Normal.m26369B()) {
            if (i != AnonymousClass5NW.Nux.m26369B()) {
                if (i != AnonymousClass5NW.SingleUserJoined.m26369B()) {
                    if (i != AnonymousClass5NW.MultipleUsersJoined.m26369B()) {
                        if (!(i == AnonymousClass5NW.SendJoinRequest.m26369B() || i == AnonymousClass5NW.SentJoinRequest.m26369B())) {
                            if (i != AnonymousClass5NW.ViewJoinRequest.m26369B()) {
                                throw new UnsupportedOperationException();
                            }
                        }
                        inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.layout_iglive_comment_row, viewGroup, false);
                        anonymousClass5aY = new AnonymousClass5aY(inflate2);
                        anonymousClass5aY.f62484H = viewGroup.getWidth();
                        inflate2.setTag(anonymousClass5aY);
                        return anonymousClass5aY;
                    }
                }
                inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.layout_iglive_comment_row, viewGroup, false);
                anonymousClass5aY = new AnonymousClass5aX(inflate2);
                anonymousClass5aY.f62484H = viewGroup.getWidth();
                inflate2.setTag(anonymousClass5aY);
                return anonymousClass5aY;
            }
        }
        inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.layout_iglive_comment_row, viewGroup, false);
        anonymousClass5aY = new AnonymousClass5Lw(inflate2);
        anonymousClass5aY.f62484H = viewGroup.getWidth();
        inflate2.setTag(anonymousClass5aY);
        return anonymousClass5aY;
    }

    /* renamed from: P */
    public final void m26301P(AnonymousClass5NU anonymousClass5NU) {
        if (!this.f62455C.contains(anonymousClass5NU) && m26308W(anonymousClass5NU)) {
            if (m26303R(1) == 1) {
                G(B() + 1);
            }
            this.f62455C.add(anonymousClass5NU);
            this.f62456D.add(B() - this.f62454B, anonymousClass5NU);
            this.f10044B.E(this.f62454B, 1);
        }
    }

    /* renamed from: Q */
    public final int m26302Q() {
        AnonymousClass5cF anonymousClass5cF = this.f62457E;
        if (anonymousClass5cF != null) {
            int indexOf = this.f62456D.indexOf(anonymousClass5cF);
            if (indexOf != -1) {
                return AnonymousClass5Lr.m26297B(this, indexOf);
            }
        }
        return -1;
    }

    /* renamed from: R */
    public final int m26303R(int i) {
        int size = f62453M - this.f62455C.size();
        int i2 = 0;
        if (size >= i) {
            return 0;
        }
        int min = Math.min(this.f62455C.size(), i - size);
        Iterator it = this.f62455C.iterator();
        Iterator it2 = this.f62456D.iterator();
        while (i2 < min) {
            it.next();
            it.remove();
            if (it2.hasNext()) {
                it2.next();
                it2.remove();
            }
            i2++;
        }
        return min;
    }

    /* renamed from: S */
    public final void m26304S() {
        for (AnonymousClass5NU anonymousClass5NU : this.f62455C) {
            if (anonymousClass5NU.lN() == AnonymousClass5NW.SingleUserJoined && AnonymousClass0Co.E(this.f62464L, anonymousClass5NU.pT().getId())) {
                ((AnonymousClass5ai) anonymousClass5NU).f66736B = 0;
                int indexOf = this.f62456D.indexOf(anonymousClass5NU);
                if (indexOf != -1) {
                    C(AnonymousClass5Lr.m26297B(this, indexOf));
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: T */
    public final void m26305T(AnonymousClass5NU anonymousClass5NU) {
        int indexOf = this.f62456D.indexOf(anonymousClass5NU);
        if (indexOf != -1) {
            this.f62456D.remove(indexOf);
            this.f62455C.remove(anonymousClass5NU);
            G(AnonymousClass5Lr.m26297B(this, indexOf) + 1);
        }
    }

    /* renamed from: U */
    public final void m26306U(AnonymousClass5NW anonymousClass5NW) {
        Iterator it = this.f62455C.iterator();
        Object obj = null;
        while (it.hasNext()) {
            if (((AnonymousClass5NU) it.next()).lN() == anonymousClass5NW) {
                it.remove();
                obj = 1;
            }
        }
        if (obj != null) {
            m26309X();
        }
    }

    /* renamed from: V */
    public final void m26307V() {
        AnonymousClass5NU anonymousClass5NU = this.f62457E;
        if (anonymousClass5NU != null) {
            m26305T(anonymousClass5NU);
        }
        this.f62457E = null;
    }

    /* renamed from: W */
    public final boolean m26308W(AnonymousClass5NU anonymousClass5NU) {
        if (anonymousClass5NU.lN() != AnonymousClass5NW.Normal) {
            return true;
        }
        AnonymousClass5ag anonymousClass5ag = (AnonymousClass5ag) anonymousClass5NU;
        if (!AnonymousClass0LQ.B(anonymousClass5ag, this.f62458F)) {
            Object obj;
            AnonymousClass5Lq anonymousClass5Lq = this.f62461I;
            if (!anonymousClass5ag.pT().f1722Q && anonymousClass5Lq.f62451B.aTA(anonymousClass5ag)) {
                AnonymousClass2FS B = AnonymousClass2FS.B(anonymousClass5Lq.f62452C);
                if (!B.f28044B.getBoolean(anonymousClass5ag.XP(), false)) {
                    obj = null;
                    if (obj == null) {
                        return true;
                    }
                }
            }
            obj = 1;
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: X */
    public final void m26309X() {
        this.f62456D.clear();
        for (AnonymousClass5NU anonymousClass5NU : this.f62455C) {
            if (m26308W(anonymousClass5NU) && anonymousClass5NU != this.f62459G) {
                this.f62456D.add(anonymousClass5NU);
            }
        }
        AnonymousClass5ae anonymousClass5ae = this.f62459G;
        if (anonymousClass5ae != null) {
            this.f62456D.add(anonymousClass5ae);
        }
        notifyDataSetChanged();
    }

    public final int getItemViewType(int i) {
        return ((AnonymousClass5NU) this.f62456D.get(AnonymousClass5Lr.m26297B(this, i))).lN().m26369B();
    }
}
