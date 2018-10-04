package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import com.facebook.C0164R;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.reels.fragment.ReelViewerFragment;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6GI */
public final class AnonymousClass6GI implements AnonymousClass67h {
    /* renamed from: B */
    public String f73669B;
    /* renamed from: C */
    public String f73670C;
    /* renamed from: D */
    public final AnonymousClass0Ci f73671D;
    /* renamed from: E */
    public boolean f73672E;
    /* renamed from: F */
    public final AnonymousClass12b f73673F = new AnonymousClass67p(this);
    /* renamed from: G */
    public HorizontalRecyclerPager f73674G;
    /* renamed from: H */
    public final AnonymousClass67v f73675H;
    /* renamed from: I */
    public final AnonymousClass6GB f73676I;
    /* renamed from: J */
    public final AnonymousClass0IJ f73677J;
    /* renamed from: K */
    public AnonymousClass0F8 f73678K;
    /* renamed from: L */
    public AnonymousClass0rv f73679L;
    /* renamed from: M */
    public final AnonymousClass5OY f73680M;
    /* renamed from: N */
    public final AnonymousClass6GO f73681N;
    /* renamed from: O */
    public final ReelViewerFragment f73682O;
    /* renamed from: P */
    public final AnonymousClass6GG f73683P;
    /* renamed from: Q */
    public final ReelViewerFragment f73684Q;
    /* renamed from: R */
    public final ViewGroup f73685R;
    /* renamed from: S */
    public boolean f73686S;
    /* renamed from: T */
    public List f73687T;
    /* renamed from: U */
    public final AnonymousClass0Ci f73688U;
    /* renamed from: V */
    public final AnonymousClass0Cm f73689V;
    /* renamed from: W */
    public Animation f73690W;
    /* renamed from: X */
    public List f73691X;
    /* renamed from: Y */
    public View f73692Y;
    /* renamed from: Z */
    private final AnonymousClass5b0 f73693Z = new AnonymousClass67o(this);
    /* renamed from: a */
    private final AnonymousClass6GC f73694a = new AnonymousClass6HV(this);
    /* renamed from: b */
    private final Handler f73695b;
    /* renamed from: c */
    private final AnonymousClass6GD f73696c = new AnonymousClass6HU(this);
    /* renamed from: d */
    private final AnonymousClass67l f73697d = new AnonymousClass6HW(this);

    public AnonymousClass6GI(ViewGroup viewGroup, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, ReelViewerFragment reelViewerFragment, ReelViewerFragment reelViewerFragment2, AnonymousClass6GO anonymousClass6GO, AnonymousClass0QL anonymousClass0QL, AnonymousClass67i anonymousClass67i, AnonymousClass1RG anonymousClass1RG) {
        boolean z = false;
        AnonymousClass0IL anonymousClass0IL = anonymousClass0IJ;
        this.f73677J = anonymousClass0IL;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f73689V = anonymousClass0Cm2;
        this.f73688U = this.f73689V.B();
        AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
        this.f73671D = anonymousClass0Ci2;
        View view = viewGroup;
        this.f73685R = view;
        this.f73681N = anonymousClass6GO;
        this.f73684Q = reelViewerFragment2;
        this.f73682O = reelViewerFragment;
        this.f73695b = new Handler(Looper.getMainLooper());
        AnonymousClass1RG anonymousClass1RG2 = anonymousClass1RG;
        AnonymousClass0QL anonymousClass0QL2 = anonymousClass0QL;
        this.f73676I = new AnonymousClass6GB(anonymousClass0Ci2, view, anonymousClass0IL, anonymousClass0Cm2, new AnonymousClass5au(anonymousClass0IL.getActivity(), anonymousClass0Cm2), anonymousClass0QL2, anonymousClass67i, this, anonymousClass1RG2);
        if (((Boolean) AnonymousClass0CC.f1480p.H(this.f73689V)).booleanValue()) {
            z = true;
        }
        r9.f73683P = AnonymousClass6GG.m29733B(view, anonymousClass0IL, anonymousClass0Cm2, anonymousClass0Ci2, r9.f73676I, anonymousClass0QL2, anonymousClass1RG2, new AnonymousClass5PU(true, false, false, true, true, false, false, z), C0164R.layout.iglive_viewer_buttons_container);
        r9.f73680M = new AnonymousClass5OY(r9.f73677J.getContext(), r9.f73677J.getLoaderManager(), r9.f73689V, r9, anonymousClass0QL2);
        r9.f73675H = new AnonymousClass67v(r9.f73689V, r9.f73677J);
        r9.f73683P.f73655I.f66797B = r9.f73693Z;
        r9.f73683P.f73653G.f73536B = r9.f73696c;
        r9.f73683P.f73650D = r9.f73694a;
        r9.f73683P.f73654H = r9.f73697d;
    }

    /* renamed from: A */
    public final void m29764A() {
        if (this.f73686S) {
            this.f73686S = false;
            AnonymousClass5OY anonymousClass5OY = this.f73680M;
            if (anonymousClass5OY.f62976L) {
                anonymousClass5OY.f62976L = false;
                anonymousClass5OY.f62968D.removeCallbacksAndMessages(null);
                anonymousClass5OY.f62968D = null;
            }
            this.f73695b.removeCallbacksAndMessages(null);
            if (this.f73687T != null) {
                RealtimeClientManager.getInstance(this.f73689V).graphqlUnsubscribeCommand(this.f73687T);
                this.f73687T = null;
            }
            if (this.f73678K != null) {
                AnonymousClass0F4.f2058E.D(AnonymousClass1EG.class, this.f73678K);
            }
            this.f73683P.m29754T();
        }
    }

    public final void Ah(boolean z) {
        this.f73683P.m29749O(z);
        if (z && this.f73674G.getVisibility() == 0) {
            AnonymousClass6GI.m29761D(this);
        } else if (!z && !this.f73672E && this.f73674G.getVisibility() == 8) {
            AnonymousClass6GI.m29763F(this);
        }
    }

    /* renamed from: B */
    public static void m29759B(AnonymousClass6GI anonymousClass6GI, AnonymousClass14H anonymousClass14H) {
        if (anonymousClass6GI.f73691X == null) {
            anonymousClass6GI.f73691X = new ArrayList();
        }
        anonymousClass6GI.f73691X.add(anonymousClass14H);
    }

    /* renamed from: C */
    public static View m29760C(AnonymousClass6GI anonymousClass6GI) {
        if (anonymousClass6GI.f73692Y == null) {
            ViewStub viewStub = (ViewStub) anonymousClass6GI.f73685R.findViewById(C0164R.id.wave_reaction_overlay_stub);
            if (viewStub == null) {
                anonymousClass6GI.f73692Y = anonymousClass6GI.f73685R.findViewById(C0164R.id.wave_reaction_overlay);
            } else {
                anonymousClass6GI.f73692Y = viewStub.inflate();
            }
        }
        return anonymousClass6GI.f73692Y;
    }

    /* renamed from: D */
    public static void m29761D(AnonymousClass6GI anonymousClass6GI) {
        anonymousClass6GI.f73683P.m29755U(anonymousClass6GI.f73674G.getHeight());
        anonymousClass6GI.f73674G.setVisibility(8);
    }

    /* renamed from: E */
    public static void m29762E(AnonymousClass6GI anonymousClass6GI, String str) {
        anonymousClass6GI.f73684Q.e(anonymousClass6GI.f73683P.m29737C(str));
    }

    /* renamed from: F */
    public static void m29763F(AnonymousClass6GI anonymousClass6GI) {
        anonymousClass6GI.f73683P.m29755U(-anonymousClass6GI.f73674G.getHeight());
        anonymousClass6GI.f73674G.setVisibility(0);
    }
}
