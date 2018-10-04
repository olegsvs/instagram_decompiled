package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.3Bo */
public final class AnonymousClass3Bo implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3nZ f38885B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ok f38886C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Cm f38887D;

    public AnonymousClass3Bo(AnonymousClass0Ok anonymousClass0Ok, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3nZ anonymousClass3nZ) {
        this.f38886C = anonymousClass0Ok;
        this.f38887D = anonymousClass0Cm;
        this.f38885B = anonymousClass3nZ;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (AnonymousClass1fn.E(this.f38886C)) {
            AnonymousClass0Fr.AllowContactsSyncUpsellDeclined.C(AnonymousClass2Na.ALLOW_CONTACTS_SYNC_UPSELL).R();
            this.f38886C.hb(0);
        }
        AnonymousClass0Ix.D(AnonymousClass3nV.m20663D(this.f38887D));
        dialogInterface.dismiss();
        AnonymousClass0F4.f2058E.B(new AnonymousClass3Bv());
        AnonymousClass3nZ.m20670C(this.f38885B, "invite_import_contacts_dialog_dismiss");
    }
}
