package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.60t */
public final class AnonymousClass60t extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f70900B;
    /* renamed from: C */
    private final AnonymousClass6HP f70901C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass60t(Context context, AnonymousClass6HP anonymousClass6HP) {
        this.f70900B = context;
        this.f70901C = anonymousClass6HP;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1219206996);
        if (view == null) {
            view = AnonymousClass3eG.C(this.f70900B, viewGroup);
        }
        Context context = this.f70900B;
        AnonymousClass3eE anonymousClass3eE = (AnonymousClass3eE) view.getTag();
        AnonymousClass6HP anonymousClass6HP = this.f70901C;
        anonymousClass3eE.f42980C.setVisibility(0);
        anonymousClass3eE.f42980C.setImageDrawable(AnonymousClass0Ca.E(context, C0164R.drawable.location_filled));
        AnonymousClass3eG.B(anonymousClass3eE.f42980C);
        int C = AnonymousClass0Ca.C(context, C0164R.color.blue_5);
        anonymousClass3eE.f42980C.setColorFilter(AnonymousClass0ca.B(C));
        anonymousClass3eE.f42982E.setVisibility(8);
        anonymousClass3eE.f42979B.setText(C0164R.string.nearby_places);
        anonymousClass3eE.f42979B.setTextColor(C);
        anonymousClass3eE.f42981D.setOnClickListener(new AnonymousClass3eD(anonymousClass6HP));
        AnonymousClass0cQ.H(this, 1435064011, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Void voidR = (Void) obj;
        Void voidR2 = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
