package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.370 */
public abstract class AnonymousClass370 implements AnonymousClass0EE {
    /* renamed from: B */
    public final AnonymousClass36n f37966B;
    /* renamed from: C */
    public File f37967C;
    /* renamed from: D */
    public final Context f37968D;
    /* renamed from: E */
    public AnonymousClass37m f37969E = this.f37970F.f37975C;
    /* renamed from: F */
    public final AnonymousClass372 f37970F;
    /* renamed from: G */
    public String f37971G;

    /* renamed from: A */
    public abstract String mo4716A();

    /* renamed from: D */
    public abstract String mo4717D();

    public AnonymousClass370(Context context, AnonymousClass36n anonymousClass36n, AnonymousClass372 anonymousClass372) {
        this.f37968D = context;
        this.f37966B = anonymousClass36n;
        this.f37970F = anonymousClass372;
    }

    /* renamed from: B */
    public final File m18571B() {
        return new File(AnonymousClass0Gq.B(this.f37968D, "ig_mq_assets_dir", false), mo4716A());
    }

    /* renamed from: C */
    public final Collection m18572C() {
        return AnonymousClass37G.m18610C(m18571B(), Arrays.asList(new File[]{this.f37967C}));
    }

    /* renamed from: E */
    public final boolean m18574E() {
        return this.f37970F.m18582D();
    }

    /* renamed from: F */
    public final boolean m18575F(List list, int i, AnonymousClass3C9 anonymousClass3C9, String str, String str2, String str3, String str4, File file) {
        String str5 = str3;
        File file2 = new File(file, str3);
        if (file2.exists()) {
            if (anonymousClass3C9 != null) {
                anonymousClass3C9.Ij(null);
            }
            return false;
        }
        String str6 = str4;
        AnonymousClass3C5 G = m18576G(str, str6, str2, str5, i);
        G.m18952C(file2);
        G.f38915B = anonymousClass3C9;
        list.add(G);
        return true;
    }

    /* renamed from: G */
    public final AnonymousClass3C5 m18576G(String str, String str2, String str3, String str4, int i) {
        return new AnonymousClass3C5(str, mo4716A(), str2, Uri.parse(str3), StringFormatUtil.formatStrLocaleSafe("%s_%s", str4, mo4716A()), i);
    }

    /* renamed from: H */
    public final void m18577H(AnonymousClass0Iw anonymousClass0Iw) {
        this.f37970F.m18584F(anonymousClass0Iw);
    }

    /* renamed from: I */
    public final void m18578I(String str) {
        this.f37971G = str;
        this.f37970F.f37979G = str;
    }

    public final String getModuleName() {
        return this.f37970F.getModuleName();
    }
}
