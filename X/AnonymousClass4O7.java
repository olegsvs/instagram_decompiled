package X;

import android.content.Context;
import android.location.Location;
import android.media.ExifInterface;
import java.util.List;

/* renamed from: X.4O7 */
public final class AnonymousClass4O7 {
    /* renamed from: B */
    public static void m24077B(AnonymousClass0OA anonymousClass0OA, Context context) {
        Location lastLocation = AnonymousClass0JI.getInstance().getLastLocation();
        if (lastLocation != null) {
            Location location = null;
            if (anonymousClass0OA.gB == AnonymousClass0ON.PHOTO) {
                String str = anonymousClass0OA.qB;
                if (str != null) {
                    try {
                        location = AnonymousClass3He.m19263I(new ExifInterface(str));
                    } catch (Throwable e) {
                        AnonymousClass0Dc.C(AnonymousClass4O7.class, "Couldn't read file exif data", e);
                    }
                }
            } else if (anonymousClass0OA.gB == AnonymousClass0ON.VIDEO) {
                String str2;
                if (anonymousClass0OA.bC != null) {
                    str2 = anonymousClass0OA.bC.f17222S;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    location = AnonymousClass3He.m19260F(str2, context);
                }
            }
            AnonymousClass2Ey anonymousClass2Ey = new AnonymousClass2Ey();
            anonymousClass2Ey.f27949C = new AnonymousClass2Ez(lastLocation.getLatitude(), lastLocation.getLongitude());
            if (location != null) {
                anonymousClass2Ey.f27948B = new AnonymousClass2Ez(location.getLatitude(), location.getLongitude());
            }
            anonymousClass0OA.EB = new AnonymousClass2F0(anonymousClass2Ey);
            if (anonymousClass0OA.P() != null) {
                if (((List) anonymousClass0OA.P().get(AnonymousClass15c.LOCATION)).size() > 0) {
                    anonymousClass0OA.EC = lastLocation.getLatitude();
                    anonymousClass0OA.FC = lastLocation.getLongitude();
                    anonymousClass0OA.f3827o = lastLocation.getAltitude();
                    if (location != null) {
                        anonymousClass0OA.ZB = location.getLatitude();
                        anonymousClass0OA.aB = location.getLongitude();
                        anonymousClass0OA.f3828p = location.getLatitude();
                        anonymousClass0OA.f3829q = location.getLongitude();
                    }
                }
            }
        }
    }
}
