package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0164R;
import com.instagram.igtv.viewer.tvguide.IGTVSearchController;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4x0 */
public final class AnonymousClass4x0 extends AnonymousClass0Rq {
    /* renamed from: B */
    public final AnonymousClass4x2 f58745B;
    /* renamed from: C */
    public final AnonymousClass0qL f58746C;
    /* renamed from: D */
    public final AnonymousClass3iw f58747D;
    /* renamed from: E */
    public final String f58748E;
    /* renamed from: F */
    public AnonymousClass5Ef f58749F;
    /* renamed from: G */
    public String f58750G;
    /* renamed from: H */
    public String f58751H;
    /* renamed from: I */
    public final List f58752I = new ArrayList();
    /* renamed from: J */
    public final AnonymousClass2IR f58753J;
    /* renamed from: K */
    public boolean f58754K = true;
    /* renamed from: L */
    public final AnonymousClass2IR f58755L;
    /* renamed from: M */
    public final AnonymousClass2IS f58756M;

    public AnonymousClass4x0(Context context, IGTVSearchController iGTVSearchController) {
        Resources resources = context.getResources();
        this.f58745B = new AnonymousClass4x2(iGTVSearchController);
        this.f58756M = new AnonymousClass2IS(C0164R.layout.channels_search_title_row);
        this.f58746C = new AnonymousClass0qL(context);
        this.f58748E = resources.getString(C0164R.string.igtv_search_results_no_channels_found);
        this.f58755L = new AnonymousClass2IR(resources.getString(C0164R.string.igtv_suggested_channels_header));
        this.f58753J = new AnonymousClass2IR(resources.getString(C0164R.string.igtv_search_results_channels_header));
        this.f58747D = new AnonymousClass3iw(context);
        D(new AnonymousClass0TB[]{this.f58756M, this.f58745B, this.f58746C, this.f58747D});
    }
}
