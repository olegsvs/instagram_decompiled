package com.google.android.gms.gcm;

import X.AnonymousClass1FF;
import X.AnonymousClass1zv;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class Task implements ReflectedParcelable {
    /* renamed from: B */
    public final String f16002B;
    /* renamed from: C */
    public final String f16003C;
    /* renamed from: D */
    private final Bundle f16004D;
    /* renamed from: E */
    private final boolean f16005E;
    /* renamed from: F */
    private final boolean f16006F;
    /* renamed from: G */
    private final int f16007G;
    /* renamed from: H */
    private final boolean f16008H;
    /* renamed from: I */
    private final AnonymousClass1zv f16009I;

    public Task(AnonymousClass1FF anonymousClass1FF) {
        this.f16003C = anonymousClass1FF.f15994C;
        this.f16002B = anonymousClass1FF.f15998G;
        this.f16005E = anonymousClass1FF.f15999H;
        this.f16006F = anonymousClass1FF.f15995D;
        this.f16007G = anonymousClass1FF.f15996E;
        this.f16008H = anonymousClass1FF.f15997F;
        this.f16004D = anonymousClass1FF.f15993B;
        this.f16009I = anonymousClass1FF.f16000I != null ? anonymousClass1FF.f16000I : AnonymousClass1zv.f25127E;
    }

    public Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.f16003C = parcel.readString();
        this.f16002B = parcel.readString();
        boolean z = true;
        this.f16005E = parcel.readInt() == 1;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f16006F = z;
        this.f16007G = 2;
        this.f16008H = false;
        this.f16009I = AnonymousClass1zv.f25127E;
        this.f16004D = null;
    }

    /* renamed from: B */
    public static void m10336B(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            if (dataSize <= 10240) {
                obtain.recycle();
                for (String str : bundle.keySet()) {
                    Object obj;
                    Object obj2 = bundle.get(str);
                    if (!((obj2 instanceof Integer) || (obj2 instanceof Long) || (obj2 instanceof Double) || (obj2 instanceof String))) {
                        if (!(obj2 instanceof Boolean)) {
                            obj = null;
                            if (obj != null) {
                                if (obj2 instanceof Bundle) {
                                    throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                                }
                                m10336B((Bundle) obj2);
                            }
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        if (obj2 instanceof Bundle) {
                            throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                        }
                        m10336B((Bundle) obj2);
                    }
                }
                return;
            }
            obtain.recycle();
            String valueOf = String.valueOf("Extras exceeding maximum size(10240 bytes): ");
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11);
            stringBuilder.append(valueOf);
            stringBuilder.append(dataSize);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: A */
    public void m10337A(Bundle bundle) {
        bundle.putString("tag", this.f16002B);
        bundle.putBoolean("update_current", this.f16005E);
        bundle.putBoolean("persisted", this.f16006F);
        bundle.putString("service", this.f16003C);
        bundle.putInt("requiredNetwork", this.f16007G);
        bundle.putBoolean("requiresCharging", this.f16008H);
        bundle.putBoolean("requiresIdle", false);
        AnonymousClass1zv anonymousClass1zv = this.f16009I;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("retry_policy", anonymousClass1zv.f25128B);
        bundle2.putInt("initial_backoff_seconds", anonymousClass1zv.f25129C);
        bundle2.putInt("maximum_backoff_seconds", anonymousClass1zv.f25130D);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle("extras", this.f16004D);
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16003C);
        parcel.writeString(this.f16002B);
        parcel.writeInt(this.f16005E);
        parcel.writeInt(this.f16006F);
    }
}
