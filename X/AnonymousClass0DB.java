package X;

import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: X.0DB */
public class AnonymousClass0DB {
    /* renamed from: B */
    public final Context f1813B;
    /* renamed from: C */
    public final String f1814C;
    /* renamed from: D */
    public final UncaughtExceptionHandler f1815D;
    /* renamed from: E */
    public final boolean f1816E;
    /* renamed from: F */
    public final boolean f1817F;

    /* renamed from: B */
    public boolean mo220B(String str) {
        return true;
    }

    public AnonymousClass0DB(Context context, String str, boolean z, boolean z2, boolean z3) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null.");
        } else if (str != null) {
            this.f1813B = context;
            this.f1814C = str;
            this.f1816E = z;
            this.f1815D = Thread.getDefaultUncaughtExceptionHandler();
            this.f1817F = z3;
        } else {
            throw new IllegalArgumentException("Crash report url cannot be null.");
        }
    }

    /* renamed from: A */
    public AnonymousClass0DT mo219A() {
        return new AnonymousClass0DT(this);
    }
}
