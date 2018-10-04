package X;

import android.os.Looper;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.00G */
public final class AnonymousClass00G {
    /* renamed from: B */
    public static void m17B(OutputStream outputStream, String str, String str2) {
        PrintWriter printWriter = new PrintWriter(outputStream);
        if (str != null) {
            printWriter.println(str);
            printWriter.println(str2);
        }
        Map allStackTraces = Thread.getAllStackTraces();
        Thread thread = Looper.getMainLooper().getThread();
        for (Entry entry : allStackTraces.entrySet()) {
            AnonymousClass00G.m18C(printWriter, (Thread) entry.getKey(), (StackTraceElement[]) entry.getValue());
        }
        if (!allStackTraces.containsKey(thread)) {
            AnonymousClass00G.m18C(printWriter, thread, thread.getStackTrace());
        }
        printWriter.flush();
    }

    /* renamed from: C */
    private static void m18C(PrintWriter printWriter, Thread thread, StackTraceElement[] stackTraceElementArr) {
        printWriter.print(thread);
        printWriter.print(" ");
        printWriter.print(thread.getState());
        printWriter.println(":");
        for (Object println : stackTraceElementArr) {
            printWriter.println(println);
        }
        printWriter.println();
    }
}
