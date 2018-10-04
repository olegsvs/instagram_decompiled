package X;

import android.text.TextUtils;
import com.facebook.C0164R;
import com.instagram.igtv.viewer.IGTVViewerFragment;

/* renamed from: X.4w0 */
public final class AnonymousClass4w0 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ IGTVViewerFragment f58612B;

    public AnonymousClass4w0(IGTVViewerFragment iGTVViewerFragment) {
        this.f58612B = iGTVViewerFragment;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -951543861);
        super.onFail(anonymousClass0Q6);
        AnonymousClass0IG.B(this.f58612B.getContext(), this.f58612B.getResources().getString(C0164R.string.error), 0, 0);
        AnonymousClass0cQ.H(this, -1709394330, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1344867810);
        AnonymousClass5Ju anonymousClass5Ju = (AnonymousClass5Ju) obj;
        int I2 = AnonymousClass0cQ.I(this, -2137073630);
        super.onSuccess(anonymousClass5Ju);
        Object obj2 = anonymousClass5Ju.f62202C;
        if (TextUtils.isEmpty(obj2)) {
            AnonymousClass0IG.B(this.f58612B.getContext(), this.f58612B.getResources().getString(C0164R.string.error), 0, 0);
        } else {
            this.f58612B.f66096K = obj2;
            IGTVViewerFragment.m27461I(this.f58612B);
        }
        AnonymousClass0cQ.H(this, 303851262, I2);
        AnonymousClass0cQ.H(this, -504609354, I);
    }
}
