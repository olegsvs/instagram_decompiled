package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4My */
public final class AnonymousClass4My {
    /* renamed from: B */
    public View f53290B;
    /* renamed from: C */
    public LinearLayout f53291C;
    /* renamed from: D */
    public final boolean f53292D;
    /* renamed from: E */
    public final float f53293E;
    /* renamed from: F */
    public int f53294F;
    /* renamed from: G */
    public List f53295G = new ArrayList();
    /* renamed from: H */
    public boolean f53296H;
    /* renamed from: I */
    public long f53297I;
    /* renamed from: J */
    public String f53298J;
    /* renamed from: K */
    public final View f53299K;
    /* renamed from: L */
    public TextView f53300L;
    /* renamed from: M */
    public final AnonymousClass0Cm f53301M;
    /* renamed from: N */
    private final List f53302N = new ArrayList();
    /* renamed from: O */
    private final List f53303O = new ArrayList();
    /* renamed from: P */
    private final AnonymousClass4UE f53304P;
    /* renamed from: Q */
    private final AnonymousClass0dF f53305Q;
    /* renamed from: R */
    private final AnonymousClass0IJ f53306R;

    public AnonymousClass4My(AnonymousClass4UE anonymousClass4UE, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0IJ anonymousClass0IJ, View view, AnonymousClass0dF anonymousClass0dF, float f) {
        this.f53304P = anonymousClass4UE;
        this.f53301M = anonymousClass0Cm;
        this.f53306R = anonymousClass0IJ;
        this.f53299K = view;
        this.f53305Q = anonymousClass0dF;
        this.f53293E = f;
        this.f53292D = AnonymousClass0HV.D(this.f53301M).L();
        String str = (String) AnonymousClass0E6.D(AnonymousClass0CC.aQ, this.f53301M);
        if (!"control".equals(str) && !"disabled".equals(str)) {
            this.f53290B = ((ViewStub) this.f53299K.findViewById(C0164R.id.iglive_presence_background_overlay_stub)).inflate();
        }
    }

    /* renamed from: A */
    public final void m24032A() {
        if (this.f53297I != 0) {
            String str = (String) AnonymousClass0CC.aQ.H(this.f53301M);
            if (!"disabled".equals(str)) {
                if (!"control".equals(str)) {
                    this.f53304P.m24342E().f39516p = true;
                }
                this.f53304P.m24342E().f39515o = this.f53295G;
                this.f53304P.m24342E().f39514n = this.f53294F;
            }
        }
    }

    /* renamed from: B */
    public final void m24033B() {
        if (!this.f53296H) {
            if (!"disabled".equals(AnonymousClass0E6.D(AnonymousClass0CC.aQ, this.f53301M))) {
                if (this.f53297I > System.currentTimeMillis() - 300000) {
                    AnonymousClass4My.m24031B(this);
                    return;
                }
                this.f53296H = true;
                AnonymousClass0JQ.f2915B.E(this.f53301M, this.f53299K.getContext(), this.f53306R.getLoaderManager(), new AnonymousClass4Mx(this));
            }
        }
    }

    /* renamed from: B */
    public static void m24031B(AnonymousClass4My anonymousClass4My) {
        Object obj = ("control".equals(AnonymousClass0E6.D(AnonymousClass0CC.aQ, anonymousClass4My.f53301M)) || (!anonymousClass4My.f53292D && anonymousClass4My.f53294F <= 0)) ? null : 1;
        if (obj != null) {
            if (anonymousClass4My.f53291C == null) {
                LinearLayout linearLayout = (LinearLayout) ((ViewStub) anonymousClass4My.f53299K.findViewById(C0164R.id.presence_overlay_stub)).inflate();
                anonymousClass4My.f53291C = linearLayout;
                anonymousClass4My.f53300L = (TextView) linearLayout.findViewById(C0164R.id.quick_capture_presence_text);
                int J = ((int) (((float) AnonymousClass0Nm.J(anonymousClass4My.f53299K.getContext())) * (1.0f - anonymousClass4My.f53293E))) / 2;
                ((MarginLayoutParams) anonymousClass4My.f53291C.getLayoutParams()).setMargins(J, 0, J, 0);
            }
            anonymousClass4My.f53300L.setText(anonymousClass4My.f53298J);
            List<String> list = anonymousClass4My.f53295G;
            List arrayList = new ArrayList();
            AnonymousClass0Ch anonymousClass0Ch = AnonymousClass0Cg.f1704B;
            for (String str : list) {
                AnonymousClass0Ci B = anonymousClass0Ch.B(str);
                if (B == null) {
                    AnonymousClass1EF.f15875C.A(str, null, anonymousClass4My.f53301M);
                } else {
                    arrayList.add(B.DQ());
                }
            }
            for (FrameLayout visibility : anonymousClass4My.f53303O) {
                visibility.setVisibility(8);
            }
            LayoutInflater layoutInflater = (LayoutInflater) anonymousClass4My.f53306R.getContext().getSystemService("layout_inflater");
            for (int i = 0; i < arrayList.size(); i++) {
                if (anonymousClass4My.f53303O.size() <= i) {
                    FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C0164R.layout.quick_capture_social_presence_avatar, anonymousClass4My.f53291C, false);
                    anonymousClass4My.f53291C.addView(frameLayout);
                    anonymousClass4My.f53303O.add(frameLayout);
                    anonymousClass4My.f53302N.add((CircularImageView) frameLayout.findViewById(C0164R.id.quick_capture_presence_image));
                    if (((String) AnonymousClass0E6.D(AnonymousClass0CC.aQ, anonymousClass4My.f53301M)).equals("10min_green_dot")) {
                        frameLayout.findViewById(C0164R.id.quick_capture_presence_dot).setVisibility(0);
                    }
                }
                ((FrameLayout) anonymousClass4My.f53303O.get(i)).setVisibility(0);
                ((CircularImageView) anonymousClass4My.f53302N.get(i)).setUrl((String) arrayList.get(i));
            }
            if (anonymousClass4My.f53305Q.A() == AnonymousClass3DU.LIVE) {
                anonymousClass4My.f53291C.setVisibility(0);
                anonymousClass4My.f53290B.setVisibility(0);
            } else {
                anonymousClass4My.f53291C.setVisibility(8);
                anonymousClass4My.f53290B.setVisibility(8);
            }
        }
        if (anonymousClass4My.f53305Q.A() == AnonymousClass3DU.LIVE) {
            anonymousClass4My.m24032A();
        }
    }
}
