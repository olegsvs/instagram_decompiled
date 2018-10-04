package X;

import com.instagram.common.gallery.GalleryItem;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3BC */
public final class AnonymousClass3BC extends AnonymousClass0nF {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3BD f38666B;

    /* renamed from: A */
    public final void m18867A(Exception exception) {
    }

    public AnonymousClass3BC(AnonymousClass3BD anonymousClass3BD) {
        this.f38666B = anonymousClass3BD;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m18868B(Object obj) {
        List<Medium> list = (List) obj;
        AnonymousClass3BD.m18870C(this.f38666B);
        List<GalleryItem> arrayList = new ArrayList(this.f38666B.f38667B.aR());
        int size = arrayList.size();
        for (Medium medium : list) {
            AnonymousClass3BD.m18869B(this.f38666B, medium);
            GalleryItem galleryItem = new GalleryItem(medium);
            if (arrayList.contains(galleryItem)) {
                arrayList.remove(galleryItem);
            }
        }
        for (GalleryItem galleryItem2 : arrayList) {
            if (galleryItem2.m14353D()) {
                this.f38666B.f38667B.TRA(galleryItem2, false, false);
            }
        }
        this.f38666B.f38667B.RPA(this.f38666B.f38669D.m18863C(), this.f38666B.f38669D.f38665F);
        if (this.f38666B.f38668C.f38697C != null) {
            AnonymousClass0TW anonymousClass0TW = this.f38666B.f38668C.f38697C;
            AnonymousClass3BD anonymousClass3BD = this.f38666B;
            anonymousClass0TW.Qr(anonymousClass3BD, anonymousClass3BD.f38671F.m18863C(), this.f38666B.f38669D.m18863C());
        }
        if (!this.f38666B.f38670E) {
            this.f38666B.f38670E = true;
            if (this.f38666B.f38678M != null) {
                this.f38666B.f38678M.run();
            }
        } else if (size == arrayList.size() && !this.f38666B.f38669D.m18863C().isEmpty()) {
            AnonymousClass3BD anonymousClass3BD2 = this.f38666B;
            anonymousClass3BD2.m18876F((Medium) anonymousClass3BD2.f38669D.m18863C().get(0), true);
        }
    }
}
