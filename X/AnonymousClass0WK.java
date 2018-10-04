package X;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.profilo.logger.Logger;

/* renamed from: X.0WK */
public final class AnonymousClass0WK {
    /* renamed from: B */
    public static final ThreadLocal f5966B = new AnonymousClass1fA();

    /* renamed from: B */
    public static void m5090B(SQLiteDatabase sQLiteDatabase, int i) {
        Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1519I, 30, i);
        sQLiteDatabase.beginTransaction();
        f5966B.set(Boolean.TRUE);
    }

    /* renamed from: C */
    public static void m5091C(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            sQLiteDatabase.endTransaction();
            if (!sQLiteDatabase.inTransaction()) {
                f5966B.set(Boolean.FALSE);
            }
            Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1519I, 31, i);
        } catch (Throwable th) {
            Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1519I, 31, i);
        }
    }

    /* renamed from: D */
    public static void m5092D(int i) {
        if (f5966B.get() == Boolean.FALSE) {
            Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1519I, 25, i);
        }
    }
}
