package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import com.facebook.C0164R;
import com.instagram.igtv.viewer.IGTVViewerFragment;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.4wN */
public final class AnonymousClass4wN implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4wT f58650B;
    /* renamed from: C */
    public final /* synthetic */ IGTVViewerFragment f58651C;
    /* renamed from: D */
    public final /* synthetic */ CharSequence[] f58652D;

    public AnonymousClass4wN(AnonymousClass4wT anonymousClass4wT, CharSequence[] charSequenceArr, IGTVViewerFragment iGTVViewerFragment) {
        this.f58650B = anonymousClass4wT;
        this.f58652D = charSequenceArr;
        this.f58651C = iGTVViewerFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = this.f58652D[i];
        if (this.f58650B.f58668I.getString(C0164R.string.delete).equals(obj)) {
            AnonymousClass4wT anonymousClass4wT = this.f58650B;
            IGTVViewerFragment iGTVViewerFragment = this.f58651C;
            if (anonymousClass4wT.f58662C.S()) {
                OnDismissListener onDismissListener = anonymousClass4wT.f58663D;
                new AnonymousClass0Sb(anonymousClass4wT.f58661B).Q(C0164R.string.igtv_delete_video_title).H(C0164R.string.igtv_delete_video_description).O(C0164R.string.delete, new AnonymousClass4wR(anonymousClass4wT, iGTVViewerFragment, onDismissListener)).L(C0164R.string.cancel, new AnonymousClass4wQ(anonymousClass4wT, onDismissListener)).C().show();
            } else if (anonymousClass4wT.f58662C.T()) {
                AnonymousClass0GK.E(anonymousClass4wT.f58661B, anonymousClass4wT.f58670K).B(anonymousClass4wT.f58662C.H(), anonymousClass4wT.f58664E);
                PendingMediaStore.C().H();
            }
            this.f58650B.f58663D = null;
        } else if (this.f58650B.f58668I.getString(C0164R.string.retry).equals(obj)) {
            AnonymousClass4wT anonymousClass4wT2 = this.f58650B;
            AnonymousClass0GK.E(anonymousClass4wT2.f58661B, anonymousClass4wT2.f58670K).F(anonymousClass4wT2.f58662C.H().UB, new AnonymousClass4wP(anonymousClass4wT2));
            dialogInterface.dismiss();
        } else if (this.f58650B.f58668I.getString(C0164R.string.igtv_copy_link).equals(obj)) {
            AnonymousClass4wT anonymousClass4wT3 = this.f58650B;
            AnonymousClass4wT.m25440B(anonymousClass4wT3, anonymousClass4wT3.f58662C.G().getId());
            AnonymousClass0EE anonymousClass0EE = this.f58650B;
            AnonymousClass3f3.F(anonymousClass0EE, anonymousClass0EE.f58662C.E(), "igtv_action_sheet", "copy_link");
        } else if (this.f58650B.f58668I.getString(C0164R.string.igtv_header_insights).equals(obj)) {
            dialogInterface.dismiss();
            AnonymousClass0IL anonymousClass0IL = this.f58651C;
            AnonymousClass2CT anonymousClass2CT = this.f58650B.f58662C;
            AnonymousClass4uq.m25339B(anonymousClass0IL.getContext()).m25344B(true);
            anonymousClass0IL.mModalDrawerController.m27504B(anonymousClass2CT, true);
        }
    }
}
