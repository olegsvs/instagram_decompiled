package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.C0164R;
import com.fasterxml.jackson.databind.JsonMappingException;

/* renamed from: X.3Pd */
public final class AnonymousClass3Pd extends AnonymousClass0TA {
    /* renamed from: B */
    private final boolean f40909B;
    /* renamed from: C */
    private final Context f40910C;
    /* renamed from: D */
    private final AnonymousClass3Pl f40911D;
    /* renamed from: E */
    private final boolean f40912E;
    /* renamed from: F */
    private AnonymousClass1cS f40913F;
    /* renamed from: G */
    private final boolean f40914G;
    /* renamed from: H */
    private final AnonymousClass0Cm f40915H;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass3Pd(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3Pl anonymousClass3Pl, boolean z, boolean z2, boolean z3) {
        this(context, anonymousClass0Cm, anonymousClass3Pl, z, z2, z3, null);
    }

    public AnonymousClass3Pd(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3Pl anonymousClass3Pl, boolean z, boolean z2, boolean z3, AnonymousClass1cS anonymousClass1cS) {
        this.f40910C = context;
        this.f40915H = anonymousClass0Cm;
        this.f40911D = anonymousClass3Pl;
        this.f40909B = z;
        this.f40914G = z2;
        this.f40912E = z3;
        this.f40913F = anonymousClass1cS;
    }

    /* renamed from: B */
    public static AnonymousClass0pB m19557B(AnonymousClass3Pd anonymousClass3Pd, AnonymousClass0mW anonymousClass0mW, Integer num) {
        if (anonymousClass3Pd.f40913F == null) {
            return AnonymousClass0pB.f10509E;
        }
        AnonymousClass0p3 B = AnonymousClass0pB.B(anonymousClass0mW, num);
        B.f10464C = anonymousClass0mW.getId();
        return B.B(anonymousClass3Pd.f40913F).A();
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        View view2 = view;
        int I = AnonymousClass0cQ.I(this, -1290245629);
        if (view == null) {
            view2 = (LinearLayout) LayoutInflater.from(r4.f40910C).inflate(C0164R.layout.row_recommended_user, null);
            view2.setTag(new AnonymousClass3Pk(view2));
            view2.setId(C0164R.id.recommended_user_row_content_identifier);
        }
        Context context = r4.f40910C;
        AnonymousClass0Cm anonymousClass0Cm = r4.f40915H;
        AnonymousClass3Pk anonymousClass3Pk = (AnonymousClass3Pk) view2.getTag();
        int intValue = ((Integer) obj4).intValue();
        AnonymousClass0mW anonymousClass0mW = (AnonymousClass0mW) obj3;
        boolean z = r4.f40909B;
        boolean z2 = r4.f40914G;
        boolean z3 = r4.f40912E;
        AnonymousClass3Pl anonymousClass3Pl = r4.f40911D;
        obj2 = intValue;
        AnonymousClass0Nm.f(anonymousClass3Pk.f40944N, context.getResources().getDimensionPixelSize(intValue == 0 ? C0164R.dimen.row_discover_people_vertical_padding_large : C0164R.dimen.row_discover_people_vertical_padding));
        anonymousClass3Pl.Ey(anonymousClass0mW, intValue);
        OnClickListener anonymousClass3Pe = new AnonymousClass3Pe(anonymousClass3Pl, anonymousClass0mW, intValue);
        AnonymousClass0MI A = anonymousClass0mW.A(anonymousClass0Cm);
        if (A == null || (A.V() && A.M())) {
            anonymousClass3Pk.f40939I = null;
            anonymousClass3Pk.f40941K.setVisibility(4);
            if (z) {
                anonymousClass3Pk.f40932B.setOnClickListener(anonymousClass3Pe);
            }
            anonymousClass3Pk.f40933C.setOnTouchListener(null);
        } else {
            anonymousClass3Pk.f40939I = A.getId();
            if (A.W()) {
                anonymousClass3Pk.f40941K.D();
            } else {
                anonymousClass3Pk.f40941K.B();
            }
            anonymousClass3Pk.f40941K.setVisibility(0);
            anonymousClass3Pk.f40932B.setClickable(false);
            anonymousClass3Pk.f40933C.setOnTouchListener(anonymousClass3Pk.f40943M);
        }
        anonymousClass3Pk.f40943M.E();
        if (anonymousClass3Pk.f40940J != null) {
            anonymousClass3Pk.f40940J.xD(AnonymousClass3b9.LOAD_OTHER_REEL);
            anonymousClass3Pk.f40940J = null;
        }
        anonymousClass3Pk.f40937G = new AnonymousClass40b(anonymousClass3Pl, intValue, anonymousClass3Pk);
        anonymousClass3Pk.f40932B.setUrl(anonymousClass0mW.f9808G.DQ());
        anonymousClass3Pk.f40945O.setText(anonymousClass0mW.f9808G.uT());
        AnonymousClass15G.C(anonymousClass3Pk.f40945O, anonymousClass0mW.f9808G.u());
        if (anonymousClass0mW.f9808G.T().equals(anonymousClass0mW.f9808G.uT())) {
            anonymousClass3Pk.f40935E.setVisibility(8);
        } else {
            anonymousClass3Pk.f40935E.setText(anonymousClass0mW.f9808G.T());
            anonymousClass3Pk.f40935E.setVisibility(0);
        }
        if (TextUtils.isEmpty(anonymousClass0mW.f9807F) || !z2) {
            anonymousClass3Pk.f40942L.setVisibility(8);
        } else {
            anonymousClass3Pk.f40942L.setText(anonymousClass0mW.f9807F);
            anonymousClass3Pk.f40942L.setVisibility(0);
            LayoutParams layoutParams = (LayoutParams) anonymousClass3Pk.f40942L.getLayoutParams();
            if (anonymousClass3Pk.f40935E.getVisibility() != 0) {
                layoutParams.topMargin = context.getResources().getDimensionPixelSize(C0164R.dimen.row_discover_people_social_context_without_fullname_margin_top);
            } else {
                layoutParams.topMargin = context.getResources().getDimensionPixelSize(C0164R.dimen.row_discover_people_social_context_with_fullname_margin_top);
            }
            anonymousClass3Pk.f40942L.setLayoutParams(layoutParams);
        }
        anonymousClass3Pk.f40934D.setVisibility(0);
        anonymousClass3Pk.f40934D.A(anonymousClass0Cm, anonymousClass0mW.f9808G, new AnonymousClass3Pf(anonymousClass3Pl, anonymousClass0mW, intValue));
        Object obj5 = context.getResources().getDisplayMetrics().widthPixels <= JsonMappingException.MAX_REFS_TO_LIST ? 1 : null;
        AnonymousClass0Lq Q = AnonymousClass0er.B(anonymousClass0Cm).Q(anonymousClass0mW.f9808G);
        if (!z3 || Q == AnonymousClass0Lq.FollowStatusFollowing || Q == AnonymousClass0Lq.FollowStatusRequested) {
            anonymousClass3Pk.f40936F.setVisibility(8);
            anonymousClass3Pk.f40938H.setVisibility(8);
        } else if (obj5 != null) {
            anonymousClass3Pk.f40938H.setVisibility(0);
            CharSequence[] charSequenceArr = new CharSequence[1];
            i = context;
            charSequenceArr[0] = context.getString(C0164R.string.dismiss_user);
            anonymousClass3Pk.f40938H.setOnClickListener(new AnonymousClass3Ph(i, charSequenceArr, anonymousClass3Pl, anonymousClass0mW, obj2));
        } else {
            anonymousClass3Pk.f40936F.setVisibility(0);
            anonymousClass3Pk.f40936F.setOnClickListener(new AnonymousClass3Pi(anonymousClass3Pl, anonymousClass0mW, intValue));
        }
        if (z) {
            anonymousClass3Pk.f40944N.setOnClickListener(anonymousClass3Pe);
        }
        AnonymousClass0cQ.H(r4, -58024850, I);
        return view2;
    }

    public final /* bridge */ /* synthetic */ void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0mW anonymousClass0mW = (AnonymousClass0mW) obj;
        Integer num = (Integer) obj2;
        anonymousClass0p9.A(0).f10508G = AnonymousClass3Pd.m19557B(this, anonymousClass0mW, num);
    }
}
