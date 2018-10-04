package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.fragment.AlbumEditFragment;

/* renamed from: X.4H6 */
public final class AnonymousClass4H6 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4HA f52268B;
    /* renamed from: C */
    public final /* synthetic */ MediaSession f52269C;

    public AnonymousClass4H6(AnonymousClass4HA anonymousClass4HA, MediaSession mediaSession) {
        this.f52268B = anonymousClass4HA;
        this.f52269C = mediaSession;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 891433103);
        AlbumEditFragment albumEditFragment = this.f52268B.f52281H;
        MediaSession mediaSession = this.f52269C;
        AnonymousClass2NY B = AnonymousClass2NY.m15348B();
        B.f29718O++;
        AlbumEditFragment.F(albumEditFragment, mediaSession, false);
        CreationSession creationSession = albumEditFragment.f64905F;
        if (creationSession.f38960N.contains(mediaSession)) {
            creationSession.f38953G = mediaSession;
            if (mediaSession.f38977C == AnonymousClass3CD.PHOTO) {
                PhotoSession photoSession = mediaSession.f38976B;
                photoSession.f38987J = photoSession.f38982E.m22015D();
                AnonymousClass3HZ.m19251B(new AnonymousClass44n(true));
            } else if (mediaSession.f38977C == AnonymousClass3CD.VIDEO) {
                AnonymousClass3HZ.m19251B(new AnonymousClass44p(true));
            }
            AnonymousClass0cQ.L(this, -55846809, M);
            return;
        }
        throw new IllegalStateException("MediaSession not contained in media session list");
    }
}
