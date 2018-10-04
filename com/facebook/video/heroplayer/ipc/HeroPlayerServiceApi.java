package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.view.Surface;
import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.Map;
import org.webrtc.audio.WebRtcAudioRecord;

public interface HeroPlayerServiceApi extends IInterface {

    public abstract class Stub extends Binder implements HeroPlayerServiceApi {

        public final class Proxy implements HeroPlayerServiceApi {
            /* renamed from: B */
            private IBinder f16705B;

            public Proxy(IBinder iBinder) {
                int I = AnonymousClass0cQ.m5859I(this, 1031057448);
                this.f16705B = iBinder;
                AnonymousClass0cQ.m5858H(this, 858212036, I);
            }

            public final boolean ARA(long j, long j2) {
                int I = AnonymousClass0cQ.m5859I(this, -1111760496);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    boolean z = false;
                    this.f16705B.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1877554361, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 864321330, I);
                }
            }

            public final long AXA(VideoPlayRequest videoPlayRequest, Surface surface, int i, int i2, float f) {
                int I = AnonymousClass0cQ.m5859I(this, 606435997);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (videoPlayRequest != null) {
                        obtain.writeInt(1);
                        videoPlayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeFloat(f);
                    this.f16705B.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1759153324, I);
                }
            }

            public final void CC(TigonTraceListener tigonTraceListener) {
                int I = AnonymousClass0cQ.m5859I(this, -1380339160);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeStrongBinder(tigonTraceListener != null ? tigonTraceListener.asBinder() : null);
                    this.f16705B.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1062169960, I);
                }
            }

            public final void DC(TigonTrafficShapingListener tigonTrafficShapingListener) {
                int I = AnonymousClass0cQ.m5859I(this, -1584885189);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeStrongBinder(tigonTrafficShapingListener != null ? tigonTrafficShapingListener.asBinder() : null);
                    this.f16705B.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 787942666, I);
                }
            }

            public final void DE(String str) {
                int I = AnonymousClass0cQ.m5859I(this, 526102941);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    this.f16705B.transact(31, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1020124501, I);
                }
            }

            public final void EE(String str) {
                int I = AnonymousClass0cQ.m5859I(this, -1642943198);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    this.f16705B.transact(30, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -577727250, I);
                }
            }

            public final boolean HHA(long j, boolean z) {
                int I = AnonymousClass0cQ.m5859I(this, 1354109280);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z2 = true;
                    obtain.writeInt(z ? 1 : 0);
                    this.f16705B.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1573261414, I);
                    return z2;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1374185787, I);
                }
            }

            public final void JJA(long j, boolean z) {
                int I = AnonymousClass0cQ.m5859I(this, 2069545902);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeInt(z ? 1 : 0);
                    this.f16705B.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1607567480, I);
                }
            }

            public final boolean JLA(long j) {
                int I = AnonymousClass0cQ.m5859I(this, -2071134595);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z = false;
                    this.f16705B.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -460203477, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -2043038701, I);
                }
            }

            public final void KSA(byte[] bArr, int i) {
                int I = AnonymousClass0cQ.m5859I(this, -1995715731);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    this.f16705B.transact(37, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 484961207, I);
                }
            }

            public final void Mc(String str) {
                int I = AnonymousClass0cQ.m5859I(this, -2108103940);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    this.f16705B.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1001131635, I);
                }
            }

            public final boolean NPA(long j, boolean z) {
                int I = AnonymousClass0cQ.m5859I(this, -1090008729);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z2 = true;
                    obtain.writeInt(z ? 1 : 0);
                    this.f16705B.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 330608508, I);
                    return z2;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -2136982954, I);
                }
            }

            public final Map OJ(String str) {
                int I = AnonymousClass0cQ.m5859I(this, -1525052323);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    this.f16705B.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    Map readHashMap = obtain2.readHashMap(getClass().getClassLoader());
                    return readHashMap;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 335500346, I);
                }
            }

            public final boolean THA(long j) {
                int I = AnonymousClass0cQ.m5859I(this, -873780834);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z = false;
                    this.f16705B.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 81228855, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -441661862, I);
                }
            }

            public final boolean UJA(long j, ResultReceiver resultReceiver) {
                int I = AnonymousClass0cQ.m5859I(this, -1217075571);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z = true;
                    if (resultReceiver != null) {
                        obtain.writeInt(1);
                        resultReceiver.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16705B.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1395832668, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1186489054, I);
                }
            }

            public final void VE() {
                int I = AnonymousClass0cQ.m5859I(this, 1240265986);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    this.f16705B.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1360445061, I);
                }
            }

            public final long VLA(long j) {
                int I = AnonymousClass0cQ.m5859I(this, 188924450);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    this.f16705B.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -548757217, I);
                }
            }

            public final void YSA(VideoLicenseListener videoLicenseListener) {
                int I = AnonymousClass0cQ.m5859I(this, 71272358);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeStrongBinder(videoLicenseListener != null ? videoLicenseListener.asBinder() : null);
                    this.f16705B.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -885859172, I);
                }
            }

            public final void Zd(boolean z) {
                int I = AnonymousClass0cQ.m5859I(this, -1101303233);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeInt(z ? 1 : 0);
                    this.f16705B.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1660411704, I);
                }
            }

            public final void aNA(long j, String str) {
                int I = AnonymousClass0cQ.m5859I(this, -1741105630);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    this.f16705B.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1692522004, I);
                }
            }

            public final IBinder asBinder() {
                int I = AnonymousClass0cQ.m5859I(this, -1857591026);
                IBinder iBinder = this.f16705B;
                AnonymousClass0cQ.m5858H(this, 1632231151, I);
                return iBinder;
            }

            public final void bE(String str, String str2) {
                int I = AnonymousClass0cQ.m5859I(this, 1808903563);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f16705B.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -507851979, I);
                }
            }

            public final void bHA(VideoPrefetchRequest videoPrefetchRequest) {
                int I = AnonymousClass0cQ.m5859I(this, -1772432075);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (videoPrefetchRequest != null) {
                        obtain.writeInt(1);
                        videoPrefetchRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16705B.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1485966418, I);
                }
            }

            public final void fE() {
                int I = AnonymousClass0cQ.m5859I(this, 1776646771);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    this.f16705B.transact(27, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -49514325, I);
                }
            }

            public final void hNA(long j, DeviceOrientationFrame deviceOrientationFrame) {
                int I = AnonymousClass0cQ.m5859I(this, -851676614);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    if (deviceOrientationFrame != null) {
                        obtain.writeInt(1);
                        deviceOrientationFrame.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16705B.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -582366680, I);
                }
            }

            public final void iRA(long j, SpatialAudioFocusParams spatialAudioFocusParams) {
                int I = AnonymousClass0cQ.m5859I(this, -87158799);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    if (spatialAudioFocusParams != null) {
                        obtain.writeInt(1);
                        spatialAudioFocusParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16705B.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 89834882, I);
                }
            }

            public final long jWA(long j, VideoPlayRequest videoPlayRequest, HeroServicePlayerListener heroServicePlayerListener) {
                int I = AnonymousClass0cQ.m5859I(this, 743042678);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    if (videoPlayRequest != null) {
                        obtain.writeInt(1);
                        videoPlayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(heroServicePlayerListener != null ? heroServicePlayerListener.asBinder() : null);
                    this.f16705B.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1680553364, I);
                }
            }

            public final void lQA(String str) {
                int I = AnonymousClass0cQ.m5859I(this, 1818376639);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeString(str);
                    this.f16705B.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1800693734, I);
                }
            }

            public final void mNA(DynamicPlayerSettings dynamicPlayerSettings) {
                int I = AnonymousClass0cQ.m5859I(this, -749155465);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (dynamicPlayerSettings != null) {
                        obtain.writeInt(1);
                        dynamicPlayerSettings.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16705B.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1041769764, I);
                }
            }

            public final boolean oHA(long j, VideoPlayRequest videoPlayRequest) {
                int I = AnonymousClass0cQ.m5859I(this, -2004775833);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z = true;
                    if (videoPlayRequest != null) {
                        obtain.writeInt(1);
                        videoPlayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16705B.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1345634421, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1134362849, I);
                }
            }

            public final void ob() {
                int I = AnonymousClass0cQ.m5859I(this, -4067431);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    this.f16705B.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 639933034, I);
                }
            }

            public final boolean pHA(long j, VideoPlayRequest videoPlayRequest, boolean z, float f, boolean z2) {
                int I = AnonymousClass0cQ.m5859I(this, -804079492);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z3 = true;
                    if (videoPlayRequest != null) {
                        obtain.writeInt(1);
                        videoPlayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeFloat(f);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f16705B.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z3 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -33020633, I);
                    return z3;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -2046518623, I);
                }
            }

            public final boolean pSA(long j, float f) {
                int I = AnonymousClass0cQ.m5859I(this, 1160953424);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeFloat(f);
                    boolean z = false;
                    this.f16705B.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 803654090, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 457404462, I);
                }
            }

            public final boolean rW(VideoPrefetchRequest videoPrefetchRequest) {
                int I = AnonymousClass0cQ.m5859I(this, -1869646520);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    boolean z = true;
                    if (videoPrefetchRequest != null) {
                        obtain.writeInt(1);
                        videoPrefetchRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16705B.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -460641782, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -765835936, I);
                }
            }

            public final boolean tRA(long j, Surface surface, int i, int i2) {
                int I = AnonymousClass0cQ.m5859I(this, 2105594544);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    boolean z = true;
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f16705B.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -566267066, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1236240842, I);
                }
            }

            public final boolean uRA(long j, int i, int i2) {
                int I = AnonymousClass0cQ.m5859I(this, -1001577159);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    boolean z = false;
                    this.f16705B.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1493788228, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -1474182780, I);
                }
            }

            public final boolean xLA(long j, long j2, long j3) {
                int I = AnonymousClass0cQ.m5859I(this, 776123778);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeLong(j3);
                    boolean z = false;
                    this.f16705B.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, -636369318, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1787085046, I);
                }
            }

            public final void zWA(VideoPlayRequest videoPlayRequest, Surface surface, int i, int i2, float f) {
                int I = AnonymousClass0cQ.m5859I(this, -1404700061);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                    if (videoPlayRequest != null) {
                        obtain.writeInt(1);
                        videoPlayRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (surface != null) {
                        obtain.writeInt(1);
                        surface.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeFloat(f);
                    this.f16705B.transact(26, obtain, null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0cQ.m5858H(this, 1256592741, I);
                }
            }
        }

        public Stub() {
            int I = AnonymousClass0cQ.m5859I(this, -903763743);
            attachInterface(this, "com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
            AnonymousClass0cQ.m5858H(this, 985108349, I);
        }

        /* renamed from: B */
        public static HeroPlayerServiceApi m10619B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof HeroPlayerServiceApi)) {
                return new Proxy(iBinder);
            }
            return (HeroPlayerServiceApi) queryLocalInterface;
        }

        public final IBinder asBinder() {
            AnonymousClass0cQ.m5858H(this, -1053635570, AnonymousClass0cQ.m5859I(this, 1947165499));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Stub stub = this;
            int I = AnonymousClass0cQ.m5859I(this, -1409869744);
            Parcel parcel3 = parcel2;
            if (i != 1598968902) {
                boolean z = false;
                DynamicPlayerSettings dynamicPlayerSettings = null;
                Parcel parcel4 = parcel;
                long readLong;
                VideoPlayRequest videoPlayRequest;
                boolean oHA;
                long readLong2;
                ResultReceiver resultReceiver;
                VideoPlayRequest videoPlayRequest2;
                Surface surface;
                VideoPrefetchRequest videoPrefetchRequest;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        bE(parcel.readString(), parcel.readString());
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, -654526683, I);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        VE();
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, -1381776043, I);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        if (parcel.readInt() != 0) {
                            dynamicPlayerSettings = (DynamicPlayerSettings) DynamicPlayerSettings.CREATOR.createFromParcel(parcel);
                        }
                        mNA(dynamicPlayerSettings);
                        AnonymousClass0cQ.m5858H(this, -968321933, I);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        Map OJ = OJ(parcel.readString());
                        parcel3.writeNoException();
                        parcel3.writeMap(OJ);
                        AnonymousClass0cQ.m5858H(this, 151129155, I);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        lQA(parcel.readString());
                        AnonymousClass0cQ.m5858H(this, -2096184102, I);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        ob();
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, 439703723, I);
                        return true;
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        Mc(parcel.readString());
                        AnonymousClass0cQ.m5858H(this, -25685913, I);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        Zd(z);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, -1326819113, I);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        YSA(com.facebook.video.heroplayer.ipc.VideoLicenseListener.Stub.B(parcel.readStrongBinder()));
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, 1187244829, I);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            videoPlayRequest = (VideoPlayRequest) VideoPlayRequest.CREATOR.createFromParcel(parcel);
                        }
                        readLong = jWA(readLong, videoPlayRequest, com.facebook.video.heroplayer.ipc.HeroServicePlayerListener.Stub.m10613B(parcel.readStrongBinder()));
                        parcel3.writeNoException();
                        parcel3.writeLong(readLong);
                        AnonymousClass0cQ.m5858H(this, 67221692, I);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            videoPlayRequest = (VideoPlayRequest) VideoPlayRequest.CREATOR.createFromParcel(parcel);
                        }
                        oHA = oHA(readLong, videoPlayRequest);
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(this, -1693392592, I);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        readLong2 = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            resultReceiver = (VideoPlayRequest) VideoPlayRequest.CREATOR.createFromParcel(parcel);
                        }
                        oHA = pHA(readLong2, resultReceiver, parcel.readInt() != 0 ? true : null, parcel4.readFloat(), parcel4.readInt() != 0 ? 1 : 0);
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(stub, -1626522875, I);
                        return true;
                    case ParserMinimalBase.INT_CR /*13*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        oHA = THA(parcel.readLong());
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(this, -1620324504, I);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        oHA = HHA(readLong, z);
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(this, -11272749, I);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        oHA = JLA(parcel.readLong());
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(this, 874391243, I);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        oHA = xLA(parcel.readLong(), parcel.readLong(), parcel.readLong());
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(stub, 1924455538, I);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        oHA = ARA(parcel.readLong(), parcel.readLong());
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(this, -1573806564, I);
                        return true;
                    case Process.SIGCONT /*18*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        oHA = pSA(parcel.readLong(), parcel.readFloat());
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(this, -552815007, I);
                        return true;
                    case Process.SIGSTOP /*19*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        oHA = NPA(readLong, z);
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(this, -1013408260, I);
                        return true;
                    case Process.SIGTSTP /*20*/:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        readLong2 = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            resultReceiver = (Surface) Surface.CREATOR.createFromParcel(parcel);
                        }
                        oHA = tRA(readLong2, resultReceiver, parcel.readInt(), parcel4.readInt());
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(stub, -283107405, I);
                        return true;
                    case 21:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        oHA = uRA(parcel.readLong(), parcel.readInt(), parcel.readInt());
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(this, -1831343323, I);
                        return true;
                    case 22:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                        }
                        oHA = UJA(readLong, resultReceiver);
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(this, -1440976600, I);
                        return true;
                    case 23:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        JJA(readLong, z);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, 316045108, I);
                        return true;
                    case 24:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        aNA(parcel.readLong(), parcel.readString());
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, -624799461, I);
                        return true;
                    case 25:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        readLong = VLA(parcel.readLong());
                        parcel3.writeNoException();
                        parcel3.writeLong(readLong);
                        AnonymousClass0cQ.m5858H(this, -283031107, I);
                        return true;
                    case 26:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        videoPlayRequest2 = parcel.readInt() != 0 ? (VideoPlayRequest) VideoPlayRequest.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel);
                        }
                        zWA(videoPlayRequest2, surface, parcel.readInt(), parcel.readInt(), parcel.readFloat());
                        AnonymousClass0cQ.m5858H(stub, 864163270, I);
                        return true;
                    case 27:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        fE();
                        AnonymousClass0cQ.m5858H(this, 1604115872, I);
                        return true;
                    case 28:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        videoPlayRequest2 = parcel.readInt() != 0 ? (VideoPlayRequest) VideoPlayRequest.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            surface = (Surface) Surface.CREATOR.createFromParcel(parcel);
                        }
                        readLong = AXA(videoPlayRequest2, surface, parcel.readInt(), parcel.readInt(), parcel.readFloat());
                        parcel3.writeNoException();
                        parcel3.writeLong(readLong);
                        AnonymousClass0cQ.m5858H(stub, -1265423008, I);
                        return true;
                    case 29:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        if (parcel.readInt() != 0) {
                            videoPrefetchRequest = (VideoPrefetchRequest) VideoPrefetchRequest.CREATOR.createFromParcel(parcel);
                        }
                        bHA(videoPrefetchRequest);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, 102409345, I);
                        return true;
                    case 30:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        EE(parcel.readString());
                        AnonymousClass0cQ.m5858H(this, 1712660258, I);
                        return true;
                    case 31:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        DE(parcel.readString());
                        AnonymousClass0cQ.m5858H(this, -543591353, I);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        if (parcel.readInt() != 0) {
                            videoPrefetchRequest = (VideoPrefetchRequest) VideoPrefetchRequest.CREATOR.createFromParcel(parcel);
                        }
                        oHA = rW(videoPrefetchRequest);
                        parcel3.writeNoException();
                        parcel3.writeInt(oHA);
                        AnonymousClass0cQ.m5858H(this, 218900176, I);
                        return true;
                    case 33:
                        DeviceOrientationFrame deviceOrientationFrame;
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            deviceOrientationFrame = (DeviceOrientationFrame) DeviceOrientationFrame.CREATOR.createFromParcel(parcel);
                        }
                        hNA(readLong, deviceOrientationFrame);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, -9568829, I);
                        return true;
                    case ParserMinimalBase.INT_QUOTE /*34*/:
                        SpatialAudioFocusParams spatialAudioFocusParams;
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        readLong = parcel.readLong();
                        if (parcel.readInt() != 0) {
                            spatialAudioFocusParams = (SpatialAudioFocusParams) SpatialAudioFocusParams.CREATOR.createFromParcel(parcel);
                        }
                        iRA(readLong, spatialAudioFocusParams);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, -568828892, I);
                        return true;
                    case 35:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        CC(com.facebook.video.heroplayer.ipc.TigonTraceListener.Stub.B(parcel.readStrongBinder()));
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, -253796549, I);
                        return true;
                    case 36:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        DC(com.facebook.video.heroplayer.ipc.TigonTrafficShapingListener.Stub.B(parcel.readStrongBinder()));
                        parcel3.writeNoException();
                        AnonymousClass0cQ.m5858H(this, 1163213503, I);
                        return true;
                    case 37:
                        parcel.enforceInterface("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
                        KSA(parcel.createByteArray(), parcel.readInt());
                        AnonymousClass0cQ.m5858H(this, 1673298655, I);
                        return true;
                    default:
                        boolean onTransact = super.onTransact(i, parcel, parcel3, i2);
                        AnonymousClass0cQ.m5858H(this, 1507506887, I);
                        return onTransact;
                }
            }
            parcel3.writeString("com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi");
            AnonymousClass0cQ.m5858H(this, -1348906248, I);
            return true;
        }
    }

    boolean ARA(long j, long j2);

    long AXA(VideoPlayRequest videoPlayRequest, Surface surface, int i, int i2, float f);

    void CC(TigonTraceListener tigonTraceListener);

    void DC(TigonTrafficShapingListener tigonTrafficShapingListener);

    void DE(String str);

    void EE(String str);

    boolean HHA(long j, boolean z);

    void JJA(long j, boolean z);

    boolean JLA(long j);

    void KSA(byte[] bArr, int i);

    void Mc(String str);

    boolean NPA(long j, boolean z);

    Map OJ(String str);

    boolean THA(long j);

    boolean UJA(long j, ResultReceiver resultReceiver);

    void VE();

    long VLA(long j);

    void YSA(VideoLicenseListener videoLicenseListener);

    void Zd(boolean z);

    void aNA(long j, String str);

    void bE(String str, String str2);

    void bHA(VideoPrefetchRequest videoPrefetchRequest);

    void fE();

    void hNA(long j, DeviceOrientationFrame deviceOrientationFrame);

    void iRA(long j, SpatialAudioFocusParams spatialAudioFocusParams);

    long jWA(long j, VideoPlayRequest videoPlayRequest, HeroServicePlayerListener heroServicePlayerListener);

    void lQA(String str);

    void mNA(DynamicPlayerSettings dynamicPlayerSettings);

    boolean oHA(long j, VideoPlayRequest videoPlayRequest);

    void ob();

    boolean pHA(long j, VideoPlayRequest videoPlayRequest, boolean z, float f, boolean z2);

    boolean pSA(long j, float f);

    boolean rW(VideoPrefetchRequest videoPrefetchRequest);

    boolean tRA(long j, Surface surface, int i, int i2);

    boolean uRA(long j, int i, int i2);

    boolean xLA(long j, long j2, long j3);

    void zWA(VideoPlayRequest videoPlayRequest, Surface surface, int i, int i2, float f);
}
