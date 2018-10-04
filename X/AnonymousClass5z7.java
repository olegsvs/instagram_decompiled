package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.5z7 */
public final class AnonymousClass5z7 extends AnonymousClass0Rq {
    /* renamed from: B */
    public final AnonymousClass5z5 f70619B;
    /* renamed from: C */
    public final AnonymousClass5zj f70620C;
    /* renamed from: D */
    public final Comparator f70621D = new AnonymousClass5z6(this);
    /* renamed from: E */
    public final List f70622E = new ArrayList();

    public AnonymousClass5z7(Context context, AnonymousClass5zj anonymousClass5zj, AnonymousClass42K anonymousClass42K) {
        this.f70620C = anonymousClass5zj;
        this.f70619B = new AnonymousClass5z5(context, this.f70620C, anonymousClass42K);
        D(new AnonymousClass0TB[]{this.f70619B});
    }

    /* renamed from: F */
    public final void m28714F(List list) {
        this.f70622E.clear();
        this.f70622E.addAll(list);
        Collections.sort(this.f70622E, this.f70621D);
        C();
        for (AnonymousClass0Ci B : this.f70622E) {
            B(B, null, this.f70619B);
        }
        E();
    }
}
