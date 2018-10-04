package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* renamed from: X.4jc */
public final class AnonymousClass4jc extends AnonymousClass0nJ {
    /* renamed from: B */
    public final Context f56655B;
    /* renamed from: C */
    public final List f56656C = new ArrayList();
    /* renamed from: D */
    public boolean f56657D;
    /* renamed from: E */
    public final AnonymousClass0Cm f56658E;
    /* renamed from: F */
    private final AnonymousClass5Wu f56659F;

    public AnonymousClass4jc(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5Wu anonymousClass5Wu) {
        this.f56655B = context;
        this.f56658E = anonymousClass0Cm;
        this.f56659F = anonymousClass5Wu;
    }

    /* renamed from: B */
    public final int m24910B() {
        int size = this.f56656C.size();
        return this.f56657D ? size + 1 : size;
    }

    /* renamed from: I */
    public final void m24911I(AnonymousClass0oo anonymousClass0oo, int i) {
        int i2 = i;
        AnonymousClass0oo anonymousClass0oo2 = anonymousClass0oo;
        AnonymousClass4jc anonymousClass4jc = this;
        List list;
        AnonymousClass5Wu anonymousClass5Wu;
        switch (anonymousClass0oo2.f10374F) {
            case 1:
                list = this.f56656C;
                if (this.f56657D) {
                    i2 = i - 1;
                }
                AnonymousClass4dl anonymousClass4dl = (AnonymousClass4dl) list.get(i2);
                AnonymousClass4jZ anonymousClass4jZ = (AnonymousClass4jZ) anonymousClass0oo2;
                AnonymousClass5Wu anonymousClass5Wu2 = this.f56659F;
                Context context = anonymousClass4jZ.f56650C.getContext();
                AnonymousClass0Cm anonymousClass0Cm = anonymousClass4jZ.f56651D;
                String str = anonymousClass4dl.f55876C.f55862E;
                AnonymousClass4db anonymousClass4db = anonymousClass4dl.f55876C;
                anonymousClass4jZ.f56650C.setImageDrawable(new AnonymousClass2eY(context, anonymousClass0Cm, str, null, anonymousClass4db.f55864G / anonymousClass4db.f55859B, (float) context.getResources().getDimensionPixelSize(C0164R.dimen.direct_gifs_drawer_loading_bar_stroke_width), 0, context.getResources().getDimensionPixelSize(C0164R.dimen.direct_gifs_drawer_item_height), AnonymousClass0Ca.C(context, C0164R.color.black_20_transparent), AnonymousClass0Ca.C(context, C0164R.color.black_60_transparent), ((Boolean) AnonymousClass0CC.CJ.H(anonymousClass4jZ.f56651D)).booleanValue() ? AnonymousClass295.f26657I : AnonymousClass295.f26656H));
                AnonymousClass15z anonymousClass15z = new AnonymousClass15z(anonymousClass4jZ.f56649B);
                anonymousClass15z.f14385E = new AnonymousClass4jY(anonymousClass4jZ, anonymousClass5Wu2, anonymousClass4dl);
                anonymousClass15z.A();
                anonymousClass5Wu = anonymousClass4jc.f56659F;
                AnonymousClass0EE anonymousClass0EE = anonymousClass5Wu.f65670C;
                String str2 = anonymousClass5Wu.f65669B.f56677O;
                String str3 = anonymousClass4dl.f55875B.f55860C;
                AnonymousClass0NN.B("giphy_gif_impression", anonymousClass0EE).F("session_id", str2).F("gif_id", str3).F("response_id", anonymousClass5Wu.f65669B.f56674L).C("timestamp", System.currentTimeMillis()).R();
                return;
            case 2:
                Random random = new Random();
                AnonymousClass4jb anonymousClass4jb = (AnonymousClass4jb) anonymousClass0oo2;
                list = this.f56656C;
                AnonymousClass4dl anonymousClass4dl2 = (AnonymousClass4dl) list.get(random.nextInt(list.size() - 1));
                AnonymousClass4dl anonymousClass4dl3 = new AnonymousClass4dl(AnonymousClass4db.m24617B(anonymousClass4dl2.f55876C), AnonymousClass4db.m24617B(anonymousClass4dl2.f55875B));
                anonymousClass5Wu = this.f56659F;
                AnonymousClass15z anonymousClass15z2 = new AnonymousClass15z(anonymousClass4jb.f56654B);
                anonymousClass15z2.f14385E = new AnonymousClass4ja(anonymousClass4jb, anonymousClass5Wu, anonymousClass4dl3);
                anonymousClass15z2.A();
                return;
            default:
                return;
        }
    }

    /* renamed from: J */
    public final AnonymousClass0oo m24912J(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new AnonymousClass4jZ(LayoutInflater.from(this.f56655B).inflate(C0164R.layout.thread_gifs_drawer_item, viewGroup, false), this.f56658E);
            case 2:
                return new AnonymousClass4jb(LayoutInflater.from(this.f56655B).inflate(C0164R.layout.thread_gifs_drawer_random_item, viewGroup, false));
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown viewtype: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final int getItemViewType(int i) {
        return (this.f56657D && i == 0) ? 2 : 1;
    }
}
