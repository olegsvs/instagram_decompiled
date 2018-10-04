package X;

import java.io.File;

/* renamed from: X.0Tx */
public final class AnonymousClass0Tx {
    /* renamed from: B */
    public AnonymousClass1KV f5309B;
    /* renamed from: C */
    public boolean f5310C;
    /* renamed from: D */
    public final String f5311D;
    /* renamed from: E */
    private AnonymousClass145 f5312E;
    /* renamed from: F */
    private final File f5313F;
    /* renamed from: G */
    private boolean f5314G;
    /* renamed from: H */
    private boolean f5315H = false;
    /* renamed from: I */
    private long f5316I = 0;

    public AnonymousClass0Tx(File file, String str) {
        this.f5313F = file;
        this.f5311D = str;
    }

    /* renamed from: A */
    public final File m4655A() {
        File file = this.f5313F;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5311D);
        stringBuilder.append(".clean");
        return new File(file, stringBuilder.toString());
    }

    /* renamed from: B */
    public final synchronized AnonymousClass145 m4656B() {
        return this.f5312E;
    }

    /* renamed from: C */
    public final File m4657C() {
        File file = this.f5313F;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5311D);
        stringBuilder.append(".tmp");
        return new File(file, stringBuilder.toString());
    }

    /* renamed from: D */
    public final synchronized long m4658D() {
        return this.f5316I;
    }

    /* renamed from: E */
    public final File m4659E() {
        File file = this.f5313F;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5311D);
        stringBuilder.append(".metadata");
        return new File(file, stringBuilder.toString());
    }

    /* renamed from: F */
    public final synchronized boolean m4660F() {
        return this.f5314G;
    }

    /* renamed from: G */
    public final synchronized boolean m4661G() {
        return this.f5315H;
    }

    /* renamed from: H */
    public final synchronized void m4662H(long j, boolean z) {
        this.f5316I = j;
        this.f5312E = null;
        this.f5315H = true;
        this.f5314G = z;
    }

    /* renamed from: I */
    public final synchronized void m4663I(AnonymousClass145 anonymousClass145) {
        this.f5312E = anonymousClass145;
    }

    /* renamed from: J */
    public final synchronized void m4664J(AnonymousClass1KV anonymousClass1KV, boolean z) {
        this.f5309B = anonymousClass1KV;
        this.f5310C = z;
    }
}
