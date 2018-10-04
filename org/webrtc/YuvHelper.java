package org.webrtc;

import java.nio.ByteBuffer;

public class YuvHelper {
    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        int i6 = i5;
        int i7 = i4;
        int i8 = (i4 + 1) / 2;
        int i9 = i4 * i5;
        int i10 = ((i5 + 1) / 2) * i8;
        int i11 = (i10 * 2) + i9;
        ByteBuffer byteBuffer5 = byteBuffer4;
        if (byteBuffer5.capacity() >= i11) {
            i10 += i9;
            byteBuffer5.position(0);
            ByteBuffer slice = byteBuffer5.slice();
            byteBuffer5.position(i9);
            ByteBuffer slice2 = byteBuffer5.slice();
            byteBuffer5.position(i10);
            nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i7, slice2, i8, byteBuffer5.slice(), i8, i7, i6);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected destination buffer capacity to be at least ");
        stringBuilder.append(i11);
        stringBuilder.append(" was ");
        stringBuilder.append(byteBuffer5.capacity());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        int i7 = i6;
        int i8 = i7 % 180;
        int i9 = i4;
        int i10 = i5;
        int i11 = i8 == 0 ? i9 : i10;
        int i12 = i8 == 0 ? i10 : i9;
        int i13 = (i12 + 1) / 2;
        int i14 = (i11 + 1) / 2;
        i12 *= i11;
        i13 *= i14;
        int i15 = (i13 * 2) + i12;
        ByteBuffer byteBuffer5 = byteBuffer4;
        if (byteBuffer5.capacity() >= i15) {
            i13 += i12;
            byteBuffer5.position(0);
            ByteBuffer slice = byteBuffer5.slice();
            byteBuffer5.position(i12);
            ByteBuffer slice2 = byteBuffer5.slice();
            byteBuffer5.position(i13);
            nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i11, slice2, i14, byteBuffer5.slice(), i14, i9, i10, i7);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected destination buffer capacity to be at least ");
        stringBuilder.append(i15);
        stringBuilder.append(" was ");
        stringBuilder.append(byteBuffer5.capacity());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9) {
        nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8, i9);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        int i6 = i4;
        int i7 = (i4 + 1) / 2;
        int i8 = i5;
        int i9 = i4 * i5;
        int i10 = ((((i5 + 1) / 2) * i7) * 2) + i9;
        ByteBuffer byteBuffer5 = byteBuffer4;
        if (byteBuffer5.capacity() >= i10) {
            byteBuffer5.position(0);
            ByteBuffer slice = byteBuffer5.slice();
            byteBuffer5.position(i9);
            nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i6, byteBuffer5.slice(), i7 * 2, i6, i8);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected destination buffer capacity to be at least ");
        stringBuilder.append(i10);
        stringBuilder.append(" was ");
        stringBuilder.append(byteBuffer5.capacity());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }
}
