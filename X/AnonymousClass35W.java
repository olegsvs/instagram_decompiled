package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.business.ui.BusinessCategorySelectionView;

/* renamed from: X.35W */
public final class AnonymousClass35W implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ BusinessCategorySelectionView f37698B;

    public AnonymousClass35W(BusinessCategorySelectionView businessCategorySelectionView) {
        this.f37698B = businessCategorySelectionView;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -411369865);
        if (this.f37698B.f47356I != null) {
            this.f37698B.f47352E = AnonymousClass368.SUBCATEGORY;
            BusinessCategorySelectionView.m21689B(this.f37698B);
        }
        AnonymousClass0cQ.L(this, -1025609419, M);
    }
}
