package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.3bx */
public final class AnonymousClass3bx implements AnonymousClass13M {
    /* renamed from: B */
    public final /* synthetic */ Context f42685B;
    /* renamed from: C */
    public final /* synthetic */ String f42686C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass10M f42687D;
    /* renamed from: E */
    public final /* synthetic */ int f42688E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0hP f42689F;
    /* renamed from: G */
    public final /* synthetic */ List f42690G;
    /* renamed from: H */
    public final /* synthetic */ AnonymousClass0Cm f42691H;
    /* renamed from: I */
    public final /* synthetic */ AnonymousClass0ov f42692I;

    public AnonymousClass3bx(AnonymousClass0ov anonymousClass0ov, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0hP anonymousClass0hP, int i, List list, AnonymousClass10M anonymousClass10M, String str, Context context) {
        this.f42692I = anonymousClass0ov;
        this.f42691H = anonymousClass0Cm;
        this.f42689F = anonymousClass0hP;
        this.f42688E = i;
        this.f42690G = list;
        this.f42687D = anonymousClass10M;
        this.f42686C = str;
        this.f42685B = context;
    }

    public final void Dw(String str) {
        AnonymousClass3bx anonymousClass3bx = this;
        boolean H = this.f42692I.H();
        String str2 = str;
        if ((!H || AnonymousClass19v.B(this.f42691H, AnonymousClass19u.LIVE)) && (H || AnonymousClass19v.B(this.f42691H, AnonymousClass19u.STORY))) {
            int d;
            AnonymousClass0HV D = AnonymousClass0HV.D(this.f42691H);
            if (H) {
                d = D.d();
            } else {
                d = D.e();
            }
            str = AnonymousClass0gV.B(this.f42691H).ET();
            AnonymousClass19x.B(this.f42685B, this.f42692I.D(), Boolean.valueOf(this.f42692I.A()), new AnonymousClass3bw(anonymousClass3bx, H, D, d, str2), H ? AnonymousClass19u.LIVE : AnonymousClass19u.STORY, str);
            return;
        }
        this.f42689F.ov(str2, this.f42688E, this.f42690G, this.f42687D, this.f42686C);
    }

    public final void uv(String str) {
        this.f42689F.sv(str, this.f42688E, this.f42690G);
    }
}
