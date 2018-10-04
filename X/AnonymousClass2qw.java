package X;

import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;

/* renamed from: X.2qw */
public class AnonymousClass2qw {
    /* renamed from: B */
    public AudioTrack f34907B;
    /* renamed from: C */
    public long f34908C;
    /* renamed from: D */
    public long f34909D;
    /* renamed from: E */
    public long f34910E;
    /* renamed from: F */
    private long f34911F;
    /* renamed from: G */
    private boolean f34912G;
    /* renamed from: H */
    private long f34913H;
    /* renamed from: I */
    private long f34914I;
    /* renamed from: J */
    private int f34915J;

    /* renamed from: C */
    public float mo5177C() {
        return 1.0f;
    }

    /* renamed from: I */
    public boolean mo4369I() {
        return false;
    }

    /* renamed from: A */
    public final long m17471A() {
        if (this.f34910E != -1) {
            return Math.min(this.f34908C, this.f34909D + ((((SystemClock.elapsedRealtime() * 1000) - this.f34910E) * ((long) this.f34915J)) / 1000000));
        }
        int playState = this.f34907B.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f34907B.getPlaybackHeadPosition());
        if (this.f34912G) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f34913H = this.f34911F;
            }
            playbackHeadPosition += this.f34913H;
        }
        if (this.f34911F > playbackHeadPosition) {
            this.f34914I++;
        }
        this.f34911F = playbackHeadPosition;
        return playbackHeadPosition + (this.f34914I << 32);
    }

    /* renamed from: B */
    public final long m17472B() {
        return (m17471A() * 1000000) / ((long) this.f34915J);
    }

    /* renamed from: D */
    public long mo4366D() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: E */
    public long mo4367E() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: F */
    public final void m17476F() {
        if (this.f34910E == -1) {
            this.f34907B.pause();
        }
    }

    /* renamed from: G */
    public void mo4368G(AudioTrack audioTrack, boolean z) {
        this.f34907B = audioTrack;
        this.f34912G = z;
        this.f34910E = -1;
        this.f34911F = 0;
        this.f34914I = 0;
        this.f34913H = 0;
        if (audioTrack != null) {
            this.f34915J = audioTrack.getSampleRate();
        }
    }

    /* renamed from: H */
    public void mo5178H(PlaybackParams playbackParams) {
        throw new UnsupportedOperationException();
    }
}
