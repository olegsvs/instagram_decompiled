package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.business.ui.BusinessCategoryInlineSelectionView;

/* renamed from: X.35U */
public final class AnonymousClass35U implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ BusinessCategoryInlineSelectionView f37696B;

    public AnonymousClass35U(BusinessCategoryInlineSelectionView businessCategoryInlineSelectionView) {
        this.f37696B = businessCategoryInlineSelectionView;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1544797375);
        if (this.f37696B.f47340E != null) {
            this.f37696B.f47339D = AnonymousClass368.SUBCATEGORY;
            BusinessCategoryInlineSelectionView.m21686B(this.f37696B);
        }
        AnonymousClass0cQ.L(this, 349758164, M);
    }
}
