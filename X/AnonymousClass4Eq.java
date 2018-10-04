package X;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.instagram.comments.controller.CommentComposerController;

/* renamed from: X.4Eq */
public final class AnonymousClass4Eq implements OnEditorActionListener {
    /* renamed from: B */
    public final /* synthetic */ CommentComposerController f51876B;

    public AnonymousClass4Eq(CommentComposerController commentComposerController) {
        this.f51876B = commentComposerController;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 4 && this.f51876B.G()) {
            CommentComposerController.G(this.f51876B);
        }
        return CommentComposerController.D(this.f51876B).getConfiguration().orientation != 2;
    }
}
