package X;

import android.app.Activity;
import android.content.pm.PackageManager;

/* renamed from: X.1lE */
public final class AnonymousClass1lE implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ Activity f22450B;
    /* renamed from: C */
    public final /* synthetic */ String[] f22451C;
    /* renamed from: D */
    public final /* synthetic */ int f22452D;

    public AnonymousClass1lE(String[] strArr, Activity activity, int i) {
        this.f22451C = strArr;
        this.f22450B = activity;
        this.f22452D = i;
    }

    public final void run() {
        int[] iArr = new int[this.f22451C.length];
        PackageManager packageManager = this.f22450B.getPackageManager();
        String packageName = this.f22450B.getPackageName();
        int length = this.f22451C.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.f22451C[i], packageName);
        }
        ((AnonymousClass0He) this.f22450B).onRequestPermissionsResult(this.f22452D, this.f22451C, iArr);
    }
}
