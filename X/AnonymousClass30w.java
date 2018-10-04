package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.30w */
public final class AnonymousClass30w extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0oy f36878B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5pJ f36879C;

    public AnonymousClass30w(AnonymousClass0oy anonymousClass0oy, AnonymousClass5pJ anonymousClass5pJ) {
        this.f36878B = anonymousClass0oy;
        this.f36879C = anonymousClass5pJ;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 698180632);
        Toast.makeText(this.f36878B.f10446C, this.f36878B.f10446C.getResources().getString(C0164R.string.archive_highlight_failure), 0).show();
        AnonymousClass0cQ.H(this, 186416584, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -632071804);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -907205400);
        AnonymousClass5pJ anonymousClass5pJ = this.f36879C;
        if (anonymousClass5pJ != null) {
            AnonymousClass1fX.B(anonymousClass5pJ.f69213B, anonymousClass5pJ.f69214C);
        }
        Toast.makeText(this.f36878B.f10446C, this.f36878B.f10446C.getResources().getString(C0164R.string.archive_highlight_success), 0).show();
        AnonymousClass0cQ.H(this, 320321875, I2);
        AnonymousClass0cQ.H(this, 1260534705, I);
    }
}
