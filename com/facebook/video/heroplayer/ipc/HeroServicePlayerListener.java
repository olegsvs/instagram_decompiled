package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

public interface HeroServicePlayerListener extends IInterface {

    public abstract class Stub extends Binder implements HeroServicePlayerListener {
        public Stub() {
            int I = AnonymousClass0cQ.m5859I(this, 351207851);
            attachInterface(this, "com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            AnonymousClass0cQ.m5858H(this, 1365206130, I);
        }

        /* renamed from: B */
        public static HeroServicePlayerListener m10613B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof HeroServicePlayerListener)) {
                return new HeroServicePlayerListener$Stub$Proxy(iBinder);
            }
            return (HeroServicePlayerListener) queryLocalInterface;
        }

        public final IBinder asBinder() {
            AnonymousClass0cQ.m5858H(this, -593935156, AnonymousClass0cQ.m5859I(this, 411903282));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int I = AnonymousClass0cQ.m5859I(this, 1787293848);
            if (i != 1598968902) {
                boolean z = false;
                ServicePlayerState servicePlayerState = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        rk(parcel.readString(), parcel.readString());
                        AnonymousClass0cQ.m5858H(this, 804394714, I);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        kGA(parcel.readString());
                        AnonymousClass0cQ.m5858H(this, -612720809, I);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        aDA(parcel.createTypedArrayList(ParcelableTimeRange.CREATOR));
                        AnonymousClass0cQ.m5858H(this, 1519392472, I);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            servicePlayerState = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        du(servicePlayerState);
                        AnonymousClass0cQ.m5858H(this, 118406524, I);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            servicePlayerState = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        SBA(servicePlayerState, z);
                        AnonymousClass0cQ.m5858H(this, 881844382, I);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            servicePlayerState = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        Ut(servicePlayerState);
                        AnonymousClass0cQ.m5858H(this, -405999541, I);
                        return true;
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            servicePlayerState = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        Cf(servicePlayerState);
                        AnonymousClass0cQ.m5858H(this, -720892506, I);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            servicePlayerState = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        Qh(servicePlayerState);
                        AnonymousClass0cQ.m5858H(this, -926821827, I);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        GGA(parcel.readInt(), parcel.readInt());
                        AnonymousClass0cQ.m5858H(this, 354541677, I);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            servicePlayerState = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        ie(servicePlayerState, z);
                        AnonymousClass0cQ.m5858H(this, 981591675, I);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            servicePlayerState = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        ke(servicePlayerState, z);
                        AnonymousClass0cQ.m5858H(this, 1268377193, I);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            servicePlayerState = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        ut(servicePlayerState);
                        AnonymousClass0cQ.m5858H(this, 1085818137, I);
                        return true;
                    case ParserMinimalBase.INT_CR /*13*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        Vw(z);
                        AnonymousClass0cQ.m5858H(this, -1675495979, I);
                        return true;
                    case 14:
                        ParcelableFormat parcelableFormat;
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        if (parcel.readInt() != 0) {
                            parcelableFormat = (ParcelableFormat) ParcelableFormat.CREATOR.createFromParcel(parcel);
                        }
                        Qj(parcelableFormat, parcel.readString(), parcel.createStringArrayList());
                        AnonymousClass0cQ.m5858H(this, -969383678, I);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        Ci(parcel.createTypedArrayList(ParcelableCue.CREATOR));
                        AnonymousClass0cQ.m5858H(this, -2017079106, I);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        vAA(parcel.readInt());
                        AnonymousClass0cQ.m5858H(this, -766714454, I);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        zj();
                        AnonymousClass0cQ.m5858H(this, -448739952, I);
                        return true;
                    case Process.SIGCONT /*18*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        long readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            servicePlayerState = (ServicePlayerState) ServicePlayerState.CREATOR.createFromParcel(parcel);
                        }
                        Rz(readLong, servicePlayerState);
                        AnonymousClass0cQ.m5858H(this, 120394002, I);
                        return true;
                    case Process.SIGSTOP /*19*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        Si(readString, z, parcel.readLong());
                        AnonymousClass0cQ.m5858H(this, -1765213315, I);
                        return true;
                    default:
                        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
                        AnonymousClass0cQ.m5858H(this, 665630712, I);
                        return onTransact;
                }
            }
            parcel2.writeString("com.facebook.video.heroplayer.ipc.HeroServicePlayerListener");
            AnonymousClass0cQ.m5858H(this, -1118030129, I);
            return true;
        }
    }

    void Cf(ServicePlayerState servicePlayerState);

    void Ci(List list);

    void GGA(int i, int i2);

    void Qh(ServicePlayerState servicePlayerState);

    void Qj(ParcelableFormat parcelableFormat, String str, List list);

    void Rz(long j, ServicePlayerState servicePlayerState);

    void SBA(ServicePlayerState servicePlayerState, boolean z);

    void Si(String str, boolean z, long j);

    void Ut(ServicePlayerState servicePlayerState);

    void Vw(boolean z);

    void aDA(List list);

    void du(ServicePlayerState servicePlayerState);

    void ie(ServicePlayerState servicePlayerState, boolean z);

    void kGA(String str);

    void ke(ServicePlayerState servicePlayerState, boolean z);

    void rk(String str, String str2);

    void ut(ServicePlayerState servicePlayerState);

    void vAA(int i);

    void zj();
}
