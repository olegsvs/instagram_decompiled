package X;

import android.content.Context;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3x3 */
public final class AnonymousClass3x3 extends AnonymousClass0Rq implements AnonymousClass33y, AnonymousClass349 {
    /* renamed from: B */
    public AnonymousClass2W3 f47297B;
    /* renamed from: C */
    public boolean f47298C;
    /* renamed from: D */
    public AnonymousClass2W3 f47299D;
    /* renamed from: E */
    public boolean f47300E;
    /* renamed from: F */
    private final AnonymousClass33w f47301F;
    /* renamed from: G */
    private AnonymousClass33O f47302G;
    /* renamed from: H */
    private final AnonymousClass346 f47303H;
    /* renamed from: I */
    private final AnonymousClass347 f47304I;
    /* renamed from: J */
    private final AnonymousClass34B f47305J;
    /* renamed from: K */
    private final List f47306K;
    /* renamed from: L */
    private boolean f47307L;

    public AnonymousClass3x3(Context context, AnonymousClass33O anonymousClass33O) {
        this(context, anonymousClass33O, false, AnonymousClass3x3.m21669B(context), context.getString(C0164R.string.no_admin_pages_show));
    }

    public AnonymousClass3x3(Context context, AnonymousClass33O anonymousClass33O, boolean z, String str) {
        this(context, anonymousClass33O, z, str, context.getString(C0164R.string.no_admin_pages_show));
    }

    public AnonymousClass3x3(Context context, AnonymousClass33O anonymousClass33O, boolean z, String str, CharSequence charSequence) {
        this.f47306K = new ArrayList();
        this.f47302G = (AnonymousClass33O) AnonymousClass0LH.E(anonymousClass33O);
        this.f47305J = new AnonymousClass34B(context, this);
        this.f47303H = new AnonymousClass346(context, charSequence);
        this.f47304I = new AnonymousClass347(context, str);
        this.f47301F = new AnonymousClass33w(context, this);
        this.f47307L = z;
        D(new AnonymousClass0TB[]{this.f47304I, this.f47305J, this.f47301F, this.f47303H});
    }

    /* renamed from: B */
    public static String m21669B(Context context) {
        if (((Boolean) AnonymousClass0CC.gC.G()).booleanValue()) {
            return context.getResources().getString(C0164R.string.connect_to_fb_page_explain_ads_increase_connection);
        }
        return context.getResources().getString(C0164R.string.connect_to_fb_page_explain);
    }

    /* renamed from: C */
    public static void m21670C(AnonymousClass3x3 anonymousClass3x3) {
        Object obj;
        anonymousClass3x3.C();
        if (anonymousClass3x3.f47298C) {
            anonymousClass3x3.B(null, null, anonymousClass3x3.f47304I);
        }
        AnonymousClass2W3 anonymousClass2W3 = anonymousClass3x3.f47297B;
        if (anonymousClass2W3 == null) {
            obj = "0";
        } else {
            obj = anonymousClass2W3.f31095I;
        }
        for (AnonymousClass2W3 anonymousClass2W32 : anonymousClass3x3.f47306K) {
            anonymousClass3x3.B(anonymousClass2W32, Boolean.valueOf(anonymousClass2W32.f31095I.equals(obj)), anonymousClass3x3.f47305J);
        }
        if (anonymousClass3x3.f47307L) {
            anonymousClass3x3.B(null, null, anonymousClass3x3.f47301F);
        }
        if (!anonymousClass3x3.f47306K.isEmpty()) {
            anonymousClass3x3.B(null, null, anonymousClass3x3.f47303H);
        }
        anonymousClass3x3.E();
    }

    /* renamed from: F */
    public final void m21671F() {
        this.f47306K.clear();
        AnonymousClass3x3.m21670C(this);
    }

    /* renamed from: G */
    public final void m21672G(List list) {
        this.f47306K.clear();
        this.f47306K.addAll(list);
        if (list != null && !list.isEmpty()) {
            this.f47302G.vSA((AnonymousClass2W3) this.f47306K.get(0));
            AnonymousClass3x3.m21670C(this);
        }
    }

    /* renamed from: H */
    public final AnonymousClass2W3 m21673H(String str) {
        List<AnonymousClass2W3> list = this.f47306K;
        if (list != null) {
            for (AnonymousClass2W3 anonymousClass2W3 : list) {
                if (anonymousClass2W3.f31095I.equals(str)) {
                    this.f47299D = this.f47297B;
                    this.f47297B = anonymousClass2W3;
                    return anonymousClass2W3;
                }
            }
        }
        return null;
    }

    public final void Ht(AnonymousClass2W3 anonymousClass2W3) {
        if (!this.f47300E) {
            this.f47302G.Lt(anonymousClass2W3);
        }
    }

    public final void th() {
        this.f47302G.th();
    }
}
