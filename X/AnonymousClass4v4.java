package X;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.instagram.igtv.uploadflow.IGTVUploadGalleryFragment;

/* renamed from: X.4v4 */
public final class AnonymousClass4v4 extends AnonymousClass0rv {
    /* renamed from: B */
    public final /* synthetic */ int f58458B;

    public AnonymousClass4v4(IGTVUploadGalleryFragment iGTVUploadGalleryFragment, int i) {
        this.f58458B = i;
    }

    /* renamed from: A */
    public final void m25369A(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0or anonymousClass0or) {
        super.A(rect, view, recyclerView, anonymousClass0or);
        int J = RecyclerView.J(view) % 3;
        int i = this.f58458B / 2;
        rect.left = J == 0 ? 0 : i;
        if (J == 2) {
            i = 0;
        }
        rect.right = i;
        rect.bottom = this.f58458B;
    }
}
