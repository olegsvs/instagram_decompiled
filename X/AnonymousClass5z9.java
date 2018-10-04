package X;

import android.content.Context;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5z9 */
public final class AnonymousClass5z9 extends AnonymousClass0Rq implements AnonymousClass0Rr {
    /* renamed from: B */
    public final boolean f70629B;
    /* renamed from: C */
    public final AnonymousClass3j3 f70630C = new AnonymousClass3j3();
    /* renamed from: D */
    public final List f70631D = new ArrayList();
    /* renamed from: E */
    private final AnonymousClass0qL f70632E;
    /* renamed from: F */
    private final AnonymousClass2Lm f70633F;
    /* renamed from: G */
    private final AnonymousClass5LD f70634G;
    /* renamed from: H */
    private final Map f70635H = new HashMap();
    /* renamed from: I */
    private final AnonymousClass5zA f70636I;
    /* renamed from: J */
    private final AnonymousClass3j4 f70637J;
    /* renamed from: K */
    private final AnonymousClass3j2 f70638K = new AnonymousClass3j2();
    /* renamed from: L */
    private final AnonymousClass0Cm f70639L;

    public AnonymousClass5z9(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5LD anonymousClass5LD, boolean z, AnonymousClass6F8 anonymousClass6F8) {
        this.f70639L = anonymousClass0Cm;
        this.f70632E = new AnonymousClass0qL(context);
        this.f70634G = anonymousClass5LD;
        this.f70633F = new AnonymousClass2Lm(context);
        this.f70636I = new AnonymousClass5zA(context, anonymousClass0Cm, anonymousClass6F8);
        this.f70638K.A(context.getString(C0164R.string.searching), AnonymousClass0Ca.C(context, C0164R.color.grey_5));
        this.f70637J = new AnonymousClass3j4(context, null);
        this.f70629B = z;
        D(new AnonymousClass0TB[]{this.f70632E, this.f70636I, this.f70633F, this.f70637J});
    }

    /* renamed from: B */
    public static void m28715B(AnonymousClass5z9 anonymousClass5z9) {
        anonymousClass5z9.C();
        anonymousClass5z9.f70635H.clear();
        if (!anonymousClass5z9.f70629B) {
            anonymousClass5z9.A(null, anonymousClass5z9.f70632E);
        }
        int i = 0;
        int i2 = 0;
        while (i < anonymousClass5z9.f70631D.size()) {
            AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) anonymousClass5z9.f70631D.get(i);
            if (anonymousClass0Ci.fB != null) {
                AnonymousClass0MI R = AnonymousClass0Jd.f2931B.R(anonymousClass5z9.f70639L, anonymousClass0Ci, anonymousClass0Ci.fB);
                if (R != null) {
                    anonymousClass5z9.f70635H.put(R.getId(), Integer.valueOf(i2));
                }
            }
            int i3 = i2 + 1;
            anonymousClass5z9.B(anonymousClass0Ci, Integer.valueOf(i2), anonymousClass5z9.f70636I);
            i++;
            i2 = i3;
        }
        AnonymousClass5LD anonymousClass5LD = anonymousClass5z9.f70634G;
        if (anonymousClass5LD != null && anonymousClass5LD.QV()) {
            anonymousClass5z9.A(anonymousClass5z9.f70634G, anonymousClass5z9.f70633F);
        } else if (anonymousClass5z9.f70630C.f43664B) {
            anonymousClass5z9.B(anonymousClass5z9.f70638K, anonymousClass5z9.f70630C, anonymousClass5z9.f70637J);
        }
        anonymousClass5z9.E();
    }

    /* renamed from: F */
    public final void m28716F(List list) {
        this.f70631D.clear();
        this.f70631D.addAll(list);
        AnonymousClass5z9.m28715B(this);
    }

    public final void UOA(int i) {
        this.f70632E.f10915C = i;
        AnonymousClass5z9.m28715B(this);
    }
}
