package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.DataOutputStream;

/* renamed from: X.3w5 */
public final class AnonymousClass3w5 implements AnonymousClass2wp {
    /* renamed from: B */
    public AnonymousClass2xG f47098B;
    /* renamed from: C */
    private int f47099C;
    /* renamed from: D */
    private final AnonymousClass2w4 f47100D = new AnonymousClass2w4();
    /* renamed from: E */
    private boolean f47101E;
    /* renamed from: F */
    private long[] f47102F;
    /* renamed from: G */
    private boolean f47103G;
    /* renamed from: H */
    private long f47104H = -9223372036854775807L;
    /* renamed from: I */
    private final Format f47105I;

    public final boolean LY() {
        return true;
    }

    public final void sb() {
    }

    public AnonymousClass3w5(AnonymousClass2xG anonymousClass2xG, Format format, boolean z) {
        this.f47105I = format;
        this.f47098B = anonymousClass2xG;
        this.f47102F = anonymousClass2xG.f36204C;
        m21574B(anonymousClass2xG, z);
    }

    /* renamed from: A */
    public final void m21573A(long j) {
        boolean z = false;
        this.f47099C = AnonymousClass2yi.m18083D(this.f47102F, j, true, false);
        if (this.f47101E && this.f47099C == this.f47102F.length) {
            z = true;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.f47104H = j;
    }

    /* renamed from: B */
    public final void m21574B(AnonymousClass2xG anonymousClass2xG, boolean z) {
        int i = this.f47099C;
        long j = i == 0 ? -9223372036854775807L : this.f47102F[i - 1];
        this.f47101E = z;
        this.f47098B = anonymousClass2xG;
        this.f47102F = anonymousClass2xG.f36204C;
        long j2 = this.f47104H;
        if (j2 != -9223372036854775807L) {
            m21573A(j2);
        } else if (j != -9223372036854775807L) {
            this.f47099C = AnonymousClass2yi.m18083D(this.f47102F, j, false, false);
        }
    }

    public final int LUA(long j) {
        int max = Math.max(this.f47099C, AnonymousClass2yi.m18083D(this.f47102F, j, true, false));
        int i = max - this.f47099C;
        this.f47099C = max;
        return i;
    }

    public final int hIA(AnonymousClass2uL anonymousClass2uL, AnonymousClass3vB anonymousClass3vB, boolean z) {
        if (!z) {
            if (this.f47103G) {
                int i = this.f47099C;
                AnonymousClass2v7 anonymousClass2v7 = anonymousClass3vB;
                if (i != this.f47102F.length) {
                    this.f47099C = i + 1;
                    AnonymousClass2w4 anonymousClass2w4 = this.f47100D;
                    EventMessage eventMessage = this.f47098B.f36203B[i];
                    long j = this.f47098B.f36206E;
                    AnonymousClass2yO.m18013B(j >= 0);
                    anonymousClass2w4.f36051B.reset();
                    try {
                        DataOutputStream dataOutputStream = anonymousClass2w4.f36052C;
                        dataOutputStream.writeBytes(eventMessage.f46975F);
                        dataOutputStream.writeByte(0);
                        String str = eventMessage.f46976G != null ? eventMessage.f46976G : JsonProperty.USE_DEFAULT_NAME;
                        dataOutputStream = anonymousClass2w4.f36052C;
                        dataOutputStream.writeBytes(str);
                        dataOutputStream.writeByte(0);
                        AnonymousClass2w4.m17852B(anonymousClass2w4.f36052C, j);
                        AnonymousClass2w4.m17852B(anonymousClass2w4.f36052C, AnonymousClass2yi.m18106a(eventMessage.f46974E, j, 1000000));
                        AnonymousClass2w4.m17852B(anonymousClass2w4.f36052C, AnonymousClass2yi.m18106a(eventMessage.f46971B, j, 1000));
                        AnonymousClass2w4.m17852B(anonymousClass2w4.f36052C, eventMessage.f46972C);
                        anonymousClass2w4.f36052C.write(eventMessage.f46973D);
                        anonymousClass2w4.f36052C.flush();
                        byte[] toByteArray = anonymousClass2w4.f36051B.toByteArray();
                        if (toByteArray != null) {
                            anonymousClass2v7.m21471F(toByteArray.length);
                            anonymousClass2v7.f35759B = 1;
                            anonymousClass2v7.f46800D.put(toByteArray);
                            anonymousClass2v7.f46801E = this.f47102F[i];
                            return -4;
                        }
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                } else if (!this.f47101E) {
                    anonymousClass2v7.f35759B = 4;
                    return -4;
                }
                return -3;
            }
        }
        anonymousClass2uL.f35584B = this.f47105I;
        this.f47103G = true;
        return -5;
    }
}
