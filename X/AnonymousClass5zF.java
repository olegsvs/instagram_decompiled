package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.5zF */
public final class AnonymousClass5zF implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6F8 f70653B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ci f70654C;

    public AnonymousClass5zF(AnonymousClass6F8 anonymousClass6F8, AnonymousClass0Ci anonymousClass0Ci) {
        this.f70653B = anonymousClass6F8;
        this.f70654C = anonymousClass0Ci;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 2007085588);
        AnonymousClass6F8 anonymousClass6F8 = this.f70653B;
        AnonymousClass0Ci anonymousClass0Ci = this.f70654C;
        AnonymousClass5zL.m28719C("ig_school_school_surface_tap_overflow", anonymousClass6F8.f73269I).F(MemoryDumpUploadJob.EXTRA_USER_ID, anonymousClass0Ci.getId()).R();
        new AnonymousClass0P2(anonymousClass6F8.f73263C).H(anonymousClass0Ci.DQ()).L(anonymousClass0Ci.T()).T(anonymousClass6F8.f73263C.getString(C0164R.string.school_user_report_button_text), new AnonymousClass601(anonymousClass6F8, anonymousClass0Ci)).F(true).A().show();
        AnonymousClass0cQ.L(this, -1370583240, M);
    }
}
