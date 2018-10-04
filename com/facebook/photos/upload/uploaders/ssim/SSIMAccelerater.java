package com.facebook.photos.upload.uploaders.ssim;

import X.AnonymousClass0CF;
import android.graphics.Bitmap;
import com.facebook.jni.HybridClassBase;

public class SSIMAccelerater extends HybridClassBase {
    private native void initHybrid();

    public native float calculateSSIM(Bitmap bitmap, Bitmap bitmap2);

    static {
        AnonymousClass0CF.E("ssim_accelerater");
    }

    public SSIMAccelerater() {
        initHybrid();
    }
}
