package X;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.archive.fragment.InlineAddHighlightFragment;

/* renamed from: X.49C */
public final class AnonymousClass49C implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ InlineAddHighlightFragment f50872B;

    public AnonymousClass49C(InlineAddHighlightFragment inlineAddHighlightFragment) {
        this.f50872B = inlineAddHighlightFragment;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1679641788);
        if (this.f50872B.f50887B == AnonymousClass49H.ADD) {
            if (this.f50872B.mDelegate != null) {
                this.f50872B.mDelegate.sh(InlineAddHighlightFragment.m23425B(this.f50872B), this.f50872B);
            }
        } else if (this.f50872B.f50887B == AnonymousClass49H.CANCEL) {
            ((Activity) this.f50872B.getContext()).onBackPressed();
        }
        AnonymousClass0cQ.L(this, 52653775, M);
    }
}
