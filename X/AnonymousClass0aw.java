package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.0aw */
public final class AnonymousClass0aw implements OnDismissListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0HI f6612B;

    public AnonymousClass0aw(AnonymousClass0HI anonymousClass0HI) {
        this.f6612B = anonymousClass0HI;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.mo377B().onDismiss(dialogInterface);
        for (ReelViewerFragment b : this.f6612B.f2587F) {
            ReelViewerFragment.m4003b(b);
        }
    }
}
