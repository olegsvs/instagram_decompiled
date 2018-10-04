package X;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: X.1Jt */
public final class AnonymousClass1Jt implements OnEditorActionListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0pZ f17126B;

    public AnonymousClass1Jt(AnonymousClass0pZ anonymousClass0pZ) {
        this.f17126B = anonymousClass0pZ;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f17126B.f10658J.isEnabled()) {
            return false;
        }
        this.f17126B.f10658J.performClick();
        return true;
    }
}
