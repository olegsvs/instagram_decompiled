package com.instagram.creation.photo.edit.effectfilter;

import X.AnonymousClass0ch;
import X.AnonymousClass0ci;
import X.AnonymousClass28h;
import X.AnonymousClass28k;
import X.AnonymousClass28q;
import X.AnonymousClass2Vh;
import X.AnonymousClass2eF;
import X.AnonymousClass2eJ;
import X.AnonymousClass2eK;
import X.AnonymousClass2eL;
import X.AnonymousClass3GO;
import X.AnonymousClass3Gc;
import X.AnonymousClass3Oh;
import X.AnonymousClass3Oi;
import X.AnonymousClass3Ox;
import X.AnonymousClass3UU;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.common.math.Matrix3;
import com.instagram.common.math.Matrix4;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.model.filterkit.TextureAsset;
import com.instagram.util.creation.ShaderBridge;
import java.util.LinkedList;
import java.util.List;

public class PhotoFilter extends BaseSimpleFilter {
    public static final Creator CREATOR = new AnonymousClass3GO();
    /* renamed from: B */
    public AnonymousClass3Gc f50024B;
    /* renamed from: C */
    public boolean f50025C;
    /* renamed from: D */
    public int f50026D;
    /* renamed from: E */
    public int f50027E;
    /* renamed from: F */
    public final AnonymousClass2Vh[] f50028F;
    /* renamed from: G */
    public final int f50029G;
    /* renamed from: H */
    public boolean f50030H;
    /* renamed from: I */
    public int f50031I;
    /* renamed from: J */
    public float f50032J;
    /* renamed from: K */
    public Matrix4 f50033K;
    /* renamed from: L */
    private AnonymousClass2eL f50034L;
    /* renamed from: M */
    private AnonymousClass2eL f50035M;
    /* renamed from: N */
    private AnonymousClass3Oh f50036N;
    /* renamed from: O */
    private AnonymousClass2eL f50037O;
    /* renamed from: P */
    private AnonymousClass2eF f50038P;
    /* renamed from: Q */
    private AnonymousClass2eL f50039Q;
    /* renamed from: R */
    private boolean f50040R;
    /* renamed from: S */
    private final Matrix3 f50041S;
    /* renamed from: T */
    private boolean f50042T;
    /* renamed from: U */
    private int f50043U;
    /* renamed from: V */
    private AnonymousClass2eL f50044V;
    /* renamed from: W */
    private int f50045W;
    /* renamed from: X */
    private AnonymousClass2eL f50046X;
    /* renamed from: Y */
    private AnonymousClass2eF f50047Y;
    /* renamed from: Z */
    private final AnonymousClass0ch f50048Z;
    /* renamed from: a */
    private final String f50049a;
    /* renamed from: b */
    private final List f50050b;
    /* renamed from: c */
    private AnonymousClass2eF f50051c;
    /* renamed from: d */
    private AnonymousClass2eJ f50052d;
    /* renamed from: e */
    private AnonymousClass2eF f50053e;
    /* renamed from: f */
    private AnonymousClass2eK f50054f;
    /* renamed from: g */
    private AnonymousClass2eL f50055g;

    public PhotoFilter(AnonymousClass3UU anonymousClass3UU, AnonymousClass0ch anonymousClass0ch) {
        this.f50041S = new Matrix3();
        this.f50024B = null;
        this.f50025C = false;
        this.f50029G = anonymousClass3UU.f41614D;
        List list = anonymousClass3UU.f41619I;
        this.f50050b = list;
        this.f50028F = new AnonymousClass2Vh[list.size()];
        this.f50049a = anonymousClass3UU.f41618H;
        m23009G(100);
        m23011I(false);
        m23010H(0, Integer.MAX_VALUE, false);
        this.f50048Z = anonymousClass0ch;
        this.f50036N = AnonymousClass3Oi.m19521B(anonymousClass3UU);
    }

    public PhotoFilter(Parcel parcel) {
        super(parcel);
        this.f50041S = new Matrix3();
        this.f50024B = null;
        boolean z = false;
        this.f50025C = false;
        this.f50029G = parcel.readInt();
        List linkedList = new LinkedList();
        this.f50050b = linkedList;
        parcel.readTypedList(linkedList, TextureAsset.CREATOR);
        this.f50028F = new AnonymousClass2Vh[this.f50050b.size()];
        this.f50049a = parcel.readString();
        m23009G(parcel.readInt());
        m23008F(parcel.readInt());
        m23012J(parcel.readInt());
        m23013K(parcel.readFloat());
        m23011I(parcel.readInt() == 1);
        this.f50025C = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() == 1) {
            z = true;
        }
        m23010H(readInt, readInt2, z);
        this.f50048Z = AnonymousClass0ch.valueOf(parcel.readString());
        this.f50033K = (Matrix4) parcel.readParcelable(Matrix4.class.getClassLoader());
        AnonymousClass3UU B = AnonymousClass3Ox.m19525B().m19527B(this.f50029G);
        if (B != null) {
            this.f50036N = AnonymousClass3Oi.m19521B(B);
        }
    }

    /* renamed from: B */
    public final AnonymousClass28h mo5433B(AnonymousClass28k anonymousClass28k) {
        int compileProgram = ShaderBridge.compileProgram(this.f50049a);
        if (compileProgram == 0) {
            return null;
        }
        AnonymousClass28h anonymousClass28h = new AnonymousClass28h(compileProgram);
        for (int i = 0; i < this.f50050b.size(); i++) {
            TextureAsset textureAsset = (TextureAsset) this.f50050b.get(i);
            this.f50028F[i] = anonymousClass28k.m14592D(this, textureAsset.f41633C);
            anonymousClass28h.m14576F(textureAsset.f41632B, this.f50028F[i].getTextureId());
        }
        anonymousClass28h.m14576F("noop", anonymousClass28k.m14592D(this, "shared/noop.png").getTextureId());
        this.f50051c = (AnonymousClass2eF) anonymousClass28h.m14572B("u_enableTextureTransform");
        this.f50052d = (AnonymousClass2eJ) anonymousClass28h.m14572B("u_textureTransform");
        this.f50047Y = (AnonymousClass2eF) anonymousClass28h.m14572B("u_mirrored");
        this.f50038P = (AnonymousClass2eF) anonymousClass28h.m14572B("u_flipped");
        this.f50037O = (AnonymousClass2eL) anonymousClass28h.m14572B("u_filterStrength");
        this.f50055g = (AnonymousClass2eL) anonymousClass28h.m14572B("u_width");
        this.f50039Q = (AnonymousClass2eL) anonymousClass28h.m14572B("u_height");
        this.f50046X = (AnonymousClass2eL) anonymousClass28h.m14572B("u_min");
        this.f50044V = (AnonymousClass2eL) anonymousClass28h.m14572B("u_max");
        this.f50035M = (AnonymousClass2eL) anonymousClass28h.m14572B("brightness_correction_mult");
        this.f50034L = (AnonymousClass2eL) anonymousClass28h.m14572B("brightness_correction_add");
        this.f50053e = (AnonymousClass2eF) anonymousClass28h.m14572B("u_enableVertexTransform");
        this.f50054f = (AnonymousClass2eK) anonymousClass28h.m14572B("u_vertexTransform");
        AnonymousClass3Oh anonymousClass3Oh = this.f50036N;
        if (anonymousClass3Oh != null) {
            anonymousClass3Oh.oF(anonymousClass28h);
        }
        return anonymousClass28h;
    }

    /* renamed from: C */
    public final boolean mo5434C() {
        return (AnonymousClass0ci.B(this.f50048Z).f7232C || this.f50040R) ? false : true;
    }

    /* renamed from: E */
    public final void mo5436E(X.AnonymousClass28h r12, X.AnonymousClass28k r13, X.AnonymousClass2Vh r14, X.AnonymousClass2Vi r15) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r0 = r11.f50042T;
        r4 = 0;
        if (r0 == 0) goto L_0x0086;
    L_0x0005:
        r11.f50042T = r4;
        r1 = r11.f50026D;
        r0 = r11.f50031I;
        r1 = r1 + r0;
        r2 = (float) r1;
        r0 = r11.f50032J;
        r2 = r2 + r0;
        r5 = r11.f50041S;
        r0 = 1016003125; // 0x3c8efa35 float:0.017453292 double:5.0197224E-315;
        r2 = r2 * r0;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 * r2;
        r0 = (double) r0;
        r0 = java.lang.Math.sin(r0);
        r1 = (float) r0;
        r0 = 1054086093; // 0x3ed413cd float:0.41421357 double:5.207877263E-315;
        r1 = r1 * r0;
        r0 = java.lang.Math.abs(r1);
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r10 = r10 - r0;
        r5.m14373A();
        r0 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r5.m14374B(r0, r0);
        r2 = (double) r2;
        r0 = java.lang.Math.sin(r2);
        r6 = (float) r0;
        r0 = java.lang.Math.cos(r2);
        r8 = (float) r0;
        r7 = r5.f25776B;
        r9 = 0;
        r3 = r7[r9];
        r3 = r3 * r8;
        r2 = 3;
        r0 = r7[r2];
        r0 = r0 * r6;
        r3 = r3 - r0;
        r1 = r7[r9];
        r1 = r1 * r6;
        r0 = r7[r2];
        r0 = r0 * r8;
        r1 = r1 + r0;
        r7[r9] = r3;
        r7[r2] = r1;
        r3 = 1;
        r2 = r7[r3];
        r2 = r2 * r8;
        r1 = 4;
        r0 = r7[r1];
        r0 = r0 * r6;
        r2 = r2 - r0;
        r0 = r7[r3];
        r6 = r6 * r0;
        r0 = r7[r1];
        r8 = r8 * r0;
        r6 = r6 + r8;
        r7[r3] = r2;
        r7[r1] = r6;
        r2 = r5.f25776B;
        r1 = 0;
        r0 = r2[r1];
        r0 = r0 * r10;
        r2[r1] = r0;
        r1 = 1;
        r0 = r2[r1];
        r0 = r0 * r10;
        r2[r1] = r0;
        r1 = 3;
        r0 = r2[r1];
        r0 = r0 * r10;
        r2[r1] = r0;
        r1 = 4;
        r0 = r2[r1];
        r0 = r0 * r10;
        r2[r1] = r0;
        r0 = -1090519040; // 0xffffffffbf000000 float:-0.5 double:NaN;
        r5.m14374B(r0, r0);
    L_0x0086:
        r0 = r11.f50051c;
        r2 = 1;
        r0.m16728C(r2);
        r1 = r11.f50052d;
        r0 = r11.f50041S;
        r0 = r0.f25777C;
        r1.f31962B = r0;
        r1.m16149B();
        r3 = r11.f50037O;
        r0 = r11.f50027E;
        r1 = (float) r0;
        r0 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r1 = r1 / r0;
        r3.m16738C(r1);
        r1 = r11.f50055g;
        if (r1 == 0) goto L_0x00bc;
    L_0x00a6:
        r0 = r11.f50039Q;
        if (r0 == 0) goto L_0x00bc;
    L_0x00aa:
        r0 = r15.jQ();
        r0 = (float) r0;
        r1.m16738C(r0);
        r1 = r11.f50039Q;
        r0 = r15.hQ();
        r0 = (float) r0;
        r1.m16738C(r0);
    L_0x00bc:
        r1 = r11.f50046X;
        r0 = r11.f50045W;
        r0 = (float) r0;
        r1.m16738C(r0);
        r1 = r11.f50044V;
        r0 = r11.f50043U;
        r0 = (float) r0;
        r1.m16738C(r0);
        r0 = r11.f50033K;
        if (r0 == 0) goto L_0x00df;
    L_0x00d0:
        r0 = r11.f50053e;
        r0.m16728C(r2);
        r1 = r11.f50054f;
        r0 = r11.f50033K;
        r0 = r0.f18005C;
        r1.m16735C(r0);
        goto L_0x00e4;
    L_0x00df:
        r0 = r11.f50053e;
        r0.m16728C(r4);
    L_0x00e4:
        r0 = r11.f50030H;
        if (r0 == 0) goto L_0x00f4;
    L_0x00e8:
        r1 = r11.f50026D;
        r0 = 90;
        if (r1 == r0) goto L_0x00f5;
    L_0x00ee:
        r0 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        if (r1 != r0) goto L_0x00f3;
    L_0x00f2:
        goto L_0x00f5;
    L_0x00f3:
        r4 = 1;
    L_0x00f4:
        r2 = 0;
    L_0x00f5:
        r0 = r11.f50047Y;
        r0.m16728C(r4);
        r0 = r11.f50038P;
        r0.m16728C(r2);
        r1 = "image";
        r0 = r14.getTextureId();
        r12.m14576F(r1, r0);
        r1 = r11.f50036N;
        if (r1 == 0) goto L_0x0111;
    L_0x010c:
        r0 = r11.f50028F;
        r1.Su(r12, r14, r15, r0);
    L_0x0111:
        r0 = X.AnonymousClass0ch.DEFAULT;
        r0 = X.AnonymousClass0ci.B(r0);
        r0 = r0.f7233D;
        if (r0 == 0) goto L_0x011c;
    L_0x011b:
        return;
    L_0x011c:
        r0 = r11.f50025C;
        r5 = 0;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r0 == 0) goto L_0x0159;
    L_0x0123:
        r2 = r11.f50024B;
        if (r2 == 0) goto L_0x0159;
    L_0x0127:
        r0 = r2.f39672C;
        r0 = r0.x;
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 == 0) goto L_0x0139;
    L_0x0131:
        r0 = r2.f39672C;
        r0 = r0.y;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x0146;
    L_0x0139:
        r0 = r2.f39671B;	 Catch:{ InterruptedException -> 0x0146 }
        r1 = r0.take();	 Catch:{ InterruptedException -> 0x0146 }
        r1 = (android.graphics.PointF) r1;	 Catch:{ InterruptedException -> 0x0146 }
        r0 = r2.f39672C;	 Catch:{ InterruptedException -> 0x0146 }
        r0.set(r1);	 Catch:{ InterruptedException -> 0x0146 }
    L_0x0146:
        r0 = r2.f39672C;
        r3 = r0.x;
        r2 = r0.y;
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1));
        if (r0 == 0) goto L_0x0159;
    L_0x0152:
        r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x0157;
    L_0x0156:
        goto L_0x0159;
    L_0x0157:
        r5 = r3;
        goto L_0x015b;
    L_0x0159:
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x015b:
        r0 = r2 - r5;
        r1 = r4 / r0;
        r0 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r1 = java.lang.Math.min(r1, r0);
        r0 = r11.f50035M;
        r0.m16738C(r1);
        r0 = r2 * r1;
        r4 = r4 - r0;
        r0 = r11.f50034L;
        r0.m16738C(r4);
        java.lang.Float.valueOf(r1);
        java.lang.Float.valueOf(r4);
        java.lang.Float.valueOf(r2);
        java.lang.Float.valueOf(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.photo.edit.effectfilter.PhotoFilter.E(X.28h, X.28k, X.2Vh, X.2Vi):void");
    }

    /* renamed from: F */
    public final void m23008F(int i) {
        this.f50026D = i;
        this.f50042T = true;
        m23011I(this.f50030H);
        invalidate();
    }

    /* renamed from: G */
    public final void m23009G(int i) {
        this.f50027E = i;
        invalidate();
    }

    /* renamed from: H */
    public final void m23010H(int i, int i2, boolean z) {
        this.f50045W = i;
        this.f50043U = i2;
        this.f50040R = z;
        invalidate();
    }

    /* renamed from: I */
    public final void m23011I(boolean z) {
        this.f50030H = z;
        invalidate();
    }

    /* renamed from: J */
    public final void m23012J(int i) {
        this.f50031I = i;
        this.f50042T = true;
        invalidate();
    }

    /* renamed from: K */
    public final void m23013K(float f) {
        this.f50032J = f;
        this.f50042T = true;
        invalidate();
    }

    /* renamed from: L */
    public final void m23014L(Matrix4 matrix4) {
        if (matrix4 != null) {
            this.f50033K = new Matrix4(matrix4);
        } else {
            this.f50033K = null;
        }
    }

    public final void QE(AnonymousClass28k anonymousClass28k) {
        super.QE(anonymousClass28k);
        for (AnonymousClass28q cleanup : this.f50028F) {
            cleanup.cleanup();
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" ");
        stringBuilder.append(this.f50049a);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f50029G);
        parcel.writeTypedList(this.f50050b);
        parcel.writeString(this.f50049a);
        parcel.writeInt(this.f50027E);
        parcel.writeInt(this.f50026D);
        parcel.writeInt(this.f50031I);
        parcel.writeFloat(this.f50032J);
        parcel.writeInt(this.f50030H);
        parcel.writeInt(this.f50025C);
        parcel.writeInt(this.f50045W);
        parcel.writeInt(this.f50043U);
        parcel.writeInt(this.f50040R);
        parcel.writeString(this.f50048Z.toString());
        parcel.writeParcelable(this.f50033K, i);
    }
}
