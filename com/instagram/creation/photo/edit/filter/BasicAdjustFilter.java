package com.instagram.creation.photo.edit.filter;

import X.AnonymousClass28h;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass28p;
import X.AnonymousClass2Mf;
import X.AnonymousClass2Mk;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eL;
import X.AnonymousClass2eM;
import X.AnonymousClass2eN;
import X.AnonymousClass3GQ;
import X.AnonymousClass3GR;
import X.AnonymousClass3Hg;
import X.AnonymousClass3Hh;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.util.creation.ShaderBridge;
import org.webrtc.audio.WebRtcAudioRecord;

public class BasicAdjustFilter extends BaseFilter {
    public static final Creator CREATOR = new AnonymousClass3GQ();
    /* renamed from: Z */
    private static final AnonymousClass2Mf f49495Z = AnonymousClass2Mk.m15236B();
    /* renamed from: B */
    public int f49496B;
    /* renamed from: C */
    public AnonymousClass2eL f49497C;
    /* renamed from: D */
    public int f49498D;
    /* renamed from: E */
    public AnonymousClass2eL f49499E;
    /* renamed from: F */
    public int f49500F;
    /* renamed from: G */
    public AnonymousClass2eL f49501G;
    /* renamed from: H */
    public int f49502H;
    /* renamed from: I */
    public AnonymousClass2eL f49503I;
    /* renamed from: J */
    public AnonymousClass2eM f49504J;
    /* renamed from: K */
    public int f49505K;
    /* renamed from: L */
    public AnonymousClass2eL f49506L;
    /* renamed from: M */
    public int f49507M;
    /* renamed from: N */
    public AnonymousClass2eN f49508N;
    /* renamed from: O */
    public int f49509O = 50;
    /* renamed from: P */
    public AnonymousClass2eL f49510P;
    /* renamed from: Q */
    public int f49511Q;
    /* renamed from: R */
    public AnonymousClass2eN f49512R;
    /* renamed from: S */
    public int f49513S = 50;
    /* renamed from: T */
    public AnonymousClass2eL f49514T;
    /* renamed from: U */
    public AnonymousClass2eL f49515U;
    /* renamed from: V */
    public int f49516V;
    /* renamed from: W */
    public AnonymousClass2eL f49517W;
    /* renamed from: X */
    private AnonymousClass28h f49518X;
    /* renamed from: Y */
    private AnonymousClass28p f49519Y = new AnonymousClass28p();

    public BasicAdjustFilter(Parcel parcel) {
        super(parcel);
        this.f49496B = parcel.readInt();
        invalidate();
        this.f49498D = parcel.readInt();
        invalidate();
        this.f49502H = parcel.readInt();
        invalidate();
        this.f49505K = parcel.readInt();
        invalidate();
        this.f49516V = parcel.readInt();
        invalidate();
        this.f49500F = parcel.readInt();
        invalidate();
        this.f49513S = parcel.readInt();
        invalidate();
        this.f49509O = parcel.readInt();
        invalidate();
        this.f49511Q = parcel.readInt();
        invalidate();
        this.f49507M = parcel.readInt();
        invalidate();
    }

    /* renamed from: A */
    public final boolean m22695A() {
        if (this.f49496B == 0 && this.f49498D == 0 && this.f49502H == 0 && this.f49505K == 0 && this.f49516V == 0 && this.f49500F == 0 && this.f49511Q <= 0) {
            if (this.f49507M <= 0) {
                return false;
            }
        }
        return true;
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        super.QE(anonymousClass28k);
        AnonymousClass28h anonymousClass28h = this.f49518X;
        if (anonymousClass28h != null) {
            GLES20.glDeleteProgram(anonymousClass28h.f26592C);
            this.f49518X = null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f49496B);
        parcel.writeInt(this.f49498D);
        parcel.writeInt(this.f49502H);
        parcel.writeInt(this.f49505K);
        parcel.writeInt(this.f49516V);
        parcel.writeInt(this.f49500F);
        parcel.writeInt(this.f49513S);
        parcel.writeInt(this.f49509O);
        parcel.writeInt(this.f49511Q);
        parcel.writeInt(this.f49507M);
    }

    public final void yJA(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        int compileProgram;
        if (!anonymousClass28k.m14591C(this)) {
            compileProgram = ShaderBridge.compileProgram("BasicAdjust");
            if (compileProgram != 0) {
                this.f49518X = new AnonymousClass28h(compileProgram);
                this.f49497C = (AnonymousClass2eL) this.f49518X.m14572B("brightness");
                this.f49499E = (AnonymousClass2eL) this.f49518X.m14572B("contrast");
                this.f49503I = (AnonymousClass2eL) this.f49518X.m14572B("saturation");
                this.f49506L = (AnonymousClass2eL) this.f49518X.m14572B("temperature");
                this.f49517W = (AnonymousClass2eL) this.f49518X.m14572B("vignette");
                this.f49501G = (AnonymousClass2eL) this.f49518X.m14572B("fade");
                this.f49514T = (AnonymousClass2eL) this.f49518X.m14572B("tintShadowsIntensity");
                this.f49510P = (AnonymousClass2eL) this.f49518X.m14572B("tintHighlightsIntensity");
                this.f49512R = (AnonymousClass2eN) this.f49518X.m14572B("tintShadowsColor");
                this.f49508N = (AnonymousClass2eN) this.f49518X.m14572B("tintHighlightsColor");
                this.f49515U = (AnonymousClass2eL) this.f49518X.m14572B("TOOL_ON_EPSILON");
                this.f49504J = (AnonymousClass2eM) this.f49518X.m14572B("stretchFactor");
                anonymousClass28k.m14593E(this);
            } else {
                throw new IllegalStateException("Could not compile Basic Adjust program.");
            }
        }
        AnonymousClass28h anonymousClass28h = this.f49518X;
        this.f49497C.m16738C(((float) this.f49496B) / 100.0f);
        this.f49499E.m16738C(((float) this.f49498D) / 100.0f);
        this.f49503I.m16738C(((float) this.f49502H) / 100.0f);
        this.f49506L.m16738C(((float) this.f49505K) / 100.0f);
        this.f49517W.m16738C(((float) this.f49516V) / 100.0f);
        this.f49501G.m16738C(((float) this.f49500F) / 100.0f);
        this.f49514T.m16738C(((float) this.f49513S) / 100.0f);
        this.f49510P.m16738C(((float) this.f49509O) / 100.0f);
        this.f49515U.m16738C(0.009f);
        compileProgram = this.f49511Q;
        AnonymousClass2eN anonymousClass2eN = this.f49512R;
        switch (AnonymousClass3GR.f39662B[AnonymousClass3Hh.m19266B(Math.min(compileProgram, AnonymousClass3Hg.values().length - 1)).ordinal()]) {
            case 1:
                anonymousClass2eN.m16742C(0.0f, 0.0f, 0.0f);
                break;
            case 2:
                anonymousClass2eN.m16742C(1.0f, 1.0f, 0.0f);
                break;
            case 3:
                anonymousClass2eN.m16742C(1.0f, 0.5f, 0.0f);
                break;
            case 4:
                anonymousClass2eN.m16742C(1.0f, 0.0f, 0.0f);
                break;
            case 5:
                anonymousClass2eN.m16742C(1.0f, 0.0f, 1.0f);
                break;
            case 6:
                anonymousClass2eN.m16742C(0.5f, 0.0f, 1.0f);
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                anonymousClass2eN.m16742C(0.0f, 0.0f, 1.0f);
                break;
            case 8:
                anonymousClass2eN.m16742C(0.0f, 1.0f, 1.0f);
                break;
            case 9:
                anonymousClass2eN.m16742C(0.0f, 1.0f, 0.0f);
                break;
            default:
                break;
        }
        compileProgram = this.f49507M;
        anonymousClass2eN = this.f49508N;
        switch (AnonymousClass3GR.f39662B[AnonymousClass3Hg.values()[Math.min(compileProgram, AnonymousClass3Hg.values().length - 1)].ordinal()]) {
            case 1:
                anonymousClass2eN.m16742C(1.0f, 1.0f, 1.0f);
                break;
            case 2:
                anonymousClass2eN.m16742C(1.0f, 1.0f, 0.0f);
                break;
            case 3:
                anonymousClass2eN.m16742C(1.0f, 0.5f, 0.0f);
                break;
            case 4:
                anonymousClass2eN.m16742C(1.0f, 0.0f, 0.0f);
                break;
            case 5:
                anonymousClass2eN.m16742C(1.0f, 0.0f, 1.0f);
                break;
            case 6:
                anonymousClass2eN.m16742C(0.5f, 0.0f, 1.0f);
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                anonymousClass2eN.m16742C(0.0f, 0.0f, 1.0f);
                break;
            case 8:
                anonymousClass2eN.m16742C(0.0f, 1.0f, 1.0f);
                break;
            case 9:
                anonymousClass2eN.m16742C(0.0f, 1.0f, 0.0f);
                break;
            default:
                break;
        }
        anonymousClass28h.m14576F("image", anonymousClass2Vh.getTextureId());
        int jQ = anonymousClass2Vi.jQ();
        int hQ = anonymousClass2Vi.hQ();
        if (jQ == hQ) {
            this.f49504J.m16740C(1.0f, 1.0f);
        } else if (jQ > hQ) {
            this.f49504J.m16740C(((float) jQ) / ((float) hQ), 1.0f);
        } else {
            this.f49504J.m16740C(1.0f, ((float) hQ) / ((float) jQ));
        }
        AnonymousClass28j.m14579B("BasicAdjustFilter.render:setFilterParams");
        this.f49518X.m14574D("position", 2, 8, f49495Z.f29571C);
        this.f49518X.m14574D("transformedTextureCoordinate", 2, 8, f49495Z.f29572D);
        this.f49518X.m14574D("staticTextureCoordinate", 2, 8, f49495Z.f29572D);
        AnonymousClass28j.m14579B("BasicAdjustFilter.render:setCoordinates");
        GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
        AnonymousClass28j.m14579B("BasicAdjustFilter.render:glBindFramebuffer");
        anonymousClass2Vi.RU(this.f49519Y);
        GLES20.glViewport(this.f49519Y.f26617D, this.f49519Y.f26618E, this.f49519Y.f26616C, this.f49519Y.f26615B);
        AnonymousClass28j.m14579B("BasicAdjustFilter.render:glViewport");
        this.f49518X.m14573C();
        AnonymousClass28j.m14579B("BasicAdjustFilter.render:prepareToRender");
        GLES20.glDrawArrays(5, 0, 4);
        AnonymousClass28j.m14579B("BasicAdjustFilter.render:glDrawArrays");
        cb();
        anonymousClass28k.m14596H(anonymousClass2Vh, null);
    }
}
