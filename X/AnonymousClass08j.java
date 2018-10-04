package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONObject;

/* renamed from: X.08j */
public final class AnonymousClass08j {
    /* renamed from: B */
    public String f989B;
    /* renamed from: C */
    public String f990C;
    /* renamed from: D */
    public String f991D;

    public AnonymousClass08j() {
        String str = JsonProperty.USE_DEFAULT_NAME;
        this.f990C = str;
        this.f991D = str;
        this.f989B = str;
    }

    /* renamed from: B */
    public static AnonymousClass08j m534B(String str) {
        AnonymousClass08j anonymousClass08j = new AnonymousClass08j();
        if (str == null) {
            return anonymousClass08j;
        }
        JSONObject jSONObject = new JSONObject(str);
        anonymousClass08j.f990C = jSONObject.optString("pkg_name");
        anonymousClass08j.f991D = jSONObject.optString("token");
        anonymousClass08j.f989B = jSONObject.optString("error");
        return anonymousClass08j;
    }
}
