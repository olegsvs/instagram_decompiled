package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.4w8 */
public final class AnonymousClass4w8 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4w9 f58624B;

    public AnonymousClass4w8(AnonymousClass4w9 anonymousClass4w9) {
        this.f58624B = anonymousClass4w9;
    }

    public final void run() {
        Toast.makeText(this.f58624B.f58625B.getActivity(), C0164R.string.web_error, 0).show();
    }
}
