package X;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.instagram.model.hashtag.Hashtag;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4sK */
public final class AnonymousClass4sK implements OnScrollListener, AnonymousClass2IG {
    /* renamed from: B */
    private final AnonymousClass0EE f58052B;
    /* renamed from: C */
    private final Set f58053C = new HashSet();
    /* renamed from: D */
    private final ListView f58054D;
    /* renamed from: E */
    private final AnonymousClass2IH f58055E = new AnonymousClass2IH(this);
    /* renamed from: F */
    private final String f58056F;

    public AnonymousClass4sK(AnonymousClass0EE anonymousClass0EE, ListView listView, String str) {
        this.f58052B = anonymousClass0EE;
        this.f58054D = listView;
        this.f58056F = str;
    }

    public final void SKA(int i) {
        Object itemAtPosition = this.f58054D.getItemAtPosition(i);
        if (itemAtPosition != null) {
            if (itemAtPosition instanceof Hashtag) {
                Hashtag hashtag = (Hashtag) itemAtPosition;
                if (!this.f58053C.contains(hashtag.f2786F)) {
                    AnonymousClass0NN F = AnonymousClass0NN.B("media_hashtags_list_item_impression", this.f58052B).F("seed_media_id", this.f58056F).B("list_position", i).B("post_count", hashtag.f2789I).F("hashtag_id", hashtag.f2786F).F("hashtag_name", hashtag.f2793M).F("hashtag_follow_status", hashtag.A().toString()).F("follow_status", hashtag.A().toString());
                    AnonymousClass0uC.B(F, hashtag);
                    F.R();
                    this.f58053C.add(hashtag.f2786F);
                }
            }
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -1947986691);
        this.f58055E.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, -206162661, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 1596249775);
        this.f58055E.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, -1293121315, I);
    }
}
