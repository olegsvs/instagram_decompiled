package X;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzari;
import com.google.android.gms.internal.zzart;

/* renamed from: X.6CQ */
public final class AnonymousClass6CQ extends AnonymousClass5fc {
    /* renamed from: B */
    private /* synthetic */ CredentialRequest f72907B;

    public AnonymousClass6CQ(AnonymousClass6CP anonymousClass6CP, AnonymousClass1yt anonymousClass1yt, CredentialRequest credentialRequest) {
        this.f72907B = credentialRequest;
        super(anonymousClass1yt);
    }

    /* renamed from: J */
    public final /* synthetic */ AnonymousClass1yy m29430J(Status status) {
        return new AnonymousClass6CO(status, null);
    }

    /* renamed from: P */
    public final void mo6366P(Context context, zzart zzart) {
        zzart.dXA(new zzari(this), this.f72907B);
    }
}
