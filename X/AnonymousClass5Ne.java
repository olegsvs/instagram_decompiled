package X;

import android.opengl.GLES20;
import java.nio.Buffer;

/* renamed from: X.5Ne */
public final class AnonymousClass5Ne {
    /* renamed from: B */
    public AnonymousClass5Na f62811B;
    /* renamed from: C */
    public final AnonymousClass5Nd f62812C = new AnonymousClass5Nd();

    public AnonymousClass5Ne(String str) {
        this.f62811B = new AnonymousClass5Na(str);
    }

    /* renamed from: A */
    public final void m26375A(int i, float[] fArr, boolean z) {
        Buffer buffer;
        AnonymousClass5Ne anonymousClass5Ne = this;
        AnonymousClass5Na anonymousClass5Na = this.f62811B;
        float[] fArr2 = AnonymousClass1va.f24236B;
        Buffer buffer2 = this.f62812C.f62808F;
        int i2 = this.f62812C.f62809G;
        int i3 = this.f62812C.f62804B;
        int i4 = this.f62812C.f62810H;
        if (z) {
            buffer = this.f62812C.f62806D;
        } else {
            buffer = this.f62812C.f62805C;
        }
        int i5 = anonymousClass5Ne.f62812C.f62807E;
        AnonymousClass1va.B("draw start");
        GLES20.glClear(16640);
        GLES20.glUseProgram(anonymousClass5Na.f62776B);
        AnonymousClass1va.B("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(anonymousClass5Na.f62777C, i);
        GLES20.glUniformMatrix4fv(anonymousClass5Na.f62780F, 1, false, fArr2, 0);
        AnonymousClass1va.B("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(anonymousClass5Na.f62781G, 1, false, fArr, 0);
        AnonymousClass1va.B("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(anonymousClass5Na.f62778D);
        AnonymousClass1va.B("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(anonymousClass5Na.f62778D, i3, 5126, false, i4, buffer2);
        AnonymousClass1va.B("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(anonymousClass5Na.f62779E);
        AnonymousClass1va.B("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(anonymousClass5Na.f62779E, 2, 5126, false, i5, buffer);
        AnonymousClass1va.B("glVertexAttribPointer");
        GLES20.glDrawArrays(5, 0, i2);
        AnonymousClass1va.B("glDrawArrays");
        GLES20.glDisableVertexAttribArray(anonymousClass5Na.f62778D);
        GLES20.glDisableVertexAttribArray(anonymousClass5Na.f62779E);
        GLES20.glBindTexture(anonymousClass5Na.f62777C, 0);
        GLES20.glUseProgram(0);
    }
}
