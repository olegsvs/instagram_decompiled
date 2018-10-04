package com.instagram.creation.photo.edit.filter;

import X.AnonymousClass28e;
import X.AnonymousClass28f;
import X.AnonymousClass28h;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass28p;
import X.AnonymousClass2Mf;
import X.AnonymousClass2Mk;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eL;
import X.AnonymousClass2eX;
import X.AnonymousClass3GS;
import X.AnonymousClass3GY;
import X.AnonymousClass3Og;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.common.dextricks.DexStore;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.util.creation.ShaderBridge;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BlurredLumAdjustFilter extends BaseFilter {
    public static final Creator CREATOR = new AnonymousClass3GS();
    /* renamed from: P */
    public static final float[] f49520P = new float[14];
    /* renamed from: Q */
    public static final float[] f49521Q = new float[]{0.0f, 0.0f, 0.0612549f, 0.185368f, 0.16381f, 0.365771f, 0.320955f, 0.527539f, 0.496851f, 0.659237f, 0.709977f, 0.79987f, 1.0f, 1.0f};
    /* renamed from: R */
    private static final AnonymousClass2Mf f49522R = AnonymousClass2Mk.m15236B();
    /* renamed from: B */
    public boolean f49523B;
    /* renamed from: C */
    public final AnonymousClass3Og f49524C = new AnonymousClass3Og();
    /* renamed from: D */
    public int f49525D;
    /* renamed from: E */
    public AnonymousClass2eL f49526E;
    /* renamed from: F */
    public int f49527F;
    /* renamed from: G */
    public final GaussianBlurFilter f49528G = new GaussianBlurFilter();
    /* renamed from: H */
    public AnonymousClass2eL f49529H;
    /* renamed from: I */
    public int f49530I;
    /* renamed from: J */
    public final GaussianBlurFilter f49531J = new GaussianBlurFilter();
    /* renamed from: K */
    public AnonymousClass2eL f49532K;
    /* renamed from: L */
    public AnonymousClass2Vh f49533L;
    /* renamed from: M */
    public AnonymousClass2eL f49534M;
    /* renamed from: N */
    private AnonymousClass28h f49535N;
    /* renamed from: O */
    private AnonymousClass28p f49536O = new AnonymousClass28p();

    static {
        for (int i = 0; i < 7; i++) {
            float[] fArr = f49520P;
            int i2 = i * 2;
            float[] fArr2 = f49521Q;
            int i3 = i2 + 1;
            fArr[i2] = fArr2[i3];
            fArr[i3] = fArr2[i2];
        }
    }

    public BlurredLumAdjustFilter() {
        this.f49531J.m22700A(0.8f);
    }

    public BlurredLumAdjustFilter(Parcel parcel) {
        super(parcel);
        this.f49531J.m22700A(0.8f);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f49523B = z;
        this.f49525D = parcel.readInt();
        super.invalidate();
        this.f49527F = parcel.readInt();
        super.invalidate();
        this.f49530I = parcel.readInt();
        super.invalidate();
    }

    /* renamed from: A */
    public final boolean m22696A() {
        if (this.f49525D == 0 && this.f49527F == 0) {
            if (this.f49530I == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public final void m22697B(int i) {
        this.f49525D = i;
        super.invalidate();
    }

    /* renamed from: C */
    public final void m22698C(int i) {
        this.f49527F = i;
        super.invalidate();
    }

    /* renamed from: D */
    public final void m22699D(int i) {
        this.f49530I = i;
        super.invalidate();
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        this.f49528G.QE(anonymousClass28k);
        this.f49531J.QE(anonymousClass28k);
        super.QE(anonymousClass28k);
        AnonymousClass28h anonymousClass28h = this.f49535N;
        if (anonymousClass28h != null) {
            GLES20.glDeleteProgram(anonymousClass28h.f26592C);
            this.f49535N = null;
        }
        AnonymousClass2Vh anonymousClass2Vh = this.f49533L;
        if (anonymousClass2Vh != null) {
            AnonymousClass28j.m14585H(anonymousClass2Vh.getTextureId());
            this.f49533L = null;
        }
        this.f49524C.QE(anonymousClass28k);
    }

    public final void cb() {
        super.cb();
        this.f49531J.cb();
        this.f49528G.cb();
    }

    public final void invalidate() {
        super.invalidate();
        this.f49531J.invalidate();
        this.f49528G.invalidate();
    }

    public final boolean kX() {
        if (!(super.kX() || this.f49531J.kX())) {
            if (!this.f49528G.kX()) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f49523B);
        parcel.writeInt(this.f49525D);
        parcel.writeInt(this.f49527F);
        parcel.writeInt(this.f49530I);
    }

    public final void yJA(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        if (!anonymousClass28k.m14591C(this)) {
            int compileProgram = ShaderBridge.compileProgram("BlurredLumAdjust");
            if (compileProgram != 0) {
                this.f49535N = new AnonymousClass28h(compileProgram);
                this.f49526E = (AnonymousClass2eL) this.f49535N.m14572B("highlights");
                this.f49529H = (AnonymousClass2eL) this.f49535N.m14572B("shadows");
                this.f49532K = (AnonymousClass2eL) this.f49535N.m14572B("sharpen");
                this.f49534M = (AnonymousClass2eL) this.f49535N.m14572B("TOOL_ON_EPSILON");
                anonymousClass28k.m14593E(this);
            } else {
                throw new IllegalStateException("Could not compile Basic Adjust program.");
            }
        }
        AnonymousClass28h anonymousClass28h = this.f49535N;
        this.f49526E.m16738C(((float) this.f49525D) / 100.0f);
        this.f49529H.m16738C(((float) this.f49527F) / 100.0f);
        this.f49532K.m16738C(((float) this.f49530I) / 100.0f);
        this.f49534M.m16738C(0.009f);
        anonymousClass28h.m14576F("image", anonymousClass2Vh.getTextureId());
        boolean z = anonymousClass2Vh instanceof AnonymousClass2eX;
        if (z) {
            anonymousClass28k.m14598J((AnonymousClass2eX) anonymousClass2Vh, this);
        }
        AnonymousClass2Vh C = this.f49524C.m19520C(this.f49531J, anonymousClass2Vi.jQ(), anonymousClass2Vi.hQ(), anonymousClass28k);
        if (C == null) {
            C = this.f49524C.m19518A(this.f49531J, anonymousClass2Vi.jQ(), anonymousClass2Vi.hQ(), anonymousClass28k);
            this.f49531J.yJA(anonymousClass28k, anonymousClass2Vh, C);
        }
        anonymousClass28h.m14577G("sharpenBlur", C.getTextureId(), AnonymousClass28f.NEAREST, AnonymousClass28e.CLAMP);
        if (((float) Math.abs(this.f49527F)) > 0.009f || ((float) Math.abs(this.f49525D)) > 0.009f) {
            AnonymousClass2Vh C2 = this.f49524C.m19520C(this.f49528G, anonymousClass2Vi.jQ(), anonymousClass2Vi.hQ(), anonymousClass28k);
            if (C2 == null) {
                C2 = this.f49524C.m19518A(this.f49528G, anonymousClass2Vi.jQ(), anonymousClass2Vi.hQ(), anonymousClass28k);
                this.f49528G.m22700A((((float) anonymousClass2Vi.jQ()) * 1.2f) / 640.0f);
                this.f49528G.yJA(anonymousClass28k, anonymousClass2Vh, C2);
            }
            anonymousClass28h.m14577G("shadowsBlur", C2.getTextureId(), AnonymousClass28f.NEAREST, AnonymousClass28e.CLAMP);
            String str = "splines";
            if (this.f49533L == null) {
                Buffer allocate = ByteBuffer.allocate(DexStore.LOAD_RESULT_DEX2OAT_QUICKENED);
                new AnonymousClass3GY(f49521Q).m19210A(allocate, 0, 256);
                new AnonymousClass3GY(f49520P).m19210A(allocate, 256, 256);
                this.f49533L = AnonymousClass28j.m14582E(3553, 0, 6409, 256, 2, 0, 6409, 5121, allocate);
            }
            anonymousClass28h.m14576F(str, this.f49533L.getTextureId());
        }
        if (z) {
            anonymousClass28k.m14597I((AnonymousClass2eX) anonymousClass2Vh, this);
        }
        AnonymousClass28j.m14579B("BlurredLumAdjustFilter.render:setFilterParams");
        this.f49535N.m14574D("position", 2, 8, f49522R.f29571C);
        this.f49535N.m14574D("transformedTextureCoordinate", 2, 8, f49522R.f29572D);
        this.f49535N.m14574D("staticTextureCoordinate", 2, 8, f49522R.f29572D);
        AnonymousClass28j.m14579B("BlurredLumAdjustFilter.render:setCoordinates");
        GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
        AnonymousClass28j.m14579B("BlurredLumAdjustFilter.render:glBindFramebuffer");
        anonymousClass2Vi.RU(this.f49536O);
        GLES20.glViewport(this.f49536O.f26617D, this.f49536O.f26618E, this.f49536O.f26616C, this.f49536O.f26615B);
        AnonymousClass28j.m14579B("BlurredLumAdjustFilter.render:glViewport");
        this.f49535N.m14573C();
        AnonymousClass28j.m14579B("BlurredLumAdjustFilter.render:prepareToRender");
        GLES20.glDrawArrays(5, 0, 4);
        AnonymousClass28j.m14579B("BlurredLumAdjustFilter.render:glDrawArrays");
        cb();
        if (!this.f49523B) {
            this.f49524C.m19519B(this.f49531J, anonymousClass28k);
            this.f49524C.m19519B(this.f49528G, anonymousClass28k);
        }
        anonymousClass28k.m14596H(anonymousClass2Vh, null);
    }
}
