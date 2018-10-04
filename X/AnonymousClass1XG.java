package X;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: X.1XG */
public final class AnonymousClass1XG implements OnEditorActionListener {
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        AnonymousClass0Nm.m3435N(textView);
        return true;
    }
}
