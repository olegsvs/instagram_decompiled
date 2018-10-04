package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import com.facebook.C0164R;

/* renamed from: X.0qL */
public final class AnonymousClass0qL extends AnonymousClass0TA {
    /* renamed from: B */
    public int f10914B;
    /* renamed from: C */
    public int f10915C;
    /* renamed from: D */
    public boolean f10916D;
    /* renamed from: E */
    private final Context f10917E;

    public final int getViewTypeCount() {
        return 2;
    }

    public AnonymousClass0qL(Context context) {
        this.f10917E = context;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.m5859I(this, 1847673820);
        switch (i) {
            case 0:
                if (view == null) {
                    view = new View(this.f10917E);
                    view.setId(C0164R.id.gap_binder_group);
                    view.setLayoutParams(new LayoutParams(-1, this.f10915C));
                } else {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    layoutParams.height = this.f10915C;
                    view.setLayoutParams(layoutParams);
                }
                if (this.f10914B != 0) {
                    view.setBackgroundColor(AnonymousClass0Ca.m937C(view.getContext(), this.f10914B));
                }
                AnonymousClass0cQ.m5858H(this, 2054118747, I);
                return view;
            case 1:
                if (view == null) {
                    view = new View(this.f10917E);
                    view.setBackgroundResource(C0164R.color.gap_binder_group_divider);
                    view.setLayoutParams(new LayoutParams(-1, this.f10917E.getResources().getDimensionPixelSize(C0164R.dimen.gap_divider_height)));
                }
                AnonymousClass0cQ.m5858H(this, 1228023719, I);
                return view;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Illegal view type: ");
                stringBuilder.append(i);
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
                AnonymousClass0cQ.m5858H(this, -1075855284, I);
                throw illegalArgumentException;
        }
    }

    public final /* bridge */ /* synthetic */ void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Void voidR = (Void) obj;
        Void voidR2 = (Void) obj2;
        anonymousClass0p9.m7787A(0);
        if (this.f10916D) {
            anonymousClass0p9.m7787A(1);
        }
    }
}
