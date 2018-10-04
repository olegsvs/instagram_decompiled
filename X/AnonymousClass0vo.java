package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.facebook.C0164R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;

/* renamed from: X.0vo */
public final class AnonymousClass0vo {
    /* renamed from: B */
    public ColorDrawable f12138B;

    /* renamed from: A */
    public final void m8371A(MediaActionsView mediaActionsView, IgProgressImageView igProgressImageView, AnonymousClass0pj anonymousClass0pj, boolean z, boolean z2, AnonymousClass0m3 anonymousClass0m3) {
        if (z) {
            if (anonymousClass0pj != AnonymousClass0pj.HIDDEN) {
                if (anonymousClass0pj != AnonymousClass0pj.PROGRESS_BAR_ONLY) {
                    igProgressImageView.setVisibility(0);
                    igProgressImageView.setEnableProgressBar(false);
                    if (!z2) {
                        if (anonymousClass0pj == AnonymousClass0pj.LOADING) {
                            mediaActionsView.m8321I();
                        }
                        mediaActionsView.setVideoIconState(anonymousClass0pj);
                        igProgressImageView.m7588E(C0164R.id.listener_id_for_media_video_binder, new AnonymousClass0zJ(this, mediaActionsView, anonymousClass0pj));
                    }
                }
            }
            igProgressImageView.setVisibility(8);
            anonymousClass0m3.KB = false;
            igProgressImageView.setEnableProgressBar(false);
            if (z2) {
                if (anonymousClass0pj == AnonymousClass0pj.LOADING) {
                    mediaActionsView.m8321I();
                }
                mediaActionsView.setVideoIconState(anonymousClass0pj);
                igProgressImageView.m7588E(C0164R.id.listener_id_for_media_video_binder, new AnonymousClass0zJ(this, mediaActionsView, anonymousClass0pj));
            }
        } else {
            igProgressImageView.setEnableProgressBar(true);
            igProgressImageView.setVisibility(0);
            igProgressImageView.m7586C(C0164R.id.listener_id_for_media_video_binder);
            mediaActionsView.setVideoIconState(AnonymousClass0pj.HIDDEN);
        }
        Context context = igProgressImageView.getContext();
        if (this.f12138B == null) {
            this.f12138B = new ColorDrawable(AnonymousClass0Ca.m937C(context, C0164R.color.white));
        }
        igProgressImageView.setBackground(this.f12138B);
    }
}
