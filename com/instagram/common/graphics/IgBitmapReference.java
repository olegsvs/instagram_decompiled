package com.instagram.common.graphics;

import X.AnonymousClass0lL;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

public final class IgBitmapReference {
    private WeakReference mBitmapWeakReference;
    private final long mNativeEntry;
    private boolean mReleased;

    private static native Bitmap nativeCreateBitmap(long j);

    private static native void nativeDestructor(long j);

    private static native void nativeMakeDiscardable(long j);

    public IgBitmapReference(long j) {
        this.mNativeEntry = j;
    }

    public void finalize() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        super.finalize();	 Catch:{ Throwable -> 0x0018, all -> 0x000d }
        r0 = r3.mReleased;
        if (r0 != 0) goto L_0x001d;
    L_0x0007:
        r0 = r3.mNativeEntry;
        nativeDestructor(r0);
        goto L_0x001d;
    L_0x000d:
        r2 = move-exception;
        r0 = r3.mReleased;
        if (r0 != 0) goto L_0x0017;
    L_0x0012:
        r0 = r3.mNativeEntry;
        nativeDestructor(r0);
    L_0x0017:
        throw r2;
    L_0x0018:
        r0 = r3.mReleased;
        if (r0 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0007;
    L_0x001d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.graphics.IgBitmapReference.finalize():void");
    }

    public synchronized Bitmap getOrCreateBitmap() {
        Bitmap bitmap;
        if (this.mReleased) {
            throw new IllegalStateException("Trying to use a bitmap reference that's already been released");
        }
        bitmap = this.mBitmapWeakReference == null ? null : (Bitmap) this.mBitmapWeakReference.get();
        if (bitmap == null) {
            bitmap = nativeCreateBitmap(this.mNativeEntry);
            if (AnonymousClass0lL.f9518B) {
                AnonymousClass0lL.B(bitmap);
            }
            if (bitmap != null) {
                this.mBitmapWeakReference = new WeakReference(bitmap);
            }
        }
        return bitmap;
    }

    public synchronized void makeDiscardable() {
        nativeMakeDiscardable(this.mNativeEntry);
    }

    public synchronized void release() {
        if (this.mReleased) {
            throw new IllegalStateException("Trying to release a bitmap reference that's already been released");
        }
        this.mReleased = true;
        this.mBitmapWeakReference = null;
        nativeDestructor(this.mNativeEntry);
    }
}
