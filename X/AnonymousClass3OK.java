package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.WeakReference;

/* renamed from: X.3OK */
public final class AnonymousClass3OK {
    /* renamed from: B */
    public static void m19511B(AnonymousClass40Q anonymousClass40Q, AnonymousClass3OF anonymousClass3OF, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, Context context, int i) {
        if (anonymousClass0P7.eY() || !anonymousClass0P7.wY() || (!anonymousClass0P7.bA() && i == -1)) {
            anonymousClass40Q.m22010A();
            return;
        }
        anonymousClass40Q.f48215D = anonymousClass0m3;
        if (anonymousClass40Q.f48214C == null) {
            RelativeLayout relativeLayout = (RelativeLayout) anonymousClass40Q.f48220I.inflate();
            anonymousClass40Q.f48214C = relativeLayout;
            anonymousClass40Q.f48217F = (SlideInAndOutIconView) relativeLayout.findViewById(C0164R.id.row_feed_video_indicator);
        }
        anonymousClass40Q.f48214C.setOnClickListener(new AnonymousClass3OG(anonymousClass40Q, anonymousClass3OF, anonymousClass0P7));
        if (i == -1) {
            if (anonymousClass40Q.f48213B == null) {
                anonymousClass40Q.f48213B = new WeakReference(anonymousClass40Q.f48217F);
                anonymousClass40Q.f48218G.f12064H = anonymousClass40Q.f48213B;
            }
            if (anonymousClass40Q.f48217F.getVisibility() == 8) {
                anonymousClass40Q.f48217F.B();
                anonymousClass40Q.f48217F.setVisibility(0);
            }
            anonymousClass40Q.f48214C.setContentDescription(context.getString(C0164R.string.view_video_tags_text));
            anonymousClass40Q.f48214C.setVisibility(0);
            if (anonymousClass40Q.f48215D.IB == AnonymousClass3OO.NOT_ANIMATED) {
                Rect rect = new Rect();
                anonymousClass40Q.f48217F.getHitRect(rect);
                anonymousClass40Q.f48217F.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass3OH(anonymousClass40Q, rect));
            }
        } else {
            if (anonymousClass40Q.f48219H == null) {
                anonymousClass40Q.f48219H = (TextView) anonymousClass40Q.f48214C.findViewById(C0164R.id.row_feed_video_indicator_tag_count_text);
            }
            anonymousClass40Q.f48219H.setText(AnonymousClass1YC.C(i, context.getResources()));
            anonymousClass40Q.f48219H.setVisibility(0);
            anonymousClass40Q.f48217F.B();
            anonymousClass40Q.f48217F.setVisibility(0);
            anonymousClass40Q.f48214C.setContentDescription(context.getString(C0164R.string.edit_video_tags_text));
            anonymousClass40Q.f48214C.setVisibility(0);
        }
    }

    /* renamed from: C */
    public static AnonymousClass40Q m19512C(View view) {
        return new AnonymousClass40Q((ViewStub) view.findViewById(C0164R.id.row_feed_video_indicator_view_stub));
    }
}
