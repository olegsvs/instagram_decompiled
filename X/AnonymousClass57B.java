package X;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: X.57B */
public final class AnonymousClass57B implements OnEditorActionListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass57K f60281B;

    public AnonymousClass57B(AnonymousClass57K anonymousClass57K) {
        this.f60281B = anonymousClass57K;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Object obj;
        if (i != 6) {
            if (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66) {
                obj = null;
                if (obj != null) {
                    AnonymousClass57K anonymousClass57K = this.f60281B;
                    obj = (TextUtils.isEmpty(AnonymousClass0Nm.K(anonymousClass57K.f60308L)) || TextUtils.isEmpty(AnonymousClass0Nm.K(anonymousClass57K.f60315S)) || anonymousClass57K.f60301E) ? null : 1;
                    if (obj != null) {
                        AnonymousClass57K.m25783C(this.f60281B, true);
                        return true;
                    }
                }
                return false;
            }
        }
        obj = 1;
        if (obj != null) {
            AnonymousClass57K anonymousClass57K2 = this.f60281B;
            if (!TextUtils.isEmpty(AnonymousClass0Nm.K(anonymousClass57K2.f60308L))) {
            }
            if (obj != null) {
                AnonymousClass57K.m25783C(this.f60281B, true);
                return true;
            }
        }
        return false;
    }
}
