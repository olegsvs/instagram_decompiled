package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;

/* renamed from: X.0V7 */
public final class AnonymousClass0V7 {
    /* renamed from: B */
    public static Intent m4858B(Context context, int i) {
        i = AnonymousClass0EM.f1972B.mo256A(context, i);
        i.setData(new Builder().scheme("ig").authority("direct-inbox").build());
        return i;
    }
}
