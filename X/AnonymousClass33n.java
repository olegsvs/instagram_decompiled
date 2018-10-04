package X;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.33n */
public final class AnonymousClass33n extends AnonymousClass0TA {
    public final int getViewTypeCount() {
        return 1;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 1193165175);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.ads_manager_rejection_reason, viewGroup, false);
        }
        TextView textView = (TextView) view;
        textView.setText((CharSequence) obj);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        AnonymousClass0cQ.H(this, 837171982, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
