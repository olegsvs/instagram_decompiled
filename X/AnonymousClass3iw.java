package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3iw */
public final class AnonymousClass3iw extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f43655B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass3iw(Context context) {
        this.f43655B = context;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1583932658);
        if (view == null) {
            view = AnonymousClass3iy.m20497B(LayoutInflater.from(this.f43655B), viewGroup);
        }
        ((AnonymousClass3ix) view.getTag()).f43657C.setText((String) obj);
        AnonymousClass0cQ.H(this, -1472006477, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        String str = (String) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
