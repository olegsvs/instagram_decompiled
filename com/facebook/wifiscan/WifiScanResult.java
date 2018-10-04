package com.facebook.wifiscan;

import X.AnonymousClass0C9;
import X.AnonymousClass0Jy;
import X.AnonymousClass1hF;
import android.net.wifi.ScanResult;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class WifiScanResult implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1hF();
    /* renamed from: B */
    public final String f22012B;
    /* renamed from: C */
    public final String f22013C;
    /* renamed from: D */
    public final String f22014D;
    /* renamed from: E */
    public final Integer f22015E;
    /* renamed from: F */
    public final int f22016F;
    /* renamed from: G */
    public final String f22017G;
    /* renamed from: H */
    public final long f22018H;
    /* renamed from: I */
    public final String f22019I;

    public final int describeContents() {
        return 0;
    }

    public WifiScanResult(long j, String str, int i, String str2, Integer num, String str3) {
        this.f22018H = j;
        this.f22012B = str;
        this.f22016F = i;
        this.f22013C = str2;
        this.f22015E = num;
        this.f22014D = str3;
        this.f22017G = null;
        this.f22019I = null;
    }

    public WifiScanResult(long j, String str, int i, String str2, Integer num, String str3, String str4, String str5) {
        this.f22018H = j;
        this.f22012B = str;
        this.f22016F = i;
        this.f22013C = str2;
        this.f22015E = num;
        this.f22014D = str3;
        this.f22017G = str4;
        this.f22019I = str5;
    }

    public WifiScanResult(Parcel parcel) {
        this.f22018H = parcel.readLong();
        this.f22012B = parcel.readString();
        this.f22016F = parcel.readInt();
        this.f22013C = parcel.readString();
        this.f22015E = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.f22014D = parcel.readString();
        this.f22017G = parcel.readString();
        this.f22019I = parcel.readString();
    }

    /* renamed from: B */
    public static List m12792B(List list, AnonymousClass0Jy anonymousClass0Jy, AnonymousClass0C9 anonymousClass0C9) {
        if (list != null) {
            if (VERSION.SDK_INT >= 17) {
                List arrayList = new ArrayList();
                for (ScanResult scanResult : list) {
                    String charSequence;
                    if (VERSION.SDK_INT >= 23) {
                        charSequence = (scanResult.operatorFriendlyName == null || scanResult.operatorFriendlyName.length() <= 0) ? null : scanResult.operatorFriendlyName.toString();
                        list = (scanResult.venueName == null || scanResult.venueName.length() <= 0) ? null : scanResult.venueName.toString();
                    } else {
                        charSequence = null;
                        list = null;
                    }
                    arrayList.add(new WifiScanResult(anonymousClass0Jy.now() - (anonymousClass0C9.now() - (scanResult.timestamp / 1000)), scanResult.BSSID, scanResult.level, scanResult.SSID, Integer.valueOf(scanResult.frequency), scanResult.capabilities, charSequence, list));
                }
                return arrayList;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    WifiScanResult wifiScanResult = (WifiScanResult) obj;
                    if (this.f22018H == wifiScanResult.f22018H) {
                        if (this.f22016F == wifiScanResult.f22016F) {
                            String str = this.f22012B;
                            if (str != null) {
                                if (!str.equals(wifiScanResult.f22012B)) {
                                }
                            } else if (wifiScanResult.f22012B != null) {
                            }
                            str = this.f22013C;
                            if (str != null) {
                                if (!str.equals(wifiScanResult.f22013C)) {
                                }
                            } else if (wifiScanResult.f22013C != null) {
                            }
                            Integer num = this.f22015E;
                            if (num != null) {
                                if (!num.equals(wifiScanResult.f22015E)) {
                                }
                            } else if (wifiScanResult.f22015E != null) {
                            }
                            str = this.f22014D;
                            if (str != null) {
                                if (!str.equals(wifiScanResult.f22014D)) {
                                }
                            } else if (wifiScanResult.f22014D != null) {
                            }
                            str = this.f22017G;
                            if (str != null) {
                                if (!str.equals(wifiScanResult.f22017G)) {
                                }
                            } else if (wifiScanResult.f22017G != null) {
                            }
                            str = this.f22019I;
                            if (str != null) {
                                z = str.equals(wifiScanResult.f22019I);
                            } else if (wifiScanResult.f22019I != null) {
                                z = false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        long j = this.f22018H;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f22012B;
        int i2 = 0;
        i = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.f22016F) * 31;
        str = this.f22013C;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f22015E;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        str = this.f22014D;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f22017G;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f22019I;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f22018H);
        parcel.writeString(this.f22012B);
        parcel.writeInt(this.f22016F);
        parcel.writeString(this.f22013C);
        parcel.writeValue(this.f22015E);
        parcel.writeString(this.f22014D);
        parcel.writeString(this.f22017G);
        parcel.writeString(this.f22019I);
    }
}
