package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.61F */
public final class AnonymousClass61F implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6FD f70970B;
    /* renamed from: C */
    public final /* synthetic */ boolean f70971C;
    /* renamed from: D */
    public final /* synthetic */ int f70972D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Ci f70973E;

    public AnonymousClass61F(AnonymousClass6FD anonymousClass6FD, AnonymousClass0Ci anonymousClass0Ci, boolean z, int i) {
        this.f70970B = anonymousClass6FD;
        this.f70973E = anonymousClass0Ci;
        this.f70971C = z;
        this.f70972D = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String id = this.f70973E.getId();
        if (this.f70970B.f73311B.m28780F(id)) {
            AnonymousClass6FD.m29616B(this.f70970B).mo5856b().A(this.f70973E, this.f70971C);
            AnonymousClass6FD.m29620F(this.f70970B, id, this.f70972D, this.f70971C);
        }
    }
}
