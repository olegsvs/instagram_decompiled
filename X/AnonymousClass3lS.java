package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.3lS */
public class AnonymousClass3lS extends AnonymousClass0Iw {
    /* renamed from: B */
    public final String f44171B;
    /* renamed from: C */
    public final AnonymousClass1Cm f44172C;
    /* renamed from: D */
    public final String f44173D;
    /* renamed from: E */
    public final AnonymousClass0Ci f44174E;
    /* renamed from: F */
    public final AnonymousClass0Cm f44175F;
    /* renamed from: G */
    private final Context f44176G;

    public AnonymousClass3lS(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, String str, AnonymousClass1Cm anonymousClass1Cm, String str2) {
        this.f44176G = context.getApplicationContext();
        this.f44175F = anonymousClass0Cm;
        this.f44174E = anonymousClass0Ci;
        this.f44173D = str;
        this.f44172C = anonymousClass1Cm;
        this.f44171B = str2;
    }

    public final void onFailInBackground(AnonymousClass0fq anonymousClass0fq) {
        int I = AnonymousClass0cQ.I(this, 646608192);
        if (this.f44172C == null) {
            AnonymousClass0x5.C(this.f44175F).E(this.f44174E);
        } else if (AnonymousClass2MC.UserActionFollow.m15205A().equals(this.f44173D) && this.f44174E.m()) {
            AnonymousClass0er.B(this.f44175F).S(this.f44172C);
        }
        String str = null;
        if (anonymousClass0fq.B()) {
            AnonymousClass3lT anonymousClass3lT = (AnonymousClass3lT) anonymousClass0fq.A();
            AnonymousClass2zE anonymousClass2zE = anonymousClass3lT.f44177B;
            if (anonymousClass2zE != null) {
                boolean z;
                AnonymousClass0Ci anonymousClass0Ci;
                String str2 = anonymousClass2zE.f36644E;
                if (!("age_gated_unknown".equalsIgnoreCase(str2) || "age_gated_underage".equalsIgnoreCase(str2))) {
                    if (!"age_gated_strict_restriction".equalsIgnoreCase(str2)) {
                        z = false;
                        if (Boolean.valueOf(z).booleanValue()) {
                            anonymousClass0Ci = this.f44174E;
                            AnonymousClass0F4.f2058E.B(new AnonymousClass0ko(anonymousClass0Ci, false, new AnonymousClass1h3(anonymousClass0Ci, anonymousClass2zE.f36645F, anonymousClass2zE.f36641B, anonymousClass2zE.f36642C, anonymousClass2zE.f36643D)));
                            AnonymousClass0kr.D(this.f44175F.f1759C, (AnonymousClass0Pn) anonymousClass0fq.A());
                        }
                    }
                }
                z = true;
                if (Boolean.valueOf(z).booleanValue()) {
                    anonymousClass0Ci = this.f44174E;
                    AnonymousClass0F4.f2058E.B(new AnonymousClass0ko(anonymousClass0Ci, false, new AnonymousClass1h3(anonymousClass0Ci, anonymousClass2zE.f36645F, anonymousClass2zE.f36641B, anonymousClass2zE.f36642C, anonymousClass2zE.f36643D)));
                    AnonymousClass0kr.D(this.f44175F.f1759C, (AnonymousClass0Pn) anonymousClass0fq.A());
                }
            }
            if (!((AnonymousClass3lT) anonymousClass0fq.A()).E()) {
                str = TextUtils.isEmpty(anonymousClass3lT.A()) ? "server_unknown" : anonymousClass3lT.A();
            }
            AnonymousClass0kr.D(this.f44175F.f1759C, (AnonymousClass0Pn) anonymousClass0fq.A());
        } else {
            str = AnonymousClass0MM.H(this.f44176G) ? "network_slow" : "network_unavailable";
        }
        if (str != null) {
            AnonymousClass0NN.B("follow_failure", new AnonymousClass3lR(this)).F("request_type", this.f44173D).F(MemoryDumpUploadJob.EXTRA_USER_ID, this.f44174E.getId()).F("type", str).R();
        }
        AnonymousClass0cQ.H(this, 519576172, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1728454387);
        AnonymousClass3lT anonymousClass3lT = (AnonymousClass3lT) obj;
        int I2 = AnonymousClass0cQ.I(this, 1360865800);
        AnonymousClass0x5.C(this.f44175F).H(this.f44174E, anonymousClass3lT.f44178C, this.f44173D);
        if (this.f44172C != null) {
            AnonymousClass0er.B(this.f44175F).S(this.f44172C);
        }
        AnonymousClass0cQ.H(this, 959314683, I2);
        AnonymousClass0cQ.H(this, 1246138539, I);
    }
}
