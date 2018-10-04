package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.2IE */
public final class AnonymousClass2IE extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f28650B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass2IE(Context context) {
        this.f28650B = context;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 1014415095);
        if (view == null) {
            view = LayoutInflater.from(this.f28650B).inflate(C0164R.layout.row_divider, viewGroup, false);
        }
        switch (((AnonymousClass2ID) obj).ordinal()) {
            case 0:
                view.setBackgroundResource(C0164R.color.grey_2);
                break;
            case 1:
                view.setBackgroundResource(C0164R.drawable.row_divider_with_padding_background);
                break;
            case 2:
                view.setBackgroundResource(C0164R.drawable.row_divider_with_left_right_padding_background);
                break;
            default:
                break;
        }
        AnonymousClass0cQ.H(this, -2010239717, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass2ID anonymousClass2ID = (AnonymousClass2ID) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
