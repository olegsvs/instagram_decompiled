package X;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;

/* renamed from: X.0jF */
public final class AnonymousClass0jF implements OnScrollListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0PY f9059B;

    public AnonymousClass0jF(AnonymousClass0PY anonymousClass0PY) {
        this.f9059B = anonymousClass0PY;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0cQ.m5858H(this, -515865918, AnonymousClass0cQ.m5859I(this, 2659960));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.m5859I(this, -235534937);
        if (i == 0 && this.f9059B.getView() != null) {
            boolean z = false;
            if (this.f9059B.f4085H.jTA()) {
                z = AnonymousClass0m2.m7439S(this.f9059B.getListView(), this.f9059B.f4116m, null, AnonymousClass0m1.DIRECT_REPLY_TO_AUTHOR, this.f9059B.f4084G, C0164R.string.direct_reply_to_author_feed_tooltip_nux, 2000);
            }
            if (!z) {
                View N = AnonymousClass0m2.m7434N(this.f9059B.getListView(), this.f9059B.f4116m, AnonymousClass3af.f42467F);
                if (N != null) {
                    this.f9059B.f4111h.C(this.f9059B.f4110g, AnonymousClass3af.f42467F, N);
                }
            }
        }
        AnonymousClass0cQ.m5858H(this, -880196805, I);
    }
}
