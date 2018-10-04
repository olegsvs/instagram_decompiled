package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.170 */
public final class AnonymousClass170 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ LoadMoreButton f14630B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0PY f14631C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ro f14632D;

    public AnonymousClass170(LoadMoreButton loadMoreButton, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass0PY anonymousClass0PY) {
        this.f14630B = loadMoreButton;
        this.f14632D = anonymousClass0Ro;
        this.f14631C = anonymousClass0PY;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.m5863M(this, -718497519);
        AnonymousClass0iY.m6919B(AnonymousClass0NN.m3291B("load_more_button_retry", AnonymousClass0iY.m6920C(this.f14630B.getContext())).m3298F("source", this.f14630B.f14625B.getClass().getSimpleName()), this.f14630B.getContext()).m3310R();
        this.f14630B.f14625B.OZ();
        LoadMoreButton.setViewType(this.f14630B, this.f14632D, this.f14631C);
        AnonymousClass0cQ.m5862L(this, -661335250, M);
    }
}
