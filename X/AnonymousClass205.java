package X;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import android.widget.ProgressBar;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: X.205 */
public final class AnonymousClass205 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2Sp f25159B;
    /* renamed from: C */
    private final AnonymousClass204 f25160C;

    public AnonymousClass205(AnonymousClass2Sp anonymousClass2Sp, AnonymousClass204 anonymousClass204) {
        this.f25159B = anonymousClass2Sp;
        this.f25160C = anonymousClass204;
    }

    public final void run() {
        if (this.f25159B.f30623B) {
            ConnectionResult connectionResult = this.f25160C.f25158C;
            if (connectionResult.A()) {
                this.f25159B.f21555B.startActivityForResult(GoogleApiActivity.B(this.f25159B.B(), connectionResult.f15966B, this.f25160C.f25157B, false), 1);
            } else if (this.f25159B.f30625D.C(connectionResult.f15967C)) {
                AnonymousClass1En.F(this.f25159B.B(), this.f25159B.f21555B, connectionResult.f15967C, 2, this.f25159B);
            } else if (connectionResult.f15967C == 18) {
                Context B = this.f25159B.B();
                OnCancelListener onCancelListener = this.f25159B;
                View progressBar = new ProgressBar(B, null, 16842874);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                Builder builder = new Builder(B);
                builder.setView(progressBar);
                builder.setMessage(AnonymousClass1Er.C(B, 18));
                builder.setPositiveButton(JsonProperty.USE_DEFAULT_NAME, null);
                Dialog create = builder.create();
                AnonymousClass1En.D(B, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
                AnonymousClass1En.C(this.f25159B.B().getApplicationContext(), new AnonymousClass206(this, create));
            } else {
                this.f25159B.mo3536I(connectionResult, this.f25160C.f25157B);
            }
        }
    }
}
