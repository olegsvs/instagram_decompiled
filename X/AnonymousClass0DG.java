package X;

import java.io.File;

/* renamed from: X.0DG */
public final class AnonymousClass0DG implements AnonymousClass0DH {
    public final boolean zU(AnonymousClass0DE anonymousClass0DE, AnonymousClass1Jc anonymousClass1Jc, String str) {
        File file = anonymousClass1Jc.f17092C;
        String name = file.getName();
        try {
            AnonymousClass1Jd H = AnonymousClass0DE.m1115H(anonymousClass0DE, anonymousClass1Jc);
            if (H != null) {
                H.put("ACRA_REPORT_TYPE", AnonymousClass0DF.ACRA_CRASH_REPORT.name());
                H.put("ACRA_REPORT_FILENAME", name);
                H.put("UPLOADED_BY_PROCESS", str);
                AnonymousClass0DE.m1121N(anonymousClass0DE, H);
                AnonymousClass0DE.m1110C(file);
            }
            return true;
        } catch (Throwable e) {
            AnonymousClass0Dc.m1246I(AnonymousClass0DL.f1858B, e, "Failed to send crash reports", new Object[0]);
            AnonymousClass0DE.m1110C(file);
            return false;
        } catch (Throwable e2) {
            AnonymousClass0Dc.m1246I(AnonymousClass0DL.f1858B, e2, "Failed to load crash report for %s", name);
            AnonymousClass0DE.m1110C(file);
            return false;
        } catch (Throwable e22) {
            AnonymousClass0Dc.m1246I(AnonymousClass0DL.f1858B, e22, "Failed to send crash report for %s", name);
            return false;
        }
    }
}
