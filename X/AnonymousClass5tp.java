package X;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.reels.fragment.ReelDashboardFragment;

/* renamed from: X.5tp */
public final class AnonymousClass5tp {
    /* renamed from: B */
    public final AnonymousClass5tT f69767B;
    /* renamed from: C */
    public final RecyclerView f69768C;

    public AnonymousClass5tp(View view, ReelDashboardFragment reelDashboardFragment) {
        Context context = view.getContext();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0164R.id.feedback_list);
        this.f69768C = recyclerView;
        recyclerView.setLayoutManager(new AnonymousClass0rr(context, 0, false));
        this.f69768C.A(new AnonymousClass0ru(context.getResources().getDimensionPixelSize(C0164R.dimen.feedback_list_padding), 0));
        this.f69767B = new AnonymousClass5tT(reelDashboardFragment);
        this.f69768C.setAdapter(this.f69767B);
        boolean z = true;
        if (this.f69768C.getLayoutDirection() != 1) {
            z = false;
        }
        this.f69768C.D(new AnonymousClass5to(this, reelDashboardFragment, z));
    }
}
