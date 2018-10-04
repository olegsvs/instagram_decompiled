package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.C0164R;

/* renamed from: X.67G */
public final class AnonymousClass67G {
    /* renamed from: B */
    public ImageView f71942B;
    /* renamed from: C */
    public boolean f71943C;
    /* renamed from: D */
    public AnonymousClass3ig f71944D;
    /* renamed from: E */
    public Dialog f71945E;
    /* renamed from: F */
    private final AnonymousClass6Fy f71946F;
    /* renamed from: G */
    private boolean f71947G;
    /* renamed from: H */
    private Context f71948H;
    /* renamed from: I */
    private AnonymousClass5aa f71949I;

    public AnonymousClass67G(View view, AnonymousClass6Fy anonymousClass6Fy, AnonymousClass5aa anonymousClass5aa) {
        this.f71946F = anonymousClass6Fy;
        this.f71949I = anonymousClass5aa;
        this.f71948H = view.getContext();
        this.f71942B = (ImageView) view.findViewById(C0164R.id.audio_button);
        AnonymousClass15z anonymousClass15z = new AnonymousClass15z(this.f71942B);
        anonymousClass15z.f14385E = new AnonymousClass67E(this);
        anonymousClass15z.A();
        this.f71944D = AnonymousClass3ig.B(view, C0164R.id.iglive_capture_audio_only_stub);
    }

    /* renamed from: A */
    public final void m29088A() {
        AnonymousClass67G.m29087B(this, false);
        m29091D(false);
        AnonymousClass14H.E(false, new View[]{this.f71942B});
    }

    /* renamed from: B */
    public final void m29089B() {
        AnonymousClass14H.H(false, new View[]{this.f71942B});
    }

    /* renamed from: B */
    public static void m29087B(AnonymousClass67G anonymousClass67G, boolean z) {
        if (anonymousClass67G.f71947G != z) {
            anonymousClass67G.f71947G = z;
            AnonymousClass5aa anonymousClass5aa = anonymousClass67G.f71949I;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("toggleAudioOnly: ");
            stringBuilder.append(anonymousClass67G.f71947G);
            anonymousClass5aa.m27739C(stringBuilder.toString());
            anonymousClass67G.f71949I.f66675T = z;
            if (anonymousClass67G.f71947G) {
                if (!anonymousClass67G.f71944D.B()) {
                    AnonymousClass15z anonymousClass15z = new AnonymousClass15z(anonymousClass67G.f71944D.A().findViewById(C0164R.id.audio_only_off_button));
                    anonymousClass15z.f14385E = new AnonymousClass67F(anonymousClass67G);
                    anonymousClass15z.A();
                }
                AnonymousClass14H.H(true, new View[]{anonymousClass67G.f71944D.A()});
                AnonymousClass14H.E(true, new View[]{anonymousClass67G.f71942B});
            } else {
                AnonymousClass14H.E(true, new View[]{anonymousClass67G.f71944D.A()});
                AnonymousClass14H.H(true, new View[]{anonymousClass67G.f71942B});
            }
            AnonymousClass6Fy anonymousClass6Fy = anonymousClass67G.f71946F;
            if (z && anonymousClass6Fy.f73527e == AnonymousClass5NT.STARTED) {
                anonymousClass6Fy.m29666G(AnonymousClass5NT.STARTED_AUDIO_ONLY);
            } else if (!z && anonymousClass6Fy.f73527e == AnonymousClass5NT.STARTED_AUDIO_ONLY) {
                anonymousClass6Fy.m29666G(AnonymousClass5NT.STARTED);
            }
        }
    }

    /* renamed from: C */
    public final void m29090C() {
        if (this.f71945E == null) {
            Dialog C = new AnonymousClass0Sb(this.f71948H).I(this.f71948H.getResources().getString(C0164R.string.live_broadcast_audio_only_switch_prompt)).G(new CharSequence[]{this.f71948H.getResources().getString(C0164R.string.no), this.f71948H.getResources().getString(C0164R.string.yes)}, new AnonymousClass67D(this)).E(true).F(true).C();
            this.f71945E = C;
            C.show();
        }
    }

    /* renamed from: D */
    public final void m29091D(boolean z) {
        if (z != this.f71943C) {
            this.f71943C = z;
            AnonymousClass5aa anonymousClass5aa = this.f71949I;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("toggleAudioMute: ");
            stringBuilder.append(this.f71943C);
            anonymousClass5aa.m27739C(stringBuilder.toString());
            this.f71949I.f66674S = z;
            this.f71942B.setImageResource(this.f71943C ? C0164R.drawable.microphone_off : C0164R.drawable.microphone_on);
            AnonymousClass68O anonymousClass68O = this.f71946F.f73529g;
            anonymousClass68O.f72102R = z;
            AnonymousClass5OB anonymousClass5OB = anonymousClass68O.f72091G;
            if (anonymousClass5OB != null) {
                anonymousClass5OB.lMA(z);
            }
        }
    }
}
