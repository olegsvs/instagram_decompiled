package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.59a */
public final class AnonymousClass59a extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass59b f60633B;

    public AnonymousClass59a(AnonymousClass59b anonymousClass59b) {
        this.f60633B = anonymousClass59b;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -17703699);
        super.onFail(anonymousClass0Q6);
        this.f60633B.f60634B.f60640G.f3383P = false;
        Toast.makeText(this.f60633B.f60634B.f60635B, this.f60633B.f60634B.f60635B.getString(C0164R.string.stories_tray_show_less_failure), 0).show();
        AnonymousClass0cQ.H(this, -426917465, I);
    }

    public final void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -976673642);
        super.onSuccess(obj);
        this.f60633B.f60634B.f60636C.lv();
        AnonymousClass0cQ.H(this, -962799852, I);
    }
}
