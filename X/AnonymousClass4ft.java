package X;

import android.widget.Toast;
import com.facebook.C0164R;
import java.io.File;

/* renamed from: X.4ft */
public final class AnonymousClass4ft extends AnonymousClass0nF {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4fu f56186B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ur f56187C;

    public AnonymousClass4ft(AnonymousClass4fu anonymousClass4fu, AnonymousClass0Ur anonymousClass0Ur) {
        this.f56186B = anonymousClass4fu;
        this.f56187C = anonymousClass0Ur;
    }

    /* renamed from: A */
    public final void m24717A(Exception exception) {
        Toast.makeText(this.f56186B.f56188B.m24726V(), C0164R.string.something_went_wrong, 0).show();
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m24718B(Object obj) {
        File file = (File) obj;
        AnonymousClass5bQ anonymousClass5bQ = this.f56186B.f56188B.f56219B;
        String NO = this.f56186B.f56189C.NO();
        String absolutePath = file.getAbsolutePath();
        AnonymousClass0IL anonymousClass0IL = anonymousClass5bQ.f66939B;
        AnonymousClass5C4.B(anonymousClass0IL.f65382o, anonymousClass0IL.getActivity(), anonymousClass0IL.getContext(), "reel_reshare_direct_tap", NO, absolutePath, anonymousClass0IL.f65364W);
    }

    public final void onFinish() {
        this.f56187C.dismiss();
    }

    public final void onStart() {
        this.f56187C.show();
    }
}
