package com.google.android.play.core.splitinstall.p002a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.p001a.C0053b;

/* renamed from: com.google.android.play.core.splitinstall.a.b */
public abstract class C0058b extends C0053b implements C0054a {
    /* renamed from: B */
    public static C0054a m15933B(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof C0054a ? (C0054a) queryLocalInterface : new C0059c(iBinder);
    }
}
