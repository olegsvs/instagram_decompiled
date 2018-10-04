package X;

import com.facebook.C0164R;
import com.instagram.business.ui.BusinessCategorySelectionView;

/* renamed from: X.4Di */
public final class AnonymousClass4Di extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Dn f51645B;
    /* renamed from: C */
    public final /* synthetic */ String f51646C;

    public AnonymousClass4Di(AnonymousClass4Dn anonymousClass4Dn, String str) {
        this.f51645B = anonymousClass4Dn;
        this.f51646C = str;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -990742192);
        String string = this.f51645B.getContext().getString(C0164R.string.request_error);
        if (!(anonymousClass0Q6 == null || anonymousClass0Q6.f4287B == null || !(anonymousClass0Q6.f4287B instanceof AnonymousClass29N))) {
            string = ((AnonymousClass29N) anonymousClass0Q6.f4287B).f26716B.f26710D;
        }
        AnonymousClass0db G = AnonymousClass0db.C().G("page_name", this.f51646C);
        String str;
        if (this.f51645B.f51670K) {
            str = this.f51645B.f51668I;
            AnonymousClass33d.BUSINESS_SIGNUP_FETCH_DATA_ERROR.m18377A().F("entry_point", str).F("fb_user_id", AnonymousClass0a2.I(this.f51645B.f51676Q)).F("step", "create_page").F("component", "page_name_validation").D("selected_values", G).F("error_message", string).R();
        } else {
            str = this.f51645B.f51668I;
            AnonymousClass0wt.BUSINESS_CONVERSION_FETCH_DATA_ERROR.A().F("entry_point", str).F("fb_user_id", AnonymousClass0a2.I(this.f51645B.f51676Q)).F("step", "create_page").F("component", "page_name_validation").D("selected_values", G).F("error_message", string).R();
        }
        AnonymousClass0cQ.H(this, -696501103, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 352679363);
        super.onFinish();
        this.f51645B.f51673N.setVisibility(8);
        AnonymousClass0cQ.H(this, 936505932, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1331587003);
        super.onStart();
        this.f51645B.f51672M.setVisibility(8);
        this.f51645B.f51673N.setVisibility(0);
        AnonymousClass0cQ.H(this, 1018271851, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1821071259);
        AnonymousClass2Xt anonymousClass2Xt = (AnonymousClass2Xt) obj;
        int I2 = AnonymousClass0cQ.I(this, 1923707891);
        AnonymousClass0db G = AnonymousClass0db.C().G("input_page_name", this.f51646C);
        if (anonymousClass2Xt.f31203C == null) {
            this.f51645B.f51672M.setVisibility(0);
            this.f51645B.f51671L.setVisibility(8);
            this.f51645B.f51675P.setVisibility(8);
            AnonymousClass36A anonymousClass36A = this.f51645B.f51666G;
            String str = this.f51646C;
            AnonymousClass0IJ anonymousClass0IJ = this.f51645B;
            anonymousClass36A.m18514B(str, anonymousClass0IJ, anonymousClass0IJ.f51676Q);
        } else {
            this.f51645B.f51672M.setVisibility(8);
            AnonymousClass4Dn anonymousClass4Dn = this.f51645B;
            CharSequence charSequence = anonymousClass2Xt.f31202B;
            anonymousClass4Dn.f51671L.setVisibility(0);
            anonymousClass4Dn.f51675P.setVisibility(0);
            anonymousClass4Dn.f51671L.setText(charSequence);
            G.G("suggested_page_name", anonymousClass2Xt.f31203C);
            BusinessCategorySelectionView businessCategorySelectionView = this.f51645B.f51662C;
            businessCategorySelectionView.f47359L.setVisibility(8);
            businessCategorySelectionView.f47361N.setVisibility(8);
        }
        String str2;
        if (this.f51645B.f51670K) {
            str2 = this.f51645B.f51668I;
            AnonymousClass33d.BUSINESS_SIGNUP_FETCH_DATA.m18377A().F("entry_point", str2).F("fb_user_id", AnonymousClass0a2.I(this.f51645B.f51676Q)).F("step", "create_page").F("component", "page_name_validation").D("selected_values", G).R();
        } else {
            str2 = this.f51645B.f51668I;
            AnonymousClass0wt.BUSINESS_CONVERSION_FETCH_DATA.A().F("entry_point", str2).F("fb_user_id", AnonymousClass0a2.I(this.f51645B.f51676Q)).F("step", "create_page").F("component", "page_name_validation").D("selected_values", G).R();
        }
        AnonymousClass4Dn.m23593G(this.f51645B);
        AnonymousClass0cQ.H(this, -1505119477, I2);
        AnonymousClass0cQ.H(this, 398530363, I);
    }
}
