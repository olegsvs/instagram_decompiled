package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.4ED */
public final class AnonymousClass4ED extends AnonymousClass2JV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Re f51747B;

    public AnonymousClass4ED(AnonymousClass1Re anonymousClass1Re, int i) {
        this.f51747B = anonymousClass1Re;
        super(i);
    }

    public final void onClick(View view) {
        String str;
        AnonymousClass0IL anonymousClass0IL = this.f51747B;
        AnonymousClass3Po.m19559C().m19564D(AnonymousClass3Pm.CONSENT_ACTION, AnonymousClass3Pq.LINK_CLICK, anonymousClass0IL, AnonymousClass3Pp.UNDERAGE, anonymousClass0IL.f18614B);
        AnonymousClass0Cm anonymousClass0Cm = anonymousClass0IL.f18615C;
        if (anonymousClass0Cm != null) {
            str = anonymousClass0Cm.f1759C;
        } else {
            str = null;
        }
        Context context = anonymousClass0IL.getContext();
        AnonymousClass0Su anonymousClass0Su = new AnonymousClass0Su(anonymousClass0IL.f18614B);
        anonymousClass0Su.f5039M = anonymousClass0IL.getString(C0164R.string.gdpr_download_your_data);
        anonymousClass0Su.f5031E = true;
        SimpleWebViewActivity.C(context, str, anonymousClass0Su.A());
    }
}
