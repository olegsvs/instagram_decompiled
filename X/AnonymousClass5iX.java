package X;

import android.text.TextUtils;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: X.5iX */
public final class AnonymousClass5iX implements AnonymousClass1yz {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5iY f68394B;

    public AnonymousClass5iX(AnonymousClass5iY anonymousClass5iY) {
        this.f68394B = anonymousClass5iY;
    }

    /* renamed from: A */
    public final void m28327A(LocationSettingsResult locationSettingsResult) {
        AnonymousClass4ru anonymousClass4ru;
        String str;
        int i = locationSettingsResult.HS().f30578B;
        if (i == 0) {
            this.f68394B.f68396C.D();
            anonymousClass4ru = AnonymousClass4ru.DIALOG_NOT_NEEDED;
        } else if (i != 6) {
            this.f68394B.f68396C.D();
            anonymousClass4ru = AnonymousClass4ru.DIALOG_NOT_POSSIBLE;
        } else {
            try {
                this.f68394B.f68396C.D();
                this.f68394B.f68400G = true;
                locationSettingsResult.HS().C(this.f68394B.f68395B, 5005);
                return;
            } catch (Throwable e) {
                AnonymousClass0Dc.I("GooglePlayLocationSettingsControllerImpl", e, "Error starting google play services location dialog", new Object[0]);
                anonymousClass4ru = AnonymousClass4ru.UNKNOWN_FAILURE;
            }
        }
        this.f68394B.f68398E.m27072b(anonymousClass4ru);
        AnonymousClass47Y anonymousClass47Y = this.f68394B.f68397D;
        if (TextUtils.isEmpty(this.f68394B.m28328A().f50499D)) {
            str = "surface_location_upsell_fragment";
        } else {
            str = this.f68394B.m28328A().f50499D;
        }
        anonymousClass47Y.A(str, "mechanism_location_sharing_button", anonymousClass4ru.toString());
        this.f68394B.f68399F.A();
    }

    public final /* bridge */ /* synthetic */ void bx(AnonymousClass1yy anonymousClass1yy) {
        m28327A((LocationSettingsResult) anonymousClass1yy);
    }
}
