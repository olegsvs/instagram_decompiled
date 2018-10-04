package X;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.shopping.Product;
import com.instagram.model.venue.Venue;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.webrtc.audio.WebRtcAudioRecord;

/* renamed from: X.0ZF */
public final class AnonymousClass0ZF implements AnonymousClass0ZG {
    /* renamed from: B */
    public String f6294B;
    /* renamed from: C */
    public String f6295C;
    /* renamed from: D */
    public AnonymousClass2Fo f6296D;
    /* renamed from: E */
    public Hashtag f6297E;
    /* renamed from: F */
    public float f6298F;
    /* renamed from: G */
    public String f6299G;
    /* renamed from: H */
    public String f6300H;
    /* renamed from: I */
    public String f6301I;
    /* renamed from: J */
    public boolean f6302J;
    /* renamed from: K */
    public boolean f6303K;
    /* renamed from: L */
    public String f6304L;
    /* renamed from: M */
    public String f6305M;
    /* renamed from: N */
    public AnonymousClass2Fy f6306N;
    /* renamed from: O */
    public Integer f6307O;
    /* renamed from: P */
    public AnonymousClass160 f6308P;
    /* renamed from: Q */
    public AnonymousClass2EZ f6309Q;
    /* renamed from: R */
    public AnonymousClass1IS f6310R;
    /* renamed from: S */
    public float f6311S;
    /* renamed from: T */
    public AnonymousClass196 f6312T;
    /* renamed from: U */
    public String f6313U = "sticker";
    /* renamed from: V */
    public String f6314V;
    /* renamed from: W */
    public AnonymousClass15c f6315W;
    /* renamed from: X */
    public boolean f6316X;
    /* renamed from: Y */
    public AnonymousClass0Ci f6317Y;
    /* renamed from: Z */
    public Venue f6318Z;
    /* renamed from: a */
    public float f6319a;
    /* renamed from: b */
    public float f6320b;
    /* renamed from: c */
    public float f6321c;
    /* renamed from: d */
    public int f6322d;

    public AnonymousClass0ZF(AnonymousClass0Ci anonymousClass0Ci) {
        this.f6317Y = anonymousClass0Ci;
        this.f6315W = AnonymousClass15c.MENTION;
    }

    public AnonymousClass0ZF(Hashtag hashtag) {
        this.f6297E = hashtag;
        this.f6315W = AnonymousClass15c.HASHTAG;
    }

    /* renamed from: A */
    public final AnonymousClass160 m5343A() {
        if (this.f6307O == null || this.f6308P.f14401H != null) {
            return this.f6308P;
        }
        List list = this.f6308P.f14398E;
        List arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            int i2;
            AnonymousClass1Ay anonymousClass1Ay = (AnonymousClass1Ay) list.get(i);
            if (i == this.f6307O.intValue()) {
                i2 = anonymousClass1Ay.f15349B + 1;
            } else {
                i2 = anonymousClass1Ay.f15349B;
            }
            arrayList.add(new AnonymousClass1Ay(anonymousClass1Ay.f15351D, i2, anonymousClass1Ay.f15350C));
        }
        return new AnonymousClass160(this.f6308P.f14397D, this.f6308P.f14399F, this.f6307O.intValue(), false, arrayList, this.f6308P.f14396C);
    }

    /* renamed from: B */
    public final Product m5344B() {
        return this.f6309Q.f27876C;
    }

    /* renamed from: B */
    public static void m5341B(AnonymousClass0ZF anonymousClass0ZF) {
        if (anonymousClass0ZF.f6309Q == null) {
            AnonymousClass2EZ anonymousClass2EZ = new AnonymousClass2EZ();
            anonymousClass0ZF.f6309Q = anonymousClass2EZ;
            anonymousClass2EZ.f27875B = anonymousClass0ZF.f6304L;
            AnonymousClass0Ci anonymousClass0Ci = anonymousClass0ZF.f6317Y;
            if (anonymousClass0Ci != null) {
                anonymousClass2EZ.f27879F = anonymousClass0Ci.getId();
            }
        }
    }

    /* renamed from: C */
    public final String m5345C() {
        AnonymousClass2EZ anonymousClass2EZ = this.f6309Q;
        return (anonymousClass2EZ == null || anonymousClass2EZ.f27877D == null || this.f6309Q.f27877D.isEmpty()) ? null : ((AnonymousClass2EY) this.f6309Q.f27877D.get(0)).f27874B;
    }

    /* renamed from: C */
    public static String m5342C(List list) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartArray();
        for (AnonymousClass0ZF anonymousClass0ZF : list) {
            createGenerator.writeStartObject();
            createGenerator.writeNumberField("x", anonymousClass0ZF.bU());
            createGenerator.writeNumberField("y", anonymousClass0ZF.dU());
            createGenerator.writeNumberField("z", anonymousClass0ZF.f6322d);
            createGenerator.writeNumberField("width", anonymousClass0ZF.ZU());
            createGenerator.writeNumberField("height", anonymousClass0ZF.gM());
            createGenerator.writeNumberField("rotation", anonymousClass0ZF.yQ());
            switch (AnonymousClass2Fs.f28152B[anonymousClass0ZF.f6315W.ordinal()]) {
                case 1:
                case 2:
                    createGenerator.writeStringField(MemoryDumpUploadJob.EXTRA_USER_ID, anonymousClass0ZF.f6317Y.getId());
                    break;
                case 3:
                    createGenerator.writeStringField("location_id", anonymousClass0ZF.f6318Z.f6706C);
                    break;
                case 4:
                    createGenerator.writeStringField("tag_name", anonymousClass0ZF.f6297E.f2793M);
                    break;
                case 5:
                    AnonymousClass1Aw.m9770C(createGenerator, anonymousClass0ZF.m5343A(), false);
                    break;
                case 6:
                    AnonymousClass1IR.m10652C(createGenerator, anonymousClass0ZF.f6310R, false);
                    break;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    AnonymousClass195.m9644C(createGenerator, anonymousClass0ZF.f6312T, false);
                    break;
                case 8:
                    AnonymousClass2bU.C(createGenerator, anonymousClass0ZF.f6306N, false);
                    break;
                case 9:
                    createGenerator.writeStringField("media_id", anonymousClass0ZF.f6304L);
                    createGenerator.writeStringField("media_owner_id", anonymousClass0ZF.f6305M);
                    break;
                case 10:
                    break;
                case 11:
                    createGenerator.writeStringField("product_id", anonymousClass0ZF.m5344B().getId());
                    createGenerator.writeStringField("sticker_style", anonymousClass0ZF.m5345C());
                    createGenerator.writeStringField("text", anonymousClass0ZF.m5346D());
                    if (anonymousClass0ZF.f6309Q.f27880G != null) {
                        createGenerator.writeStringField("vibrant_text_color", anonymousClass0ZF.f6309Q.f27880G);
                        break;
                    }
                    break;
                case 12:
                    createGenerator.writeStringField("friend_list_id", anonymousClass0ZF.f6296D.f28147B);
                    createGenerator.writeStringField("friend_list_name", anonymousClass0ZF.f6296D.f28148C);
                    createGenerator.writeNumberField("is_hidden", anonymousClass0ZF.f6302J);
                    break;
                case ParserMinimalBase.INT_CR /*13*/:
                    createGenerator.writeStringField("reel_id", anonymousClass0ZF.f6299G);
                    createGenerator.writeStringField("reel_owner_id", anonymousClass0ZF.f6300H);
                    break;
                default:
                    throw new UnsupportedOperationException("Unknown interactive type");
            }
            if (!TextUtils.isEmpty(anonymousClass0ZF.f6294B)) {
                createGenerator.writeStringField("attribution", anonymousClass0ZF.f6294B);
            }
            if (anonymousClass0ZF.f6303K) {
                createGenerator.writeBooleanField("is_sticker", anonymousClass0ZF.f6303K);
            }
            if (anonymousClass0ZF.f6316X) {
                createGenerator.writeBooleanField("use_custom_title", anonymousClass0ZF.f6316X);
            }
            if (!TextUtils.isEmpty(anonymousClass0ZF.f6314V)) {
                createGenerator.writeStringField("display_type", anonymousClass0ZF.f6314V);
            }
            createGenerator.writeEndObject();
        }
        createGenerator.writeEndArray();
        createGenerator.close();
        return stringWriter.toString();
    }

    /* renamed from: D */
    public final String m5346D() {
        if (TextUtils.isEmpty(this.f6309Q.f27878E)) {
            return m5344B().f4988J.toUpperCase(Locale.getDefault());
        }
        return this.f6309Q.f27878E;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: E */
    public final java.lang.String m5347E(android.content.res.Resources r3) {
        /*
        r2 = this;
        r1 = X.AnonymousClass2Fs.f28152B;
        r0 = r2.f6315W;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 0;
        switch(r0) {
            case 1: goto L_0x0062;
            case 2: goto L_0x0062;
            case 3: goto L_0x005a;
            case 4: goto L_0x0049;
            case 5: goto L_0x000e;
            case 6: goto L_0x000e;
            case 7: goto L_0x000e;
            case 8: goto L_0x003a;
            case 9: goto L_0x0032;
            case 10: goto L_0x000e;
            case 11: goto L_0x001f;
            case 12: goto L_0x0017;
            case 13: goto L_0x000f;
            default: goto L_0x000e;
        };
    L_0x000e:
        return r1;
    L_0x000f:
        r0 = 2131692398; // 0x7f0f0b6e float:1.9013895E38 double:1.0531959814E-314;
        r0 = r3.getString(r0);
        return r0;
    L_0x0017:
        r0 = 2131692394; // 0x7f0f0b6a float:1.9013887E38 double:1.0531959794E-314;
        r0 = r3.getString(r0);
        return r0;
    L_0x001f:
        r0 = r2.f6295C;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x002a;
    L_0x0027:
        r0 = r2.f6295C;
        goto L_0x0031;
    L_0x002a:
        r0 = 2131692393; // 0x7f0f0b69 float:1.9013885E38 double:1.053195979E-314;
        r0 = r3.getString(r0);
    L_0x0031:
        return r0;
    L_0x0032:
        r0 = 2131692392; // 0x7f0f0b68 float:1.9013883E38 double:1.0531959784E-314;
        r0 = r3.getString(r0);
        return r0;
    L_0x003a:
        r0 = r2.f6306N;
        r0 = r0.f28169H;
        if (r0 == 0) goto L_0x000e;
    L_0x0040:
        r0 = r2.f6306N;
        r0 = r0.f28169H;
        r0 = r0.m1003T();
        return r0;
    L_0x0049:
        r0 = r2.f6295C;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0027;
    L_0x0052:
        r0 = 2131692390; // 0x7f0f0b66 float:1.9013879E38 double:1.0531959774E-314;
        r0 = r3.getString(r0);
        goto L_0x0031;
    L_0x005a:
        r0 = 2131692391; // 0x7f0f0b67 float:1.901388E38 double:1.053195978E-314;
        r0 = r3.getString(r0);
        return r0;
    L_0x0062:
        r0 = r2.f6317Y;
        r0 = r0.m1003T();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0ZF.E(android.content.res.Resources):java.lang.String");
    }

    /* renamed from: F */
    public final boolean m5348F() {
        return AnonymousClass2Fs.f28152B[this.f6315W.ordinal()] == 5;
    }

    /* renamed from: G */
    public final boolean m5349G() {
        return AnonymousClass2Fs.f28152B[this.f6315W.ordinal()] != 12;
    }

    public final float ZU() {
        return this.f6319a;
    }

    public final float bU() {
        return this.f6320b;
    }

    public final float dU() {
        return this.f6321c;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj instanceof AnonymousClass0ZF) {
                AnonymousClass0ZF anonymousClass0ZF = (AnonymousClass0ZF) obj;
                if (Float.compare(anonymousClass0ZF.f6320b, this.f6320b) == 0) {
                    if (Float.compare(anonymousClass0ZF.f6321c, this.f6321c) == 0) {
                        if (anonymousClass0ZF.f6322d == this.f6322d) {
                            if (Float.compare(anonymousClass0ZF.f6319a, this.f6319a) == 0) {
                                if (Float.compare(anonymousClass0ZF.f6298F, this.f6298F) == 0) {
                                    if (Float.compare(anonymousClass0ZF.f6311S, this.f6311S) == 0) {
                                        if (this.f6303K == anonymousClass0ZF.f6303K) {
                                            if (this.f6316X == anonymousClass0ZF.f6316X) {
                                                if (this.f6315W == anonymousClass0ZF.f6315W) {
                                                    AnonymousClass0Ci anonymousClass0Ci = this.f6317Y;
                                                    if (anonymousClass0Ci != null) {
                                                        if (!anonymousClass0Ci.equals(anonymousClass0ZF.f6317Y)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6317Y != null) {
                                                    }
                                                    Venue venue = this.f6318Z;
                                                    if (venue != null) {
                                                        if (!venue.equals(anonymousClass0ZF.f6318Z)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6318Z != null) {
                                                    }
                                                    Hashtag hashtag = this.f6297E;
                                                    if (hashtag != null) {
                                                        if (!hashtag.equals(anonymousClass0ZF.f6297E)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6297E != null) {
                                                    }
                                                    AnonymousClass160 anonymousClass160 = this.f6308P;
                                                    if (anonymousClass160 != null) {
                                                        if (!anonymousClass160.equals(anonymousClass0ZF.f6308P)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6308P != null) {
                                                    }
                                                    AnonymousClass1IS anonymousClass1IS = this.f6310R;
                                                    if (anonymousClass1IS != null) {
                                                        if (!anonymousClass1IS.equals(anonymousClass0ZF.f6310R)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6310R != null) {
                                                    }
                                                    AnonymousClass196 anonymousClass196 = this.f6312T;
                                                    if (anonymousClass196 != null) {
                                                        if (!anonymousClass196.equals(anonymousClass0ZF.f6312T)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6312T != null) {
                                                    }
                                                    AnonymousClass2Fy anonymousClass2Fy = this.f6306N;
                                                    if (anonymousClass2Fy != null) {
                                                        if (!anonymousClass2Fy.equals(anonymousClass0ZF.f6306N)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6306N != null) {
                                                    }
                                                    String str = this.f6314V;
                                                    if (str != null) {
                                                        if (!str.equals(anonymousClass0ZF.f6314V)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6314V != null) {
                                                    }
                                                    str = this.f6304L;
                                                    if (str != null) {
                                                        if (!str.equals(anonymousClass0ZF.f6304L)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6304L != null) {
                                                    }
                                                    str = this.f6294B;
                                                    if (str != null) {
                                                        if (!str.equals(anonymousClass0ZF.f6294B)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6294B != null) {
                                                    }
                                                    AnonymousClass2EZ anonymousClass2EZ = this.f6309Q;
                                                    if (anonymousClass2EZ != null) {
                                                        if (!anonymousClass2EZ.equals(anonymousClass0ZF.f6309Q)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6309Q != null) {
                                                    }
                                                    AnonymousClass2Fo anonymousClass2Fo = this.f6296D;
                                                    if (anonymousClass2Fo != null) {
                                                        if (!anonymousClass2Fo.equals(anonymousClass0ZF.f6296D)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6296D != null) {
                                                    }
                                                    str = this.f6299G;
                                                    if (str != null) {
                                                        if (!str.equals(anonymousClass0ZF.f6299G)) {
                                                        }
                                                    } else if (anonymousClass0ZF.f6299G != null) {
                                                    }
                                                    if (anonymousClass0ZF.f6302J == this.f6302J) {
                                                        str = this.f6295C;
                                                        if (str != null) {
                                                            z = str.equals(anonymousClass0ZF.f6295C);
                                                        } else if (anonymousClass0ZF.f6295C != null) {
                                                            z = false;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final float gM() {
        return this.f6298F;
    }

    public final int hashCode() {
        AnonymousClass15c anonymousClass15c = this.f6315W;
        int i = 0;
        int hashCode = (anonymousClass15c != null ? anonymousClass15c.hashCode() : 0) * 31;
        float f = this.f6320b;
        hashCode = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        f = this.f6321c;
        hashCode = (((hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f6322d) * 31;
        f = this.f6319a;
        hashCode = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        f = this.f6298F;
        hashCode = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        f = this.f6311S;
        int floatToIntBits = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        AnonymousClass0Ci anonymousClass0Ci = this.f6317Y;
        floatToIntBits = (floatToIntBits + (anonymousClass0Ci != null ? anonymousClass0Ci.hashCode() : 0)) * 31;
        Venue venue = this.f6318Z;
        floatToIntBits = (floatToIntBits + (venue != null ? venue.hashCode() : 0)) * 31;
        Hashtag hashtag = this.f6297E;
        floatToIntBits = (floatToIntBits + (hashtag != null ? hashtag.hashCode() : 0)) * 31;
        AnonymousClass160 anonymousClass160 = this.f6308P;
        floatToIntBits = (floatToIntBits + (anonymousClass160 != null ? anonymousClass160.hashCode() : 0)) * 31;
        AnonymousClass1IS anonymousClass1IS = this.f6310R;
        floatToIntBits = (floatToIntBits + (anonymousClass1IS != null ? anonymousClass1IS.hashCode() : 0)) * 31;
        AnonymousClass196 anonymousClass196 = this.f6312T;
        floatToIntBits = (floatToIntBits + (anonymousClass196 != null ? anonymousClass196.hashCode() : 0)) * 31;
        AnonymousClass2Fy anonymousClass2Fy = this.f6306N;
        floatToIntBits = (floatToIntBits + (anonymousClass2Fy != null ? anonymousClass2Fy.hashCode() : 0)) * 31;
        String str = this.f6314V;
        floatToIntBits = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f6304L;
        floatToIntBits = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f6294B;
        floatToIntBits = (((((floatToIntBits + (str != null ? str.hashCode() : 0)) * 31) + this.f6303K) * 31) + this.f6316X) * 31;
        str = this.f6295C;
        floatToIntBits = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        AnonymousClass2EZ anonymousClass2EZ = this.f6309Q;
        floatToIntBits = (floatToIntBits + (anonymousClass2EZ != null ? anonymousClass2EZ.hashCode() : 0)) * 31;
        AnonymousClass2Fo anonymousClass2Fo = this.f6296D;
        floatToIntBits = (floatToIntBits + (anonymousClass2Fo != null ? anonymousClass2Fo.hashCode() : 0)) * 31;
        str = this.f6299G;
        if (str != null) {
            i = str.hashCode();
        }
        return ((floatToIntBits + i) * 31) + this.f6302J;
    }

    public final float yQ() {
        return this.f6311S;
    }
}
