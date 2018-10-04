package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.65V */
public final class AnonymousClass65V extends AnonymousClass3AL {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass64y f71618B;

    public AnonymousClass65V(AnonymousClass65c anonymousClass65c, AnonymousClass64y anonymousClass64y) {
        this.f71618B = anonymousClass64y;
    }

    /* renamed from: A */
    public final void m28948A(Exception exception) {
        AnonymousClass652.m28921C(exception, this.f71618B);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m28949B(Object obj) {
        List<AnonymousClass64w> list = ((AnonymousClass64p) obj).f71550B;
        List arrayList = new ArrayList(list.size());
        for (AnonymousClass64w anonymousClass64w : list) {
            arrayList.add(new AnonymousClass65L(anonymousClass64w.f71556B, anonymousClass64w.f71558D, anonymousClass64w.f71557C, 0, 0, AnonymousClass65N.UNANSWERED));
        }
        AnonymousClass652.m28922D(arrayList, this.f71618B);
    }
}
