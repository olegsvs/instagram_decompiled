package X;

import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.4wS */
public final class AnonymousClass4wS extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4wT f58658B;
    /* renamed from: C */
    private final OnDismissListener f58659C;
    /* renamed from: D */
    private final AnonymousClass2bl f58660D = new AnonymousClass2bl();

    public AnonymousClass4wS(AnonymousClass4wT anonymousClass4wT, OnDismissListener onDismissListener) {
        this.f58658B = anonymousClass4wT;
        this.f58659C = onDismissListener;
        Bundle bundle = new Bundle();
        bundle.putBoolean("isDeleting", true);
        this.f58660D.setArguments(bundle);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 2025128948);
        if (this.f58660D.isResumed()) {
            Toast.makeText(this.f58658B.f58664E.getContext(), C0164R.string.error, 0).show();
        }
        AnonymousClass0cQ.H(this, 1030282344, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 2061824816);
        if (this.f58660D.isResumed()) {
            this.f58660D.B();
            OnDismissListener onDismissListener = this.f58659C;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(null);
            }
            AnonymousClass0cQ.H(this, -1543096878, I);
            return;
        }
        AnonymousClass0cQ.H(this, 1773529358, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -2143341889);
        this.f58660D.D(this.f58658B.f58664E.getFragmentManager(), "ProgressDialog");
        AnonymousClass0cQ.H(this, -1163024119, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -718794616);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -1602839164);
        this.f58658B.f58662C.G().f4042q = 1;
        this.f58658B.f58662C.G().yC();
        AnonymousClass0cQ.H(this, -1225236238, I2);
        AnonymousClass0cQ.H(this, -1760671995, I);
    }
}
