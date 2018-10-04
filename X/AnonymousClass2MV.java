package X;

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import java.util.Date;

/* renamed from: X.2MV */
public final class AnonymousClass2MV {
    /* renamed from: B */
    private static final AnonymousClass2MU f29559B = new AnonymousClass2MU("'IMG'_yyyyMMdd_HHmmss");

    /* renamed from: B */
    public static String m15214B(long j) {
        String format;
        AnonymousClass2MU anonymousClass2MU = f29559B;
        synchronized (anonymousClass2MU) {
            format = anonymousClass2MU.f29556B.format(new Date(j));
            if (j / 1000 == anonymousClass2MU.f29557C / 1000) {
                anonymousClass2MU.f29558D++;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(format);
                stringBuilder.append("_");
                stringBuilder.append(anonymousClass2MU.f29558D);
                format = stringBuilder.toString();
            } else {
                anonymousClass2MU.f29557C = j;
                anonymousClass2MU.f29558D = 0;
            }
        }
        return format;
    }

    /* renamed from: C */
    public static int m15215C(Activity activity) {
        switch (activity.getWindowManager().getDefaultDisplay().getRotation()) {
            case 1:
                return 90;
            case 2:
                return 180;
            case 3:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: D */
    public static int m15216D(int i) {
        if (i == -1) {
            return 0;
        }
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        if (cameraInfo.facing == 1) {
            return ((((360 - cameraInfo.orientation) / 90) + 2) % 4) + 4;
        }
        return ((cameraInfo.orientation / 90) + 2) % 4;
    }

    /* renamed from: E */
    public static int m15217E(int i, int i2) {
        Object obj = 1;
        if (i2 != -1) {
            int abs = Math.abs(i - i2);
            if (Math.min(abs, 360 - abs) < 50) {
                obj = null;
            }
        }
        return obj != null ? (((i + 45) / 90) * 90) % 360 : i2;
    }
}
