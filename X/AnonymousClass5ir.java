package X;

import org.webrtc.StatsReport;
import org.webrtc.StatsReport.Value;

/* renamed from: X.5ir */
public class AnonymousClass5ir {
    /* renamed from: B */
    private final StatsReport f68453B;

    public AnonymousClass5ir(StatsReport statsReport) {
        this.f68453B = statsReport;
    }

    /* renamed from: A */
    public final double m28338A(String str, double d) {
        for (Value value : this.f68453B.values) {
            if (str.equals(value.name)) {
                return Double.parseDouble(value.value);
            }
        }
        return d;
    }

    /* renamed from: B */
    public final int m28339B(String str, int i) {
        for (Value value : this.f68453B.values) {
            if (str.equals(value.name)) {
                return Integer.parseInt(value.value);
            }
        }
        return i;
    }

    /* renamed from: C */
    public final long m28340C(String str, long j) {
        for (Value value : this.f68453B.values) {
            if (str.equals(value.name)) {
                return Long.parseLong(value.value);
            }
        }
        return j;
    }

    /* renamed from: D */
    public final String m28341D(String str, String str2) {
        for (Value value : this.f68453B.values) {
            if (str.equals(value.name)) {
                return value.value;
            }
        }
        return str2;
    }

    /* renamed from: E */
    public final boolean m28342E(String str, boolean z) {
        for (Value value : this.f68453B.values) {
            if (str.equals(value.name)) {
                return Boolean.parseBoolean(value.value);
            }
        }
        return z;
    }
}
