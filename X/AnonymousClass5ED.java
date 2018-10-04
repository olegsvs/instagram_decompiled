package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.5ED */
public final class AnonymousClass5ED extends AnonymousClass0TA {
    /* renamed from: B */
    public final Context f61414B;
    /* renamed from: C */
    public final boolean f61415C;
    /* renamed from: D */
    public final AnonymousClass3eF f61416D;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5ED(Context context, AnonymousClass3eF anonymousClass3eF, boolean z) {
        this.f61414B = context;
        this.f61416D = anonymousClass3eF;
        this.f61415C = z;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        CharSequence charSequence;
        Object obj3 = obj2;
        int I = AnonymousClass0cQ.I(this, -1653648193);
        if (view == null) {
            view = AnonymousClass3eG.C(this.f61414B, viewGroup);
        }
        AnonymousClass1Ak anonymousClass1Ak = (AnonymousClass1Ak) obj;
        AnonymousClass3du anonymousClass3du = (AnonymousClass3du) obj3;
        int I2 = AnonymousClass0cQ.I(this, 875476809);
        AnonymousClass3eE anonymousClass3eE = (AnonymousClass3eE) view.getTag();
        int i2 = anonymousClass3du.f42934B;
        AnonymousClass3eF anonymousClass3eF = this.f61416D;
        boolean z = this.f61415C;
        Object obj4 = (anonymousClass1Ak.f15312E == null || !"facebook_events".equals(anonymousClass1Ak.f15312E.f6707D)) ? null : 1;
        int i3 = obj4 != null ? C0164R.drawable.search_event_redesign : C0164R.drawable.instagram_location_outline_24;
        anonymousClass3eE.f42980C.setVisibility(z ? 8 : 0);
        anonymousClass3eE.f42980C.setImageDrawable(AnonymousClass0Ca.E(anonymousClass3eE.f42980C.getContext(), i3));
        AnonymousClass3eG.B(anonymousClass3eE.f42980C);
        anonymousClass3eE.f42981D.setOnClickListener(new AnonymousClass3eB(anonymousClass3eF, anonymousClass1Ak, i2));
        anonymousClass3eE.f42981D.setOnLongClickListener(new AnonymousClass3eC(anonymousClass3eF, anonymousClass1Ak));
        anonymousClass3eE.f42979B.setText(anonymousClass1Ak.C());
        if (anonymousClass1Ak.f15309B != null) {
            charSequence = anonymousClass1Ak.f15309B;
        } else {
            charSequence = anonymousClass1Ak.f15310C;
        }
        if (TextUtils.isEmpty(charSequence)) {
            anonymousClass3eE.f42982E.setVisibility(8);
        } else {
            anonymousClass3eE.f42982E.setVisibility(0);
            anonymousClass3eE.f42982E.setText(anonymousClass1Ak.f15310C);
        }
        AnonymousClass0cQ.H(this, -735775014, I2);
        AnonymousClass0cQ.H(this, 1091018587, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass1Ak anonymousClass1Ak = (AnonymousClass1Ak) obj;
        AnonymousClass3du anonymousClass3du = (AnonymousClass3du) obj2;
        anonymousClass0p9.A(0);
    }
}
