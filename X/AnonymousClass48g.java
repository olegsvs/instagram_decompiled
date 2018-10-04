package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.archive.fragment.ArchivePrivateHighlightsFragment;

/* renamed from: X.48g */
public final class AnonymousClass48g implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ ArchivePrivateHighlightsFragment f50764B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0MI f50765C;

    public AnonymousClass48g(ArchivePrivateHighlightsFragment archivePrivateHighlightsFragment, AnonymousClass0MI anonymousClass0MI) {
        this.f50764B = archivePrivateHighlightsFragment;
        this.f50765C = anonymousClass0MI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0Ie anonymousClass0Ie = this.f50764B;
        AnonymousClass0MI anonymousClass0MI = this.f50765C;
        AnonymousClass0Cn anonymousClass0Cn = anonymousClass0Ie.f50770D;
        String id = anonymousClass0MI.getId();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("highlights/");
        stringBuilder.append(id);
        stringBuilder.append("/unarchive_reel/");
        id = stringBuilder.toString();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = id;
        AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass0Pv.class).N().H();
        H.f2849B = new AnonymousClass48h(anonymousClass0Ie, anonymousClass0MI);
        anonymousClass0Ie.schedule(H);
        dialogInterface.dismiss();
    }
}
