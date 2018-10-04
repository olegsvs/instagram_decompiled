package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.comments.controller.CommentComposerController;

/* renamed from: X.4Es */
public final class AnonymousClass4Es implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ CommentComposerController f51878B;

    public AnonymousClass4Es(CommentComposerController commentComposerController) {
        this.f51878B = commentComposerController;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -280744000);
        this.f51878B.mViewHolder.f51886D.requestFocus();
        this.f51878B.mViewHolder.f51886D.append("@");
        AnonymousClass0xI anonymousClass0xI = this.f51878B.f63700E;
        AnonymousClass0P7 anonymousClass0P7 = this.f51878B.f63713R;
        String str = this.f51878B.f63721Z.f1759C;
        AnonymousClass0SK anonymousClass0SK = this.f51878B.f63715T;
        AnonymousClass0NN F = AnonymousClass0NN.B("instagram_comment_mention_composer_tap", anonymousClass0xI.f12507B).F("pk", str).F("m_pk", anonymousClass0P7.NO());
        if (anonymousClass0SK != null) {
            F.F("parent_c_pk", anonymousClass0SK.XP()).F("parent_ca_pk", anonymousClass0SK.pT().getId());
        }
        F.R();
        this.f51878B.f63716U = true;
        AnonymousClass0cQ.L(this, 1267490888, M);
    }
}
