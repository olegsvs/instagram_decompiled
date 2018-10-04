package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Toast;
import com.facebook.C0164R;
import java.util.Map;

/* renamed from: X.0on */
public final class AnonymousClass0on implements AnonymousClass3bB, OnScrollListener, AnonymousClass0RL, AnonymousClass3b5 {
    /* renamed from: B */
    public Map f10357B;
    /* renamed from: C */
    public final AnonymousClass3bA f10358C;
    /* renamed from: D */
    public String f10359D;
    /* renamed from: E */
    public final AnonymousClass0MI f10360E;
    /* renamed from: F */
    public final AnonymousClass3b6 f10361F;
    /* renamed from: G */
    public final AnonymousClass0Cm f10362G;
    /* renamed from: H */
    private boolean f10363H;
    /* renamed from: I */
    private final Context f10364I;
    /* renamed from: J */
    private boolean f10365J;
    /* renamed from: K */
    private boolean f10366K;
    /* renamed from: L */
    private boolean f10367L;
    /* renamed from: M */
    private long f10368M;

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public AnonymousClass0on(Context context, AnonymousClass3b6 anonymousClass3b6, AnonymousClass0MI anonymousClass0MI, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3bA anonymousClass3bA, String str) {
        this.f10364I = context;
        this.f10361F = anonymousClass3b6;
        this.f10360E = anonymousClass0MI;
        this.f10362G = anonymousClass0Cm;
        this.f10358C = anonymousClass3bA;
        this.f10359D = str;
    }

    /* renamed from: A */
    public final AnonymousClass0on m7708A() {
        if (this.f10365J) {
            return this;
        }
        this.f10365J = true;
        this.f10368M = System.currentTimeMillis();
        if (this.f10360E.m3125Q()) {
            AnonymousClass0vA anonymousClass0vA = new AnonymousClass0vA(this.f10360E.f3388U.m3901K());
            anonymousClass0vA.f11974H = this.f10359D;
            AnonymousClass0vB.m8301C(anonymousClass0vA, this.f10362G);
        }
        if (this.f10360E.m3121M()) {
            return AnonymousClass0on.m7707D(this, true);
        }
        this.f10358C.onStart();
        this.f10361F.RZ(this.f10360E.getId(), this.f10362G, this.f10357B, this.f10359D).yIA(this.f10360E.getId(), this.f10362G, this);
        return this;
    }

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
        if (!this.f10363H) {
            this.f10365J = false;
            this.f10358C.fl(this.f10368M);
        }
    }

    public final void Aq(String str) {
        this.f10365J = false;
        if (!this.f10363H) {
            this.f10358C.fl(this.f10368M);
        }
    }

    /* renamed from: B */
    private String m7705B() {
        String str = "feed_timeline";
        if (!this.f10359D.startsWith(str)) {
            str = "search";
            if (!this.f10359D.startsWith(str)) {
                return this.f10359D;
            }
        }
        return str;
    }

    /* renamed from: C */
    private void m7706C() {
        this.f10366K = true;
        this.f10365J = false;
        this.f10358C.yBA(this.f10367L, this.f10368M);
    }

    /* renamed from: D */
    private static AnonymousClass0on m7707D(AnonymousClass0on anonymousClass0on, boolean z) {
        if (anonymousClass0on.f10360E.m3130V() && anonymousClass0on.f10360E.m3121M()) {
            Toast.makeText(anonymousClass0on.f10364I, C0164R.string.error, 0).show();
            anonymousClass0on.f10360E.m3140f();
            return anonymousClass0on;
        }
        AnonymousClass0Pj J = new AnonymousClass14t(anonymousClass0on.f10360E).m9247J();
        AnonymousClass0MI anonymousClass0MI = anonymousClass0on.f10360E;
        AnonymousClass0Ea.f1980C.markerAnnotate(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), "media_type", Integer.toString(J.m3859I()));
        AnonymousClass0Ea.f1980C.markerAnnotate(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), "json_loaded_from_cache", Boolean.toString(z));
        AnonymousClass0Ea.f1980C.markerAnnotate(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), "reel_item_count", anonymousClass0MI.m3136b());
        AnonymousClass0Ea.f1980C.m1451Y(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), "REEL_JSON_RECEIVED");
        if (!(J.m3894r() || J.oW())) {
            if (!J.pW()) {
                anonymousClass0on.f10366K = false;
                anonymousClass0on.f10367L = true;
                AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.m1908D(J.m3869S(anonymousClass0on.f10364I));
                D.f4635F = false;
                D = D.m4149C(anonymousClass0on);
                D.f4646Q = anonymousClass0on.f10360E.getId();
                D.f4645P = anonymousClass0on.m7705B();
                D.m4148B();
                String K = J.m3861K(anonymousClass0on.f10364I);
                if (J.m3888l() && !TextUtils.isEmpty(K)) {
                    D = AnonymousClass0Gs.f2431j.m1908D(K);
                    D.f4635F = false;
                    D.f4645P = anonymousClass0on.m7705B();
                    D.m4148B();
                }
                if (!anonymousClass0on.f10366K) {
                    anonymousClass0on.f10367L = false;
                    anonymousClass0on.f10358C.onStart();
                }
                return anonymousClass0on;
            }
        }
        anonymousClass0on.m7706C();
        return anonymousClass0on;
    }

    public final void Fq(String str, boolean z) {
        if (!this.f10363H) {
            if (this.f10360E.m3130V()) {
                this.f10365J = false;
                this.f10358C.fl(this.f10368M);
                return;
            }
            AnonymousClass0on.m7707D(this, z);
        }
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        if (!this.f10363H) {
            AnonymousClass0MI anonymousClass0MI = this.f10360E;
            AnonymousClass0Ea.f1980C.markerAnnotate(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), "media_loaded_from_cache", Boolean.toString(this.f10367L));
            AnonymousClass0Ea.f1980C.m1451Y(17301505, AnonymousClass10f.m8723B(anonymousClass0MI), "REEL_MEDIA_RECEIVED");
            m7706C();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3bB TMA(Map map) {
        this.f10357B = map;
        return this;
    }

    public final AnonymousClass0MI WQ() {
        return this.f10360E;
    }

    public final void cancel() {
        xD(AnonymousClass3b9.f42585H);
    }

    public final boolean eX() {
        return this.f10365J;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3bB fHA() {
        return m7708A();
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0cQ.m5858H(this, -509897625, AnonymousClass0cQ.m5859I(this, 224720195));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.m5859I(this, 1992850285);
        xD(AnonymousClass3b9.f42583F);
        AnonymousClass0cQ.m5858H(this, -1714932584, I);
    }

    public final void xD(AnonymousClass3b9 anonymousClass3b9) {
        if (this.f10365J) {
            AnonymousClass10f.m8726E(this.f10360E, anonymousClass3b9.f42588B);
        }
        this.f10363H = true;
        this.f10365J = false;
        this.f10358C.onCancel();
        this.f10361F.mVA(this.f10360E.getId(), this);
    }
}
