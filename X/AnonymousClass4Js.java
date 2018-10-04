package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.common.gallery.GalleryItem;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Js */
public final class AnonymousClass4Js extends AnonymousClass0nJ implements AnonymousClass3B6 {
    /* renamed from: B */
    public final AnonymousClass5Sd f52729B;
    /* renamed from: C */
    public final int f52730C;
    /* renamed from: D */
    public final ArrayList f52731D = new ArrayList();
    /* renamed from: E */
    public final AnonymousClass2Uf f52732E;

    public final void TRA(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    public AnonymousClass4Js(AnonymousClass2Uf anonymousClass2Uf, AnonymousClass5Sd anonymousClass5Sd, int i) {
        this.f52732E = anonymousClass2Uf;
        this.f52729B = anonymousClass5Sd;
        this.f52730C = i;
    }

    /* renamed from: B */
    public final int m23846B() {
        return this.f52731D.size();
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m23847I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass4Jr anonymousClass4Jr = (AnonymousClass4Jr) anonymousClass0oo;
        Medium medium = (Medium) this.f52731D.get(i);
        anonymousClass4Jr.f52727C = medium;
        anonymousClass4Jr.f52726B.setBitmapShaderRotation(medium.zQ());
        if (anonymousClass4Jr.f52728D != null) {
            anonymousClass4Jr.f52726B.removeOnLayoutChangeListener(anonymousClass4Jr.f52728D);
            anonymousClass4Jr.f52728D = null;
        }
        anonymousClass4Jr.f52726B.setImageDrawable(null);
        anonymousClass4Jr.f52726B.setScaleX(1.0f);
        anonymousClass4Jr.f52726B.setScaleY(1.0f);
        this.f52732E.m16055A(medium, anonymousClass4Jr);
    }

    /* renamed from: J */
    public final /* bridge */ /* synthetic */ AnonymousClass0oo m23848J(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.gallery_sticker_grid_item, viewGroup, false);
        AnonymousClass0Nm.Z(inflate, this.f52730C);
        return new AnonymousClass4Jr(inflate, this.f52729B);
    }

    public final void RPA(List list, String str) {
        this.f52731D.clear();
        this.f52731D.addAll(list);
        notifyDataSetChanged();
    }

    public final List aR() {
        return new ArrayList();
    }

    public final long getItemId(int i) {
        return (long) ((Medium) this.f52731D.get(i)).f30924N.hashCode();
    }
}
