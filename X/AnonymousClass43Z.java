package X;

import android.content.Context;
import android.util.Log;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.43Z */
public final class AnonymousClass43Z extends AnonymousClass3wR {
    /* renamed from: I */
    private static final String f49103I = "HeroAdaptiveTrackSelection";
    /* renamed from: B */
    private AnonymousClass2rP f49104B;
    /* renamed from: C */
    private int f49105C;
    /* renamed from: D */
    private AnonymousClass3sI f49106D;
    /* renamed from: E */
    private AnonymousClass45E f49107E;
    /* renamed from: F */
    private long f49108F;
    /* renamed from: G */
    private long f49109G;
    /* renamed from: H */
    private int f49110H;

    public final void RWA(long j, long j2, long j3) {
    }

    public final Object hR() {
        return null;
    }

    public AnonymousClass43Z(TrackGroup trackGroup, int[] iArr, AnonymousClass3ti anonymousClass3ti, VideoPlayRequest videoPlayRequest, Map map, Context context, AnonymousClass2p3 anonymousClass2p3, AnonymousClass3sS anonymousClass3sS, AnonymousClass1Gy anonymousClass1Gy) {
        super(trackGroup, iArr);
        AnonymousClass2kx anonymousClass2kx = new AnonymousClass2kx();
        synchronized (anonymousClass2kx) {
        }
        VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
        anonymousClass2kx.m17068E(videoPlayRequest2.f15788D);
        anonymousClass2kx.m17069F(videoPlayRequest2.f15797M.f14750O);
        boolean z = videoPlayRequest2.f15797M.f14742G;
        synchronized (anonymousClass2kx) {
            anonymousClass2kx.f33343E = z;
        }
        anonymousClass2kx.m17067D(videoPlayRequest2.f15797M.f14745J);
        float f = videoPlayRequest2.f15786B;
        synchronized (anonymousClass2kx) {
            anonymousClass2kx.f33340B = f;
        }
        this.f49107E = new AnonymousClass45E();
        Map map2 = map;
        this.f49109G = ((long) AnonymousClass1Gk.XC(map2)) * 1000;
        Context context2 = context;
        this.f49106D = new AnonymousClass3sI(null, this.f49107E, anonymousClass3ti, anonymousClass2kx, map2, new AnonymousClass2kY(context2.getApplicationContext()), null, anonymousClass2p3.m17322B(), anonymousClass3sS, anonymousClass1Gy.f16573D, context2);
    }

    /* renamed from: B */
    public final void mo5158B(long j, long j2, long j3, AnonymousClass2wz anonymousClass2wz, AnonymousClass443 anonymousClass443) {
        AnonymousClass2wz anonymousClass2wz2 = anonymousClass2wz;
        if (this.f49104B == null) {
            r15.f49104B = new AnonymousClass2rP();
        }
        Format[] formatArr = QT().f36141B;
        AnonymousClass2rO[] anonymousClass2rOArr = new AnonymousClass2rO[formatArr.length];
        List arrayList = new ArrayList();
        for (int i = 0; i < formatArr.length; i++) {
            anonymousClass2rOArr[i] = AnonymousClass2pt.m17403B(formatArr[i]);
            arrayList.add(AnonymousClass2pt.m17403B(formatArr[i]));
        }
        AnonymousClass446 anonymousClass446 = (AnonymousClass446) anonymousClass2wz2;
        long j4 = j;
        long j5 = j4;
        j = j2;
        long j6 = j;
        Map map = anonymousClass446.f49391C;
        Map hashMap = new HashMap(formatArr.length);
        AnonymousClass443 anonymousClass4432 = anonymousClass443;
        long defaultDuration = getDefaultDuration(formatArr, anonymousClass4432, j5, j6, map, anonymousClass446);
        for (Format format : formatArr) {
            AnonymousClass2x9 anonymousClass2x9;
            Object obj = null;
            if (map == null) {
                anonymousClass2x9 = null;
            } else {
                anonymousClass2x9 = (AnonymousClass2x9) map.get(format.f35568R);
            }
            if (!(anonymousClass2x9 == null || anonymousClass2x9.f36173E == null)) {
                AnonymousClass2x9 anonymousClass2x92 = anonymousClass2x9;
                long B = anonymousClass446.m22526B(anonymousClass4432, anonymousClass2x92, j2 + j4, anonymousClass2x9.m17896C());
                if (anonymousClass2x9.m17901H(B) && anonymousClass2x92.m17902I(j5)) {
                    obj = getSegmentInfo(anonymousClass2x9, B, (long) format.f35553C, defaultDuration);
                }
            }
            if (obj == null) {
                AnonymousClass2rd anonymousClass2rd = new AnonymousClass2rd(AnonymousClass2rd.f35105E, defaultDuration, (long) format.f35553C);
            }
            hashMap.put(format.f35568R, obj);
        }
        r15.f49106D.QH(new ArrayList(), j4, anonymousClass2rOArr, r15.f49104B, j, hashMap, anonymousClass446.f49392D.f47111C, null, -1);
        r15.f49105C = arrayList.indexOf(r15.f49104B.f35072B);
        r15.f49110H = 3;
    }

    public final int TH(long j, List list) {
        long nowMs = getNowMs();
        long j2 = this.f49108F;
        if (j2 == -9223372036854775807L || nowMs - j2 >= 2000) {
            this.f49108F = nowMs;
            int i = 0;
            if (!list.isEmpty()) {
                if (this.f49104B != null) {
                    int size = list.size();
                    if (AnonymousClass2yi.m18097R(((AnonymousClass443) list.get(size - 1)).f47032E - j, 1.0f) >= this.f49109G) {
                        AnonymousClass2rO anonymousClass2rO = this.f49104B.f35072B;
                        while (i < size) {
                            AnonymousClass443 anonymousClass443 = (AnonymousClass443) list.get(i);
                            Format format = anonymousClass443.f47033F;
                            if (AnonymousClass2yi.m18097R(anonymousClass443.f47032E - j, 1.0f) < this.f49109G || format.f35553C >= anonymousClass2rO.f35055D || format.f35567Q == -1 || format.f35567Q >= 720 || format.f35582f == -1 || format.f35582f >= 1280 || format.f35567Q >= anonymousClass2rO.f35067P) {
                                i++;
                            }
                        }
                    }
                    return size;
                }
            }
            return i;
        }
        return list.size();
    }

    public final int ZR() {
        return this.f49105C;
    }

    public long getDefaultDuration(com.google.android.exoplayer2.Format[] r10, X.AnonymousClass443 r11, long r12, long r14, java.util.Map r16, X.AnonymousClass446 r17) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r3 = r10.length;
        r2 = 0;
    L_0x0002:
        if (r2 >= r3) goto L_0x0047;
    L_0x0004:
        r0 = r10[r2];
        r1 = r16;
        if (r16 != 0) goto L_0x000c;
    L_0x000a:
        r6 = 0;
        goto L_0x0014;
    L_0x000c:
        r0 = r0.f35568R;
        r6 = r1.get(r0);
        r6 = (X.AnonymousClass2x9) r6;
    L_0x0014:
        if (r6 == 0) goto L_0x0044;
    L_0x0016:
        r0 = r6.f36173E;
        if (r0 == 0) goto L_0x0044;
    L_0x001a:
        r7 = r14 + r12;
        r9 = r6.m17896C();
        r5 = r11;
        r4 = r17;
        r0 = r4.m22526B(r5, r6, r7, r9);
        r4 = r6.m17901H(r0);
        if (r4 == 0) goto L_0x0044;
    L_0x002d:
        r4 = r6.m17902I(r12);
        if (r4 == 0) goto L_0x0044;
    L_0x0033:
        r4 = -1;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 == 0) goto L_0x0044;
    L_0x0039:
        r4 = r6.m17897D(r0);	 Catch:{ IndexOutOfBoundsException -> 0x0044, IndexOutOfBoundsException -> 0x0044 }
        r0 = 0;	 Catch:{ IndexOutOfBoundsException -> 0x0044, IndexOutOfBoundsException -> 0x0044 }
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ IndexOutOfBoundsException -> 0x0044, IndexOutOfBoundsException -> 0x0044 }
        if (r0 <= 0) goto L_0x0044;	 Catch:{ IndexOutOfBoundsException -> 0x0044, IndexOutOfBoundsException -> 0x0044 }
    L_0x0043:
        return r4;	 Catch:{ IndexOutOfBoundsException -> 0x0044, IndexOutOfBoundsException -> 0x0044 }
    L_0x0044:
        r2 = r2 + 1;
        goto L_0x0002;
    L_0x0047:
        r3 = java.util.concurrent.TimeUnit.MICROSECONDS;
        r1 = 2;
        r0 = java.util.concurrent.TimeUnit.SECONDS;
        r0 = r3.convert(r1, r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.43Z.getDefaultDuration(com.google.android.exoplayer2.Format[], X.443, long, long, java.util.Map, X.446):long");
    }

    public long getNowMs() {
        return AnonymousClass2yP.f36508B.zG();
    }

    public AnonymousClass2rd getSegmentInfo(AnonymousClass2x9 anonymousClass2x9, long j, long j2, long j3) {
        Throwable e;
        long j4;
        long j5 = j3;
        AnonymousClass2x7 anonymousClass2x7 = anonymousClass2x9.f36173E;
        long yL = anonymousClass2x7.yL();
        long B = anonymousClass2x9.m17895B();
        long j6 = AnonymousClass2rd.f35105E;
        AnonymousClass2xI anonymousClass2xI = null;
        if (j >= yL && j < B) {
            try {
                j6 = anonymousClass2x9.m17897D(j);
                try {
                    anonymousClass2xI = anonymousClass2x7.WR(j);
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                }
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                Log.w(f49103I, e.getMessage(), e);
                if (j6 <= 0) {
                    j5 = j6;
                }
                j4 = AnonymousClass2rd.f35105E;
                j4 = anonymousClass2xI.f36212B;
                return new AnonymousClass2rd(j4, j5, j2);
            }
        }
        if (j6 <= 0) {
            j5 = j6;
        }
        j4 = AnonymousClass2rd.f35105E;
        if (anonymousClass2xI != null && anonymousClass2xI.f36212B > 0) {
            j4 = anonymousClass2xI.f36212B;
        }
        return new AnonymousClass2rd(j4, j5, j2);
    }

    public final int iR() {
        return this.f49110H;
    }
}
