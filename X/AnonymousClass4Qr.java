package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Qr */
public final class AnonymousClass4Qr extends AnonymousClass0nJ {
    /* renamed from: B */
    public final AnonymousClass5Td f53996B;
    /* renamed from: C */
    public final int f53997C;
    /* renamed from: D */
    public final int f53998D;
    /* renamed from: E */
    public final int f53999E;
    /* renamed from: F */
    public final List f54000F = new ArrayList();

    public AnonymousClass4Qr(Context context, int i, AnonymousClass5Td anonymousClass5Td) {
        this.f53996B = anonymousClass5Td;
        this.f53999E = i;
        Resources resources = context.getResources();
        this.f53998D = Math.round(((float) resources.getDimensionPixelSize(C0164R.dimen.multi_capture_thumbnail_tray_height)) * AnonymousClass0Nm.H(resources.getDisplayMetrics()));
        this.f53997C = resources.getDimensionPixelSize(C0164R.dimen.multi_capture_thumbnail_corner_radius);
    }

    /* renamed from: B */
    public final int m24199B() {
        return this.f54000F.size();
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m24200I(AnonymousClass0oo anonymousClass0oo, int i) {
        ((AnonymousClass4Qq) anonymousClass0oo).f53995B.setImageDrawable(new AnonymousClass4Qo(((AnonymousClass4Qz) this.f54000F.get(i)).f54010B, (float) this.f53997C, this.f53999E));
    }

    /* renamed from: J */
    public final /* bridge */ /* synthetic */ AnonymousClass0oo m24201J(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.multi_capture_thumbnail, viewGroup, false);
        AnonymousClass0Nm.j(inflate, this.f53998D);
        return new AnonymousClass4Qq(this, inflate, this.f53996B);
    }

    /* renamed from: P */
    public final void m24202P(Bitmap bitmap, String str) {
        this.f54000F.add(new AnonymousClass4Qz(bitmap, str));
        this.f10044B.E(this.f54000F.size() - 1, 1);
    }

    /* renamed from: Q */
    public final void m24203Q(String str) {
        if (!this.f54000F.isEmpty()) {
            Iterator it = this.f54000F.iterator();
            while (it.hasNext()) {
                if (AnonymousClass0LQ.B(((AnonymousClass4Qz) it.next()).f54012D, str)) {
                    it.remove();
                }
            }
            notifyDataSetChanged();
        }
    }

    public final long getItemId(int i) {
        return ((AnonymousClass4Qz) this.f54000F.get(i)).f54011C;
    }
}
