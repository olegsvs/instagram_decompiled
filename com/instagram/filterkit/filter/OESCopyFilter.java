package com.instagram.filterkit.filter;

import X.AnonymousClass28k;
import X.AnonymousClass28p;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass3Ox;
import android.opengl.GLES20;

public class OESCopyFilter extends VideoFilter {
    /* renamed from: B */
    public float[] f50118B;
    /* renamed from: C */
    private int f50119C;
    /* renamed from: D */
    private final AnonymousClass28p f50120D = new AnonymousClass28p();

    public OESCopyFilter() {
        super(null, AnonymousClass3Ox.m19525B().m19527B(-2));
    }

    /* renamed from: B */
    public final void mo5437B() {
        this.f50119C = GLES20.glGetUniformLocation(this.f49574O, "transformMatrix");
    }

    public final void yJA(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            Integer.valueOf(glCheckFramebufferStatus);
        }
        GLES20.glUseProgram(m22723A());
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, anonymousClass2Vh.getTextureId());
        GLES20.glEnableVertexAttribArray(this.f49573N);
        GLES20.glVertexAttribPointer(this.f49573N, 2, 5126, false, 8, this.f49568I.f29571C);
        GLES20.glEnableVertexAttribArray(this.f49580U);
        GLES20.glVertexAttribPointer(this.f49580U, 2, 5126, false, 8, this.f49568I.f29572D);
        if (this.f49576Q != -1) {
            GLES20.glEnableVertexAttribArray(this.f49576Q);
            GLES20.glVertexAttribPointer(this.f49576Q, 2, 5126, false, 8, this.f49568I.f29572D);
        }
        GLES20.glUniformMatrix4fv(this.f50119C, 1, false, this.f50118B, 0);
        anonymousClass2Vi.RU(this.f50120D);
        GLES20.glViewport(this.f50120D.f26617D, this.f50120D.f26618E, this.f50120D.f26616C, this.f50120D.f26615B);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f49573N);
        GLES20.glDisableVertexAttribArray(this.f49580U);
        if (this.f49576Q != -1) {
            GLES20.glDisableVertexAttribArray(this.f49576Q);
        }
    }
}
