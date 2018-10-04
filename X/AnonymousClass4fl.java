package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.4fl */
public final class AnonymousClass4fl implements AnonymousClass1Tn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5bk f56176B;

    public AnonymousClass4fl(AnonymousClass5bk anonymousClass5bk) {
        this.f56176B = anonymousClass5bk;
    }

    public final /* bridge */ /* synthetic */ void Lo(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        this.f56176B.f67131E = (ColorFilterAlphaImageView) viewGroup.findViewById(C0164R.id.persisted_reel_archive_icon);
        this.f56176B.f67132F = (TextView) viewGroup.findViewById(C0164R.id.persisted_reel_text);
    }
}
