package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.32B */
public final class AnonymousClass32B extends AnonymousClass0TA {
    public final int getViewTypeCount() {
        return 1;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 503761660);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.close_friends_list_section_header, viewGroup, false);
        }
        ((TextView) view).setText((String) obj);
        AnonymousClass0cQ.H(this, 746893215, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        String str = (String) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
