package X;

import com.facebook.AccessToken;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.19V */
public final class AnonymousClass19V {
    /* renamed from: B */
    public static AccessToken m9666B(JSONObject jSONObject) {
        if (jSONObject.getInt("version") > 1) {
            return null;
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        return new AccessToken(string, jSONObject.getString("application_id"), jSONObject.getString(MemoryDumpUploadJob.EXTRA_USER_ID), AnonymousClass19V.m9667C(jSONArray), AnonymousClass19V.m9667C(jSONArray2), AnonymousClass19W.valueOf(jSONObject.getString("source")), date, date2);
    }

    /* renamed from: C */
    private static Collection m9667C(JSONArray jSONArray) {
        Collection arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
