package X;

import android.view.KeyEvent;
import android.view.View;
import com.instagram.pendingmedia.model.PendingRecipient;

/* renamed from: X.5X6 */
public final class AnonymousClass5X6 implements AnonymousClass5Jg {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4lj f65750B;

    public AnonymousClass5X6(AnonymousClass4lj anonymousClass4lj) {
        this.f65750B = anonymousClass4lj;
    }

    public final void Op(int i, KeyEvent keyEvent) {
        AnonymousClass4lj.m25010C(this.f65750B);
        this.f65750B.f56975I.requestFocus();
        this.f65750B.f56975I.dispatchKeyEvent(keyEvent);
    }

    public final void Yi(View view) {
        this.f65750B.f56968B.fv((PendingRecipient) view.getTag());
        AnonymousClass4lj.m25010C(this.f65750B);
        this.f65750B.f56975I.requestFocus();
    }
}
