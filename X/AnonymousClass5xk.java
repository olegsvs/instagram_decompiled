package X;

import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.save.ui.collections.SavedCollectionThumbnailView;

/* renamed from: X.5xk */
public final class AnonymousClass5xk {
    /* renamed from: B */
    public final TextView f70379B;
    /* renamed from: C */
    public final AnonymousClass0ct f70380C;
    /* renamed from: D */
    public final SavedCollectionThumbnailView f70381D;
    /* renamed from: E */
    public final ViewGroup f70382E;

    public AnonymousClass5xk(ViewGroup viewGroup) {
        this.f70382E = viewGroup;
        this.f70381D = (SavedCollectionThumbnailView) viewGroup.findViewById(C0164R.id.saved_collection_thumbnail);
        this.f70379B = (TextView) viewGroup.findViewById(C0164R.id.saved_collection_name);
        this.f70380C = new AnonymousClass0ct((ViewStub) viewGroup.findViewById(C0164R.id.saved_collection_glyph_stub));
    }
}
