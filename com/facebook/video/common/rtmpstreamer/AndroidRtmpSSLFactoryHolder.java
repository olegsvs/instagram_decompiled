package com.facebook.video.common.rtmpstreamer;

import com.facebook.jni.HybridData;

public class AndroidRtmpSSLFactoryHolder {
    public HybridData mHybridData;

    private native HybridData initHybrid(String str, boolean z, Object obj);
}
