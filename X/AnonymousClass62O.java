package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.UpdatableButton;

/* renamed from: X.62O */
public final class AnonymousClass62O extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f71153B;
    /* renamed from: C */
    private final AnonymousClass6Ha f71154C;
    /* renamed from: D */
    private boolean f71155D;
    /* renamed from: E */
    private final String f71156E;
    /* renamed from: F */
    private final AnonymousClass0Cm f71157F;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass62O(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass6Ha anonymousClass6Ha, String str) {
        this.f71153B = context;
        this.f71157F = anonymousClass0Cm;
        this.f71154C = anonymousClass6Ha;
        this.f71156E = str;
        this.f71155D = AnonymousClass0e8.D(context);
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        AnonymousClass62T anonymousClass62T;
        View view2 = view;
        Object obj3 = obj;
        AnonymousClass62O anonymousClass62O = this;
        int I = AnonymousClass0cQ.I(this, -1152835055);
        AnonymousClass62B anonymousClass62B = (AnonymousClass62B) AnonymousClass0LH.E((AnonymousClass62B) obj3);
        if (view == null) {
            boolean z = this.f71155D;
            ViewGroup viewGroup2 = viewGroup;
            Context context = viewGroup2.getContext();
            view2 = (ViewGroup) LayoutInflater.from(context).inflate(C0164R.layout.product_sold_by_row, viewGroup2, false);
            anonymousClass62T = new AnonymousClass62T();
            anonymousClass62T.f71173H = (CircularImageView) view2.findViewById(C0164R.id.row_sold_by_avatar_in_ring);
            anonymousClass62T.f71167B = (FrameLayout) view2.findViewById(C0164R.id.row_sold_by_avatar_with_ring);
            anonymousClass62T.f71172G = view2.findViewById(C0164R.id.row_sold_by_text_container);
            anonymousClass62T.f71168C = new AnonymousClass0ct((ViewStub) view2.findViewById(C0164R.id.row_sold_by_avatar_reel_ring_stub));
            anonymousClass62T.f71169D = new AnonymousClass0ct((ViewStub) view2.findViewById(C0164R.id.row_sold_by_user_follow_button));
            anonymousClass62T.f71170E = new AnonymousClass0ct((ViewStub) view2.findViewById(C0164R.id.row_sold_by_shop_button));
            anonymousClass62T.f71171F = (TextView) view2.findViewById(C0164R.id.row_sold_by_user_fullname);
            TextView textView = (TextView) view2.findViewById(C0164R.id.row_sold_by_user_username);
            anonymousClass62T.f71174I = textView;
            textView.getPaint().setFakeBoldText(true);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0164R.dimen.sold_by_row_text_padding);
            View view3 = anonymousClass62T.f71172G;
            int i2 = z ? 0 : dimensionPixelSize;
            if (!z) {
                dimensionPixelSize = 0;
            }
            view3.setPadding(i2, 0, dimensionPixelSize, 0);
            view2.setTag(anonymousClass62T);
        }
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) AnonymousClass0LH.E(anonymousClass62B.f71130B);
        anonymousClass62T = (AnonymousClass62T) view2.getTag();
        Context context2 = this.f71153B;
        AnonymousClass0Cm anonymousClass0Cm = this.f71157F;
        boolean equals = anonymousClass0Cm.f1759C.equals(anonymousClass0Ci.getId());
        String str = anonymousClass62O.f71156E;
        AnonymousClass6Ha anonymousClass6Ha = anonymousClass62O.f71154C;
        anonymousClass62T.f71172G.setOnClickListener(new AnonymousClass62P(anonymousClass6Ha, anonymousClass0Ci));
        anonymousClass62T.f71173H.setUrl(anonymousClass0Ci.DQ());
        if (AnonymousClass0Jd.f2931B.T(anonymousClass0Cm, anonymousClass0Ci)) {
            anonymousClass62T.f71168C.D(0);
            ((GradientSpinner) anonymousClass62T.f71168C.A()).B();
            ((GradientSpinner) anonymousClass62T.f71168C.A()).setOnClickListener(new AnonymousClass62Q(anonymousClass6Ha, anonymousClass0Ci, anonymousClass62T));
            anonymousClass62T.f71167B.setContentDescription(context2.getResources().getString(C0164R.string.story_ring_single_user_description));
        } else {
            anonymousClass62T.f71173H.setOnClickListener(new AnonymousClass62R(anonymousClass6Ha, anonymousClass0Ci));
            anonymousClass62T.f71168C.D(8);
            if (anonymousClass62T.f71168C.C()) {
                ((GradientSpinner) anonymousClass62T.f71168C.A()).D();
            }
            anonymousClass62T.f71167B.setContentDescription(context2.getResources().getString(C0164R.string.single_user_button_description));
        }
        anonymousClass62T.f71174I.setText(anonymousClass0Ci.uT());
        CharSequence charSequence = anonymousClass0Ci.f1757z;
        if (TextUtils.isEmpty(charSequence)) {
            anonymousClass62T.f71171F.setVisibility(8);
        } else {
            anonymousClass62T.f71171F.setText(charSequence);
            anonymousClass62T.f71171F.setVisibility(0);
        }
        if (!equals) {
            if (anonymousClass0Ci.AA() && AnonymousClass0er.B(anonymousClass0Cm).R(anonymousClass0Ci)) {
                anonymousClass62T.f71170E.D(0);
                ((UpdatableButton) anonymousClass62T.f71170E.A()).setOnClickListener(new AnonymousClass62S(anonymousClass6Ha, anonymousClass0Ci));
                anonymousClass62T.f71169D.D(8);
            } else {
                anonymousClass62T.f71170E.D(8);
                anonymousClass62T.f71169D.D(0);
                ((FollowButton) anonymousClass62T.f71169D.A()).setClickPoint("pdp_sold_by");
                AnonymousClass0db C = AnonymousClass0db.C();
                C.G("prior_module", str);
                ((FollowButton) anonymousClass62T.f71169D.A()).B(anonymousClass0Cm, anonymousClass0Ci, null, null, C, null);
            }
        }
        AnonymousClass15G.F(anonymousClass62T.f71174I, anonymousClass0Ci.u());
        AnonymousClass0cQ.H(anonymousClass62O, -990954781, I);
        return view2;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass62B anonymousClass62B = (AnonymousClass62B) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
