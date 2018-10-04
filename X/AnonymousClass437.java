package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.437 */
public final class AnonymousClass437 extends AnonymousClass3s4 {
    /* renamed from: B */
    public final Map f48950B = new HashMap();

    /* renamed from: A */
    public final String mo5118A(String str) {
        return (String) this.f48950B.get(str);
    }

    /* renamed from: B */
    public static Map mo5119B(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyMap();
        }
        Map hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.getString(str2));
            }
        } catch (Throwable e) {
            AnonymousClass0Gn.E("ig_ar_persistence", "Couldn't parse effect shared scope data", e);
        }
        return hashMap;
    }

    /* renamed from: B */
    public final boolean m22316B(String str) {
        this.f48950B.remove(str);
        return true;
    }

    /* renamed from: C */
    public final boolean mo5120C(String str, String str2) {
        this.f48950B.put(str, str2);
        return true;
    }
}
