package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;

/* renamed from: X.4rV */
public final class AnonymousClass4rV extends AnonymousClass2JV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5bw f57916B;

    public AnonymousClass4rV(AnonymousClass5bw anonymousClass5bw, int i) {
        this.f57916B = anonymousClass5bw;
        super(i);
    }

    public final void onClick(View view) {
        Context context = this.f57916B.getContext();
        AnonymousClass0Cn anonymousClass0Cn = this.f57916B.f65945C;
        String str = AnonymousClass3Q6.f41055C;
        String string = this.f57916B.getString(C0164R.string.data_policy_rw);
        AnonymousClass0EE anonymousClass0EE = this.f57916B;
        AnonymousClass0Ss.F(context, anonymousClass0Cn, str, string, anonymousClass0EE, anonymousClass0EE);
    }
}
