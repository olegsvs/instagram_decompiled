package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0AC */
public final class AnonymousClass0AC implements AnonymousClass1ih {
    /* renamed from: P */
    public static final AnonymousClass05w f1162P = AnonymousClass05w.m349B("MQTT_Analytics");
    /* renamed from: B */
    public final Runnable f1163B;
    /* renamed from: C */
    public final AtomicBoolean f1164C = new AtomicBoolean(false);
    /* renamed from: D */
    public final String f1165D;
    /* renamed from: E */
    public final String f1166E;
    /* renamed from: F */
    public final String f1167F;
    /* renamed from: G */
    public final AnonymousClass1iZ f1168G;
    /* renamed from: H */
    public final Handler f1169H;
    /* renamed from: I */
    public final Queue f1170I = new ConcurrentLinkedQueue();
    /* renamed from: J */
    public AnonymousClass05j f1171J;
    /* renamed from: K */
    public final SharedPreferences f1172K;
    /* renamed from: L */
    public final AnonymousClass05l f1173L;
    /* renamed from: M */
    private final AnonymousClass0BJ f1174M;
    /* renamed from: N */
    private final String f1175N;
    /* renamed from: O */
    private final AnonymousClass05k f1176O;

    public AnonymousClass0AC(Context context, String str, AnonymousClass1iZ anonymousClass1iZ, AnonymousClass0BJ anonymousClass0BJ, SharedPreferences sharedPreferences, AnonymousClass1iZ anonymousClass1iZ2, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f1175N = str;
        this.f1172K = sharedPreferences;
        this.f1168G = anonymousClass1iZ2;
        this.f1167F = str4;
        this.f1166E = str3;
        this.f1165D = str7;
        this.f1169H = new AnonymousClass05m(this, context.getMainLooper());
        this.f1163B = new AnonymousClass05n(this);
        this.f1176O = new AnonymousClass05k(context.getApplicationContext(), this.f1175N);
        this.f1173L = new AnonymousClass05l(context.getApplicationContext(), this.f1175N, anonymousClass1iZ, str2, str5, str6);
        this.f1174M = anonymousClass0BJ;
        if (this.f1171J != null) {
            AnonymousClass0AC.m675B(this);
        }
        AnonymousClass05j anonymousClass05j = new AnonymousClass05j();
        anonymousClass05j.f180C = this.f1166E;
        anonymousClass05j.f181D = this.f1167F;
        String string = this.f1172K.getString("fb_uid", JsonProperty.USE_DEFAULT_NAME);
        if (AnonymousClass1Cn.m9924D(string)) {
            string = "0";
        }
        anonymousClass05j.f184G = string;
        anonymousClass05j.f179B = this.f1165D;
        anonymousClass05j.f183F = this.f1168G;
        this.f1171J = anonymousClass05j;
    }

    /* renamed from: B */
    public static void m675B(AnonymousClass0AC anonymousClass0AC) {
        if (!anonymousClass0AC.f1171J.f182E.isEmpty()) {
            anonymousClass0AC.f1176O.m346A(anonymousClass0AC.f1171J);
            AnonymousClass05j anonymousClass05j = anonymousClass0AC.f1171J;
            anonymousClass05j.f182E.clear();
            anonymousClass05j.f185H++;
        }
    }

    /* renamed from: C */
    public static void m676C(AnonymousClass0AC anonymousClass0AC, Runnable runnable) {
        anonymousClass0AC.f1170I.add(runnable);
        if (anonymousClass0AC.f1164C.compareAndSet(false, true)) {
            AnonymousClass0GG.m1763B(f1162P, anonymousClass0AC.f1163B, -1778251650);
        }
    }

    public final void reportEvent(AnonymousClass05f anonymousClass05f) {
        if (!AnonymousClass069.m374B()) {
            AnonymousClass0BJ anonymousClass0BJ = this.f1174M;
            boolean z = false;
            if (anonymousClass0BJ.f1359C || anonymousClass0BJ.f1358B.getBoolean(AnonymousClass1E2.ANALYTIC_IS_EMPLOYEE.m10142B(), false)) {
                z = true;
            }
            if (z) {
                AnonymousClass0AC.m676C(this, new AnonymousClass05o(this, anonymousClass05f));
            }
        }
    }
}
