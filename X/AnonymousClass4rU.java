package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.4rU */
public final class AnonymousClass4rU extends AnonymousClass2JV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5bw f57915B;

    public AnonymousClass4rU(AnonymousClass5bw anonymousClass5bw, int i) {
        this.f57915B = anonymousClass5bw;
        super(i);
    }

    public final void onClick(View view) {
        Context context = this.f57915B.getContext();
        AnonymousClass0Cn anonymousClass0Cn = this.f57915B.f65945C;
        String str = AnonymousClass3Q6.f41064L;
        String string = this.f57915B.getString(C0164R.string.terms_of_use);
        AnonymousClass0EE anonymousClass0EE = this.f57915B;
        AnonymousClass0Ss.F(context, anonymousClass0Cn, str, string, anonymousClass0EE, anonymousClass0EE);
    }
}
