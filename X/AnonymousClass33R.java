package X;

import android.content.Context;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.33R */
public final class AnonymousClass33R extends AnonymousClass0Rq {
    /* renamed from: B */
    public final List f37378B = new ArrayList();
    /* renamed from: C */
    private final AnonymousClass33v f37379C;
    /* renamed from: D */
    private Context f37380D;
    /* renamed from: E */
    private final AnonymousClass3iw f37381E;

    public AnonymousClass33R(Context context, AnonymousClass4Cu anonymousClass4Cu) {
        this.f37380D = context;
        this.f37379C = new AnonymousClass33v(context, anonymousClass4Cu);
        this.f37381E = new AnonymousClass3iw(this.f37380D);
        D(new AnonymousClass0TB[]{this.f37379C, this.f37381E});
    }

    /* renamed from: B */
    public static void m18317B(AnonymousClass33R anonymousClass33R) {
        anonymousClass33R.C();
        for (AnonymousClass2Xd B : anonymousClass33R.f37378B) {
            anonymousClass33R.B(B, null, anonymousClass33R.f37379C);
        }
        anonymousClass33R.E();
    }

    /* renamed from: F */
    public final void m18318F() {
        C();
        A(this.f37380D.getString(C0164R.string.no_results_found), this.f37381E);
        E();
    }
}
