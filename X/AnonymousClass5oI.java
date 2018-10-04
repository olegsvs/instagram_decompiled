package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.5oI */
public final class AnonymousClass5oI implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5oJ f69085B;

    public AnonymousClass5oI(AnonymousClass5oJ anonymousClass5oJ) {
        this.f69085B = anonymousClass5oJ;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CharSequence[] B = AnonymousClass5oJ.m28466B(this.f69085B);
        if (B[i].equals(AnonymousClass5oJ.m28467C(this.f69085B, C0164R.string.call))) {
            this.f69085B.f69087C.J(this.f69085B.f69090F);
        } else if (B[i].equals(AnonymousClass5oJ.m28467C(this.f69085B, C0164R.string.text))) {
            this.f69085B.f69087C.K(this.f69085B.f69090F);
        } else if (B[i].equals(AnonymousClass5oJ.m28467C(this.f69085B, C0164R.string.email))) {
            this.f69085B.f69087C.I(this.f69085B.f69090F);
        } else if (B[i].equals(AnonymousClass5oJ.m28467C(this.f69085B, C0164R.string.directions))) {
            this.f69085B.f69087C.H(this.f69085B.f69090F, this.f69085B.f69088D.getContext(), "contact_option");
        } else if (B[i].equals(AnonymousClass5oJ.m28467C(this.f69085B, C0164R.string.book))) {
            this.f69085B.f69087C.G(this.f69085B.f69090F);
        }
    }
}
