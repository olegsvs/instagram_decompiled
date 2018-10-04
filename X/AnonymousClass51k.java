package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.51k */
public final class AnonymousClass51k extends AnonymousClass2JV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51m f59360B;

    public AnonymousClass51k(AnonymousClass51m anonymousClass51m, int i) {
        this.f59360B = anonymousClass51m;
        super(i);
    }

    public final void onClick(View view) {
        view = this.f59360B;
        Context context = view.getContext();
        String str = view.f59367G.f1759C;
        AnonymousClass0Su anonymousClass0Su = new AnonymousClass0Su("https://i.instagram.com/legal/privacy/");
        anonymousClass0Su.f5039M = view.getString(C0164R.string.two_fac_enter_phone_number_link_privacy_policy);
        SimpleWebViewActivity.C(context, str, anonymousClass0Su.A());
    }
}
