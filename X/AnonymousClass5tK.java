package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5tK */
public final class AnonymousClass5tK extends AnonymousClass0Rq implements AnonymousClass0ou, AnonymousClass1bW {
    /* renamed from: B */
    public final AnonymousClass2Lm f69674B;
    /* renamed from: C */
    public final AnonymousClass0Ro f69675C;
    /* renamed from: D */
    public final AnonymousClass2zt f69676D;
    /* renamed from: E */
    public final AnonymousClass5tI f69677E = new AnonymousClass5tI();
    /* renamed from: F */
    public final Map f69678F = new HashMap();
    /* renamed from: G */
    private final Map f69679G = new HashMap();

    public AnonymousClass5tK(Context context, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass302 anonymousClass302) {
        this.f69676D = new AnonymousClass2zt(context, 3, anonymousClass302, null);
        this.f69675C = anonymousClass0Ro;
        this.f69674B = new AnonymousClass2Lm(context);
        D(new AnonymousClass0TB[]{this.f69676D, this.f69674B});
    }

    /* renamed from: F */
    public final AnonymousClass1Vy m28596F(String str) {
        AnonymousClass1Vy anonymousClass1Vy = (AnonymousClass1Vy) this.f69679G.get(str);
        if (anonymousClass1Vy != null) {
            return anonymousClass1Vy;
        }
        anonymousClass1Vy = new AnonymousClass5tJ(this);
        this.f69679G.put(str, anonymousClass1Vy);
        return anonymousClass1Vy;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1Xu LO(String str) {
        return m28596F(str);
    }

    public final Object YQ(int i) {
        return getItem(i);
    }

    public final int qV(AnonymousClass0MI anonymousClass0MI) {
        return this.f69678F.containsKey(anonymousClass0MI.getId()) ? ((Integer) this.f69678F.get(anonymousClass0MI.getId())).intValue() : -1;
    }

    public final int rV(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Pj anonymousClass0Pj) {
        return qV(anonymousClass0MI);
    }
}
