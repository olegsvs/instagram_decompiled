package X;

import android.content.Context;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;

/* renamed from: X.09k */
public final class AnonymousClass09k {
    /* renamed from: C */
    public static final AnonymousClass0FZ f1110C = AnonymousClass0FZ.m1634B();
    /* renamed from: D */
    public static AnonymousClass09k f1111D;
    /* renamed from: E */
    public static AnonymousClass09k f1112E;
    /* renamed from: B */
    public final QuickExperimentDebugStore f1113B;

    public AnonymousClass09k(QuickExperimentDebugStore quickExperimentDebugStore, String str, AnonymousClass0CQ anonymousClass0CQ) {
        this.f1113B = quickExperimentDebugStore;
    }

    /* renamed from: B */
    public static AnonymousClass09k m645B(Context context, AnonymousClass0CQ anonymousClass0CQ) {
        switch (anonymousClass0CQ.ordinal()) {
            case 0:
                return AnonymousClass09k.m651H(context);
            case 1:
                return AnonymousClass09k.m650G(context);
            default:
                return null;
        }
    }

    /* renamed from: C */
    public static boolean m646C() {
        if (f1112E == null) {
            if (f1111D == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public static boolean m647D(AnonymousClass0CQ anonymousClass0CQ) {
        boolean z = true;
        if (anonymousClass0CQ == AnonymousClass0CQ.User) {
            if (f1112E != null) {
                return z;
            }
        } else if (anonymousClass0CQ != AnonymousClass0CQ.Device) {
            return false;
        } else {
            if (f1111D != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: E */
    public static AnonymousClass09k m648E(Context context, String str) {
        f1111D = new AnonymousClass09k(QuickExperimentDebugStoreManager.getDeviceSpoofStore(context.getFilesDir()), str, AnonymousClass0CQ.Device);
        f1110C.m1651Q(str);
        return f1111D;
    }

    /* renamed from: F */
    public static AnonymousClass09k m649F(Context context, String str) {
        f1112E = new AnonymousClass09k(QuickExperimentDebugStoreManager.getUserSpoofStore(context.getFilesDir()), str, AnonymousClass0CQ.User);
        f1110C.m1655U(str);
        return f1112E;
    }

    /* renamed from: G */
    private static AnonymousClass09k m650G(Context context) {
        if (AnonymousClass09k.m647D(AnonymousClass0CQ.Device)) {
            return f1111D;
        }
        if (!f1110C.m1637C()) {
            return null;
        }
        f1111D = new AnonymousClass09k(QuickExperimentDebugStoreManager.getDeviceSpoofStore(context.getFilesDir()), f1110C.m1641G(), AnonymousClass0CQ.Device);
        return f1111D;
    }

    /* renamed from: H */
    private static AnonymousClass09k m651H(Context context) {
        if (AnonymousClass09k.m647D(AnonymousClass0CQ.User)) {
            return f1112E;
        }
        if (!f1110C.m1639E()) {
            return null;
        }
        f1112E = new AnonymousClass09k(QuickExperimentDebugStoreManager.getUserSpoofStore(context.getFilesDir()), f1110C.m1643I(), AnonymousClass0CQ.User);
        return f1112E;
    }
}
