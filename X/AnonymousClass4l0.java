package X;

import android.content.Context;
import android.widget.ListAdapter;
import com.facebook.C0164R;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.4l0 */
public final class AnonymousClass4l0 extends AnonymousClass0Rq implements AnonymousClass0VB, ListAdapter {
    /* renamed from: B */
    private final Context f56840B;
    /* renamed from: C */
    private final AnonymousClass5V6 f56841C;
    /* renamed from: D */
    private final AnonymousClass3iw f56842D;
    /* renamed from: E */
    private final String f56843E;
    /* renamed from: F */
    private final AnonymousClass3j4 f56844F;
    /* renamed from: G */
    private final AnonymousClass3j2 f56845G = new AnonymousClass3j2();
    /* renamed from: H */
    private final AnonymousClass3j3 f56846H = new AnonymousClass3j3();
    /* renamed from: I */
    private final String f56847I;
    /* renamed from: J */
    private final int f56848J;
    /* renamed from: K */
    private final AnonymousClass0Ci f56849K;
    /* renamed from: L */
    private final AnonymousClass4l9 f56850L;

    public AnonymousClass4l0(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass4l6 anonymousClass4l6, AnonymousClass0ES anonymousClass0ES, AnonymousClass5V6 anonymousClass5V6, DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.f56840B = context;
        this.f56843E = context.getString(C0164R.string.no_users_found);
        this.f56848J = AnonymousClass0Ca.C(context, C0164R.color.grey_5);
        this.f56847I = context.getString(C0164R.string.searching);
        this.f56849K = anonymousClass0Cm.B();
        this.f56850L = new AnonymousClass4l9(anonymousClass4l6, anonymousClass0ES, directPrivateStoryRecipientController);
        this.f56842D = new AnonymousClass3iw(context);
        this.f56844F = new AnonymousClass3j4(context, new AnonymousClass4kz(this));
        this.f56841C = anonymousClass5V6;
        D(new AnonymousClass0TB[]{this.f56850L, this.f56844F, this.f56842D});
    }

    public final void Pv(AnonymousClass3e1 anonymousClass3e1) {
        C();
        List<DirectShareTarget> list = ((AnonymousClass1St) anonymousClass3e1.uQ()).f18851B;
        if (!(anonymousClass3e1.LQ().isEmpty() || anonymousClass3e1.uX() || !list.isEmpty())) {
            A(this.f56843E, this.f56842D);
        }
        int i = 0;
        for (DirectShareTarget directShareTarget : list) {
            A(AnonymousClass4lA.m24995C(this.f56840B, directShareTarget, this.f56849K, 2, this.f56841C.f65139B.f65163R.I(directShareTarget), i, null, false), this.f56850L);
            i++;
        }
        if (anonymousClass3e1.uX()) {
            this.f56845G.m20498A(this.f56847I, this.f56848J);
            this.f56846H.f43664B = true;
            B(this.f56845G, this.f56846H, this.f56844F);
        }
        E();
    }
}
