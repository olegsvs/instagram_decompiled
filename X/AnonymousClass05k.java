package X;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.UUID;

/* renamed from: X.05k */
public final class AnonymousClass05k {
    /* renamed from: B */
    public final File f188B;

    public AnonymousClass05k(Context context, String str) {
        this.f188B = AnonymousClass05g.m342C(context, str);
    }

    /* renamed from: A */
    public final void m346A(AnonymousClass05j anonymousClass05j) {
        if (!(this.f188B.exists() || this.f188B.mkdir())) {
            AnonymousClass0Dc.m1243F("AnalyticsStorage", "Unable to open analytics storage.");
        }
        File file = this.f188B;
        String str = "%s_%d.batch";
        Object[] objArr = new Object[2];
        if (anonymousClass05j.f186I == null) {
            anonymousClass05j.f186I = UUID.randomUUID();
        }
        objArr[0] = anonymousClass05j.f186I.toString();
        objArr[1] = Integer.valueOf(anonymousClass05j.f185H);
        File file2 = new File(file, AnonymousClass1Cn.m9922B(str, objArr));
        if (file2.exists() && !file2.delete()) {
            AnonymousClass0Dc.m1255R("AnalyticsStorage", "File %s was not deleted", file2);
        }
        anonymousClass05j.f187J = System.currentTimeMillis();
        try {
            OutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF8");
                try {
                    outputStreamWriter.write(anonymousClass05j.toString());
                } catch (Throwable e) {
                    AnonymousClass0Dc.m1256S("AnalyticsStorage", e, "failed to write session to file", new Object[0]);
                } catch (Throwable th) {
                    try {
                        outputStreamWriter.close();
                    } catch (Throwable e2) {
                        AnonymousClass0Dc.m1256S("AnalyticsStorage", e2, "failed to close writer", new Object[0]);
                    }
                }
                try {
                    outputStreamWriter.close();
                } catch (Throwable e22) {
                    AnonymousClass0Dc.m1256S("AnalyticsStorage", e22, "failed to close writer", new Object[0]);
                }
            } catch (Throwable e3) {
                str = "AnalyticsStorage";
                AnonymousClass0Dc.m1256S(str, e3, "UTF8 encoding is not supported", new Object[0]);
                try {
                    fileOutputStream.close();
                } catch (Throwable e32) {
                    AnonymousClass0Dc.m1256S(str, e32, "failed to close output stream", new Object[0]);
                }
            }
        } catch (Throwable e222) {
            AnonymousClass0Dc.m1256S("AnalyticsStorage", e222, "Batch file creation failed %s", file2);
        }
    }
}
