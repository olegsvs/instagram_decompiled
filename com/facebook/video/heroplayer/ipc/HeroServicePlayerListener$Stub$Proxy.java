package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass0cQ;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class HeroServicePlayerListener$Stub$Proxy implements HeroServicePlayerListener {
    /* renamed from: B */
    private IBinder f24685B;

    public HeroServicePlayerListener$Stub$Proxy(IBinder iBinder) {
        int I = AnonymousClass0cQ.I(this, -894749311);
        this.f24685B = iBinder;
        AnonymousClass0cQ.H(this, 1686880861, I);
    }

    public final void Cf(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, 794105229);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            if (servicePlayerState != null) {
                obtain.writeInt(1);
                servicePlayerState.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f24685B.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -994593501, I);
        }
    }

    public final void Ci(List list) {
        int I = AnonymousClass0cQ.I(this, 876877147);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            obtain.writeTypedList(list);
            this.f24685B.transact(15, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, 1111076936, I);
        }
    }

    public final void GGA(int i, int i2) {
        int I = AnonymousClass0cQ.I(this, -1528740210);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f24685B.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -1056541933, I);
        }
    }

    public final void Qh(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, 1750622778);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            if (servicePlayerState != null) {
                obtain.writeInt(1);
                servicePlayerState.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f24685B.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, 1280432877, I);
        }
    }

    public final void Qj(ParcelableFormat parcelableFormat, String str, List list) {
        int I = AnonymousClass0cQ.I(this, 1049569830);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            if (parcelableFormat != null) {
                obtain.writeInt(1);
                parcelableFormat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            obtain.writeStringList(list);
            this.f24685B.transact(14, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -586568783, I);
        }
    }

    public final void Rz(long j, ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, -1010067767);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            obtain.writeLong(j);
            if (servicePlayerState != null) {
                obtain.writeInt(1);
                servicePlayerState.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f24685B.transact(18, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, 1399172952, I);
        }
    }

    public final void SBA(ServicePlayerState servicePlayerState, boolean z) {
        int I = AnonymousClass0cQ.I(this, -610206695);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            int i = 0;
            if (servicePlayerState != null) {
                obtain.writeInt(1);
                servicePlayerState.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f24685B.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -1627615131, I);
        }
    }

    public final void Si(String str, boolean z, long j) {
        int I = AnonymousClass0cQ.I(this, -196954204);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            obtain.writeString(str);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeLong(j);
            this.f24685B.transact(19, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -1116797004, I);
        }
    }

    public final void Ut(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, -1974160063);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            if (servicePlayerState != null) {
                obtain.writeInt(1);
                servicePlayerState.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f24685B.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, 1575208887, I);
        }
    }

    public final void Vw(boolean z) {
        int I = AnonymousClass0cQ.I(this, -520201956);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            obtain.writeInt(z ? 1 : 0);
            this.f24685B.transact(13, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -725145441, I);
        }
    }

    public final void aDA(List list) {
        int I = AnonymousClass0cQ.I(this, -77761502);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            obtain.writeTypedList(list);
            this.f24685B.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -642101105, I);
        }
    }

    public final IBinder asBinder() {
        int I = AnonymousClass0cQ.I(this, -295432239);
        IBinder iBinder = this.f24685B;
        AnonymousClass0cQ.H(this, 47914171, I);
        return iBinder;
    }

    public final void du(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, -2108218059);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            if (servicePlayerState != null) {
                obtain.writeInt(1);
                servicePlayerState.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f24685B.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -1532569457, I);
        }
    }

    public final void ie(ServicePlayerState servicePlayerState, boolean z) {
        int I = AnonymousClass0cQ.I(this, 1763420947);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            int i = 0;
            if (servicePlayerState != null) {
                obtain.writeInt(1);
                servicePlayerState.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f24685B.transact(10, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -1198077231, I);
        }
    }

    public final void kGA(String str) {
        int I = AnonymousClass0cQ.I(this, 1683879879);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            obtain.writeString(str);
            this.f24685B.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, 793263891, I);
        }
    }

    public final void ke(ServicePlayerState servicePlayerState, boolean z) {
        int I = AnonymousClass0cQ.I(this, -633576093);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            int i = 0;
            if (servicePlayerState != null) {
                obtain.writeInt(1);
                servicePlayerState.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f24685B.transact(11, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -1322381417, I);
        }
    }

    public final void rk(String str, String str2) {
        int I = AnonymousClass0cQ.I(this, -516404807);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f24685B.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, 1531209085, I);
        }
    }

    public final void ut(ServicePlayerState servicePlayerState) {
        int I = AnonymousClass0cQ.I(this, 1755750036);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            if (servicePlayerState != null) {
                obtain.writeInt(1);
                servicePlayerState.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f24685B.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -748828408, I);
        }
    }

    public final void vAA(int i) {
        int I = AnonymousClass0cQ.I(this, 1824430373);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            obtain.writeInt(i);
            this.f24685B.transact(16, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, -690799362, I);
        }
    }

    public final void zj() {
        int I = AnonymousClass0cQ.I(this, 1594921261);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            this.f24685B.transact(17, obtain, null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0cQ.H(this, 531304359, I);
        }
    }
}
