package X;

import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.5M9 */
public final class AnonymousClass5M9 {
    /* renamed from: B */
    public static int f62508B;

    /* renamed from: B */
    public static void m26316B(AnonymousClass5aX anonymousClass5aX, AnonymousClass5ai anonymousClass5ai, String str) {
        anonymousClass5aX.f62481E.setText(anonymousClass5ai.f4910d);
        anonymousClass5aX.f62480D.setText(str);
        anonymousClass5aX.f62481E.setVisibility(0);
        anonymousClass5aX.f62480D.setVisibility(0);
        anonymousClass5aX.f62481E.setTypeface(Typeface.DEFAULT);
    }

    /* renamed from: C */
    public static void m26317C(AnonymousClass5aX anonymousClass5aX, AnonymousClass5ai anonymousClass5ai, boolean z, AnonymousClass67B anonymousClass67B) {
        if (!z || anonymousClass5ai.lN() != AnonymousClass5NW.SingleUserJoined || anonymousClass5ai.f66737C != 1 || !((Boolean) AnonymousClass0CC.SS.G()).booleanValue()) {
            return;
        }
        if (anonymousClass5ai.f66736B == 0) {
            ((CircularImageView) anonymousClass5aX.f66633C.A()).setUrl(AnonymousClass2Hj.B("👋"));
            ((CircularImageView) anonymousClass5aX.f66633C.A()).setVisibility(0);
            AnonymousClass5M9.m26316B(anonymousClass5aX, anonymousClass5ai, anonymousClass5aX.f62480D.getResources().getString(C0164R.string.live_wave_broadcaster_success_text, new Object[]{anonymousClass5ai.pT().uT()}));
            if (anonymousClass5aX.f66632B.B()) {
                anonymousClass5aX.f66632B.A().setVisibility(8);
            }
            if (anonymousClass5aX.f66634D.B()) {
                anonymousClass5aX.f66632B.A().setVisibility(8);
                return;
            }
            return;
        }
        View A = anonymousClass5aX.f66632B.A();
        TextView textView = (TextView) A.findViewById(C0164R.id.iglive_comment_wave_button);
        textView.setText(textView.getResources().getString(C0164R.string.live_wave_button_text_with_emoji, new Object[]{"👋"}));
        A.setVisibility(0);
        A.setOnClickListener(new AnonymousClass5M5(A, anonymousClass5ai, anonymousClass67B, anonymousClass5aX));
        int i = 0;
        anonymousClass5aX.f62485I.measure(MeasureSpec.makeMeasureSpec(anonymousClass5aX.f62484H, 1073741824), 0);
        int measuredWidth = A.getMeasuredWidth();
        if (f62508B == 0) {
            CharSequence text = anonymousClass5aX.f62480D.getText();
            anonymousClass5aX.f62480D.setText(JsonProperty.USE_DEFAULT_NAME);
            anonymousClass5aX.f62478B.measure(0, 0);
            f62508B = A.getMeasuredWidth();
            anonymousClass5aX.f62480D.setText(text);
        }
        if (f62508B != measuredWidth) {
            i = 1;
        }
        if (i != 0) {
            anonymousClass5aX.f62480D.setSingleLine(true);
            anonymousClass5aX.f62480D.setEllipsize(TruncateAt.END);
            LayoutParams layoutParams = (LayoutParams) anonymousClass5aX.f62479C.getLayoutParams();
            layoutParams.weight = 1.0f;
            layoutParams.width = 0;
            anonymousClass5aX.f62479C.setLayoutParams(layoutParams);
        }
    }
}
