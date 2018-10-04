package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.3Bn */
public final class AnonymousClass3Bn implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3nZ f38882B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3yb f38883C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ok f38884D;

    public AnonymousClass3Bn(AnonymousClass0Ok anonymousClass0Ok, AnonymousClass3yb anonymousClass3yb, AnonymousClass3nZ anonymousClass3nZ) {
        this.f38884D = anonymousClass0Ok;
        this.f38883C = anonymousClass3yb;
        this.f38882B = anonymousClass3nZ;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (AnonymousClass1fn.E(this.f38884D)) {
            AnonymousClass0Fr.AllowContactsSyncUpsellAccepted.C(AnonymousClass2Na.ALLOW_CONTACTS_SYNC_UPSELL).R();
        }
        dialogInterface.dismiss();
        this.f38883C.m21810A(true);
        AnonymousClass0F4.f2058E.B(new AnonymousClass3Bv());
        AnonymousClass3nZ.m20670C(this.f38882B, "invite_import_contacts_dialog_agree");
    }
}
