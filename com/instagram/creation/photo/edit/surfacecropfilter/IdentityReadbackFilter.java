package com.instagram.creation.photo.edit.surfacecropfilter;

import X.AnonymousClass0GG;
import X.AnonymousClass0LH;
import X.AnonymousClass28k;
import X.AnonymousClass2N4;
import X.AnonymousClass2N5;
import X.AnonymousClass2N7;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass3Cc;
import X.AnonymousClass3Cd;
import X.AnonymousClass3Ga;
import X.AnonymousClass3Gc;
import X.AnonymousClass3Ge;
import X.AnonymousClass3Gh;
import X.AnonymousClass3HG;
import X.AnonymousClass3zM;
import X.AnonymousClass3zN;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.resize.IdentityFilter;
import com.instagram.util.jpeg.JpegBridge;
import com.instagram.util.jpeg.NativeImage;

public class IdentityReadbackFilter extends IdentityFilter {
    public static final Creator CREATOR = new AnonymousClass3HG();
    /* renamed from: B */
    public AnonymousClass3Gc f50247B;
    /* renamed from: C */
    public AnonymousClass3Gh f50248C;

    public IdentityReadbackFilter(Parcel parcel) {
        super(parcel);
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        super.QE(anonymousClass28k);
        this.f50247B.f39675F.set(true);
        this.f50248C.f39693E.set(false);
    }

    public final void yJA(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        super.yJA(anonymousClass28k, anonymousClass2Vh, anonymousClass2Vi);
        boolean andSet = this.f50247B.f39675F.getAndSet(false);
        boolean andSet2 = this.f50248C.f39693E.getAndSet(false);
        if (andSet || andSet2) {
            GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
            NativeImage readFramebuffer = JpegBridge.readFramebuffer(anonymousClass2Vi.getWidth(), anonymousClass2Vi.getHeight());
            if (readFramebuffer.getBufferId() != -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(IdentityReadbackFilter.class.getCanonicalName());
                stringBuilder.append(System.currentTimeMillis());
                String stringBuilder2 = stringBuilder.toString();
                AnonymousClass2N7 anonymousClass2N7 = AnonymousClass2N5.f29616B;
                synchronized (anonymousClass2N7) {
                    AnonymousClass0LH.E(readFramebuffer);
                    AnonymousClass2N4 anonymousClass2N4 = (AnonymousClass2N4) anonymousClass2N7.f29617B.put(stringBuilder2, new AnonymousClass2N4(anonymousClass2N7, readFramebuffer));
                }
                if (andSet) {
                    try {
                        anonymousClass2N7.m15286A(stringBuilder2, this.f50247B);
                        this.f50247B.m19213C();
                        AnonymousClass0GG.B(AnonymousClass3Gc.f39670I, new AnonymousClass3Ga(this.f50247B, readFramebuffer, new AnonymousClass3zM(this, stringBuilder2)), -2036434649);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }
                if (andSet2) {
                    try {
                        AnonymousClass2N5.f29616B.m15286A(stringBuilder2, this.f50248C);
                        this.f50248C.m19217C();
                        AnonymousClass3Gh anonymousClass3Gh = this.f50248C;
                        AnonymousClass3zN anonymousClass3zN = new AnonymousClass3zN(this, stringBuilder2);
                        AnonymousClass3Cd anonymousClass3Cd = (AnonymousClass3Cd) anonymousClass3Gh.f39690B.get();
                        if (anonymousClass3Cd != null) {
                            anonymousClass3Cd.m19016B(AnonymousClass3Cc.PROCESSING);
                        }
                        AnonymousClass0GG.B(AnonymousClass3Gh.f39689J, new AnonymousClass3Ge(anonymousClass3Gh, readFramebuffer, anonymousClass3zN), 757818943);
                        return;
                    } catch (Throwable e2) {
                        throw new RuntimeException(e2);
                    }
                }
                return;
            }
            throw new RuntimeException("Could not read frame buffer");
        }
    }
}
