package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.2Uw */
public class AnonymousClass2Uw extends AnonymousClass25x {
    /* renamed from: D */
    public static final int f30969D = Color.argb(255, 232, 255, 186);
    /* renamed from: E */
    public static final Typeface f30970E = Typeface.create("sans-serif-light", 0);
    /* renamed from: F */
    public static final Typeface f30971F = Typeface.create("sans-serif-medium", 0);
    /* renamed from: B */
    private final Drawable f30972B = new ShapeDrawable(new OvalShape());
    /* renamed from: C */
    private final Context f30973C;

    /* renamed from: S */
    public final void mo3236S(AnonymousClass0oo anonymousClass0oo, AnonymousClass262 anonymousClass262) {
    }

    public AnonymousClass2Uw(Context context) {
        this.f30973C = context;
    }

    /* renamed from: P */
    public void mo3233P(AnonymousClass0oo anonymousClass0oo, AnonymousClass25z anonymousClass25z) {
        ((AnonymousClass261) anonymousClass0oo).f25899B.setText(AnonymousClass25z.f25896C[anonymousClass25z.f25897B]);
    }

    /* renamed from: Q */
    public void mo3234Q(AnonymousClass0oo anonymousClass0oo, AnonymousClass25y anonymousClass25y, List list) {
        TextView textView = ((AnonymousClass261) anonymousClass0oo).f25899B;
        textView.setBackgroundColor(-1);
        textView.setTextColor(-16777216);
        textView.setText(anonymousClass25y.f25895C);
        textView.setGravity(17);
        if (list != null) {
            this.f30972B.mutate().setColorFilter(AnonymousClass0ca.B(f30969D));
            textView.setBackgroundDrawable(this.f30972B);
            return;
        }
        textView.setBackgroundDrawable(null);
    }

    /* renamed from: R */
    public final void mo3235R(AnonymousClass0oo anonymousClass0oo, AnonymousClass260 anonymousClass260) {
        ((AnonymousClass261) anonymousClass0oo).f25899B.setText(anonymousClass260.f25898B);
    }

    /* renamed from: T */
    public AnonymousClass0oo mo3237T(ViewGroup viewGroup) {
        TextView textView = new TextView(viewGroup.getContext());
        textView.setTextColor(-16777216);
        textView.setGravity(17);
        textView.setTextSize(1, 12.0f);
        return new AnonymousClass261(textView);
    }

    /* renamed from: U */
    public AnonymousClass0oo mo3238U(ViewGroup viewGroup) {
        TextView textView = new TextView(viewGroup.getContext());
        int J = AnonymousClass0Nm.J(this.f30973C) / 7;
        int Y = m16080Y(2);
        J -= Y * 2;
        LayoutParams marginLayoutParams = new MarginLayoutParams(J, J);
        marginLayoutParams.setMargins(Y, Y, Y, Y);
        textView.setLayoutParams(marginLayoutParams);
        textView.setTypeface(f30970E);
        textView.setTextColor(-16777216);
        textView.setGravity(17);
        textView.setTextSize(2, 16.0f);
        return new AnonymousClass261(textView);
    }

    /* renamed from: V */
    public AnonymousClass0oo mo3239V(ViewGroup viewGroup) {
        TextView textView = new TextView(viewGroup.getContext());
        textView.setTypeface(f30970E);
        textView.setTextColor(-16777216);
        textView.setTextSize(1, 28.0f);
        textView.setPadding(m16080Y(16), m16080Y(32), 0, m16080Y(8));
        return new AnonymousClass261(textView);
    }

    /* renamed from: W */
    public final AnonymousClass0oo mo3240W(ViewGroup viewGroup) {
        TextView textView = new TextView(viewGroup.getContext());
        textView.setBackgroundColor(Color.argb(0, 0, 0, 0));
        return new AnonymousClass261(textView);
    }

    /* renamed from: Y */
    public final int m16080Y(int i) {
        return (int) AnonymousClass0Nm.C(this.f30973C, i);
    }
}
