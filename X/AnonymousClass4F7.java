package X;

import android.text.Editable;
import com.instagram.comments.controller.SimpleCommentComposerController;

/* renamed from: X.4F7 */
public final class AnonymousClass4F7 extends AnonymousClass0zU {
    /* renamed from: B */
    public final /* synthetic */ SimpleCommentComposerController f51946B;

    public AnonymousClass4F7(SimpleCommentComposerController simpleCommentComposerController) {
        this.f51946B = simpleCommentComposerController;
    }

    public final void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        this.f51946B.B();
    }
}
