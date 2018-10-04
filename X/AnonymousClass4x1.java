package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igtv.viewer.IGTVViewerFragment;
import com.instagram.igtv.viewer.tvguide.IGTVSearchController;
import java.util.ArrayList;

/* renamed from: X.4x1 */
public final class AnonymousClass4x1 implements AnonymousClass15J {
    /* renamed from: B */
    public AnonymousClass0n8 f58757B;
    /* renamed from: C */
    public final TextView f58758C;
    /* renamed from: D */
    public final TextView f58759D;
    /* renamed from: E */
    public final CircularImageView f58760E;
    /* renamed from: F */
    public Drawable f58761F;
    /* renamed from: G */
    private final IGTVSearchController f58762G;

    public final void Xq(View view) {
    }

    public AnonymousClass4x1(View view, IGTVSearchController iGTVSearchController) {
        this.f58760E = (CircularImageView) view.findViewById(C0164R.id.channel_profile_pic);
        this.f58758C = (TextView) view.findViewById(C0164R.id.channel_user_full_name);
        this.f58759D = (TextView) view.findViewById(C0164R.id.channel_name);
        this.f58762G = iGTVSearchController;
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(view);
        anonymousClass15z.f14390J = AnonymousClass0e5.B(3.0d, 10.0d);
        anonymousClass15z.f14389I = 0.965f;
        anonymousClass15z.f14385E = this;
        anonymousClass15z.A();
    }

    public final boolean yCA(View view) {
        AnonymousClass0n8 anonymousClass0n8 = this.f58757B;
        if (anonymousClass0n8 == null) {
            return false;
        }
        String str;
        IGTVSearchController iGTVSearchController = this.f58762G;
        AnonymousClass4x0 anonymousClass4x0 = iGTVSearchController.f66209E;
        view = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < anonymousClass4x0.f58752I.size(); i2++) {
            AnonymousClass0n8 anonymousClass0n82 = (AnonymousClass0n8) anonymousClass4x0.f58752I.get(i2);
            str = anonymousClass0n82.f10006B;
            view.add(anonymousClass0n82.f10006B);
            if (str.equals(anonymousClass0n8.f10006B)) {
                i = i2;
            }
        }
        AnonymousClass5Ef anonymousClass5Ef = anonymousClass4x0.f58749F;
        String str2 = anonymousClass4x0.f58751H;
        String str3 = anonymousClass4x0.f58750G;
        AnonymousClass1KN anonymousClass1KN = AnonymousClass1KN.FELIX;
        anonymousClass5Ef.m26038A(str2, str3, anonymousClass1KN, anonymousClass1KN.toString(), anonymousClass0n8.f10006B, i, view).R();
        AnonymousClass1W1 anonymousClass1W1 = iGTVSearchController.f66213I;
        str = anonymousClass0n8.f10006B;
        AnonymousClass0bP B = AnonymousClass1W1.B(anonymousClass1W1, "igtv_search_select_channel");
        B.f6774x = str;
        AnonymousClass0bN.f(B.B(), AnonymousClass0dd.REGULAR);
        iGTVSearchController.f66210F.F();
        IGTVViewerFragment iGTVViewerFragment = iGTVSearchController.f66206B;
        iGTVViewerFragment.mTVGuideController.m27549D(anonymousClass0n8.f10015K, false, false);
        return true;
    }
}
