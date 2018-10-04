package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.59L */
public final class AnonymousClass59L {
    /* renamed from: B */
    public final AnonymousClass59F f60583B;
    /* renamed from: C */
    public Context f60584C;
    /* renamed from: D */
    public boolean f60585D = true;
    /* renamed from: E */
    public ReelViewerFragment f60586E;
    /* renamed from: F */
    public LinearLayout f60587F;

    public AnonymousClass59L(View view, ReelViewerFragment reelViewerFragment, AnonymousClass59F anonymousClass59F) {
        this.f60583B = anonymousClass59F;
        LinearLayout linearLayout = (LinearLayout) ((ViewStub) view.findViewById(C0164R.id.reel_reaction_toolbar_viewstub)).inflate();
        this.f60587F = linearLayout;
        this.f60584C = linearLayout.getContext();
        this.f60586E = reelViewerFragment;
        LayoutInflater from = LayoutInflater.from(this.f60584C);
        AnonymousClass2E3[] values = AnonymousClass2E3.values();
        int length = values.length / 2;
        for (int i = 0; i < 2; i++) {
            View linearLayout2 = new LinearLayout(this.f60584C);
            linearLayout2.setLayoutParams(new LayoutParams(-2, -2));
            for (int i2 = 0; i2 < length; i2++) {
                AnonymousClass2E3 anonymousClass2E3 = values[(i * length) + i2];
                ConstrainedImageView constrainedImageView = (ConstrainedImageView) from.inflate(C0164R.layout.reel_reaction, linearLayout2, false);
                constrainedImageView.setUrl(AnonymousClass2Hj.B(anonymousClass2E3.B()));
                constrainedImageView.setOnClickListener(new AnonymousClass59J(this, anonymousClass2E3));
                linearLayout2.addView(constrainedImageView);
            }
            this.f60587F.addView(linearLayout2);
        }
    }
}
