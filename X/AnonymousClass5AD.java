package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.5AD */
public final class AnonymousClass5AD implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5AF f60747B;

    public AnonymousClass5AD(AnonymousClass5AF anonymousClass5AF) {
        this.f60747B = anonymousClass5AF;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = AnonymousClass5AF.m25900B(this.f60747B)[i];
        if (this.f60747B.f60753F.getString(C0164R.string.reel_settings_save_to_camera_roll).equals(obj)) {
            AnonymousClass5AB.m25889H(this.f60747B.f60752E, this.f60747B.f60749B, this.f60747B.f60750C, this.f60747B.f60751D, null);
        } else if (this.f60747B.f60753F.getString(C0164R.string.reel_settings_save_to_archive).equals(obj)) {
            String str = this.f60747B.f60752E.getId().split("_")[0];
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f60747B.f60754G);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = AnonymousClass0IE.E("media/%s/persist_reel_media/", new Object[]{str});
            AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass0Pv.class).N().H();
            H.f2849B = new AnonymousClass5AC(this);
            AnonymousClass114.E(this.f60747B.f60750C);
            AnonymousClass0Ix.B().schedule(H);
        }
    }
}
