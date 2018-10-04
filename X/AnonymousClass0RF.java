package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0RF */
public final class AnonymousClass0RF {
    /* renamed from: B */
    public static long f4617B;

    /* renamed from: B */
    public static void m4128B(int i, AnonymousClass0Pt anonymousClass0Pt) {
        Map B = AnonymousClass0RI.m4143B();
        Context context = AnonymousClass0EV.f1977B;
        AnonymousClass37r anonymousClass37r = new AnonymousClass37r(i);
        Map hashMap = new HashMap();
        Boolean bool = Boolean.TRUE;
        if (bool.equals(B.get("etc2_compression"))) {
            hashMap.put("compression", "etc2_compression");
        } else if (bool.equals(B.get("pvr_compression"))) {
            hashMap.put("compression", "pvr_compression");
        }
        hashMap.put("gyroscope", AnonymousClass1vp.B(context) ? "gyroscope_enabled" : "gyroscope_disabled");
        hashMap.put("supported_sdk_versions", TextUtils.join(",", Arrays.asList(AnonymousClass1vm.f24277B)));
        hashMap.put("world_tracker", ((Boolean) AnonymousClass0CC.xm.m845G()).booleanValue() ? "world_tracker_enabled" : "world_tracker_disabled");
        hashMap.put("segmentation", ((Boolean) AnonymousClass0CC.iD.m845G()).booleanValue() ? "segmentation_enabled" : "segmentation_disabled");
        hashMap.put("hand_tracking", "hand_tracking_disabled");
        hashMap.put("body_tracking", "body_tracking_disabled");
        hashMap.put("xray", "xray_disabled");
        hashMap.put("face_tracker_version", Integer.valueOf(anonymousClass37r.f38122B));
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        String join = TextUtils.join(",", Arrays.asList(AnonymousClass1vm.f24277B));
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            String str = "name";
            jSONObject.put(str, "SUPPORTED_SDK_VERSIONS");
            jSONObject.put("value", join);
            jSONArray.put(jSONObject);
            jSONObject = new JSONObject();
            jSONObject.put(str, "FACE_TRACKER_VERSION");
            jSONObject.put("value", String.valueOf(i));
            jSONArray.put(jSONObject);
            if ("segmentation_enabled".equals(unmodifiableMap.get("segmentation"))) {
                jSONObject = new JSONObject();
                jSONObject.put("name", "segmentation");
                jSONObject.put("value", "segmentation_enabled");
                jSONArray.put(jSONObject);
            }
            for (String str2 : B.keySet()) {
                jSONObject = new JSONObject();
                jSONObject.put("name", "COMPRESSION");
                jSONObject.put("value", str2.toUpperCase(Locale.US));
                jSONArray.put(jSONObject);
            }
            if ("world_tracker_enabled".equals(unmodifiableMap.get("world_tracker"))) {
                jSONObject = new JSONObject();
                jSONObject.put("name", "world_tracker");
                jSONObject.put("value", "world_tracker_enabled");
                jSONArray.put(jSONObject);
            }
            if ("gyroscope_enabled".equals(unmodifiableMap.get("gyroscope"))) {
                jSONObject = new JSONObject();
                jSONObject.put("name", "gyroscope");
                jSONObject.put("value", "gyroscope_enabled");
                jSONArray.put(jSONObject);
            }
            if (jSONArray != null) {
                anonymousClass0Pt.m3935D("supported_capabilities_new", jSONArray.toString());
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: C */
    public static void m4129C(AnonymousClass0Pt anonymousClass0Pt, AnonymousClass0Cm anonymousClass0Cm) {
        if (f4617B == 0) {
            f4617B = (long) ((Integer) AnonymousClass0E6.m1318D(AnonymousClass0CC.fD, anonymousClass0Cm)).intValue();
        }
        AnonymousClass0RF.m4128B((int) f4617B, anonymousClass0Pt);
    }
}
