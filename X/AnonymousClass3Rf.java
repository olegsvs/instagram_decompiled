package X;

import android.content.Context;
import android.os.Bundle;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.instagram.leadads.model.LeadAdsDisclaimerResponse;
import com.instagram.leadads.model.LeadAdsInputFieldResponse;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Rf */
public final class AnonymousClass3Rf {
    /* renamed from: B */
    public static void m19661B(Context context, AnonymousClass0Fz anonymousClass0Fz, Bundle bundle, AnonymousClass1Yx anonymousClass1Yx, ArrayList arrayList) {
        String string = bundle.getString("formID");
        String string2 = bundle.getString("adID");
        String string3 = bundle.getString("trackingToken");
        List parcelableArrayList = bundle.getParcelableArrayList("inputFieldResponse");
        AnonymousClass0Cm G = AnonymousClass0Ce.G(bundle);
        AnonymousClass3S5 anonymousClass3S5 = new AnonymousClass3S5(string2, string, string3, parcelableArrayList);
        anonymousClass3S5.f41339E = arrayList;
        AnonymousClass3Rh anonymousClass3Rh = new AnonymousClass3Rh(new AnonymousClass3Rg(new AnonymousClass3S6(anonymousClass3S5), G, anonymousClass1Yx));
        AnonymousClass3S6 anonymousClass3S6 = anonymousClass3Rh.f41263C;
        String str = JsonProperty.USE_DEFAULT_NAME;
        try {
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            if (anonymousClass3S6.f41343B != null) {
                createGenerator.writeFieldName("input");
                AnonymousClass3S5 anonymousClass3S52 = anonymousClass3S6.f41343B;
                createGenerator.writeStartObject();
                if (anonymousClass3S52.f41338D != null) {
                    createGenerator.writeStringField("client_mutation_id", anonymousClass3S52.f41338D);
                }
                if (anonymousClass3S52.f41337C != null) {
                    createGenerator.writeStringField("ad_id", anonymousClass3S52.f41337C);
                }
                if (anonymousClass3S52.f41336B != null) {
                    createGenerator.writeStringField("actor_id", anonymousClass3S52.f41336B);
                }
                if (anonymousClass3S52.f41340F != null) {
                    createGenerator.writeStringField("lead_gen_data_id", anonymousClass3S52.f41340F);
                }
                if (anonymousClass3S52.f41342H != null) {
                    createGenerator.writeStringField("ad_impression_client_token", anonymousClass3S52.f41342H);
                }
                if (anonymousClass3S52.f41341G != null) {
                    createGenerator.writeFieldName("fields_data");
                    createGenerator.writeStartArray();
                    for (LeadAdsInputFieldResponse leadAdsInputFieldResponse : anonymousClass3S52.f41341G) {
                        if (leadAdsInputFieldResponse != null) {
                            createGenerator.writeStartObject();
                            if (leadAdsInputFieldResponse.f41314C != null) {
                                createGenerator.writeStringField("field_key", leadAdsInputFieldResponse.f41314C);
                            }
                            if (leadAdsInputFieldResponse.f41313B != null) {
                                createGenerator.writeStringField("values", leadAdsInputFieldResponse.f41313B);
                            }
                            createGenerator.writeEndObject();
                        }
                    }
                    createGenerator.writeEndArray();
                }
                if (anonymousClass3S52.f41339E != null) {
                    createGenerator.writeFieldName("disclaimer_responses");
                    createGenerator.writeStartArray();
                    for (LeadAdsDisclaimerResponse leadAdsDisclaimerResponse : anonymousClass3S52.f41339E) {
                        if (leadAdsDisclaimerResponse != null) {
                            createGenerator.writeStartObject();
                            if (leadAdsDisclaimerResponse.f41311B != null) {
                                createGenerator.writeStringField("checkbox_key", leadAdsDisclaimerResponse.f41311B);
                            }
                            createGenerator.writeBooleanField("is_checked", leadAdsDisclaimerResponse.f41312C);
                            createGenerator.writeEndObject();
                        }
                    }
                    createGenerator.writeEndArray();
                }
                createGenerator.writeEndObject();
            }
            createGenerator.writeEndObject();
            createGenerator.close();
            str = stringWriter.toString();
        } catch (Throwable e) {
            AnonymousClass0Gn.L("Failed to serialize query param for lead form submission", e);
        }
        AnonymousClass0GA B = AnonymousClass1Dj.C(anonymousClass3Rh.f41264D).C(new AnonymousClass2BJ(str)).D(AnonymousClass2CF.LEAD_GEN).B(AnonymousClass1Dk.ADS);
        B.f2849B = new AnonymousClass3Rd(anonymousClass3Rh);
        AnonymousClass0Px.B(context, anonymousClass0Fz, B);
    }
}
