package X;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.model.business.BusinessInfo;

/* renamed from: X.33Z */
public final class AnonymousClass33Z {
    /* renamed from: B */
    public static AnonymousClass0db m18337B(String str, String str2, String str3, String str4, String str5) {
        return AnonymousClass0db.C().G("email", str3).G("phone", str2).G("address", str4).G("page_id", str).G("category_id", str5);
    }

    /* renamed from: C */
    public static AnonymousClass0NN m18338C(String str, String str2, String str3, String str4) {
        return AnonymousClass0wt.BUSINESS_CONVERSION_TAP_COMPONENT.A().F("step", str).F("entry_point", str2).F("fb_user_id", str4).F("component", str3);
    }

    /* renamed from: D */
    public static AnonymousClass0db m18339D(BusinessInfo businessInfo) {
        String str;
        String str2;
        String str3;
        String str4 = businessInfo.f27750J;
        if (str4 == null) {
            str4 = JsonProperty.USE_DEFAULT_NAME;
        }
        if (businessInfo.f27752L != null) {
            if (!TextUtils.isEmpty(businessInfo.f27752L.f27762D)) {
                str = businessInfo.f27752L.f27763E;
                str2 = str;
                if (str == null) {
                    str2 = JsonProperty.USE_DEFAULT_NAME;
                }
                if (businessInfo.f27742B != null) {
                    str3 = JsonProperty.USE_DEFAULT_NAME;
                } else {
                    str = businessInfo.f27742B.f27740E;
                    str3 = str;
                    if (str == null) {
                        str3 = JsonProperty.USE_DEFAULT_NAME;
                    }
                }
                return AnonymousClass0db.C().G("email", str4).G("phone", str2).G("address", str3).G("page_id", businessInfo.f27751K).G("category_id", businessInfo.f27749I);
            }
        }
        str2 = JsonProperty.USE_DEFAULT_NAME;
        if (businessInfo.f27742B != null) {
            str = businessInfo.f27742B.f27740E;
            str3 = str;
            if (str == null) {
                str3 = JsonProperty.USE_DEFAULT_NAME;
            }
        } else {
            str3 = JsonProperty.USE_DEFAULT_NAME;
        }
        return AnonymousClass0db.C().G("email", str4).G("phone", str2).G("address", str3).G("page_id", businessInfo.f27751K).G("category_id", businessInfo.f27749I);
    }

    /* renamed from: E */
    public static void m18340E(String str, String str2, AnonymousClass0db anonymousClass0db, String str3) {
        AnonymousClass0NN F = AnonymousClass0wt.BUSINESS_CONVERSION_CANCEL.A().F("step", str).F("entry_point", str2).F("fb_user_id", str3);
        if (anonymousClass0db != null) {
            F.D("default_values", anonymousClass0db);
        }
        F.R();
    }

    /* renamed from: F */
    public static void m18341F(String str, String str2, String str3, AnonymousClass0db anonymousClass0db, AnonymousClass0db anonymousClass0db2, AnonymousClass0db anonymousClass0db3, String str4) {
        AnonymousClass0NN A = AnonymousClass0wt.BUSINESS_CONVERSION_FETCH_DATA.A();
        AnonymousClass33Z.m18356U(A, str, str2, str3, anonymousClass0db, anonymousClass0db2, anonymousClass0db3, str4);
        A.R();
    }

    /* renamed from: G */
    public static void m18342G(String str, String str2, String str3, String str4, AnonymousClass0db anonymousClass0db, AnonymousClass0db anonymousClass0db2, AnonymousClass0db anonymousClass0db3, String str5) {
        AnonymousClass0NN A = AnonymousClass0wt.BUSINESS_CONVERSION_FETCH_DATA_ERROR.A();
        AnonymousClass33Z.m18356U(A, str, str2, str3, anonymousClass0db, anonymousClass0db2, anonymousClass0db3, str5);
        A.F("error_message", str4);
        A.R();
    }

    /* renamed from: H */
    public static void m18343H(String str, String str2, AnonymousClass0db anonymousClass0db, String str3) {
        AnonymousClass0NN F = AnonymousClass0wt.BUSINESS_CONVERSION_ENTER.A().F("step", str).F("fb_user_id", str3).F("entry_point", str2);
        if (anonymousClass0db != null) {
            F.D("default_values", anonymousClass0db);
        }
        F.R();
    }

    /* renamed from: I */
    public static void m18344I(String str, String str2, String str3, String str4) {
        AnonymousClass0wt.BUSINESS_CONVERSION_FETCH_DATA.A().F("step", str).F("entry_point", str2).F("fb_user_id", str4).F("error_message", str3).R();
    }

    /* renamed from: J */
    public static void m18345J(String str, String str2, AnonymousClass0db anonymousClass0db, String str3) {
        AnonymousClass0NN F = AnonymousClass0wt.BUSINESS_CONVERSION_FINISH_STEP.A().F("step", str).F("entry_point", str2).F("fb_user_id", str3);
        if (anonymousClass0db != null) {
            F.D("default_values", anonymousClass0db);
        }
        F.R();
    }

    /* renamed from: K */
    public static void m18346K(String str, String str2, String str3) {
        AnonymousClass0wt.BUSINESS_CONVERSION_FINISH_STEP.A().F("step", str).F("entry_point", str2).F("fb_user_id", str3).R();
    }

    /* renamed from: L */
    public static void m18347L(String str, String str2, String str3, String str4) {
        AnonymousClass0wt.BUSINESS_CONVERSION_FINISH_STEP.A().F("step", str).F("entry_point", str2).F("fb_user_id", str4).D("selected_values", AnonymousClass0db.C().G("city", str3)).R();
    }

    /* renamed from: M */
    public static void m18348M(AnonymousClass0wt anonymousClass0wt, String str, String str2, AnonymousClass0db anonymousClass0db, String str3) {
        anonymousClass0wt.A().F("entry_point", str).F("fb_user_id", str3).F("step", str2).D("selected_values", anonymousClass0db).R();
    }

    /* renamed from: N */
    public static void m18349N(String str, String str2, String str3, String str4) {
        AnonymousClass0db C = AnonymousClass0db.C();
        C.G("page_name", str2);
        C.G("sub_category", str3);
        AnonymousClass0wt.BUSINESS_CONVERSION_SUBMIT.A().F("entry_point", str).F("fb_user_id", str4).F("step", "create_page").D("selected_values", C).R();
    }

    /* renamed from: O */
    public static void m18350O(String str, String str2, String str3) {
        AnonymousClass0wt.BUSINESS_CONVERSION_SKIP.A().F("step", str).F("entry_point", str2).F("fb_user_id", str3).R();
    }

    /* renamed from: P */
    public static void m18351P(String str, String str2, AnonymousClass0db anonymousClass0db, String str3) {
        AnonymousClass0NN F = AnonymousClass0wt.BUSINESS_CONVERSION_START_STEP.A().F("step", str).F("entry_point", str2).F("fb_user_id", str3);
        if (anonymousClass0db != null) {
            F.D("default_values", anonymousClass0db);
        }
        F.R();
    }

    /* renamed from: Q */
    public static void m18352Q(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass0NN F = AnonymousClass0wt.BUSINESS_CONVERSION_SUBMIT_ERROR.A().F("step", str).F("entry_point", str2).F("fb_user_id", str5).F("error_message", str4);
        if (str3 != null) {
            F.F("error_identifier", str3);
        }
        F.R();
    }

    /* renamed from: R */
    public static void m18353R(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        AnonymousClass0NN A = AnonymousClass0wt.BUSINESS_CONVERSION_SUBMIT_ERROR.A();
        if (str10 != null) {
            A.F("component", str10);
        }
        A.F("entry_point", str).F("step", str2).F("fb_user_id", str11).F("error_message", str5).D("selected_values", AnonymousClass33Z.m18337B(str3, str6, str7, str8, str9)).F("error_identifier", str4).R();
    }

    /* renamed from: S */
    public static void m18354S(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass33Z.m18338C(str, str2, str3, str5).D("default_values", AnonymousClass0db.C().G("area_code", str4)).R();
    }

    /* renamed from: T */
    public static void m18355T(String str, String str2, String str3, String str4) {
        AnonymousClass0wt.BUSINESS_CONVERSION_TAP_COMPONENT.A().F("step", str2).F("entry_point", str).F("component", str3).F("fb_user_id", str4).R();
    }

    /* renamed from: U */
    private static void m18356U(AnonymousClass0NN anonymousClass0NN, String str, String str2, String str3, AnonymousClass0db anonymousClass0db, AnonymousClass0db anonymousClass0db2, AnonymousClass0db anonymousClass0db3, String str4) {
        anonymousClass0NN.F("entry_point", str).F("fb_user_id", str4).F("step", str2).F("component", str3);
        if (anonymousClass0db != null) {
            anonymousClass0NN.D("default_values", anonymousClass0db);
        }
        if (anonymousClass0db2 != null) {
            anonymousClass0NN.D("available_options", anonymousClass0db2);
        }
        if (anonymousClass0db3 != null) {
            anonymousClass0NN.D("selected_values", anonymousClass0db3);
        }
    }
}
