package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: X.3np */
public final class AnonymousClass3np implements Callable {
    /* renamed from: B */
    public final /* synthetic */ Context f44646B;
    /* renamed from: C */
    public final /* synthetic */ boolean f44647C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass3nq f44648D;

    public AnonymousClass3np(AnonymousClass3nq anonymousClass3nq, Context context, boolean z) {
        this.f44648D = anonymousClass3nq;
        this.f44646B = context;
        this.f44647C = z;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        StringBuilder stringBuilder;
        if (this.f44648D.f44651D != null) {
            File file;
            Closeable fileInputStream;
            File file2 = null;
            if (this.f44648D.f44650C) {
                file = new File(AnonymousClass2NO.m15326G(this.f44646B, System.nanoTime(), "mp4", this.f44647C));
                if (!this.f44648D.f44649B) {
                    file2 = AnonymousClass1RC.F(this.f44648D.f44651D, file);
                    if (file2 != null) {
                        if (!file2.equals(file)) {
                            fileInputStream = new FileInputStream(file2);
                            AnonymousClass1Ag.B(fileInputStream, file);
                            AnonymousClass0Du.C(fileInputStream);
                        }
                        return file;
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to access file via cache or download. Product: ");
                    stringBuilder.append(this.f44648D.f44652E);
                    throw new IOException(stringBuilder.toString());
                }
            }
            if (this.f44647C) {
                file = AnonymousClass3Bb.m18929D(this.f44646B);
            } else {
                file = AnonymousClass3Bb.m18927B(this.f44646B);
            }
            if (file == null) {
                throw new IOException("Unable to generate photo file");
            } else if (!this.f44648D.f44649B) {
                Bitmap A = AnonymousClass0Gs.f2431j.A(this.f44648D.f44651D);
                if (A != null) {
                    file2 = new File(AnonymousClass3nk.m20690H(file.getParentFile().getAbsolutePath(), file.getName(), A, 0, false).f44605M);
                }
                if (file2 != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to access file via cache or download. Product: ");
                    stringBuilder.append(this.f44648D.f44652E);
                    throw new IOException(stringBuilder.toString());
                }
                if (file2.equals(file)) {
                    fileInputStream = new FileInputStream(file2);
                    AnonymousClass1Ag.B(fileInputStream, file);
                    AnonymousClass0Du.C(fileInputStream);
                }
                return file;
            }
            file2 = new File(this.f44648D.f44651D);
            if (file2 != null) {
                if (file2.equals(file)) {
                    fileInputStream = new FileInputStream(file2);
                    AnonymousClass1Ag.B(fileInputStream, file);
                    AnonymousClass0Du.C(fileInputStream);
                }
                return file;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to access file via cache or download. Product: ");
            stringBuilder.append(this.f44648D.f44652E);
            throw new IOException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("No source path specified: isLocalfile: ");
        stringBuilder.append(this.f44648D.f44649B);
        stringBuilder.append(", isVideo: ");
        stringBuilder.append(this.f44648D.f44650C);
        throw new IOException(stringBuilder.toString());
    }
}
