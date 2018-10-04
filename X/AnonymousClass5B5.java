package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.5B5 */
public final class AnonymousClass5B5 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Zx f60895B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2Fo f60896C;

    public AnonymousClass5B5(AnonymousClass5Zx anonymousClass5Zx, AnonymousClass2Fo anonymousClass2Fo) {
        this.f60895B = anonymousClass5Zx;
        this.f60896C = anonymousClass2Fo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0Ur anonymousClass0Ur = new AnonymousClass0Ur(this.f60895B.f66448B);
        anonymousClass0Ur.A(this.f60895B.f66448B.getResources().getString(C0164R.string.friends_sticker_deleting));
        anonymousClass0Ur.show();
        AnonymousClass0Cn anonymousClass0Cn = this.f60895B.f66450D;
        String str = this.f60896C.f28147B;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("friendships/friends_lists/");
        stringBuilder.append(str);
        stringBuilder.append("/delete/");
        str = stringBuilder.toString();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = str;
        AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass0Pv.class).N().H();
        H.f2849B = new AnonymousClass5B4(this, anonymousClass0Ur);
        AnonymousClass0Ix.D(H);
    }
}
