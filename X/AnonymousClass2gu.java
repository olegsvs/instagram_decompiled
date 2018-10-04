package X;

import com.facebook.common.dextricks.DexStore;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.2gu */
public final class AnonymousClass2gu {
    /* renamed from: B */
    public final AnonymousClass2h3 f32456B;
    /* renamed from: C */
    public final String f32457C;
    /* renamed from: D */
    public final String f32458D;
    /* renamed from: E */
    public final String f32459E;
    /* renamed from: F */
    public final String f32460F;
    /* renamed from: G */
    public final AnonymousClass2h2 f32461G;
    /* renamed from: H */
    private final int f32462H;
    /* renamed from: I */
    private final AnonymousClass2h9 f32463I;

    public AnonymousClass2gu(String str, String str2, String str3, AnonymousClass2h2 anonymousClass2h2, AnonymousClass2h9 anonymousClass2h9, String str4, AnonymousClass2h3 anonymousClass2h3, int i) {
        boolean z = true;
        switch (AnonymousClass2gt.f32455B[anonymousClass2h2.ordinal()]) {
            case 1:
                if (anonymousClass2h9 != null) {
                    z = false;
                }
                AnonymousClass0LH.B(z);
                AnonymousClass0LH.E(str2);
                break;
            case 2:
                AnonymousClass0LH.B(str2 == null);
                AnonymousClass0LH.E(anonymousClass2h9);
                if (str4 != null) {
                    z = false;
                }
                AnonymousClass0LH.B(z);
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got unsupported type: ");
                stringBuilder.append(anonymousClass2h2);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f32457C = str;
        this.f32458D = str2;
        this.f32459E = str3;
        this.f32461G = anonymousClass2h2;
        this.f32463I = anonymousClass2h9;
        this.f32460F = str4;
        this.f32456B = anonymousClass2h3;
        this.f32462H = i;
    }

    public AnonymousClass2gu(ByteBuffer byteBuffer) {
        try {
            long j = byteBuffer.getLong();
            if (j == 7310021016723351138L) {
                AnonymousClass2h9 anonymousClass2h9;
                this.f32457C = (String) AnonymousClass0LH.E(AnonymousClass2gu.m16906B(byteBuffer));
                this.f32458D = AnonymousClass2gu.m16906B(byteBuffer);
                this.f32459E = AnonymousClass2gu.m16906B(byteBuffer);
                this.f32461G = AnonymousClass2h2.valueOf((String) AnonymousClass0LH.E(AnonymousClass2gu.m16906B(byteBuffer)));
                String B = AnonymousClass2gu.m16906B(byteBuffer);
                if (B == null) {
                    anonymousClass2h9 = null;
                } else {
                    anonymousClass2h9 = AnonymousClass2h9.valueOf(B);
                }
                this.f32463I = anonymousClass2h9;
                this.f32460F = AnonymousClass2gu.m16906B(byteBuffer);
                this.f32456B = AnonymousClass2h3.valueOf((String) AnonymousClass0LH.E(AnonymousClass2gu.m16906B(byteBuffer)));
                this.f32462H = byteBuffer.getInt();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid data: ");
            stringBuilder.append(j);
            throw new IOException(stringBuilder.toString());
        } catch (Throwable e) {
            throw new IOException(e);
        }
    }

    /* renamed from: A */
    public final int m16908A() {
        AnonymousClass0LH.I(this.f32461G == AnonymousClass2h2.SUPPORT, "Cannot get Version from Effect Asset");
        return this.f32462H;
    }

    /* renamed from: B */
    public final AnonymousClass2h9 m16909B() {
        AnonymousClass0LH.I(this.f32461G == AnonymousClass2h2.SUPPORT, "Cannot get SupportAssetType from Effect Asset");
        return this.f32463I;
    }

    /* renamed from: B */
    private static String m16906B(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        if (i >= 0) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return new String(bArr);
        }
        throw new IllegalStateException("read the wrong cache");
    }

    /* renamed from: C */
    private static void m16907C(ByteBuffer byteBuffer, String str) {
        if (str == null) {
            byteBuffer.putInt(-1);
            return;
        }
        byteBuffer.putInt(str.getBytes().length);
        byteBuffer.put(str.getBytes());
    }

    /* renamed from: C */
    public final byte[] m16910C() {
        ByteBuffer allocate = ByteBuffer.allocate(DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED);
        allocate.putLong(7310021016723351138L);
        AnonymousClass2gu.m16907C(allocate, this.f32457C);
        AnonymousClass2gu.m16907C(allocate, this.f32458D);
        AnonymousClass2gu.m16907C(allocate, this.f32459E);
        AnonymousClass2gu.m16907C(allocate, this.f32461G.name());
        AnonymousClass2h9 anonymousClass2h9 = this.f32463I;
        AnonymousClass2gu.m16907C(allocate, anonymousClass2h9 == null ? null : anonymousClass2h9.name());
        AnonymousClass2gu.m16907C(allocate, this.f32460F);
        AnonymousClass2gu.m16907C(allocate, this.f32456B.name());
        allocate.putInt(this.f32462H);
        return Arrays.copyOf(allocate.array(), allocate.position());
    }
}
