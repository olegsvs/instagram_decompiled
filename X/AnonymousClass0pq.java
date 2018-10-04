package X;

import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.model.venue.Venue;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.0pq */
public final class AnonymousClass0pq {
    /* renamed from: B */
    public static SpannableStringBuilder m7880B(SpannableStringBuilder spannableStringBuilder, AnonymousClass0P7 anonymousClass0P7, String str, int i, int i2, AnonymousClass0jy anonymousClass0jy) {
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
        AnonymousClass19s anonymousClass19s = new AnonymousClass19s(anonymousClass0jy, anonymousClass0P7, i2, i);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(str);
        spannableStringBuilder.setSpan(anonymousClass19s, length2, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: C */
    public static void m7881C(AnonymousClass0MI anonymousClass0MI, GradientSpinner gradientSpinner, boolean z) {
        if (anonymousClass0MI == null || z) {
            gradientSpinner.setVisibility(4);
            return;
        }
        gradientSpinner.setVisibility(0);
        if (anonymousClass0MI.m3117I()) {
            gradientSpinner.setGradientColors(C0164R.style.CloseFriendsGradientPatternStyle);
        } else {
            gradientSpinner.setGradientColors(C0164R.style.GradientPatternStyle);
        }
        gradientSpinner.m7816B();
    }

    /* renamed from: D */
    public static void m7882D(AnonymousClass0jy anonymousClass0jy, AnonymousClass0P7 anonymousClass0P7, TextView textView, TextView textView2, boolean z, boolean z2, Venue venue, SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5, int i6) {
        View view = textView2;
        if (z) {
            z = spannableStringBuilder;
            String spannableStringBuilder2 = z.toString();
            String str = venue.f6716M;
            TextView textView3 = textView;
            float width = (float) textView.getWidth();
            TextPaint paint = textView.getPaint();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(spannableStringBuilder2);
            stringBuilder.append(" • ");
            stringBuilder.append(str);
            textView = i2;
            AnonymousClass0P7 anonymousClass0P72 = anonymousClass0P7;
            AnonymousClass0jy anonymousClass0jy2 = anonymousClass0jy;
            anonymousClass0P7 = i;
            if ((width < paint.measureText(stringBuilder.toString()) ? 1 : null) != null) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.setMargins(i3, i4, i5, i6);
                view.setLayoutParams(layoutParams);
                view.setVisibility(0);
                view.setText(AnonymousClass0pq.m7880B(new SpannableStringBuilder(), anonymousClass0P72, venue.f6716M, anonymousClass0P7, textView, anonymousClass0jy2));
                if (z2) {
                    view.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
                return;
            }
            AnonymousClass0Nm.m3436O(view);
            AnonymousClass0pq.m7880B(z, anonymousClass0P72, venue.f6716M, anonymousClass0P7, textView, anonymousClass0jy);
            textView3.setText(z);
            return;
        }
        AnonymousClass0Nm.m3436O(textView2);
    }

    /* renamed from: E */
    public static StringBuilder m7883E(AnonymousClass0P7 anonymousClass0P7) {
        StringBuilder stringBuilder = new StringBuilder();
        if (anonymousClass0P7.eY() && anonymousClass0P7.DB()) {
            stringBuilder.append(anonymousClass0P7.m3752H());
        } else if (anonymousClass0P7.eY() && AnonymousClass0Gk.m1867S(anonymousClass0P7)) {
            stringBuilder.append(anonymousClass0P7.MA().m1003T());
        } else {
            stringBuilder.append(anonymousClass0P7.MA().uT());
        }
        return stringBuilder;
    }

    /* renamed from: F */
    public static AnonymousClass0MI m7884F(AnonymousClass0m3 anonymousClass0m3, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci) {
        Object obj;
        anonymousClass0m3 = anonymousClass0m3.f9715x;
        if (!(anonymousClass0m3 == AnonymousClass0a4.MAIN_FEED || anonymousClass0m3 == AnonymousClass0a4.EXPLORE_FEED || anonymousClass0m3 == AnonymousClass0a4.HASHTAG_PAGE)) {
            if (anonymousClass0m3 != AnonymousClass0a4.SINGLE_MEDIA_FEED) {
                obj = null;
                return obj == null ? AnonymousClass0Jd.f2931B.mo644R(anonymousClass0Cm, anonymousClass0Ci, anonymousClass0Ci.fB) : null;
            }
        }
        obj = 1;
        if (obj == null) {
        }
    }

    /* renamed from: G */
    public static void m7885G(AnonymousClass0pK anonymousClass0pK, ViewGroup viewGroup, TextView textView, Rect rect) {
        if (textView != null) {
            if (rect != null) {
                textView.getHitRect(rect);
                rect.bottom = viewGroup.getHeight();
                anonymousClass0pK.f10575B.add(new TouchDelegate(rect, textView));
            }
        }
    }

    /* renamed from: H */
    public static void m7886H(ViewGroup viewGroup, TextView textView, TextView textView2, TextView textView3, Rect rect, Rect rect2, Rect rect3, boolean z, boolean z2) {
        viewGroup.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass19t(viewGroup, textView, rect, z, textView2, rect2, z2, textView3, rect3));
    }
}
