package X;

import android.os.Process;
import android.util.Log;
import com.facebook.profilo.provider.stacktrace.CPUProfiler;
import com.facebook.profilo.provider.stacktrace.StackFrameThread;

/* renamed from: X.01T */
public final class AnonymousClass01T implements Runnable {
    public AnonymousClass01T(StackFrameThread stackFrameThread) {
    }

    public final void run() {
        Process.setThreadPriority(0);
        try {
            CPUProfiler.loggerLoop();
        } catch (Throwable e) {
            Log.e("StackFrameThread", e.getMessage(), e);
        }
    }
}
