package com.instagram.creation.photo.edit.tiltshift;

import X.AnonymousClass28h;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eL;
import X.AnonymousClass2eM;
import X.AnonymousClass2eP;
import X.AnonymousClass3HR;
import android.graphics.PointF;
import android.os.Parcel;
import com.instagram.filterkit.filter.BaseSimpleFilter;

public abstract class BaseTiltShiftFilter extends BaseSimpleFilter {
    /* renamed from: B */
    public float f50096B;
    /* renamed from: C */
    public AnonymousClass3HR f50097C;
    /* renamed from: D */
    private PointF f50098D = new PointF();
    /* renamed from: E */
    private AnonymousClass2eP f50099E;
    /* renamed from: F */
    private AnonymousClass2eM f50100F;
    /* renamed from: G */
    private AnonymousClass2eL f50101G;
    /* renamed from: H */
    private PointF f50102H = new PointF();
    /* renamed from: I */
    private float f50103I;
    /* renamed from: J */
    private AnonymousClass2eM f50104J;
    /* renamed from: K */
    private AnonymousClass2eL f50105K;
    /* renamed from: L */
    private float f50106L;

    /* renamed from: N */
    public abstract void mo5476N(AnonymousClass28h anonymousClass28h, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi);

    public BaseTiltShiftFilter() {
        m23068P(AnonymousClass3HR.RADIAL);
        m23064L(0.5f, 0.5f);
        m23065M(0.5f);
        m23068P(AnonymousClass3HR.LINEAR);
        m23064L(0.5f, 0.5f);
        m23065M(0.5f);
        m23067O(0.0f);
        m23068P(AnonymousClass3HR.OFF);
    }

    public BaseTiltShiftFilter(Parcel parcel) {
        super(parcel);
        m23068P(AnonymousClass3HR.RADIAL);
        m23064L(parcel.readFloat(), parcel.readFloat());
        m23065M(parcel.readFloat());
        m23068P(AnonymousClass3HR.LINEAR);
        m23064L(parcel.readFloat(), parcel.readFloat());
        m23065M(parcel.readFloat());
        m23067O(parcel.readFloat());
        m23068P(AnonymousClass3HR.m19240B(parcel.readInt()));
    }

    /* renamed from: B */
    public static float m23056B(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: E */
    public final void mo5436E(AnonymousClass28h anonymousClass28h, AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        anonymousClass28h.m14576F("image", anonymousClass2Vh.getTextureId());
        this.f50099E.m16749C(this.f50097C.f39805B);
        if (this.f50097C == AnonymousClass3HR.RADIAL) {
            this.f50100F.m16740C(this.f50102H.x, this.f50102H.y);
            this.f50101G.m16738C(this.f50103I * 1.5f);
        } else if (this.f50097C == AnonymousClass3HR.LINEAR) {
            this.f50100F.m16740C(this.f50098D.x, this.f50098D.y);
            this.f50101G.m16738C(this.f50106L);
            this.f50105K.m16738C(this.f50096B);
        }
        int jQ = anonymousClass2Vi.jQ();
        int hQ = anonymousClass2Vi.hQ();
        if (jQ == hQ) {
            this.f50104J.m16740C(1.0f, 1.0f);
        } else if (jQ > hQ) {
            this.f50104J.m16740C(((float) jQ) / ((float) hQ), 1.0f);
        } else {
            this.f50104J.m16740C(1.0f, ((float) hQ) / ((float) jQ));
        }
        mo5476N(anonymousClass28h, anonymousClass2Vh, anonymousClass2Vi);
    }

    /* renamed from: F */
    public void mo5475F(AnonymousClass28h anonymousClass28h) {
        this.f50099E = (AnonymousClass2eP) anonymousClass28h.m14572B("blurMode");
        this.f50100F = (AnonymousClass2eM) anonymousClass28h.m14572B("origin");
        this.f50101G = (AnonymousClass2eL) anonymousClass28h.m14572B("outerRadius");
        this.f50105K = (AnonymousClass2eL) anonymousClass28h.m14572B("theta");
        this.f50104J = (AnonymousClass2eM) anonymousClass28h.m14572B("stretchFactor");
    }

    /* renamed from: G */
    public final PointF m23059G() {
        if (this.f50097C == AnonymousClass3HR.RADIAL) {
            return this.f50102H;
        }
        return this.f50097C == AnonymousClass3HR.LINEAR ? this.f50098D : null;
    }

    /* renamed from: H */
    public final float m23060H() {
        if (this.f50097C == AnonymousClass3HR.RADIAL) {
            return this.f50103I;
        }
        return this.f50097C == AnonymousClass3HR.LINEAR ? this.f50106L : -1.0f;
    }

    /* renamed from: I */
    public final float m23061I() {
        return this.f50097C == AnonymousClass3HR.LINEAR ? this.f50096B : -1.0f;
    }

    /* renamed from: J */
    public final void m23062J(float f, float f2) {
        if (this.f50097C == AnonymousClass3HR.RADIAL) {
            m23064L(this.f50102H.x + f, this.f50102H.y + f2);
        } else if (this.f50097C == AnonymousClass3HR.LINEAR) {
            m23064L(this.f50098D.x + f, this.f50098D.y + f2);
        }
    }

    /* renamed from: K */
    public final void m23063K(float f) {
        m23065M(f * (this.f50097C == AnonymousClass3HR.RADIAL ? this.f50103I : this.f50106L));
    }

    /* renamed from: L */
    public final void m23064L(float f, float f2) {
        if (this.f50097C == AnonymousClass3HR.RADIAL) {
            this.f50102H.x = m23056B(f, 0.0f, 1.0f);
            this.f50102H.y = m23056B(f2, 0.0f, 1.0f);
        } else if (this.f50097C == AnonymousClass3HR.LINEAR) {
            this.f50098D.x = m23056B(f, 0.0f, 1.0f);
            this.f50098D.y = m23056B(f2, 0.0f, 1.0f);
        } else {
            return;
        }
        invalidate();
    }

    /* renamed from: M */
    public final void m23065M(float f) {
        float B = m23056B(f, 0.1f, 1.0f);
        if (this.f50097C == AnonymousClass3HR.RADIAL) {
            this.f50103I = B;
        } else if (this.f50097C == AnonymousClass3HR.LINEAR) {
            this.f50106L = B;
        } else {
            return;
        }
        invalidate();
    }

    /* renamed from: O */
    public final void m23067O(float f) {
        if (this.f50097C == AnonymousClass3HR.LINEAR) {
            this.f50096B = f;
            invalidate();
        }
    }

    /* renamed from: P */
    public final void m23068P(AnonymousClass3HR anonymousClass3HR) {
        this.f50097C = anonymousClass3HR;
        if (anonymousClass3HR == AnonymousClass3HR.RADIAL) {
            m23064L(this.f50102H.x, this.f50102H.y);
            m23065M(this.f50103I);
        } else if (this.f50097C == AnonymousClass3HR.LINEAR) {
            m23064L(this.f50098D.x, this.f50098D.y);
            m23065M(this.f50106L);
        }
        invalidate();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f50102H.x);
        parcel.writeFloat(this.f50102H.y);
        parcel.writeFloat(this.f50103I);
        parcel.writeFloat(this.f50098D.x);
        parcel.writeFloat(this.f50098D.y);
        parcel.writeFloat(this.f50106L);
        parcel.writeFloat(this.f50096B);
        parcel.writeInt(this.f50097C.f39805B);
    }
}
