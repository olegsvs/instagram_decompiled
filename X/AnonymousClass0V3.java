package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.modal.ModalActivity;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.0V3 */
public final class AnonymousClass0V3 implements AnonymousClass0V4 {
    /* renamed from: B */
    private final Activity f5633B;
    /* renamed from: C */
    private final AnonymousClass0EE f5634C;
    /* renamed from: D */
    private final String f5635D;
    /* renamed from: E */
    private boolean f5636E;
    /* renamed from: F */
    private String f5637F;
    /* renamed from: G */
    private ArrayList f5638G;
    /* renamed from: H */
    private String f5639H;
    /* renamed from: I */
    private boolean f5640I;
    /* renamed from: J */
    private String f5641J;
    /* renamed from: K */
    private final AnonymousClass0Cm f5642K;
    /* renamed from: L */
    private String f5643L;

    public AnonymousClass0V3(Activity activity, AnonymousClass0Cm anonymousClass0Cm, String str, AnonymousClass0EE anonymousClass0EE) {
        this.f5633B = activity;
        this.f5642K = anonymousClass0Cm;
        this.f5635D = str;
        this.f5634C = anonymousClass0EE;
    }

    public final void DZ() {
        if (this.f5641J == null && AnonymousClass26g.B(r0.f5638G)) {
            AnonymousClass0Gn.m1881H("DirectThreadLauncherImpl", "No threadId or recipients set");
        }
        String str;
        String str2;
        String str3;
        if (!AnonymousClass0EF.m1358I(r0.f5633B) && AnonymousClass0EF.m1359J(r0.f5633B) && AnonymousClass0FZ.m1634B().m1634B()) {
            String uuid = UUID.randomUUID().toString();
            str = "direct_thread_toggle";
            AnonymousClass0V6.m4853B(r0.f5642K);
            AnonymousClass0V6.m4854C(r0.f5634C, r0.f5635D, str, uuid);
            Context context = r0.f5633B;
            String str4 = r0.f5642K.f1759C;
            String str5 = r0.f5641J;
            List list = r0.f5638G;
            str2 = r0.f5643L;
            String str6 = r0.f5635D;
            str3 = r0.f5636E ? "ds" : r0.f5640I ? "p" : null;
            if (!AnonymousClass1SX.m11483C(context, str4, str5, list, str2, uuid, str6, str3, r0.f5637F)) {
                AnonymousClass0V6.m4853B(r0.f5642K);
                AnonymousClass0V6.m4855D(r0.f5634C, r0.f5635D, str, uuid, "destination_app_not_started");
            }
        } else if (r0.f5636E) {
            Context context2 = r0.f5633B;
            str2 = r0.f5642K.f1759C;
            String str7 = r0.f5641J;
            r4 = r0.f5643L;
            str3 = r0.f5635D;
            Uri D = AnonymousClass0RW.m4198D("ig", str7, null, r4, "ds", null);
            Intent A = AnonymousClass0EM.f1972B.mo256A(context2, 335544320);
            AnonymousClass0RW.m4196B(context2, str2, null, null, str3, D, A);
            AnonymousClass0IW.m2243I(A, r0.f5633B);
        } else {
            String str8 = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            AnonymousClass0J9 N = AnonymousClass0J7.f2895B.mo532N();
            str = r0.f5641J;
            r4 = r0.f5643L;
            ArrayList arrayList = r0.f5638G;
            boolean z = r0.f5640I;
            str2 = r0.f5635D;
            AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(ModalActivity.class, str8, N.m2498C(str, r4, arrayList, z, 0, str2, r0.f5639H, r0.f5637F, AnonymousClass4lG.B(str2).f56888B), r0.f5633B, r0.f5642K.f1759C);
            anonymousClass0Sn.f5014C = r0.f5635D;
            anonymousClass0Sn.f5013B = ModalActivity.f5023D;
            anonymousClass0Sn.m4403B(r0.f5633B);
        }
    }

    public final AnonymousClass0V4 HQA(boolean z) {
        this.f5636E = z;
        return this;
    }

    public final AnonymousClass0V4 ISA(String str) {
        this.f5641J = str;
        return this;
    }

    public final AnonymousClass0V4 bQA(String str) {
        this.f5637F = str;
        return this;
    }

    public final AnonymousClass0V4 dRA(boolean z) {
        this.f5640I = z;
        return this;
    }

    public final AnonymousClass0V4 jSA(String str) {
        this.f5643L = str;
        return this;
    }

    public final AnonymousClass0V4 rQA(List list) {
        this.f5638G = list == null ? null : new ArrayList(list);
        return this;
    }
}
