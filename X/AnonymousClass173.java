package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.173 */
public final class AnonymousClass173 {
    /* renamed from: B */
    public boolean f14636B;
    /* renamed from: C */
    public AnonymousClass2Cn f14637C;
    /* renamed from: D */
    public int f14638D;
    /* renamed from: E */
    public boolean f14639E;
    /* renamed from: F */
    public AnonymousClass0ui f14640F;
    /* renamed from: G */
    public final Context f14641G;
    /* renamed from: H */
    public AnonymousClass177 f14642H;
    /* renamed from: I */
    public ViewGroup f14643I;
    /* renamed from: J */
    public float f14644J;
    /* renamed from: K */
    public float f14645K;
    /* renamed from: L */
    public boolean f14646L;
    /* renamed from: M */
    public AnonymousClass3Tp f14647M;
    /* renamed from: N */
    public AnonymousClass178 f14648N;
    /* renamed from: O */
    public final AnonymousClass176 f14649O;

    public AnonymousClass173(Activity activity, AnonymousClass176 anonymousClass176) {
        this(activity, (ViewGroup) activity.getWindow().getDecorView(), anonymousClass176);
    }

    public AnonymousClass173(Context context, ViewGroup viewGroup, AnonymousClass176 anonymousClass176) {
        this.f14642H = AnonymousClass177.CENTER_OF_ANCHOR;
        this.f14648N = AnonymousClass178.f14657H;
        this.f14639E = true;
        this.f14646L = true;
        this.f14636B = true;
        this.f14638D = 5000;
        this.f14641G = context;
        this.f14643I = viewGroup;
        this.f14649O = anonymousClass176;
    }

    /* renamed from: A */
    public final AnonymousClass0iq m9459A() {
        AnonymousClass0LH.m2927E(this.f14637C);
        this.f14637C.MQA(this.f14643I);
        return new AnonymousClass0iq(this);
    }

    /* renamed from: B */
    public final AnonymousClass173 m9460B(int i, int i2, boolean z, View view) {
        this.f14637C = new AnonymousClass2Zg(i, i2, z, view);
        return this;
    }

    /* renamed from: C */
    public final AnonymousClass173 m9461C(View view) {
        this.f14637C = new AnonymousClass2Zh(view);
        return this;
    }
}
