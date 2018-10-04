package X;

import com.facebook.breakpad.BreakpadManager;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1QD */
public final class AnonymousClass1QD {
    /* renamed from: B */
    public AnonymousClass1QE f18334B;
    /* renamed from: C */
    private String f18335C;
    /* renamed from: D */
    private String f18336D;
    /* renamed from: E */
    private String f18337E;
    /* renamed from: F */
    private boolean f18338F;
    /* renamed from: G */
    private String f18339G;
    /* renamed from: H */
    private String f18340H;

    /* renamed from: A */
    public final String m11330A() {
        String str = this.f18339G;
        return str == null ? JsonProperty.USE_DEFAULT_NAME : str;
    }

    /* renamed from: B */
    public final void m11331B(String str, String str2) {
        if (!this.f18338F) {
            if (this.f18339G == null) {
                AnonymousClass0Gn.m1876C("AREngineServices::CameraARAnalyticsLogger::onLoggedRawEvent", "Log before product information is set.");
                return;
            }
            str = AnonymousClass0NN.m3291B(str, null);
            str.m3298F("camera_product_name", this.f18339G).m3298F("product_session_id", this.f18340H).m3298F("effect_id", this.f18335C).m3298F("effect_instance_id", this.f18336D).m3298F("effect_session_id", this.f18337E);
            if (str2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String str3 = (String) keys.next();
                        str.m3298F(str3, jSONObject.getString(str3));
                    }
                } catch (JSONException e) {
                    AnonymousClass0Gn.m1876C("AREngineServices::CameraARAnalyticsLogger::onLoggedRawEvent", e.getMessage());
                }
            }
            str.m3310R();
        }
    }

    /* renamed from: C */
    public final void m11332C(boolean z) {
        if (!this.f18338F) {
            if (z) {
                AnonymousClass0DE.m1113F();
                AnonymousClass0DE.m1118K("CAMERA_CORE_PRODUCT_NAME", this.f18339G);
                AnonymousClass0DE.m1113F();
                AnonymousClass0DE.m1118K("CAMERA_CORE_EFFECT_ID", this.f18335C);
                AnonymousClass0DE.m1113F();
                AnonymousClass0DE.m1118K("CAMERA_CORE_EFFECT_INSTANCE_ID", this.f18336D);
                if (BreakpadManager.isActive()) {
                    BreakpadManager.setCustomData("CAMERA_CORE_PRODUCT_NAME", this.f18339G, new Object[0]);
                    BreakpadManager.setCustomData("CAMERA_CORE_EFFECT_ID", this.f18335C, new Object[0]);
                    BreakpadManager.setCustomData("CAMERA_CORE_EFFECT_INSTANCE_ID", this.f18336D, new Object[0]);
                }
                m11331B("camera_ar_session", null);
                return;
            }
            AnonymousClass0DE.m1113F();
            AnonymousClass0DE.m1119L("CAMERA_CORE_PRODUCT_NAME");
            AnonymousClass0DE.m1113F();
            AnonymousClass0DE.m1119L("CAMERA_CORE_EFFECT_ID");
            AnonymousClass0DE.m1113F();
            AnonymousClass0DE.m1119L("CAMERA_CORE_EFFECT_INSTANCE_ID");
            if (BreakpadManager.isActive()) {
                BreakpadManager.removeCustomData("CAMERA_CORE_PRODUCT_NAME");
                BreakpadManager.removeCustomData("CAMERA_CORE_EFFECT_ID");
                BreakpadManager.removeCustomData("CAMERA_CORE_EFFECT_INSTANCE_ID");
            }
        }
    }

    /* renamed from: D */
    public final void m11333D(String str, String str2, String str3, boolean z, String str4) {
        this.f18338F = z;
        this.f18339G = str;
        this.f18335C = str2;
        this.f18336D = str3;
        this.f18337E = UUID.randomUUID().toString();
        this.f18340H = str4;
        AnonymousClass1QE anonymousClass1QE = this.f18334B;
        if (anonymousClass1QE != null) {
            anonymousClass1QE.oc(this.f18337E);
        }
    }
}
