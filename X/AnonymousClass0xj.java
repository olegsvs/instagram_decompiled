package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.0xj */
public final class AnonymousClass0xj implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0ws f12646B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0P7 f12647C;

    public AnonymousClass0xj(AnonymousClass0ws anonymousClass0ws, AnonymousClass0P7 anonymousClass0P7) {
        this.f12646B = anonymousClass0ws;
        this.f12647C = anonymousClass0P7;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12646B.Md(this.f12647C);
        dialogInterface.dismiss();
    }
}
