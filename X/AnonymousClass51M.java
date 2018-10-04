package X;

import android.content.Context;
import android.view.View;
import com.facebook.C0164R;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.51M */
public final class AnonymousClass51M extends AnonymousClass2JV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51U f59316B;

    public AnonymousClass51M(AnonymousClass51U anonymousClass51U, int i) {
        this.f59316B = anonymousClass51U;
        super(i);
    }

    public final void onClick(View view) {
        view = this.f59316B;
        Context context = view.getContext();
        String D = AnonymousClass0FL.D(view.f59331G);
        AnonymousClass0Su anonymousClass0Su = new AnonymousClass0Su("https://help.instagram.com/566810106808145?ref=igapp");
        anonymousClass0Su.f5039M = view.getString(C0164R.string.two_fac_learn_more);
        SimpleWebViewActivity.C(context, D, anonymousClass0Su.A());
    }
}
