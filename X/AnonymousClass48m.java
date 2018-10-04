package X;

import android.widget.Toast;
import com.facebook.C0164R;
import com.instagram.archive.fragment.ArchiveReelFragment;

/* renamed from: X.48m */
public final class AnonymousClass48m extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass48n f50787B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ur f50788C;

    public AnonymousClass48m(AnonymousClass48n anonymousClass48n, AnonymousClass0Ur anonymousClass0Ur) {
        this.f50787B = anonymousClass48n;
        this.f50788C = anonymousClass0Ur;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 784851861);
        Toast.makeText(this.f50787B.f50789B.getContext(), C0164R.string.error, 0).show();
        AnonymousClass0cQ.H(this, 337374743, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1532009270);
        this.f50788C.dismiss();
        ArchiveReelFragment.m23412B(this.f50787B.f50789B);
        ArchiveReelFragment.m23416F(this.f50787B.f50789B);
        AnonymousClass0cQ.H(this, 205300346, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -283007190);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -2073535689);
        Toast.makeText(this.f50787B.f50789B.getContext(), C0164R.string.stories_archive_enable_toast, 0).show();
        AnonymousClass0cQ.H(this, -573182513, I2);
        AnonymousClass0cQ.H(this, -1150200287, I);
    }
}
