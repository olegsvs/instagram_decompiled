package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.creation.base.CreationSession;

/* renamed from: X.4Ik */
public final class AnonymousClass4Ik implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Iq f52528B;

    public AnonymousClass4Ik(AnonymousClass4Iq anonymousClass4Iq) {
        this.f52528B = anonymousClass4Iq;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1800337212);
        AnonymousClass0IL anonymousClass0IL = this.f52528B;
        CreationSession VK = ((AnonymousClass0PI) anonymousClass0IL.getContext()).VK();
        VK.f38952F = VK.f38952F.A();
        if (anonymousClass0IL.f52543I) {
            anonymousClass0IL.f52544J.requestLayout();
        }
        VK.f38967U = VK.f38952F;
        AnonymousClass0cQ.L(this, -554473329, M);
    }
}
