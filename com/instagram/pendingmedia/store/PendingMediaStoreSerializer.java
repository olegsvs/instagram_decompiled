package com.instagram.pendingmedia.store;

import X.AnonymousClass0CB;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Cn;
import X.AnonymousClass0Dc;
import X.AnonymousClass0Du;
import X.AnonymousClass0EV;
import X.AnonymousClass0F4;
import X.AnonymousClass0F5;
import X.AnonymousClass0FL;
import X.AnonymousClass0GG;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Kq;
import X.AnonymousClass0Ks;
import X.AnonymousClass0Lm;
import X.AnonymousClass0OA;
import X.AnonymousClass0ZW;
import X.AnonymousClass0ZX;
import X.AnonymousClass0ZY;
import X.AnonymousClass0ZZ;
import X.AnonymousClass18a;
import X.AnonymousClass19Z;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonEncoding;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public final class PendingMediaStoreSerializer {
    /* renamed from: M */
    public static final Class f2368M = PendingMediaStoreSerializer.class;
    /* renamed from: N */
    private static PendingMediaStoreSerializer f2369N;
    /* renamed from: B */
    public final Context f2370B;
    /* renamed from: C */
    public final Object f2371C;
    /* renamed from: D */
    public Boolean f2372D;
    /* renamed from: E */
    public String f2373E;
    /* renamed from: F */
    public final List f2374F;
    /* renamed from: G */
    public final List f2375G;
    /* renamed from: H */
    public AnonymousClass0ZY f2376H;
    /* renamed from: I */
    private final AnonymousClass0Ks f2377I;
    /* renamed from: J */
    private final Handler f2378J = new Handler(Looper.getMainLooper());
    /* renamed from: K */
    private final File f2379K;
    /* renamed from: L */
    private final Runnable f2380L;

    private PendingMediaStoreSerializer() {
        AnonymousClass0Kq B = AnonymousClass0Kq.m2860B();
        B.f3132F = "PendingMediaStoreSerializer";
        this.f2377I = B.m2861A();
        this.f2380L = new AnonymousClass0ZW(this);
        this.f2371C = new Object();
        this.f2375G = new LinkedList();
        this.f2374F = new LinkedList();
        this.f2372D = Boolean.valueOf(false);
        this.f2370B = AnonymousClass0EV.f1977B;
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass0F5.class, new AnonymousClass0ZX(this));
        this.f2379K = new File(this.f2370B.getFilesDir(), "render_oracle.json");
        this.f2376H = new AnonymousClass0ZY(3, 100);
    }

    /* renamed from: A */
    public final void m1817A(Runnable runnable) {
        synchronized (this.f2371C) {
            if (this.f2372D.booleanValue()) {
                runnable.run();
            } else {
                this.f2375G.add(runnable);
            }
        }
    }

    /* renamed from: B */
    public final synchronized void m1818B() {
        Throwable e;
        Throwable th;
        OutputStream openFileOutput;
        Throwable e2;
        AnonymousClass0ZY anonymousClass0ZY = this.f2376H;
        File file = this.f2379K;
        synchronized (anonymousClass0ZY) {
            Closeable createGenerator;
            int i;
            try {
                createGenerator = AnonymousClass0Lm.f3274B.createGenerator(file, JsonEncoding.UTF8);
                try {
                    createGenerator.writeStartObject();
                    if (anonymousClass0ZY.f6358D != null) {
                        createGenerator.writeFieldName("sourceTypeDataMap");
                        createGenerator.writeStartObject();
                        for (Entry entry : anonymousClass0ZY.f6358D.entrySet()) {
                            createGenerator.writeFieldName(((String) entry.getKey()).toString());
                            if (entry.getValue() == null) {
                                createGenerator.writeNull();
                            } else {
                                Long l;
                                AnonymousClass18a anonymousClass18a = (AnonymousClass18a) entry.getValue();
                                createGenerator.writeStartObject();
                                if (anonymousClass18a.f15014H != null) {
                                    createGenerator.writeStringField("sourceType", anonymousClass18a.f15014H);
                                }
                                if (anonymousClass18a.f15009C != null) {
                                    createGenerator.writeFieldName("mediaDurations");
                                    createGenerator.writeStartArray();
                                    ArrayList arrayList = anonymousClass18a.f15009C;
                                    int size = arrayList.size();
                                    for (i = 0; i < size; i++) {
                                        l = (Long) arrayList.get(i);
                                        if (l != null) {
                                            createGenerator.writeNumber(l.longValue());
                                        }
                                    }
                                    createGenerator.writeEndArray();
                                }
                                if (anonymousClass18a.f15011E != null) {
                                    createGenerator.writeFieldName("renderDurations");
                                    createGenerator.writeStartArray();
                                    ArrayList arrayList2 = anonymousClass18a.f15011E;
                                    i = arrayList2.size();
                                    for (int i2 = 0; i2 < i; i2++) {
                                        l = (Long) arrayList2.get(i2);
                                        if (l != null) {
                                            createGenerator.writeNumber(l.longValue());
                                        }
                                    }
                                    createGenerator.writeEndArray();
                                }
                                createGenerator.writeNumberField("sampleCount", anonymousClass18a.f15013G);
                                createGenerator.writeNumberField("currentSample", anonymousClass18a.f15008B);
                                createGenerator.writeNumberField("renderAttempts", anonymousClass18a.f15010D);
                                createGenerator.writeNumberField("renderSuccesses", anonymousClass18a.f15012F);
                                createGenerator.writeEndObject();
                            }
                        }
                        createGenerator.writeEndObject();
                    }
                    createGenerator.writeNumberField("minimumSamples", anonymousClass0ZY.f6357C);
                    createGenerator.writeNumberField("maximumSamples", anonymousClass0ZY.f6356B);
                    createGenerator.writeEndObject();
                } catch (IOException e3) {
                    e = e3;
                    try {
                        AnonymousClass0Gn.m1885L("RenderSpeedOracle", e);
                        AnonymousClass0Du.m1315C(createGenerator);
                    } catch (Throwable th2) {
                        th = th2;
                        AnonymousClass0Du.m1315C(createGenerator);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    AnonymousClass0Du.m1315C(createGenerator);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                AnonymousClass0Gn.m1885L("RenderSpeedOracle", e);
                AnonymousClass0Du.m1315C(createGenerator);
            }
            AnonymousClass0Du.m1315C(createGenerator);
            try {
            } catch (Throwable th4) {
                th = th4;
            }
        }
        if (!TextUtils.isEmpty(this.f2373E)) {
            AnonymousClass0OA anonymousClass0OA;
            ArrayList arrayList3 = new ArrayList();
            for (AnonymousClass0OA anonymousClass0OA2 : PendingMediaStore.m3537C().f3787B.values()) {
                if (anonymousClass0OA2.m3593m()) {
                    arrayList3.add(anonymousClass0OA2);
                }
            }
            if (arrayList3.size() == 0) {
                this.f2370B.deleteFile(this.f2373E);
            } else {
                String str;
                Closeable closeable = null;
                try {
                    str = "pending_media.json.tmp";
                    openFileOutput = this.f2370B.openFileOutput(str, 0);
                } catch (Throwable e5) {
                    Object[] objArr = new Object[1];
                    str = "pending_media.json.tmp";
                    objArr[0] = str;
                    AnonymousClass0Dc.m1242E(f2368M, e5, "File not found while getting output stream for %s", objArr);
                    openFileOutput = null;
                }
                if (openFileOutput == null) {
                    AnonymousClass0Dc.m1241D(f2368M, "Failed to acquire output stream for %s", str);
                } else {
                    File file2;
                    try {
                        Integer.valueOf(arrayList3.size());
                        if (AnonymousClass0CB.m834D()) {
                            i = arrayList3.size();
                            for (int i3 = 0; i3 < i; i3++) {
                                ((AnonymousClass0OA) arrayList3.get(i3)).toString();
                            }
                        }
                        closeable = AnonymousClass0Lm.f3274B.createGenerator(openFileOutput);
                        try {
                            closeable.writeStartArray();
                            i = arrayList3.size();
                            for (int i4 = 0; i4 < i; i4++) {
                                anonymousClass0OA2 = (AnonymousClass0OA) arrayList3.get(i4);
                                synchronized (anonymousClass0OA2) {
                                    AnonymousClass19Z.m9676C(closeable, anonymousClass0OA2, true);
                                }
                            }
                            closeable.writeEndArray();
                        } catch (IOException e6) {
                            e2 = e6;
                            try {
                                AnonymousClass0Dc.m1242E(f2368M, e2, "Exception while writing out %s", "pending_media.json.tmp");
                                AnonymousClass0Du.m1315C(closeable);
                                AnonymousClass0Du.m1315C(openFileOutput);
                                synchronized (this) {
                                    try {
                                        file2 = new File(this.f2370B.getFilesDir(), "pending_media.json.tmp");
                                        file = new File(this.f2370B.getFilesDir(), this.f2373E);
                                        AnonymousClass0Dc.m1241D(f2368M, "Unable to rename %s to %s", "pending_media.json.tmp", this.f2373E);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        throw th;
                                    }
                                }
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                AnonymousClass0Du.m1315C(closeable);
                                AnonymousClass0Du.m1315C(openFileOutput);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            AnonymousClass0Du.m1315C(closeable);
                            AnonymousClass0Du.m1315C(openFileOutput);
                            throw th;
                        }
                    } catch (IOException e7) {
                        e2 = e7;
                        AnonymousClass0Dc.m1242E(f2368M, e2, "Exception while writing out %s", "pending_media.json.tmp");
                        AnonymousClass0Du.m1315C(closeable);
                        AnonymousClass0Du.m1315C(openFileOutput);
                        synchronized (this) {
                            file2 = new File(this.f2370B.getFilesDir(), "pending_media.json.tmp");
                            file = new File(this.f2370B.getFilesDir(), this.f2373E);
                            AnonymousClass0Dc.m1241D(f2368M, "Unable to rename %s to %s", "pending_media.json.tmp", this.f2373E);
                        }
                        return;
                    }
                    AnonymousClass0Du.m1315C(closeable);
                    AnonymousClass0Du.m1315C(openFileOutput);
                    synchronized (this) {
                        file2 = new File(this.f2370B.getFilesDir(), "pending_media.json.tmp");
                        file = new File(this.f2370B.getFilesDir(), this.f2373E);
                        if (file2.exists() && !file2.renameTo(file) && file.exists() && file.delete() && !file2.renameTo(file)) {
                            AnonymousClass0Dc.m1241D(f2368M, "Unable to rename %s to %s", "pending_media.json.tmp", this.f2373E);
                        }
                    }
                }
            }
        }
        return;
    }

    /* renamed from: B */
    public static synchronized void m1813B(com.instagram.pendingmedia.store.PendingMediaStoreSerializer r12, X.AnonymousClass0Cm r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        monitor-enter(r12);
        r1 = r12.f2376H;	 Catch:{ all -> 0x01e9 }
        r0 = r12.f2379K;	 Catch:{ all -> 0x01e9 }
        r0 = X.AnonymousClass0ZY.m5375C(r1, r0);	 Catch:{ all -> 0x01e9 }
        r12.f2376H = r0;	 Catch:{ all -> 0x01e9 }
        r0 = r12.f2373E;	 Catch:{ all -> 0x01e9 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x01e9 }
        if (r0 == 0) goto L_0x0015;	 Catch:{ all -> 0x01e9 }
    L_0x0013:
        monitor-exit(r12);
        return;
    L_0x0015:
        r8 = new java.util.ArrayList;	 Catch:{ all -> 0x01e9 }
        r8.<init>();	 Catch:{ all -> 0x01e9 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x01e9 }
        r5.<init>();	 Catch:{ all -> 0x01e9 }
        r4 = 0;	 Catch:{ all -> 0x01e9 }
        r1 = r12.f2370B;	 Catch:{ FileNotFoundException -> 0x0037, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r0 = r12.f2373E;	 Catch:{ FileNotFoundException -> 0x0037, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r2 = r1.openFileInput(r0);	 Catch:{ FileNotFoundException -> 0x0037, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        goto L_0x0063;	 Catch:{ FileNotFoundException -> 0x0037, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        r2 = r4;
        r11 = r4;
        goto L_0x01e2;
    L_0x002e:
        r3 = move-exception;
        r11 = r4;
        goto L_0x011f;
    L_0x0032:
        r1 = move-exception;
        r11 = r4;
        r2 = r4;
        goto L_0x012b;
    L_0x0037:
        r2 = move-exception;
        r3 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r0 = r12.f2370B;	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r1 = r0.getFilesDir();	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r0 = "pending_media.json";	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r3.<init>(r1, r0);	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r0 = r3.exists();	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        if (r0 == 0) goto L_0x011e;	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
    L_0x004b:
        r2 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r0 = r12.f2370B;	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r1 = r0.getFilesDir();	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r0 = r12.f2373E;	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r2.<init>(r1, r0);	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r3.renameTo(r2);	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r1 = r12.f2370B;	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r0 = r12.f2373E;	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
        r2 = r1.openFileInput(r0);	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
    L_0x0063:
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ FileNotFoundException -> 0x013c, IOException -> 0x011b, RuntimeException -> 0x0117, all -> 0x01e0 }
        r11 = r0.createParser(r2);	 Catch:{ FileNotFoundException -> 0x013c, IOException -> 0x011b, RuntimeException -> 0x0117, all -> 0x01e0 }
        r11.nextToken();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r3 = new java.util.ArrayList;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r3.<init>();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r1 = r11.getCurrentToken();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r0 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r1 != r0) goto L_0x0089;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x0079:
        r1 = r11.nextToken();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r0 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r1 == r0) goto L_0x008c;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x0081:
        r0 = X.AnonymousClass19Z.parseFromJson(r11);	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r3.add(r0);	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        goto L_0x0079;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x0089:
        r11.skipChildren();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x008c:
        r0 = r3.isEmpty();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r0 != 0) goto L_0x010a;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x0092:
        r1 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r1.<init>();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r0 = "Loading serialized pending media list, size: ";	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r1.append(r0);	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r0 = r3.size();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r1.append(r0);	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r1.toString();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r7 = r3.iterator();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00aa:
        r0 = r7.hasNext();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r0 == 0) goto L_0x010a;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00b0:
        r6 = r7.next();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r6 = (X.AnonymousClass0OA) r6;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r0 = 1;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r6.MB = r0;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r1 = r6.VC;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r0 = X.AnonymousClass0OC.CONFIGURING_MULTIPLE_TARGETS;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r1 != r0) goto L_0x00cf;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00bf:
        r0 = r6.m3587g();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r0 != 0) goto L_0x00cf;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00c5:
        r0 = r6.MB;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r0 == 0) goto L_0x00cf;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00c9:
        r0 = X.AnonymousClass0OC.CONFIGURED;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r6.JA(r0);	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        goto L_0x00aa;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00cf:
        r1 = r6.iC;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r0 = X.AnonymousClass0OC.CONFIGURED;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r0 = r1.equals(r0);	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r0 == 0) goto L_0x00e0;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00d9:
        r0 = m1816E(r6);	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r0 != 0) goto L_0x00e0;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00df:
        goto L_0x00aa;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00e0:
        r0 = r6.PB;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r0 == 0) goto L_0x00f3;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00e4:
        r0 = r6.kC;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r9 = java.lang.System.currentTimeMillis();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r3 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r9 = r9 - r3;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1));	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r0 >= 0) goto L_0x00f3;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00f2:
        goto L_0x00aa;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00f3:
        r0 = r6.m3591k();	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r0 == 0) goto L_0x0106;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x00f9:
        r1 = r6.iC;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r0 = X.AnonymousClass0OC.CONFIGURED;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        r0 = r1.equals(r0);	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        if (r0 == 0) goto L_0x0106;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x0103:
        r5.add(r6);	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x0106:
        r8.add(r6);	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
        goto L_0x00aa;	 Catch:{ FileNotFoundException -> 0x0115, IOException -> 0x0113, RuntimeException -> 0x0111 }
    L_0x010a:
        X.AnonymousClass0Du.m1315C(r11);	 Catch:{ all -> 0x01e9 }
    L_0x010d:
        X.AnonymousClass0Du.m1315C(r2);	 Catch:{ all -> 0x01e9 }
        goto L_0x0140;	 Catch:{ all -> 0x01e9 }
    L_0x0111:
        r3 = move-exception;
        goto L_0x0119;
    L_0x0113:
        r1 = move-exception;
        goto L_0x012b;
    L_0x0115:
        r4 = r11;
        goto L_0x013c;
    L_0x0117:
        r3 = move-exception;
        r11 = r4;
    L_0x0119:
        r4 = r2;
        goto L_0x011f;
    L_0x011b:
        r1 = move-exception;
        r11 = r4;
        goto L_0x012b;
    L_0x011e:
        throw r2;	 Catch:{ FileNotFoundException -> 0x013b, IOException -> 0x0032, RuntimeException -> 0x002e, all -> 0x0029 }
    L_0x011f:
        r1 = r12.f2370B;	 Catch:{ all -> 0x0127 }
        r0 = r12.f2373E;	 Catch:{ all -> 0x0127 }
        r1.deleteFile(r0);	 Catch:{ all -> 0x0127 }
        throw r3;	 Catch:{ all -> 0x0127 }
    L_0x0127:
        r0 = move-exception;
        r2 = r4;
        goto L_0x01e2;
    L_0x012b:
        r0 = "PendingMediaStoreSerializer";	 Catch:{ all -> 0x0138 }
        X.AnonymousClass0Gn.m1880G(r0, r1);	 Catch:{ all -> 0x0138 }
        r1 = r12.f2370B;	 Catch:{ all -> 0x0138 }
        r0 = r12.f2373E;	 Catch:{ all -> 0x0138 }
        r1.deleteFile(r0);	 Catch:{ all -> 0x0138 }
        goto L_0x010a;	 Catch:{ all -> 0x0138 }
    L_0x0138:
        r0 = move-exception;
        goto L_0x01e2;
    L_0x013b:
        r2 = r4;
    L_0x013c:
        X.AnonymousClass0Du.m1315C(r4);	 Catch:{ all -> 0x01e9 }
        goto L_0x010d;	 Catch:{ all -> 0x01e9 }
    L_0x0140:
        r3 = X.AnonymousClass0Gd.m1838C();	 Catch:{ all -> 0x01e9 }
        r9 = 1;	 Catch:{ all -> 0x01e9 }
        r3 = r3 - r9;	 Catch:{ all -> 0x01e9 }
        r7 = r8.iterator();	 Catch:{ all -> 0x01e9 }
    L_0x014b:
        r0 = r7.hasNext();	 Catch:{ all -> 0x01e9 }
        if (r0 == 0) goto L_0x0162;	 Catch:{ all -> 0x01e9 }
    L_0x0151:
        r6 = r7.next();	 Catch:{ all -> 0x01e9 }
        r6 = (X.AnonymousClass0OA) r6;	 Catch:{ all -> 0x01e9 }
        r0 = r6.TB;	 Catch:{ all -> 0x01e9 }
        if (r0 != 0) goto L_0x014b;	 Catch:{ all -> 0x01e9 }
    L_0x015b:
        r1 = r3 - r9;	 Catch:{ all -> 0x01e9 }
        r0 = (int) r3;	 Catch:{ all -> 0x01e9 }
        r6.TB = r0;	 Catch:{ all -> 0x01e9 }
        r3 = r1;	 Catch:{ all -> 0x01e9 }
        goto L_0x014b;	 Catch:{ all -> 0x01e9 }
    L_0x0162:
        r6 = com.instagram.pendingmedia.store.PendingMediaStore.m3537C();	 Catch:{ all -> 0x01e9 }
        r0 = r8.isEmpty();	 Catch:{ all -> 0x01e9 }
        if (r0 != 0) goto L_0x0187;	 Catch:{ all -> 0x01e9 }
    L_0x016c:
        r3 = r8.iterator();	 Catch:{ all -> 0x01e9 }
    L_0x0170:
        r0 = r3.hasNext();	 Catch:{ all -> 0x01e9 }
        if (r0 == 0) goto L_0x0184;	 Catch:{ all -> 0x01e9 }
    L_0x0176:
        r2 = r3.next();	 Catch:{ all -> 0x01e9 }
        r2 = (X.AnonymousClass0OA) r2;	 Catch:{ all -> 0x01e9 }
        r1 = r6.f3787B;	 Catch:{ all -> 0x01e9 }
        r0 = r2.UB;	 Catch:{ all -> 0x01e9 }
        r1.put(r0, r2);	 Catch:{ all -> 0x01e9 }
        goto L_0x0170;	 Catch:{ all -> 0x01e9 }
    L_0x0184:
        r6.m3546H();	 Catch:{ all -> 0x01e9 }
    L_0x0187:
        r5 = r5.iterator();	 Catch:{ all -> 0x01e9 }
    L_0x018b:
        r0 = r5.hasNext();	 Catch:{ all -> 0x01e9 }
        if (r0 == 0) goto L_0x01d1;	 Catch:{ all -> 0x01e9 }
    L_0x0191:
        r4 = r5.next();	 Catch:{ all -> 0x01e9 }
        r4 = (X.AnonymousClass0OA) r4;	 Catch:{ all -> 0x01e9 }
        r0 = r4.m3559E();	 Catch:{ all -> 0x01e9 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x01e9 }
        r3.<init>();	 Catch:{ all -> 0x01e9 }
        r2 = r0.iterator();	 Catch:{ all -> 0x01e9 }
    L_0x01a4:
        r0 = r2.hasNext();	 Catch:{ all -> 0x01e9 }
        if (r0 == 0) goto L_0x01be;	 Catch:{ all -> 0x01e9 }
    L_0x01aa:
        r1 = r2.next();	 Catch:{ all -> 0x01e9 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x01e9 }
        r0 = r6.m3539A(r1);	 Catch:{ all -> 0x01e9 }
        if (r0 == 0) goto L_0x01a4;	 Catch:{ all -> 0x01e9 }
    L_0x01b6:
        r0 = r6.m3539A(r1);	 Catch:{ all -> 0x01e9 }
        r3.add(r0);	 Catch:{ all -> 0x01e9 }
        goto L_0x01a4;	 Catch:{ all -> 0x01e9 }
    L_0x01be:
        r4.m3606z(r3);	 Catch:{ all -> 0x01e9 }
        r0 = r4.m3558D();	 Catch:{ all -> 0x01e9 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x01e9 }
        if (r0 == 0) goto L_0x018b;	 Catch:{ all -> 0x01e9 }
    L_0x01cb:
        r0 = r4.UB;	 Catch:{ all -> 0x01e9 }
        r6.m3544F(r0);	 Catch:{ all -> 0x01e9 }
        goto L_0x018b;	 Catch:{ all -> 0x01e9 }
    L_0x01d1:
        r2 = r12.f2378J;	 Catch:{ all -> 0x01e9 }
        r1 = new X.0Zx;	 Catch:{ all -> 0x01e9 }
        r1.<init>(r12, r13);	 Catch:{ all -> 0x01e9 }
        r0 = -488205406; // 0xffffffffe2e693a2 float:-2.1266946E21 double:NaN;	 Catch:{ all -> 0x01e9 }
        X.AnonymousClass0OR.m3624D(r2, r1, r0);	 Catch:{ all -> 0x01e9 }
        goto L_0x0013;	 Catch:{ all -> 0x01e9 }
    L_0x01e0:
        r0 = move-exception;
        r11 = r4;
    L_0x01e2:
        X.AnonymousClass0Du.m1315C(r11);	 Catch:{ all -> 0x01e9 }
        X.AnonymousClass0Du.m1315C(r2);	 Catch:{ all -> 0x01e9 }
        throw r0;	 Catch:{ all -> 0x01e9 }
    L_0x01e9:
        r0 = move-exception;
        monitor-exit(r12);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.store.PendingMediaStoreSerializer.B(com.instagram.pendingmedia.store.PendingMediaStoreSerializer, X.0Cm):void");
    }

    /* renamed from: C */
    public static PendingMediaStoreSerializer m1814C() {
        if (f2369N == null) {
            m1815D();
        }
        return f2369N;
    }

    /* renamed from: C */
    public final void m1819C() {
        AnonymousClass0GG.m1763B(this.f2377I, this.f2380L, 2019500445);
    }

    /* renamed from: D */
    private static synchronized void m1815D() {
        synchronized (PendingMediaStoreSerializer.class) {
            if (f2369N == null) {
                f2369N = new PendingMediaStoreSerializer();
            }
        }
    }

    /* renamed from: D */
    public final synchronized void m1820D(AnonymousClass0Cn anonymousClass0Cn) {
        PendingMediaStore.m3537C().f3787B.clear();
        this.f2372D = Boolean.valueOf(false);
        this.f2373E = null;
        if (anonymousClass0Cn.xX()) {
            AnonymousClass0Cm B = AnonymousClass0FL.m1559B(anonymousClass0Cn);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(B.f1759C);
            stringBuilder.append("_pending_media.json");
            this.f2373E = stringBuilder.toString();
            if (!this.f2372D.booleanValue()) {
                AnonymousClass0GG.m1763B(this.f2377I, new AnonymousClass0ZZ(this, B), -1005405598);
            }
        }
    }

    /* renamed from: E */
    private static boolean m1816E(AnonymousClass0OA anonymousClass0OA) {
        if (!anonymousClass0OA.PB) {
            if (!anonymousClass0OA.m3597q()) {
                if (anonymousClass0OA.m3591k()) {
                    if (anonymousClass0OA.m3559E() == null || anonymousClass0OA.m3559E().isEmpty()) {
                        return false;
                    }
                } else if (TextUtils.isEmpty(anonymousClass0OA.DB) || !new File(anonymousClass0OA.DB).exists()) {
                    return false;
                }
                return true;
            }
        }
        if (!anonymousClass0OA.m3599s()) {
            if (!new File(anonymousClass0OA.DB).exists()) {
                return false;
            }
        }
        return true;
    }
}
