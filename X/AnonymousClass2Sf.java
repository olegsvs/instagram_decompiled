package X;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.2Sf */
public abstract class AnonymousClass2Sf extends AnonymousClass1zW {
    /* renamed from: B */
    private int f30595B;
    /* renamed from: C */
    private Bundle f30596C;
    /* renamed from: D */
    private /* synthetic */ AnonymousClass1zS f30597D;

    public AnonymousClass2Sf(AnonymousClass1zS anonymousClass1zS, int i, Bundle bundle) {
        this.f30597D = anonymousClass1zS;
        super(anonymousClass1zS, Boolean.valueOf(true));
        this.f30595B = i;
        this.f30596C = bundle;
    }

    /* renamed from: C */
    public final /* synthetic */ void mo3055C(Object obj) {
        PendingIntent pendingIntent = null;
        if (((Boolean) obj) == null) {
            this.f30597D.m14092E(1, null);
            return;
        }
        int i = this.f30595B;
        if (i != 0) {
            if (i != 10) {
                this.f30597D.m14092E(1, null);
                Bundle bundle = this.f30596C;
                if (bundle != null) {
                    pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                }
                mo3523D(new ConnectionResult(this.f30595B, pendingIntent));
            } else {
                this.f30597D.m14092E(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
        } else if (!mo3524E()) {
            this.f30597D.m14092E(1, null);
            mo3523D(new ConnectionResult(8, null));
        }
    }

    /* renamed from: D */
    public abstract void mo3523D(ConnectionResult connectionResult);

    /* renamed from: E */
    public abstract boolean mo3524E();
}
