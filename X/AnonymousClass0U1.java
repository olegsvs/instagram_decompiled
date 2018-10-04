package X;

import android.content.Context;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.0U1 */
public final class AnonymousClass0U1 implements AnonymousClass0U2 {
    /* renamed from: E */
    public static AnonymousClass0U3 f5328E = new AnonymousClass0XX();
    /* renamed from: B */
    public final Context f5329B;
    /* renamed from: C */
    public final AnonymousClass0Tw f5330C;
    /* renamed from: D */
    public final AnonymousClass0Cm f5331D;

    public AnonymousClass0U1(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tw anonymousClass0Tw) {
        this.f5329B = context;
        this.f5331D = anonymousClass0Cm;
        this.f5330C = anonymousClass0Tw;
    }

    /* renamed from: A */
    public final void m4675A(AnonymousClass0Tz anonymousClass0Tz, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        AnonymousClass0U0 anonymousClass0U0 = anonymousClass0Tz;
        List list = anonymousClass0U0.f5321D;
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        AnonymousClass0LH.m2924B(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) list.get(0);
        String str = anonymousClass0U0.f5319B;
        AnonymousClass0U1 anonymousClass0U1 = this;
        AnonymousClass0W7 D = AnonymousClass0Xa.m5252D(this.f5331D.m1037B(), this.f5330C, directThreadKey, anonymousClass0U0.mo1289F(), str, anonymousClass0U0.mo1288E());
        AnonymousClass0XZ anonymousClass0XZ2 = anonymousClass0XZ;
        if (D.f5887Q == AnonymousClass0VM.UPLOADED) {
            if (anonymousClass0U0.m4673C()) {
                AnonymousClass0V1.m4818G(anonymousClass0XZ2.m5248B(), AnonymousClass0Va.Unset, System.currentTimeMillis() - anonymousClass0U0.f5323B);
            } else {
                AnonymousClass0Gn.m1881H("DirectSendTextLinkLikeMessageMutationProcessor", "Trying to send message that is already uploaded.");
            }
            AnonymousClass0Xb.m5255B(this.f5331D, directThreadKey, D, D.f5885O, directThreadKey.f5871C, D.m5009K());
            anonymousClass0XZ2.m5249C(null);
            return;
        }
        AnonymousClass0Tw.m4598C(this.f5331D).m4645q(directThreadKey, D, AnonymousClass0VM.UPLOADING);
        AnonymousClass0NM anonymousClass0NM = new AnonymousClass0NM(D.f5908l);
        AnonymousClass0V1.m4815D(anonymousClass0db, AnonymousClass0Xf.m5259C(this.f5331D, directThreadKey, D, new AnonymousClass0Xc(anonymousClass0U1, anonymousClass0XZ2, anonymousClass0U0, directThreadKey, D, anonymousClass0NM)));
    }

    public final /* bridge */ /* synthetic */ void BV(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0VN anonymousClass0VN) {
        AnonymousClass0Xa.m5253E(this.f5329B, this.f5331D, this.f5330C, (AnonymousClass0Tz) anonymousClass0U0, anonymousClass0VN);
    }

    public final void CV(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0Tz anonymousClass0Tz = (AnonymousClass0Tz) anonymousClass0U0;
    }

    public final /* bridge */ /* synthetic */ void KMA(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        m4675A((AnonymousClass0Tz) anonymousClass0U0, anonymousClass0db, anonymousClass0XZ);
    }

    public final /* bridge */ /* synthetic */ boolean UC(AnonymousClass0U0 anonymousClass0U0) {
        return AnonymousClass0Xa.m5250B(this.f5331D.m1037B(), this.f5330C, (AnonymousClass0Tz) anonymousClass0U0);
    }

    public final /* bridge */ /* synthetic */ void mJA(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0Xa.m5254F(this.f5330C, (AnonymousClass0Tz) anonymousClass0U0);
    }
}
