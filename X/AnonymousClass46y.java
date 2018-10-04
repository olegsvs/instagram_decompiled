package X;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import com.facebook.blescan.BleScanResult;
import java.util.List;

/* renamed from: X.46y */
public final class AnonymousClass46y extends ScanCallback {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1GP f50386B;

    public AnonymousClass46y(AnonymousClass1GP anonymousClass1GP) {
        this.f50386B = anonymousClass1GP;
    }

    public final void onBatchScanResults(List list) {
        super.onBatchScanResults(list);
        for (ScanResult onScanResult : list) {
            onScanResult(1, onScanResult);
        }
    }

    public final void onScanFailed(int i) {
        super.onScanFailed(i);
        this.f50386B.f16277B = i;
    }

    public final void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        BleScanResult B = AnonymousClass1GP.B(this.f50386B, scanResult);
        if (B == null) {
            return;
        }
        if (this.f50386B.f16278C.isEmpty()) {
            synchronized (this.f50386B.f16279D) {
                this.f50386B.f16279D.add(B);
            }
            return;
        }
        for (AnonymousClass46w onBleScanResult : this.f50386B.f16278C) {
            onBleScanResult.onBleScanResult(B);
        }
    }
}
