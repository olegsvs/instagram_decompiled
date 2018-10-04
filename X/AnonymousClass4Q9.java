package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.facebook.C0164R;
import com.instagram.ui.widget.volume.VolumeIndicator;
import java.util.HashSet;
import java.util.Set;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4Q9 */
public final class AnonymousClass4Q9 implements OnKeyListener {
    /* renamed from: B */
    public final AudioManager f53856B;
    /* renamed from: C */
    public final Set f53857C = new HashSet();
    /* renamed from: D */
    public final VolumeIndicator f53858D;

    public AnonymousClass4Q9(Context context, View view) {
        this.f53856B = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.f53858D = (VolumeIndicator) view.findViewById(C0164R.id.camera_volume_indicator);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        Object obj;
        if (i != 25) {
            if (i != 24) {
                obj = null;
                if (obj != null) {
                    for (AnonymousClass0eB S : this.f53857C) {
                        if (S.S()) {
                            this.f53856B.adjustStreamVolume(3, i != 24 ? 1 : -1, 8);
                            this.f53858D.A(this.f53856B.getStreamVolume(3), this.f53856B.getStreamMaxVolume(3));
                            return true;
                        }
                    }
                    for (AnonymousClass0eB S2 : this.f53857C) {
                        if (S2.P(view, i, keyEvent)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        obj = 1;
        if (obj != null) {
            while (r1.hasNext()) {
                if (S2.S()) {
                    if (i != 24) {
                    }
                    this.f53856B.adjustStreamVolume(3, i != 24 ? 1 : -1, 8);
                    this.f53858D.A(this.f53856B.getStreamVolume(3), this.f53856B.getStreamMaxVolume(3));
                    return true;
                }
            }
            while (r1.hasNext()) {
                if (S2.P(view, i, keyEvent)) {
                    return true;
                }
            }
        }
        return false;
    }
}
