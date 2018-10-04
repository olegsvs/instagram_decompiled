package X;

import android.os.Build.VERSION;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.1oo */
public final class AnonymousClass1oo extends IOException {
    /* renamed from: B */
    private int f23007B;
    /* renamed from: C */
    private final ArrayList f23008C;

    public AnonymousClass1oo(String str) {
        super(str);
        if (AnonymousClass1oo.m13325B()) {
            this.f23008C = null;
        } else {
            this.f23008C = new ArrayList();
        }
    }

    /* renamed from: A */
    public final void m13326A(IOException iOException) {
        if (AnonymousClass1oo.m13325B()) {
            AnonymousClass1on.m13324B(this, iOException);
        } else if (getCause() == null) {
            initCause(iOException);
        } else {
            this.f23008C.add(iOException);
        }
        this.f23007B++;
    }

    /* renamed from: B */
    private static boolean m13325B() {
        return VERSION.SDK_INT >= 19;
    }

    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (!AnonymousClass1oo.m13325B()) {
            int i = 0;
            while (i < this.f23008C.size()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Exception ");
                int i2 = i + 1;
                stringBuilder.append(i2);
                printStream.println(stringBuilder.toString());
                ((IOException) this.f23008C.get(i)).printStackTrace(printStream);
                i = i2;
            }
        }
    }

    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (!AnonymousClass1oo.m13325B()) {
            int i = 0;
            while (i < this.f23008C.size()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Exception ");
                int i2 = i + 1;
                stringBuilder.append(i2);
                printWriter.println(stringBuilder.toString());
                ((IOException) this.f23008C.get(i)).printStackTrace(printWriter);
                i = i2;
            }
        }
    }

    public final String toString() {
        String message = getMessage();
        if (message == null) {
            message = "NO MESSAGE";
        }
        return String.format("AggregateIOException (%d): %s", new Object[]{Integer.valueOf(this.f23007B), message});
    }
}
