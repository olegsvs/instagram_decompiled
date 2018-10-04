package X;

import android.content.Context;
import com.facebook.C0164R;

/* renamed from: X.30u */
public final class AnonymousClass30u {
    /* renamed from: B */
    public final AnonymousClass30t f36875B;
    /* renamed from: C */
    private final Context f36876C;
    /* renamed from: D */
    private final AnonymousClass30s f36877D;

    public AnonymousClass30u(AnonymousClass30s anonymousClass30s, AnonymousClass30t anonymousClass30t, Context context) {
        this.f36877D = anonymousClass30s;
        this.f36875B = anonymousClass30t;
        this.f36876C = context;
    }

    /* renamed from: A */
    public final void m18199A(boolean z, AnonymousClass0P7 anonymousClass0P7) {
        if (this.f36877D.qO() == 100) {
            new AnonymousClass0P2(this.f36876C).V(C0164R.string.highlight_full_warning_dialog_title).L(this.f36876C.getResources().getString(z ? C0164R.string.highlight_full_warning_dialog_body_photo : C0164R.string.highlight_full_warning_dialog_body_video, new Object[]{Integer.valueOf(100)})).S(z ? C0164R.string.highlight_full_warning_dialog_primary_button_photo : C0164R.string.highlight_full_warning_dialog_primary_button_video, new AnonymousClass30r(this, anonymousClass0P7)).N(C0164R.string.cancel, null).A().show();
        } else {
            this.f36875B.Uh(anonymousClass0P7);
        }
    }
}
