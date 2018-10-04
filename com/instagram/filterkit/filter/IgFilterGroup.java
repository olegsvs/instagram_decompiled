package com.instagram.filterkit.filter;

import X.AnonymousClass0ch;
import X.AnonymousClass28j;
import X.AnonymousClass28k;
import X.AnonymousClass2Vh;
import X.AnonymousClass2Vi;
import X.AnonymousClass2eX;
import X.AnonymousClass3Og;
import X.AnonymousClass3Ok;
import X.AnonymousClass3Ol;
import X.AnonymousClass3Ot;
import X.AnonymousClass40S;
import X.AnonymousClass4YO;
import X.AnonymousClass5Ug;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.forker.Process;
import com.instagram.common.math.Matrix4;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class IgFilterGroup implements IgFilter {
    public static final Creator CREATOR = new AnonymousClass3Ok();
    /* renamed from: B */
    public AnonymousClass3Ot f48231B;
    /* renamed from: C */
    public final float[] f48232C;
    /* renamed from: D */
    public AnonymousClass5Ug f48233D;
    /* renamed from: E */
    public Matrix4 f48234E;
    /* renamed from: F */
    public final AnonymousClass0ch f48235F;
    /* renamed from: G */
    private final SortedMap f48236G;
    /* renamed from: H */
    private final AnonymousClass3Og f48237H;
    /* renamed from: I */
    private boolean f48238I;

    public final boolean EY() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public IgFilterGroup(AnonymousClass0ch anonymousClass0ch) {
        this.f48236G = new TreeMap();
        this.f48237H = new AnonymousClass3Og();
        this.f48232C = new float[3];
        this.f48238I = false;
        this.f48231B = new AnonymousClass40S(this);
        this.f48235F = anonymousClass0ch;
    }

    public IgFilterGroup(Parcel parcel) {
        this.f48236G = new TreeMap();
        this.f48237H = new AnonymousClass3Og();
        this.f48232C = new float[3];
        this.f48238I = false;
        this.f48231B = new AnonymousClass40S(this);
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            AnonymousClass3Ol anonymousClass3Ol = new AnonymousClass3Ol(this, (IgFilter) parcel.readParcelable(getClass().getClassLoader()));
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            anonymousClass3Ol.f40788B = z;
            this.f48236G.put(Integer.valueOf(readInt2), anonymousClass3Ol);
        }
        this.f48235F = AnonymousClass0ch.valueOf(parcel.readString());
    }

    /* renamed from: A */
    public final void m22012A(boolean z) {
        if (this.f48238I != z) {
            this.f48238I = z;
        }
    }

    /* renamed from: B */
    public final synchronized IgFilter m22013B(int i) {
        AnonymousClass3Ol anonymousClass3Ol = (AnonymousClass3Ol) this.f48236G.get(Integer.valueOf(i));
        if (anonymousClass3Ol == null) {
            return null;
        }
        return anonymousClass3Ol.f40789C;
    }

    /* renamed from: C */
    public final boolean m22014C(int i) {
        return this.f48236G.containsKey(Integer.valueOf(i)) && ((AnonymousClass3Ol) this.f48236G.get(Integer.valueOf(i))).f40788B;
    }

    /* renamed from: D */
    public final IgFilterGroup m22015D() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        return new IgFilterGroup(obtain);
    }

    /* renamed from: E */
    public final void m22016E(float[] fArr) {
        for (int i = 0; i < 3; i++) {
            this.f48232C[i] = fArr[i];
        }
    }

    /* renamed from: F */
    public final synchronized void m22017F(int i, IgFilter igFilter) {
        this.f48236G.put(Integer.valueOf(i), new AnonymousClass3Ol(this, igFilter));
        if (igFilter != null) {
            igFilter.invalidate();
        }
    }

    /* renamed from: G */
    public final synchronized void m22018G(int i, boolean z) {
        if (this.f48236G.containsKey(Integer.valueOf(i))) {
            ((AnonymousClass3Ol) this.f48236G.get(Integer.valueOf(i))).f40788B = z;
            if (((AnonymousClass3Ol) this.f48236G.get(Integer.valueOf(i))).f40789C != null) {
                ((AnonymousClass3Ol) this.f48236G.get(Integer.valueOf(i))).f40789C.invalidate();
            }
        }
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        this.f48237H.QE(anonymousClass28k);
    }

    public final void QPA(int i) {
        for (Entry value : this.f48236G.entrySet()) {
            ((AnonymousClass3Ol) value.getValue()).f40789C.QPA(i);
        }
    }

    public final void cb() {
        for (Entry entry : this.f48236G.entrySet()) {
            if (((AnonymousClass3Ol) entry.getValue()).f40789C != null) {
                ((AnonymousClass3Ol) entry.getValue()).f40789C.cb();
            }
        }
    }

    public final void invalidate() {
        for (Entry entry : this.f48236G.entrySet()) {
            if (((AnonymousClass3Ol) entry.getValue()).f40788B && ((AnonymousClass3Ol) entry.getValue()).f40789C != null) {
                ((AnonymousClass3Ol) entry.getValue()).f40789C.invalidate();
            }
        }
    }

    public final synchronized boolean kX() {
        for (Entry entry : this.f48236G.entrySet()) {
            if (((AnonymousClass3Ol) entry.getValue()).f40788B && ((AnonymousClass3Ol) entry.getValue()).f40789C != null && ((AnonymousClass3Ol) entry.getValue()).f40789C.kX()) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f48236G.size());
        for (Entry entry : this.f48236G.entrySet()) {
            parcel.writeInt(((Integer) entry.getKey()).intValue());
            parcel.writeParcelable(((AnonymousClass3Ol) entry.getValue()).f40789C, i);
            parcel.writeInt(((AnonymousClass3Ol) entry.getValue()).f40788B);
        }
        parcel.writeString(this.f48235F.toString());
    }

    public final synchronized void yJA(AnonymousClass28k anonymousClass28k, AnonymousClass2Vh anonymousClass2Vh, AnonymousClass2Vi anonymousClass2Vi) {
        if (this.f48233D != null) {
            AnonymousClass5Ug anonymousClass5Ug = this.f48233D;
            synchronized (anonymousClass5Ug.f65042I) {
                PhotoFilter B = AnonymousClass5Ug.B(anonymousClass5Ug, anonymousClass5Ug.f65035B);
                PhotoFilter B2 = AnonymousClass5Ug.B(anonymousClass5Ug, anonymousClass5Ug.f65041H);
                switch (AnonymousClass4YO.f55139B[anonymousClass5Ug.f65040G.ordinal()]) {
                    case 1:
                        AnonymousClass5Ug.C(anonymousClass5Ug, B, B2, anonymousClass5Ug.f65043J);
                        break;
                    case 2:
                        AnonymousClass5Ug.C(anonymousClass5Ug, B2, B, anonymousClass5Ug.f65043J);
                        break;
                    case 3:
                    case 4:
                        anonymousClass5Ug.f65037D.m22017F(15, B);
                        anonymousClass5Ug.f65037D.m22017F(16, null);
                        B.m23010H(0, Integer.MAX_VALUE, false);
                        B.m23008F(anonymousClass5Ug.f65036C);
                        B.m23011I(anonymousClass5Ug.f65039F);
                        B.m23014L(anonymousClass5Ug.f65045L);
                        break;
                    default:
                        break;
                }
            }
        }
        GLES20.glBindFramebuffer(36160, anonymousClass2Vi.QM());
        AnonymousClass28j.m14579B("IgFilterGroup.clearFrameBuffer:glBindFramebuffer");
        float[] fArr = this.f48232C;
        GLES20.glClearColor(fArr[0], fArr[1], fArr[2], 1.0f);
        GLES20.glClear(16384);
        int jQ = anonymousClass2Vi.jQ();
        int hQ = anonymousClass2Vi.hQ();
        int i = Process.WAIT_RESULT_TIMEOUT;
        for (Entry entry : this.f48236G.entrySet()) {
            IgFilter igFilter = ((AnonymousClass3Ol) entry.getValue()).f40789C;
            if (!(!((AnonymousClass3Ol) entry.getValue()).f40788B || igFilter == null || igFilter.EY())) {
                i = ((Integer) entry.getKey()).intValue();
            }
        }
        int i2 = 0;
        Entry entry2 = null;
        int i3 = 0;
        Object obj = null;
        AnonymousClass2eX anonymousClass2eX = null;
        for (Entry entry3 : this.f48236G.entrySet()) {
            igFilter = ((AnonymousClass3Ol) entry3.getValue()).f40789C;
            if (((AnonymousClass3Ol) entry3.getValue()).f40788B) {
                if (igFilter != null) {
                    if (!igFilter.kX() && obj == null) {
                        if (((Integer) entry3.getKey()).intValue() != i) {
                            AnonymousClass2eX C = this.f48237H.m19520C(igFilter, jQ, hQ, anonymousClass28k);
                            if (C != null) {
                                if (entry2 != null && (!this.f48231B.ATA(((Integer) entry2.getKey()).intValue()) || this.f48238I)) {
                                    this.f48237H.m19519B(((AnonymousClass3Ol) entry2.getValue()).f40789C, anonymousClass28k);
                                }
                                entry2 = entry3;
                                anonymousClass2eX = C;
                            } else {
                                i3 = i2;
                                i2 = ((Integer) entry3.getKey()).intValue();
                            }
                        }
                    }
                    if (obj != null) {
                        igFilter.invalidate();
                    }
                    this.f48237H.m19519B(igFilter, anonymousClass28k);
                    obj = 1;
                }
            }
            if (igFilter != null && igFilter.kX()) {
                igFilter.cb();
                obj = 1;
            }
            this.f48237H.m19519B(igFilter, anonymousClass28k);
        }
        if (i2 == i && (entry2 == null || ((Integer) entry2.getKey()).intValue() < i3)) {
            i2 = i3;
        }
        if (this.f48238I) {
            AnonymousClass2Vh anonymousClass2Vh2 = null;
        }
        AnonymousClass2Vi anonymousClass2Vi2 = null;
        for (Entry entry4 : this.f48236G.entrySet()) {
            IgFilter igFilter2 = ((AnonymousClass3Ol) entry4.getValue()).f40789C;
            if (((AnonymousClass3Ol) entry4.getValue()).f40788B && igFilter2 != null) {
                if (anonymousClass2Vh2 == null || ((Integer) entry2.getKey()).intValue() < ((Integer) entry4.getKey()).intValue()) {
                    AnonymousClass2Vi anonymousClass2Vi3;
                    AnonymousClass2Vh anonymousClass2Vh3 = anonymousClass2Vi2 == null ? anonymousClass2Vh2 == null ? anonymousClass2Vh : anonymousClass2Vh2 : igFilter2.EY() ? null : (AnonymousClass2eX) anonymousClass2Vi2;
                    if (((Integer) entry4.getKey()).intValue() >= i) {
                        anonymousClass2Vi3 = anonymousClass2Vi;
                    } else if ((((Integer) entry4.getKey()).intValue() == i2 || this.f48231B.ATA(((Integer) entry4.getKey()).intValue())) && !this.f48238I) {
                        anonymousClass2Vi3 = this.f48237H.m19518A(igFilter2, jQ, hQ, anonymousClass28k);
                    } else {
                        anonymousClass2Vi3 = anonymousClass28k.m14594F(jQ, hQ);
                    }
                    igFilter2.yJA(anonymousClass28k, anonymousClass2Vh3, anonymousClass2Vi3);
                    AnonymousClass3Ol anonymousClass3Ol = (AnonymousClass3Ol) entry4.getValue();
                    Integer.valueOf(jQ);
                    Integer.valueOf(hQ);
                    anonymousClass2Vi2 = anonymousClass2Vi3;
                }
            }
        }
    }
}
