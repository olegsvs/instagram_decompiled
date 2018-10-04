package X;

import android.location.Location;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.37c */
public final class AnonymousClass37c {
    /* renamed from: B */
    public static AnonymousClass0Iu m18634B() {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "creatives/camera_models/";
        AnonymousClass0Pt M = anonymousClass0Pt.M(AnonymousClass37e.class);
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "world");
            jSONArray.put(jSONObject);
            M.D("model_request_blobs", jSONArray.toString());
            return M.N().H();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: C */
    public static AnonymousClass0Iu m18635C(List list, List list2) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "creatives/update_effect_seen_state/";
        AnonymousClass0Pt M = anonymousClass0Pt.M(AnonymousClass0Pv.class);
        String str = "[%s]";
        CharSequence charSequence = ",";
        M.D("viewed_effect_ids", StringFormatUtil.formatStrLocaleSafe(str, TextUtils.join(charSequence, list)));
        M.D("used_effect_ids", StringFormatUtil.formatStrLocaleSafe(str, TextUtils.join(charSequence, list2)));
        return M.N().H();
    }

    /* renamed from: D */
    public static AnonymousClass0Iu m18636D(int i, Location location, String str, String str2) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "creatives/face_effects/";
        AnonymousClass0Pt M = anonymousClass0Pt.M(AnonymousClass37o.class);
        if (str != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            M.D("add_effect_ids_to_tray", jSONArray.toString());
            if (str2 != null) {
                M.D("ch", str2);
            }
        }
        AnonymousClass0RF.B(i, M);
        if (location != null) {
            M.D("lat", String.valueOf(location.getLatitude())).D("lng", String.valueOf(location.getLongitude())).D("horizontalAccuracy", String.valueOf(location.getAccuracy()));
        }
        return M.N().H();
    }

    /* renamed from: E */
    public static AnonymousClass0Iu m18637E(int i) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "creatives/face_models/";
        AnonymousClass0Pt M = anonymousClass0Pt.M(AnonymousClass37g.class);
        M.D("aml_facetracker_model_version", String.valueOf(i));
        Integer.valueOf(i);
        return M.N().H();
    }

    /* renamed from: F */
    public static AnonymousClass0Iu m18638F(int i) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "creatives/segmentation_models/";
        AnonymousClass0Pt M = anonymousClass0Pt.M(AnonymousClass37g.class);
        M.D("segmentation_model_version", String.valueOf(i));
        return M.N().H();
    }
}
