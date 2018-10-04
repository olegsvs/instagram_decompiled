package X;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import java.util.List;

/* renamed from: X.2ni */
public final class AnonymousClass2ni implements PreviewCallback {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3st f34085B;

    public AnonymousClass2ni(AnonymousClass3st anonymousClass3st) {
        this.f34085B = anonymousClass3st;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        AnonymousClass2nb.m17197B().m17199A();
        List list = this.f34085B.f45923D.f34059B;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass2nX) list.get(i)).ku(bArr);
        }
    }
}
