package X;

import com.facebook.jni.NativeSoftErrorReporterProxy;
import java.util.List;

/* renamed from: X.01F */
public final class AnonymousClass01F implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Bk f150B;
    /* renamed from: C */
    public final /* synthetic */ List f151C;

    public AnonymousClass01F(List list, AnonymousClass1Bk anonymousClass1Bk) {
        this.f151C = list;
        this.f150B = anonymousClass1Bk;
    }

    public final void run() {
        if (NativeSoftErrorReporterProxy.shouldReportNativeSoftErrors() == AnonymousClass0K7.YES) {
            for (AnonymousClass1sx softReport : this.f151C) {
                this.f150B.softReport(softReport);
            }
        }
    }
}
