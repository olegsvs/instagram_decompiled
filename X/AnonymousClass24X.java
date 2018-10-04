package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.24X */
public final class AnonymousClass24X {
    /* renamed from: G */
    public static final Object f25629G = new Object();
    /* renamed from: H */
    public static AnonymousClass1mU f25630H;
    /* renamed from: B */
    public int f25631B;
    /* renamed from: C */
    public String f25632C;
    /* renamed from: D */
    public String f25633D;
    /* renamed from: E */
    public String f25634E;
    /* renamed from: F */
    public long f25635F;

    public AnonymousClass24X() {
        if (f25630H == null) {
            f25630H = new AnonymousClass1mU(300);
        }
    }

    /* renamed from: A */
    public final void m14339A(AnonymousClass0a9 anonymousClass0a9, int i, int i2, int i3, boolean z, boolean z2) {
        Throwable th;
        synchronized (f25629G) {
            if (i2 != this.f25631B) {
                if (!z2) {
                    f25630H.m13008C(anonymousClass0a9.f6451C, new AnonymousClass0IC(this.f25633D, this.f25632C));
                }
            }
            AnonymousClass1mU anonymousClass1mU = f25630H;
            String str = anonymousClass0a9.f6451C;
            if (str != null) {
                Object remove;
                synchronized (anonymousClass1mU) {
                    try {
                        remove = anonymousClass1mU.f22602B.remove(str);
                        if (remove != null) {
                            anonymousClass1mU.f22603C -= AnonymousClass1mU.m13005B(anonymousClass1mU, str, remove);
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                        }
                        throw th;
                    }
                }
                if (remove != null) {
                    anonymousClass1mU.m13006A(false, str, remove, null);
                }
            } else {
                th = new NullPointerException("key == null");
                throw th;
            }
        }
        AnonymousClass0NN.B("ig_android_resumable_image_download_attempt", null).H("is_start", false).B("full_scans", this.f25631B).B("start_scan", i).B("end_scan", i2).B("downloaded_scan", i3).F("original_uri", anonymousClass0a9.f6451C).F("uid", this.f25632C).F("master_uid", this.f25633D).F("prev_uid", this.f25634E).H("is_success", z).C(TraceFieldType.Duration, System.currentTimeMillis() - this.f25635F).R();
    }
}
