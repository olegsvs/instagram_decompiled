package X;

import com.facebook.tslog.TimeSeriesLog;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5ig */
public abstract class AnonymousClass5ig {
    /* renamed from: B */
    public boolean f68422B;
    /* renamed from: C */
    public final AnonymousClass5ie f68423C;
    /* renamed from: D */
    public final Map f68424D = new HashMap();
    /* renamed from: E */
    public final TimeSeriesLog f68425E;

    /* renamed from: A */
    public abstract String m28332A();

    /* renamed from: B */
    public abstract String m28333B(String str);

    public AnonymousClass5ig(String str) {
        this.f68425E = new TimeSeriesLog(str, 60);
        this.f68423C = new AnonymousClass5ie(this.f68425E, m28332A());
    }
}
