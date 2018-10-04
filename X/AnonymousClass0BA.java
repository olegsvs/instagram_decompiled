package X;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

/* renamed from: X.0BA */
public final class AnonymousClass0BA extends AnonymousClass1iT {
    /* renamed from: B */
    private final Context f1343B;
    /* renamed from: C */
    private volatile AnonymousClass1iU f1344C = new AnonymousClass1iU(new JSONObject());

    public AnonymousClass0BA(Context context) {
        this.f1343B = context;
    }

    /* renamed from: D */
    public final void mo127D() {
        JSONObject jSONObject = new JSONObject();
        m12671C(jSONObject);
        this.f1344C = new AnonymousClass1iU(jSONObject);
    }

    /* renamed from: E */
    public final AnonymousClass1iU mo128E() {
        return this.f1344C;
    }

    /* renamed from: F */
    public final void mo129F() {
        this.f1343B.sendBroadcast(new Intent("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED").setPackage(this.f1343B.getPackageName()));
    }
}
