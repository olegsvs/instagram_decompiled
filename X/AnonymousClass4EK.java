package X;

import android.content.Context;
import com.facebook.C0164R;
import com.instagram.model.comments.ParcelableCommenterDetails;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4EK */
public final class AnonymousClass4EK extends AnonymousClass0Rq {
    /* renamed from: B */
    public final AnonymousClass4EL f51759B;
    /* renamed from: C */
    public final Set f51760C = new HashSet();
    /* renamed from: D */
    public final AnonymousClass3e5 f51761D;
    /* renamed from: E */
    public final AnonymousClass3e5 f51762E = new AnonymousClass41j();
    /* renamed from: F */
    public final Set f51763F = new HashSet();
    /* renamed from: G */
    public final Set f51764G = new HashSet();
    /* renamed from: H */
    public boolean f51765H = true;
    /* renamed from: I */
    public boolean f51766I;
    /* renamed from: J */
    public final AnonymousClass3j2 f51767J = new AnonymousClass3j2();
    /* renamed from: K */
    public final AnonymousClass3j3 f51768K = new AnonymousClass3j3();
    /* renamed from: L */
    public boolean f51769L;
    /* renamed from: M */
    public final Set f51770M = new HashSet();
    /* renamed from: N */
    public final AnonymousClass1BN f51771N;
    /* renamed from: O */
    public final AnonymousClass5EF f51772O = new AnonymousClass5EF();
    /* renamed from: P */
    private final AnonymousClass4EJ f51773P;
    /* renamed from: Q */
    private final Context f51774Q;
    /* renamed from: R */
    private final AnonymousClass3iw f51775R;
    /* renamed from: S */
    private final AnonymousClass3j4 f51776S;
    /* renamed from: T */
    private final Map f51777T = new HashMap();

    public AnonymousClass4EK(Context context, AnonymousClass0Cm anonymousClass0Cm, ArrayList arrayList, AnonymousClass5S1 anonymousClass5S1, AnonymousClass3e5 anonymousClass3e5) {
        this.f51774Q = context;
        this.f51771N = AnonymousClass1BN.C(anonymousClass0Cm);
        this.f51761D = anonymousClass3e5;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ParcelableCommenterDetails parcelableCommenterDetails = (ParcelableCommenterDetails) arrayList.get(i);
            Set set = this.f51760C;
            AnonymousClass0Ci anonymousClass0Ci = new AnonymousClass0Ci();
            anonymousClass0Ci.NB = new BigDecimal(parcelableCommenterDetails.f41605E.doubleValue()).toPlainString();
            anonymousClass0Ci.dB = Boolean.valueOf(parcelableCommenterDetails.f41604D);
            anonymousClass0Ci.qB = parcelableCommenterDetails.f41603C ? AnonymousClass0Lo.PrivacyStatusPrivate : AnonymousClass0Lo.PrivacyStatusPublic;
            anonymousClass0Ci.RC = parcelableCommenterDetails.f41608H;
            anonymousClass0Ci.f1757z = parcelableCommenterDetails.f41602B;
            anonymousClass0Ci.vB = parcelableCommenterDetails.f41607G;
            anonymousClass0Ci.uB = parcelableCommenterDetails.f41606F;
            set.add(new AnonymousClass1KI(anonymousClass0Ci));
        }
        this.f51775R = new AnonymousClass3iw(this.f51774Q);
        this.f51773P = new AnonymousClass4EJ(this.f51774Q);
        this.f51759B = new AnonymousClass4EL(this.f51774Q, anonymousClass0Cm, anonymousClass5S1);
        this.f51776S = new AnonymousClass3j4(this.f51774Q, anonymousClass5S1);
        D(new AnonymousClass0TB[]{this.f51775R, this.f51773P, this.f51759B, this.f51776S});
    }

    /* renamed from: B */
    public static AnonymousClass41g m23622B(AnonymousClass4EK anonymousClass4EK, String str) {
        AnonymousClass41g anonymousClass41g = (AnonymousClass41g) anonymousClass4EK.f51777T.get(str);
        if (anonymousClass41g != null) {
            return anonymousClass41g;
        }
        anonymousClass41g = new AnonymousClass41g();
        anonymousClass4EK.f51777T.put(str, anonymousClass41g);
        return anonymousClass41g;
    }

    /* renamed from: C */
    private void m23623C(Set set) {
        int i = 0;
        for (AnonymousClass1KI anonymousClass1KI : set) {
            AnonymousClass3du B = AnonymousClass4EK.m23622B(this, anonymousClass1KI.f17169B.getId());
            int i2 = i + 1;
            B.f42934B = i;
            B.f48516B = this.f51760C.contains(anonymousClass1KI);
            B(anonymousClass1KI.f17169B, B, this.f51759B);
            i = i2;
        }
    }

    /* renamed from: F */
    public final void m23624F() {
        C();
        if (this.f51765H) {
            if (this.f51760C.isEmpty()) {
                if (this.f51770M.isEmpty()) {
                    A(null, this.f51773P);
                }
            }
            m23623C(this.f51760C);
            m23623C(this.f51770M);
        } else {
            Object obj = (this.f51766I && this.f51772O.G()) ? 1 : null;
            if (obj != null) {
                A(this.f51774Q.getString(C0164R.string.no_users_found), this.f51775R);
            } else {
                AnonymousClass5EF anonymousClass5EF = this.f51772O;
                for (int i = 0; i < anonymousClass5EF.I(); i++) {
                    AnonymousClass1KI anonymousClass1KI = (AnonymousClass1KI) anonymousClass5EF.F(i);
                    AnonymousClass3du B = AnonymousClass4EK.m23622B(this, anonymousClass1KI.f17169B.getId());
                    B.f42934B = i;
                    B.f48516B = this.f51760C.contains(anonymousClass1KI);
                    B(anonymousClass1KI.f17169B, B, this.f51759B);
                }
            }
        }
        if (this.f51769L) {
            B(this.f51767J, this.f51768K, this.f51776S);
        }
        E();
    }
}
