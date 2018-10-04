package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.facebook.C0164R;

/* renamed from: X.5DZ */
public final class AnonymousClass5DZ {
    /* renamed from: B */
    public final LinearLayout f61302B;
    /* renamed from: C */
    public final int f61303C = AnonymousClass0Ca.C(this.f61302B.getContext(), C0164R.color.grey_9);
    /* renamed from: D */
    public final int f61304D = AnonymousClass0Ca.C(this.f61302B.getContext(), C0164R.color.grey_5);
    /* renamed from: E */
    private final String f61305E;
    /* renamed from: F */
    private final String f61306F;

    public AnonymousClass5DZ(View view) {
        LinearLayout linearLayout = (LinearLayout) ((ViewStub) view.findViewById(C0164R.id.reel_type_selector_stub)).inflate();
        this.f61302B = linearLayout;
        Resources resources = linearLayout.getResources();
        this.f61306F = resources.getString(C0164R.string.story);
        this.f61305E = resources.getString(C0164R.string.live_label);
    }

    /* renamed from: A */
    public final String m25991A(AnonymousClass0MI anonymousClass0MI) {
        switch (AnonymousClass0Pr.D(anonymousClass0MI).ordinal()) {
            case 0:
                return this.f61306F;
            case 1:
                return this.f61305E;
            default:
                throw new IllegalStateException("Own reels should only be of type STORY or REPLAY");
        }
    }
}
