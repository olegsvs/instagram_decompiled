package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.device.messaging.ADM;
import com.instagram.common.notifications.push.PushChannelType;

/* renamed from: X.1TS */
public final class AnonymousClass1TS implements AnonymousClass0aq {
    /* renamed from: B */
    private final Context f18919B;

    public final void Tq() {
    }

    public AnonymousClass1TS(Context context) {
        this.f18919B = context;
    }

    public final void FW(String str, boolean z) {
        ComponentName componentName = new ComponentName(this.f18919B, "com.instagram.notifications.push.ADMMessageHandler$Receiver");
        PackageManager packageManager = this.f18919B.getPackageManager();
        componentName.getClassName();
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
    }

    public final PushChannelType IQ() {
        return PushChannelType.AMAZON;
    }

    public final void zIA() {
        new ADM(this.f18919B).startRegister();
    }
}
