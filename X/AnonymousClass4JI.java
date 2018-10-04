package X;

import android.widget.ListView;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.4JI */
public final class AnonymousClass4JI {
    /* renamed from: B */
    public final AnonymousClass4JH f52647B;
    /* renamed from: C */
    public final ListView f52648C;

    public AnonymousClass4JI(AnonymousClass0Cm anonymousClass0Cm, ListView listView, AnonymousClass5bJ anonymousClass5bJ, int i, int i2) {
        this.f52647B = new AnonymousClass4JH(listView.getContext(), anonymousClass0Cm, anonymousClass5bJ, i, i2);
        AnonymousClass2Hj[] E = AnonymousClass2Hj.m14938E();
        if (E != null) {
            Collection asList = Arrays.asList(E);
            AnonymousClass4JH anonymousClass4JH = this.f52647B;
            anonymousClass4JH.f52641B.clear();
            anonymousClass4JH.f52641B.addAll(asList);
            AnonymousClass4JH.m23825B(anonymousClass4JH);
        }
        listView.setAdapter(this.f52647B);
        this.f52648C = listView;
    }
}
