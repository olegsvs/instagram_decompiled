package X;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.nux.ui.NetzDgTermsTextView;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.3Y7 */
public final class AnonymousClass3Y7 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ NetzDgTermsTextView f42166B;

    public AnonymousClass3Y7(NetzDgTermsTextView netzDgTermsTextView) {
        this.f42166B = netzDgTermsTextView;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1381315870);
        Context context = this.f42166B.getContext();
        AnonymousClass0Su anonymousClass0Su = new AnonymousClass0Su(AnonymousClass0fz.B("/legal/terms/"));
        anonymousClass0Su.f5039M = this.f42166B.getText().toString();
        SimpleWebViewActivity.C(context, null, anonymousClass0Su.A());
        AnonymousClass0cQ.L(this, -1277148505, M);
    }
}
