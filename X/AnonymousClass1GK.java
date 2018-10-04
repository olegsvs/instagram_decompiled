package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import com.facebook.wifiscan.WifiScanResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1GK */
public final class AnonymousClass1GK extends AnonymousClass2kT {
    /* renamed from: B */
    public final ScheduledExecutorService f16255B;
    /* renamed from: C */
    public AnonymousClass1jP f16256C;
    /* renamed from: D */
    public ScheduledFuture f16257D;
    /* renamed from: E */
    private BroadcastReceiver f16258E;
    /* renamed from: F */
    private final Context f16259F;
    /* renamed from: G */
    private boolean f16260G;
    /* renamed from: H */
    private final AnonymousClass1GL f16261H;
    /* renamed from: I */
    private final AnonymousClass0C9 f16262I;
    /* renamed from: J */
    private final AnonymousClass0Jy f16263J;
    /* renamed from: K */
    private AnonymousClass1GG f16264K;
    /* renamed from: L */
    private final AnonymousClass1GM f16265L;

    public AnonymousClass1GK(AnonymousClass1GG anonymousClass1GG, Context context, AnonymousClass1GL anonymousClass1GL, AnonymousClass0C9 anonymousClass0C9, AnonymousClass0Jy anonymousClass0Jy, AnonymousClass1GM anonymousClass1GM, ScheduledExecutorService scheduledExecutorService) {
        this.f16264K = anonymousClass1GG;
        this.f16259F = context;
        this.f16261H = anonymousClass1GL;
        this.f16263J = anonymousClass0Jy;
        this.f16265L = anonymousClass1GM;
        this.f16262I = anonymousClass0C9;
        this.f16255B = scheduledExecutorService;
    }

    /* renamed from: B */
    public static void m10460B(AnonymousClass1GK anonymousClass1GK) {
        anonymousClass1GK.f16260G = false;
        anonymousClass1GK.f16256C = null;
        BroadcastReceiver broadcastReceiver = anonymousClass1GK.f16258E;
        if (broadcastReceiver != null) {
            anonymousClass1GK.f16259F.unregisterReceiver(broadcastReceiver);
            anonymousClass1GK.f16258E = null;
        }
        anonymousClass1GK.m10464F();
    }

    /* renamed from: C */
    public static void m10461C(AnonymousClass1GK anonymousClass1GK, AnonymousClass1jP anonymousClass1jP) {
        AnonymousClass1Cy.m9952G(anonymousClass1jP);
        AnonymousClass1Cy.m9957L(anonymousClass1GK.f16260G ^ true, "already running");
        AnonymousClass1Cy.m9957L(anonymousClass1GK.isDone() ^ true, "already done");
        anonymousClass1GK.f16260G = true;
        anonymousClass1GK.f16256C = anonymousClass1jP;
        if (anonymousClass1GK.f16261H.m10471C()) {
            if ((VERSION.SDK_INT >= 17 ? 1 : null) != null) {
                AnonymousClass1GL anonymousClass1GL = anonymousClass1GK.f16261H;
                Object obj = (anonymousClass1GL.m10469A() && AnonymousClass1GL.m10467C(anonymousClass1GL, "android.permission.CHANGE_WIFI_STATE")) ? 1 : null;
                if (obj != null) {
                    if (!anonymousClass1GK.f16261H.m10472E()) {
                        if (!anonymousClass1GK.f16261H.m10470B()) {
                            throw new AnonymousClass1jk(AnonymousClass1jz.USER_DISABLED);
                        }
                    }
                    if (!anonymousClass1GK.f16256C.f21944C) {
                        List C = anonymousClass1GK.f16264K.m10447C(false);
                        if (anonymousClass1GK.f16256C.f21945D > 0) {
                            anonymousClass1GK.f16265L.m10474B(C, anonymousClass1GK.f16256C.f21945D);
                        } else {
                            AnonymousClass1GM anonymousClass1GM = anonymousClass1GK.f16265L;
                            anonymousClass1GM.m10474B(C, anonymousClass1GM.f16267B);
                        }
                        List C2 = AnonymousClass1hB.m12560C(C, anonymousClass1GK.f16256C.f21943B, anonymousClass1GK.f16262I.now());
                        if (!(C2 == null || C2.isEmpty())) {
                            if (anonymousClass1GK.f16256C.f21946E) {
                                AnonymousClass1GK.m10465G(anonymousClass1GK, WifiScanResult.m12792B(C, anonymousClass1GK.f16263J, anonymousClass1GK.f16262I));
                                return;
                            } else {
                                AnonymousClass1GK.m10465G(anonymousClass1GK, WifiScanResult.m12792B(C2, anonymousClass1GK.f16263J, anonymousClass1GK.f16262I));
                                return;
                            }
                        }
                    }
                    if (anonymousClass1GK.f16256C.f21947F != 0) {
                        boolean startScan;
                        anonymousClass1GK.f16257D = anonymousClass1GK.f16255B.schedule(new AnonymousClass1hD(anonymousClass1GK), anonymousClass1GK.f16256C.f21947F, TimeUnit.MILLISECONDS);
                        anonymousClass1GK.f16258E = new AnonymousClass1jO(anonymousClass1GK);
                        anonymousClass1GK.f16259F.registerReceiver(anonymousClass1GK.f16258E, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
                        AnonymousClass1GG anonymousClass1GG = anonymousClass1GK.f16264K;
                        if (anonymousClass1GG.m10445A()) {
                            startScan = ((WifiManager) anonymousClass1GG.f16231B.getSystemService("wifi")).startScan();
                            if (startScan) {
                                AnonymousClass1i7 anonymousClass1i7 = anonymousClass1GG.f16234E;
                                if (anonymousClass1i7 != null) {
                                    anonymousClass1i7.recordWifiScan();
                                }
                            }
                        } else {
                            startScan = false;
                        }
                        if (!startScan) {
                            throw new AnonymousClass1jk(AnonymousClass1jz.UNKNOWN_ERROR);
                        }
                        return;
                    }
                    throw new AnonymousClass1jk(AnonymousClass1jz.TIMEOUT);
                }
                throw new AnonymousClass1jk(AnonymousClass1jz.PERMISSION_DENIED);
            }
        }
        throw new AnonymousClass1jk(AnonymousClass1jz.NOT_SUPPORTED);
    }

    /* renamed from: D */
    public static synchronized void m10462D(AnonymousClass1GK anonymousClass1GK) {
        synchronized (anonymousClass1GK) {
            if (anonymousClass1GK.f16260G) {
                List C = anonymousClass1GK.f16264K.m10447C(false);
                if (anonymousClass1GK.f16256C.f21945D > 0) {
                    anonymousClass1GK.f16265L.m10474B(C, anonymousClass1GK.f16256C.f21945D);
                } else {
                    AnonymousClass1GM anonymousClass1GM = anonymousClass1GK.f16265L;
                    anonymousClass1GM.m10474B(C, anonymousClass1GM.f16267B);
                }
                List C2 = AnonymousClass1hB.m12560C(C, anonymousClass1GK.f16256C.f21943B, anonymousClass1GK.f16262I.now());
                if (anonymousClass1GK.f16256C.f21946E) {
                    if (C == null) {
                        C = new ArrayList();
                    }
                    AnonymousClass1GK.m10465G(anonymousClass1GK, WifiScanResult.m12792B(C, anonymousClass1GK.f16263J, anonymousClass1GK.f16262I));
                } else {
                    if (C2 == null) {
                        C2 = new ArrayList();
                    }
                    AnonymousClass1GK.m10465G(anonymousClass1GK, WifiScanResult.m12792B(C2, anonymousClass1GK.f16263J, anonymousClass1GK.f16262I));
                }
            }
        }
    }

    /* renamed from: E */
    public static synchronized void m10463E(AnonymousClass1GK anonymousClass1GK) {
        synchronized (anonymousClass1GK) {
            if (anonymousClass1GK.f16260G) {
                Throwable anonymousClass1jk = new AnonymousClass1jk(AnonymousClass1jz.TIMEOUT);
                AnonymousClass1GK.m10460B(anonymousClass1GK);
                anonymousClass1GK.B(anonymousClass1jk);
            }
        }
    }

    /* renamed from: F */
    private void m10464F() {
        ScheduledFuture scheduledFuture = this.f16257D;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f16257D = null;
        }
    }

    /* renamed from: G */
    private static void m10465G(AnonymousClass1GK anonymousClass1GK, List list) {
        AnonymousClass1GK.m10460B(anonymousClass1GK);
        anonymousClass1GK.A(list);
    }
}
