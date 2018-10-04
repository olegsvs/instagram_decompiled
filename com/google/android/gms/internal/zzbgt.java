package com.google.android.gms.internal;

import X.AnonymousClass1Ew;
import X.AnonymousClass1hn;
import X.AnonymousClass1zA;
import X.AnonymousClass1zB;
import X.AnonymousClass1zC;
import X.AnonymousClass1zf;
import X.AnonymousClass1zg;
import X.AnonymousClass1zi;
import X.AnonymousClass20q;
import X.AnonymousClass20w;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.webrtc.audio.WebRtcAudioRecord;

public class zzbgt extends zzbgl {
    public static final Creator CREATOR = new AnonymousClass20w();
    /* renamed from: B */
    private final String f31921B;
    /* renamed from: C */
    private final zzbgo f31922C;
    /* renamed from: D */
    private final Parcel f31923D;
    /* renamed from: E */
    private final int f31924E = 2;
    /* renamed from: F */
    private int f31925F;
    /* renamed from: G */
    private int f31926G;
    /* renamed from: H */
    private final int f31927H;

    public zzbgt(int i, Parcel parcel, zzbgo zzbgo) {
        this.f31927H = i;
        this.f31923D = (Parcel) AnonymousClass1Ew.I(parcel);
        this.f31922C = zzbgo;
        zzbgo zzbgo2 = this.f31922C;
        this.f31921B = zzbgo2 == null ? null : zzbgo2.f25248C;
        this.f31925F = 2;
    }

    /* renamed from: D */
    private static final void m16664D(zzbgt zzbgt, StringBuilder stringBuilder, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Entry entry : map.entrySet()) {
            sparseArray.put(((zzbgj) entry.getValue()).f25241G, entry);
        }
        stringBuilder.append('{');
        int O = AnonymousClass1zA.m14036O(parcel);
        Object obj = null;
        while (parcel.dataPosition() < O) {
            int readInt = parcel.readInt();
            Entry entry2 = (Entry) sparseArray.get(65535 & readInt);
            if (entry2 != null) {
                if (obj != null) {
                    stringBuilder.append(",");
                }
                String str = (String) entry2.getKey();
                zzbgj zzbgj = (zzbgj) entry2.getValue();
                stringBuilder.append("\"");
                stringBuilder.append(str);
                stringBuilder.append("\":");
                if (zzbgj.m14170A()) {
                    Object valueOf;
                    switch (zzbgj.f25238D) {
                        case 0:
                            valueOf = Integer.valueOf(AnonymousClass1zA.m14037P(parcel, readInt));
                            break;
                        case 1:
                            valueOf = AnonymousClass1zA.m14040S(parcel, readInt);
                            break;
                        case 2:
                            valueOf = Long.valueOf(AnonymousClass1zA.m14038Q(parcel, readInt));
                            break;
                        case 3:
                            valueOf = Float.valueOf(AnonymousClass1zA.m14041T(parcel, readInt));
                            break;
                        case 4:
                            valueOf = Double.valueOf(AnonymousClass1zA.m14042U(parcel, readInt));
                            break;
                        case 5:
                            valueOf = AnonymousClass1zA.m14043V(parcel, readInt);
                            break;
                        case 6:
                            valueOf = Boolean.valueOf(AnonymousClass1zA.m14035N(parcel, readInt));
                            break;
                        case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                            valueOf = AnonymousClass1zA.m14044W(parcel, readInt);
                            break;
                        case 8:
                        case 9:
                            valueOf = AnonymousClass1zA.m14047Z(parcel, readInt);
                            break;
                        case 10:
                            Bundle Y = AnonymousClass1zA.m14046Y(parcel, readInt);
                            valueOf = new HashMap();
                            for (String str2 : Y.keySet()) {
                                valueOf.put(str2, Y.getString(str2));
                            }
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = zzbgj.f25238D;
                            StringBuilder stringBuilder2 = new StringBuilder(36);
                            stringBuilder2.append("Unknown field out type = ");
                            stringBuilder2.append(i);
                            throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                    m16667G(stringBuilder, zzbgj, AnonymousClass20q.m14163B(zzbgj, valueOf));
                } else {
                    zzbgt.m16666F(stringBuilder, zzbgj, parcel, readInt);
                }
                obj = 1;
            }
        }
        if (parcel.dataPosition() == O) {
            stringBuilder.append('}');
            return;
        }
        stringBuilder2 = new StringBuilder(37);
        stringBuilder2.append("Overread allowed size end=");
        stringBuilder2.append(O);
        throw new AnonymousClass1zB(stringBuilder2.toString(), parcel);
    }

    /* renamed from: E */
    private static void m16665E(StringBuilder stringBuilder, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                stringBuilder.append(obj);
                return;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                stringBuilder.append("\"");
                stringBuilder.append(AnonymousClass1zi.m14119B(obj.toString()));
                stringBuilder.append("\"");
                return;
            case 8:
                stringBuilder.append("\"");
                stringBuilder.append(AnonymousClass1zg.m14117B((byte[]) obj));
                stringBuilder.append("\"");
                return;
            case 9:
                stringBuilder.append("\"");
                stringBuilder.append(AnonymousClass1zg.m14118C((byte[]) obj));
                stringBuilder.append("\"");
                return;
            case 10:
                AnonymousClass1hn.B(stringBuilder, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder stringBuilder2 = new StringBuilder(26);
                stringBuilder2.append("Unknown type = ");
                stringBuilder2.append(i);
                throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    /* renamed from: F */
    private final void m16666F(StringBuilder stringBuilder, zzbgj zzbgj, Parcel parcel, int i) {
        int i2 = 0;
        if (zzbgj.f25239E) {
            stringBuilder.append("[");
            Object[] objArr = null;
            int length;
            int dataPosition;
            int readInt;
            switch (zzbgj.f25238D) {
                case 0:
                    int[] c = AnonymousClass1zA.m14050c(parcel, i);
                    length = c.length;
                    while (i2 < length) {
                        if (i2 != 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append(Integer.toString(c[i2]));
                        i2++;
                    }
                    break;
                case 1:
                    int H = AnonymousClass1zA.m14029H(parcel, i);
                    dataPosition = parcel.dataPosition();
                    if (H != 0) {
                        readInt = parcel.readInt();
                        objArr = new BigInteger[readInt];
                        while (i2 < readInt) {
                            objArr[i2] = new BigInteger(parcel.createByteArray());
                            i2++;
                        }
                        parcel.setDataPosition(dataPosition + H);
                    }
                    AnonymousClass1zf.m14116B(stringBuilder, objArr);
                    break;
                case 2:
                    long[] d = AnonymousClass1zA.m14051d(parcel, i);
                    i2 = d.length;
                    for (readInt = 0; readInt < i2; readInt++) {
                        if (readInt != 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append(Long.toString(d[readInt]));
                    }
                    break;
                case 3:
                    float[] e = AnonymousClass1zA.m14052e(parcel, i);
                    readInt = e.length;
                    for (length = 0; length < readInt; length++) {
                        if (length != 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append(Float.toString(e[length]));
                    }
                    break;
                case 4:
                    length = AnonymousClass1zA.m14029H(parcel, i);
                    int dataPosition2 = parcel.dataPosition();
                    if (length != 0) {
                        objArr = parcel.createDoubleArray();
                        parcel.setDataPosition(dataPosition2 + length);
                    }
                    i2 = objArr.length;
                    for (readInt = 0; readInt < i2; readInt++) {
                        if (readInt != 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append(Double.toString(objArr[readInt]));
                    }
                    break;
                case 5:
                    AnonymousClass1zf.m14116B(stringBuilder, AnonymousClass1zA.m14053f(parcel, i));
                    break;
                case 6:
                    boolean[] b = AnonymousClass1zA.m14049b(parcel, i);
                    readInt = b.length;
                    for (length = 0; length < readInt; length++) {
                        if (length != 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append(Boolean.toString(b[length]));
                    }
                    break;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    String[] B = AnonymousClass1zA.m14023B(parcel, i);
                    readInt = B.length;
                    for (length = 0; length < readInt; length++) {
                        if (length != 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append("\"");
                        stringBuilder.append(B[length]);
                        stringBuilder.append("\"");
                    }
                    break;
                case 8:
                case 9:
                case 10:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case 11:
                    Parcel[] F = AnonymousClass1zA.m14027F(parcel, i);
                    dataPosition = F.length;
                    for (readInt = 0; readInt < dataPosition; readInt++) {
                        if (readInt > 0) {
                            stringBuilder.append(",");
                        }
                        F[readInt].setDataPosition(0);
                        m16664D(this, stringBuilder, zzbgj.m14171B(), F[readInt]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            stringBuilder.append("]");
            return;
        }
        String W;
        String str;
        byte[] Z;
        switch (zzbgj.f25238D) {
            case 0:
                stringBuilder.append(AnonymousClass1zA.m14037P(parcel, i));
                return;
            case 1:
                stringBuilder.append(AnonymousClass1zA.m14040S(parcel, i));
                return;
            case 2:
                stringBuilder.append(AnonymousClass1zA.m14038Q(parcel, i));
                return;
            case 3:
                stringBuilder.append(AnonymousClass1zA.m14041T(parcel, i));
                return;
            case 4:
                stringBuilder.append(AnonymousClass1zA.m14042U(parcel, i));
                return;
            case 5:
                stringBuilder.append(AnonymousClass1zA.m14043V(parcel, i));
                return;
            case 6:
                stringBuilder.append(AnonymousClass1zA.m14035N(parcel, i));
                return;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                W = AnonymousClass1zA.m14044W(parcel, i);
                str = "\"";
                stringBuilder.append(str);
                stringBuilder.append(AnonymousClass1zi.m14119B(W));
                stringBuilder.append(str);
                return;
            case 8:
                Z = AnonymousClass1zA.m14047Z(parcel, i);
                str = "\"";
                stringBuilder.append(str);
                stringBuilder.append(AnonymousClass1zg.m14117B(Z));
                stringBuilder.append(str);
                return;
            case 9:
                Z = AnonymousClass1zA.m14047Z(parcel, i);
                str = "\"";
                stringBuilder.append(str);
                stringBuilder.append(AnonymousClass1zg.m14118C(Z));
                stringBuilder.append(str);
                return;
            case 10:
                Bundle Y = AnonymousClass1zA.m14046Y(parcel, i);
                Set<String> keySet = Y.keySet();
                keySet.size();
                stringBuilder.append("{");
                Object obj = 1;
                for (String str2 : keySet) {
                    if (obj == null) {
                        stringBuilder.append(",");
                    }
                    W = "\"";
                    stringBuilder.append(W);
                    stringBuilder.append(str2);
                    stringBuilder.append(W);
                    stringBuilder.append(":");
                    stringBuilder.append("\"");
                    stringBuilder.append(AnonymousClass1zi.m14119B(Y.getString(str2)));
                    stringBuilder.append("\"");
                    obj = null;
                }
                stringBuilder.append("}");
                return;
            case 11:
                Parcel E = AnonymousClass1zA.m14026E(parcel, i);
                E.setDataPosition(0);
                m16664D(this, stringBuilder, zzbgj.m14171B(), E);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    /* renamed from: G */
    private static final void m16667G(StringBuilder stringBuilder, zzbgj zzbgj, Object obj) {
        if (zzbgj.f25237C) {
            ArrayList arrayList = (ArrayList) obj;
            stringBuilder.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    stringBuilder.append(",");
                }
                m16665E(stringBuilder, zzbgj.f25236B, arrayList.get(i));
            }
            stringBuilder.append("]");
            return;
        }
        m16665E(stringBuilder, zzbgj.f25236B, obj);
    }

    /* renamed from: H */
    private Parcel m16668H() {
        switch (this.f31925F) {
            case 0:
                this.f31926G = AnonymousClass1zC.m14073U(this.f31923D);
                break;
            case 1:
                break;
            default:
                break;
        }
        AnonymousClass1zC.m14054B(this.f31923D, this.f31926G);
        this.f31925F = 2;
        return this.f31923D;
    }

    /* renamed from: C */
    public final Object mo3127C(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: D */
    public final boolean mo3128D(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: E */
    public final Map mo3543E() {
        zzbgo zzbgo = this.f31922C;
        if (zzbgo == null) {
            return null;
        }
        return (Map) zzbgo.f25247B.get(this.f31921B);
    }

    public final String toString() {
        AnonymousClass1Ew.E(this.f31922C, "Cannot convert to JSON on client side.");
        Parcel H = m16668H();
        H.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        zzbgo zzbgo = this.f31922C;
        m16664D(this, stringBuilder, (Map) zzbgo.f25247B.get(this.f31921B), H);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcelable parcelable;
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f31927H);
        AnonymousClass1zC.m14058F(parcel, 2, m16668H(), false);
        int i2 = this.f31924E;
        switch (i2) {
            case 0:
                parcelable = null;
                break;
            case 1:
            case 2:
                parcelable = this.f31922C;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(34);
                stringBuilder.append("Invalid creation type: ");
                stringBuilder.append(i2);
                throw new IllegalStateException(stringBuilder.toString());
        }
        AnonymousClass1zC.m14059G(parcel, 3, parcelable, i, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
