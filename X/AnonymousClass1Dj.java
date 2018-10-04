package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.1Dj */
public final class AnonymousClass1Dj {
    /* renamed from: B */
    public String f15714B;
    /* renamed from: C */
    public AnonymousClass1LE f15715C;
    /* renamed from: D */
    public String f15716D;
    /* renamed from: E */
    private AnonymousClass1Di f15717E;
    /* renamed from: F */
    private AnonymousClass0Cm f15718F;

    public AnonymousClass1Dj(AnonymousClass0Cm anonymousClass0Cm) {
        this.f15718F = anonymousClass0Cm;
    }

    public AnonymousClass1Dj(String str) {
        this.f15714B = str;
    }

    /* renamed from: A */
    public final AnonymousClass0Iu m10098A() {
        AnonymousClass0LH.m2928F(this.f15714B, "non-proxied graphql request must have facebook access token");
        AnonymousClass1Di anonymousClass1Di = this.f15717E;
        AnonymousClass0RB anonymousClass0RB = this.f15715C;
        String C = AnonymousClass0EH.m1373C();
        AnonymousClass17t anonymousClass17t = new AnonymousClass17t();
        anonymousClass17t.f14856H = "graphql";
        anonymousClass17t.f14850B = this.f15714B;
        anonymousClass17t = anonymousClass17t.m9511B("query_id", anonymousClass1Di.f15710D).m9511B("locale", C);
        anonymousClass17t.f14855G = anonymousClass0RB;
        if (anonymousClass1Di.f15711E != null) {
            anonymousClass17t.m9511B("query_params", anonymousClass1Di.f15711E);
        }
        if (anonymousClass1Di.f15708B) {
            anonymousClass17t.f14853E = AnonymousClass0Pu.f4247G;
        } else {
            anonymousClass17t.f14853E = AnonymousClass0Pu.GET;
        }
        if (anonymousClass1Di.f15713G) {
            anonymousClass17t.m9511B("strip_nulls", "true");
        }
        if (anonymousClass1Di.f15712F) {
            anonymousClass17t.m9511B("strip_defaults", "true");
        }
        return anonymousClass17t.m9512C();
    }

    /* renamed from: B */
    public final AnonymousClass0Iu m10099B(AnonymousClass1Dk anonymousClass1Dk) {
        AnonymousClass0LH.m2928F(this.f15718F, "User session required for proxied GraphQL call");
        AnonymousClass1Di anonymousClass1Di = this.f15717E;
        AnonymousClass0RB anonymousClass0RB = this.f15715C;
        AnonymousClass0Cm anonymousClass0Cm = this.f15718F;
        String C = AnonymousClass0EH.m1373C();
        String B = AnonymousClass0fz.m6576B(anonymousClass1Dk.f15722B);
        AnonymousClass0Qu H = AnonymousClass16y.m9454D(JsonProperty.USE_DEFAULT_NAME).m4077H(anonymousClass0RB.f17298B == AnonymousClass1LF.f17302C ? "query_id" : "doc_id", anonymousClass1Di.f15710D);
        String str = "vc_policy";
        String str2 = this.f15716D;
        if (str2 == null) {
            str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        H = H.m4077H(str, str2).m4077H("locale", C);
        if (anonymousClass1Di.f15711E != null) {
            H.m4077H("query_params", anonymousClass1Di.f15711E);
        }
        if (anonymousClass1Di.f15713G) {
            H.m4077H("strip_nulls", "true");
        }
        if (anonymousClass1Di.f15712F) {
            H.m4077H("strip_defaults", "true");
        }
        return new AnonymousClass0Iu(AnonymousClass0Xx.m5273B(new AnonymousClass1LH(this, anonymousClass0Cm, B, H)).m5276C(AnonymousClass0gO.f8154B).m5277D(anonymousClass0RB), "GraphQLApi", B);
    }

    /* renamed from: B */
    public static AnonymousClass1Dj m10096B(String str) {
        return new AnonymousClass1Dj(str);
    }

    /* renamed from: C */
    public static AnonymousClass1Dj m10097C(AnonymousClass0Cm anonymousClass0Cm) {
        return new AnonymousClass1Dj(anonymousClass0Cm);
    }

    /* renamed from: C */
    public final AnonymousClass1Dj m10100C(AnonymousClass1Di anonymousClass1Di) {
        this.f15717E = anonymousClass1Di;
        this.f15715C = new AnonymousClass1LE(anonymousClass1Di.f15709C);
        return this;
    }

    /* renamed from: D */
    public final AnonymousClass1Dj m10101D(AnonymousClass2CF anonymousClass2CF) {
        this.f15716D = anonymousClass2CF.A();
        return this;
    }
}
