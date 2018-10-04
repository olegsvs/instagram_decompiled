package android.support.v4.os;

import X.AnonymousClass0OR;
import X.AnonymousClass0cQ;
import X.AnonymousClass1mK;
import X.AnonymousClass1mL;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.IResultReceiver.Stub;

public class ResultReceiver implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1mK();
    /* renamed from: B */
    public final Handler f22582B = null;
    /* renamed from: C */
    public IResultReceiver f22583C;

    public final class MyResultReceiver extends Stub {
        /* renamed from: B */
        public final /* synthetic */ ResultReceiver f31729B;

        public MyResultReceiver(ResultReceiver resultReceiver) {
            this.f31729B = resultReceiver;
            AnonymousClass0cQ.H(this, -2120535402, AnonymousClass0cQ.I(this, 1724869948));
        }

        public final void CMA(int i, Bundle bundle) {
            int I = AnonymousClass0cQ.I(this, -2071555893);
            if (this.f31729B.f22582B != null) {
                AnonymousClass0OR.D(this.f31729B.f22582B, new AnonymousClass1mL(this.f31729B, i, bundle), -1517660630);
            } else {
                this.f31729B.m12981A(i, bundle);
            }
            AnonymousClass0cQ.H(this, -923662967, I);
        }
    }

    /* renamed from: A */
    public void m12981A(int i, Bundle bundle) {
    }

    public final int describeContents() {
        return 0;
    }

    public ResultReceiver(Parcel parcel) {
        this.f22583C = Stub.m15419B(parcel.readStrongBinder());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f22583C == null) {
                this.f22583C = new MyResultReceiver(this);
            }
            parcel.writeStrongBinder(this.f22583C.asBinder());
        }
    }
}
