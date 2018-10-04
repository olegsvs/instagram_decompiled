package com.facebook.video.cache.instrumentation;

import X.AnonymousClass0GG;
import X.AnonymousClass0WK;
import X.AnonymousClass1Gl;
import X.AnonymousClass2l3;
import X.AnonymousClass2p9;
import X.AnonymousClass2pB;
import X.AnonymousClass2pC;
import X.AnonymousClass2pD;
import X.AnonymousClass2pE;
import X.AnonymousClass2pF;
import X.AnonymousClass2pI;
import X.AnonymousClass2pJ;
import X.AnonymousClass2pK;
import X.AnonymousClass2pL;
import X.AnonymousClass2u3;
import X.AnonymousClass3tC;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import android.text.format.DateUtils;
import com.facebook.exoplayer.ipc.VpsVideoCacheDatabaseFullEvent;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class VideoCacheDatabase {
    public static final String DATABASE_NAME = "videocache.db";
    /* renamed from: E */
    public static final long f46009E = TimeUnit.DAYS.toMillis(1);
    /* renamed from: F */
    public static final String f46010F = "VideoCacheDatabase";
    /* renamed from: G */
    public static AnonymousClass2pK f46011G = null;
    public static final long MAX_DB_SIZE = 6291456;
    /* renamed from: B */
    public final List f46012B;
    /* renamed from: C */
    public final AnonymousClass3tC f46013C;
    /* renamed from: D */
    private final ExecutorService f46014D;

    /* renamed from: C */
    public static String m21161C(int i) {
        return i == 2 ? "filestorage" : i == 3 ? "filestorage_cd" : GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    }

    public VideoCacheDatabase(Context context, ExecutorService executorService, AnonymousClass3tC anonymousClass3tC) {
        this(context, executorService, anonymousClass3tC, false);
    }

    public VideoCacheDatabase(android.content.Context r3, java.util.concurrent.ExecutorService r4, X.AnonymousClass3tC r5, boolean r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r2.<init>();
        r2.f46014D = r4;
        r2.f46013C = r5;
        r0 = new java.util.LinkedList;
        r0.<init>();
        r2.f46012B = r0;
        r0 = r3.getApplicationContext();	 Catch:{ Exception -> 0x001e }
        r1 = new X.2pA;	 Catch:{ Exception -> 0x001e }
        r1.<init>(r2, r6, r0);	 Catch:{ Exception -> 0x001e }
        r0 = 399707449; // 0x17d30d39 float:1.3638893E-24 double:1.97481719E-315;	 Catch:{ Exception -> 0x001e }
        X.AnonymousClass0GG.B(r4, r1, r0);	 Catch:{ Exception -> 0x001e }
        goto L_0x0028;	 Catch:{ Exception -> 0x001e }
    L_0x001e:
        r2 = f46010F;
        r1 = "unable to initialize video cache database";
        r0 = 0;
        r0 = new java.lang.Object[r0];
        X.AnonymousClass1Gl.E(r2, r1, r0);
    L_0x0028:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.cache.instrumentation.VideoCacheDatabase.<init>(android.content.Context, java.util.concurrent.ExecutorService, X.3tC, boolean):void");
    }

    /* renamed from: A */
    public final void m21164A() {
        SQLiteFullException e;
        Throwable e2;
        String str;
        if (f46011G != null) {
            SQLiteDatabase writableDatabase;
            try {
                AnonymousClass2u3.m17644B("addBufferedEventsToDatabase");
                writableDatabase = f46011G.getWritableDatabase();
                try {
                    AnonymousClass0WK.B(writableDatabase, 134878342);
                    for (AnonymousClass2pL anonymousClass2pL : this.f46012B) {
                        Object obj;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("cache_key", anonymousClass2pL.f34482C);
                        contentValues.put("range_start", anonymousClass2pL.f34488I);
                        contentValues.put("range_length", anonymousClass2pL.f34487H);
                        contentValues.put("cache_type", anonymousClass2pL.f34484E);
                        contentValues.put("cache_storage_type", anonymousClass2pL.f34483D);
                        contentValues.put("request_origin", anonymousClass2pL.f34490K);
                        contentValues.put("cache_action", anonymousClass2pL.f34481B);
                        contentValues.put("timestamp", Long.valueOf(anonymousClass2pL.f34491L));
                        if (anonymousClass2pL.f34481B.equals(AnonymousClass2pJ.CACHE_READ.f34475B)) {
                            contentValues.put("hit_miss", anonymousClass2pL.f34486G);
                            if (anonymousClass2pL.f34486G == null || anonymousClass2pL.f34486G.equals("hit")) {
                                int D = m21162D(anonymousClass2pL.f34482C, anonymousClass2pL.f34488I, anonymousClass2pL.f34487H, anonymousClass2pL.f34484E, anonymousClass2pL.f34483D);
                                contentValues.put("hit_count", Integer.valueOf(D));
                                if (D != 1) {
                                    obj = null;
                                    if (obj == null) {
                                        AnonymousClass0WK.D(1968791363);
                                        writableDatabase.replaceOrThrow("video_cache_histories", null, contentValues);
                                        AnonymousClass0WK.D(-1039310665);
                                    } else {
                                        writableDatabase.update("video_cache_histories", contentValues, "cache_key = ? AND range_start = ? AND range_length = ? AND cache_type = ? AND cache_storage_type = ? AND cache_action = ? AND hit_miss = ?", new String[]{anonymousClass2pL.f34482C, anonymousClass2pL.f34488I, anonymousClass2pL.f34487H, anonymousClass2pL.f34484E, anonymousClass2pL.f34483D, AnonymousClass2pJ.CACHE_READ.f34475B, "hit"});
                                    }
                                }
                            }
                        }
                        obj = 1;
                        if (obj == null) {
                            writableDatabase.update("video_cache_histories", contentValues, "cache_key = ? AND range_start = ? AND range_length = ? AND cache_type = ? AND cache_storage_type = ? AND cache_action = ? AND hit_miss = ?", new String[]{anonymousClass2pL.f34482C, anonymousClass2pL.f34488I, anonymousClass2pL.f34487H, anonymousClass2pL.f34484E, anonymousClass2pL.f34483D, AnonymousClass2pJ.CACHE_READ.f34475B, "hit"});
                        } else {
                            AnonymousClass0WK.D(1968791363);
                            writableDatabase.replaceOrThrow("video_cache_histories", null, contentValues);
                            AnonymousClass0WK.D(-1039310665);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    String str2 = f46010F;
                    AnonymousClass1Gl.C(str2, "Successfully log cache events", new Object[0]);
                    if (writableDatabase != null) {
                        try {
                            AnonymousClass0WK.C(writableDatabase, -817889373);
                        } catch (Throwable e3) {
                            AnonymousClass1Gl.D(str2, e3, "No transaction to be ended", new Object[0]);
                        } catch (Throwable th) {
                            this.f46012B.clear();
                            AnonymousClass2u3.m17645C();
                        }
                    }
                } catch (SQLiteFullException e4) {
                    e = e4;
                    AnonymousClass1Gl.E(f46010F, "SQLite disk too full to vacuum", new Object[]{e});
                    this.f46013C.m21169A(AnonymousClass2l3.DATABASE_FULL, new VpsVideoCacheDatabaseFullEvent(e.getMessage()));
                    if (writableDatabase != null) {
                        try {
                            AnonymousClass0WK.C(writableDatabase, -1304786818);
                        } catch (Throwable e32) {
                            AnonymousClass1Gl.D(f46010F, e32, "No transaction to be ended", new Object[0]);
                        } catch (Throwable th2) {
                            this.f46012B.clear();
                            AnonymousClass2u3.m17645C();
                        }
                    }
                    this.f46012B.clear();
                    AnonymousClass2u3.m17645C();
                } catch (Exception e5) {
                    e2 = e5;
                    try {
                        str = f46010F;
                        AnonymousClass1Gl.D(str, e2, "Error logging cache events due to %s", new Object[]{e2.getMessage()});
                        if (writableDatabase != null) {
                            try {
                                AnonymousClass0WK.C(writableDatabase, -1577831966);
                            } catch (Throwable e6) {
                                AnonymousClass1Gl.D(str, e6, "No transaction to be ended", new Object[0]);
                            } catch (Throwable th3) {
                                this.f46012B.clear();
                                AnonymousClass2u3.m17645C();
                            }
                        }
                        this.f46012B.clear();
                        AnonymousClass2u3.m17645C();
                    } catch (Throwable th4) {
                        e2 = th4;
                        if (writableDatabase != null) {
                            try {
                                AnonymousClass0WK.C(writableDatabase, -1250170925);
                            } catch (Throwable e322) {
                                AnonymousClass1Gl.D(f46010F, e322, "No transaction to be ended", new Object[0]);
                            } catch (Throwable th5) {
                                this.f46012B.clear();
                                AnonymousClass2u3.m17645C();
                            }
                        }
                        this.f46012B.clear();
                        AnonymousClass2u3.m17645C();
                        throw e2;
                    }
                }
            } catch (SQLiteFullException e7) {
                e = e7;
                writableDatabase = null;
                AnonymousClass1Gl.E(f46010F, "SQLite disk too full to vacuum", new Object[]{e});
                this.f46013C.m21169A(AnonymousClass2l3.DATABASE_FULL, new VpsVideoCacheDatabaseFullEvent(e.getMessage()));
                if (writableDatabase != null) {
                    AnonymousClass0WK.C(writableDatabase, -1304786818);
                }
                this.f46012B.clear();
                AnonymousClass2u3.m17645C();
            } catch (Exception e8) {
                e2 = e8;
                writableDatabase = null;
                str = f46010F;
                AnonymousClass1Gl.D(str, e2, "Error logging cache events due to %s", new Object[]{e2.getMessage()});
                if (writableDatabase != null) {
                    AnonymousClass0WK.C(writableDatabase, -1577831966);
                }
                this.f46012B.clear();
                AnonymousClass2u3.m17645C();
            } catch (Throwable th6) {
                e2 = th6;
                writableDatabase = null;
                if (writableDatabase != null) {
                    AnonymousClass0WK.C(writableDatabase, -1250170925);
                }
                this.f46012B.clear();
                AnonymousClass2u3.m17645C();
                throw e2;
            }
            this.f46012B.clear();
            AnonymousClass2u3.m17645C();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public final java.util.List m21165B() {
        /*
        r15 = this;
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0 = f46011G;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return r5;
    L_0x000a:
        r4 = 0;
        r0 = "getAllCacheEventSync";
        X.AnonymousClass2u3.m17644B(r0);	 Catch:{ SQLiteFullException -> 0x00de, SQLException -> 0x00cc }
        r0 = f46011G;	 Catch:{ SQLiteFullException -> 0x00de, SQLException -> 0x00cc }
        r6 = r0.getWritableDatabase();	 Catch:{ SQLiteFullException -> 0x00de, SQLException -> 0x00cc }
        r7 = "video_cache_histories";
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r7 = r6.query(r7, r8, r9, r10, r11, r12, r13);	 Catch:{ SQLiteFullException -> 0x00de, SQLException -> 0x00cc }
        r0 = r7.getCount();	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        if (r0 != 0) goto L_0x0031;
    L_0x0028:
        if (r7 == 0) goto L_0x002d;
    L_0x002a:
        r7.close();
    L_0x002d:
        X.AnonymousClass2u3.m17645C();
        return r5;
    L_0x0031:
        r0 = "cache_key";
        r14 = r7.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        r0 = "timestamp";
        r13 = r7.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        r0 = "cache_action";
        r12 = r7.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        r0 = "cache_type";
        r11 = r7.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        r0 = "cache_storage_type";
        r10 = r7.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        r0 = "range_start";
        r9 = r7.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        r0 = "range_length";
        r8 = r7.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        r0 = "hit_miss";
        r6 = r7.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        r0 = "hit_count";
        r3 = r7.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
    L_0x0067:
        r0 = r7.moveToNext();	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        if (r0 == 0) goto L_0x00ba;
    L_0x006d:
        r2 = new X.2pL;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        r2.<init>();	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        r4 = r7.getString(r14);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00c4 }
        r2.f34482C = r4;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r0 = X.AnonymousClass2p6.m17334C(r4);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r2.f34492M = r0;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r0 = X.AnonymousClass2p6.m17333B(r4);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r2.f34489J = r0;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r0 = r7.getString(r9);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r2.f34488I = r0;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r0 = r7.getString(r8);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r2.f34487H = r0;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r0 = r7.getString(r6);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r2.f34486G = r0;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r0 = r7.getString(r12);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r2.f34481B = r0;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r0 = r7.getString(r11);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r2.f34484E = r0;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r0 = r7.getString(r10);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r2.f34483D = r0;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r0 = r7.getLong(r13);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r2.f34491L = r0;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r0 = r7.getInt(r3);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r2.f34485F = r0;	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        r5.add(r2);	 Catch:{ SQLiteFullException -> 0x00c6, SQLException -> 0x00b8 }
        goto L_0x0067;
    L_0x00b8:
        r5 = move-exception;
        goto L_0x00ce;
    L_0x00ba:
        if (r7 == 0) goto L_0x00bf;
    L_0x00bc:
        r7.close();
    L_0x00bf:
        X.AnonymousClass2u3.m17645C();
        goto L_0x0009;
    L_0x00c4:
        r5 = move-exception;
        goto L_0x00ce;
    L_0x00c6:
        r6 = move-exception;
        r4 = r7;
        goto L_0x00df;
    L_0x00c9:
        r0 = move-exception;
    L_0x00ca:
        r7 = r4;
        goto L_0x0104;
    L_0x00cc:
        r5 = move-exception;
        r7 = r4;
    L_0x00ce:
        r3 = f46010F;	 Catch:{ all -> 0x00dc }
        r2 = "Error get cached item for %s";
        r0 = 1;
        r1 = new java.lang.Object[r0];	 Catch:{ all -> 0x00dc }
        r0 = 0;
        r1[r0] = r4;	 Catch:{ all -> 0x00dc }
        X.AnonymousClass1Gl.F(r3, r5, r2, r1);	 Catch:{ all -> 0x00dc }
        throw r5;	 Catch:{ all -> 0x00dc }
    L_0x00dc:
        r0 = move-exception;
        goto L_0x0104;
    L_0x00de:
        r6 = move-exception;
    L_0x00df:
        r3 = f46010F;	 Catch:{ all -> 0x00c9 }
        r2 = "SQLite disk too full to vacuum";
        r0 = 1;
        r1 = new java.lang.Object[r0];	 Catch:{ all -> 0x00c9 }
        r0 = 0;
        r1[r0] = r6;	 Catch:{ all -> 0x00c9 }
        X.AnonymousClass1Gl.E(r3, r2, r1);	 Catch:{ all -> 0x00c9 }
        r3 = r15.f46013C;	 Catch:{ all -> 0x0102 }
        r2 = X.AnonymousClass2l3.DATABASE_FULL;	 Catch:{ all -> 0x0102 }
        r1 = new com.facebook.exoplayer.ipc.VpsVideoCacheDatabaseFullEvent;	 Catch:{ all -> 0x0102 }
        r0 = r6.getMessage();	 Catch:{ all -> 0x0102 }
        r1.<init>(r0);	 Catch:{ all -> 0x0102 }
        r3.m21169A(r2, r1);	 Catch:{ all -> 0x0102 }
        if (r4 == 0) goto L_0x00bf;
    L_0x00fe:
        r4.close();
        goto L_0x00bf;
    L_0x0102:
        r0 = move-exception;
        goto L_0x00ca;
    L_0x0104:
        if (r7 == 0) goto L_0x0109;
    L_0x0106:
        r7.close();
    L_0x0109:
        X.AnonymousClass2u3.m17645C();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.cache.instrumentation.VideoCacheDatabase.B():java.util.List");
    }

    /* renamed from: B */
    public static void m21160B(VideoCacheDatabase videoCacheDatabase, String str, String str2, String str3, int i, String str4, boolean z, AnonymousClass2pJ anonymousClass2pJ, String str5) {
        AnonymousClass2pL anonymousClass2pL = new AnonymousClass2pL();
        anonymousClass2pL.f34482C = str;
        anonymousClass2pL.f34488I = str2;
        anonymousClass2pL.f34487H = str3;
        anonymousClass2pL.f34481B = anonymousClass2pJ.f34475B;
        anonymousClass2pL.f34484E = z ? "prefetch" : "play";
        anonymousClass2pL.f34483D = m21161C(i);
        anonymousClass2pL.f34490K = str4;
        anonymousClass2pL.f34486G = str5;
        anonymousClass2pL.f34491L = System.currentTimeMillis();
        videoCacheDatabase.f46012B.add(anonymousClass2pL);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: C */
    public final java.util.List m21166C() {
        /*
        r25 = this;
        r1 = new X.2pN;
        r1.<init>();
        r0 = f46011G;
        if (r0 != 0) goto L_0x000e;
    L_0x0009:
        r0 = r1.m17340A();
        return r0;
    L_0x000e:
        r22 = 0;
        r24 = 0;
        r23 = 1;
        r0 = "getCacheStatsFromDB";
        X.AnonymousClass2u3.m17644B(r0);	 Catch:{ SQLiteFullException -> 0x0162, SQLException -> 0x014f }
        r0 = f46011G;	 Catch:{ SQLiteFullException -> 0x0162, SQLException -> 0x014f }
        r2 = r0.getWritableDatabase();	 Catch:{ SQLiteFullException -> 0x0162, SQLException -> 0x014f }
        r3 = "video_cache_histories";
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = "timestamp ASC";
        r10 = 0;
        r4 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ SQLiteFullException -> 0x0162, SQLException -> 0x014f }
        r0 = r4.getCount();	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
        if (r0 != 0) goto L_0x0040;
    L_0x0033:
        r0 = r1.m17340A();	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
        if (r4 == 0) goto L_0x003c;
    L_0x0039:
        r4.close();
    L_0x003c:
        X.AnonymousClass2u3.m17645C();
        return r0;
    L_0x0040:
        r0 = "cache_key";
        r11 = r4.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
        r0 = "cache_action";
        r10 = r4.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
        r0 = "cache_type";
        r9 = r4.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
        r0 = "range_length";
        r8 = r4.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
        r0 = "range_start";
        r7 = r4.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
        r0 = "request_origin";
        r6 = r4.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
        r0 = "hit_miss";
        r5 = r4.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
        r0 = "timestamp";
        r3 = r4.getColumnIndexOrThrow(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
    L_0x0070:
        r0 = r4.moveToNext();	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
        if (r0 == 0) goto L_0x013b;
    L_0x0076:
        r22 = r4.getString(r11);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0145 }
        r13 = r4.getString(r10);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r21 = r4.getString(r9);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r4.getString(r8);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r2 = r4.getString(r7);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r20 = java.lang.Integer.parseInt(r2);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r12 = r4.getString(r5);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r15 = r4.getString(r6);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        if (r12 == 0) goto L_0x00a6;
    L_0x009c:
        r2 = "hit";
        r2 = r12.equals(r2);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        if (r2 == 0) goto L_0x00a6;
    L_0x00a4:
        r14 = 1;
        goto L_0x00a7;
    L_0x00a6:
        r14 = 0;
    L_0x00a7:
        r18 = r4.getLong(r3);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r12 = r22;
        r2 = (float) r0;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = 1149239296; // 0x44800000 float:1024.0 double:5.67799655E-315;
        r2 = r2 / r0;
        if (r14 == 0) goto L_0x00d9;
    L_0x00b3:
        r0 = X.AnonymousClass2pJ.CACHE_READ;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r0.f34475B;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r13.equals(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        if (r0 == 0) goto L_0x00d9;
    L_0x00bd:
        r13 = r1.f34497B;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r20;
        r0 = X.AnonymousClass2pN.m17339B(r12, r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r12 = r13.remove(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r12 = (X.AnonymousClass2pM) r12;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        if (r12 == 0) goto L_0x0137;
    L_0x00cd:
        r0 = r12.f34496E;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r0 + r2;
        r12.f34496E = r0;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r12.f34494C;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r0 + 1;
        r12.f34494C = r0;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        goto L_0x0137;
    L_0x00d9:
        r0 = X.AnonymousClass2pJ.CACHE_WRITE;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r0.f34475B;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r13.equals(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        if (r0 == 0) goto L_0x0137;
    L_0x00e3:
        r16 = java.lang.System.currentTimeMillis();	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r13 = f46009E;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r16 = r16 - r13;
        r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1));
        if (r0 >= 0) goto L_0x012c;
    L_0x00ef:
        r14 = "%s%c%s";
        r0 = 37;
        r13 = java.lang.Character.valueOf(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        if (r15 != 0) goto L_0x00fb;
    L_0x00f9:
        r15 = "";
    L_0x00fb:
        r0 = r21;
        r14 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r14, r0, r13, r15);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r1.f34498C;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r13 = r0.get(r14);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r13 = (X.AnonymousClass2pM) r13;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        if (r13 != 0) goto L_0x0115;
    L_0x010b:
        r13 = new X.2pM;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r13.<init>();	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r1.f34498C;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0.put(r14, r13);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
    L_0x0115:
        r0 = r13.f34493B;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r0 + 1;
        r13.f34493B = r0;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r13.f34495D;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r0 + r2;
        r13.f34495D = r0;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r2 = r1.f34497B;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r20;
        r0 = X.AnonymousClass2pN.m17339B(r12, r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r2.put(r0, r13);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        goto L_0x0137;
    L_0x012c:
        r2 = r1.f34497B;	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r0 = r20;
        r0 = X.AnonymousClass2pN.m17339B(r12, r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
        r2.remove(r0);	 Catch:{ SQLiteFullException -> 0x0147, SQLException -> 0x0139 }
    L_0x0137:
        goto L_0x0070;
    L_0x0139:
        r3 = move-exception;
        goto L_0x0152;
    L_0x013b:
        if (r4 == 0) goto L_0x0140;
    L_0x013d:
        r4.close();
    L_0x0140:
        X.AnonymousClass2u3.m17645C();
        goto L_0x0009;
    L_0x0145:
        r3 = move-exception;
        goto L_0x0152;
    L_0x0147:
        r5 = move-exception;
        r22 = r4;
        goto L_0x0163;
    L_0x014b:
        r0 = move-exception;
    L_0x014c:
        r4 = r22;
        goto L_0x018a;
    L_0x014f:
        r3 = move-exception;
        r4 = r22;
    L_0x0152:
        r2 = f46010F;	 Catch:{ all -> 0x0160 }
        r1 = "Error get cached item for %s";
        r0 = r23;
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0160 }
        r0[r24] = r22;	 Catch:{ all -> 0x0160 }
        X.AnonymousClass1Gl.F(r2, r3, r1, r0);	 Catch:{ all -> 0x0160 }
        throw r3;	 Catch:{ all -> 0x0160 }
    L_0x0160:
        r0 = move-exception;
        goto L_0x018a;
    L_0x0162:
        r5 = move-exception;
    L_0x0163:
        r3 = f46010F;	 Catch:{ all -> 0x014b }
        r2 = "SQLite disk too full to vacuum";
        r0 = r23;
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x014b }
        r0[r24] = r5;	 Catch:{ all -> 0x014b }
        X.AnonymousClass1Gl.E(r3, r2, r0);	 Catch:{ all -> 0x014b }
        r0 = r25;
        r4 = r0.f46013C;	 Catch:{ all -> 0x0188 }
        r3 = X.AnonymousClass2l3.DATABASE_FULL;	 Catch:{ all -> 0x0188 }
        r2 = new com.facebook.exoplayer.ipc.VpsVideoCacheDatabaseFullEvent;	 Catch:{ all -> 0x0188 }
        r0 = r5.getMessage();	 Catch:{ all -> 0x0188 }
        r2.<init>(r0);	 Catch:{ all -> 0x0188 }
        r4.m21169A(r3, r2);	 Catch:{ all -> 0x0188 }
        if (r22 == 0) goto L_0x0140;
    L_0x0184:
        r22.close();
        goto L_0x0140;
    L_0x0188:
        r0 = move-exception;
        goto L_0x014c;
    L_0x018a:
        if (r4 == 0) goto L_0x018f;
    L_0x018c:
        r4.close();
    L_0x018f:
        X.AnonymousClass2u3.m17645C();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.cache.instrumentation.VideoCacheDatabase.C():java.util.List");
    }

    /* renamed from: D */
    private static int m21162D(String str, String str2, String str3, String str4, String str5) {
        Throwable e;
        Throwable th;
        if (f46011G == null) {
            return 0;
        }
        Cursor cursor = null;
        try {
            AnonymousClass2u3.m17644B("getHitCountFromDb");
            cursor = f46011G.getWritableDatabase().query("video_cache_histories", new String[]{"hit_count"}, "cache_key = ? AND range_start = ? AND range_length = ? AND cache_type = ? AND cache_storage_type = ? AND cache_action = ? AND hit_miss = ?", new String[]{str, str2, str3, str4, str5, AnonymousClass2pJ.CACHE_READ.f34475B, "hit"}, null, null, "_id DESC", "1");
            try {
                if (cursor.getCount() > 0) {
                    cursor.moveToNext();
                    int i = cursor.getInt(cursor.getColumnIndexOrThrow("hit_count")) + 1;
                    if (cursor != null) {
                        cursor.close();
                    }
                    AnonymousClass2u3.m17645C();
                    return i;
                }
                if (cursor != null) {
                    cursor.close();
                }
                AnonymousClass2u3.m17645C();
                return 1;
            } catch (SQLException e2) {
                e = e2;
                try {
                    AnonymousClass1Gl.F(f46010F, e, "Error query cached item for %s", new Object[]{str});
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    AnonymousClass2u3.m17645C();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                AnonymousClass2u3.m17645C();
                throw th;
            }
        } catch (SQLException e3) {
            e = e3;
            AnonymousClass1Gl.F(f46010F, e, "Error query cached item for %s", new Object[]{str});
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public final void m21167D(java.lang.String r13, java.lang.String r14, java.lang.String r15, X.AnonymousClass2pJ r16, int r17, java.lang.String r18, boolean r19) {
        /*
        r12 = this;
        r2 = com.facebook.video.cache.instrumentation.VideoCacheDatabase.class;
        monitor-enter(r2);
        r11 = 0;
        r3 = r12;
        r4 = r13;
        r5 = r14;
        r6 = r15;
        r10 = r16;
        r7 = r17;
        r8 = r18;
        r9 = r19;
        m21160B(r3, r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x0024 }
        r0 = r12.f46012B;	 Catch:{ all -> 0x0022 }
        r1 = r0.size();	 Catch:{ all -> 0x0022 }
        r0 = 15;
        if (r1 < r0) goto L_0x0020;
    L_0x001d:
        r12.m21164A();	 Catch:{ all -> 0x0022 }
    L_0x0020:
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        return;
    L_0x0022:
        r0 = move-exception;
        goto L_0x0025;
    L_0x0024:
        r0 = move-exception;
    L_0x0025:
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.cache.instrumentation.VideoCacheDatabase.D(java.lang.String, java.lang.String, java.lang.String, X.2pJ, int, java.lang.String, boolean):void");
    }

    /* renamed from: E */
    private static String m21163E(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis > 0) {
            return DateUtils.formatElapsedTime(currentTimeMillis / 1000);
        }
        return "-1";
    }

    /* renamed from: E */
    public final void m21168E(boolean z) {
        SQLiteFullException e;
        Exception e2;
        Throwable th;
        synchronized (VideoCacheDatabase.class) {
            if (f46011G != null) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    AnonymousClass2u3.m17644B("removeCacheEventsSync");
                    SQLiteDatabase writableDatabase = f46011G.getWritableDatabase();
                    try {
                        AnonymousClass0WK.B(writableDatabase, 633091456);
                        if (z) {
                            writableDatabase.delete("video_cache_histories", null, null);
                        } else {
                            writableDatabase.delete("video_cache_histories", "timestamp <= ? ", new String[]{Long.toString(System.currentTimeMillis() - f46009E)});
                        }
                        writableDatabase.setTransactionSuccessful();
                        this.f46012B.clear();
                        if (writableDatabase != null) {
                            AnonymousClass0WK.C(writableDatabase, -1491790305);
                        }
                    } catch (SQLiteFullException e3) {
                        e = e3;
                        sQLiteDatabase = writableDatabase;
                        AnonymousClass1Gl.E(f46010F, "remove entries failed due to SQLite disk too full", new Object[]{e});
                        this.f46013C.m21169A(AnonymousClass2l3.DATABASE_FULL, new VpsVideoCacheDatabaseFullEvent(e.getMessage()));
                        this.f46012B.clear();
                        if (sQLiteDatabase != null) {
                            AnonymousClass0WK.C(sQLiteDatabase, 2085456429);
                        }
                        AnonymousClass2u3.m17645C();
                    } catch (Exception e4) {
                        e2 = e4;
                        sQLiteDatabase = writableDatabase;
                        try {
                            AnonymousClass1Gl.E(f46010F, "remove entries failed", new Object[]{e2});
                            this.f46012B.clear();
                            if (sQLiteDatabase != null) {
                                AnonymousClass0WK.C(sQLiteDatabase, -923817837);
                            }
                            AnonymousClass2u3.m17645C();
                        } catch (Throwable th2) {
                            th = th2;
                            this.f46012B.clear();
                            if (sQLiteDatabase != null) {
                                AnonymousClass0WK.C(sQLiteDatabase, 311384893);
                            }
                            AnonymousClass2u3.m17645C();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteDatabase = writableDatabase;
                        this.f46012B.clear();
                        if (sQLiteDatabase != null) {
                            AnonymousClass0WK.C(sQLiteDatabase, 311384893);
                        }
                        AnonymousClass2u3.m17645C();
                        throw th;
                    }
                } catch (SQLiteFullException e5) {
                    e = e5;
                    AnonymousClass1Gl.E(f46010F, "remove entries failed due to SQLite disk too full", new Object[]{e});
                    this.f46013C.m21169A(AnonymousClass2l3.DATABASE_FULL, new VpsVideoCacheDatabaseFullEvent(e.getMessage()));
                    this.f46012B.clear();
                    if (sQLiteDatabase != null) {
                        AnonymousClass0WK.C(sQLiteDatabase, 2085456429);
                    }
                    AnonymousClass2u3.m17645C();
                } catch (Exception e6) {
                    e2 = e6;
                    AnonymousClass1Gl.E(f46010F, "remove entries failed", new Object[]{e2});
                    this.f46012B.clear();
                    if (sQLiteDatabase != null) {
                        AnonymousClass0WK.C(sQLiteDatabase, -923817837);
                    }
                    AnonymousClass2u3.m17645C();
                }
                AnonymousClass2u3.m17645C();
            }
        }
    }

    public static Map eventToMap(AnonymousClass2pL anonymousClass2pL) {
        Map hashMap = new HashMap(AnonymousClass2pL.f34480N + 1);
        hashMap.put(TraceFieldType.VideoId, anonymousClass2pL.f34492M);
        hashMap.put("representation_id", anonymousClass2pL.f34489J);
        hashMap.put("cache_type".toString().toLowerCase(Locale.US), anonymousClass2pL.f34484E);
        hashMap.put("cache_storage_type".toString().toLowerCase(Locale.US), anonymousClass2pL.f34483D);
        hashMap.put("cache_action".toString().toLowerCase(Locale.US), anonymousClass2pL.f34481B);
        hashMap.put("cache_key".toString().toLowerCase(Locale.US), anonymousClass2pL.f34482C);
        hashMap.put("range_start".toString().toLowerCase(Locale.US), anonymousClass2pL.f34488I);
        hashMap.put("range_length".toString().toLowerCase(Locale.US), anonymousClass2pL.f34487H);
        hashMap.put("hit_miss".toString().toLowerCase(Locale.US), anonymousClass2pL.f34486G);
        hashMap.put("hit_count".toString().toLowerCase(Locale.US), String.valueOf(anonymousClass2pL.f34485F));
        if (anonymousClass2pL.f34491L != 0) {
            hashMap.put("timestamp".toString().toLowerCase(Locale.US), m21163E(anonymousClass2pL.f34491L));
        }
        return hashMap;
    }

    public java.util.List getAllCacheEvents() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = r3.f46014D;
        r1 = new X.2pG;
        r1.<init>(r3);
        r0 = 1661551327; // 0x630942df float:2.5320225E21 double:8.209154295E-315;
        r3 = X.AnonymousClass0GG.D(r2, r1, r0);
        r1 = 2;
        r0 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ Exception -> 0x0019 }
        r0 = r3.get(r1, r0);	 Catch:{ Exception -> 0x0019 }
        r0 = (java.util.List) r0;	 Catch:{ Exception -> 0x0019 }
        return r0;	 Catch:{ Exception -> 0x0019 }
    L_0x0019:
        r0 = new java.util.ArrayList;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.cache.instrumentation.VideoCacheDatabase.getAllCacheEvents():java.util.List");
    }

    public List getAllCacheEventsSync() {
        List arrayList = new ArrayList();
        synchronized (VideoCacheDatabase.class) {
            m21164A();
            arrayList.addAll(m21165B());
        }
        return arrayList;
    }

    public java.util.List getCacheStats() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r2 = r3.f46014D;
        r1 = new X.2pH;
        r1.<init>(r3);
        r0 = -362303190; // 0xffffffffea67b12a float:-7.0024624E25 double:NaN;
        r3 = X.AnonymousClass0GG.D(r2, r1, r0);
        r1 = 2;
        r0 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ Exception -> 0x0019 }
        r0 = r3.get(r1, r0);	 Catch:{ Exception -> 0x0019 }
        r0 = (java.util.List) r0;	 Catch:{ Exception -> 0x0019 }
        return r0;	 Catch:{ Exception -> 0x0019 }
    L_0x0019:
        r0 = new java.util.ArrayList;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.cache.instrumentation.VideoCacheDatabase.getCacheStats():java.util.List");
    }

    public List getCacheStatsSync() {
        List C;
        synchronized (VideoCacheDatabase.class) {
            m21164A();
            C = m21166C();
        }
        return C;
    }

    public static long getDatabaseFileSize() {
        return AnonymousClass2pK.m17336B();
    }

    public void logCacheClearEvent() {
        AnonymousClass0GG.B(this.f46014D, new AnonymousClass2pF(this), -34088393);
    }

    public void logCacheEvictEvent(String str, String str2, String str3, int i, boolean z) {
        AnonymousClass0GG.B(this.f46014D, new AnonymousClass2pE(this, str, str2, str3, i, z), -1227865171);
    }

    public void logCacheFailureEvent(String str, String str2, String str3, int i, boolean z) {
        AnonymousClass0GG.B(this.f46014D, new AnonymousClass2pC(this, str, str2, str3, i, z), 1918663174);
    }

    public void logCacheReadEvent(String str, String str2, String str3, int i, boolean z, boolean z2) {
        AnonymousClass0GG.B(this.f46014D, new AnonymousClass2pD(this, str, str2, str3, i, z, z2), 1660807910);
    }

    public void logCacheWriteEvent(String str, String str2, String str3, int i, String str4, boolean z) {
        AnonymousClass0GG.B(this.f46014D, new AnonymousClass2pB(this, str, str2, str3, i, str4, z), 914574345);
    }

    public void removeAllCacheEvents() {
        AnonymousClass0GG.B(this.f46014D, new AnonymousClass2pI(this), 1964445646);
    }

    public void removeStaleCacheEvents() {
        AnonymousClass0GG.B(this.f46014D, new AnonymousClass2p9(this), -959532804);
    }
}
