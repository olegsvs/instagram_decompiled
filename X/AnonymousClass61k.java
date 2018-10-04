package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.61k */
public final class AnonymousClass61k extends AnonymousClass0nJ {
    /* renamed from: B */
    public final Context f71013B;
    /* renamed from: C */
    public final AnonymousClass6Ha f71014C;
    /* renamed from: D */
    public final List f71015D = new ArrayList();
    /* renamed from: E */
    public final AnonymousClass3fl f71016E;
    /* renamed from: F */
    private final Map f71017F = new HashMap();

    public AnonymousClass61k(Context context, AnonymousClass6Ha anonymousClass6Ha, AnonymousClass3fl anonymousClass3fl) {
        this.f71013B = context;
        this.f71014C = anonymousClass6Ha;
        this.f71016E = anonymousClass3fl;
    }

    /* renamed from: B */
    public final int m28795B() {
        return Math.min(this.f71015D.size(), 10);
    }

    /* renamed from: B */
    public static int m28794B(AnonymousClass61k anonymousClass61k, AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass0LH.B(anonymousClass0P7.kA());
        if (anonymousClass61k.f71017F.containsKey(anonymousClass0P7.getId())) {
            return ((Integer) anonymousClass61k.f71017F.get(anonymousClass0P7.getId())).intValue();
        }
        int B = AnonymousClass63U.m28838B(anonymousClass0P7, anonymousClass61k.f71014C.f74117C.f73358K);
        anonymousClass61k.f71017F.put(anonymousClass0P7.getId(), Integer.valueOf(B));
        return B;
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m28796I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass61j anonymousClass61j = (AnonymousClass61j) anonymousClass0oo;
        AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) this.f71015D.get(i);
        if (anonymousClass0P7.kA()) {
            anonymousClass61j.f71012B.setUrl(anonymousClass0P7.S(AnonymousClass61k.m28794B(this, anonymousClass0P7)).x(this.f71013B));
        } else {
            anonymousClass61j.f71012B.setUrl(anonymousClass0P7.x(this.f71013B));
        }
        anonymousClass61j.f71012B.J(anonymousClass0P7.kA());
        anonymousClass61j.f71012B.setOnClickListener(new AnonymousClass61i(this, anonymousClass0P7));
        String T = anonymousClass0P7.MA().T();
        anonymousClass61j.f71012B.setContentDescription(this.f71013B.getString(C0164R.string.image_description, new Object[]{T}));
    }

    /* renamed from: J */
    public final /* bridge */ /* synthetic */ AnonymousClass0oo m28797J(ViewGroup viewGroup, int i) {
        return new AnonymousClass61j(LayoutInflater.from(this.f71013B).inflate(C0164R.layout.related_media_item, viewGroup, false));
    }

    /* renamed from: P */
    public final void m28798P(List list) {
        this.f71017F.clear();
        this.f71015D.clear();
        this.f71015D.addAll(list);
        notifyDataSetChanged();
    }
}
