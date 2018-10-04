package org.webrtc;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

public class GlShader {
    private static final String TAG = "GlShader";
    private int program;

    public GlShader(String str, String str2) {
        int compileShader = compileShader(35633, str);
        int compileShader2 = compileShader(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        this.program = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, compileShader);
            GLES20.glAttachShader(this.program, compileShader2);
            GLES20.glLinkProgram(this.program);
            int[] iArr = new int[]{0};
            GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(compileShader);
                GLES20.glDeleteShader(compileShader2);
                GlUtil.checkNoGLES2Error("Creating GlShader");
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not link program: ");
            stringBuilder.append(GLES20.glGetProgramInfoLog(this.program));
            Logging.m29384e(TAG, stringBuilder.toString());
            throw new RuntimeException(GLES20.glGetProgramInfoLog(this.program));
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("glCreateProgram() failed. GLES20 error: ");
        stringBuilder.append(GLES20.glGetError());
        throw new RuntimeException(stringBuilder.toString());
    }

    private static int compileShader(int i, String str) {
        i = GLES20.glCreateShader(i);
        if (i != 0) {
            GLES20.glShaderSource(i, str);
            GLES20.glCompileShader(i);
            int[] iArr = new int[]{0};
            GLES20.glGetShaderiv(i, 35713, iArr, 0);
            if (iArr[0] == 1) {
                GlUtil.checkNoGLES2Error("compileShader");
                return i;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Compile error ");
            stringBuilder.append(GLES20.glGetShaderInfoLog(i));
            stringBuilder.append(" in shader:\n");
            stringBuilder.append(str);
            Logging.m29384e(TAG, stringBuilder.toString());
            throw new RuntimeException(GLES20.glGetShaderInfoLog(i));
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("glCreateShader() failed. GLES20 error: ");
        stringBuilder.append(GLES20.glGetError());
        throw new RuntimeException(stringBuilder.toString());
    }

    public int getAttribLocation(String str) {
        int i = this.program;
        if (i != -1) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
            if (glGetAttribLocation >= 0) {
                return glGetAttribLocation;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not locate '");
            stringBuilder.append(str);
            stringBuilder.append("' in program");
            throw new RuntimeException(stringBuilder.toString());
        }
        throw new RuntimeException("The program has been released");
    }

    public int getUniformLocation(String str) {
        int i = this.program;
        if (i != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not locate uniform '");
            stringBuilder.append(str);
            stringBuilder.append("' in program");
            throw new RuntimeException(stringBuilder.toString());
        }
        throw new RuntimeException("The program has been released");
    }

    public void release() {
        Logging.m29383d(TAG, "Deleting shader.");
        int i = this.program;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.program = -1;
        }
    }

    public void setVertexAttribArray(String str, int i, int i2, FloatBuffer floatBuffer) {
        if (this.program != -1) {
            int attribLocation = getAttribLocation(str);
            GLES20.glEnableVertexAttribArray(attribLocation);
            GLES20.glVertexAttribPointer(attribLocation, i, 5126, null, i2, floatBuffer);
            GlUtil.checkNoGLES2Error("setVertexAttribArray");
            return;
        }
        throw new RuntimeException("The program has been released");
    }

    public void setVertexAttribArray(String str, int i, FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i, 0, floatBuffer);
    }

    public void useProgram() {
        int i = this.program;
        if (i != -1) {
            GLES20.glUseProgram(i);
            GlUtil.checkNoGLES2Error("glUseProgram");
            return;
        }
        throw new RuntimeException("The program has been released");
    }
}
