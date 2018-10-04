package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3pL */
public final class AnonymousClass3pL implements AnonymousClass0Ui {
    /* renamed from: B */
    public static final Object f44948B = new Object();
    /* renamed from: C */
    public static Queue f44949C;

    public final String sL() {
        return "video_player_list";
    }

    public final String tL() {
        return ".json";
    }

    /* renamed from: B */
    public static AnonymousClass3pL m20819B() {
        return ((Boolean) AnonymousClass0CC.Dj.G()).booleanValue() ? new AnonymousClass3pL() : null;
    }

    public final String HK() {
        JSONArray jSONArray = new JSONArray();
        while (!f44949C.isEmpty()) {
            try {
                String str;
                synchronized (f44948B) {
                    str = (String) f44949C.poll();
                }
                if (str != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TraceFieldType.VideoId, str);
                    jSONArray.put(jSONObject);
                }
            } catch (Throwable e) {
                AnonymousClass0Dc.G("VideoBugReporter", "Unable to create log", e);
            }
        }
        return jSONArray.toString();
    }
}
