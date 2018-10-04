package com.instagram.filterkit.filter;

import X.AnonymousClass2Mk;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass3UU;
import android.content.Context;
import android.opengl.GLES20;
import java.nio.FloatBuffer;

public class MaskingTextureFilter extends VideoFilter {
    /* renamed from: B */
    private final FloatBuffer f50115B = AnonymousClass2Mk.m15237C(AnonymousClass2Mk.m15241G(4));
    /* renamed from: C */
    private int f50116C;
    /* renamed from: D */
    private final FloatBuffer f50117D = AnonymousClass2Mk.m15237C(AnonymousClass2Mk.m15241G(0));

    public MaskingTextureFilter(Context context, AnonymousClass3UU anonymousClass3UU) {
        super(context, anonymousClass3UU);
    }

    /* renamed from: B */
    public final void mo5437B() {
        super.mo5437B();
        this.f50116C = GLES20.glGetAttribLocation(this.f49574O, "maskingTextureCoordinate");
    }

    /* renamed from: C */
    public final void mo5438C(AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        super.mo5438C(anonymousClass2Vh, anonymousClass2Vi);
        GLES20.glDisableVertexAttribArray(this.f50116C);
    }

    /* renamed from: D */
    public final void mo5439D(AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        super.mo5439D(anonymousClass2Vh, anonymousClass2Vi);
        GLES20.glEnableVertexAttribArray(this.f50116C);
        GLES20.glVertexAttribPointer(this.f50116C, 2, 5126, false, 8, this.f49569J ? this.f50115B : this.f50117D);
    }
}
