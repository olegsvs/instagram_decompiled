package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.business.ui.BusinessCategorySelectionView;

/* renamed from: X.35X */
public final class AnonymousClass35X implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ BusinessCategorySelectionView f37699B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2Xj f37700C;

    public AnonymousClass35X(BusinessCategorySelectionView businessCategorySelectionView, AnonymousClass2Xj anonymousClass2Xj) {
        this.f37699B = businessCategorySelectionView;
        this.f37700C = anonymousClass2Xj;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1912020599);
        this.f37699B.f47351D.setText(this.f37700C.f31196E);
        this.f37699B.f47357J.setText(this.f37700C.f31194C);
        this.f37699B.f47354G = this.f37700C.f31195D;
        this.f37699B.f47355H = this.f37700C.f31193B;
        if (this.f37699B.f47353F != null) {
            this.f37699B.f47353F.BCA(this.f37699B.f47354G);
        }
        AnonymousClass0cQ.L(this, 1188504243, M);
    }
}
