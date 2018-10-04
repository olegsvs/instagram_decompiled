package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.search.StickySearchBarAnimationHelper;

/* renamed from: X.5V2 */
public final class AnonymousClass5V2 implements AnonymousClass4l6 {
    /* renamed from: B */
    public final /* synthetic */ DirectPrivateStoryRecipientController f65135B;

    public final void CCA(DirectShareTarget directShareTarget, int i, int i2) {
    }

    public AnonymousClass5V2(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.f65135B = directPrivateStoryRecipientController;
    }

    public final void dEA(DirectShareTarget directShareTarget, int i, int i2) {
        this.f65135B.f65197z = this.f65135B.f65197z + 1;
        int i3 = i2;
        AnonymousClass4dp.B(false, this.f65135B.f65153H, directShareTarget, i3, i, this.f65135B.f65165T.LQ(), directShareTarget.f5604E.f5871C);
        DirectPrivateStoryRecipientController.m27119F(this.f65135B);
        DirectPrivateStoryRecipientController.m27121H(this.f65135B);
        AnonymousClass0rF.B(this.f65135B.f65164S, -1339938665);
    }

    public final void iz(DirectShareTarget directShareTarget, int i, int i2) {
        this.f65135B.f65196y = this.f65135B.f65196y + 1;
        int i3 = i2;
        AnonymousClass4dp.B(true, this.f65135B.f65153H, directShareTarget, i3, i, this.f65135B.f65165T.LQ(), directShareTarget.f5604E.f5871C);
        AnonymousClass5Wz anonymousClass5Wz = this.f65135B.f65163R;
        anonymousClass5Wz.f65692J.remove(directShareTarget);
        anonymousClass5Wz.f65692J.add(directShareTarget);
        this.f65135B.f65163R.m27356J(this.f65135B.f65170Y, this.f65135B.f65150E, true, this.f65135B.f65169X);
        this.f65135B.mSearchController.F();
        if (this.f65135B.mStickySearchBarAnimationHelper != null) {
            StickySearchBarAnimationHelper stickySearchBarAnimationHelper = this.f65135B.mStickySearchBarAnimationHelper;
            stickySearchBarAnimationHelper.mListView.setSelectionFromTop(stickySearchBarAnimationHelper.f48705D, 0);
        }
        this.f65135B.mListView.postDelayed(new AnonymousClass4b6(this), 200);
        DirectPrivateStoryRecipientController.m27119F(this.f65135B);
        DirectPrivateStoryRecipientController.m27121H(this.f65135B);
    }

    public final int vO(TextView textView) {
        return AnonymousClass4kg.C(textView);
    }
}
