package X;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.62d */
public final class AnonymousClass62d extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f71220B;
    /* renamed from: C */
    private final AnonymousClass6Ha f71221C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass62d(Context context, AnonymousClass6Ha anonymousClass6Ha) {
        this.f71220B = context;
        this.f71221C = anonymousClass6Ha;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -222693051);
        if (view == null) {
            Context context = this.f71220B;
            view = LayoutInflater.from(context).inflate(C0164R.layout.thumbnail_image_variance_selector, viewGroup, false);
            AnonymousClass62e anonymousClass62e = new AnonymousClass62e();
            anonymousClass62e.f71222B = (RecyclerView) view;
            AnonymousClass0la anonymousClass0rr = new AnonymousClass0rr(context, 0, false);
            anonymousClass0rr.f9543B = true;
            anonymousClass62e.f71222B.setLayoutManager(anonymousClass0rr);
            anonymousClass62e.f71222B.A(new AnonymousClass0ru(context.getResources().getDimensionPixelSize(C0164R.dimen.shopping_viewer_margin), context.getResources().getDimensionPixelSize(C0164R.dimen.variance_selector_thumbnail_spacing)));
            view.setTag(anonymousClass62e);
        }
        AnonymousClass3g3 anonymousClass3g3 = (AnonymousClass3g3) obj;
        AnonymousClass62e anonymousClass62e2 = (AnonymousClass62e) view.getTag();
        Context context2 = this.f71220B;
        AnonymousClass6Ha anonymousClass6Ha = this.f71221C;
        AnonymousClass62c anonymousClass62c = (AnonymousClass62c) anonymousClass62e2.f71222B.getAdapter();
        if (anonymousClass62c == null) {
            anonymousClass62e2.f71222B.setAdapter(new AnonymousClass62c(context2, anonymousClass6Ha, anonymousClass3g3));
        } else {
            AnonymousClass0LH.E(anonymousClass3g3.f43233B);
            String[] strArr = anonymousClass3g3.f43233B;
            boolean[] zArr = anonymousClass3g3.f43234C;
            int i2 = anonymousClass3g3.f43236E;
            anonymousClass62c.f71218F = strArr;
            anonymousClass62c.f71216D = zArr;
            anonymousClass62c.f71217E = i2;
            anonymousClass62c.notifyDataSetChanged();
        }
        AnonymousClass0cQ.H(this, 218194506, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass3g3 anonymousClass3g3 = (AnonymousClass3g3) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
