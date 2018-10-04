package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.0el */
public abstract class AnonymousClass0el {
    /* renamed from: B */
    public Context f7833B;
    /* renamed from: C */
    public Executor f7834C;
    /* renamed from: D */
    public final Map f7835D;
    /* renamed from: E */
    public final AnonymousClass0Cm f7836E;
    /* renamed from: F */
    private final Handler f7837F;
    /* renamed from: G */
    private final Runnable f7838G;

    /* renamed from: B */
    public abstract void mo1522B();

    /* renamed from: H */
    public abstract String mo1523H();

    /* renamed from: M */
    public abstract void mo1524M();

    /* renamed from: O */
    public abstract void mo1525O(AnonymousClass0dv anonymousClass0dv);

    /* renamed from: P */
    public abstract void mo1526P();

    public AnonymousClass0el(AnonymousClass0Cm anonymousClass0Cm) {
        this(anonymousClass0Cm, new LinkedHashMap());
    }

    public AnonymousClass0el(AnonymousClass0Cm anonymousClass0Cm, Map map) {
        this.f7837F = new Handler(Looper.getMainLooper());
        this.f7838G = new AnonymousClass0ep(this);
        this.f7836E = anonymousClass0Cm;
        this.f7835D = Collections.synchronizedMap(map);
    }

    /* renamed from: A */
    public final boolean m6410A(String str) {
        return this.f7835D.containsKey(str);
    }

    /* renamed from: C */
    public final Object m6412C(String str) {
        return this.f7835D.get(str);
    }

    /* renamed from: D */
    public final int m6413D() {
        return this.f7835D.size();
    }

    /* renamed from: E */
    public final ArrayList m6414E() {
        ArrayList arrayList;
        synchronized (this.f7835D) {
            arrayList = new ArrayList(this.f7835D.values());
        }
        return arrayList;
    }

    /* renamed from: E */
    private void m6409E() {
        if (((Boolean) AnonymousClass0CC.wc.m846H(this.f7836E)).booleanValue()) {
            AnonymousClass0OR.m3627G(this.f7837F, this.f7838G, -1689310914);
            AnonymousClass0OR.m3626F(this.f7837F, this.f7838G, 2000, 1354438288);
        }
    }

    /* renamed from: F */
    public final HashMap m6415F() {
        HashMap hashMap;
        synchronized (this.f7835D) {
            hashMap = new HashMap(this.f7835D);
        }
        return hashMap;
    }

    /* renamed from: G */
    public final ArrayList m6416G() {
        ArrayList arrayList;
        synchronized (this.f7835D) {
            arrayList = new ArrayList(this.f7835D.keySet());
        }
        return arrayList;
    }

    /* renamed from: I */
    public final synchronized void m6418I(Context context, Executor executor) {
        if (this.f7833B == null) {
            mo1523H();
            this.f7833B = context.getApplicationContext();
            this.f7834C = executor;
            AnonymousClass0GG.m1763B(this.f7834C, new AnonymousClass0eq(this), 1951562410);
            mo1523H();
        }
    }

    /* renamed from: J */
    public final synchronized void m6419J() {
        if (this.f7833B == null) {
            mo1523H();
            this.f7833B = AnonymousClass0EV.f1977B;
            this.f7834C = AnonymousClass0dL.m6024B(this.f7836E).f7415B;
            mo1522B();
            mo1523H();
        }
    }

    /* renamed from: K */
    public final void m6420K(String str, Object obj) {
        this.f7835D.put(str, obj);
        m6409E();
    }

    /* renamed from: L */
    public final void m6421L(Map map) {
        this.f7835D.putAll(map);
    }

    /* renamed from: N */
    public final void m6423N(String str) {
        if (this.f7835D.remove(str) != null) {
            m6409E();
        }
    }
}
