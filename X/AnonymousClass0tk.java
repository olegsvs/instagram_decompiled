package X;

import android.net.Uri;
import android.os.Build.VERSION;
import com.facebook.C0164R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.0tk */
public final class AnonymousClass0tk {
    /* renamed from: B */
    public static void m8180B(AnonymousClass0P7 anonymousClass0P7, IgProgressImageView igProgressImageView, AnonymousClass0EE anonymousClass0EE) {
        igProgressImageView.setTag(C0164R.id.key_media_id, anonymousClass0P7.getId());
        igProgressImageView.clearAnimation();
        igProgressImageView.setMiniPreviewBlurRadius(AnonymousClass0Gs.f2429h);
        igProgressImageView.setMiniPreviewPayload(anonymousClass0P7.wB);
        if (anonymousClass0P7.wY() && VERSION.SDK_INT >= 21 && AnonymousClass0vc.m8346B(AnonymousClass0vc.m8348D(anonymousClass0P7))) {
            igProgressImageView.m7590G(Uri.fromFile(AnonymousClass0vc.m8347C(igProgressImageView.getContext(), AnonymousClass0vc.m8348D(anonymousClass0P7))).toString(), true);
        } else if (anonymousClass0P7.YA()) {
            igProgressImageView.setUrl(anonymousClass0P7.mB.toString());
        } else {
            String x;
            boolean B = AnonymousClass0q7.m7907B().m7907B();
            AnonymousClass0xs.m8589B();
            boolean contains = AnonymousClass0xs.f12668B.contains(anonymousClass0P7.NO());
            if (!B || contains) {
                x = anonymousClass0P7.m3794x(igProgressImageView.getContext());
            } else {
                x = anonymousClass0P7.HA();
            }
            igProgressImageView.setUrlWithFallback(x, anonymousClass0P7.HA(), anonymousClass0EE.getModuleName());
        }
    }
}
