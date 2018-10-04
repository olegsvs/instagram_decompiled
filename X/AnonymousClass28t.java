package X;

import android.net.Uri;
import java.io.ByteArrayOutputStream;

/* renamed from: X.28t */
public final class AnonymousClass28t implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass295 f26623B;
    /* renamed from: C */
    public final /* synthetic */ String f26624C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0To f26625D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass294 f26626E;
    /* renamed from: F */
    public final /* synthetic */ Runnable f26627F;
    /* renamed from: G */
    public final /* synthetic */ String f26628G;

    public AnonymousClass28t(AnonymousClass295 anonymousClass295, String str, String str2, AnonymousClass0To anonymousClass0To, AnonymousClass294 anonymousClass294, Runnable runnable) {
        this.f26623B = anonymousClass295;
        this.f26628G = str;
        this.f26624C = str2;
        this.f26625D = anonymousClass0To;
        this.f26626E = anonymousClass294;
        this.f26627F = runnable;
    }

    public final void run() {
        Uri parse = Uri.parse(this.f26628G);
        if (this.f26623B.f26662D.G(this.f26624C)) {
            AnonymousClass295.m14605B(this.f26623B, this.f26625D, this.f26628G, this.f26626E, this.f26627F);
        } else if ("content".equals(parse.getScheme())) {
            AnonymousClass295.m14609F(this.f26623B, this.f26625D, this.f26628G, this.f26626E, this.f26627F);
        } else {
            AnonymousClass295 anonymousClass295 = this.f26623B;
            AnonymousClass0To anonymousClass0To = this.f26625D;
            String str = this.f26628G;
            AnonymousClass294 anonymousClass294 = this.f26626E;
            Runnable runnable = this.f26627F;
            String WJ = anonymousClass294.WJ(str);
            AnonymousClass0Gp.f2421B.C(AnonymousClass0a9.f6449F.AHA(str), new AnonymousClass28w(anonymousClass295, WJ, str, new ByteArrayOutputStream(), anonymousClass0To, anonymousClass294, runnable), AnonymousClass295.f26658J);
        }
    }
}
