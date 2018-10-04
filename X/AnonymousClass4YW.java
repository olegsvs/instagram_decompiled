package X;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;

/* renamed from: X.4YW */
public final class AnonymousClass4YW implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Yd f55148B;
    /* renamed from: C */
    public final /* synthetic */ ImageView f55149C;

    public AnonymousClass4YW(AnonymousClass4Yd anonymousClass4Yd, ImageView imageView) {
        this.f55148B = anonymousClass4Yd;
        this.f55149C = imageView;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 2025230680);
        PhotoFilter D = AnonymousClass3GU.m19200D(this.f55148B.f55164E);
        D.f50025C ^= 1;
        this.f55149C.setSelected(D.f50025C);
        this.f55148B.f55168I.vJA();
        AnonymousClass0cQ.L(this, -34393358, M);
    }
}
