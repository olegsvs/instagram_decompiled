package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.5vq */
public final class AnonymousClass5vq extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5w7 f70113B;
    /* renamed from: C */
    public final /* synthetic */ boolean f70114C;

    public AnonymousClass5vq(AnonymousClass5w7 anonymousClass5w7, boolean z) {
        this.f70113B = anonymousClass5w7;
        this.f70114C = z;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1093077703);
        Toast.makeText(this.f70113B.getContext(), C0164R.string.network_error, 0).show();
        AnonymousClass5w7.m28647D(this.f70113B);
        AnonymousClass0cQ.H(this, 1819082121, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1242387271);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, 938054510);
        if (this.f70114C) {
            AnonymousClass2Go.B("allow_resharing_to_stories_switched_on");
        } else {
            AnonymousClass2Go.B("allow_resharing_to_stories_switched_off");
        }
        this.f70113B.f70149J.B().MB = Boolean.valueOf(this.f70114C ^ 1);
        AnonymousClass0cQ.H(this, 223408088, I2);
        AnonymousClass0cQ.H(this, -1611792179, I);
    }
}
