package com.instagram.filterkit.filter;

import X.AnonymousClass0Gn;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass28q;
import X.AnonymousClass2Fb;
import X.AnonymousClass2Fc;
import X.AnonymousClass2Fd;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass3Oo;
import X.AnonymousClass3Op;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.common.math.Matrix4;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import pl.droidsonroids.gif.GifDecoder;
import pl.droidsonroids.gif.InputSource$FileSource;

public class RegionTrackingFilter implements IgFilter, Serializable {
    public static final Creator CREATOR = new AnonymousClass3Oo();
    /* renamed from: B */
    public final IdentityFilter f48239B = new IdentityFilter();
    /* renamed from: C */
    public int f48240C;
    /* renamed from: D */
    public final Matrix4 f48241D = new Matrix4();
    /* renamed from: E */
    private final Map f48242E = new HashMap();
    /* renamed from: F */
    private boolean f48243F;
    /* renamed from: G */
    private final List f48244G;
    /* renamed from: H */
    private final AnonymousClass2Fd f48245H = new AnonymousClass2Fd();
    /* renamed from: I */
    private final Map f48246I = new HashMap();
    /* renamed from: J */
    private final Map f48247J = new HashMap();

    public final boolean EY() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public RegionTrackingFilter(List list) {
        this.f48244G = list;
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        this.f48239B.QE(anonymousClass28k);
        for (AnonymousClass2Vh cleanup : this.f48246I.values()) {
            cleanup.cleanup();
        }
        for (AnonymousClass3Op anonymousClass3Op : this.f48242E.values()) {
            anonymousClass3Op.f40793B.recycle();
        }
    }

    public final void QPA(int i) {
        this.f48239B.QPA(i);
    }

    public final void cb() {
        this.f48239B.cb();
    }

    public final void invalidate() {
        this.f48239B.invalidate();
    }

    public final boolean kX() {
        return this.f48239B.kX();
    }

    public final void yJA(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        if (!this.f48243F) {
            this.f48243F = true;
            for (int i = 0; i < this.f48244G.size(); i++) {
                AnonymousClass2Fb anonymousClass2Fb = (AnonymousClass2Fb) this.f48244G.get(i);
                if (anonymousClass2Fb.f28070D == AnonymousClass2Fc.ANIMATED) {
                    try {
                        this.f48242E.put(anonymousClass2Fb, new AnonymousClass3Op(new GifDecoder(new InputSource$FileSource(anonymousClass2Fb.f28068B))));
                        this.f48247J.put(anonymousClass2Fb, new TreeSet(anonymousClass2Fb.f28069C));
                    } catch (Throwable e) {
                        AnonymousClass0Gn.L("failed to render gif", e);
                    }
                } else {
                    this.f48246I.put(anonymousClass2Fb, anonymousClass28k.m14592D(this, anonymousClass2Fb.f28068B));
                    this.f48247J.put(anonymousClass2Fb, new TreeSet(anonymousClass2Fb.f28069C));
                }
            }
        }
        for (int i2 = 0; i2 < this.f48244G.size(); i2++) {
            AnonymousClass28q G;
            AnonymousClass2Fb anonymousClass2Fb2 = (AnonymousClass2Fb) this.f48244G.get(i2);
            Object obj = anonymousClass2Fb2.f28070D == AnonymousClass2Fc.ANIMATED ? 1 : null;
            if (obj != null) {
                AnonymousClass3Op anonymousClass3Op = (AnonymousClass3Op) this.f48242E.get(anonymousClass2Fb2);
                GifDecoder gifDecoder = anonymousClass3Op.f40794C;
                Bitmap bitmap = anonymousClass3Op.f40793B;
                gifDecoder.seekToTime(this.f48240C % gifDecoder.getDuration(), bitmap);
                G = AnonymousClass28j.m14584G(bitmap, false);
            } else {
                G = (AnonymousClass2Vh) this.f48246I.get(anonymousClass2Fb2);
            }
            NavigableSet navigableSet = (NavigableSet) this.f48247J.get(anonymousClass2Fb2);
            this.f48245H.f28085K = this.f48240C;
            AnonymousClass2Fd anonymousClass2Fd = (AnonymousClass2Fd) navigableSet.floor(this.f48245H);
            if (anonymousClass2Fd != null) {
                this.f48241D.F();
                this.f48241D.E(1.0f, -1.0f, 1.0f);
                Matrix.translateM(this.f48241D.f18004B, 0, (anonymousClass2Fd.f28080F * 2.0f) - 1.0f, (anonymousClass2Fd.f28081G * 2.0f) - 1.0f, 0.0f);
                float height = ((float) anonymousClass2Vi.getHeight()) / ((float) anonymousClass2Vi.getWidth());
                this.f48241D.E(height, 1.0f, 1.0f);
                this.f48241D.D(anonymousClass2Fd.f28084J);
                this.f48241D.E(1.0f / height, 1.0f, 1.0f);
                this.f48241D.E(anonymousClass2Fd.f28083I, anonymousClass2Fd.f28082H, 1.0f);
                this.f48239B.m23073F(this.f48241D);
                boolean glIsEnabled = GLES20.glIsEnabled(3042);
                if (!glIsEnabled) {
                    GLES20.glEnable(3042);
                }
                GLES20.glBlendFunc(1, 771);
                this.f48239B.yJA(anonymousClass28k, G, anonymousClass2Vi);
                if (!glIsEnabled) {
                    GLES20.glDisable(3042);
                }
            }
            if (!(obj == null || G == null)) {
                G.cleanup();
            }
        }
    }
}
