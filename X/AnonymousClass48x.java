package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.48x */
public final class AnonymousClass48x implements AnonymousClass0F8, AnonymousClass3bG, AnonymousClass1fZ {
    /* renamed from: B */
    public final AnonymousClass5Rm f50828B;
    /* renamed from: C */
    public String f50829C;
    /* renamed from: D */
    public final AnonymousClass1gg f50830D;
    /* renamed from: E */
    public int f50831E;
    /* renamed from: F */
    public final AnonymousClass0Cm f50832F;
    /* renamed from: G */
    public boolean f50833G;
    /* renamed from: H */
    private final Activity f50834H;
    /* renamed from: I */
    private final AnonymousClass0EE f50835I;
    /* renamed from: J */
    private final AnonymousClass0IL f50836J;
    /* renamed from: K */
    private final AnonymousClass30q f50837K;
    /* renamed from: L */
    private AnonymousClass41V f50838L;
    /* renamed from: M */
    private final AnonymousClass3bR f50839M;
    /* renamed from: N */
    private final String f50840N = UUID.randomUUID().toString();

    public final void Iw(AnonymousClass0MI anonymousClass0MI) {
    }

    public final void Mm(AnonymousClass3Uq anonymousClass3Uq) {
    }

    public final void kv(AnonymousClass0MI anonymousClass0MI) {
    }

    public final void qh() {
    }

    public AnonymousClass48x(AnonymousClass5Rm anonymousClass5Rm, Context context, AnonymousClass0IL anonymousClass0IL, Activity activity, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE, AnonymousClass3bR anonymousClass3bR, Bundle bundle, int i) {
        this.f50828B = anonymousClass5Rm;
        this.f50836J = anonymousClass0IL;
        this.f50834H = activity;
        this.f50839M = anonymousClass3bR;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f50832F = anonymousClass0Cm;
        this.f50835I = anonymousClass0EE;
        this.f50830D = new AnonymousClass1gg(context, anonymousClass0Cm2, false, false, false, this.f50835I, AnonymousClass0Qf.ARCHIVE_SUGGESTED_HIGHLIGHT, null);
        this.f50830D.f21390D = true;
        this.f50830D.f21389C = this;
        Bundle bundle2 = bundle;
        if (bundle != null) {
            this.f50829C = bundle2.getString("launched_suggested_highlights_reel_id");
        }
        this.f50831E = i;
        this.f50837K = new AnonymousClass30q(anonymousClass0IL, C0164R.id.archive_suggested_highlights_list);
    }

    /* renamed from: A */
    public final boolean m23420A() {
        if (this.f50829C != null) {
            if (!this.f50833G) {
                for (AnonymousClass0MI id : AnonymousClass0Jd.f2931B.I(this.f50832F).A()) {
                    if (id.getId().equals(this.f50829C)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m23421B(AnonymousClass0lG anonymousClass0lG) {
        if (this.f50829C == null) {
            return false;
        }
        this.f50837K.m18198A(anonymousClass0lG, AnonymousClass0Qf.ARCHIVE_SUGGESTED_HIGHLIGHT);
        return true;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -1513164529);
        AnonymousClass3Ul anonymousClass3Ul = (AnonymousClass3Ul) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, 598237158);
        if (anonymousClass3Ul.f41656B.getId().equals(this.f50829C)) {
            this.f50833G = true;
        }
        AnonymousClass0cQ.H(this, 621445268, I2);
        AnonymousClass0cQ.H(this, 1862919432, I);
    }

    public final void ov(String str, int i, List list, AnonymousClass0oo anonymousClass0oo, String str2) {
        AnonymousClass0F4.f2058E.A(AnonymousClass3Ul.class, this);
        RecyclerView recyclerView = (RecyclerView) anonymousClass0oo.f10370B.getParent();
        AnonymousClass10H anonymousClass10H = (AnonymousClass10H) recyclerView.a(i);
        this.f50829C = str;
        AnonymousClass0MI R = this.f50830D.R(str);
        this.f50838L = new AnonymousClass41V(recyclerView, this);
        List arrayList = new ArrayList();
        arrayList.add(R);
        AnonymousClass30k.m18187B("tap_suggested_highlight", this.f50835I, str);
        AnonymousClass0MI R2 = this.f50830D.R(str);
        AnonymousClass3bR anonymousClass3bR = this.f50839M;
        anonymousClass3bR.f42622J = this.f50838L;
        anonymousClass3bR.f42623K = true;
        anonymousClass3bR.f42625M = this.f50840N;
        anonymousClass3bR.f42620H = new AnonymousClass48v(this, R2);
        anonymousClass3bR.m20157B(anonymousClass10H, R2, arrayList, arrayList, arrayList, AnonymousClass0Qf.ARCHIVE_SUGGESTED_HIGHLIGHT, null, null);
    }

    public final void sv(String str, int i, List list) {
        new AnonymousClass0oy(this.f50832F, this.f50834H, this.f50836J, this.f50835I, str).B(null, new AnonymousClass48w(this), null);
    }
}
