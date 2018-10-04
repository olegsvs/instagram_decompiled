package X;

import android.util.Pair;

/* renamed from: X.47y */
public final class AnonymousClass47y implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Rk f50585B;
    /* renamed from: C */
    public final /* synthetic */ Pair f50586C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass480 f50587D;

    public AnonymousClass47y(AnonymousClass5Rk anonymousClass5Rk, Pair pair, AnonymousClass480 anonymousClass480) {
        this.f50585B = anonymousClass5Rk;
        this.f50586C = pair;
        this.f50587D = anonymousClass480;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r36 = this;
        r3 = r36;
        r0 = r3.f50585B;
        r0 = r0.f63461P;
        if (r0 == 0) goto L_0x000d;
    L_0x0008:
        r0 = -19;
        android.os.Process.setThreadPriority(r0);
    L_0x000d:
        r24 = 0;
        r10 = new X.47z;	 Catch:{ Exception -> 0x0250 }
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r1 = r0.f63455J;	 Catch:{ Exception -> 0x0250 }
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63458M;	 Catch:{ Exception -> 0x0250 }
        r10.<init>(r1, r0);	 Catch:{ Exception -> 0x0250 }
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r1 = r0.f63449D;	 Catch:{ Exception -> 0x0250 }
        r0 = r3.f50586C;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.second;	 Catch:{ Exception -> 0x0250 }
        r0 = (java.lang.Integer) r0;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.intValue();	 Catch:{ Exception -> 0x0250 }
        r0 = java.lang.Math.min(r1, r0);	 Catch:{ Exception -> 0x0250 }
        r13 = new byte[r0];	 Catch:{ Exception -> 0x0250 }
        r0 = r0 * 1000;
        r23 = r0;
        r0 = 88200; // 0x15888 float:1.23595E-40 double:4.35766E-319;
        r23 = r23 / r0;
        r14 = 0;
        r16 = 0;
    L_0x003d:
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63452G;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0250 }
        if (r0 == 0) goto L_0x024f;
    L_0x0047:
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63455J;	 Catch:{ Exception -> 0x0250 }
        r18 = r0.now();	 Catch:{ Exception -> 0x0250 }
        r0 = r3.f50586C;	 Catch:{ Exception -> 0x0250 }
        r1 = r0.first;	 Catch:{ Exception -> 0x0250 }
        r1 = (android.media.AudioRecord) r1;	 Catch:{ Exception -> 0x0250 }
        r0 = r13.length;	 Catch:{ Exception -> 0x0250 }
        r6 = r24;
        r9 = r1.read(r13, r6, r0);	 Catch:{ Exception -> 0x0250 }
        r0 = r3.f50587D;	 Catch:{ Exception -> 0x0250 }
        if (r0 == 0) goto L_0x00bc;
    L_0x0060:
        if (r9 > 0) goto L_0x0065;
    L_0x0062:
        r0 = 0;
        goto L_0x00a7;
    L_0x0065:
        r6 = 0;
        r2 = 0;
        r4 = 0;
    L_0x006a:
        r0 = r9 + -1;
        if (r2 >= r0) goto L_0x0083;
    L_0x006e:
        r0 = r2 + 1;
        r0 = r13[r0];	 Catch:{ Exception -> 0x0250 }
        r1 = r0 << 8;
        r0 = r13[r2];	 Catch:{ Exception -> 0x0250 }
        r0 = r0 & 255;
        r1 = r1 | r0;
        r0 = (short) r1;	 Catch:{ Exception -> 0x0250 }
        r0 = r0 * r0;
        r0 = (double) r0;	 Catch:{ Exception -> 0x0250 }
        java.lang.Double.isNaN(r0);	 Catch:{ Exception -> 0x0250 }
        r4 = r4 + r0;
        r2 = r2 + 2;
        goto L_0x006a;
    L_0x0083:
        r0 = (double) r9;	 Catch:{ Exception -> 0x0250 }
        java.lang.Double.isNaN(r0);	 Catch:{ Exception -> 0x0250 }
        r4 = r4 / r0;
        r4 = java.lang.Math.sqrt(r4);	 Catch:{ Exception -> 0x0250 }
        r0 = 4626322717216342016; // 0x4034000000000000 float:0.0 double:20.0;
        r4 = r4 / r0;
        r4 = java.lang.Math.log10(r4);	 Catch:{ Exception -> 0x0250 }
        r4 = r4 * r0;
        r0 = 4617315517961601024; // 0x4014000000000000 float:0.0 double:5.0;
        r4 = r4 - r0;
        r0 = 4630122629401935872; // 0x4041800000000000 float:0.0 double:35.0;
        r4 = r4 / r0;
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r0 = java.lang.Math.min(r4, r0);	 Catch:{ Exception -> 0x0250 }
        r0 = java.lang.Math.max(r0, r6);	 Catch:{ Exception -> 0x0250 }
    L_0x00a7:
        r2 = java.lang.Double.compare(r0, r14);	 Catch:{ Exception -> 0x0250 }
        if (r2 != 0) goto L_0x00b5;
    L_0x00ad:
        r4 = r16;
        r2 = java.lang.Double.compare(r4, r14);	 Catch:{ Exception -> 0x0250 }
        if (r2 == 0) goto L_0x00ba;
    L_0x00b5:
        r2 = r3.f50587D;	 Catch:{ Exception -> 0x0250 }
        r2.onNewVolumeAvailable(r0);	 Catch:{ Exception -> 0x0250 }
    L_0x00ba:
        r16 = r0;
    L_0x00bc:
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63453H;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0250 }
        if (r0 != 0) goto L_0x00cb;
    L_0x00c6:
        r10.m23360B();	 Catch:{ Exception -> 0x0250 }
        goto L_0x003d;
    L_0x00cb:
        r0 = r3.f50586C;	 Catch:{ Exception -> 0x0250 }
        r1 = r0.first;	 Catch:{ Exception -> 0x0250 }
        r1 = (android.media.AudioRecord) r1;	 Catch:{ Exception -> 0x0250 }
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63454I;	 Catch:{ Exception -> 0x0250 }
        r10.m23359A(r1, r9, r0);	 Catch:{ Exception -> 0x0250 }
        r6 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r0 = r10.f50592F;	 Catch:{ Exception -> 0x0250 }
        r4 = r0.now();	 Catch:{ Exception -> 0x0250 }
        r0 = r10.f50589C;	 Catch:{ Exception -> 0x0250 }
        r4 = r4 - r0;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00ea;
    L_0x00e7:
        r22 = 1;
        goto L_0x00ec;
    L_0x00ea:
        r22 = 0;
    L_0x00ec:
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63457L;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0250 }
        if (r0 != 0) goto L_0x0104;
    L_0x00f6:
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63459N;	 Catch:{ Exception -> 0x0250 }
        if (r0 == 0) goto L_0x0101;
    L_0x00fc:
        if (r22 != 0) goto L_0x0104;
    L_0x00fe:
        if (r9 >= 0) goto L_0x0101;
    L_0x0100:
        goto L_0x0104;
    L_0x0101:
        r21 = 0;
        goto L_0x0106;
    L_0x0104:
        r21 = 1;
    L_0x0106:
        if (r21 == 0) goto L_0x010f;
    L_0x0108:
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63456K;	 Catch:{ Exception -> 0x0250 }
        r36 = r0;
        goto L_0x0111;
    L_0x010f:
        r36 = r13;
    L_0x0111:
        if (r21 == 0) goto L_0x0118;
    L_0x0113:
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63456K;	 Catch:{ Exception -> 0x0250 }
        r9 = r0.length;	 Catch:{ Exception -> 0x0250 }
    L_0x0118:
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63448C;	 Catch:{ Exception -> 0x0250 }
        if (r0 == 0) goto L_0x0212;
    L_0x011e:
        r0 = r0.f63412B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63433O;	 Catch:{ Exception -> 0x0250 }
        r35 = r0;
    L_0x0124:
        r2 = r35;
        r0 = r2.f50602F;	 Catch:{ Exception -> 0x026f }
        r5 = r0.getInputBuffers();	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50602F;	 Catch:{ Exception -> 0x026f }
        r20 = r0.getOutputBuffers();	 Catch:{ Exception -> 0x026f }
        r4 = r2.f50602F;	 Catch:{ Exception -> 0x026f }
        r0 = -1;
        r26 = r4.dequeueInputBuffer(r0);	 Catch:{ Exception -> 0x026f }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r11 = 0;
        if (r26 < 0) goto L_0x015e;
    L_0x013f:
        r4 = r5[r26];	 Catch:{ Exception -> 0x026f }
        r4.clear();	 Catch:{ Exception -> 0x026f }
        r5 = r36;
        r4.put(r5, r11, r9);	 Catch:{ Exception -> 0x026f }
        r4 = r2.f50602F;	 Catch:{ Exception -> 0x026f }
        r27 = 0;
        r5 = r2.f50623a;	 Catch:{ Exception -> 0x026f }
        r29 = r5.now();	 Catch:{ Exception -> 0x026f }
        r29 = r29 * r0;
        r31 = 0;
        r25 = r4;
        r28 = r9;
        r25.queueInputBuffer(r26, r27, r28, r29, r31);	 Catch:{ Exception -> 0x026f }
    L_0x015e:
        r5 = r2.f50602F;	 Catch:{ Exception -> 0x026f }
        r4 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r6 = r5.dequeueOutputBuffer(r4, r0);	 Catch:{ Exception -> 0x026f }
        r4 = -1;
        if (r6 != r4) goto L_0x016b;
    L_0x0169:
        goto L_0x020f;
    L_0x016b:
        r4 = -3;
        if (r6 != r4) goto L_0x0176;
    L_0x016e:
        r0 = r2.f50602F;	 Catch:{ Exception -> 0x026f }
        r20 = r0.getOutputBuffers();	 Catch:{ Exception -> 0x026f }
        goto L_0x02af;
    L_0x0176:
        r4 = -2;
        if (r6 != r4) goto L_0x0183;
    L_0x0179:
        r0 = r2.f50602F;	 Catch:{ Exception -> 0x026f }
        r0 = r0.getOutputFormat();	 Catch:{ Exception -> 0x026f }
        r2.f50606J = r0;	 Catch:{ Exception -> 0x026f }
        goto L_0x02af;
    L_0x0183:
        if (r6 < 0) goto L_0x0297;
    L_0x0185:
        r4 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r4 = r4.offset;	 Catch:{ Exception -> 0x026f }
        if (r4 < 0) goto L_0x0297;
    L_0x018b:
        r4 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r4 = r4.size;	 Catch:{ Exception -> 0x026f }
        if (r4 >= 0) goto L_0x0193;
    L_0x0191:
        goto L_0x0297;
    L_0x0193:
        r12 = r20[r6];	 Catch:{ Exception -> 0x026f }
        if (r12 == 0) goto L_0x027b;
    L_0x0197:
        r4 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r4 = r4.flags;	 Catch:{ Exception -> 0x026f }
        r4 = r4 & 2;
        r7 = 0;
        if (r4 == 0) goto L_0x01a5;
    L_0x01a1:
        r4 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r4.presentationTimeUs = r7;	 Catch:{ Exception -> 0x026f }
    L_0x01a5:
        r4 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r4 = r4.presentationTimeUs;	 Catch:{ Exception -> 0x026f }
        r4 = r4 / r0;
        r0 = r2.f50612P;	 Catch:{ Exception -> 0x026f }
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 != 0) goto L_0x01b2;
    L_0x01b0:
        r2.f50612P = r4;	 Catch:{ Exception -> 0x026f }
    L_0x01b2:
        r0 = r2.f50612P;	 Catch:{ Exception -> 0x026f }
        r28 = r4 - r0;
        r0 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r0 = r0.offset;	 Catch:{ Exception -> 0x026f }
        r7 = r12.position(r0);	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r1 = r0.offset;	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r0 = r0.size;	 Catch:{ Exception -> 0x026f }
        r1 = r1 + r0;
        r7.limit(r1);	 Catch:{ Exception -> 0x026f }
        r2.f50617U = r4;	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50601E;	 Catch:{ Exception -> 0x026f }
        r0 = r0 + r28;
        r7 = (int) r0;	 Catch:{ Exception -> 0x026f }
        if (r7 >= 0) goto L_0x01dd;
    L_0x01d3:
        r0 = (long) r7;	 Catch:{ Exception -> 0x026f }
        r25 = r2;
        r26 = r4;
        r30 = r0;
        X.AnonymousClass483.m23366G(r25, r26, r28, r30);	 Catch:{ Exception -> 0x026f }
    L_0x01dd:
        r5 = r2.f50610N;	 Catch:{ Exception -> 0x026f }
        r27 = r12.position();	 Catch:{ Exception -> 0x026f }
        r28 = r12.remaining();	 Catch:{ Exception -> 0x026f }
        r29 = r7 + 1;
        r0 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r7 = r0.flags;	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r0 = r0.presentationTimeUs;	 Catch:{ Exception -> 0x026f }
        r4 = r2.f50606J;	 Catch:{ Exception -> 0x026f }
        r25 = r5;
        r26 = r12;
        r30 = r29;
        r31 = r7;
        r32 = r0;
        r34 = r4;
        r25.fC(r26, r27, r28, r29, r30, r31, r32, r34);	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50602F;	 Catch:{ Exception -> 0x026f }
        r0.releaseOutputBuffer(r6, r11);	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r0 = r0.flags;	 Catch:{ Exception -> 0x026f }
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x02af;
    L_0x020f:
        r1 = 0;
        r2.f50605I = r1;	 Catch:{ Exception -> 0x026f }
    L_0x0212:
        if (r22 == 0) goto L_0x0230;
    L_0x0214:
        r0 = r3.f50586C;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.first;	 Catch:{ Exception -> 0x0250 }
        r0 = (android.media.AudioRecord) r0;	 Catch:{ Exception -> 0x0250 }
        r0 = X.AnonymousClass5Rk.B(r10, r0);	 Catch:{ Exception -> 0x0250 }
        if (r0 != 0) goto L_0x0230;
    L_0x0220:
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r2 = r0.f63451F;	 Catch:{ Exception -> 0x0250 }
        r1 = new X.47x;	 Catch:{ Exception -> 0x0250 }
        r1.<init>(r3);	 Catch:{ Exception -> 0x0250 }
        r0 = -479755658; // 0xffffffffe3678276 float:-4.2705986E21 double:NaN;
        X.AnonymousClass0GG.B(r2, r1, r0);	 Catch:{ Exception -> 0x0250 }
    L_0x022f:
        return;
    L_0x0230:
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63450E;	 Catch:{ Exception -> 0x0250 }
        if (r0 == 0) goto L_0x003d;
    L_0x0236:
        if (r21 == 0) goto L_0x003d;
    L_0x0238:
        r0 = r3.f50585B;	 Catch:{ Exception -> 0x0250 }
        r0 = r0.f63455J;	 Catch:{ Exception -> 0x0250 }
        r4 = r0.now();	 Catch:{ Exception -> 0x0250 }
        r4 = r4 - r18;
        r0 = r23;
        r1 = (long) r0;	 Catch:{ Exception -> 0x0250 }
        r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x003d;
    L_0x0249:
        r1 = r1 - r4;
        java.lang.Thread.sleep(r1);	 Catch:{ Exception -> 0x0250 }
        goto L_0x003d;
    L_0x024f:
        goto L_0x022f;
    L_0x0250:
        r4 = move-exception;
        r2 = X.AnonymousClass5Rk.f63446U;
        r1 = "AudioThread error";
        r0 = r24;
        r0 = new java.lang.Object[r0];
        X.AnonymousClass0Dc.E(r2, r4, r1, r0);
        r1 = new com.facebook.video.common.livestreaming.LiveStreamingError;
        r0 = "LiveStreamingAudioRecorder";
        r1.<init>(r0, r4);
        r0 = r3.f50585B;
        r0 = r0.f63448C;
        if (r0 == 0) goto L_0x026e;
    L_0x0269:
        r0 = r0.f63412B;
        X.AnonymousClass5Rh.B(r0, r1);
    L_0x026e:
        goto L_0x022f;
    L_0x026f:
        r1 = move-exception;
        r0 = r35;
        r0 = X.AnonymousClass483.m23363D(r0, r1);	 Catch:{ Exception -> 0x0250 }
        if (r0 == 0) goto L_0x027a;
    L_0x0278:
        goto L_0x0124;
    L_0x027a:
        throw r1;	 Catch:{ Exception -> 0x0250 }
    L_0x027b:
        r2 = new java.lang.RuntimeException;	 Catch:{ Exception -> 0x026f }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x026f }
        r1.<init>();	 Catch:{ Exception -> 0x026f }
        r0 = "encoderOutputBuffer ";
        r1.append(r0);	 Catch:{ Exception -> 0x026f }
        r1.append(r6);	 Catch:{ Exception -> 0x026f }
        r0 = " was null";
        r1.append(r0);	 Catch:{ Exception -> 0x026f }
        r0 = r1.toString();	 Catch:{ Exception -> 0x026f }
        r2.<init>(r0);	 Catch:{ Exception -> 0x026f }
        throw r2;	 Catch:{ Exception -> 0x026f }
    L_0x0297:
        if (r6 < 0) goto L_0x029e;
    L_0x0299:
        r0 = r2.f50602F;	 Catch:{ Exception -> 0x026f }
        r0.releaseOutputBuffer(r6, r11);	 Catch:{ Exception -> 0x026f }
    L_0x029e:
        r0 = r2.f50603G;	 Catch:{ Exception -> 0x026f }
        r0 = r0 + 1;
        r2.f50603G = r0;	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        X.AnonymousClass483.m23364E(r2, r11, r6, r0);	 Catch:{ Exception -> 0x026f }
        r1 = r2.f50603G;	 Catch:{ Exception -> 0x026f }
        r0 = 100;
        if (r1 > r0) goto L_0x02b3;
    L_0x02af:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        goto L_0x015e;
    L_0x02b3:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x026f }
        r4.<init>();	 Catch:{ Exception -> 0x026f }
        r0 = "Audio encoder bad parameters ret=";
        r4.append(r0);	 Catch:{ Exception -> 0x026f }
        r4.append(r6);	 Catch:{ Exception -> 0x026f }
        r0 = " offs=";
        r4.append(r0);	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r0 = r0.offset;	 Catch:{ Exception -> 0x026f }
        r4.append(r0);	 Catch:{ Exception -> 0x026f }
        r0 = " sz=";
        r4.append(r0);	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r0 = r0.size;	 Catch:{ Exception -> 0x026f }
        r4.append(r0);	 Catch:{ Exception -> 0x026f }
        r0 = " pts=";
        r4.append(r0);	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50600D;	 Catch:{ Exception -> 0x026f }
        r0 = r0.presentationTimeUs;	 Catch:{ Exception -> 0x026f }
        r4.append(r0);	 Catch:{ Exception -> 0x026f }
        r0 = " cnt=";
        r4.append(r0);	 Catch:{ Exception -> 0x026f }
        r0 = r2.f50603G;	 Catch:{ Exception -> 0x026f }
        r4.append(r0);	 Catch:{ Exception -> 0x026f }
        r1 = r4.toString();	 Catch:{ Exception -> 0x026f }
        r0 = new java.lang.IllegalStateException;	 Catch:{ Exception -> 0x026f }
        r0.<init>(r1);	 Catch:{ Exception -> 0x026f }
        throw r0;	 Catch:{ Exception -> 0x026f }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.47y.run():void");
    }
}
