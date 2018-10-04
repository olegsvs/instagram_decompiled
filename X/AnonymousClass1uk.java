package X;

import android.opengl.GLES20;

/* renamed from: X.1uk */
public final class AnonymousClass1uk {
    /* renamed from: B */
    public int[] f24044B;
    /* renamed from: C */
    public int f24045C;
    /* renamed from: D */
    public int f24046D;
    /* renamed from: E */
    public AnonymousClass1uu f24047E;
    /* renamed from: F */
    public int f24048F;

    public AnonymousClass1uk(int i, int i2) {
        AnonymousClass1ut anonymousClass1ut = new AnonymousClass1ut();
        anonymousClass1ut.f24084I = 3553;
        this(i, i2, anonymousClass1ut.m13710B(10241, 9729).m13710B(10240, 9729).m13710B(10242, 33071).m13710B(10243, 33071).m13709A());
    }

    public AnonymousClass1uk(int i, int i2, AnonymousClass1uu anonymousClass1uu) {
        int i3 = i;
        this.f24048F = i;
        int i4 = i2;
        this.f24046D = i2;
        AnonymousClass1uu anonymousClass1uu2 = anonymousClass1uu;
        this.f24047E = anonymousClass1uu;
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i5 = iArr[0];
        this.f24045C = i5;
        GLES20.glBindFramebuffer(36160, i5);
        GLES20.glBindTexture(3553, anonymousClass1uu.f24087C);
        GLES20.glTexImage2D(3553, 0, 6408, i3, i4, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, anonymousClass1uu2.f24087C, 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Frame buffer creation failed with ");
        stringBuilder.append(glCheckFramebufferStatus);
        throw new RuntimeException(stringBuilder.toString());
    }

    /* renamed from: A */
    public final void m13685A() {
        if (this.f24047E != null) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.f24045C}, 0);
            int[] iArr = this.f24044B;
            if (iArr != null) {
                GLES20.glDeleteRenderbuffers(1, iArr, 0);
                this.f24044B = null;
            }
            this.f24047E.m13711A();
            this.f24047E = null;
        }
    }
}
