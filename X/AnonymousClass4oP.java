package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.4oP */
public final class AnonymousClass4oP extends AnonymousClass0TA {
    /* renamed from: B */
    private final AnonymousClass4oO f57546B;
    /* renamed from: C */
    private final Context f57547C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4oP(Context context, AnonymousClass4oO anonymousClass4oO) {
        this.f57547C = context;
        this.f57546B = anonymousClass4oO;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -550490273);
        if (view == null) {
            Context context = this.f57547C;
            AnonymousClass4oO anonymousClass4oO = this.f57546B;
            view = LayoutInflater.from(context).inflate(C0164R.layout.topical_explore_advance_to_next, viewGroup, false);
            AnonymousClass4oQ anonymousClass4oQ = new AnonymousClass4oQ((ImageView) view.findViewById(C0164R.id.arrow), (TextView) view.findViewById(C0164R.id.description));
            anonymousClass4oQ.f57549C.setText(C0164R.string.explore_topical_swipe_up_for_next);
            anonymousClass4oQ.f57548B.setRotation(270.0f);
            anonymousClass4oQ.f57548B.getDrawable().mutate().setColorFilter(AnonymousClass0ca.B(AnonymousClass0Ca.C(context, C0164R.color.white)));
            if (anonymousClass4oO != null) {
                anonymousClass4oO.f57544B = anonymousClass4oQ;
            }
            view.setTag(anonymousClass4oQ);
        }
        AnonymousClass0cQ.H(this, -1042907098, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Void voidR = (Void) obj;
        Void voidR2 = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
