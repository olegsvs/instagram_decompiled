package X;

import android.content.Context;
import android.widget.Toast;
import com.facebook.C0164R;
import java.lang.ref.WeakReference;

/* renamed from: X.4FV */
public final class AnonymousClass4FV extends AnonymousClass0Iw {
    /* renamed from: B */
    public final WeakReference f51980B;
    /* renamed from: C */
    private final Context f51981C;

    public AnonymousClass4FV(AnonymousClass5SC anonymousClass5SC) {
        this.f51980B = new WeakReference(anonymousClass5SC);
        this.f51981C = anonymousClass5SC.getContext().getApplicationContext();
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1285843128);
        Context context = this.f51981C;
        Toast.makeText(context, context.getString(C0164R.string.failed_delete_comment), 0).show();
        AnonymousClass5SC anonymousClass5SC = (AnonymousClass5SC) this.f51980B.get();
        if (anonymousClass5SC != null) {
            anonymousClass5SC.f63779J = null;
            if (anonymousClass5SC.getView() != null) {
                AnonymousClass4EI anonymousClass4EI = anonymousClass5SC.f63771B;
                anonymousClass4EI.f51756F.addAll(anonymousClass4EI.f51754D);
                anonymousClass4EI.f51754D.clear();
                AnonymousClass0rF.B(anonymousClass5SC.f63771B, 786768532);
                anonymousClass5SC.f63779J = null;
            }
        }
        AnonymousClass0cQ.H(this, 644068390, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1804854746);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, 1381488615);
        AnonymousClass5SC anonymousClass5SC = (AnonymousClass5SC) this.f51980B.get();
        if (anonymousClass5SC != null) {
            anonymousClass5SC.f63779J = null;
            if (anonymousClass5SC.getView() != null) {
                anonymousClass5SC.f63771B.f51754D.clear();
                AnonymousClass0rF.B(anonymousClass5SC.f63771B, 1454160994);
            }
        }
        AnonymousClass0cQ.H(this, 1084207094, I2);
        AnonymousClass0cQ.H(this, 1506635559, I);
    }
}
