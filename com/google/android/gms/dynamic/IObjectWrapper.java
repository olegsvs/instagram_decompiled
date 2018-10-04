package com.google.android.gms.dynamic;

import X.AnonymousClass0cQ;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.zzee;

public interface IObjectWrapper extends IInterface {

    public class zza extends zzee implements IObjectWrapper {
        public zza() {
            int I = AnonymousClass0cQ.m5859I(this, 390510581);
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
            AnonymousClass0cQ.m5858H(this, 746118262, I);
        }

        /* renamed from: C */
        public static IObjectWrapper m10307C(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof IObjectWrapper ? (IObjectWrapper) queryLocalInterface : new zzm(iBinder);
        }
    }
}
