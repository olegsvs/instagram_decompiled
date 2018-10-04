package X;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.4fz */
public final class AnonymousClass4fz implements AnonymousClass1Tn {
    public AnonymousClass4fz(AnonymousClass5bl anonymousClass5bl) {
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
