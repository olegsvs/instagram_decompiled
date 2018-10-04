package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;

/* renamed from: X.4rs */
public final class AnonymousClass4rs {
    /* renamed from: B */
    public static void m25226B(AnonymousClass4rr anonymousClass4rr) {
        anonymousClass4rr.f57963B.setText(anonymousClass4rr.f57963B.getContext().getResources().getString(C0164R.string.preview_hint_text));
    }

    /* renamed from: C */
    public static AnonymousClass4rr m25227C(View view) {
        AnonymousClass4rr anonymousClass4rr = new AnonymousClass4rr();
        anonymousClass4rr.f57963B = (TextView) view.findViewById(C0164R.id.hint);
        return anonymousClass4rr;
    }
}
