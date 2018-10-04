package X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.11K */
public final class AnonymousClass11K implements AnonymousClass11L {
    /* renamed from: B */
    public final int f13392B;
    /* renamed from: C */
    public final AnonymousClass0Fz f13393C;
    /* renamed from: D */
    public final AnonymousClass0GA f13394D;
    /* renamed from: E */
    private final Context f13395E;

    public final void Jq(AnonymousClass0dN anonymousClass0dN) {
    }

    public AnonymousClass11K(Context context, AnonymousClass0Fz anonymousClass0Fz, int i, AnonymousClass0GA anonymousClass0GA) {
        this.f13395E = context.getApplicationContext();
        this.f13393C = anonymousClass0Fz;
        this.f13392B = i;
        this.f13394D = anonymousClass0GA;
    }

    public final /* bridge */ /* synthetic */ void Bq(AnonymousClass0dN anonymousClass0dN, Object obj) {
        Boolean bool = (Boolean) obj;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f13394D.getName());
        stringBuilder.append(" onFinish");
        AnonymousClass0CN.m901B(stringBuilder.toString(), 490232808);
        try {
            this.f13394D.onFinish();
            this.f13393C.mo325A(this.f13392B);
        } finally {
            AnonymousClass0CN.m902C(141604356);
        }
    }

    public final AnonymousClass0dN rh(int i, Bundle bundle) {
        this.f13394D.onStart();
        return new AnonymousClass11M(this, this.f13395E);
    }
}
