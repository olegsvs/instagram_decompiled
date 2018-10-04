package X;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactLeadAdsModule;

/* renamed from: X.5sv */
public final class AnonymousClass5sv implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ FragmentActivity f69609B;
    /* renamed from: C */
    public final /* synthetic */ String f69610C;

    public AnonymousClass5sv(IgReactLeadAdsModule igReactLeadAdsModule, String str, FragmentActivity fragmentActivity) {
        this.f69610C = str;
        this.f69609B = fragmentActivity;
    }

    public final void run() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(this.f69610C));
        AnonymousClass0IW.Q(intent, this.f69609B);
    }
}
