package X;

import android.widget.TextView;
import com.instagram.video.videocall.view.VideoCallParticipantGridItemView;

/* renamed from: X.6BZ */
public final class AnonymousClass6BZ extends AnonymousClass0oo {
    /* renamed from: B */
    private final VideoCallParticipantGridItemView f72777B;

    public AnonymousClass6BZ(VideoCallParticipantGridItemView videoCallParticipantGridItemView) {
        super(videoCallParticipantGridItemView);
        this.f72777B = videoCallParticipantGridItemView;
    }

    /* renamed from: V */
    public final void m29347V(AnonymousClass6Ak anonymousClass6Ak) {
        this.f72777B.setVideoView(anonymousClass6Ak.f72598G);
        if (anonymousClass6Ak.f72595D) {
            VideoCallParticipantGridItemView videoCallParticipantGridItemView = this.f72777B;
            ((TextView) videoCallParticipantGridItemView.f72764B.A()).setText(anonymousClass6Ak.f72593B);
        }
        if (anonymousClass6Ak.f72596E) {
            this.f72777B.f72765C.setVisibility(0);
        } else {
            this.f72777B.f72765C.setVisibility(8);
        }
    }
}
