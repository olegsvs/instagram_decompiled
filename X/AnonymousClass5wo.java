package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.5wo */
public final class AnonymousClass5wo implements OnDismissListener {
    /* renamed from: B */
    public final /* synthetic */ ReelViewerFragment f70219B;

    public AnonymousClass5wo(ReelViewerFragment reelViewerFragment) {
        this.f70219B = reelViewerFragment;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ReelViewerFragment.b(this.f70219B);
    }
}
