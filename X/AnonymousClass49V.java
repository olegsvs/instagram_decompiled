package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;

/* renamed from: X.49V */
public final class AnonymousClass49V implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ SelectHighlightsCoverFragment f50923B;

    public AnonymousClass49V(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        this.f50923B = selectHighlightsCoverFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f50923B.f50924B = true;
        this.f50923B.getActivity().onBackPressed();
    }
}
