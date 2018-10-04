package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.1TN */
public final class AnonymousClass1TN extends Toast {
    public AnonymousClass1TN(Context context) {
        super(context);
    }

    /* renamed from: B */
    public static AnonymousClass1TN m11540B(Context context, View view, int i) {
        AnonymousClass1TN anonymousClass1TN = new AnonymousClass1TN(context);
        anonymousClass1TN.setDuration(i);
        anonymousClass1TN.setGravity(17, 0, 0);
        anonymousClass1TN.setView(view);
        return anonymousClass1TN;
    }

    /* renamed from: C */
    public static AnonymousClass1TN m11541C(Context context, CharSequence charSequence, int i) {
        View inflate = LayoutInflater.from(context).inflate(C0164R.layout.ig_toast, null, false);
        ((TextView) inflate.findViewById(C0164R.id.text_view)).setText(charSequence);
        return AnonymousClass1TN.m11540B(context, inflate, i);
    }
}
