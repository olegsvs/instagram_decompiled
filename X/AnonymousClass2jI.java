package X;

import com.facebook.cameracore.mediapipeline.services.audioclassic.implementation.AudioServiceImpl;

/* renamed from: X.2jI */
public final class AnonymousClass2jI implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AudioServiceImpl f33017B;
    /* renamed from: C */
    public final /* synthetic */ String f33018C;
    /* renamed from: D */
    public final /* synthetic */ boolean f33019D;

    public AnonymousClass2jI(AudioServiceImpl audioServiceImpl, String str, boolean z) {
        this.f33017B = audioServiceImpl;
        this.f33018C = str;
        this.f33019D = z;
    }

    public final void run() {
        if (!this.f33017B.mIsReleased) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f33017B.mCurrentAssetDirectory);
            stringBuilder.append(this.f33018C);
            String stringBuilder2 = stringBuilder.toString();
            if (AudioServiceImpl.isValidPath(stringBuilder2)) {
                this.f33017B.mAudioDecoder.m16868A(stringBuilder2, null, this.f33019D);
            }
        }
    }
}
