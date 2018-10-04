package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.5R4 */
public final class AnonymousClass5R4 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ Activity f63365B;
    /* renamed from: C */
    public final /* synthetic */ View f63366C;
    /* renamed from: D */
    public final /* synthetic */ String f63367D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0HV f63368E;

    public AnonymousClass5R4(View view, String str, AnonymousClass0HV anonymousClass0HV, Activity activity) {
        this.f63366C = view;
        this.f63367D = str;
        this.f63368E = anonymousClass0HV;
        this.f63365B = activity;
    }

    public final void run() {
        if (AnonymousClass0mE.H(this.f63366C)) {
            AnonymousClass176 anonymousClass174 = new AnonymousClass174(this.f63367D);
            AnonymousClass0ui anonymousClass5R3 = new AnonymousClass5R3(this);
            AnonymousClass173 C = new AnonymousClass173(this.f63365B, anonymousClass174).C(this.f63366C);
            C.f14642H = AnonymousClass177.BELOW_ANCHOR;
            C.f14648N = AnonymousClass178.f14655F;
            C.f14640F = anonymousClass5R3;
            C.A().C();
        }
    }
}
