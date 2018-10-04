package X;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.2o4 */
public final class AnonymousClass2o4 {
    /* renamed from: B */
    public final WeakReference f34131B;
    /* renamed from: C */
    public final AnonymousClass3t3 f34132C;
    /* renamed from: D */
    public final Parameters f34133D;
    /* renamed from: E */
    private final AnonymousClass3t0 f34134E;

    public AnonymousClass2o4(Camera camera, Parameters parameters, AnonymousClass3t0 anonymousClass3t0, AnonymousClass3t3 anonymousClass3t3) {
        this.f34131B = new WeakReference(camera);
        this.f34133D = parameters;
        this.f34134E = anonymousClass3t0;
        this.f34132C = anonymousClass3t3;
    }

    /* renamed from: B */
    public static boolean m17236B(AnonymousClass2o4 anonymousClass2o4, String str) {
        if (!AnonymousClass2o4.m17260Z(anonymousClass2o4.f34134E.f45941G, str)) {
            return false;
        }
        anonymousClass2o4.f34133D.setAntibanding(str);
        return true;
    }

    /* renamed from: C */
    public static boolean m17237C(AnonymousClass2o4 anonymousClass2o4, boolean z) {
        if (!anonymousClass2o4.f34134E.f45936B) {
            return false;
        }
        anonymousClass2o4.f34133D.setAutoExposureLock(z);
        return true;
    }

    /* renamed from: D */
    public static boolean m17238D(AnonymousClass2o4 anonymousClass2o4, boolean z) {
        if (!anonymousClass2o4.f34134E.f45937C) {
            return false;
        }
        anonymousClass2o4.f34133D.setAutoWhiteBalanceLock(z);
        return true;
    }

    /* renamed from: E */
    public static boolean m17239E(AnonymousClass2o4 anonymousClass2o4, String str) {
        if (!AnonymousClass2o4.m17260Z(anonymousClass2o4.f34134E.f45942H, str)) {
            return false;
        }
        anonymousClass2o4.f34133D.setColorEffect(str);
        return true;
    }

    /* renamed from: F */
    public static boolean m17240F(AnonymousClass2o4 anonymousClass2o4, int i) {
        if (!anonymousClass2o4.f34134E.f45938D) {
            return false;
        }
        anonymousClass2o4.f34133D.setExposureCompensation(i);
        return true;
    }

    /* renamed from: G */
    public static boolean m17241G(AnonymousClass2o4 anonymousClass2o4, String str) {
        if (!AnonymousClass2o4.m17260Z(anonymousClass2o4.f34134E.XS(), str)) {
            return false;
        }
        anonymousClass2o4.f34133D.setFlashMode(str);
        anonymousClass2o4.f34132C.f45975B = str;
        return true;
    }

    /* renamed from: H */
    public static boolean m17242H(AnonymousClass2o4 anonymousClass2o4, List list) {
        if (!anonymousClass2o4.f34134E.fY()) {
            return false;
        }
        anonymousClass2o4.f34133D.setFocusAreas(list.isEmpty() ? null : list);
        AnonymousClass2o3.m17234I(list);
        return true;
    }

    /* renamed from: I */
    public static boolean m17243I(AnonymousClass2o4 anonymousClass2o4, String str) {
        if (!AnonymousClass2o4.m17260Z(anonymousClass2o4.f34134E.YS(), str)) {
            return false;
        }
        anonymousClass2o4.f34133D.setFocusMode(str);
        return true;
    }

    /* renamed from: J */
    public static boolean m17244J(AnonymousClass2o4 anonymousClass2o4, boolean z) {
        if (!anonymousClass2o4.f34134E.f45939E) {
            return false;
        }
        String str = z ? AnonymousClass2o3.f34129C : "auto";
        anonymousClass2o4.f34133D.setSceneMode(str);
        anonymousClass2o4.f34132C.f45979F = str;
        if (z) {
            AnonymousClass2o4.m17255U(anonymousClass2o4, false);
        }
        return true;
    }

    /* renamed from: K */
    public static boolean m17245K(AnonymousClass2o4 anonymousClass2o4, int i) {
        if ((anonymousClass2o4.f34134E.f45943I != null ? 1 : null) == null) {
            return false;
        }
        AnonymousClass2o1 anonymousClass2o1 = anonymousClass2o4.f34134E.f45943I;
        anonymousClass2o4.f34133D.set(anonymousClass2o1.f34126B, (String) anonymousClass2o1.f34127C.get(i));
        return true;
    }

    /* renamed from: L */
    public static boolean m17246L(AnonymousClass2o4 anonymousClass2o4, int i) {
        if (i <= 0 || i > 100) {
            return false;
        }
        anonymousClass2o4.f34133D.setJpegQuality(i);
        return true;
    }

    /* renamed from: M */
    public static boolean m17247M(AnonymousClass2o4 anonymousClass2o4, int i) {
        if (i <= 0 || i > 100) {
            return false;
        }
        anonymousClass2o4.f34133D.setJpegThumbnailQuality(i);
        return true;
    }

    /* renamed from: N */
    public static boolean m17248N(AnonymousClass2o4 anonymousClass2o4, List list) {
        if (!anonymousClass2o4.f34134E.gY()) {
            return false;
        }
        anonymousClass2o4.f34133D.setMeteringAreas(list.isEmpty() ? null : list);
        AnonymousClass2o3.m17234I(list);
        return true;
    }

    /* renamed from: O */
    public static boolean m17249O(AnonymousClass2o4 anonymousClass2o4, int i) {
        if (!AnonymousClass2o4.m17260Z(anonymousClass2o4.f34134E.f45944J, Integer.valueOf(i))) {
            return false;
        }
        anonymousClass2o4.f34133D.setPictureFormat(i);
        return true;
    }

    /* renamed from: P */
    public static boolean m17250P(AnonymousClass2o4 anonymousClass2o4, Size size) {
        if (!AnonymousClass2o4.m17260Z(anonymousClass2o4.f34134E.ZS(), size)) {
            return false;
        }
        anonymousClass2o4.f34133D.setPictureSize(size.width, size.height);
        anonymousClass2o4.f34132C.m21149A(size);
        return true;
    }

    /* renamed from: Q */
    public static boolean m17251Q(AnonymousClass2o4 anonymousClass2o4, int i) {
        if (!AnonymousClass2o4.m17260Z(anonymousClass2o4.f34134E.f45945K, Integer.valueOf(i))) {
            return false;
        }
        anonymousClass2o4.f34133D.setPreviewFormat(i);
        anonymousClass2o4.f34132C.f45976C = i;
        return true;
    }

    /* renamed from: R */
    public static boolean m17252R(AnonymousClass2o4 anonymousClass2o4, int i) {
        if (!AnonymousClass2o4.m17260Z(anonymousClass2o4.f34134E.f45947M, Integer.valueOf(i))) {
            return false;
        }
        anonymousClass2o4.f34133D.setPreviewFrameRate(i);
        anonymousClass2o4.f34132C.f45978E = i;
        return true;
    }

    /* renamed from: S */
    public static boolean m17253S(AnonymousClass2o4 anonymousClass2o4, int[] iArr) {
        if (!AnonymousClass2o4.m17261a(anonymousClass2o4.f34134E.f45946L, iArr)) {
            return false;
        }
        anonymousClass2o4.f34133D.setPreviewFpsRange(iArr[0], iArr[1]);
        anonymousClass2o4.f34132C.f45977D = iArr;
        return true;
    }

    /* renamed from: T */
    public static boolean m17254T(AnonymousClass2o4 anonymousClass2o4, Size size) {
        if (!AnonymousClass2o4.m17260Z(anonymousClass2o4.f34134E.aS(), size)) {
            return false;
        }
        anonymousClass2o4.f34133D.setPreviewSize(size.width, size.height);
        anonymousClass2o4.f34132C.m21150B(size);
        return true;
    }

    /* renamed from: U */
    public static boolean m17255U(AnonymousClass2o4 anonymousClass2o4, boolean z) {
        if (!AnonymousClass2nw.m17221B(AnonymousClass2nw.f34121D)) {
            anonymousClass2o4.f34133D.setRecordingHint(z);
        }
        return false;
    }

    /* renamed from: V */
    public static boolean m17256V(AnonymousClass2o4 anonymousClass2o4, String str) {
        if (!AnonymousClass2o4.m17260Z(anonymousClass2o4.f34134E.f45948N, str)) {
            return false;
        }
        anonymousClass2o4.f34133D.setSceneMode(str);
        anonymousClass2o4.f34132C.f45979F = str;
        return true;
    }

    /* renamed from: W */
    public static boolean m17257W(AnonymousClass2o4 anonymousClass2o4, boolean z) {
        if (AnonymousClass2nw.m17221B(AnonymousClass2nw.f34123F) || !anonymousClass2o4.f34134E.yY()) {
            return false;
        }
        anonymousClass2o4.f34133D.setVideoStabilization(z);
        return true;
    }

    /* renamed from: X */
    public static boolean m17258X(AnonymousClass2o4 anonymousClass2o4, String str) {
        if (!AnonymousClass2o4.m17260Z(anonymousClass2o4.f34134E.f45949O, str)) {
            return false;
        }
        anonymousClass2o4.f34133D.setWhiteBalance(str);
        return true;
    }

    /* renamed from: Y */
    public static boolean m17259Y(AnonymousClass2o4 anonymousClass2o4, int i) {
        if (!anonymousClass2o4.f34134E.AZ()) {
            return false;
        }
        anonymousClass2o4.f34133D.setZoom(i);
        anonymousClass2o4.f34132C.f45980G = i;
        return true;
    }

    /* renamed from: Z */
    private static boolean m17260Z(List list, Object obj) {
        return (list == null || obj == null || list.contains(obj) == null) ? null : true;
    }

    /* renamed from: a */
    private static boolean m17261a(List list, int[] iArr) {
        if (list != null) {
            if (iArr != null) {
                for (int[] iArr2 : list) {
                    if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
