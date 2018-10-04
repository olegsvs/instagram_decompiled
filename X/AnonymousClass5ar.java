package X;

import android.content.Context;
import com.facebook.C0164R;
import java.util.Map;

/* renamed from: X.5ar */
public final class AnonymousClass5ar implements AnonymousClass0TV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Oo f66755B;
    /* renamed from: C */
    private AnonymousClass3AG f66756C;

    public AnonymousClass5ar(AnonymousClass5Oo anonymousClass5Oo, AnonymousClass3AG anonymousClass3AG) {
        this.f66755B = anonymousClass5Oo;
        this.f66756C = anonymousClass3AG;
    }

    public final void Zt(Map map) {
        if (AnonymousClass1Ba.B(AnonymousClass5Oo.f63013F, map) == AnonymousClass1Bb.GRANTED) {
            AnonymousClass2FI anonymousClass2FI = this.f66755B.f63016D;
            if (anonymousClass2FI != null) {
                anonymousClass2FI.A();
            }
            this.f66756C.B();
            return;
        }
        if (this.f66755B.f63016D == null) {
            AnonymousClass5Oo anonymousClass5Oo = this.f66755B;
            AnonymousClass5On anonymousClass5On = anonymousClass5Oo.f63017E;
            Context context = anonymousClass5On.f63012B.getContext();
            String H = AnonymousClass0G5.H(context, C0164R.attr.appName);
            AnonymousClass2FI E = new AnonymousClass2FI(anonymousClass5On.f63012B, C0164R.layout.permission_empty_state_view).H(context.getString(C0164R.string.camera_permission_rationale_title, new Object[]{H})).G(context.getString(C0164R.string.camera_permission_rationale_message, new Object[]{H})).E(C0164R.string.camera_permission_rationale_link);
            E.F(new AnonymousClass5Om(anonymousClass5On, this));
            anonymousClass5Oo.f63016D = E;
        }
        this.f66755B.f63016D.D(map);
    }
}
