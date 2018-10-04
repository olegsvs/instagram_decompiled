package X;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.facebook.common.dextricks.DexStore;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2gB */
public final class AnonymousClass2gB {
    /* renamed from: B */
    public final AtomicInteger f32320B = new AtomicInteger();
    /* renamed from: C */
    public final LinkedList f32321C = new LinkedList();
    /* renamed from: D */
    public BufferInfo f32322D;
    /* renamed from: E */
    public volatile boolean f32323E;
    /* renamed from: F */
    public String f32324F;
    /* renamed from: G */
    public MediaCodec f32325G;
    /* renamed from: H */
    public MediaExtractor f32326H;
    /* renamed from: I */
    public final HashMap f32327I = new HashMap();
    /* renamed from: J */
    public ExecutorService f32328J;
    /* renamed from: K */
    private byte[] f32329K;
    /* renamed from: L */
    private byte[] f32330L;

    public AnonymousClass2gB() {
        int minBufferSize = AudioTrack.getMinBufferSize(44100, 4, 2);
        if (minBufferSize <= 0) {
            minBufferSize = DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED;
        }
        this.f32330L = new byte[minBufferSize];
        this.f32329K = new byte[(minBufferSize / 2)];
        this.f32322D = new BufferInfo();
        this.f32328J = Executors.newSingleThreadExecutor();
    }

    /* renamed from: A */
    public final void m16868A(String str, AnonymousClass3rx anonymousClass3rx, boolean z) {
        AnonymousClass2gB anonymousClass2gB = this;
        if (!this.f32323E) {
            String str2 = str;
            File file = new File(str);
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf != -1) {
                name = name.substring(0, lastIndexOf);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(file.getParent());
            stringBuilder.append('/');
            stringBuilder.append(name);
            stringBuilder.append(".pcm");
            String stringBuilder2 = stringBuilder.toString();
            synchronized (anonymousClass2gB.f32327I) {
                AnonymousClass2gA anonymousClass2gA = (AnonymousClass2gA) anonymousClass2gB.f32327I.get(stringBuilder2);
                if (anonymousClass2gA != null) {
                    anonymousClass2gA.m16862A(anonymousClass3rx);
                } else if (!anonymousClass2gB.f32328J.isShutdown() || anonymousClass3rx == null) {
                    str = new AnonymousClass2gA(stringBuilder2);
                    str.m16862A(anonymousClass3rx);
                    anonymousClass2gB.f32327I.put(stringBuilder2, str);
                    anonymousClass3rx = z;
                    if (z) {
                        anonymousClass2gB.f32320B.incrementAndGet();
                    }
                    AnonymousClass0GG.B(anonymousClass2gB.f32328J, new AnonymousClass2g8(anonymousClass2gB, str2, stringBuilder2, str, anonymousClass3rx), -2046271796);
                }
            }
        }
    }

    /* renamed from: B */
    public static synchronized int m16864B(X.AnonymousClass2gB r11, java.lang.String r12, java.lang.String r13) {
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
        monitor-enter(r11);
        r4 = 0;
        r3 = 0;
        r2 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00e6 }
        r2.<init>(r13, r3);	 Catch:{ IOException -> 0x00e6 }
        r5 = 0;	 Catch:{ IOException -> 0x00e6 }
        r0 = new android.media.MediaExtractor;	 Catch:{ Exception -> 0x006c }
        r0.<init>();	 Catch:{ Exception -> 0x006c }
        r11.f32326H = r0;	 Catch:{ Exception -> 0x006c }
        r0 = r11.f32326H;	 Catch:{ Exception -> 0x006c }
        r0.setDataSource(r12);	 Catch:{ Exception -> 0x006c }
        r0 = r11.f32326H;	 Catch:{ Exception -> 0x006c }
        r0 = r0.getTrackCount();	 Catch:{ Exception -> 0x006c }
        if (r0 <= 0) goto L_0x006c;	 Catch:{ Exception -> 0x006c }
    L_0x001d:
        r0 = r11.f32326H;	 Catch:{ Exception -> 0x006c }
        r6 = r0.getTrackFormat(r5);	 Catch:{ Exception -> 0x006c }
        r0 = "mime";	 Catch:{ Exception -> 0x006c }
        r7 = r6.getString(r0);	 Catch:{ Exception -> 0x006c }
        r0 = r11.f32326H;	 Catch:{ Exception -> 0x006c }
        r0.selectTrack(r5);	 Catch:{ Exception -> 0x006c }
        r8 = r11.f32326H;	 Catch:{ Exception -> 0x006c }
        r0 = 0;	 Catch:{ Exception -> 0x006c }
        r8.seekTo(r0, r5);	 Catch:{ Exception -> 0x006c }
        r0 = r11.f32325G;	 Catch:{ Exception -> 0x006c }
        if (r0 == 0) goto L_0x0048;	 Catch:{ Exception -> 0x006c }
    L_0x0039:
        r0 = r11.f32324F;	 Catch:{ Exception -> 0x006c }
        r0 = r7.equals(r0);	 Catch:{ Exception -> 0x006c }
        if (r0 != 0) goto L_0x0042;	 Catch:{ Exception -> 0x006c }
    L_0x0041:
        goto L_0x0048;	 Catch:{ Exception -> 0x006c }
    L_0x0042:
        r0 = r11.f32325G;	 Catch:{ Exception -> 0x006c }
        r0.stop();	 Catch:{ Exception -> 0x006c }
        goto L_0x0059;	 Catch:{ Exception -> 0x006c }
    L_0x0048:
        r0 = r11.f32325G;	 Catch:{ Exception -> 0x006c }
        if (r0 == 0) goto L_0x0051;	 Catch:{ Exception -> 0x006c }
    L_0x004c:
        r0 = r11.f32325G;	 Catch:{ Exception -> 0x006c }
        r0.release();	 Catch:{ Exception -> 0x006c }
    L_0x0051:
        r0 = android.media.MediaCodec.createDecoderByType(r7);	 Catch:{ Exception -> 0x006c }
        r11.f32325G = r0;	 Catch:{ Exception -> 0x006c }
        r11.f32324F = r7;	 Catch:{ Exception -> 0x006c }
    L_0x0059:
        r1 = r11.f32325G;	 Catch:{ Exception -> 0x006c }
        r0 = 0;	 Catch:{ Exception -> 0x006c }
        r1.configure(r6, r0, r0, r5);	 Catch:{ Exception -> 0x006c }
        r0 = r11.f32325G;	 Catch:{ Exception -> 0x006c }
        r0.start();	 Catch:{ Exception -> 0x006c }
        r0 = new android.media.MediaCodec$BufferInfo;	 Catch:{ Exception -> 0x006c }
        r0.<init>();	 Catch:{ Exception -> 0x006c }
        r11.f32322D = r0;	 Catch:{ Exception -> 0x006c }
        r5 = 1;	 Catch:{ Exception -> 0x006c }
    L_0x006c:
        if (r5 == 0) goto L_0x00ea;
    L_0x006e:
        r0 = r11.f32325G;	 Catch:{ all -> 0x00e3 }
        r6 = r0.getInputBuffers();	 Catch:{ all -> 0x00e3 }
        r0 = r11.f32325G;	 Catch:{ all -> 0x00e3 }
        r10 = r0.getOutputBuffers();	 Catch:{ all -> 0x00e3 }
        r9 = 0;	 Catch:{ all -> 0x00e3 }
        r8 = 0;	 Catch:{ all -> 0x00e3 }
    L_0x007c:
        if (r9 != 0) goto L_0x00cb;	 Catch:{ all -> 0x00e3 }
    L_0x007e:
        r0 = r11.f32323E;	 Catch:{ all -> 0x00e3 }
        if (r0 == 0) goto L_0x0087;	 Catch:{ all -> 0x00e3 }
    L_0x0082:
        X.AnonymousClass2gB.m16865C(r13, r2);	 Catch:{ all -> 0x00e3 }
    L_0x0085:
        monitor-exit(r11);
        return r3;
    L_0x0087:
        if (r8 != 0) goto L_0x0092;
    L_0x0089:
        r8 = X.AnonymousClass2gB.m16866D(r11, r6);	 Catch:{ Exception -> 0x008e }
        goto L_0x0092;	 Catch:{ Exception -> 0x008e }
    L_0x008e:
        X.AnonymousClass2gB.m16865C(r13, r2);	 Catch:{ all -> 0x00e3 }
        goto L_0x0085;	 Catch:{ all -> 0x00e3 }
    L_0x0092:
        r7 = r11.f32325G;	 Catch:{ Exception -> 0x00c7 }
        r5 = r11.f32322D;	 Catch:{ Exception -> 0x00c7 }
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;	 Catch:{ Exception -> 0x00c7 }
        r1 = r7.dequeueOutputBuffer(r5, r0);	 Catch:{ Exception -> 0x00c7 }
        switch(r1) {
            case -3: goto L_0x00ad;
            case -2: goto L_0x00a6;
            case -1: goto L_0x00a2;
            default: goto L_0x009f;
        };	 Catch:{ Exception -> 0x00c7 }
    L_0x009f:
        r0 = r10[r1];	 Catch:{ all -> 0x00e3 }
        goto L_0x00b4;	 Catch:{ all -> 0x00e3 }
    L_0x00a2:
        if (r8 == 0) goto L_0x00b7;	 Catch:{ all -> 0x00e3 }
    L_0x00a4:
        r9 = 1;	 Catch:{ all -> 0x00e3 }
        goto L_0x00b7;	 Catch:{ all -> 0x00e3 }
    L_0x00a6:
        r0 = r11.f32325G;	 Catch:{ all -> 0x00e3 }
        r4 = r0.getOutputFormat();	 Catch:{ all -> 0x00e3 }
        goto L_0x00b7;	 Catch:{ all -> 0x00e3 }
    L_0x00ad:
        r0 = r11.f32325G;	 Catch:{ all -> 0x00e3 }
        r10 = r0.getOutputBuffers();	 Catch:{ all -> 0x00e3 }
        goto L_0x00b7;	 Catch:{ all -> 0x00e3 }
    L_0x00b4:
        X.AnonymousClass2gB.m16867E(r11, r0, r1, r4, r2);	 Catch:{ Exception -> 0x00c3 }
    L_0x00b7:
        if (r8 == 0) goto L_0x007c;	 Catch:{ Exception -> 0x00c3 }
    L_0x00b9:
        r0 = r11.f32322D;	 Catch:{ all -> 0x00e3 }
        r0 = r0.flags;	 Catch:{ all -> 0x00e3 }
        r0 = r0 & 4;	 Catch:{ all -> 0x00e3 }
        if (r0 == 0) goto L_0x007c;	 Catch:{ all -> 0x00e3 }
    L_0x00c1:
        r9 = 1;	 Catch:{ all -> 0x00e3 }
        goto L_0x007c;	 Catch:{ all -> 0x00e3 }
    L_0x00c3:
        X.AnonymousClass2gB.m16865C(r13, r2);	 Catch:{ all -> 0x00e3 }
        goto L_0x0085;	 Catch:{ all -> 0x00e3 }
    L_0x00c7:
        X.AnonymousClass2gB.m16865C(r13, r2);	 Catch:{ all -> 0x00e3 }
        goto L_0x0085;	 Catch:{ all -> 0x00e3 }
    L_0x00cb:
        r2.close();	 Catch:{ IOException -> 0x00d3 }
        r0 = r11.f32326H;	 Catch:{ IOException -> 0x00d3 }
        r0.release();	 Catch:{ IOException -> 0x00d3 }
    L_0x00d3:
        if (r4 != 0) goto L_0x00d9;
    L_0x00d5:
        r0 = 44100; // 0xac44 float:6.1797E-41 double:2.17883E-319;
        goto L_0x00df;
    L_0x00d9:
        r0 = "sample-rate";	 Catch:{ all -> 0x00e3 }
        r0 = r4.getInteger(r0);	 Catch:{ all -> 0x00e3 }
    L_0x00df:
        monitor-exit(r11);
        return r0;
    L_0x00e1:
        r4 = r2;
        goto L_0x00e6;
    L_0x00e3:
        r0 = move-exception;
        monitor-exit(r11);
        throw r0;
    L_0x00e6:
        X.AnonymousClass2gB.m16865C(r13, r4);	 Catch:{ all -> 0x00e3 }
        goto L_0x0085;	 Catch:{ all -> 0x00e3 }
    L_0x00ea:
        r1 = new java.io.IOException;	 Catch:{ IOException -> 0x00e1 }
        r0 = "Unable to configure decoder";	 Catch:{ IOException -> 0x00e1 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x00e1 }
        throw r1;	 Catch:{ IOException -> 0x00e1 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2gB.B(X.2gB, java.lang.String, java.lang.String):int");
    }

    /* renamed from: C */
    private static void m16865C(java.lang.String r1, java.io.FileOutputStream r2) {
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
        if (r2 == 0) goto L_0x0005;
    L_0x0002:
        r2.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        r0 = new java.io.File;
        r0.<init>(r1);
        r0.delete();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2gB.C(java.lang.String, java.io.FileOutputStream):void");
    }

    /* renamed from: D */
    private static boolean m16866D(AnonymousClass2gB anonymousClass2gB, ByteBuffer[] byteBufferArr) {
        if (anonymousClass2gB.f32323E || anonymousClass2gB.f32326H == null) {
            throw new IllegalStateException("Cannot queue input buffer because media extractor has been closed");
        }
        int dequeueInputBuffer = anonymousClass2gB.f32325G.dequeueInputBuffer(10000);
        if (dequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer = byteBufferArr[dequeueInputBuffer];
            byteBuffer.clear();
            int readSampleData = anonymousClass2gB.f32326H.readSampleData(byteBuffer, 0);
            if (readSampleData < 0) {
                anonymousClass2gB.f32325G.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                return true;
            }
            anonymousClass2gB.f32325G.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, anonymousClass2gB.f32326H.getSampleTime(), 0);
            anonymousClass2gB.f32326H.advance();
        }
        return false;
    }

    /* renamed from: E */
    private static void m16867E(AnonymousClass2gB anonymousClass2gB, ByteBuffer byteBuffer, int i, MediaFormat mediaFormat, FileOutputStream fileOutputStream) {
        if (anonymousClass2gB.f32323E || anonymousClass2gB.f32325G == null) {
            throw new IllegalStateException("Cannot queue input buffer because media extractor has been closed");
        }
        if (anonymousClass2gB.f32322D.size != 0) {
            byteBuffer.order(ByteOrder.nativeOrder()).position(anonymousClass2gB.f32322D.offset).limit(anonymousClass2gB.f32322D.offset + anonymousClass2gB.f32322D.size);
            if (anonymousClass2gB.f32330L.length < anonymousClass2gB.f32322D.size) {
                anonymousClass2gB.f32330L = new byte[anonymousClass2gB.f32322D.size];
                anonymousClass2gB.f32329K = new byte[(anonymousClass2gB.f32322D.size / 2)];
            }
            if (mediaFormat == null || mediaFormat.getInteger("channel-count") <= 1) {
                byteBuffer.get(anonymousClass2gB.f32330L, 0, anonymousClass2gB.f32322D.size);
                fileOutputStream.write(anonymousClass2gB.f32330L, 0, anonymousClass2gB.f32322D.size);
            } else {
                ByteBuffer byteBuffer2 = (ByteBuffer) ByteBuffer.wrap(anonymousClass2gB.f32329K).order(ByteOrder.nativeOrder()).position(0);
                int remaining = byteBuffer.remaining() / 2;
                for (int i2 = 0; i2 < remaining / 2; i2++) {
                    int i3 = byteBuffer.getShort() + byteBuffer.getShort();
                    short s = Short.MIN_VALUE;
                    if (i3 <= 32768) {
                        if (i3 >= -32768) {
                            s = (short) i3;
                        }
                    }
                    byteBuffer2.putShort(s);
                }
                fileOutputStream.write(anonymousClass2gB.f32329K, 0, remaining);
            }
        }
        byteBuffer.clear();
        anonymousClass2gB.f32325G.releaseOutputBuffer(i, false);
    }
}
