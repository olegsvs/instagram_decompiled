package X;

import android.media.AudioManager.OnAudioFocusChangeListener;
import com.facebook.forker.Process;

/* renamed from: X.2gE */
public final class AnonymousClass2gE implements OnAudioFocusChangeListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2gF f32342B;

    public AnonymousClass2gE(AnonymousClass2gF anonymousClass2gF) {
        this.f32342B = anonymousClass2gF;
    }

    public final void onAudioFocusChange(int i) {
        if (i != 1) {
            switch (i) {
                case Process.SD_BLACK_HOLE /*-3*/:
                case -2:
                    this.f32342B.m16877C();
                    return;
                case -1:
                    this.f32342B.m16879E();
                    return;
                default:
                    return;
            }
        }
        AnonymousClass2gF anonymousClass2gF = this.f32342B;
        anonymousClass2gF.m16878D(anonymousClass2gF.m16876A(), this.f32342B.f32349H);
    }
}
