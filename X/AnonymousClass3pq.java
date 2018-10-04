package X;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.view.KeyEvent;
import com.facebook.forker.Process;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.3pq */
public final class AnonymousClass3pq implements OnAudioFocusChangeListener {
    /* renamed from: B */
    public final AudioManager f45060B;
    /* renamed from: C */
    public AnonymousClass3ph f45061C;
    /* renamed from: D */
    public AnonymousClass0uz f45062D;
    /* renamed from: E */
    public boolean f45063E;
    /* renamed from: F */
    private final AnonymousClass42m f45064F;

    public AnonymousClass3pq(Context context, AnonymousClass42m anonymousClass42m, AnonymousClass3ph anonymousClass3ph) {
        this.f45060B = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.f45064F = anonymousClass42m;
        this.f45061C = anonymousClass3ph;
    }

    /* renamed from: A */
    public final void m20842A(int i) {
        AnonymousClass0fo.f7997C.A(false);
        m20841B(0.0f, i);
        this.f45060B.abandonAudioFocus(this);
    }

    /* renamed from: B */
    private void m20841B(float f, int i) {
        AnonymousClass3ph anonymousClass3ph = this.f45061C;
        if (anonymousClass3ph != null) {
            AnonymousClass0Sy.C();
            AnonymousClass1mY.m13011B(anonymousClass3ph.f45005F ^ 1);
            Float.valueOf(f);
            anonymousClass3ph.f45007H.m20869L(f, i);
        }
        AnonymousClass0uz anonymousClass0uz = this.f45062D;
        if (anonymousClass0uz != null) {
            anonymousClass0uz.f11964B = Float.compare(f, 0.0f) != 0;
        }
    }

    /* renamed from: B */
    public final boolean m20843B(int i, KeyEvent keyEvent) {
        boolean z = false;
        if (!(this.f45061C == null || this.f45062D == null || keyEvent.getAction() != 0)) {
            if (i == 25 || i == 24) {
                this.f45063E = true;
                this.f45060B.adjustStreamVolume(3, i == 24 ? 1 : -1, 8);
                int streamVolume = this.f45060B.getStreamVolume(3);
                this.f45064F.f48841B.f45002C.OGA(streamVolume, this.f45060B.getStreamMaxVolume(3));
                if (streamVolume > 0) {
                    z = true;
                }
                if (this.f45062D.f11964B) {
                    if (!z) {
                        m20842A(i);
                    }
                } else if (z) {
                    m20844C(i);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final void m20844C(int i) {
        AnonymousClass0fo.f7997C.A(true);
        m20841B(1.0f, i);
        this.f45060B.requestAudioFocus(this, 3, 4);
    }

    public final void onAudioFocusChange(int i) {
        switch (i) {
            case Process.SD_BLACK_HOLE /*-3*/:
                m20841B(0.5f, 0);
                return;
            case -2:
                break;
            case -1:
                this.f45060B.abandonAudioFocus(this);
                break;
            case 0:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
                m20841B(1.0f, 0);
                return;
            default:
                return;
        }
        m20841B(0.0f, 0);
    }
}
