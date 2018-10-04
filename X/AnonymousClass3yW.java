package X;

import android.media.MediaPlayer;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.3yW */
public final class AnonymousClass3yW implements AnonymousClass3BU {
    /* renamed from: B */
    public final /* synthetic */ String f47676B;

    public AnonymousClass3yW(VideoPreviewView videoPreviewView, String str) {
        this.f47676B = str;
    }

    public final void cNA(MediaPlayer mediaPlayer) {
        mediaPlayer.setDataSource(this.f47676B);
    }
}
