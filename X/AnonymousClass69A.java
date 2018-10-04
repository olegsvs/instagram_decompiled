package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.69A */
public final class AnonymousClass69A extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f72268B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass69A(Context context) {
        this.f72268B = context;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1550759257);
        if (view == null) {
            view = LayoutInflater.from(this.f72268B).inflate(C0164R.layout.layout_iglive_title_row, viewGroup, false);
            view.setTag(new AnonymousClass698((TextView) view));
        }
        AnonymousClass698 anonymousClass698 = (AnonymousClass698) view.getTag();
        AnonymousClass699 anonymousClass699 = (AnonymousClass699) obj;
        anonymousClass698.f72265B.setText(anonymousClass699.f72267C);
        anonymousClass698.f72265B.setBackground(anonymousClass699.f72266B);
        AnonymousClass0cQ.H(this, 637326633, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass699 anonymousClass699 = (AnonymousClass699) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
