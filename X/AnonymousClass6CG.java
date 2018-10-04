package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.6CG */
public final class AnonymousClass6CG extends SQLiteOpenHelper implements AnonymousClass5eN {
    /* renamed from: B */
    private final Object f72885B = new Object();

    public AnonymousClass6CG(Context context) {
        super(context, "contacts_db2", null, 201);
    }

    /* renamed from: B */
    private static boolean m29411B(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z = "PRAGMA table_info(contacts_upload_snapshot)";
        sQLiteDatabase = sQLiteDatabase.rawQuery(z, null);
        while (sQLiteDatabase.moveToNext()) {
            try {
                z = true;
                if (str.equalsIgnoreCase(sQLiteDatabase.getString(1))) {
                    return z;
                }
            } finally {
                sQLiteDatabase.close();
            }
        }
        sQLiteDatabase.close();
        return false;
    }

    /* renamed from: C */
    private static void m29412C(SQLiteDatabase sQLiteDatabase) {
        if (!AnonymousClass6CG.m29411B(sQLiteDatabase, "contact_extra_fields_hash")) {
            AnonymousClass0WK.D(-1058174775);
            sQLiteDatabase.execSQL("ALTER TABLE contacts_upload_snapshot ADD COLUMN contact_extra_fields_hash TEXT;");
            AnonymousClass0WK.D(-945807519);
        }
    }

    public final void SWA(X.AnonymousClass5eR r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        if (r7 == 0) goto L_0x003c;
    L_0x0002:
        r5 = r6.getWritableDatabase();
        r4 = new android.content.ContentValues;
        r4.<init>();
        r2 = "local_contact_id";
        r0 = r7.f67787D;
        r0 = java.lang.Long.valueOf(r0);
        r4.put(r2, r0);
        r1 = "contact_hash";
        r0 = r7.f67786C;
        r4.put(r1, r0);
        if (r5 == 0) goto L_0x0035;
    L_0x001f:
        r3 = r6.f72885B;
        monitor-enter(r3);
        r2 = "contacts_upload_snapshot";	 Catch:{ SQLiteException -> 0x0038 }
        r1 = 0;	 Catch:{ SQLiteException -> 0x0038 }
        r0 = -176569947; // 0xfffffffff579c1a5 float:-3.1660388E32 double:NaN;	 Catch:{ SQLiteException -> 0x0038 }
        X.AnonymousClass0WK.D(r0);	 Catch:{ SQLiteException -> 0x0038 }
        r5.replaceOrThrow(r2, r1, r4);	 Catch:{ SQLiteException -> 0x0038 }
        r0 = 568650322; // 0x21e4ea52 float:1.5511905E-18 double:2.809505886E-315;	 Catch:{ SQLiteException -> 0x0038 }
        X.AnonymousClass0WK.D(r0);	 Catch:{ SQLiteException -> 0x0038 }
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
    L_0x0035:
        return;	 Catch:{ all -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        goto L_0x003a;
    L_0x0038:
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        goto L_0x0035;	 Catch:{ all -> 0x0036 }
    L_0x003a:
        monitor-exit(r3);	 Catch:{ all -> 0x0036 }
        throw r0;
    L_0x003c:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "Attempting to add a null entry tocontacts_db2";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.6CG.SWA(X.5eR):void");
    }

    public final void XE() {
        getWritableDatabase().delete("contacts_upload_snapshot", null, null);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass0WK.D(1099882532);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS contacts_upload_snapshot (local_contact_id INTEGER PRIMARY KEY, contact_hash TEXT, contact_extra_fields_hash TEXT);");
        AnonymousClass0WK.D(394701484);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != 200) {
            AnonymousClass0WK.D(-288956788);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contacts_upload_snapshot");
            AnonymousClass0WK.D(-638734661);
            onCreate(sQLiteDatabase);
            return;
        }
        AnonymousClass6CG.m29412C(sQLiteDatabase);
    }

    public final void qJA(X.AnonymousClass5eR r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        if (r6 == 0) goto L_0x0035;
    L_0x0002:
        r4 = r5.getWritableDatabase();
        if (r4 == 0) goto L_0x002e;
    L_0x0008:
        r3 = r5.f72885B;
        monitor-enter(r3);
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x0031 }
        r2.<init>();	 Catch:{ SQLiteException -> 0x0031 }
        r0 = "local_contact_id";	 Catch:{ SQLiteException -> 0x0031 }
        r2.append(r0);	 Catch:{ SQLiteException -> 0x0031 }
        r0 = "= ";	 Catch:{ SQLiteException -> 0x0031 }
        r2.append(r0);	 Catch:{ SQLiteException -> 0x0031 }
        r0 = r6.f67787D;	 Catch:{ SQLiteException -> 0x0031 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ SQLiteException -> 0x0031 }
        r2.append(r0);	 Catch:{ SQLiteException -> 0x0031 }
        r2 = r2.toString();	 Catch:{ SQLiteException -> 0x0031 }
        r1 = "contacts_upload_snapshot";	 Catch:{ SQLiteException -> 0x0031 }
        r0 = 0;	 Catch:{ SQLiteException -> 0x0031 }
        r4.delete(r1, r2, r0);	 Catch:{ SQLiteException -> 0x0031 }
        monitor-exit(r3);	 Catch:{ all -> 0x002f }
    L_0x002e:
        return;	 Catch:{ all -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        goto L_0x0033;
    L_0x0031:
        monitor-exit(r3);	 Catch:{ all -> 0x002f }
        goto L_0x002e;	 Catch:{ all -> 0x002f }
    L_0x0033:
        monitor-exit(r3);	 Catch:{ all -> 0x002f }
        throw r0;
    L_0x0035:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "Attempting to add a null entry tocontacts_db2";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.6CG.qJA(X.5eR):void");
    }

    public final SQLiteDatabase yH() {
        return getWritableDatabase();
    }
}
