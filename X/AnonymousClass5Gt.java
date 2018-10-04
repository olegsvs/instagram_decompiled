package X;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import java.util.List;

/* renamed from: X.5Gt */
public final class AnonymousClass5Gt {
    /* renamed from: B */
    public final FragmentActivity f61723B;
    /* renamed from: C */
    public final Context f61724C;
    /* renamed from: D */
    public final AnonymousClass0IU f61725D;

    public AnonymousClass5Gt(FragmentActivity fragmentActivity, Context context, AnonymousClass0IU anonymousClass0IU) {
        this.f61723B = fragmentActivity;
        this.f61724C = context;
        this.f61725D = anonymousClass0IU;
    }

    /* renamed from: A */
    public final void m26129A(List list, int i, AnonymousClass0Cm anonymousClass0Cm) {
        list.add(new AnonymousClass2bo(i, new AnonymousClass5Gs(this, anonymousClass0Cm)));
    }

    /* renamed from: B */
    public final void m26130B(List list, int i) {
        list.add(new AnonymousClass2bo(i, new AnonymousClass5Gr(this)));
    }
}
