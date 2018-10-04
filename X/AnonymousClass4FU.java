package X;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.instagram.comments.controller.CommentComposerController;

/* renamed from: X.4FU */
public final class AnonymousClass4FU implements OnLayoutChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5SC f51979B;

    public AnonymousClass4FU(AnonymousClass5SC anonymousClass5SC) {
        this.f51979B = anonymousClass5SC;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!(i8 == 0 || i4 == i8)) {
            this.f51979B.f63789T = i4 < i8;
        }
        if (i8 != i4 && this.f51979B.f63789T && this.f51979B.f63776G.mViewHolder.f51886D.isFocused()) {
            CommentComposerController commentComposerController = this.f51979B.f63776G;
            Object obj = (CommentComposerController.E(commentComposerController) && commentComposerController.f63706K && commentComposerController.mViewHolder.m23635B().f51914F == AnonymousClass4F5.EXPANDED) ? 1 : null;
            if (obj == null) {
                if (this.f51979B.f63784O != null) {
                    this.f51979B.f63783N.m23654D(this.f51979B.f63784O);
                } else if (this.f51979B.f63790U > 0) {
                    AnonymousClass4Fc.m23652D(this.f51979B.f63783N, this.f51979B.f63790U, 0);
                }
            }
        }
        CommentComposerController commentComposerController2 = this.f51979B.f63776G;
        i4 -= i2;
        if (commentComposerController2.f63706K) {
            commentComposerController2.f63704I.m23648B((i4 - CommentComposerController.C(commentComposerController2)) - (commentComposerController2.mViewHolder.f51885C.f62022G ? commentComposerController2.mViewHolder.f51885C.getHeight() : 0));
        }
    }
}
