package X;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3st */
public final class AnonymousClass3st implements AnonymousClass2nh {
    /* renamed from: B */
    public final ArrayList f45921B = new ArrayList();
    /* renamed from: C */
    public final HashMap f45922C = new HashMap();
    /* renamed from: D */
    public final AnonymousClass2nQ f45923D = new AnonymousClass2nQ();
    /* renamed from: E */
    private final PreviewCallback f45924E = new AnonymousClass2ni(this);
    /* renamed from: F */
    private final PreviewCallback f45925F = new AnonymousClass2nj(this);
    /* renamed from: G */
    private boolean f45926G;

    /* renamed from: B */
    public static int m21141B(Size size, int i) {
        int bitsPerPixel;
        if (i != 842094169) {
            bitsPerPixel = (ImageFormat.getBitsPerPixel(i) * size.width) * size.height;
            if (bitsPerPixel % 8 != 0) {
                throw new IllegalStateException("Total bits for Frame should be a multiple of 8");
            }
        } else {
            double d = (double) size.width;
            Double.isNaN(d);
            bitsPerPixel = ((int) Math.ceil(d / 16.0d)) * 16;
            d = (double) (bitsPerPixel / 2);
            Double.isNaN(d);
            bitsPerPixel = (bitsPerPixel * size.height) + ((((((int) Math.ceil(d / 16.0d)) * 16) * size.height) / 2) * 2);
        }
        return bitsPerPixel / 8;
    }

    public final synchronized void HH(Camera camera, Size size, int i) {
        if (AnonymousClass2oP.m17271B()) {
            throw new RuntimeException("Cannot enable listeners on the UI thread");
        } else if (!this.f45926G) {
            if ((this.f45922C.isEmpty() ^ 1) != 0) {
                camera.setPreviewCallback(null);
                synchronized (this) {
                    int i2 = 0;
                    int i3 = 0;
                    for (Integer num : this.f45922C.values()) {
                        if (num.intValue() > i3) {
                            i3 = num.intValue();
                        }
                    }
                    int B = AnonymousClass3st.m21141B(size, i);
                    if (this.f45921B.isEmpty()) {
                        while (i2 < i3) {
                            this.f45921B.add(new byte[B]);
                            i2++;
                        }
                    } else {
                        if (((byte[]) this.f45921B.get(0)).length != B) {
                            this.f45921B.clear();
                        }
                        int size2 = this.f45921B.size();
                        if (i3 > size2) {
                            i3 -= size2;
                            while (i2 < i3) {
                                this.f45921B.add(new byte[B]);
                                i2++;
                            }
                        } else if (i3 < size2) {
                            Collection arrayList = new ArrayList(i3);
                            while (i2 < i3) {
                                arrayList.add(this.f45921B.get(i2));
                                i2++;
                            }
                            this.f45921B.clear();
                            this.f45921B.addAll(arrayList);
                        }
                    }
                }
                Iterator it = this.f45921B.iterator();
                while (it.hasNext()) {
                    camera.addCallbackBuffer((byte[]) it.next());
                }
                camera.setPreviewCallbackWithBuffer(this.f45925F);
            } else {
                camera.setPreviewCallbackWithBuffer(null);
                camera.setPreviewCallback(this.f45924E);
            }
            this.f45926G = true;
        }
    }

    public final synchronized boolean OV() {
        return this.f45923D.f34059B.isEmpty() ^ 1;
    }

    public final synchronized void QJA() {
        this.f45921B.clear();
    }

    public final synchronized void cG(Camera camera) {
        if (AnonymousClass2oP.m17271B()) {
            throw new RuntimeException("Cannot disable listeners on the UI thread");
        }
        camera.setPreviewCallbackWithBuffer(null);
        camera.setPreviewCallback(null);
        this.f45926G = false;
    }

    public final synchronized void kJA(AnonymousClass2nW anonymousClass2nW) {
        throw new UnsupportedOperationException("OnPreviewFrameListener2 is not yet supported.");
    }

    public final synchronized void lJA(AnonymousClass2nX anonymousClass2nX) {
        this.f45922C.remove(anonymousClass2nX);
        this.f45923D.m17196C(anonymousClass2nX);
    }

    public final synchronized void qB(AnonymousClass2nW anonymousClass2nW) {
        throw new UnsupportedOperationException("OnPreviewFrameListener2 is not yet supported.");
    }

    public final synchronized void rB(AnonymousClass2nX anonymousClass2nX) {
        this.f45923D.m17194A(anonymousClass2nX);
    }

    public final synchronized void release() {
        this.f45923D.m17195B();
        this.f45922C.clear();
        QJA();
    }

    public final synchronized void sB(AnonymousClass2nX anonymousClass2nX, int i) {
        if (anonymousClass2nX == null || i <= 0) {
            throw new IllegalArgumentException("listener and valid number of buffers required");
        }
        this.f45922C.put(anonymousClass2nX, Integer.valueOf(i));
        this.f45923D.m17194A(anonymousClass2nX);
    }
}
