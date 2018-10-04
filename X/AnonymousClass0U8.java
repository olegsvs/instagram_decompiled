package X;

import android.content.Context;
import com.instagram.model.direct.DirectThreadKey;
import java.io.File;
import java.util.List;

/* renamed from: X.0U8 */
public final class AnonymousClass0U8 implements AnonymousClass0U2 {
    /* renamed from: E */
    public static final AnonymousClass0U3 f5362E = new AnonymousClass0YG();
    /* renamed from: B */
    public final Context f5363B;
    /* renamed from: C */
    public final AnonymousClass0Tw f5364C;
    /* renamed from: D */
    public final AnonymousClass0Cm f5365D;

    public AnonymousClass0U8(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tw anonymousClass0Tw) {
        this.f5363B = context;
        this.f5365D = anonymousClass0Cm;
        this.f5364C = anonymousClass0Tw;
    }

    /* renamed from: A */
    public final void m4699A(AnonymousClass0U7 anonymousClass0U7, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        AnonymousClass0U7 anonymousClass0U72 = anonymousClass0U7;
        List list = anonymousClass0U7.f5321D;
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        AnonymousClass0LH.m2924B(z);
        AnonymousClass0WE anonymousClass0WE = anonymousClass0U7.f5361B;
        AnonymousClass0XZ anonymousClass0XZ2 = anonymousClass0XZ;
        if (new File(anonymousClass0WE.f5940D == AnonymousClass0ON.VIDEO ? anonymousClass0WE.f5945I : anonymousClass0WE.f5942F).exists()) {
            DirectThreadKey directThreadKey = (DirectThreadKey) list.get(0);
            AnonymousClass0U8 anonymousClass0U8 = this;
            AnonymousClass0W7 D = AnonymousClass0Xa.m5252D(this.f5365D.m1037B(), this.f5364C, directThreadKey, anonymousClass0U7.mo1289F(), anonymousClass0U7.f5319B, anonymousClass0U7.f5361B);
            if (D.f5887Q == AnonymousClass0VM.UPLOADED) {
                if (anonymousClass0U7.m4673C()) {
                    AnonymousClass0Va anonymousClass0Va = AnonymousClass0Va.Unset;
                    AnonymousClass0V1.m4815D(anonymousClass0db, anonymousClass0Va);
                    AnonymousClass0V1.m4818G(anonymousClass0XZ.m5248B(), anonymousClass0Va, System.currentTimeMillis() - anonymousClass0U7.f5323B);
                } else {
                    AnonymousClass0Gn.m1881H("DirectSendMediaMessageMutationProcessor", "Trying to send message that is already uploaded.");
                }
                anonymousClass0XZ.m5249C(null);
                return;
            }
            AnonymousClass0Tw.m4598C(this.f5365D).m4645q(directThreadKey, D, AnonymousClass0VM.UPLOADING);
            AnonymousClass0V1.m4815D(anonymousClass0db, AnonymousClass0Xf.m5258B(this.f5365D, directThreadKey, D, new AnonymousClass0YH(anonymousClass0U8, directThreadKey, D, anonymousClass0XZ2, anonymousClass0U72)));
        } else {
            anonymousClass0XZ.m5249C(AnonymousClass0VN.f5709H);
        }
    }

    public final /* bridge */ /* synthetic */ void BV(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0VN anonymousClass0VN) {
        AnonymousClass0Xa.m5253E(this.f5363B, this.f5365D, this.f5364C, (AnonymousClass0U7) anonymousClass0U0, anonymousClass0VN);
    }

    public final void CV(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0U7 anonymousClass0U7 = (AnonymousClass0U7) anonymousClass0U0;
    }

    public final /* bridge */ /* synthetic */ void KMA(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        m4699A((AnonymousClass0U7) anonymousClass0U0, anonymousClass0db, anonymousClass0XZ);
    }

    public final /* bridge */ /* synthetic */ boolean UC(AnonymousClass0U0 anonymousClass0U0) {
        return AnonymousClass0Xa.m5250B(this.f5365D.m1037B(), this.f5364C, (AnonymousClass0U7) anonymousClass0U0);
    }

    public final /* bridge */ /* synthetic */ void mJA(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0Xa.m5254F(this.f5364C, (AnonymousClass0U7) anonymousClass0U0);
    }
}
