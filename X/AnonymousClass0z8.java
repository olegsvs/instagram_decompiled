package X;

import android.graphics.PorterDuff.Mode;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.0z8 */
public final class AnonymousClass0z8 {
    /* renamed from: B */
    public static void m8669B(AnonymousClass0z7 anonymousClass0z7, AnonymousClass0P7 anonymousClass0P7, int i, AnonymousClass0k3 anonymousClass0k3, IgProgressImageView igProgressImageView) {
        if (anonymousClass0z7.f12950F == null) {
            LinearLayout linearLayout = (LinearLayout) anonymousClass0z7.f12952H.inflate();
            anonymousClass0z7.f12950F = linearLayout;
            anonymousClass0z7.f12949E = linearLayout.findViewById(C0164R.id.divider_line);
            anonymousClass0z7.f12955K = (TextView) anonymousClass0z7.f12950F.findViewById(C0164R.id.restricted_media_title);
            anonymousClass0z7.f12954J = (TextView) anonymousClass0z7.f12950F.findViewById(C0164R.id.restricted_media_subtitle);
            anonymousClass0z7.f12948D = (ImageView) anonymousClass0z7.f12950F.findViewById(C0164R.id.dismiss_icon_imageview);
            anonymousClass0z7.f12946B = (LinearLayout) anonymousClass0z7.f12950F.findViewById(C0164R.id.button_container);
            anonymousClass0z7.f12951G = (TextView) anonymousClass0z7.f12950F.findViewById(C0164R.id.left_button);
            anonymousClass0z7.f12953I = (TextView) anonymousClass0z7.f12950F.findViewById(C0164R.id.right_button);
            anonymousClass0z7.f12947C = (TextView) anonymousClass0z7.f12950F.findViewById(C0164R.id.center_button);
        }
        AnonymousClass0wA anonymousClass0wA = anonymousClass0P7.IB;
        igProgressImageView.setAlpha(102.0f);
        igProgressImageView.getIgImageView().setColorFilter(AnonymousClass0Ca.m937C(igProgressImageView.getContext(), C0164R.color.black_30_transparent), Mode.SRC_OVER);
        igProgressImageView.setMiniPreviewBlurRadius(AnonymousClass0wA.f12223F);
        Object obj = (!anonymousClass0P7.iA() || i < 0 || i >= anonymousClass0P7.m3761Q()) ? null : 1;
        String str = null;
        if (obj != null) {
            str = anonymousClass0P7.m3763S(i).wB;
        } else if (anonymousClass0P7.iA()) {
            anonymousClass0z7.f12950F.setBackgroundColor(AnonymousClass0Ca.m937C(igProgressImageView.getContext(), C0164R.color.black));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Carousel index out of bounds.Carousel size: ");
            stringBuilder.append(anonymousClass0P7.m3761Q());
            stringBuilder.append("Index: ");
            stringBuilder.append(i);
            AnonymousClass0Gn.m1876C("MediaGatingViewBinder", stringBuilder.toString());
        } else {
            str = anonymousClass0P7.wB;
        }
        igProgressImageView.setUrl(AnonymousClass0Gs.m1908D(str));
        anonymousClass0z7.f12950F.setVisibility(0);
        anonymousClass0z7.f12948D.getDrawable().setColorFilter(-1, Mode.SRC_ATOP);
        if (anonymousClass0wA.f12230E == AnonymousClass0wB.SENSITIVE) {
            anonymousClass0z7.f12955K.setText(anonymousClass0wA.f12229D);
            anonymousClass0z7.f12954J.setText(anonymousClass0wA.f12228C);
            anonymousClass0z7.f12946B.setVisibility(0);
            anonymousClass0z7.f12947C.setVisibility(0);
            anonymousClass0z7.f12951G.setVisibility(8);
            anonymousClass0z7.f12953I.setVisibility(8);
            anonymousClass0z7.f12947C.setText((CharSequence) anonymousClass0wA.f12227B.get(AnonymousClass0wA.f12226I));
            anonymousClass0z7.f12947C.setOnClickListener(new AnonymousClass1A5(anonymousClass0k3, anonymousClass0P7));
            return;
        }
        anonymousClass0z7.f12955K.setText(anonymousClass0wA.f12229D);
        anonymousClass0z7.f12954J.setText(anonymousClass0wA.f12228C);
        if (anonymousClass0wA.f12230E == AnonymousClass0wB.APPEALABLE) {
            anonymousClass0z7.f12949E.setVisibility(0);
            anonymousClass0z7.f12946B.setVisibility(0);
            anonymousClass0z7.f12947C.setVisibility(8);
            anonymousClass0z7.f12951G.setVisibility(0);
            anonymousClass0z7.f12953I.setVisibility(0);
            anonymousClass0z7.f12951G.setText((CharSequence) anonymousClass0wA.f12227B.get(AnonymousClass0wA.f12224G));
            anonymousClass0z7.f12951G.setOnClickListener(new AnonymousClass1A6(anonymousClass0k3, anonymousClass0P7));
            anonymousClass0z7.f12953I.setText((CharSequence) anonymousClass0wA.f12227B.get(AnonymousClass0wA.f12225H));
            anonymousClass0z7.f12953I.setOnClickListener(new AnonymousClass1A7(anonymousClass0k3, anonymousClass0P7));
            return;
        }
        anonymousClass0z7.f12949E.setVisibility(8);
        anonymousClass0z7.f12946B.setVisibility(8);
    }

    /* renamed from: C */
    public static AnonymousClass0z7 m8670C(ViewStub viewStub) {
        return new AnonymousClass0z7(viewStub);
    }

    /* renamed from: D */
    public static void m8671D(AnonymousClass0z7 anonymousClass0z7) {
        if (anonymousClass0z7.f12950F != null) {
            anonymousClass0z7.f12950F.setVisibility(8);
        }
    }
}
