package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.browser.lite.DefaultBrowserLiteChrome;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1q0 */
public final class AnonymousClass1q0 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ DefaultBrowserLiteChrome f23234B;
    /* renamed from: C */
    public final /* synthetic */ String f23235C;

    public AnonymousClass1q0(DefaultBrowserLiteChrome defaultBrowserLiteChrome, String str) {
        this.f23234B = defaultBrowserLiteChrome;
        this.f23235C = str;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1557697496);
        if (this.f23234B.f30115V == null) {
            AnonymousClass0cQ.L(this, 126777855, M);
            return;
        }
        Map hashMap = new HashMap();
        hashMap.put("action", this.f23235C);
        hashMap.put(IgReactNavigatorModule.URL, this.f23234B.f30115V.getUrl());
        this.f23234B.f30098E.m13402D(hashMap, this.f23234B.f30114U);
        AnonymousClass0cQ.L(this, 2008014723, M);
    }
}
