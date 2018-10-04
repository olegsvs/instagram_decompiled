package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.3Zw */
public final class AnonymousClass3Zw extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f42367B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass3Zw(Context context) {
        this.f42367B = context;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1688777378);
        if (view == null) {
            view = LayoutInflater.from(this.f42367B).inflate(C0164R.layout.row_no_results_dark, viewGroup, false);
            AnonymousClass3ix anonymousClass3ix = new AnonymousClass3ix();
            view.setTag(anonymousClass3ix);
            anonymousClass3ix.f43657C = (TextView) view.findViewById(C0164R.id.row_no_results_textview);
            anonymousClass3ix.f43656B = view.findViewById(C0164R.id.row_divider);
            anonymousClass3ix.f43656B.setVisibility(8);
        }
        ((AnonymousClass3ix) view.getTag()).f43657C.setText((String) obj);
        AnonymousClass0cQ.H(this, 475218434, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        String str = (String) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
