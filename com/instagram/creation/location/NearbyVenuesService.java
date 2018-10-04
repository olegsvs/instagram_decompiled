package com.instagram.creation.location;

import X.AnonymousClass005;
import X.AnonymousClass09p;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Dc;
import X.AnonymousClass0F4;
import X.AnonymousClass0F6;
import X.AnonymousClass0GA;
import X.AnonymousClass0Ix;
import X.AnonymousClass3Ai;
import X.AnonymousClass4Wt;
import X.AnonymousClass4X7;
import X.AnonymousClass4XT;
import X.AnonymousClass4XV;
import X.AnonymousClass4XX;
import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import com.instagram.location.intf.LocationSignalPackage;
import java.util.ArrayList;
import java.util.List;

public class NearbyVenuesService extends AnonymousClass09p {
    /* renamed from: B */
    public static AnonymousClass4XT f54977B;
    /* renamed from: C */
    public static Location f54978C;
    /* renamed from: D */
    public static LocationSignalPackage f54979D;

    /* renamed from: C */
    public final void m24432C(Intent intent) {
        Location location = (Location) intent.getParcelableExtra("location");
        String stringExtra = intent.getStringExtra("requestId");
        Long valueOf = Long.valueOf(intent.getLongExtra("timestamp", -1));
        LocationSignalPackage locationSignalPackage = (LocationSignalPackage) intent.getParcelableExtra("signalPackage");
        if (location == null) {
            AnonymousClass0Dc.F("NearbyVenuesService", "Cannot query venues for null location");
            m24430E(null);
            return;
        }
        float distanceTo;
        LocationSignalPackage locationSignalPackage2;
        AnonymousClass0GA B;
        float f = Float.MAX_VALUE;
        if (location != null) {
            Location location2 = f54978C;
            if (location2 != null) {
                distanceTo = location.distanceTo(location2);
                if (!(locationSignalPackage == null || locationSignalPackage.pN() == null)) {
                    locationSignalPackage2 = f54979D;
                    if (!(locationSignalPackage2 == null || locationSignalPackage2.pN() == null)) {
                        f = locationSignalPackage.pN().distanceTo(f54979D.pN());
                    }
                }
                if (f54978C != null || r4 >= 20.0f || (locationSignalPackage != null && r5 >= 20.0f)) {
                    B = AnonymousClass4X7.m24427B(AnonymousClass0Ce.G(intent.getExtras()), null, stringExtra, location, locationSignalPackage, Long.valueOf(valueOf.longValue()));
                    B.f2849B = new AnonymousClass4XV(location, locationSignalPackage);
                    AnonymousClass0Ix.C(B);
                }
                m24430E(f54977B);
                return;
            }
        }
        distanceTo = Float.MAX_VALUE;
        locationSignalPackage2 = f54979D;
        f = locationSignalPackage.pN().distanceTo(f54979D.pN());
        if (f54978C != null) {
        }
        B = AnonymousClass4X7.m24427B(AnonymousClass0Ce.G(intent.getExtras()), null, stringExtra, location, locationSignalPackage, Long.valueOf(valueOf.longValue()));
        B.f2849B = new AnonymousClass4XV(location, locationSignalPackage);
        AnonymousClass0Ix.C(B);
    }

    /* renamed from: D */
    public static synchronized List m24429D(Location location) {
        synchronized (NearbyVenuesService.class) {
            if (f54977B == null || f54978C == null || location == null || location.distanceTo(f54978C) >= 20.0f) {
                return null;
            }
            List VN = f54977B.VN();
            return VN;
        }
    }

    /* renamed from: E */
    public static void m24430E(AnonymousClass4XT anonymousClass4XT) {
        AnonymousClass0F6 anonymousClass4XX;
        if (anonymousClass4XT != null) {
            anonymousClass4XX = new AnonymousClass4XX(anonymousClass4XT.f54973C, (ArrayList) anonymousClass4XT.VN());
        } else {
            anonymousClass4XX = new AnonymousClass4XX(null, null);
        }
        AnonymousClass0F4.f2058E.B(anonymousClass4XX);
    }

    /* renamed from: F */
    public static void m24431F(Activity activity, AnonymousClass0Cm anonymousClass0Cm, Location location, LocationSignalPackage locationSignalPackage, Long l) {
        String str = anonymousClass0Cm.f1759C;
        Class cls = NearbyVenuesService.class;
        Intent intent = new Intent(activity, cls);
        intent.putExtra("location", location);
        intent.putExtra("requestId", AnonymousClass4Wt.m24421C(str));
        intent.putExtra("signalPackage", locationSignalPackage);
        intent.putExtra("IgSessionManager.USER_ID", str);
        intent.putExtra("timestamp", l);
        AnonymousClass005.B(activity, cls, AnonymousClass3Ai.f38582E, intent);
    }
}
