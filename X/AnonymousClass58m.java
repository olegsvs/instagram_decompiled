package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.58m */
public final class AnonymousClass58m implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0IJ f60512B;
    /* renamed from: C */
    public final /* synthetic */ String f60513C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass2Na f60514D;
    /* renamed from: E */
    public final /* synthetic */ String f60515E;
    /* renamed from: F */
    public final /* synthetic */ String f60516F;

    public AnonymousClass58m(AnonymousClass0IJ anonymousClass0IJ, String str, String str2, String str3, AnonymousClass2Na anonymousClass2Na) {
        this.f60512B = anonymousClass0IJ;
        this.f60516F = str;
        this.f60515E = str2;
        this.f60513C = str3;
        this.f60514D = anonymousClass2Na;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0IL anonymousClass0IL = this.f60512B;
        String str = this.f60516F;
        String str2 = this.f60515E;
        String str3 = this.f60513C;
        AnonymousClass2Na anonymousClass2Na = this.f60514D;
        Context context = anonymousClass0IL.getContext();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0G7.G());
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/vetted_phone_reg_login/";
        AnonymousClass0GA H = anonymousClass0Pt.D("token", str3).D("source", "vetted_phone_reg").D("device_id", AnonymousClass0Dt.B(context)).D("guid", AnonymousClass0Dt.f1941C.A(context)).D("uid", str2).D("adid", AnonymousClass1fi.J()).F("phone_id", AnonymousClass0N2.B().B()).M(AnonymousClass2aH.class).N().H();
        H.f2849B = new AnonymousClass40r(anonymousClass0IL, new AnonymousClass3TP(anonymousClass0IL.getActivity()), anonymousClass2Na, str, str3, anonymousClass0IL);
        AnonymousClass0Ix.D(H);
    }
}
