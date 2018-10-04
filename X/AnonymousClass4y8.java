package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;

/* renamed from: X.4y8 */
public final class AnonymousClass4y8 extends AnonymousClass0TA {
    /* renamed from: B */
    public final AnonymousClass5Yv f58938B;
    /* renamed from: C */
    private final Context f58939C;
    /* renamed from: D */
    private final AnonymousClass0gk f58940D = new AnonymousClass4y7(this);
    /* renamed from: E */
    private final AnonymousClass1TP f58941E = new AnonymousClass4y6(this);
    /* renamed from: F */
    private final AnonymousClass0EE f58942F;
    /* renamed from: G */
    private final AnonymousClass5bn f58943G = new AnonymousClass5cj(this);
    /* renamed from: H */
    private final AnonymousClass0jC f58944H;
    /* renamed from: I */
    private final AnonymousClass0Cm f58945I;
    /* renamed from: J */
    private final AnonymousClass5Yy f58946J;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4y8(Context context, AnonymousClass0jC anonymousClass0jC, AnonymousClass0EE anonymousClass0EE, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5Yy anonymousClass5Yy, AnonymousClass5Yv anonymousClass5Yv) {
        this.f58939C = context;
        this.f58944H = anonymousClass0jC;
        this.f58942F = anonymousClass0EE;
        this.f58945I = anonymousClass0Cm;
        this.f58946J = anonymousClass5Yy;
        this.f58938B = anonymousClass5Yv;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        View view2 = view;
        Object obj3 = obj2;
        Object obj4 = obj;
        int I = AnonymousClass0cQ.I(this, 334316289);
        AnonymousClass3T0 anonymousClass3T0 = (AnonymousClass3T0) obj4;
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) obj3;
        if (view == null) {
            AnonymousClass4no anonymousClass4no;
            Context context = r12.f58939C;
            view2 = (LinearLayout) LayoutInflater.from(context).inflate(C0164R.layout.location_page_single_section_rounded_corner_linear_layout, viewGroup, false);
            RoundedCornerLinearLayout roundedCornerLinearLayout = (RoundedCornerLinearLayout) view2.findViewById(C0164R.id.container);
            AnonymousClass4xs anonymousClass4xs = null;
            if (anonymousClass3T0.f41449C != null) {
                View C = AnonymousClass4np.m25104C(context, AnonymousClass1ex.f21064C.f21066B);
                roundedCornerLinearLayout.addView(C);
                anonymousClass4no = (AnonymousClass4no) C.getTag();
            } else {
                anonymousClass4no = null;
            }
            if (anonymousClass3T0.f41448B != null) {
                View inflate = LayoutInflater.from(context).inflate(C0164R.layout.location_page_business_row, roundedCornerLinearLayout, false);
                inflate.setTag(new AnonymousClass4xs((CircularImageView) inflate.findViewById(C0164R.id.profile_imageview), (TextView) inflate.findViewById(C0164R.id.username), (TitleTextView) inflate.findViewById(C0164R.id.view_profile)));
                roundedCornerLinearLayout.addView(inflate);
                anonymousClass4xs = (AnonymousClass4xs) inflate.getTag();
            }
            view2.setTag(new AnonymousClass4y5(roundedCornerLinearLayout, anonymousClass4no, anonymousClass4xs));
        }
        Context context2 = r12.f58939C;
        AnonymousClass4y5 anonymousClass4y5 = (AnonymousClass4y5) view2.getTag();
        if (anonymousClass1Xu == null) {
            i2 = 0;
        } else {
            i2 = anonymousClass1Xu.f19896D;
        }
        AnonymousClass5bn anonymousClass5bn = r12.f58943G;
        AnonymousClass1TP anonymousClass1TP = r12.f58941E;
        AnonymousClass0jC anonymousClass0jC = r12.f58944H;
        AnonymousClass0gk anonymousClass0gk = r12.f58940D;
        AnonymousClass0EE anonymousClass0EE = r12.f58942F;
        AnonymousClass0Cm anonymousClass0Cm = r12.f58945I;
        AnonymousClass5Yy anonymousClass5Yy = r12.f58946J;
        if (!(anonymousClass3T0.f41449C == null || anonymousClass4y5.f58937C == null)) {
            AnonymousClass0gk anonymousClass0gk2 = anonymousClass0gk;
            AnonymousClass0jC anonymousClass0jC2 = anonymousClass0jC;
            i = anonymousClass1TP;
            AnonymousClass5bn anonymousClass5bn2 = anonymousClass5bn;
            int i3 = i2;
            AnonymousClass4np.m25103B(anonymousClass4y5.f58937C, anonymousClass3T0.f41449C, true, i3, anonymousClass5bn2, i, anonymousClass0jC2, anonymousClass0gk2, anonymousClass0EE, anonymousClass0Cm);
        }
        if (!(anonymousClass3T0.f41448B == null || anonymousClass4y5.f58936B == null)) {
            AnonymousClass4xs anonymousClass4xs2 = anonymousClass4y5.f58936B;
            AnonymousClass0Ci anonymousClass0Ci = anonymousClass3T0.f41448B;
            if (anonymousClass4xs2.f58902B != null) {
                anonymousClass4xs2.f58902B.setUrl(anonymousClass0Ci.DQ());
            }
            if (anonymousClass4xs2.f58903C != null) {
                anonymousClass4xs2.f58903C.setText(anonymousClass0Ci.T());
            }
            if (anonymousClass4xs2.f58904D != null) {
                anonymousClass4xs2.f58904D.setText(context2.getResources().getString(C0164R.string.view_profile));
            }
            anonymousClass4y5.f58936B.f58904D.setOnClickListener(new AnonymousClass4y2(anonymousClass5Yy));
            anonymousClass4y5.f58936B.f58902B.setOnClickListener(new AnonymousClass4y3(anonymousClass5Yy));
            anonymousClass4y5.f58936B.f58903C.setOnClickListener(new AnonymousClass4y4(anonymousClass5Yy));
        }
        AnonymousClass0cQ.H(r12, -1259500212, I);
        return view2;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass3T0 anonymousClass3T0 = (AnonymousClass3T0) obj;
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) obj2;
        anonymousClass0p9.A(0);
    }
}
