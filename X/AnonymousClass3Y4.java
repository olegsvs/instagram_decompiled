package X;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.nux.ui.ContextualNuxHighlightView;

/* renamed from: X.3Y4 */
public final class AnonymousClass3Y4 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ ContextualNuxHighlightView f42153B;

    public AnonymousClass3Y4(ContextualNuxHighlightView contextualNuxHighlightView) {
        this.f42153B = contextualNuxHighlightView;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 99779612);
        if (this.f42153B.f42156C != null) {
            AnonymousClass0OR.D(new Handler(), new AnonymousClass3Y3(this, this.f42153B.f42156C), 1733217503);
        }
        AnonymousClass0cQ.L(this, 1788035645, M);
    }
}
