package X;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: X.3tz */
public class AnonymousClass3tz extends AnonymousClass2qw {
    /* renamed from: B */
    private final AudioTimestamp f46183B = new AudioTimestamp();
    /* renamed from: C */
    private long f46184C;
    /* renamed from: D */
    private long f46185D;
    /* renamed from: E */
    private long f46186E;

    /* renamed from: D */
    public final long mo4366D() {
        return this.f46185D;
    }

    /* renamed from: E */
    public final long mo4367E() {
        return this.f46183B.nanoTime;
    }

    /* renamed from: G */
    public void mo4368G(AudioTrack audioTrack, boolean z) {
        super.mo4368G(audioTrack, z);
        this.f46186E = 0;
        this.f46184C = 0;
        this.f46185D = 0;
    }

    /* renamed from: I */
    public final boolean mo4369I() {
        boolean timestamp = this.f34907B.getTimestamp(this.f46183B);
        if (timestamp) {
            long j = this.f46183B.framePosition;
            if (this.f46184C > j) {
                this.f46186E++;
            }
            this.f46184C = j;
            this.f46185D = j + (this.f46186E << 32);
        }
        return timestamp;
    }
}
