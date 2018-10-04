package X;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.3yX */
public final class AnonymousClass3yX implements AnonymousClass3BU {
    /* renamed from: B */
    public final /* synthetic */ AssetFileDescriptor f47677B;

    public AnonymousClass3yX(VideoPreviewView videoPreviewView, AssetFileDescriptor assetFileDescriptor) {
        this.f47677B = assetFileDescriptor;
    }

    public final void cNA(MediaPlayer mediaPlayer) {
        mediaPlayer.setDataSource(this.f47677B.getFileDescriptor(), this.f47677B.getStartOffset(), this.f47677B.getLength());
    }
}
