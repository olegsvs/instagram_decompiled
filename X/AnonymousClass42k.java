package X;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;

/* renamed from: X.42k */
public final class AnonymousClass42k implements OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, OnVideoSizeChangedListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1hc f48840B;

    public AnonymousClass42k(AnonymousClass1hc anonymousClass1hc) {
        this.f48840B = anonymousClass1hc;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f48840B.f20546D != null) {
            this.f48840B.f20546D.Sh(this.f48840B);
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        AnonymousClass0Dc.H("SystemMediaPlayer", "onError() what: %d, extra: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        if (this.f48840B.f20550H != null) {
            AnonymousClass0v0 anonymousClass0v0 = this.f48840B.f20550H;
            AnonymousClass1c0 anonymousClass1c0 = this.f48840B;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SystemMediaPlayer Error: ");
            stringBuilder.append(i);
            String stringBuilder2 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append("Extra: ");
            stringBuilder.append(i2);
            anonymousClass0v0.mk(anonymousClass1c0, stringBuilder2, stringBuilder.toString());
        }
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 700) {
            Integer.valueOf(i2);
        } else {
            Integer.valueOf(i);
            Integer.valueOf(i2);
        }
        return false;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        AnonymousClass1hc anonymousClass1hc = this.f48840B;
        anonymousClass1hc.f21532B = anonymousClass1hc.f21533C.getDuration();
        Integer.valueOf(this.f48840B.f21532B);
        if (this.f48840B.f20552J != null) {
            this.f48840B.f20552J.fu(this.f48840B, -1);
        }
    }

    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.f48840B.f20553K != null) {
            this.f48840B.f20553K.Mz(this.f48840B);
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        Integer.valueOf(i);
        Integer.valueOf(i2);
        if (!(this.f48840B.f21535E == i || this.f48840B.f21534D == i2 || this.f48840B.f20556N == null)) {
            this.f48840B.f20556N.IGA(this.f48840B, i, i2);
        }
        this.f48840B.f21535E = i;
        this.f48840B.f21534D = i2;
    }
}
