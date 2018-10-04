package X;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: X.61P */
public final class AnonymousClass61P implements OnEditorActionListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6FF f70985B;

    public AnonymousClass61P(AnonymousClass6FF anonymousClass6FF) {
        this.f70985B = anonymousClass6FF;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Object obj;
        if (i != 6) {
            if (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66) {
                obj = null;
                if (obj != null) {
                    return false;
                }
                AnonymousClass6FF.m29624C(this.f70985B);
                return true;
            }
        }
        obj = 1;
        if (obj != null) {
            return false;
        }
        AnonymousClass6FF.m29624C(this.f70985B);
        return true;
    }
}
