package X;

import android.os.Bundle;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.0Pw */
public final class AnonymousClass0Pw extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Pl f4248B;

    public AnonymousClass0Pw(AnonymousClass0Pl anonymousClass0Pl) {
        this.f4248B = anonymousClass0Pl;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, -839960154);
        this.f4248B.f4144F.onDismiss(null);
        Toast.makeText(this.f4248B.f4140B, C0164R.string.delete_replay_error, 0).show();
        AnonymousClass0cQ.m5858H(this, -735116887, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.m5859I(this, 212408693);
        Bundle bundle = new Bundle();
        bundle.putBoolean("isDeleting", true);
        this.f4248B.f4144F.setArguments(bundle);
        this.f4248B.f4144F.m10220D(this.f4248B.f4141C, "ReplayDeleteProgressDialog");
        AnonymousClass0cQ.m5858H(this, 1844413533, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 1934204855);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, 414859089);
        this.f4248B.f4144F.onDismiss(null);
        this.f4248B.f4145G.f3389V.f15172B.remove(this.f4248B.f4142D.f4131C);
        this.f4248B.f4145G.m3139e();
        AnonymousClass0cQ.m5858H(this, -1014103143, I2);
        AnonymousClass0cQ.m5858H(this, 1573287803, I);
    }
}
