package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5Si */
public final class AnonymousClass5Si {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0eB f64109B;

    public AnonymousClass5Si(AnonymousClass0eB anonymousClass0eB) {
        this.f64109B = anonymousClass0eB;
    }

    /* renamed from: A */
    public final void m26773A(float f) {
        if (this.f64109B.f7598L.L()) {
            AnonymousClass38J anonymousClass38J = this.f64109B.f7598L.f38205D;
            if (anonymousClass38J != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("zoomAmount", (double) f);
                    AnonymousClass38J.B(anonymousClass38J, jSONObject);
                } catch (JSONException e) {
                    AnonymousClass0Gn.C("PlatformEventsController::fireZoomToPercentPlatformEvent", e.getMessage());
                }
            }
            return;
        }
        this.f64109B.f7596J.u((float) this.f64109B.TB, f);
        this.f64109B.f7610X = f;
    }
}
