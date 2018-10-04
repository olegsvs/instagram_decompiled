package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.1VK */
public final class AnonymousClass1VK implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0xG f19326B;

    public AnonymousClass1VK(AnonymousClass0xG anonymousClass0xG) {
        this.f19326B = anonymousClass0xG;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f19326B.f12503E[i].equals(AnonymousClass0xG.m8517B(this.f19326B, C0164R.string.remove_from_saves))) {
            this.f19326B.f12501C.rVA();
        } else if (this.f19326B.f12503E[i].equals(AnonymousClass0xG.m8517B(this.f19326B, C0164R.string.remove_from_collection))) {
            this.f19326B.f12501C.dJA();
        }
    }
}
