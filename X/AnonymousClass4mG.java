package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.direct.voice.VoiceVisualizer;

/* renamed from: X.4mG */
public final class AnonymousClass4mG implements AnonymousClass1Tn {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5X7 f57131B;

    public AnonymousClass4mG(AnonymousClass5X7 anonymousClass5X7) {
        this.f57131B = anonymousClass5X7;
    }

    public final void Lo(View view) {
        ((TextView) view.findViewById(C0164R.id.direct_voice_messaging_composer_timer)).setText(AnonymousClass0dw.E(0));
        this.f57131B.f65763N = (VoiceVisualizer) view.findViewById(C0164R.id.direct_voice_messaging_visualizer);
        this.f57131B.f65760K = (ImageView) view.findViewById(C0164R.id.direct_voice_messaging_composer_trash_can);
        this.f57131B.f65764O = view.findViewById(C0164R.id.direct_voice_messaging_visualizer_container);
        this.f57131B.f65755F = (TextView) view.findViewById(C0164R.id.direct_voice_messaging_instructions_text_view);
        view.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass4mF(this, view));
    }
}
