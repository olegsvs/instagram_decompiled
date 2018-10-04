package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Qu */
public final class AnonymousClass2Qu extends AnonymousClass1uB {
    /* renamed from: B */
    public AnonymousClass1uZ f30375B;

    public AnonymousClass2Qu(AnonymousClass1uZ anonymousClass1uZ) {
        this.f30375B = anonymousClass1uZ;
    }

    /* renamed from: A */
    public final void mo2986A(String str) {
        try {
            this.f30375B.Th(new JSONObject(str));
        } catch (JSONException e) {
            this.f30375B.il(e);
        }
    }

    /* renamed from: B */
    public final void mo2987B(Exception exception, boolean z) {
        this.f30375B.il(exception);
    }
}
