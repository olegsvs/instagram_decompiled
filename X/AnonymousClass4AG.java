package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.facebook.C0164R;
import java.util.Random;

/* renamed from: X.4AG */
public final class AnonymousClass4AG implements AnonymousClass2HV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4AH f51061B;

    public AnonymousClass4AG(AnonymousClass4AH anonymousClass4AH) {
        this.f51061B = anonymousClass4AH;
    }

    public final void zu(AnonymousClass14H anonymousClass14H, float f) {
        if (f > 0.6f) {
            AnonymousClass4AG anonymousClass4AG = this;
            if (!this.f51061B.f51062B.f51071E) {
                int size;
                double d;
                double d2;
                this.f51061B.f51062B.f51071E = true;
                AnonymousClass4AI anonymousClass4AI = this.f51061B.f51062B;
                if (anonymousClass4AI.f51074H == null) {
                    AnonymousClass31S anonymousClass31S = new AnonymousClass31S(anonymousClass4AI.f51070D, 50, new int[]{C0164R.drawable.confetti_glyph, C0164R.drawable.confetti_party}, 2000);
                    float B = AnonymousClass0Nm.B(anonymousClass31S.f37082F.getContext(), 0.06f);
                    float B2 = AnonymousClass0Nm.B(anonymousClass31S.f37082F.getContext(), 0.1f);
                    int size2 = anonymousClass31S.f37083G.size();
                    for (int i = 0; i < size2; i++) {
                        AnonymousClass31Q anonymousClass31Q = (AnonymousClass31Q) anonymousClass31S.f37083G.get(i);
                        anonymousClass31Q.f37074O = B;
                        anonymousClass31Q.f37073N = B2;
                    }
                    size = anonymousClass31S.f37083G.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        AnonymousClass31Q anonymousClass31Q2 = (AnonymousClass31Q) anonymousClass31S.f37083G.get(i2);
                        B = AnonymousClass0Nm.B(anonymousClass31S.f37082F.getContext(), 7.0E-6f);
                        d = (double) 90;
                        Double.isNaN(d);
                        double d3 = (double) B;
                        d2 = (double) ((float) ((d * 3.141592653589793d) / 180.0d));
                        d = Math.cos(d2);
                        Double.isNaN(d3);
                        anonymousClass31Q2.f37061B = (float) (d * d3);
                        d = Math.sin(d2);
                        Double.isNaN(d3);
                        anonymousClass31Q2.f37062C = (float) (d3 * d);
                    }
                    int size3 = anonymousClass31S.f37083G.size();
                    for (size2 = 0; size2 < size3; size2++) {
                        ((AnonymousClass31Q) anonymousClass31S.f37083G.get(size2)).f37067H = 2000;
                    }
                    anonymousClass4AI.f51074H = anonymousClass31S;
                }
                AnonymousClass31S anonymousClass31S2 = anonymousClass4AI.f51074H;
                View view = anonymousClass4AI.f51070D;
                TimeInterpolator decelerateInterpolator = new DecelerateInterpolator();
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int i3 = 0;
                int width = (iArr[0] + (view.getWidth() / 2)) - anonymousClass31S2.f37081E[0];
                int height = (iArr[1] + (view.getHeight() / 2)) - anonymousClass31S2.f37081E[1];
                size = anonymousClass31S2.f37083G.size();
                while (i3 < size) {
                    AnonymousClass31Q anonymousClass31Q3 = (AnonymousClass31Q) anonymousClass31S2.f37083G.get(i3);
                    Random random = anonymousClass31S2.f37084H;
                    anonymousClass31Q3.f37069J = width - (anonymousClass31Q3.f37068I.getWidth() / 2);
                    anonymousClass31Q3.f37070K = height - (anonymousClass31Q3.f37068I.getHeight() / 2);
                    anonymousClass31Q3.f37064E = (float) anonymousClass31Q3.f37069J;
                    anonymousClass31Q3.f37065F = (float) anonymousClass31Q3.f37070K;
                    anonymousClass31Q3.f37063D = 255;
                    float nextFloat = random.nextFloat();
                    float f2 = anonymousClass31Q3.f37073N;
                    float f3 = anonymousClass31Q3.f37074O;
                    nextFloat = (nextFloat * (f2 - f3)) + f3;
                    d = (double) random.nextInt(360);
                    Double.isNaN(d);
                    double d4 = (double) nextFloat;
                    d2 = (double) ((float) ((d * 3.141592653589793d) / 180.0d));
                    d = Math.cos(d2);
                    Double.isNaN(d4);
                    anonymousClass31Q3.f37075P = (float) (d * d4);
                    d = Math.sin(d2);
                    Double.isNaN(d4);
                    anonymousClass31Q3.f37076Q = (float) (d4 * d);
                    i3++;
                }
                anonymousClass31S2.f37079C = new AnonymousClass31R(anonymousClass31S2, anonymousClass31S2.f37082F.getContext(), anonymousClass31S2.f37083G);
                anonymousClass31S2.f37082F.addView(anonymousClass31S2.f37079C);
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) anonymousClass31S2.f37080D});
                anonymousClass31S2.f37078B = ofInt;
                ofInt.setDuration(r3);
                anonymousClass31S2.f37078B.addUpdateListener(new AnonymousClass31O(anonymousClass31S2));
                anonymousClass31S2.f37078B.addListener(new AnonymousClass31P(anonymousClass31S2));
                anonymousClass31S2.f37078B.setInterpolator(decelerateInterpolator);
                anonymousClass31S2.f37078B.start();
                anonymousClass4AG.f51061B.f51062B.f51070D.setVisibility(4);
            }
        }
    }
}
