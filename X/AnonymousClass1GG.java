package X;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.facebook.wifiscan.WifiScanResult;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.1GG */
public final class AnonymousClass1GG {
    /* renamed from: B */
    public final Context f16231B;
    /* renamed from: C */
    public final AnonymousClass1GL f16232C;
    /* renamed from: D */
    public ScheduledExecutorService f16233D;
    /* renamed from: E */
    public final AnonymousClass1i7 f16234E;
    /* renamed from: F */
    public final AnonymousClass0C9 f16235F;
    /* renamed from: G */
    public final AnonymousClass0Jy f16236G;
    /* renamed from: H */
    public final AnonymousClass1GM f16237H;

    public AnonymousClass1GG(Context context, AnonymousClass0Jy anonymousClass0Jy, AnonymousClass0C9 anonymousClass0C9, ScheduledExecutorService scheduledExecutorService, long j) {
        this(context, anonymousClass0Jy, anonymousClass0C9, scheduledExecutorService, new AnonymousClass1GL(context), new AnonymousClass1GM(anonymousClass0Jy, anonymousClass0C9, j), null);
    }

    public AnonymousClass1GG(Context context, AnonymousClass0Jy anonymousClass0Jy, AnonymousClass0C9 anonymousClass0C9, ScheduledExecutorService scheduledExecutorService, AnonymousClass1GL anonymousClass1GL, AnonymousClass1GM anonymousClass1GM, AnonymousClass1i7 anonymousClass1i7) {
        this.f16231B = context;
        this.f16236G = anonymousClass0Jy;
        this.f16235F = anonymousClass0C9;
        this.f16233D = scheduledExecutorService;
        this.f16232C = anonymousClass1GL;
        this.f16237H = anonymousClass1GM;
        this.f16234E = anonymousClass1i7;
    }

    /* renamed from: A */
    public final boolean m10445A() {
        if ((VERSION.SDK_INT >= 17 ? 1 : null) != null) {
            if (this.f16232C.m10469A()) {
                if (this.f16232C.m10471C()) {
                    if (this.f16232C.m10470B() || this.f16232C.m10472E()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public final WifiScanResult m10446B() {
        AnonymousClass1GL anonymousClass1GL = this.f16232C;
        Object obj = (AnonymousClass1GL.m10467C(anonymousClass1GL, "android.permission.ACCESS_WIFI_STATE") && AnonymousClass1GL.m10466B(anonymousClass1GL)) ? 1 : null;
        if (obj != null) {
            WifiInfo connectionInfo = ((WifiManager) this.f16231B.getSystemService("wifi")).getConnectionInfo();
            String ssid = connectionInfo != null ? connectionInfo.getSSID() : null;
            if (ssid != null) {
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(ssid);
                int last = characterInstance.last();
                if (last > 2) {
                    int codePointAt = ssid.codePointAt(0);
                    last--;
                    int codePointAt2 = ssid.codePointAt(last);
                    if (codePointAt == 34 && codePointAt2 == 34) {
                        ssid = ssid.substring(1, last);
                    }
                }
            }
            if (!(connectionInfo == null || TextUtils.isEmpty(connectionInfo.getBSSID()) || connectionInfo.getSupplicantState() != SupplicantState.COMPLETED)) {
                if (!AnonymousClass1GG.m10444B(ssid)) {
                    return new WifiScanResult(this.f16236G.now(), connectionInfo.getBSSID(), connectionInfo.getRssi(), ssid, VERSION.SDK_INT >= 21 ? Integer.valueOf(connectionInfo.getFrequency()) : null, null);
                }
            }
        }
        return null;
    }

    /* renamed from: B */
    private static boolean m10444B(String str) {
        return str != null && (str.endsWith("_nomap") || str.contains("_optout"));
    }

    /* renamed from: C */
    public final List m10447C(boolean z) {
        if (z || m10445A()) {
            List<ScanResult> scanResults = ((WifiManager) this.f16231B.getSystemService("wifi")).getScanResults();
            if (scanResults != null) {
                z = new ArrayList(scanResults.size());
                for (ScanResult scanResult : scanResults) {
                    if (!(scanResult == null || AnonymousClass1GG.m10444B(scanResult.SSID))) {
                        z.add(scanResult);
                    }
                }
                return z;
            }
        }
        return false;
    }
}
