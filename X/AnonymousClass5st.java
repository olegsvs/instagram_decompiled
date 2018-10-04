package X;

import android.view.View;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.instagram.business.insights.controller.InsightsStoryViewerController;
import com.instagram.react.modules.product.IgReactInsightsStoryPresenterModule;
import java.util.List;

/* renamed from: X.5st */
public final class AnonymousClass5st implements UIBlock {
    /* renamed from: B */
    public final /* synthetic */ int f69596B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass34j f69597C;
    /* renamed from: D */
    public final /* synthetic */ List f69598D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Qf f69599E;
    /* renamed from: F */
    public final /* synthetic */ double f69600F;

    public AnonymousClass5st(IgReactInsightsStoryPresenterModule igReactInsightsStoryPresenterModule, double d, AnonymousClass34j anonymousClass34j, List list, int i, AnonymousClass0Qf anonymousClass0Qf) {
        this.f69600F = d;
        this.f69597C = anonymousClass34j;
        this.f69598D = list;
        this.f69596B = i;
        this.f69599E = anonymousClass0Qf;
    }

    public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        try {
            View resolveView = nativeViewHierarchyManager.resolveView((int) this.f69600F);
            AnonymousClass0IL anonymousClass0IL = this.f69597C;
            List list = this.f69598D;
            int i = this.f69596B;
            AnonymousClass0oN anonymousClass0oN = (AnonymousClass0oN) this.f69597C;
            AnonymousClass0Qf anonymousClass0Qf = this.f69599E;
            anonymousClass0IL.f37595D = resolveView;
            anonymousClass0IL.f37593B = i;
            new AnonymousClass0ng(anonymousClass0IL.getContext(), anonymousClass0IL.f37596E.f1759C, anonymousClass0IL.getLoaderManager()).C(InsightsStoryViewerController.B(list, anonymousClass0IL.f37596E), new AnonymousClass1WF(anonymousClass0IL.f37594C, anonymousClass0oN, anonymousClass0Qf));
        } catch (Throwable e) {
            AnonymousClass0Gn.E(IgReactInsightsStoryPresenterModule.class.getName(), "failed to get source view by reactTag", e);
        }
    }
}
