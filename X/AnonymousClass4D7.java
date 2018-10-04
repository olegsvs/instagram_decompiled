package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.4D7 */
public final class AnonymousClass4D7 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4D8 f51526B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2W3 f51527C;
    /* renamed from: D */
    public final /* synthetic */ String f51528D;

    public AnonymousClass4D7(AnonymousClass4D8 anonymousClass4D8, String str, AnonymousClass2W3 anonymousClass2W3) {
        this.f51526B = anonymousClass4D8;
        this.f51528D = str;
        this.f51527C = anonymousClass2W3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass4D8 anonymousClass4D8 = this.f51526B;
        if (anonymousClass4D8.f51533E.containsKey(this.f51528D)) {
            String str = (String) this.f51526B.f51533E.get(this.f51528D);
            Object string = this.f51526B.getString(C0164R.string.page_is_already_linked_message, new Object[]{str});
            String string2 = this.f51526B.getString(C0164R.string.page_is_already_linked_title, new Object[]{str});
            AnonymousClass0P2 anonymousClass0P2 = new AnonymousClass0P2(this.f51526B.getContext());
            anonymousClass0P2.f3974H = string2;
            anonymousClass0P2.L(string).S(C0164R.string.ok, new AnonymousClass4D6(this)).A().show();
            AnonymousClass4D8.m23547C(this.f51526B, this.f51528D, string);
            return;
        }
        String str2 = this.f51527C.f31095I;
        string2 = this.f51527C.m16158B().f31080B;
        String B = AnonymousClass0a2.B(this.f51526B.f51538J);
        AnonymousClass0IP anonymousClass0IP = this.f51526B;
        AnonymousClass36Y.m18527B(str2, string2, B, anonymousClass0IP, anonymousClass0IP.f51538J, this.f51526B);
    }
}
