package X;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: X.51X */
public final class AnonymousClass51X implements OnEditorActionListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51g f59335B;

    public AnonymousClass51X(AnonymousClass51g anonymousClass51g) {
        this.f59335B = anonymousClass51g;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (this.f59335B.f59345C.isEnabled()) {
            Object obj;
            if (i != 6) {
                if (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66) {
                    obj = null;
                    if (obj != null) {
                        AnonymousClass51g.m25601C(this.f59335B);
                        return true;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                AnonymousClass51g.m25601C(this.f59335B);
                return true;
            }
        }
        return false;
    }
}
