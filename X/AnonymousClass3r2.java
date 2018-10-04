package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.3r2 */
public final class AnonymousClass3r2 implements AnonymousClass2gn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3r4 f45336B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3rL f45337C;
    /* renamed from: D */
    public final /* synthetic */ Handler f45338D;
    /* renamed from: E */
    public final /* synthetic */ boolean f45339E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass2hJ f45340F;
    /* renamed from: G */
    public final /* synthetic */ String f45341G;
    /* renamed from: H */
    public final /* synthetic */ List f45342H;
    /* renamed from: I */
    public final /* synthetic */ AnonymousClass2gn f45343I;

    public AnonymousClass3r2(AnonymousClass3r4 anonymousClass3r4, AnonymousClass2hJ anonymousClass2hJ, List list, AnonymousClass3rL anonymousClass3rL, AnonymousClass2gn anonymousClass2gn, Handler handler, String str, boolean z) {
        this.f45336B = anonymousClass3r4;
        this.f45340F = anonymousClass2hJ;
        this.f45342H = list;
        this.f45337C = anonymousClass3rL;
        this.f45343I = anonymousClass2gn;
        this.f45338D = handler;
        this.f45341G = str;
        this.f45339E = z;
    }

    public final void hl(Exception exception) {
        AnonymousClass3r4.m20905B(this.f45336B, this.f45342H, this.f45343I, this.f45338D, this.f45341G, this.f45339E, exception);
    }

    public final void uBA(Object obj) {
        AnonymousClass2gy anonymousClass2gy = (AnonymousClass2gy) obj;
        if (!(anonymousClass2gy == null || anonymousClass2gy.f32466B.isEmpty())) {
            AnonymousClass2hJ anonymousClass2hJ = this.f45340F;
            AnonymousClass2h7 anonymousClass2h7 = (AnonymousClass2h7) anonymousClass2gy.f32466B.get(0);
            synchronized (anonymousClass2hJ) {
                anonymousClass2hJ.f32543B = anonymousClass2h7;
            }
        }
        if (this.f45340F.m16922A(null, true)) {
            AnonymousClass3r4.m20906C(this.f45336B, this.f45342H, this.f45337C, this.f45343I, this.f45338D, this.f45341G, this.f45339E, obj != null, this.f45340F);
        }
    }
}
