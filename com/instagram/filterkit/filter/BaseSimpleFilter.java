package com.instagram.filterkit.filter;

import X.AnonymousClass28h;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass28p;
import X.AnonymousClass2Mf;
import X.AnonymousClass2Mk;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass3Oq;
import X.AnonymousClass3Or;
import android.opengl.GLES20;
import android.os.Parcel;

public abstract class BaseSimpleFilter extends BaseFilter {
    /* renamed from: F */
    private static final AnonymousClass2Mf f49553F = AnonymousClass2Mk.m15236B();
    /* renamed from: B */
    private int f49554B = Integer.MAX_VALUE;
    /* renamed from: C */
    private AnonymousClass28h f49555C;
    /* renamed from: D */
    private AnonymousClass3Or f49556D;
    /* renamed from: E */
    private AnonymousClass28p f49557E = new AnonymousClass28p();

    /* renamed from: A */
    public void mo5432A(AnonymousClass2Vi anonymousClass2Vi) {
    }

    /* renamed from: B */
    public abstract AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k);

    /* renamed from: C */
    public boolean mo5434C() {
        return false;
    }

    /* renamed from: D */
    public void mo5435D(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
    }

    /* renamed from: E */
    public abstract void mo5436E(AnonymousClass28h anonymousClass28h, AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi);

    public BaseSimpleFilter(Parcel parcel) {
        super(parcel);
    }

    public void QE(AnonymousClass28k anonymousClass28k) {
        super.QE(anonymousClass28k);
        AnonymousClass28h anonymousClass28h = this.f49555C;
        if (anonymousClass28h != null) {
            GLES20.glDeleteProgram(anonymousClass28h.f26592C);
            this.f49555C = null;
        }
    }

    public final void QPA(int i) {
        this.f49554B = i;
    }

    public void yJA(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        if (!anonymousClass28k.m14591C(this)) {
            StringBuilder stringBuilder;
            if (this.f49555C == null) {
                AnonymousClass28h B = mo5433B(anonymousClass28k);
                this.f49555C = B;
                if (B != null) {
                    this.f49556D = new AnonymousClass3Or(B);
                    anonymousClass28k.m14593E(this);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not create program for ");
                    stringBuilder.append(getClass().getSimpleName());
                    throw new AnonymousClass3Oq(stringBuilder.toString());
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Filter program already initialized with different glResources ");
            stringBuilder.append(getClass().getSimpleName());
            throw new AnonymousClass3Oq(stringBuilder.toString());
        }
        mo5436E(this.f49555C, anonymousClass28k, anonymousClass2Vh, anonymousClass2Vi);
        AnonymousClass28j.m14579B("BaseSimpleFilter.render:setFilterParams");
        this.f49555C.m14574D("position", 2, 8, f49553F.f29571C);
        this.f49555C.m14574D("transformedTextureCoordinate", 2, 8, mo5434C() ? f49553F.f29570B : f49553F.f29572D);
        this.f49555C.m14574D("staticTextureCoordinate", 2, 8, f49553F.f29572D);
        AnonymousClass28j.m14579B("BaseSimpleFilter.render:setCoordinates");
        GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
        AnonymousClass28j.m14579B("BaseSimpleFilter.render:glBindFramebuffer");
        mo5432A(anonymousClass2Vi);
        anonymousClass2Vi.RU(this.f49557E);
        this.f49556D.m19522A(this.f49557E, this.f49554B);
        cb();
        mo5435D(anonymousClass28k, anonymousClass2Vh, anonymousClass2Vi);
        anonymousClass28k.m14596H(anonymousClass2Vh, null);
    }
}
