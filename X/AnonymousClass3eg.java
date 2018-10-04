package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.3eg */
public final class AnonymousClass3eg implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3ei f43047B;

    public AnonymousClass3eg(AnonymousClass3ei anonymousClass3ei) {
        this.f43047B = anonymousClass3ei;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1198740172);
        new AnonymousClass0Sb(this.f43047B.getContext()).R(AnonymousClass0IE.E(this.f43047B.getString(C0164R.string.unlink_account), new Object[]{this.f43047B.getString(C0164R.string.ameba)})).L(C0164R.string.cancel, null).O(C0164R.string.unlink, new AnonymousClass3ef(this)).C().show();
        AnonymousClass0cQ.L(this, 773816769, M);
    }
}
