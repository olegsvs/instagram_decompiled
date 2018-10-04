package X;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3df */
public final class AnonymousClass3df {
    /* renamed from: B */
    public static AnonymousClass0Iu m20267B(AnonymousClass0Cm anonymousClass0Cm, String str, Location location, boolean z) {
        return AnonymousClass3df.m20268C(anonymousClass0Cm, str, location, 50, null, null, z);
    }

    /* renamed from: C */
    public static AnonymousClass0Iu m20268C(AnonymousClass0Cm anonymousClass0Cm, String str, Location location, int i, String str2, List list, boolean z) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "fbsearch/places/";
        String str3 = null;
        AnonymousClass0Pt D = anonymousClass0Pt.D("count", Integer.toString(i)).D("lat", location != null ? String.valueOf(location.getLatitude()) : null);
        String str4 = "lng";
        if (location != null) {
            str3 = String.valueOf(location.getLongitude());
        }
        D.D(str4, str3).D("timezone_offset", Long.toString(AnonymousClass0dw.J().longValue())).M(AnonymousClass3ds.class);
        if (str != null) {
            anonymousClass0Pt.D("query", str);
        }
        if (str2 != null) {
            anonymousClass0Pt.D("rank_token", str2);
        }
        if (list != null) {
            List arrayList = new ArrayList();
            for (AnonymousClass1KG anonymousClass1KG : list) {
                arrayList.add(anonymousClass1KG.f17167B);
            }
            anonymousClass0Pt.D("exclude_list", arrayList.toString());
        }
        if (z) {
            anonymousClass0Pt.E("exclude_events", true);
        }
        if (((Boolean) AnonymousClass0CC.yJ.H(anonymousClass0Cm)).booleanValue()) {
            anonymousClass0Pt.A();
        }
        return anonymousClass0Pt.H();
    }
}
