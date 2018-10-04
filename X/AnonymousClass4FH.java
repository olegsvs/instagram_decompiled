package X;

import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.4FH */
public final class AnonymousClass4FH implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5SC f51959B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0SK f51960C;

    public AnonymousClass4FH(AnonymousClass5SC anonymousClass5SC, AnonymousClass0SK anonymousClass0SK) {
        this.f51959B = anonymousClass5SC;
        this.f51960C = anonymousClass0SK;
    }

    public final void run() {
        if (this.f51959B.getView() != null && this.f51959B.getListView() != null && !AnonymousClass0HV.D(this.f51959B.f63808m).f2646B.getBoolean("seen_offline_comment_nux", false)) {
            int firstVisiblePosition = this.f51959B.getListViewSafe().getFirstVisiblePosition();
            int lastVisiblePosition = this.f51959B.getListViewSafe().getLastVisiblePosition();
            int H = this.f51959B.f63771B.m23616H(this.f51960C.XP());
            if (H >= firstVisiblePosition && H <= lastVisiblePosition) {
                int i = 0;
                Object obj = this.f51959B.getListViewSafe().getChildCount() == 1 ? 1 : null;
                if (obj != null) {
                    i = this.f51959B.getResources().getDimensionPixelOffset(C0164R.dimen.row_comment_vertical_padding);
                }
                AnonymousClass173 anonymousClass173 = new AnonymousClass173(this.f51959B.getActivity(), new AnonymousClass174(this.f51959B.getResources().getString(C0164R.string.offline_comment_nux)));
                anonymousClass173.f14643I = (ViewGroup) this.f51959B.getListView().getParent();
                AnonymousClass173 B = anonymousClass173.B(AnonymousClass5SC.B(this.f51959B, 1.0d), AnonymousClass5SC.B(this.f51959B, obj != null ? 0.5d : -0.5d) + i, true, this.f51959B.getListView().getChildAt(H - firstVisiblePosition).findViewById(C0164R.id.row_comment_imageview));
                B.f14642H = obj != null ? AnonymousClass177.BELOW_ANCHOR : AnonymousClass177.ABOVE_ANCHOR;
                B.f14648N = AnonymousClass178.f14655F;
                B.f14636B = true;
                B.A().C();
                AnonymousClass0HV.D(this.f51959B.f63808m).f2646B.edit().putBoolean("seen_offline_comment_nux", true).apply();
            }
        }
    }
}
