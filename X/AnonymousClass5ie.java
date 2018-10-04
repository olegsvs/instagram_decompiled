package X;

import com.facebook.tslog.TimeSeriesLog;
import com.facebook.tslog.TimeSeriesStreamImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.5ie */
public final class AnonymousClass5ie {
    /* renamed from: B */
    public final AnonymousClass5id f68415B = new AnonymousClass5id();
    /* renamed from: C */
    public final AnonymousClass6HI f68416C = new AnonymousClass6HI();
    /* renamed from: D */
    public final AnonymousClass6HJ f68417D = new AnonymousClass6HJ();
    /* renamed from: E */
    public final TimeSeriesStreamImpl f68418E;

    public AnonymousClass5ie(TimeSeriesLog timeSeriesLog, String str) {
        AnonymousClass5id anonymousClass5id = this.f68415B;
        List arrayList = new ArrayList(Arrays.asList(new AnonymousClass5eu[]{anonymousClass5id.f68410D, anonymousClass5id.f68409C, anonymousClass5id.f68411E, anonymousClass5id.f68414H, anonymousClass5id.f68413G, anonymousClass5id.f68412F, anonymousClass5id.f68408B}));
        arrayList.addAll(this.f68416C.mo6806A());
        arrayList.addAll(this.f68417D.mo6807A());
        this.f68418E = new TimeSeriesStreamImpl(timeSeriesLog, str, arrayList);
    }
}
