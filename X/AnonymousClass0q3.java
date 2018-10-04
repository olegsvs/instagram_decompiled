package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.0q3 */
public final class AnonymousClass0q3 implements AnonymousClass0je {
    /* renamed from: B */
    public TextView f10852B;
    /* renamed from: C */
    public ColorFilterAlphaImageView f10853C;
    /* renamed from: D */
    public ViewStub f10854D;
    /* renamed from: E */
    public AnonymousClass0zh f10855E;
    /* renamed from: F */
    public AnonymousClass0P7 f10856F;
    /* renamed from: G */
    public AnonymousClass0m3 f10857G;
    /* renamed from: H */
    public TextView f10858H;
    /* renamed from: I */
    public ViewStub f10859I;
    /* renamed from: J */
    public View f10860J;
    /* renamed from: K */
    public View f10861K;

    public AnonymousClass0q3(View view, View view2, TextView textView, ViewStub viewStub, ViewStub viewStub2) {
        this.f10861K = view;
        this.f10860J = view2;
        this.f10852B = textView;
        this.f10859I = viewStub;
        this.f10854D = viewStub2;
        this.f10852B.getPaint().setFakeBoldText(true);
    }

    /* renamed from: A */
    public final TextView m7904A() {
        if (this.f10858H == null) {
            this.f10858H = (TextView) this.f10859I.inflate();
        }
        return this.f10858H;
    }

    public final void cr(AnonymousClass0m3 anonymousClass0m3, int i) {
        if (i == 5) {
            AnonymousClass0pU.m7865D(this, anonymousClass0m3.f9668C, anonymousClass0m3.f9669D ^ 1);
        } else if (i == 4) {
            TextView textView = this.f10852B;
            textView.setText(AnonymousClass0Gk.m1855G(textView.getContext(), this.f10856F, anonymousClass0m3.f9672G));
            Context context = this.f10861K.getContext();
            AnonymousClass0pU.m7866E(this, AnonymousClass0Gk.m1856H(context, this.f10856F, anonymousClass0m3, AnonymousClass0vv.m8374B(this.f10856F, this.f10857G.f9672G, context)));
        } else if (i == 15 && this.f10857G.f9668C) {
            int i2 = this.f10857G.AB;
            int i3 = this.f10857G.f9679N;
            this.f10861K.setBackgroundColor(((Integer) AnonymousClass0pU.f10635G.evaluate(this.f10857G.f9676K, Integer.valueOf(AnonymousClass0pU.m7863B(this.f10855E, this.f10856F, i2)), Integer.valueOf(AnonymousClass0pU.m7863B(this.f10855E, this.f10856F, i3)))).intValue());
        }
    }
}
