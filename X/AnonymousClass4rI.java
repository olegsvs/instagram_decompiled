package X;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: X.4rI */
public final class AnonymousClass4rI implements OnEditorActionListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5bt f57905B;

    public AnonymousClass4rI(AnonymousClass5bt anonymousClass5bt) {
        this.f57905B = anonymousClass5bt;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Object obj;
        if (i != 6) {
            if (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66) {
                obj = null;
                if (obj != null) {
                    return false;
                }
                this.f57905B.ms();
                return true;
            }
        }
        obj = 1;
        if (obj != null) {
            return false;
        }
        this.f57905B.ms();
        return true;
    }
}
