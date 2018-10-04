package X;

import com.facebook.tslog.TimeSeriesLog;
import com.facebook.tslog.TimeSeriesStreamImpl;
import java.util.List;

/* renamed from: X.5if */
public final class AnonymousClass5if {
    /* renamed from: B */
    public final AnonymousClass6HK f68419B = new AnonymousClass6HK();
    /* renamed from: C */
    public final AnonymousClass6HL f68420C = new AnonymousClass6HL();
    /* renamed from: D */
    public final TimeSeriesStreamImpl f68421D;

    public AnonymousClass5if(TimeSeriesLog timeSeriesLog, String str) {
        List A = this.f68419B.mo6806A();
        A.addAll(this.f68420C.mo6807A());
        this.f68421D = new TimeSeriesStreamImpl(timeSeriesLog, str, A);
    }
}
