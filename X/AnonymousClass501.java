package X;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: X.501 */
public final class AnonymousClass501 implements OnEditorActionListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0II f59194B;

    public AnonymousClass501(AnonymousClass0II anonymousClass0II) {
        this.f59194B = anonymousClass0II;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return true;
        }
        if (this.f59194B.f2739F.C()) {
            AnonymousClass0II.D(this.f59194B);
        }
        return false;
    }
}
