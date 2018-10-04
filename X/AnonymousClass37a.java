package X;

import android.content.Context;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: X.37a */
public final class AnonymousClass37a extends AnonymousClass0ay {
    /* renamed from: B */
    public AnonymousClass36n f38092B;
    /* renamed from: C */
    public Context f38093C;

    public AnonymousClass37a(Context context, AnonymousClass36n anonymousClass36n) {
        this.f38093C = context;
        this.f38092B = new AnonymousClass36n(anonymousClass36n);
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object m18632A(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        objArr = this.f38093C.getApplicationContext().getSharedPreferences("ig_mq_asset_prefs", 0);
        try {
            AnonymousClass36n anonymousClass36n = this.f38092B;
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            if (anonymousClass36n.f37925F != null) {
                createGenerator.writeFieldName("effect_config");
                AnonymousClass36p anonymousClass36p = anonymousClass36n.f37925F;
                createGenerator.writeStartObject();
                if (anonymousClass36p.f37942G != null) {
                    createGenerator.writeStringField("hyperzoom_id", anonymousClass36p.f37942G);
                }
                if (anonymousClass36p.f37937B != null) {
                    createGenerator.writeStringField("enhance_id", anonymousClass36p.f37937B);
                }
                if (anonymousClass36p.f37939D != null) {
                    createGenerator.writeStringField("smoothing_id", anonymousClass36p.f37939D);
                }
                if (anonymousClass36p.f37938C != null) {
                    createGenerator.writeStringField("sharpening_id", anonymousClass36p.f37938C);
                }
                if (anonymousClass36p.f37940E != null) {
                    createGenerator.writeStringField("portrait_id", anonymousClass36p.f37940E);
                }
                if (anonymousClass36p.f37941F != null) {
                    createGenerator.writeStringField("simple_effect_id", anonymousClass36p.f37941F);
                }
                createGenerator.writeEndObject();
            }
            if (anonymousClass36n.f37924E != null) {
                createGenerator.writeFieldName("face_models");
                AnonymousClass36u.m18568C(createGenerator, anonymousClass36n.f37924E, true);
            }
            if (anonymousClass36n.f37932M != null) {
                createGenerator.writeFieldName("new_face_models");
                AnonymousClass36u.m18568C(createGenerator, anonymousClass36n.f37932M, true);
            }
            if (anonymousClass36n.f37933N != null) {
                createGenerator.writeFieldName("new_segmentation_model");
                AnonymousClass36u.m18568C(createGenerator, anonymousClass36n.f37933N, true);
            }
            if (anonymousClass36n.f37926G != null) {
                createGenerator.writeFieldName("effects");
                createGenerator.writeStartArray();
                for (AnonymousClass36h anonymousClass36h : anonymousClass36n.f37926G) {
                    if (anonymousClass36h != null) {
                        AnonymousClass36m.m18545C(createGenerator, anonymousClass36h, true);
                    }
                }
                createGenerator.writeEndArray();
            }
            createGenerator.writeNumberField("last_face_models_fetch_time_ms", anonymousClass36n.f37930K);
            createGenerator.writeNumberField("last_segmentation_models_fetch_time_ms", anonymousClass36n.f37931L);
            createGenerator.writeNumberField("last_face_effects_fetch_time_ms", anonymousClass36n.f37929J);
            createGenerator.writeNumberField("last_world_tracker_fetch_time_ms", anonymousClass36n.f37936Q);
            createGenerator.writeNumberField("face_effect_version", anonymousClass36n.f37927H);
            createGenerator.writeEndObject();
            createGenerator.close();
            objArr.edit().putString("prefs_asset_snapshot_key", stringWriter.toString()).apply();
        } catch (Throwable e) {
            AnonymousClass0Dc.G("SaveAssetSnapshotTask", "IOException on saveAssetSnapshot", e);
        }
        return null;
    }
}
