package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.53g */
public final class AnonymousClass53g implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LT f59674B;
    /* renamed from: C */
    public final /* synthetic */ List f59675C;
    /* renamed from: D */
    public final /* synthetic */ int f59676D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass1Oq f59677E;

    public AnonymousClass53g(AnonymousClass1LT anonymousClass1LT, AnonymousClass1Oq anonymousClass1Oq, List list, int i) {
        this.f59674B = anonymousClass1LT;
        this.f59677E = anonymousClass1Oq;
        this.f59675C = list;
        this.f59676D = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1LT anonymousClass1LT = this.f59674B;
        AnonymousClass1Oq anonymousClass1Oq = this.f59677E;
        AnonymousClass1d6 anonymousClass1d6 = (AnonymousClass1d6) this.f59675C.get(i);
        int i2 = this.f59676D;
        if (AnonymousClass53m.f59688B[anonymousClass1d6.ordinal()] == 1) {
            if (AnonymousClass0HV.D(anonymousClass1LT.f17354G).f2646B.getBoolean("seen_newsfeed_hide_story_dialog", false)) {
                AnonymousClass1LT.D(anonymousClass1LT, anonymousClass1Oq, i2);
                return;
            }
            new AnonymousClass0Sb(anonymousClass1LT.f17349B).Q(C0164R.string.delete_story_title).O(C0164R.string.delete, new AnonymousClass53l(anonymousClass1LT, anonymousClass1Oq, i2)).L(C0164R.string.cancel, new AnonymousClass53k(anonymousClass1LT)).E(true).F(true).C().show();
            AnonymousClass0HV.D(anonymousClass1LT.f17354G).f2646B.edit().putBoolean("seen_newsfeed_hide_story_dialog", true).apply();
        }
    }
}
