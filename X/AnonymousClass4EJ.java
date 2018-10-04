package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.4EJ */
public final class AnonymousClass4EJ extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f51758B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4EJ(Context context) {
        this.f51758B = context;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -2032138037);
        if (view == null) {
            view = LayoutInflater.from(this.f51758B).inflate(C0164R.layout.block_commenters_empty_state, viewGroup, false);
        }
        AnonymousClass0cQ.H(this, -124682832, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Void voidR = (Void) obj;
        Void voidR2 = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
