package X;

import android.opengl.GLES20;

/* renamed from: X.2LJ */
public abstract class AnonymousClass2LJ {
    /* renamed from: B */
    public static AnonymousClass28h m15148B(AnonymousClass2LE anonymousClass2LE, int i, int i2) {
        anonymousClass2LE = anonymousClass2LE.f29222B.getResources();
        return AnonymousClass2LJ.m15149C(AnonymousClass26l.m14469B(anonymousClass2LE, i), AnonymousClass26l.m14469B(anonymousClass2LE, i2));
    }

    /* renamed from: C */
    public static AnonymousClass28h m15149C(String str, String str2) {
        int D = AnonymousClass2LJ.m15150D(35633, str);
        int D2 = AnonymousClass2LJ.m15150D(35632, str2);
        str2 = GLES20.glCreateProgram();
        GLES20.glAttachShader(str2, D);
        GLES20.glAttachShader(str2, D2);
        GLES20.glLinkProgram(str2);
        str = new int[]{null};
        GLES20.glGetProgramiv(str2, 35714, str, 0);
        if (str[0] != null) {
            return new AnonymousClass28h(str2);
        }
        str2 = GLES20.glGetProgramInfoLog(str2);
        AnonymousClass0Dc.F("ShaderUtil", str2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("program link failed:");
        stringBuilder.append(str2);
        throw new RuntimeException(stringBuilder.toString());
    }

    /* renamed from: D */
    public static int m15150D(int i, String str) {
        AnonymousClass28j.m14579B("before creating shader");
        i = GLES20.glCreateShader(i);
        AnonymousClass28j.m14579B("before setting shader source");
        GLES20.glShaderSource(i, str);
        AnonymousClass28j.m14579B("before compiling");
        GLES20.glCompileShader(i);
        int[] iArr = new int[]{0};
        GLES20.glGetShaderiv(i, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return i;
        }
        i = GLES20.glGetShaderInfoLog(i);
        AnonymousClass0Dc.F("ShaderUtil", i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("shader compile failed:");
        stringBuilder.append(i);
        throw new RuntimeException(stringBuilder.toString());
    }
}
