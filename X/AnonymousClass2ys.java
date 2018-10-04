package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.2ys */
public final class AnonymousClass2ys {
    /* renamed from: B */
    public final AnonymousClass2yq f36586B;
    /* renamed from: C */
    public boolean f36587C;
    /* renamed from: D */
    public final AnonymousClass2yr f36588D;
    /* renamed from: E */
    public final WindowManager f36589E;
    /* renamed from: F */
    private long f36590F;
    /* renamed from: G */
    private long f36591G;
    /* renamed from: H */
    private long f36592H;
    /* renamed from: I */
    private long f36593I;
    /* renamed from: J */
    private long f36594J;
    /* renamed from: K */
    private long f36595K;
    /* renamed from: L */
    private long f36596L;
    /* renamed from: M */
    private long f36597M;

    public AnonymousClass2ys() {
        this(null);
    }

    public AnonymousClass2ys(Context context) {
        WindowManager windowManager;
        AnonymousClass2yq anonymousClass2yq = null;
        if (context == null) {
            windowManager = null;
        } else {
            windowManager = (WindowManager) context.getSystemService("window");
        }
        this.f36589E = windowManager;
        if (windowManager != null) {
            if (AnonymousClass2yi.f36552F >= 17) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager == null) {
                    anonymousClass2yq = null;
                } else {
                    anonymousClass2yq = new AnonymousClass2yq(this, displayManager);
                }
            }
            this.f36586B = anonymousClass2yq;
            this.f36588D = AnonymousClass2yr.f36580G;
        } else {
            this.f36586B = null;
            this.f36588D = null;
        }
        this.f36596L = -9223372036854775807L;
        this.f36597M = -9223372036854775807L;
    }

    /* renamed from: A */
    public final long m18123A(long j, long j2) {
        long j3;
        long j4;
        long j5;
        AnonymousClass2yr anonymousClass2yr;
        long j6 = 1000 * j;
        if (this.f36587C) {
            if (j != this.f36592H) {
                this.f36591G++;
                this.f36590F = this.f36593I;
            }
            j3 = this.f36591G;
            if (j3 >= 6) {
                j4 = this.f36590F + ((j6 - this.f36594J) / j3);
                if (!AnonymousClass2ys.m18122C(this, j4, j2)) {
                    j5 = (this.f36595K + j4) - this.f36594J;
                    if (!this.f36587C) {
                        this.f36594J = j6;
                        this.f36595K = j2;
                        this.f36591G = 0;
                        this.f36587C = true;
                    }
                    this.f36592H = j;
                    this.f36593I = j4;
                    anonymousClass2yr = this.f36588D;
                    if (anonymousClass2yr != null) {
                        if (this.f36596L == -9223372036854775807L) {
                            j3 = anonymousClass2yr.f36584E;
                            if (j3 != -9223372036854775807L) {
                                j6 = this.f36596L;
                                j3 += ((j5 - j3) / j6) * j6;
                                if (j5 > j3) {
                                    j4 = j3 - j6;
                                } else {
                                    j4 = j3;
                                    j3 = j6 + j3;
                                }
                                if (j3 - j5 < j5 - j4) {
                                    j3 = j4;
                                }
                                return j3 - this.f36597M;
                            }
                        }
                    }
                    return j5;
                }
            } else if (AnonymousClass2ys.m18122C(this, j6, j2)) {
            }
            this.f36587C = false;
        }
        j5 = j2;
        j4 = j6;
        if (this.f36587C) {
            this.f36594J = j6;
            this.f36595K = j2;
            this.f36591G = 0;
            this.f36587C = true;
        }
        this.f36592H = j;
        this.f36593I = j4;
        anonymousClass2yr = this.f36588D;
        if (anonymousClass2yr != null) {
            if (this.f36596L == -9223372036854775807L) {
                j3 = anonymousClass2yr.f36584E;
                if (j3 != -9223372036854775807L) {
                    j6 = this.f36596L;
                    j3 += ((j5 - j3) / j6) * j6;
                    if (j5 > j3) {
                        j4 = j3;
                        j3 = j6 + j3;
                    } else {
                        j4 = j3 - j6;
                    }
                    if (j3 - j5 < j5 - j4) {
                        j3 = j4;
                    }
                    return j3 - this.f36597M;
                }
            }
        }
        return j5;
    }

    /* renamed from: B */
    public static void m18121B(AnonymousClass2ys anonymousClass2ys) {
        Display defaultDisplay = anonymousClass2ys.f36589E.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            anonymousClass2ys.f36596L = j;
            anonymousClass2ys.f36597M = (j * 80) / 100;
        }
    }

    /* renamed from: C */
    private static boolean m18122C(AnonymousClass2ys anonymousClass2ys, long j, long j2) {
        return Math.abs((j2 - anonymousClass2ys.f36595K) - (j - anonymousClass2ys.f36594J)) > 20000000;
    }
}
