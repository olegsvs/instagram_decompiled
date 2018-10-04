package com.facebook.browser.lite.ipc;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.forker.Process;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.List;
import java.util.Map;
import org.webrtc.audio.WebRtcAudioRecord;

public interface BrowserLiteCallback extends IInterface {

    public abstract class Stub extends Binder implements BrowserLiteCallback {

        public final class Proxy implements BrowserLiteCallback {
            /* renamed from: B */
            private IBinder f30202B;

            public Proxy(IBinder iBinder) {
                int I = AnonymousClass0cQ.I(this, 1327775068);
                this.f30202B = iBinder;
                AnonymousClass0cQ.H(this, -138292883, I);
            }

            public final void AD(String str, Map map) {
                int I = AnonymousClass0cQ.I(this, 1193053025);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.f30202B.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -2143635986, I);
                }
            }

            public final void BVA() {
                int I = AnonymousClass0cQ.I(this, 685623560);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    this.f30202B.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -1506200468, I);
                }
            }

            public final void Ct(String str, int i) {
                int I = AnonymousClass0cQ.I(this, 217473372);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f30202B.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 327214321, I);
                }
            }

            public final boolean DV(String str, String str2) {
                int I = AnonymousClass0cQ.I(this, -1970581553);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.f30202B.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -2115193814, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -828393000, I);
                }
            }

            public final void Et(String str, Bundle bundle, int i, long j) {
                int I = AnonymousClass0cQ.I(this, 2086073855);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.f30202B.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -1456072416, I);
                }
            }

            public final void IZ(String str) {
                int I = AnonymousClass0cQ.I(this, -37818060);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.f30202B.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1898825193, I);
                }
            }

            public final void Jp(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
                int I = AnonymousClass0cQ.I(this, 2002744335);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (browserLiteJSBridgeCall != null) {
                        obtain.writeInt(1);
                        browserLiteJSBridgeCall.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(browserLiteJSBridgeCallback != null ? browserLiteJSBridgeCallback.asBinder() : null);
                    this.f30202B.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1361320787, I);
                }
            }

            public final void Mt(String str, String str2, Bundle bundle) {
                int I = AnonymousClass0cQ.I(this, -1619222897);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30202B.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -565490210, I);
                }
            }

            public final void PE(Bundle bundle) {
                int I = AnonymousClass0cQ.I(this, -41538863);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30202B.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 953622633, I);
                }
            }

            public final void Tt(String str, boolean z) {
                int I = AnonymousClass0cQ.I(this, 789289479);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.f30202B.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -109395752, I);
                }
            }

            public final void UVA() {
                int I = AnonymousClass0cQ.I(this, 53440699);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    this.f30202B.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -957228098, I);
                }
            }

            public final void Vm() {
                int I = AnonymousClass0cQ.I(this, 49581761);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    this.f30202B.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 660425260, I);
                }
            }

            public final void Za(String str, long j, long j2, long j3, long j4, long j5, int i, boolean z, boolean z2, boolean z3, Map map, boolean z4, String str2, Map map2) {
                int I = AnonymousClass0cQ.I(this, -93734897);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeLong(j3);
                    obtain.writeLong(j4);
                    obtain.writeLong(j5);
                    obtain.writeInt(i);
                    int i2 = 1;
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeInt(z3 ? 1 : 0);
                    obtain.writeMap(map);
                    if (!z4) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    obtain.writeMap(map2);
                    this.f30202B.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -511632940, I);
                }
            }

            public final void Zv(Map map) {
                int I = AnonymousClass0cQ.I(this, -1769196388);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    this.f30202B.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1160342537, I);
                }
            }

            public final IBinder asBinder() {
                int I = AnonymousClass0cQ.I(this, 1291148035);
                IBinder iBinder = this.f30202B;
                AnonymousClass0cQ.H(this, 281641695, I);
                return iBinder;
            }

            public final void cc(Bundle bundle) {
                int I = AnonymousClass0cQ.I(this, 182880575);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30202B.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 372970802, I);
                }
            }

            public final void dKA(long[] jArr) {
                int I = AnonymousClass0cQ.I(this, 317590044);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeLongArray(jArr);
                    this.f30202B.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -975451074, I);
                }
            }

            public final void gZ(String str, Map map) {
                int I = AnonymousClass0cQ.I(this, 1534203115);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.f30202B.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1827450648, I);
                }
            }

            public final void hx(String str, Bundle bundle) {
                int I = AnonymousClass0cQ.I(this, -1172591131);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30202B.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -766818921, I);
                }
            }

            public final void kU(String str) {
                int I = AnonymousClass0cQ.I(this, 1759965785);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.f30202B.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1263883452, I);
                }
            }

            public final void lVA(Bundle bundle) {
                int I = AnonymousClass0cQ.I(this, 1870301993);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30202B.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -38927022, I);
                }
            }

            public final void lz() {
                int I = AnonymousClass0cQ.I(this, 463162871);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    this.f30202B.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -504628911, I);
                }
            }

            public final PrefetchCacheEntry nP(String str) {
                int I = AnonymousClass0cQ.I(this, -1265314492);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.f30202B.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    PrefetchCacheEntry prefetchCacheEntry = obtain2.readInt() != 0 ? (PrefetchCacheEntry) PrefetchCacheEntry.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1591116145, I);
                    return prefetchCacheEntry;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 407969762, I);
                }
            }

            public final List oP() {
                int I = AnonymousClass0cQ.I(this, -306861057);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    this.f30202B.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    List createStringArrayList = obtain2.createStringArrayList();
                    return createStringArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1495120046, I);
                }
            }

            public final String pb(String str) {
                int I = AnonymousClass0cQ.I(this, -1704342652);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.f30202B.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 8888453, I);
                }
            }

            public final void ph(String str, Bundle bundle) {
                int I = AnonymousClass0cQ.I(this, -1678923046);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30202B.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1685312379, I);
                }
            }

            public final void qa(Bundle bundle) {
                int I = AnonymousClass0cQ.I(this, 221245994);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30202B.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -1692444359, I);
                }
            }

            public final int rU(String str) {
                int I = AnonymousClass0cQ.I(this, -375372880);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.f30202B.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -1255314008, I);
                }
            }

            public final void sa(Map map) {
                int I = AnonymousClass0cQ.I(this, -1872063519);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    this.f30202B.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1777643821, I);
                }
            }

            public final boolean tU(String str) {
                int I = AnonymousClass0cQ.I(this, 1958676339);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    boolean z = false;
                    this.f30202B.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -1679208288, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 2059432252, I);
                }
            }

            public final void uEA(Bundle bundle, String str) {
                int I = AnonymousClass0cQ.I(this, 991632442);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    this.f30202B.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 318205377, I);
                }
            }

            public final boolean wU(String str, String str2) {
                int I = AnonymousClass0cQ.I(this, 482899064);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.f30202B.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 774757467, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -2050002798, I);
                }
            }

            public final void wb() {
                int I = AnonymousClass0cQ.I(this, 352142775);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    this.f30202B.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -1026459867, I);
                }
            }

            public final void wn(String str, List list) {
                int I = AnonymousClass0cQ.I(this, 1057898864);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeList(list);
                    this.f30202B.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 375085294, I);
                }
            }

            public final void xEA(Map map, Bundle bundle) {
                int I = AnonymousClass0cQ.I(this, 59897858);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeMap(map);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f30202B.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -1893171265, I);
                }
            }

            public final void xPA(String str) {
                int I = AnonymousClass0cQ.I(this, -1263644109);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.f30202B.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 483150133, I);
                }
            }

            public final boolean xU(String str) {
                int I = AnonymousClass0cQ.I(this, 789039959);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    boolean z = false;
                    this.f30202B.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1808923312, I);
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 726175430, I);
                }
            }

            public final void yU(String str, String str2) {
                int I = AnonymousClass0cQ.I(this, -832992702);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f30202B.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -1539986686, I);
                }
            }

            public final void yy(String str) {
                int I = AnonymousClass0cQ.I(this, -1489378407);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    this.f30202B.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, -1408367893, I);
                }
            }

            public final void zk(String str, String str2, Map map) {
                int I = AnonymousClass0cQ.I(this, -360860644);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeMap(map);
                    this.f30202B.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                    AnonymousClass0cQ.H(this, 1348989266, I);
                }
            }
        }

        public Stub() {
            int I = AnonymousClass0cQ.I(this, -48400316);
            attachInterface(this, "com.facebook.browser.lite.ipc.BrowserLiteCallback");
            AnonymousClass0cQ.H(this, -1722318555, I);
        }

        /* renamed from: B */
        public static BrowserLiteCallback m15607B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BrowserLiteCallback)) {
                return new Proxy(iBinder);
            }
            return (BrowserLiteCallback) queryLocalInterface;
        }

        public final IBinder asBinder() {
            AnonymousClass0cQ.H(this, 1416617752, AnonymousClass0cQ.I(this, 1175971799));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int I = AnonymousClass0cQ.I(this, -818611076);
            int i3 = i;
            Parcel parcel3 = parcel2;
            if (i3 != 1598968902) {
                boolean z = false;
                Bundle bundle = null;
                Parcel parcel4 = parcel;
                boolean DV;
                String readString;
                String readString2;
                switch (i) {
                    case 1:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        int rU = rU(parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(rU);
                        AnonymousClass0cQ.H(r7, -1944335588, I);
                        return true;
                    case 2:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        DV = DV(parcel4.readString(), parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(DV);
                        AnonymousClass0cQ.H(r7, -399314222, I);
                        return true;
                    case 3:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        DV = wU(parcel4.readString(), parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(DV);
                        AnonymousClass0cQ.H(r7, -63857050, I);
                        return true;
                    case 4:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        readString = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        ph(readString, bundle);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 2059839948, I);
                        return true;
                    case 5:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        readString = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        hx(readString, bundle);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, -187436399, I);
                        return true;
                    case 6:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString3 = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            z = true;
                        }
                        Tt(readString3, z);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, -1453286992, I);
                        return true;
                    case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        readString2 = parcel4.readString();
                        long readLong = parcel4.readLong();
                        long readLong2 = parcel4.readLong();
                        long readLong3 = parcel4.readLong();
                        long readLong4 = parcel4.readLong();
                        long readLong5 = parcel4.readLong();
                        int readInt = parcel4.readInt();
                        boolean z2 = parcel4.readInt() != 0;
                        boolean z3 = parcel4.readInt() != 0;
                        boolean z4 = parcel4.readInt() != 0;
                        ClassLoader classLoader = getClass().getClassLoader();
                        Za(readString2, readLong, readLong2, readLong3, readLong4, readLong5, readInt, z2, z3, z4, parcel4.readHashMap(classLoader), parcel4.readInt() != 0 ? true : null, parcel4.readString(), parcel4.readHashMap(classLoader));
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 839953869, I);
                        return true;
                    case 8:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String readString4 = parcel4.readString();
                        readString = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        Mt(readString4, readString, bundle);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1406756368, I);
                        return true;
                    case 9:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        readString2 = parcel4.readString();
                        if (parcel4.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        Et(readString2, bundle, parcel4.readInt(), parcel4.readLong());
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, -1257231161, I);
                        return true;
                    case 10:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        Ct(parcel4.readString(), parcel4.readInt());
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1692036673, I);
                        return true;
                    case 11:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        dKA(parcel4.createLongArray());
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, -2018392114, I);
                        return true;
                    case 12:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        zk(parcel4.readString(), parcel4.readString(), parcel4.readHashMap(getClass().getClassLoader()));
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1034486704, I);
                        return true;
                    case ParserMinimalBase.INT_CR /*13*/:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        Zv(parcel4.readHashMap(getClass().getClassLoader()));
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1724300810, I);
                        return true;
                    case 14:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        Map readHashMap = parcel4.readHashMap(getClass().getClassLoader());
                        if (parcel4.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        xEA(readHashMap, bundle);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1100877756, I);
                        return true;
                    case 15:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        yU(parcel4.readString(), parcel4.readString());
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1726773204, I);
                        return true;
                    case 16:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        yy(parcel4.readString());
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, -1095503459, I);
                        return true;
                    case 17:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        List oP = oP();
                        parcel3.writeNoException();
                        parcel3.writeStringList(oP);
                        AnonymousClass0cQ.H(r7, -80049066, I);
                        return true;
                    case Process.SIGCONT /*18*/:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        PrefetchCacheEntry nP = nP(parcel4.readString());
                        parcel3.writeNoException();
                        if (nP != null) {
                            parcel3.writeInt(1);
                            nP.writeToParcel(parcel3, 1);
                        } else {
                            parcel3.writeInt(0);
                        }
                        AnonymousClass0cQ.H(r7, 658343132, I);
                        return true;
                    case Process.SIGSTOP /*19*/:
                        BrowserLiteJSBridgeCall browserLiteJSBridgeCall;
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            browserLiteJSBridgeCall = (BrowserLiteJSBridgeCall) BrowserLiteJSBridgeCall.CREATOR.createFromParcel(parcel4);
                        }
                        Jp(browserLiteJSBridgeCall, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback.Stub.m15608B(parcel4.readStrongBinder()));
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 2050278334, I);
                        return true;
                    case Process.SIGTSTP /*20*/:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        UVA();
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, -743945871, I);
                        return true;
                    case 21:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        wn(parcel4.readString(), parcel4.readArrayList(getClass().getClassLoader()));
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, -414894584, I);
                        return true;
                    case 22:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        DV = xU(parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(DV);
                        AnonymousClass0cQ.H(r7, -1395503337, I);
                        return true;
                    case 23:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        String pb = pb(parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeString(pb);
                        AnonymousClass0cQ.H(r7, -1466522190, I);
                        return true;
                    case 24:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        IZ(parcel4.readString());
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, -1083752603, I);
                        return true;
                    case 25:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        PE(bundle);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1909476050, I);
                        return true;
                    case 26:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        lVA(bundle);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 602813050, I);
                        return true;
                    case 27:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        xPA(parcel4.readString());
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1892857333, I);
                        return true;
                    case 28:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        wb();
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, -1841641417, I);
                        return true;
                    case 29:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        cc(bundle);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1868002158, I);
                        return true;
                    case 30:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        uEA(bundle, parcel4.readString());
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, -1870627949, I);
                        return true;
                    case 31:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        Vm();
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1238381958, I);
                        return true;
                    case 32:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        DV = tU(parcel4.readString());
                        parcel3.writeNoException();
                        parcel3.writeInt(DV);
                        AnonymousClass0cQ.H(r7, -1279049327, I);
                        return true;
                    case 33:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        if (parcel4.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel4);
                        }
                        qa(bundle);
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1477169871, I);
                        return true;
                    case ParserMinimalBase.INT_QUOTE /*34*/:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        sa(parcel4.readHashMap(getClass().getClassLoader()));
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1761801692, I);
                        return true;
                    case 35:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        BVA();
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1481754254, I);
                        return true;
                    case 36:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        kU(parcel4.readString());
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 2025442125, I);
                        return true;
                    case 37:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        gZ(parcel4.readString(), parcel4.readHashMap(getClass().getClassLoader()));
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, -166881445, I);
                        return true;
                    case 38:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        AD(parcel4.readString(), parcel4.readHashMap(getClass().getClassLoader()));
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 1498733394, I);
                        return true;
                    case ParserMinimalBase.INT_APOSTROPHE /*39*/:
                        parcel4.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                        lz();
                        parcel3.writeNoException();
                        AnonymousClass0cQ.H(r7, 862389459, I);
                        return true;
                    default:
                        boolean onTransact = super.onTransact(i3, parcel4, parcel3, i2);
                        AnonymousClass0cQ.H(r7, -84760263, I);
                        return onTransact;
                }
            }
            parcel3.writeString("com.facebook.browser.lite.ipc.BrowserLiteCallback");
            AnonymousClass0cQ.H(r7, -1800119072, I);
            return true;
        }
    }

    void AD(String str, Map map);

    void BVA();

    void Ct(String str, int i);

    boolean DV(String str, String str2);

    void Et(String str, Bundle bundle, int i, long j);

    void IZ(String str);

    void Jp(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback);

    void Mt(String str, String str2, Bundle bundle);

    void PE(Bundle bundle);

    void Tt(String str, boolean z);

    void UVA();

    void Vm();

    void Za(String str, long j, long j2, long j3, long j4, long j5, int i, boolean z, boolean z2, boolean z3, Map map, boolean z4, String str2, Map map2);

    void Zv(Map map);

    void cc(Bundle bundle);

    void dKA(long[] jArr);

    void gZ(String str, Map map);

    void hx(String str, Bundle bundle);

    void kU(String str);

    void lVA(Bundle bundle);

    void lz();

    PrefetchCacheEntry nP(String str);

    List oP();

    String pb(String str);

    void ph(String str, Bundle bundle);

    void qa(Bundle bundle);

    int rU(String str);

    void sa(Map map);

    boolean tU(String str);

    void uEA(Bundle bundle, String str);

    boolean wU(String str, String str2);

    void wb();

    void wn(String str, List list);

    void xEA(Map map, Bundle bundle);

    void xPA(String str);

    boolean xU(String str);

    void yU(String str, String str2);

    void yy(String str);

    void zk(String str, String str2, Map map);
}
