package X;

import android.view.View;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.54t */
public final class AnonymousClass54t extends AnonymousClass0t7 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59904B;
    /* renamed from: C */
    public final /* synthetic */ boolean f59905C;
    /* renamed from: D */
    public final /* synthetic */ String f59906D;
    /* renamed from: E */
    public final /* synthetic */ int f59907E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass1Oq f59908F;

    public AnonymousClass54t(boolean z, AnonymousClass1LU anonymousClass1LU, String str, AnonymousClass1Oq anonymousClass1Oq, int i) {
        this.f59905C = z;
        this.f59904B = anonymousClass1LU;
        this.f59906D = str;
        this.f59908F = anonymousClass1Oq;
        this.f59907E = i;
    }

    public final void onClick(View view) {
        if (this.f59905C) {
            this.f59904B.en(this.f59906D.toLowerCase().replace("#", JsonProperty.USE_DEFAULT_NAME), this.f59908F, this.f59907E);
        }
    }
}
