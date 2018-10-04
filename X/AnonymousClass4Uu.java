package X;

import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filter.IgFilter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Uu */
public final class AnonymousClass4Uu implements AnonymousClass3Cx {
    /* renamed from: B */
    public final /* synthetic */ AlbumEditFragment f54670B;
    /* renamed from: C */
    public final /* synthetic */ int f54671C;

    public final void VDA(AnonymousClass3Ci anonymousClass3Ci) {
    }

    public AnonymousClass4Uu(AlbumEditFragment albumEditFragment, int i) {
        this.f54670B = albumEditFragment;
        this.f54671C = i;
    }

    public final void WDA(AnonymousClass3ym anonymousClass3ym) {
        IgFilter igFilter;
        anonymousClass3ym.f47759F = true;
        anonymousClass3ym.invalidate();
        AnonymousClass3Cu OK = anonymousClass3ym.getTileInfo().OK();
        if (this.f54671C < 0 || anonymousClass3ym.getTileInfo().oM() != this.f54671C) {
            igFilter = null;
        } else {
            igFilter = ((AnonymousClass4H3) anonymousClass3ym.getTileInfo()).f52262B;
        }
        if (OK != null) {
            OK.XW(anonymousClass3ym, igFilter);
        }
    }

    public final void XDA(AnonymousClass3ym anonymousClass3ym, boolean z) {
        anonymousClass3ym.invalidate();
        PhotoFilter photoFilter = ((AnonymousClass4H3) anonymousClass3ym.getTileInfo()).f52262B;
        AnonymousClass2NY.m15348B().f29722S = photoFilter.f50029G;
        AnonymousClass4H2 anonymousClass4H2 = (AnonymousClass4H2) anonymousClass3ym.getTileInfo().OK();
        if (anonymousClass4H2 != null) {
            AlbumEditFragment albumEditFragment = this.f54670B;
            List arrayList = new ArrayList();
            for (PhotoSession photoSession : albumEditFragment.f64905F.m18976M()) {
                arrayList.add(photoSession.f38982E);
            }
            AlbumEditFragment albumEditFragment2 = this.f54670B;
            List arrayList2 = new ArrayList();
            for (VideoSession videoSession : albumEditFragment2.f64905F.m18977N()) {
                arrayList2.add(albumEditFragment2.f64908I.LP(videoSession.f39000N));
            }
            if (anonymousClass4H2.m23720A(anonymousClass3ym, arrayList, arrayList2, this.f54670B) && z) {
                AnonymousClass2NY.m15348B().f29721R = true;
                AnonymousClass0IL anonymousClass0IL = this.f54670B;
                anonymousClass0IL.f64903D = anonymousClass4H2;
                anonymousClass0IL.f64901B.setDisplayedChild(1);
                anonymousClass0IL.f64902C.addView(anonymousClass0IL.f64903D.MI(anonymousClass0IL.getContext()));
                AnonymousClass3HZ.m19251B(new AnonymousClass3zU(anonymousClass0IL.f64903D.CT()));
                AnonymousClass4HA anonymousClass4HA = anonymousClass0IL.mRenderViewController;
                anonymousClass4HA.f52283J.removeView(anonymousClass4HA.f52276C);
                anonymousClass4HA.f52283J.setSnapToEdges(false);
                if (anonymousClass4HA.f52279F > anonymousClass4HA.f52283J.getChildCount() - 1) {
                    int childCount = anonymousClass4HA.f52283J.getChildCount() - 1;
                    ReboundHorizontalScrollView reboundHorizontalScrollView = anonymousClass4HA.f52283J;
                    reboundHorizontalScrollView.m18893C(childCount, reboundHorizontalScrollView.getVelocity());
                    anonymousClass4HA.Ko(anonymousClass4HA.f52283J, childCount, childCount);
                    return;
                }
                ReboundHorizontalScrollView reboundHorizontalScrollView2 = anonymousClass4HA.f52283J;
                reboundHorizontalScrollView2.m18893C(anonymousClass4HA.f52279F, reboundHorizontalScrollView2.getVelocity());
            }
        }
    }
}
