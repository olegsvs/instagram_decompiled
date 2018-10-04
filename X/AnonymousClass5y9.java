package X;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.modal.ModalActivity;

/* renamed from: X.5y9 */
public final class AnonymousClass5y9 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5yF f70429B;

    public AnonymousClass5y9(AnonymousClass5yF anonymousClass5yF) {
        this.f70429B = anonymousClass5yF;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 927984957);
        Bundle bundle = new Bundle();
        bundle.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", AnonymousClass2Gi.SELECT_COVER_PHOTO);
        bundle.putParcelable("SaveFragment.SAVE_HOME_COLLECTION", this.f70429B.f70436B);
        new AnonymousClass0Sn(ModalActivity.class, "saved_feed", bundle, this.f70429B.getActivity(), this.f70429B.f70441G.f1759C).C(this.f70429B, 1042);
        AnonymousClass0cQ.L(this, 1845010173, M);
    }
}
