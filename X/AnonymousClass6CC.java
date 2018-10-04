package X;

import android.os.Bundle;

/* renamed from: X.6CC */
public final class AnonymousClass6CC implements AnonymousClass5du {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5dx f72875B;
    /* renamed from: C */
    public final /* synthetic */ Bundle f72876C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass5dw f72877D;

    public AnonymousClass6CC(AnonymousClass5dx anonymousClass5dx, AnonymousClass5dw anonymousClass5dw, Bundle bundle) {
        this.f72875B = anonymousClass5dx;
        this.f72877D = anonymousClass5dw;
        this.f72876C = bundle;
    }

    public final void jl(Throwable th) {
        Bundle bundle = new Bundle();
        bundle.putString("failure_reason", "upload_batch_fail");
        bundle.putString("failure_message", th.getMessage());
        bundle.putInt("num_of_retries", this.f72877D.f67673E ^ 1);
        AnonymousClass5eL anonymousClass5eL = this.f72875B.f67683D;
        bundle = AnonymousClass5dx.m28166C(this.f72875B, bundle);
        for (AnonymousClass5eM Le : anonymousClass5eL.f67778C) {
            Le.Le(bundle);
        }
        if (this.f72877D.f67673E) {
            AnonymousClass5dx.m28165B(this.f72875B, this.f72877D, Boolean.valueOf(true));
            return;
        }
        AnonymousClass5dx anonymousClass5dx = this.f72875B;
        AnonymousClass5dw anonymousClass5dw = this.f72877D;
        anonymousClass5dw.f67673E = true;
        AnonymousClass5dx.m28169F(anonymousClass5dx, anonymousClass5dw);
    }

    public final /* bridge */ /* synthetic */ void vBA(Object obj, Bundle bundle) {
        AnonymousClass6DD anonymousClass6DD = (AnonymousClass6DD) obj;
        this.f72875B.f67690K.m28182A(this.f72877D.f67676H);
        this.f72876C.putLong("time_spent", System.currentTimeMillis() - this.f72875B.f67691L);
        if (bundle != null) {
            String str = "matched_contact";
            this.f72876C.putParcelable(str, bundle.getParcelable(str));
        }
        AnonymousClass5eL anonymousClass5eL = this.f72875B.f67683D;
        Bundle bundle2 = this.f72876C;
        for (AnonymousClass5eM Me : anonymousClass5eL.f67778C) {
            Me.Me(bundle2);
        }
        AnonymousClass5dx.m28165B(this.f72875B, this.f72877D, Boolean.valueOf(false));
    }
}
