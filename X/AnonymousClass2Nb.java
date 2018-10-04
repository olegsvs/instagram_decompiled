package X;

import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2Nb */
public final class AnonymousClass2Nb extends AnonymousClass0Iw {
    /* renamed from: B */
    public final AnonymousClass0Cm f29797B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1IE f29798C;
    /* renamed from: D */
    private final String f29799D;
    /* renamed from: E */
    private final String f29800E;

    public AnonymousClass2Nb(AnonymousClass1IE anonymousClass1IE, String str, AnonymousClass0Cm anonymousClass0Cm, String str2) {
        this.f29798C = anonymousClass1IE;
        this.f29800E = str;
        this.f29797B = anonymousClass0Cm;
        this.f29799D = str2;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1821731463);
        String str = JsonProperty.USE_DEFAULT_NAME;
        if (anonymousClass0Q6.B()) {
            str = ((AnonymousClass2Ne) anonymousClass0Q6.f4288C).A();
        } else if (anonymousClass0Q6.A()) {
            str = anonymousClass0Q6.f4287B.toString();
        }
        AnonymousClass0NN.B("ig_zero_token_fetch_failed", null).F("error_message", str).B(TraceFieldType.RetryCount, this.f29798C.f16855B).R();
        this.f29798C.f16856C.set(false);
        if (this.f29798C.f16855B < 1) {
            AnonymousClass1IE anonymousClass1IE = this.f29798C;
            anonymousClass1IE.f16855B++;
            this.f29798C.A(this.f29800E, this.f29797B, this.f29799D);
        } else {
            this.f29798C.f16855B = 0;
        }
        AnonymousClass0cQ.H(this, -635948403, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        Object obj2 = obj;
        int I = AnonymousClass0cQ.I(this, 127955381);
        AnonymousClass2Ne anonymousClass2Ne = (AnonymousClass2Ne) obj2;
        int I2 = AnonymousClass0cQ.I(this, -1730989319);
        AnonymousClass2Nd anonymousClass2Nd = anonymousClass2Ne.f29812B;
        String str = anonymousClass2Nd.f29809H;
        String str2 = anonymousClass2Nd.f29804C;
        String str3 = anonymousClass2Nd.f29806E;
        List<AnonymousClass2Nc> unmodifiableList = Collections.unmodifiableList(anonymousClass2Nd.f29808G);
        List arrayList = new ArrayList();
        for (AnonymousClass2Nc anonymousClass2Nc : unmodifiableList) {
            try {
                arrayList.add(new AnonymousClass0ga(anonymousClass2Nc.f29801B, anonymousClass2Nc.f29802C));
            } catch (Throwable e) {
                String str4 = "IgZeroTokenFetcher";
                AnonymousClass0Gn.C(str4, "Invalid zero rating rewrite rule");
                AnonymousClass0Dc.I(str4, e, "Invalid rewrite rule", new Object[0]);
            }
        }
        AnonymousClass0gb anonymousClass0gb = new AnonymousClass0gb(str, str2, str3, arrayList, Collections.emptyList(), new HashSet(Collections.unmodifiableSet(anonymousClass2Nd.f29807F)), null, anonymousClass2Nd.f29810I, System.currentTimeMillis(), anonymousClass2Nd.f29803B, new HashSet(Collections.unmodifiableSet(anonymousClass2Nd.f29811J)), anonymousClass2Nd.f29805D);
        try {
            r5.f29798C.f16855B = 0;
            AnonymousClass0gV.B(r5.f29797B).WWA(anonymousClass0gb);
            String str5 = anonymousClass0gb.f8201E;
            AnonymousClass0NN.B("ig_zero_token_fetch_success", null).F("carrier_name", str5).B("carrier_id", anonymousClass0gb.f8200D).R();
            AnonymousClass0cQ.H(r5, 549330914, I);
        } finally {
            r5.f29798C.f16856C.set(false);
            AnonymousClass0cQ.H(r5, 1535742402, I2);
        }
    }
}
