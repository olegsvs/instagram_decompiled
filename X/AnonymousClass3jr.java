package X;

import android.database.DataSetObserver;
import com.instagram.ui.widget.search.StickySearchBarAnimationHelper;

/* renamed from: X.3jr */
public final class AnonymousClass3jr extends DataSetObserver {
    /* renamed from: B */
    public final /* synthetic */ StickySearchBarAnimationHelper f43865B;

    public AnonymousClass3jr(StickySearchBarAnimationHelper stickySearchBarAnimationHelper) {
        this.f43865B = stickySearchBarAnimationHelper;
    }

    public final void onChanged() {
        StickySearchBarAnimationHelper.m22221C(this.f43865B);
    }

    public final void onInvalidated() {
        StickySearchBarAnimationHelper.m22221C(this.f43865B);
    }
}
