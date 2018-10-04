package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2km */
public final class AnonymousClass2km {
    /* renamed from: B */
    public final String f33292B = "TaskQueueExecutor";
    /* renamed from: C */
    public final HashSet f33293C;
    /* renamed from: D */
    public final LinkedList f33294D;
    /* renamed from: E */
    public final Object f33295E;
    /* renamed from: F */
    public int f33296F;
    /* renamed from: G */
    private final HashMap f33297G;
    /* renamed from: H */
    private final AtomicInteger f33298H;
    /* renamed from: I */
    private final AnonymousClass3sP f33299I;

    public AnonymousClass2km(AnonymousClass3sP anonymousClass3sP) {
        this.f33299I = anonymousClass3sP;
        this.f33294D = new LinkedList();
        this.f33293C = new HashSet();
        this.f33295E = new Object();
        this.f33296F = 0;
        this.f33298H = new AtomicInteger(0);
        this.f33297G = new HashMap();
    }

    /* renamed from: A */
    public final AnonymousClass2kj m17036A(AnonymousClass2kj anonymousClass2kj) {
        AnonymousClass2kj anonymousClass2kj2;
        AnonymousClass2kk anonymousClass2kk = new AnonymousClass2kk(anonymousClass2kj, 0);
        synchronized (this.f33294D) {
            Iterator it = this.f33293C.iterator();
            while (it.hasNext()) {
                AnonymousClass2kk anonymousClass2kk2 = (AnonymousClass2kk) it.next();
                if (anonymousClass2kk2.equals(anonymousClass2kk)) {
                    anonymousClass2kj2 = anonymousClass2kk2.f33290C;
                    break;
                }
            }
            it = this.f33294D.iterator();
            while (it.hasNext()) {
                anonymousClass2kk2 = (AnonymousClass2kk) it.next();
                if (anonymousClass2kk2.equals(anonymousClass2kk)) {
                    anonymousClass2kj2 = anonymousClass2kk2.f33290C;
                    break;
                }
            }
            anonymousClass2kj2 = null;
        }
        return anonymousClass2kj2;
    }

    /* renamed from: B */
    public final int m17037B(Object obj) {
        int i;
        synchronized (this.f33294D) {
            i = 0;
            ListIterator listIterator = this.f33294D.listIterator();
            while (listIterator.hasNext()) {
                if (obj.equals(((AnonymousClass2kk) listIterator.next()).f33290C)) {
                    listIterator.remove();
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: B */
    public static void m17032B(X.AnonymousClass2km r9, X.AnonymousClass2kk r10, boolean r11) {
        /*
        r8 = 0;
        r7 = 0;
        r5 = 1;
        r2 = r9.f33294D;	 Catch:{ all -> 0x0171 }
        monitor-enter(r2);	 Catch:{ all -> 0x0171 }
        r0 = r9.f33293C;	 Catch:{ all -> 0x0167 }
        r0 = r0.contains(r10);	 Catch:{ all -> 0x0167 }
        if (r0 == 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r2);	 Catch:{ all -> 0x0167 }
    L_0x000f:
        return;
    L_0x0010:
        r0 = r9.f33294D;	 Catch:{ all -> 0x0167 }
        r4 = r0.size();	 Catch:{ all -> 0x0167 }
        r0 = r9.f33299I;	 Catch:{ all -> 0x0167 }
        r0 = r0.f45746B;	 Catch:{ all -> 0x0167 }
        r3 = X.AnonymousClass1Gk.xB(r0);	 Catch:{ all -> 0x0167 }
        if (r11 == 0) goto L_0x0075;
    L_0x0020:
        r0 = r9.f33294D;	 Catch:{ all -> 0x0167 }
        r0 = r0.contains(r10);	 Catch:{ all -> 0x0167 }
        if (r0 == 0) goto L_0x0041;
    L_0x0028:
        r0 = r9.f33294D;	 Catch:{ all -> 0x0167 }
        r0.remove(r10);	 Catch:{ all -> 0x0167 }
        r4 = r4 + -1;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0167 }
        r1.<init>();	 Catch:{ all -> 0x0167 }
        r0 = "Found duplicate task. The old task is removed ";
        r1.append(r0);	 Catch:{ all -> 0x0167 }
        r1.append(r10);	 Catch:{ all -> 0x0167 }
        r6 = r1.toString();	 Catch:{ all -> 0x0167 }
        goto L_0x0042;
    L_0x0041:
        r6 = r8;
    L_0x0042:
        r3 = r3 - r5;
        if (r3 >= r4) goto L_0x0050;
    L_0x0045:
        r0 = r9.f33294D;	 Catch:{ all -> 0x016f }
        r0 = r0.subList(r3, r4);	 Catch:{ all -> 0x016f }
        r0.clear();	 Catch:{ all -> 0x016f }
        r6 = "Task queue is over sized. Remove the old tasks";
    L_0x0050:
        r0 = r9.f33294D;	 Catch:{ all -> 0x016f }
        r0.addFirst(r10);	 Catch:{ all -> 0x016f }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x016f }
        r1.<init>();	 Catch:{ all -> 0x016f }
        r0 = "Add new task to the front of the queue. Total task number is ";
        r1.append(r0);	 Catch:{ all -> 0x016f }
        r0 = r9.f33294D;	 Catch:{ all -> 0x016f }
        r0 = r0.size();	 Catch:{ all -> 0x016f }
        r1.append(r0);	 Catch:{ all -> 0x016f }
        r0 = ", ";
        r1.append(r0);	 Catch:{ all -> 0x016f }
        r1.append(r10);	 Catch:{ all -> 0x016f }
        r3 = r1.toString();	 Catch:{ all -> 0x016f }
        goto L_0x00e7;
    L_0x0075:
        if (r3 > r4) goto L_0x00a8;
    L_0x0077:
        if (r3 >= r4) goto L_0x0094;
    L_0x0079:
        r0 = r9.f33294D;	 Catch:{ all -> 0x0167 }
        r0 = r0.subList(r3, r4);	 Catch:{ all -> 0x0167 }
        r0.clear();	 Catch:{ all -> 0x0167 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0167 }
        r1.<init>();	 Catch:{ all -> 0x0167 }
        r0 = "Task queue is over sized. Remove the old tasks. The new task is not added ";
        r1.append(r0);	 Catch:{ all -> 0x0167 }
        r1.append(r10);	 Catch:{ all -> 0x0167 }
        r6 = r1.toString();	 Catch:{ all -> 0x0167 }
        goto L_0x00a5;
    L_0x0094:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0167 }
        r1.<init>();	 Catch:{ all -> 0x0167 }
        r0 = "Task queue is over sized. The new task is not added ";
        r1.append(r0);	 Catch:{ all -> 0x0167 }
        r1.append(r10);	 Catch:{ all -> 0x0167 }
        r6 = r1.toString();	 Catch:{ all -> 0x0167 }
    L_0x00a5:
        r3 = r8;
        r0 = 0;
        goto L_0x00e8;
    L_0x00a8:
        r0 = r9.f33294D;	 Catch:{ all -> 0x0167 }
        r0 = r0.contains(r10);	 Catch:{ all -> 0x0167 }
        if (r0 == 0) goto L_0x00c2;
    L_0x00b0:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0167 }
        r1.<init>();	 Catch:{ all -> 0x0167 }
        r0 = "Found duplicate task. The new task is not added. ";
        r1.append(r0);	 Catch:{ all -> 0x0167 }
        r1.append(r10);	 Catch:{ all -> 0x0167 }
        r6 = r1.toString();	 Catch:{ all -> 0x0167 }
        goto L_0x00a5;
    L_0x00c2:
        r0 = r9.f33294D;	 Catch:{ all -> 0x0167 }
        r0.addLast(r10);	 Catch:{ all -> 0x0167 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0167 }
        r1.<init>();	 Catch:{ all -> 0x0167 }
        r0 = "Add new task to the end of queue. Total task number is ";
        r1.append(r0);	 Catch:{ all -> 0x0167 }
        r0 = r9.f33294D;	 Catch:{ all -> 0x0167 }
        r0 = r0.size();	 Catch:{ all -> 0x0167 }
        r1.append(r0);	 Catch:{ all -> 0x0167 }
        r0 = ", ";
        r1.append(r0);	 Catch:{ all -> 0x0167 }
        r1.append(r10);	 Catch:{ all -> 0x0167 }
        r3 = r1.toString();	 Catch:{ all -> 0x0167 }
        r6 = r8;
    L_0x00e7:
        r0 = 1;
    L_0x00e8:
        if (r0 == 0) goto L_0x010d;
    L_0x00ea:
        r0 = r9.f33298H;	 Catch:{ all -> 0x0164 }
        r0 = r0.get();	 Catch:{ all -> 0x0164 }
        if (r0 <= 0) goto L_0x010d;
    L_0x00f2:
        r0 = r9.f33294D;	 Catch:{ all -> 0x0164 }
        r0.notify();	 Catch:{ all -> 0x0164 }
        monitor-exit(r2);	 Catch:{ all -> 0x0164 }
        if (r6 == 0) goto L_0x0105;
    L_0x00fa:
        r2 = r9.f33292B;
        r1 = "%s";
        r0 = new java.lang.Object[r5];
        r0[r7] = r6;
        X.AnonymousClass1Gl.C(r2, r1, r0);
    L_0x0105:
        if (r3 == 0) goto L_0x000f;
    L_0x0107:
        r0 = new java.lang.Object[r5];
        r0[r7] = r3;
        goto L_0x000f;
    L_0x010d:
        monitor-exit(r2);	 Catch:{ all -> 0x0164 }
        if (r6 == 0) goto L_0x011b;
    L_0x0110:
        r2 = r9.f33292B;
        r1 = "%s";
        r0 = new java.lang.Object[r5];
        r0[r7] = r6;
        X.AnonymousClass1Gl.C(r2, r1, r0);
    L_0x011b:
        if (r3 == 0) goto L_0x0121;
    L_0x011d:
        r0 = new java.lang.Object[r5];
        r0[r7] = r3;
    L_0x0121:
        r0 = r9.m17034D();
        if (r0 == 0) goto L_0x014d;
    L_0x0127:
        r1 = new X.2kl;
        r1.<init>(r9);
        r1.start();
        r4 = r9.f33292B;
        r3 = "Create a new worker %d. Total worker number is %d.";
        r0 = 2;
        r2 = new java.lang.Object[r0];
        r0 = r1.getId();
        r0 = java.lang.Long.valueOf(r0);
        r2[r7] = r0;
        r0 = r9.f33296F;
        r0 = java.lang.Integer.valueOf(r0);
        r2[r5] = r0;
        X.AnonymousClass1Gl.C(r4, r3, r2);
        goto L_0x000f;
    L_0x014d:
        r3 = r9.f33292B;
        r2 = "All workers are busy. Tasks on pending %d.";
        r1 = new java.lang.Object[r5];
        r0 = r9.f33294D;
        r0 = r0.size();
        r0 = java.lang.Integer.valueOf(r0);
        r1[r7] = r0;
        X.AnonymousClass1Gl.C(r3, r2, r1);
        goto L_0x000f;
    L_0x0164:
        r0 = move-exception;
        r8 = r3;
        goto L_0x0169;
    L_0x0167:
        r0 = move-exception;
        r6 = r8;
    L_0x0169:
        monitor-exit(r2);	 Catch:{ all -> 0x016f }
        throw r0;	 Catch:{ all -> 0x016b }
    L_0x016b:
        r4 = move-exception;
        r3 = r8;
        r8 = r6;
        goto L_0x0173;
    L_0x016f:
        r0 = move-exception;
        goto L_0x0169;
    L_0x0171:
        r4 = move-exception;
        r3 = r8;
    L_0x0173:
        if (r8 == 0) goto L_0x0180;
    L_0x0175:
        r2 = r9.f33292B;
        r1 = "%s";
        r0 = new java.lang.Object[r5];
        r0[r7] = r8;
        X.AnonymousClass1Gl.C(r2, r1, r0);
    L_0x0180:
        if (r3 == 0) goto L_0x0186;
    L_0x0182:
        r0 = new java.lang.Object[r5];
        r0[r7] = r3;
    L_0x0186:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2km.B(X.2km, X.2kk, boolean):void");
    }

    /* renamed from: C */
    public static X.AnonymousClass2kk m17033C(X.AnonymousClass2km r17) {
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
    L_0x0000:
        r6 = r17;
        r3 = r6.f33294D;
        monitor-enter(r3);
        r0 = r6.f33294D;	 Catch:{ all -> 0x00d6 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00d6 }
        r8 = 0;	 Catch:{ all -> 0x00d6 }
        if (r0 == 0) goto L_0x0030;	 Catch:{ all -> 0x00d6 }
    L_0x000e:
        r0 = r6.f33298H;	 Catch:{ all -> 0x00d6 }
        r0.incrementAndGet();	 Catch:{ all -> 0x00d6 }
        r2 = r6.f33294D;	 Catch:{ InterruptedException -> 0x0022 }
        r0 = r6.f33299I;	 Catch:{ InterruptedException -> 0x0022 }
        r0 = r0.f45746B;	 Catch:{ InterruptedException -> 0x0022 }
        r0 = X.AnonymousClass1Gk.uB(r0);	 Catch:{ InterruptedException -> 0x0022 }
        r0 = (long) r0;	 Catch:{ InterruptedException -> 0x0022 }
        r2.wait(r0);	 Catch:{ InterruptedException -> 0x0022 }
        goto L_0x002b;	 Catch:{ InterruptedException -> 0x0022 }
    L_0x0022:
        r2 = r6.f33292B;	 Catch:{ all -> 0x00d6 }
        r1 = "killed worker after idle";	 Catch:{ all -> 0x00d6 }
        r0 = new java.lang.Object[r8];	 Catch:{ all -> 0x00d6 }
        X.AnonymousClass1Gl.C(r2, r1, r0);	 Catch:{ all -> 0x00d6 }
    L_0x002b:
        r0 = r6.f33298H;	 Catch:{ all -> 0x00d6 }
        r0.decrementAndGet();	 Catch:{ all -> 0x00d6 }
    L_0x0030:
        r0 = r6.f33294D;	 Catch:{ all -> 0x00d6 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00d6 }
        if (r0 == 0) goto L_0x003b;	 Catch:{ all -> 0x00d6 }
    L_0x0038:
        r2 = 0;	 Catch:{ all -> 0x00d6 }
        monitor-exit(r3);	 Catch:{ all -> 0x00d6 }
    L_0x003a:
        return r2;	 Catch:{ all -> 0x00d6 }
    L_0x003b:
        monitor-exit(r3);	 Catch:{ all -> 0x00d6 }
    L_0x003c:
        r7 = r6.f33297G;
        monitor-enter(r7);
        r15 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x00d3 }
        r0 = r6.f33297G;	 Catch:{ all -> 0x00d3 }
        r1 = r0.keySet();	 Catch:{ all -> 0x00d3 }
        r0 = new java.lang.Integer[r8];	 Catch:{ all -> 0x00d3 }
        r11 = r1.toArray(r0);	 Catch:{ all -> 0x00d3 }
        r11 = (java.lang.Integer[]) r11;	 Catch:{ all -> 0x00d3 }
        r10 = r11.length;	 Catch:{ all -> 0x00d3 }
        r13 = 0;	 Catch:{ all -> 0x00d3 }
        r2 = 0;	 Catch:{ all -> 0x00d3 }
        r9 = 0;	 Catch:{ all -> 0x00d3 }
    L_0x0057:
        if (r9 >= r10) goto L_0x008e;	 Catch:{ all -> 0x00d3 }
    L_0x0059:
        r0 = r11[r9];	 Catch:{ all -> 0x00d3 }
        r12 = r0.intValue();	 Catch:{ all -> 0x00d3 }
        r1 = r6.f33297G;	 Catch:{ all -> 0x00d3 }
        r0 = java.lang.Integer.valueOf(r12);	 Catch:{ all -> 0x00d3 }
        r0 = r1.get(r0);	 Catch:{ all -> 0x00d3 }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x00d3 }
        r4 = r0.longValue();	 Catch:{ all -> 0x00d3 }
        r4 = r4 - r15;	 Catch:{ all -> 0x00d3 }
        r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));	 Catch:{ all -> 0x00d3 }
        if (r0 > 0) goto L_0x0086;	 Catch:{ all -> 0x00d3 }
    L_0x0074:
        r1 = r6.f33297G;	 Catch:{ all -> 0x00d3 }
        r0 = java.lang.Integer.valueOf(r12);	 Catch:{ all -> 0x00d3 }
        r1.remove(r0);	 Catch:{ all -> 0x00d3 }
        r0 = r6.f33297G;	 Catch:{ all -> 0x00d3 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00d3 }
        if (r0 == 0) goto L_0x008b;	 Catch:{ all -> 0x00d3 }
    L_0x0085:
        goto L_0x008b;	 Catch:{ all -> 0x00d3 }
    L_0x0086:
        r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));	 Catch:{ all -> 0x00d3 }
        if (r0 <= 0) goto L_0x008b;	 Catch:{ all -> 0x00d3 }
    L_0x008a:
        r2 = r4;	 Catch:{ all -> 0x00d3 }
    L_0x008b:
        r9 = r9 + 1;	 Catch:{ all -> 0x00d3 }
        goto L_0x0057;	 Catch:{ all -> 0x00d3 }
    L_0x008e:
        r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1));	 Catch:{ all -> 0x00d3 }
        if (r0 > 0) goto L_0x00b1;	 Catch:{ all -> 0x00d3 }
    L_0x0092:
        monitor-exit(r7);	 Catch:{ all -> 0x00d3 }
        r1 = r6.f33294D;
        monitor-enter(r1);
        r0 = r6.f33294D;	 Catch:{ all -> 0x00ae }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00ae }
        if (r0 == 0) goto L_0x00a1;	 Catch:{ all -> 0x00ae }
    L_0x009e:
        monitor-exit(r1);	 Catch:{ all -> 0x00ae }
        goto L_0x0000;	 Catch:{ all -> 0x00ae }
    L_0x00a1:
        r0 = r6.f33294D;	 Catch:{ all -> 0x00ae }
        r2 = X.AnonymousClass2km.m17035E(r0);	 Catch:{ all -> 0x00ae }
        r0 = r6.f33293C;	 Catch:{ all -> 0x00ae }
        r0.add(r2);	 Catch:{ all -> 0x00ae }
        monitor-exit(r1);	 Catch:{ all -> 0x00ae }
        goto L_0x003a;	 Catch:{ all -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;	 Catch:{ all -> 0x00ae }
        monitor-exit(r1);	 Catch:{ all -> 0x00ae }
    L_0x00b0:
        throw r0;
    L_0x00b1:
        r5 = r6.f33292B;	 Catch:{ all -> 0x00d3 }
        r4 = "Blocked for %d ms";	 Catch:{ all -> 0x00d3 }
        r0 = 1;	 Catch:{ all -> 0x00d3 }
        r1 = new java.lang.Object[r0];	 Catch:{ all -> 0x00d3 }
        r0 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x00d3 }
        r1[r8] = r0;	 Catch:{ all -> 0x00d3 }
        X.AnonymousClass1Gl.C(r5, r4, r1);	 Catch:{ all -> 0x00d3 }
        r0 = r6.f33297G;	 Catch:{ InterruptedException -> 0x00c7 }
        r0.wait(r2);	 Catch:{ InterruptedException -> 0x00c7 }
        goto L_0x00d0;	 Catch:{ InterruptedException -> 0x00c7 }
    L_0x00c7:
        r2 = r6.f33292B;	 Catch:{ all -> 0x00d3 }
        r1 = "killed worker after idle until block until";	 Catch:{ all -> 0x00d3 }
        r0 = new java.lang.Object[r8];	 Catch:{ all -> 0x00d3 }
        X.AnonymousClass1Gl.C(r2, r1, r0);	 Catch:{ all -> 0x00d3 }
    L_0x00d0:
        monitor-exit(r7);	 Catch:{ all -> 0x00d3 }
        goto L_0x003c;	 Catch:{ all -> 0x00d3 }
    L_0x00d3:
        r0 = move-exception;	 Catch:{ all -> 0x00d3 }
        monitor-exit(r7);	 Catch:{ all -> 0x00d3 }
        goto L_0x00b0;	 Catch:{ all -> 0x00d3 }
    L_0x00d6:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00d6 }
        goto L_0x00b0;	 Catch:{ all -> 0x00d6 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2km.C(X.2km):X.2kk");
    }

    /* renamed from: D */
    private boolean m17034D() {
        boolean z;
        synchronized (this.f33295E) {
            if (this.f33296F < AnonymousClass1Gk.yB(this.f33299I.f45746B)) {
                z = true;
                this.f33296F++;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: E */
    private static AnonymousClass2kk m17035E(LinkedList linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            if (((AnonymousClass2kk) linkedList.get(i)).f33290C.BQ() == AnonymousClass2ki.HIGH) {
                return (AnonymousClass2kk) linkedList.remove(i);
            }
        }
        return (AnonymousClass2kk) linkedList.removeFirst();
    }
}
