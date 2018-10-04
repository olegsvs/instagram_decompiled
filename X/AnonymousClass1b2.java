package X;

import android.content.Context;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.DirectVisualMessageReplyViewModel;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1b2 */
public final class AnonymousClass1b2 {
    /* renamed from: B */
    public static DirectVisualMessageReplyViewModel m11965B(AnonymousClass0Ci anonymousClass0Ci, DirectShareTarget directShareTarget) {
        DirectShareTarget directShareTarget2 = directShareTarget;
        boolean D = directShareTarget.m4806D();
        List B = directShareTarget.m4804B();
        return new DirectVisualMessageReplyViewModel(directShareTarget2, directShareTarget.f5601B, B.isEmpty() ? anonymousClass0Ci.DQ() : ((PendingRecipient) B.get(0)).DQ(), D ? ((PendingRecipient) B.get(1)).DQ() : null, D, null);
    }

    /* renamed from: C */
    public static DirectVisualMessageReplyViewModel m11966C(Context context, AnonymousClass0Vw anonymousClass0Vw, String str, AnonymousClass0Cm anonymousClass0Cm) {
        return AnonymousClass1b2.m11967D(context, anonymousClass0Vw, str, anonymousClass0Cm, null);
    }

    /* renamed from: D */
    public static DirectVisualMessageReplyViewModel m11967D(Context context, AnonymousClass0Vw anonymousClass0Vw, String str, AnonymousClass0Cm anonymousClass0Cm, String str2) {
        AnonymousClass0Ci B = anonymousClass0Cm.m1037B();
        context = AnonymousClass0Vx.m4979D(context, anonymousClass0Vw, B);
        Collection B2 = PendingRecipient.m5175B(anonymousClass0Vw.m4938J());
        DirectShareTarget directShareTarget = new DirectShareTarget(B2, new DirectThreadKey(str, B2), context, anonymousClass0Vw.m4957c());
        anonymousClass0Cm = B2.size() > 1 ? true : null;
        if (B2.isEmpty()) {
            anonymousClass0Vw = B.DQ();
        } else {
            anonymousClass0Vw = ((PendingRecipient) B2.get(0)).DQ();
        }
        return new DirectVisualMessageReplyViewModel(directShareTarget, context, anonymousClass0Vw, anonymousClass0Cm != null ? ((PendingRecipient) B2.get(1)).DQ() : null, anonymousClass0Cm, str2);
    }
}
