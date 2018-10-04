package X;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.facebook.C0164R;
import com.instagram.igtv.viewer.IGTVViewerFragment;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4vp */
public final class AnonymousClass4vp extends AnonymousClass0VA implements OnAudioFocusChangeListener, OnKeyListener {
    /* renamed from: B */
    public int f58566B;
    /* renamed from: C */
    public float f58567C;
    /* renamed from: D */
    public boolean f58568D;
    /* renamed from: E */
    public boolean f58569E;
    /* renamed from: F */
    private final AudioManager f58570F;
    /* renamed from: G */
    private final Context f58571G;
    /* renamed from: H */
    private final IGTVViewerFragment f58572H;
    /* renamed from: I */
    private final AnonymousClass0Cm f58573I;

    public AnonymousClass4vp(Activity activity, IGTVViewerFragment iGTVViewerFragment, AnonymousClass0Cm anonymousClass0Cm) {
        this.f58571G = activity.getApplicationContext();
        this.f58570F = (AudioManager) activity.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.f58572H = iGTVViewerFragment;
        this.f58573I = anonymousClass0Cm;
    }

    /* renamed from: B */
    private boolean m25413B() {
        if (!((Boolean) AnonymousClass0CC.XO.H(this.f58573I)).booleanValue()) {
            if (!AnonymousClass0EF.L(this.f58571G) || !((Boolean) AnonymousClass0CC.WO.H(this.f58573I)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    private void m25414C() {
        int requestAudioFocus = this.f58570F.requestAudioFocus(this, 3, 2);
        this.f58566B = requestAudioFocus;
        boolean z = true;
        if (requestAudioFocus != 1) {
            z = false;
        }
        this.f58568D = z;
    }

    public final void St() {
        this.f58570F.abandonAudioFocus(this);
        this.f58567C = 0.0f;
    }

    public final void gx() {
        m25414C();
        if (m25413B() || this.f58570F.isWiredHeadsetOn() || AnonymousClass0fo.f7997C.B(false)) {
            this.f58567C = 1.0f;
        }
    }

    public final void onAudioFocusChange(int i) {
        if (i == -2) {
            this.f58567C = 0.0f;
        } else if (i == -3) {
            this.f58567C = 0.5f;
        } else {
            if (!(i == 1 || i == 2 || i == 4)) {
                if (i != 3) {
                    if (i == -1) {
                        this.f58567C = 0.0f;
                        this.f58568D = false;
                        this.f58570F.abandonAudioFocus(this);
                        return;
                    }
                    return;
                }
            }
            this.f58567C = 1.0f;
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent.getAction() != 0 || (i != 25 && i != 24)) {
            return false;
        }
        this.f58569E = true;
        if (!this.f58568D) {
            m25414C();
        }
        if (this.f58568D) {
            this.f58567C = 1.0f;
        }
        this.f58570F.adjustStreamVolume(3, i == 24 ? 1 : -1, 0);
        IGTVViewerFragment iGTVViewerFragment = this.f58572H;
        if (iGTVViewerFragment != null) {
            iGTVViewerFragment.mVolumeIndicator.m26247A(this.f58570F.getStreamVolume(3), this.f58570F.getStreamMaxVolume(3));
        }
        if (!m25413B()) {
            if (this.f58570F.getStreamVolume(3) > 0) {
                z = true;
            }
            AnonymousClass0fo.f7997C.A(z);
        }
        return true;
    }

    public final void wh(View view) {
        View findViewById = view.findViewById(C0164R.id.root_container);
        findViewById.requestFocus();
        findViewById.setOnKeyListener(this);
    }
}
