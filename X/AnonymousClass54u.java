package X;

import android.view.View;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.54u */
public final class AnonymousClass54u extends AnonymousClass0t7 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59909B;
    /* renamed from: C */
    public final /* synthetic */ boolean f59910C;
    /* renamed from: D */
    public final /* synthetic */ String f59911D;
    /* renamed from: E */
    public final /* synthetic */ int f59912E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass1Oq f59913F;

    public AnonymousClass54u(boolean z, AnonymousClass1LU anonymousClass1LU, String str, AnonymousClass1Oq anonymousClass1Oq, int i) {
        this.f59910C = z;
        this.f59909B = anonymousClass1LU;
        this.f59911D = str;
        this.f59913F = anonymousClass1Oq;
        this.f59912E = i;
    }

    public final void onClick(View view) {
        if (this.f59910C) {
            this.f59909B.sr(this.f59911D.toLowerCase().replace("@", JsonProperty.USE_DEFAULT_NAME), this.f59913F, this.f59912E);
        }
    }
}
