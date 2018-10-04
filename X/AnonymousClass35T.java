package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.business.ui.BusinessCategoryInlineSelectionView;

/* renamed from: X.35T */
public final class AnonymousClass35T implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ BusinessCategoryInlineSelectionView f37695B;

    public AnonymousClass35T(BusinessCategoryInlineSelectionView businessCategoryInlineSelectionView) {
        this.f37695B = businessCategoryInlineSelectionView;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 612736218);
        if (this.f37695B.f47337B != null) {
            this.f37695B.f47339D = AnonymousClass368.CATEGORY;
            BusinessCategoryInlineSelectionView.m21686B(this.f37695B);
        }
        AnonymousClass0cQ.L(this, 432661945, M);
    }
}
