package X;

import android.content.Context;
import com.facebook.common.dextricks.DexStore;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import oauth.signpost.AbstractOAuthConsumer;

/* renamed from: X.3fW */
public final class AnonymousClass3fW extends AnonymousClass11O {
    /* renamed from: B */
    public String f43166B;
    /* renamed from: C */
    public String f43167C;
    /* renamed from: D */
    public boolean f43168D;
    /* renamed from: E */
    public String f43169E;
    /* renamed from: F */
    public AnonymousClass0Cm f43170F;
    /* renamed from: G */
    public String f43171G;
    /* renamed from: H */
    public String f43172H;
    /* renamed from: I */
    private AnonymousClass1PR f43173I;

    public AnonymousClass3fW(Context context) {
        super(context);
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ void m20362A(Object obj) {
        m20368N((AnonymousClass1PR) obj);
    }

    /* renamed from: E */
    public final void m20363E() {
        super.E();
        m20365G();
        if (this.f43173I != null) {
            this.f43173I = null;
        }
    }

    /* renamed from: F */
    public final void m20364F() {
        if (this.f43173I == null && !this.f43168D) {
            D();
        }
        AnonymousClass1PR anonymousClass1PR = this.f43173I;
        if (anonymousClass1PR != null) {
            m20368N(anonymousClass1PR);
        }
    }

    /* renamed from: G */
    public final void m20365G() {
        C();
    }

    /* renamed from: L */
    public final /* bridge */ /* synthetic */ Object m20366L() {
        return m20369O();
    }

    /* renamed from: M */
    public final /* bridge */ /* synthetic */ void m20367M(Object obj) {
        super.M((AnonymousClass1PR) obj);
    }

    /* renamed from: N */
    public final void m20368N(AnonymousClass1PR anonymousClass1PR) {
        this.f43173I = anonymousClass1PR;
        if (this.f7442I) {
            super.A(anonymousClass1PR);
        }
    }

    /* renamed from: O */
    public final AnonymousClass1PR m20369O() {
        Closeable closeable;
        IOException e;
        Throwable th;
        AbstractOAuthConsumer anonymousClass3fH = new AnonymousClass3fH(this.f43166B, this.f43167C);
        List asList = Arrays.asList(new AnonymousClass0gL[]{new AnonymousClass0gL("x_auth_username", this.f43171G), new AnonymousClass0gL("x_auth_password", this.f43169E), new AnonymousClass0gL("x_auth_mode", "client_auth")});
        AnonymousClass3fX anonymousClass3fX = new AnonymousClass3fX();
        try {
            AnonymousClass0aB anonymousClass0aB = new AnonymousClass0aB(AnonymousClass0G7.E(this.f43170F));
            anonymousClass0aB.f6466F = this.f43172H;
            anonymousClass0aB.f6464D = AnonymousClass0Pu.f4247G;
            anonymousClass0aB.f6462B = new AnonymousClass0gJ(asList);
            Object B = anonymousClass0aB.B();
            AnonymousClass0gN anonymousClass0gN = new AnonymousClass0gN();
            anonymousClass0gN.f8152H = AnonymousClass0Qv.Other;
            AnonymousClass0aA A = anonymousClass0gN.A();
            anonymousClass3fH.sign(B);
            String str = null;
            try {
                closeable = AnonymousClass0aD.B().A(new AnonymousClass0aC(B, A)).f6476D;
                try {
                    InputStream UJ = closeable.UJ();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[DexStore.LOAD_RESULT_MIXED_MODE];
                    while (true) {
                        int read = UJ.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    String str2 = new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF8"));
                    AnonymousClass0Du.C(closeable);
                    str = str2;
                } catch (IOException e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        AnonymousClass0Du.C(closeable);
                        return AnonymousClass1PR.B(str);
                    } catch (Throwable th2) {
                        th = th2;
                        AnonymousClass0Du.C(closeable);
                        throw th;
                    }
                }
            } catch (IOException e3) {
                e = e3;
                closeable = null;
                e.printStackTrace();
                AnonymousClass0Du.C(closeable);
                return AnonymousClass1PR.B(str);
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                AnonymousClass0Du.C(closeable);
                throw th;
            }
            return AnonymousClass1PR.B(str);
        } catch (Exception e4) {
            anonymousClass3fX.f43174B = e4.getMessage();
            return new AnonymousClass1PR(anonymousClass3fX);
        }
    }
}
