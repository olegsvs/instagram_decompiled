package X;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.4f5 */
public final class AnonymousClass4f5 implements AnonymousClass1Tn {
    public AnonymousClass4f5(AnonymousClass5bX anonymousClass5bX) {
    }

    public final void Lo(View view) {
        Typeface D;
        TextView textView = (TextView) view;
        if (VERSION.SDK_INT >= 21) {
            D = AnonymousClass0nA.D();
        } else {
            D = Typeface.create(Typeface.SANS_SERIF, 1);
        }
        textView.setTypeface(D);
    }
}
