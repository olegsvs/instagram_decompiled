package X;

import android.graphics.RectF;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.PendingRecipient;

/* renamed from: X.5Un */
public final class AnonymousClass5Un implements AnonymousClass4Yt {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass18O f65090B;

    public AnonymousClass5Un(AnonymousClass18O anonymousClass18O) {
        this.f65090B = anonymousClass18O;
    }

    public final void DCA(DirectShareTarget directShareTarget, String str, int i) {
        if (str.equals("inbox_suggestion") && this.f65090B.f14936Y.add(directShareTarget)) {
            AnonymousClass0V1.j(directShareTarget, "direct_suggested_thread_impression", this.f65090B.f14920I, i);
        }
    }

    public final void ECA(DirectShareTarget directShareTarget, RectF rectF, String str) {
        AnonymousClass18O anonymousClass18O = this.f65090B;
        AnonymousClass18O.O(anonymousClass18O, AnonymousClass1b2.B(anonymousClass18O.f14942e.B(), directShareTarget), rectF, str);
    }

    public final void yz(int i, DirectShareTarget directShareTarget, String str) {
        DirectThreadKey directThreadKey = directShareTarget.f5604E;
        if (directThreadKey == null) {
            AnonymousClass0Gn.H("DirectInboxPresenter", "thread key should never be null");
            return;
        }
        if (str.equals("inbox_suggestion")) {
            AnonymousClass0NN B = AnonymousClass0NN.B("direct_suggested_thread_click", this.f65090B.f14920I);
            if (directShareTarget.B().size() == 1) {
                B.F("a_pk", ((PendingRecipient) directShareTarget.B().get(0)).getId());
            }
            B.R();
        }
        AnonymousClass18O.H(this.f65090B, directThreadKey.f5871C, directShareTarget.B(), 0, str);
    }
}
