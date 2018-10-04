package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5m6 */
public final class AnonymousClass5m6 extends AnonymousClass0Rq {
    /* renamed from: B */
    public final List f68852B = new ArrayList();
    /* renamed from: C */
    public final AnonymousClass5EC f68853C;
    /* renamed from: D */
    public boolean f68854D = false;
    /* renamed from: E */
    public final AnonymousClass2Lm f68855E;
    /* renamed from: F */
    public final AnonymousClass0Ro f68856F = new AnonymousClass5m5(this);
    /* renamed from: G */
    public String f68857G;
    /* renamed from: H */
    public final AnonymousClass5EE f68858H;
    /* renamed from: I */
    private final Map f68859I = new HashMap();

    public AnonymousClass5m6(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3eM anonymousClass3eM, AnonymousClass3e8 anonymousClass3e8) {
        this.f68858H = new AnonymousClass5EE(context, anonymousClass0Cm, anonymousClass3eM, false, null, false, null);
        this.f68853C = new AnonymousClass5EC(context, anonymousClass0Cm, anonymousClass3e8, false);
        this.f68855E = new AnonymousClass2Lm(context);
        D(new AnonymousClass0TB[]{this.f68858H, this.f68853C, this.f68855E});
    }

    /* renamed from: B */
    public static AnonymousClass3du m28411B(AnonymousClass5m6 anonymousClass5m6, String str) {
        AnonymousClass3du anonymousClass3du = (AnonymousClass3du) anonymousClass5m6.f68859I.get(str);
        if (anonymousClass3du != null) {
            return anonymousClass3du;
        }
        anonymousClass3du = new AnonymousClass3du();
        anonymousClass5m6.f68859I.put(str, anonymousClass3du);
        return anonymousClass3du;
    }
}
