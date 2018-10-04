package X;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListView;
import java.util.Set;

/* renamed from: X.10h */
public final class AnonymousClass10h implements OnGlobalLayoutListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0hO f13302B;
    /* renamed from: C */
    public final /* synthetic */ Set f13303C;
    /* renamed from: D */
    public final /* synthetic */ ListView f13304D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0lG f13305E;

    public AnonymousClass10h(AnonymousClass0hO anonymousClass0hO, ListView listView, AnonymousClass0lG anonymousClass0lG, Set set) {
        this.f13302B = anonymousClass0hO;
        this.f13304D = listView;
        this.f13305E = anonymousClass0lG;
        this.f13303C = set;
    }

    public final void onGlobalLayout() {
        this.f13304D.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        AnonymousClass0hO.m6740G(this.f13302B, this.f13305E, this.f13304D, this.f13303C);
    }
}
