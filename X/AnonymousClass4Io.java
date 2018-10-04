package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;
import java.io.File;

/* renamed from: X.4Io */
public final class AnonymousClass4Io implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Ip f52533B;

    public AnonymousClass4Io(AnonymousClass4Ip anonymousClass4Ip) {
        this.f52533B = anonymousClass4Ip;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1526429241);
        AnonymousClass0OA C = AnonymousClass4Iq.m23792C(this.f52533B.f52534B);
        if (C == null) {
            this.f52533B.f52534B.f52539E.onCancel();
        } else {
            if (C.bC != null) {
                if (new File(C.bC.f17222S).exists()) {
                    AnonymousClass2NY.m15348B().m15353B("edit_video");
                    C.f3795I = ((AnonymousClass0PI) this.f52533B.f52534B.getContext()).VK().m18966C();
                    this.f52533B.f52534B.f52539E.Kc(C);
                }
            }
            AnonymousClass0IG.F(C0164R.string.video_import_error);
            this.f52533B.f52534B.f52539E.onCancel();
        }
        AnonymousClass0cQ.L(this, -1306252121, M);
    }
}
