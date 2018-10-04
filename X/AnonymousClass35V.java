package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.business.ui.BusinessCategorySelectionView;

/* renamed from: X.35V */
public final class AnonymousClass35V implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ BusinessCategorySelectionView f37697B;

    public AnonymousClass35V(BusinessCategorySelectionView businessCategorySelectionView) {
        this.f37697B = businessCategorySelectionView;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -709255191);
        if (this.f37697B.f47349B != null) {
            this.f37697B.f47352E = AnonymousClass368.CATEGORY;
            BusinessCategorySelectionView.m21689B(this.f37697B);
        }
        AnonymousClass0cQ.L(this, 1174971224, M);
    }
}
