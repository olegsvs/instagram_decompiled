package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;

/* renamed from: X.55c */
public final class AnonymousClass55c extends AnonymousClass0TA {
    /* renamed from: B */
    private final OneTapLoginLandingFragment f60014B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass55c(OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        this.f60014B = oneTapLoginLandingFragment;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -80214583);
        if (view == null) {
            view = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.row_one_tap_user, viewGroup, false);
            view.setTag(new AnonymousClass55b(view));
        }
        AnonymousClass55b anonymousClass55b = (AnonymousClass55b) view.getTag();
        AnonymousClass0dq anonymousClass0dq = (AnonymousClass0dq) obj;
        OneTapLoginLandingFragment oneTapLoginLandingFragment = this.f60014B;
        String str = anonymousClass0dq.f7529E;
        if (str != null) {
            anonymousClass55b.f60009B.setUrl(str);
        } else {
            anonymousClass55b.f60009B.setImageDrawable(AnonymousClass0Ca.E(anonymousClass55b.f60009B.getContext(), C0164R.drawable.profile_anonymous_user));
        }
        anonymousClass55b.f60013F.setText(anonymousClass0dq.f7533I);
        anonymousClass55b.f60010C.setOnClickListener(new AnonymousClass55Y(oneTapLoginLandingFragment, anonymousClass0dq));
        anonymousClass55b.f60011D.setOnClickListener(new AnonymousClass55Z(oneTapLoginLandingFragment, anonymousClass0dq));
        anonymousClass55b.f60012E.setOnClickListener(new AnonymousClass55a(oneTapLoginLandingFragment, anonymousClass0dq));
        AnonymousClass0cQ.H(this, -1926277434, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0dq anonymousClass0dq = (AnonymousClass0dq) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
