package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;

/* renamed from: X.56i */
public final class AnonymousClass56i implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass56t f60183B;
    /* renamed from: C */
    public final /* synthetic */ boolean f60184C;
    /* renamed from: D */
    public final /* synthetic */ ArrayList f60185D;

    public AnonymousClass56i(AnonymousClass56t anonymousClass56t, ArrayList arrayList, boolean z) {
        this.f60183B = anonymousClass56t;
        this.f60185D = arrayList;
        this.f60184C = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass56t anonymousClass56t = this.f60183B;
        AnonymousClass0Fr.ContactPointPermissionPrepromptAllow.G(anonymousClass56t.IS(), anonymousClass56t.DM()).B("permissions_to_ask", AnonymousClass56t.m25747E(this.f60185D)).E();
        if (this.f60185D.contains("android.permission.READ_PHONE_STATE")) {
            AnonymousClass0FH.f2099C.f2100B.edit().putBoolean("requested_phone_permission_reg", true).apply();
        }
        if (this.f60185D.contains("android.permission.READ_CONTACTS") || this.f60185D.contains("android.permission.GET_ACCOUNTS")) {
            AnonymousClass0FH.f2099C.f2100B.edit().putBoolean("requested_contact_permission_reg", true).apply();
        }
        Activity activity = this.f60183B.getActivity();
        AnonymousClass0TV anonymousClass56h = new AnonymousClass56h(this);
        ArrayList arrayList = this.f60185D;
        AnonymousClass1Ba.H(activity, anonymousClass56h, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}
