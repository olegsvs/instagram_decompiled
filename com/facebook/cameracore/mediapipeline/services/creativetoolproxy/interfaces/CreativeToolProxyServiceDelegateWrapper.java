package com.facebook.cameracore.mediapipeline.services.creativetoolproxy.interfaces;

import X.AnonymousClass2jP;
import X.AnonymousClass2jQ;
import X.AnonymousClass2jR;
import X.AnonymousClass2jS;

public class CreativeToolProxyServiceDelegateWrapper {
    /* renamed from: B */
    private final AnonymousClass2jP f33029B;

    public void createStickerForProxyData(float f, float f2, float f3, float f4, float f5, String str, int i) {
        this.f33029B.onCreateStickerForProxyData(new AnonymousClass2jQ(new AnonymousClass2jS(new float[]{f, f2}, new float[]{f3, f4}, f5), str, i));
    }

    public void createTextForProxyData(String str, float f, float f2, float f3, float f4, float f5, String str2, float f6, float f7, float f8, float f9, float f10, int i) {
        f2 = new float[]{f10, f7, f8, f9};
        String str3 = str;
        this.f33029B.onCreateTextForProxyData(new AnonymousClass2jR(str3, new AnonymousClass2jS(new float[]{f, f2}, new float[]{f3, f4}, f5), str2, f6, f2, i));
    }
}
