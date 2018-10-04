package X;

import android.os.Bundle;

/* renamed from: X.6CD */
public final class AnonymousClass6CD implements AnonymousClass5du {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5dx f72878B;

    public AnonymousClass6CD(AnonymousClass5dx anonymousClass5dx) {
        this.f72878B = anonymousClass5dx;
    }

    public final void jl(Throwable th) {
        this.f72878B.f67686G = false;
        Bundle bundle = new Bundle();
        bundle.putString("failure_reason", "close_session_fail");
        bundle.putString("failure_message", th.getMessage());
        AnonymousClass5eL anonymousClass5eL = this.f72878B.f67683D;
        bundle = AnonymousClass5dx.m28166C(this.f72878B, bundle);
        for (AnonymousClass5eM pg : anonymousClass5eL.f67778C) {
            pg.pg(bundle);
        }
    }

    public final /* bridge */ /* synthetic */ void vBA(Object obj, Bundle bundle) {
        if (((AnonymousClass6DE) obj) != null) {
            this.f72878B.f67682C.m29487D(System.currentTimeMillis());
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("full_upload", this.f72878B.f67685F);
            bundle2.putLong("last_upload_success_time", this.f72878B.f67682C.m29485B(0));
            bundle2.putLong("time_spent", System.currentTimeMillis() - this.f72878B.f67691L);
            bundle2.putInt("num_of_retries", this.f72878B.f67684E.f67736H);
            bundle2.putString("ccu_session_id", this.f72878B.f67689J);
            bundle2.putBoolean("in_sync", Boolean.valueOf(true).booleanValue());
            for (AnonymousClass5eM qg : this.f72878B.f67683D.f67778C) {
                qg.qg(bundle2);
            }
        }
        this.f72878B.f67686G = false;
    }
}
