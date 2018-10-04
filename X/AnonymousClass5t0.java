package X;

import android.widget.Toast;
import com.facebook.C0164R;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.creation.fragment.FollowersShareFragment;
import com.instagram.react.modules.product.IgReactShoppingCatalogSettingsModule;

/* renamed from: X.5t0 */
public final class AnonymousClass5t0 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ IgReactShoppingCatalogSettingsModule f69615B;
    /* renamed from: C */
    public final /* synthetic */ String f69616C;
    /* renamed from: D */
    public final /* synthetic */ Callback f69617D;
    /* renamed from: E */
    public final /* synthetic */ Callback f69618E;
    /* renamed from: F */
    public final /* synthetic */ String f69619F;
    /* renamed from: G */
    public final /* synthetic */ AnonymousClass0Cm f69620G;

    public AnonymousClass5t0(IgReactShoppingCatalogSettingsModule igReactShoppingCatalogSettingsModule, AnonymousClass0Cm anonymousClass0Cm, String str, String str2, Callback callback, Callback callback2) {
        this.f69615B = igReactShoppingCatalogSettingsModule;
        this.f69620G = anonymousClass0Cm;
        this.f69619F = str;
        this.f69616C = str2;
        this.f69618E = callback;
        this.f69617D = callback2;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -644618067);
        super.onFail(anonymousClass0Q6);
        Toast.makeText(this.f69615B.getReactApplicationContext(), C0164R.string.unknown_error_occured, 0).show();
        this.f69617D.invoke(new Object[0]);
        AnonymousClass0cQ.H(this, -1879487606, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1359153104);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, 308315416);
        super.onSuccess(anonymousClass0Pn);
        AnonymousClass2FT.D(this.f69620G, this.f69619F);
        new WritableNativeMap().putString("catalogId", this.f69619F);
        String str = this.f69616C;
        if (str != null && str.equals("creation_flow")) {
            FollowersShareFragment.f64917k = true;
        }
        if (!AnonymousClass1fg.I(this.f69620G)) {
            this.f69620G.B().GC = AnonymousClass2HP.ONBOARDED;
        }
        this.f69618E.invoke(new Object[]{r6});
        AnonymousClass0cQ.H(this, -1446957533, I2);
        AnonymousClass0cQ.H(this, -150048024, I);
    }
}
