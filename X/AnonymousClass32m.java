package X;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.pendingmedia.model.BrandedContentTag;

/* renamed from: X.32m */
public final class AnonymousClass32m implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass32p f37257B;

    public AnonymousClass32m(AnonymousClass32p anonymousClass32p) {
        this.f37257B = anonymousClass32p;
    }

    public final void onClick(View view) {
        String str;
        int M = AnonymousClass0cQ.M(this, 1500847796);
        AnonymousClass0IL anonymousClass0IL = this.f37257B;
        FragmentActivity activity = anonymousClass0IL.getActivity();
        String str2 = anonymousClass0IL.f37263E.f1759C;
        AnonymousClass3ht anonymousClass3x2 = new AnonymousClass3x2(anonymousClass0IL);
        BrandedContentTag brandedContentTag = anonymousClass0IL.f37262D;
        if (brandedContentTag != null) {
            str = brandedContentTag.f27935C;
        } else {
            str = null;
        }
        AnonymousClass3i1.m20464C(activity, str2, anonymousClass3x2, false, str);
        AnonymousClass0cQ.L(this, -518355635, M);
    }
}
