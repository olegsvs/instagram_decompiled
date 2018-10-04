package X;

import android.app.ActivityManager.MemoryInfo;
import android.os.Build.VERSION;
import com.facebook.quicklog.PerformanceLoggingEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1KY */
public final class AnonymousClass1KY {
    /* renamed from: B */
    private final ArrayList f17187B = AnonymousClass1KZ.m10779E(Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(1));
    /* renamed from: C */
    private final AtomicReference f17188C = new AtomicReference();
    /* renamed from: D */
    private final ArrayList f17189D = AnonymousClass1KZ.m10779E(Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2));
    /* renamed from: E */
    private final AtomicReference f17190E = new AtomicReference();
    /* renamed from: F */
    private final ArrayList f17191F = AnonymousClass1KZ.m10779E(Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2));
    /* renamed from: G */
    private final AtomicReference f17192G = new AtomicReference();

    /* renamed from: A */
    public final void m10773A(PerformanceLoggingEvent performanceLoggingEvent) {
        AnonymousClass0KD anonymousClass0KD = performanceLoggingEvent.f3022S;
        if (anonymousClass0KD != null) {
            if (anonymousClass0KD.f2975D) {
                long j;
                List list = (ArrayList) this.f17188C.getAndSet(null);
                if (list == null) {
                    list = AnonymousClass1KZ.m10779E("start_pri", "0", "stop_pri", "0", "ps_cpu_ms", "0", "th_cpu_ms", "0", "low_power_state", "false");
                }
                list.set(1, String.valueOf(anonymousClass0KD.f2981J));
                list.set(3, String.valueOf(anonymousClass0KD.f2982K));
                list.set(5, String.valueOf(anonymousClass0KD.f2983L));
                if (anonymousClass0KD.m2797B()) {
                    j = anonymousClass0KD.f2986O;
                } else {
                    j = 0;
                }
                list.set(7, String.valueOf(j));
                list.set(9, anonymousClass0KD.f2977F);
                performanceLoggingEvent.m2806A(list, this.f17187B);
                this.f17188C.compareAndSet(null, list);
            }
        }
    }

    /* renamed from: B */
    public final void m10774B(PerformanceLoggingEvent performanceLoggingEvent) {
        PerformanceLoggingEvent performanceLoggingEvent2 = performanceLoggingEvent;
        AnonymousClass0KD anonymousClass0KD = performanceLoggingEvent2.f3022S;
        if (anonymousClass0KD != null) {
            if (anonymousClass0KD.f2975D) {
                long j;
                List list = (ArrayList) this.f17190E.getAndSet(null);
                if (list == null) {
                    list = AnonymousClass1KZ.m10779E("ps_flt", "0", "th_flt", "0", "class_load_attempts", "0", "dex_queries", "0", "allocstall", "0", "pages_in", "0", "pages_out", "0", "class_loads_failed", "0", "locator_assists", "0", "wrong_dfa_guesses", "0", "ps_min_flt", "0");
                }
                list.set(1, String.valueOf(anonymousClass0KD.f2984M));
                if (anonymousClass0KD.m2797B()) {
                    j = anonymousClass0KD.f2987P;
                } else {
                    j = 0;
                }
                list.set(3, String.valueOf(j));
                list.set(5, String.valueOf(anonymousClass0KD.f2974C.f2997B));
                list.set(7, String.valueOf(anonymousClass0KD.f2974C.f2999D));
                list.set(15, String.valueOf(anonymousClass0KD.f2974C.f2998C));
                list.set(17, String.valueOf(anonymousClass0KD.f2974C.f3001F));
                list.set(19, String.valueOf(anonymousClass0KD.f2974C.f3000E));
                list.set(9, String.valueOf(anonymousClass0KD.f2973B));
                list.set(11, String.valueOf(anonymousClass0KD.f2979H));
                list.set(13, String.valueOf(anonymousClass0KD.f2980I));
                list.set(21, String.valueOf(anonymousClass0KD.f2985N));
                performanceLoggingEvent2.m2806A(list, this.f17189D);
                this.f17190E.compareAndSet(null, list);
            }
        }
    }

    /* renamed from: C */
    public final void m10775C(PerformanceLoggingEvent performanceLoggingEvent) {
        AnonymousClass0KD anonymousClass0KD = performanceLoggingEvent.f3022S;
        if (anonymousClass0KD != null) {
            if (anonymousClass0KD.f2975D) {
                MemoryInfo memoryInfo = anonymousClass0KD.f2978G;
                if (memoryInfo != null) {
                    List list = (ArrayList) this.f17192G.getAndSet(null);
                    if (list == null) {
                        list = AnonymousClass1KZ.m10779E("avail_mem", "0", "low_mem", "0", "total_mem", "0");
                    }
                    list.set(1, String.valueOf(memoryInfo.availMem));
                    list.set(3, String.valueOf(memoryInfo.threshold));
                    list.set(5, String.valueOf(VERSION.SDK_INT >= 16 ? memoryInfo.totalMem : -1));
                    performanceLoggingEvent.m2806A(list, this.f17191F);
                    this.f17192G.compareAndSet(null, list);
                }
            }
        }
    }
}
