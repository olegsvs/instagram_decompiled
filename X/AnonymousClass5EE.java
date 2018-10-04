package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.5EE */
public final class AnonymousClass5EE extends AnonymousClass0TA {
    /* renamed from: B */
    private final boolean f61417B;
    /* renamed from: C */
    private final Context f61418C;
    /* renamed from: D */
    private final AnonymousClass3eM f61419D;
    /* renamed from: E */
    private final String f61420E;
    /* renamed from: F */
    private final boolean f61421F;
    /* renamed from: G */
    private final boolean f61422G;
    /* renamed from: H */
    private final boolean f61423H;
    /* renamed from: I */
    private final AnonymousClass0Cm f61424I;
    /* renamed from: J */
    private final AnonymousClass3eO f61425J;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5EE(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3eM anonymousClass3eM, boolean z, String str, boolean z2, AnonymousClass3eO anonymousClass3eO) {
        this.f61418C = context;
        this.f61424I = anonymousClass0Cm;
        this.f61419D = anonymousClass3eM;
        this.f61422G = z;
        this.f61421F = AnonymousClass0e8.D(context);
        this.f61420E = str;
        this.f61423H = z2;
        this.f61425J = anonymousClass3eO;
        this.f61417B = ((Boolean) AnonymousClass0CC.Th.H(anonymousClass0Cm)).booleanValue();
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        Object obj3 = obj2;
        Object obj4 = obj;
        View view2 = view;
        int I = AnonymousClass0cQ.I(this, 340755203);
        if (view == null) {
            Context context = r14.f61418C;
            boolean z = r14.f61421F;
            view2 = (ViewGroup) LayoutInflater.from(context).inflate(C0164R.layout.row_search_user, viewGroup, false);
            AnonymousClass3eN anonymousClass3eN = new AnonymousClass3eN();
            anonymousClass3eN.f43010L = view2;
            anonymousClass3eN.f43008J = (ViewGroup) view2.findViewById(C0164R.id.row_search_user_container);
            ((ViewStub) view2.findViewById(C0164R.id.row_search_avatar_with_ring_stub)).inflate();
            anonymousClass3eN.f43007I = (CircularImageView) view2.findViewById(C0164R.id.row_search_avatar_in_ring);
            anonymousClass3eN.f43003E = (GradientSpinner) view2.findViewById(C0164R.id.reel_seen_state);
            anonymousClass3eN.f43000B = (FrameLayout) view2.findViewById(C0164R.id.row_search_avatar_with_ring);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(AnonymousClass0G5.F(context, C0164R.attr.searchReelMarginEnd));
            FrameLayout frameLayout = anonymousClass3eN.f43000B;
            int i3 = z ? dimensionPixelSize : 0;
            if (z) {
                dimensionPixelSize = 0;
            }
            frameLayout.setPadding(i3, 0, dimensionPixelSize, 0);
            anonymousClass3eN.f43006H = view2.findViewById(C0164R.id.unseen_dot_start_aligned);
            anonymousClass3eN.f43005G = view2.findViewById(C0164R.id.unseen_dot_end_aligned);
            anonymousClass3eN.f43002D = (FollowButton) view2.findViewById(C0164R.id.row_search_user_follow_button);
            anonymousClass3eN.f43004F = (TextView) view2.findViewById(C0164R.id.row_search_user_fullname);
            TextView textView = (TextView) view2.findViewById(C0164R.id.row_search_user_username);
            anonymousClass3eN.f43009K = textView;
            textView.getPaint().setFakeBoldText(true);
            context.getResources().getDimensionPixelOffset(C0164R.dimen.search_row_padding);
            anonymousClass3eN.f43001C = (ColorFilterAlphaImageView) view2.findViewById(C0164R.id.dismiss_button);
            view2.setTag(anonymousClass3eN);
        }
        Context context2 = r14.f61418C;
        AnonymousClass0Cm anonymousClass0Cm = r14.f61424I;
        AnonymousClass3eN anonymousClass3eN2 = (AnonymousClass3eN) view2.getTag();
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj4;
        int i4 = ((AnonymousClass3du) obj3).f42934B;
        boolean z2 = r14.f61422G;
        String str = r14.f61420E;
        boolean z3 = r14.f61423H;
        AnonymousClass3eM anonymousClass3eM = r14.f61419D;
        AnonymousClass3eO anonymousClass3eO = r14.f61425J;
        boolean z4 = r14.f61417B;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        anonymousClass3eN2.f43007I.setUrl(anonymousClass0Ci.DQ());
        OnClickListener anonymousClass3eH = new AnonymousClass3eH(anonymousClass3eM, anonymousClass0Ci, i4);
        if (z3 && AnonymousClass0Jd.f2931B.T(anonymousClass0Cm, anonymousClass0Ci)) {
            anonymousClass3eN2.f43003E.setVisibility(0);
            anonymousClass3eN2.f43003E.B();
            FrameLayout frameLayout2 = anonymousClass3eN2.f43000B;
            AnonymousClass3eI anonymousClass3eI = r18;
            AnonymousClass3eI anonymousClass3eI2 = new AnonymousClass3eI(anonymousClass3eM, anonymousClass0Ci, anonymousClass0Cm, anonymousClass3eN2, i4);
            frameLayout2.setOnClickListener(anonymousClass3eI);
            anonymousClass3eN2.f43000B.setContentDescription(context2.getResources().getString(C0164R.string.story_ring_single_user_description));
        } else {
            anonymousClass3eN2.f43000B.setOnClickListener(anonymousClass3eH);
            anonymousClass3eN2.f43003E.setVisibility(4);
            anonymousClass3eN2.f43000B.setContentDescription(context2.getResources().getString(C0164R.string.single_user_button_description));
        }
        Object obj5 = 1;
        boolean z5 = anonymousClass0Ci.Y().intValue() > 0 && AnonymousClass0er.B(anonymousClass0Cm).R(anonymousClass0Ci);
        int i5 = 8;
        if (!z5 || z2) {
            i2 = 0;
            anonymousClass3eN2.f43005G.setVisibility(8);
        } else {
            i2 = 0;
            anonymousClass3eN2.f43005G.setVisibility(0);
        }
        if (z2) {
            anonymousClass3eN2.f43002D.setVisibility(i2);
            anonymousClass3eN2.f43002D.setClickPoint(str);
            anonymousClass3eN2.f43002D.A(anonymousClass0Cm2, anonymousClass0Ci, new AnonymousClass3eJ(anonymousClass3eM, anonymousClass0Ci, i4));
            anonymousClass3eN2.f43006H.setVisibility(z5 ? 0 : 8);
        } else {
            anonymousClass3eN2.f43002D.setVisibility(8);
            anonymousClass3eN2.f43006H.setVisibility(8);
        }
        CharSequence B = AnonymousClass3eP.B(context2, anonymousClass0Ci, z5, z2);
        if (TextUtils.isEmpty(B)) {
            anonymousClass3eN2.f43004F.setVisibility(8);
        } else {
            anonymousClass3eN2.f43004F.setText(B);
            anonymousClass3eN2.f43004F.setVisibility(0);
        }
        anonymousClass3eN2.f43009K.setText(anonymousClass0Ci.uT());
        AnonymousClass15G.F(anonymousClass3eN2.f43009K, anonymousClass0Ci.u());
        if (!z4 || anonymousClass3eO == null || !anonymousClass3eO.jY(anonymousClass0Ci)) {
            obj5 = null;
        }
        anonymousClass3eN2.f43008J.setOnClickListener(anonymousClass3eH);
        OnClickListener onClickListener = null;
        anonymousClass3eN2.f43008J.setOnLongClickListener(obj5 != null ? null : new AnonymousClass3eK(anonymousClass3eM, anonymousClass0Ci, i4));
        ColorFilterAlphaImageView colorFilterAlphaImageView = anonymousClass3eN2.f43001C;
        if (obj5 != null) {
            i5 = 0;
        }
        colorFilterAlphaImageView.setVisibility(i5);
        colorFilterAlphaImageView = anonymousClass3eN2.f43001C;
        if (obj5 != null) {
            onClickListener = new AnonymousClass3eL(anonymousClass3eM, anonymousClass0Ci, i4);
        }
        colorFilterAlphaImageView.setOnClickListener(onClickListener);
        anonymousClass3eN2.f43010L.setTag(anonymousClass3eN2);
        AnonymousClass0cQ.H(r14, -39821416, I);
        return view2;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj;
        AnonymousClass3du anonymousClass3du = (AnonymousClass3du) obj2;
        anonymousClass0p9.A(0);
    }
}
