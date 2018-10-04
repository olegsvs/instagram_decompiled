package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.os.Build.VERSION;

/* renamed from: X.1EZ */
public final class AnonymousClass1EZ {
    /* renamed from: B */
    public final Context f15918B;

    public AnonymousClass1EZ(Context context) {
        if (context != null) {
            this.f15918B = context.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("context");
    }

    /* renamed from: A */
    public final AnonymousClass0Xr m10210A() {
        if (VERSION.SDK_INT >= 21) {
            return new AnonymousClass1El(this.f15918B);
        }
        Context context = this.f15918B;
        synchronized (AnonymousClass1Em.class) {
            if (AnonymousClass1Em.f15942B == null) {
                try {
                    PackageItemInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getApplicationInfo().packageName, 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                        if (applicationInfo.metaData.containsKey("com.google.android.gms.version")) {
                            AnonymousClass1Em.f15942B = Boolean.TRUE;
                        }
                    }
                    AnonymousClass1Em.f15942B = Boolean.FALSE;
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
            boolean booleanValue = AnonymousClass1Em.f15942B.booleanValue();
        }
        if (!booleanValue) {
            return null;
        }
        AnonymousClass1Eo anonymousClass1Eo = AnonymousClass1En.f15943B;
        int B = anonymousClass1Eo.m10244B(this.f15918B);
        if (B == 0) {
            return new AnonymousClass1Ep(this.f15918B);
        }
        anonymousClass1Eo.m10243A(B);
        return null;
    }
}
