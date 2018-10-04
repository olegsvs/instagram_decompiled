package pl.droidsonroids.gif;

import X.AnonymousClass2Nl;
import android.graphics.Bitmap;

public class GifDecoder {
    private final GifInfoHandle mGifInfoHandle;

    public GifDecoder(AnonymousClass2Nl anonymousClass2Nl) {
        this.mGifInfoHandle = anonymousClass2Nl.open();
    }

    private void checkBuffer(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is recycled");
        } else if (bitmap.getWidth() < this.mGifInfoHandle.getWidth() || bitmap.getHeight() < this.mGifInfoHandle.getHeight()) {
            throw new IllegalArgumentException("Bitmap is too small, size must be greater than or equal to GIF size");
        }
    }

    public int getCurrentFrameDuration() {
        GifInfoHandle gifInfoHandle = this.mGifInfoHandle;
        return gifInfoHandle.getFrameDuration(gifInfoHandle.getCurrentFrameIndex());
    }

    public int getDuration() {
        return this.mGifInfoHandle.getDuration();
    }

    public int getHeight() {
        return this.mGifInfoHandle.getHeight();
    }

    public int getWidth() {
        return this.mGifInfoHandle.getWidth();
    }

    public void seekToTime(int i, Bitmap bitmap) {
        checkBuffer(bitmap);
        this.mGifInfoHandle.seekToTime(i, bitmap);
    }
}
