package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.instagram.comments.controller.CommentComposerController;

/* renamed from: X.4Eu */
public final class AnonymousClass4Eu implements OnItemClickListener {
    /* renamed from: B */
    public final /* synthetic */ CommentComposerController f51880B;

    public AnonymousClass4Eu(CommentComposerController commentComposerController) {
        this.f51880B = commentComposerController;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        if ((itemAtPosition instanceof AnonymousClass0Ci) && this.f51880B.f63716U) {
            AnonymousClass0xI anonymousClass0xI = this.f51880B.f63700E;
            AnonymousClass0P7 anonymousClass0P7 = this.f51880B.f63713R;
            String str = this.f51880B.f63721Z.f1759C;
            AnonymousClass0SK anonymousClass0SK = this.f51880B.f63715T;
            AnonymousClass0NN B = AnonymousClass0NN.B("instagram_comment_mention_composer_select", anonymousClass0xI.f12507B).F("pk", str).F("m_pk", anonymousClass0P7.NO()).F("mention_pk", ((AnonymousClass0Ci) itemAtPosition).getId()).B("mention_index_in_null_state", i);
            if (anonymousClass0SK != null) {
                B.F("parent_c_pk", anonymousClass0SK.XP()).F("parent_ca_pk", anonymousClass0SK.pT().getId());
            }
            B.R();
            this.f51880B.f63716U = false;
        }
    }
}
