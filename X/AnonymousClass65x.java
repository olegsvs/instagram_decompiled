package X;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: X.65x */
public final class AnonymousClass65x implements OnEditorActionListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6Fx f71690B;

    public AnonymousClass65x(AnonymousClass6Fx anonymousClass6Fx) {
        this.f71690B = anonymousClass6Fx;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Object trim = textView.getText().toString().trim();
        if (this.f71690B.f73492E == null || 4 != i || TextUtils.isEmpty(trim)) {
            return false;
        }
        this.f71690B.f73492E.m29649A(trim);
        return true;
    }
}
