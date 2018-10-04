package X;

import android.app.Activity;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: X.5Op */
public final class AnonymousClass5Op {
    /* renamed from: B */
    public static void m26413B(Activity activity, AnonymousClass0MI anonymousClass0MI, List list, AnonymousClass0Qf anonymousClass0Qf, AnonymousClass0Cm anonymousClass0Cm, int i, HashMap hashMap) {
        if (anonymousClass0MI.Q()) {
            AnonymousClass0vA anonymousClass0vA = new AnonymousClass0vA(anonymousClass0MI.f3388U.K());
            anonymousClass0vA.f11974H = anonymousClass0Qf.A();
            AnonymousClass0vB.C(anonymousClass0vA, anonymousClass0Cm);
        }
        AnonymousClass1Q8 B = new AnonymousClass1Q8().B(list, anonymousClass0MI.getId(), anonymousClass0Cm);
        B.f18309M = anonymousClass0Qf;
        B.f18316T = UUID.randomUUID().toString();
        B.f18304H = i;
        B.f18303G = hashMap;
        AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(ModalActivity.class, "reel_viewer", B.A(), activity, anonymousClass0Cm.f1759C);
        anonymousClass0Sn.f5013B = ModalActivity.f5023D;
        anonymousClass0Sn.B(activity);
    }
}
