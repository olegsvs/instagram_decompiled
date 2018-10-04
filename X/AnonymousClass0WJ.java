package X;

import android.content.Context;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.0WJ */
public final class AnonymousClass0WJ extends SQLiteOpenHelper implements AnonymousClass0EJ {
    /* renamed from: D */
    public static AnonymousClass0WJ f5962D;
    /* renamed from: E */
    private static boolean f5963E;
    /* renamed from: B */
    private Context f5964B;
    /* renamed from: C */
    private SQLiteDatabase f5965C;

    private AnonymousClass0WJ(Context context, String str) {
        super(context, str, null, 10, new DefaultDatabaseErrorHandler());
        this.f5964B = context;
    }

    /* renamed from: A */
    public final synchronized SQLiteDatabase m5088A() {
        return this.f5965C;
    }

    /* renamed from: B */
    public final synchronized SQLiteDatabase m5089B() {
        SQLiteDatabase sQLiteDatabase;
        if (this.f5965C == null || !this.f5965C.isOpen()) {
            try {
                this.f5965C = getWritableDatabase();
            } catch (Throwable e) {
                AnonymousClass0WJ.m5086E(e);
                m5087F();
            }
            sQLiteDatabase = this.f5965C;
        } else {
            sQLiteDatabase = this.f5965C;
        }
        return sQLiteDatabase;
    }

    /* renamed from: B */
    public static synchronized void m5083B() {
        synchronized (AnonymousClass0WJ.class) {
            if (f5962D != null) {
                AnonymousClass0Fj.f2192B.m1669D(f5962D);
                f5962D.close();
                f5962D.m5087F();
            }
        }
    }

    /* renamed from: C */
    public static synchronized AnonymousClass0WJ m5084C() {
        AnonymousClass0WJ anonymousClass0WJ;
        synchronized (AnonymousClass0WJ.class) {
            if (!f5963E && f5962D == null) {
                f5962D = new AnonymousClass0WJ(AnonymousClass0EV.f1977B, "direct.db");
                AnonymousClass0Fj.f2192B.m1666A(f5962D);
            }
            anonymousClass0WJ = f5962D;
        }
        return anonymousClass0WJ;
    }

    /* renamed from: D */
    public static synchronized boolean m5085D() {
        boolean z;
        synchronized (AnonymousClass0WJ.class) {
            z = f5963E;
        }
        return z;
    }

    /* renamed from: E */
    public static synchronized void m5086E(Throwable th) {
        synchronized (AnonymousClass0WJ.class) {
            f5963E = true;
            AnonymousClass0Gn.m1880G("SQLite error", th);
        }
    }

    /* renamed from: F */
    private synchronized void m5087F() {
        this.f5964B.deleteDatabase("direct.db");
    }

    public final synchronized void close() {
        super.close();
        this.f5965C = null;
    }

    public final synchronized void onAppBackgrounded() {
        if (f5963E) {
            AnonymousClass0WJ.m5083B();
        }
    }

    public final void onAppForegrounded() {
        AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass1Su(this), -657780174);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass0WK.m5092D(1902326517);
        sQLiteDatabase.execSQL("create table if not exists threads(_id integer primary key autoincrement, user_id text, thread_id text, recipient_ids text, last_activity_time integer, is_permitted integer, thread_info text not null);");
        AnonymousClass0WK.m5092D(1829703948);
        AnonymousClass0WK.m5092D(-150865734);
        sQLiteDatabase.execSQL("create table if not exists messages(_id integer primary key autoincrement, user_id text, server_item_id text, client_item_id text, thread_id text, recipient_ids text, timestamp integer not null, message_type text not null, text text, message text not null);");
        AnonymousClass0WK.m5092D(1807539015);
        String str = AnonymousClass0WP.f5972B;
        AnonymousClass0WK.m5092D(1503657172);
        sQLiteDatabase.execSQL(str);
        AnonymousClass0WK.m5092D(-613251984);
        AnonymousClass0WK.m5092D(893400956);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS session(user_id TEXT PRIMARY KEY, value TEXT NOT NULL);");
        AnonymousClass0WK.m5092D(-1271113053);
        AnonymousClass0WK.m5092D(1943654085);
        sQLiteDatabase.execSQL("create table if not exists mutations(_id integer primary key autoincrement, user_id text, mutation_type text not null, mutation text not null);");
        AnonymousClass0WK.m5092D(-1266955529);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 7) {
            AnonymousClass0WK.m5092D(-640311892);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS threads;");
            AnonymousClass0WK.m5092D(1526340597);
            String str = AnonymousClass0WP.f5973C;
            AnonymousClass0WK.m5092D(1422422916);
            sQLiteDatabase.execSQL(str);
            AnonymousClass0WK.m5092D(-1043425940);
            AnonymousClass0WK.m5092D(-1863924044);
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS threadId;");
            AnonymousClass0WK.m5092D(-1003599669);
            AnonymousClass0WK.m5092D(498912684);
            sQLiteDatabase.execSQL("create table if not exists threads(_id integer primary key autoincrement, user_id text, thread_id text, recipient_ids text, last_activity_time integer, is_permitted integer, thread_info text not null);");
            AnonymousClass0WK.m5092D(-2050498375);
            AnonymousClass0WK.m5092D(1362052393);
            sQLiteDatabase.execSQL("create table if not exists messages(_id integer primary key autoincrement, user_id text, server_item_id text, client_item_id text, thread_id text, recipient_ids text, timestamp integer not null, message_type text not null, text text, message text not null);");
            AnonymousClass0WK.m5092D(2075689962);
            str = AnonymousClass0WP.f5972B;
            AnonymousClass0WK.m5092D(82797439);
            sQLiteDatabase.execSQL(str);
            AnonymousClass0WK.m5092D(1046864755);
        }
        if (i < 8) {
            AnonymousClass0WK.m5092D(-1414068031);
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS session(user_id TEXT PRIMARY KEY, value TEXT NOT NULL);");
            AnonymousClass0WK.m5092D(1827860505);
        }
        if (i < 9) {
            AnonymousClass0WK.m5092D(1073279003);
            sQLiteDatabase.execSQL("create table if not exists mutations(_id integer primary key autoincrement, user_id text, mutation_type text not null, mutation text not null);");
            AnonymousClass0WK.m5092D(-1379518917);
        }
        if (i < 10) {
            if (i == 9) {
                str = AnonymousClass0WL.f5967B;
                AnonymousClass0WK.m5092D(14408968);
                sQLiteDatabase.execSQL(str);
                AnonymousClass0WK.m5092D(2059822209);
            }
            AnonymousClass0WK.m5092D(911876633);
            sQLiteDatabase.execSQL("create table if not exists mutations(_id integer primary key autoincrement, user_id text, mutation_type text not null, mutation text not null);");
            AnonymousClass0WK.m5092D(809824819);
        }
    }
}
