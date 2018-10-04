package X;

import com.facebook.analytics.appstatelogger.AppStateLoggerNative;
import java.io.ByteArrayOutputStream;

/* renamed from: X.1p3 */
public final class AnonymousClass1p3 extends ByteArrayOutputStream {
    public final void flush() {
        if (this.count == this.buf.length) {
            AppStateLoggerNative.setBreakpadStreamData(this.buf);
        } else {
            AppStateLoggerNative.setBreakpadStreamData(toByteArray());
        }
    }
}
