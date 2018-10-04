package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.creation.capture.quickcapture.music.search.MusicOverlayResultsListController;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4SE */
public final class AnonymousClass4SE extends AnonymousClass0nJ {
    /* renamed from: B */
    public final MusicOverlayResultsListController f54220B;
    /* renamed from: C */
    public final AnonymousClass0Ro f54221C;
    /* renamed from: D */
    public final AnonymousClass53X f54222D;
    /* renamed from: E */
    public final List f54223E = new ArrayList();
    /* renamed from: F */
    public final List f54224F = new ArrayList();
    /* renamed from: G */
    private final AnonymousClass23C f54225G = new AnonymousClass23C();

    public AnonymousClass4SE(AnonymousClass53X anonymousClass53X, MusicOverlayResultsListController musicOverlayResultsListController, AnonymousClass0Ro anonymousClass0Ro) {
        this.f54222D = anonymousClass53X;
        this.f54220B = musicOverlayResultsListController;
        this.f54221C = anonymousClass0Ro;
        AnonymousClass4SE.m24265B(this);
    }

    /* renamed from: B */
    public final int m24267B() {
        return this.f54224F.size();
    }

    /* renamed from: B */
    public static void m24265B(AnonymousClass4SE anonymousClass4SE) {
        anonymousClass4SE.f54224F.clear();
        for (AnonymousClass2G1 anonymousClass4SD : anonymousClass4SE.f54223E) {
            anonymousClass4SE.f54224F.add(new AnonymousClass4SD(anonymousClass4SD));
        }
        anonymousClass4SE.f54224F.add(new AnonymousClass4SD(anonymousClass4SE.f54221C));
        anonymousClass4SE.notifyDataSetChanged();
    }

    /* renamed from: C */
    private static int m24266C(AnonymousClass2G2 anonymousClass2G2) {
        switch (anonymousClass2G2.ordinal()) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                throw new UnsupportedOperationException("Unknown search item type");
        }
    }

    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void m24268I(AnonymousClass0oo anonymousClass0oo, int i) {
        AnonymousClass4S8 anonymousClass4S8 = (AnonymousClass4S8) anonymousClass0oo;
        AnonymousClass4SD anonymousClass4SD = (AnonymousClass4SD) this.f54224F.get(i);
        int itemViewType = getItemViewType(i);
        switch (itemViewType) {
            case 0:
                ((AnonymousClass5U3) anonymousClass4S8).W(anonymousClass4SD.f54218B, this.f54222D.A(anonymousClass4SD.f54218B.f28179D.f28197L));
                return;
            case 1:
            case 2:
                anonymousClass4S8.m24261V(anonymousClass4SD.f54218B);
                return;
            case 3:
                AnonymousClass5Tw anonymousClass5Tw = (AnonymousClass5Tw) anonymousClass4S8;
                anonymousClass5Tw.f64663B.A(this.f54221C);
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown view type: ");
                stringBuilder.append(itemViewType);
                throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    /* renamed from: J */
    public final /* bridge */ /* synthetic */ AnonymousClass0oo m24269J(ViewGroup viewGroup, int i) {
        return m24272Q(viewGroup, i);
    }

    /* renamed from: K */
    public final /* bridge */ /* synthetic */ void m24270K(AnonymousClass0oo anonymousClass0oo) {
        AnonymousClass4S8 anonymousClass4S8 = (AnonymousClass4S8) anonymousClass0oo;
        super.K(anonymousClass4S8);
        int E = anonymousClass4S8.E();
        if (E >= 0 && E < this.f54224F.size()) {
            AnonymousClass4SD anonymousClass4SD = (AnonymousClass4SD) this.f54224F.get(E);
            if (AnonymousClass4SC.SEARCH_ITEM.equals(anonymousClass4SD.f54219C) && AnonymousClass2G2.TRACK.equals(anonymousClass4SD.f54218B.f28180E)) {
                MusicOverlayResultsListController musicOverlayResultsListController = this.f54220B;
                AnonymousClass2G5 anonymousClass2G5 = anonymousClass4SD.f54218B.f28179D;
                if (!musicOverlayResultsListController.f66889L.contains(anonymousClass2G5.f28194I)) {
                    musicOverlayResultsListController.f66889L.add(anonymousClass2G5.f28194I);
                    AnonymousClass0Cm anonymousClass0Cm = musicOverlayResultsListController.f66890M;
                    AnonymousClass2Fv anonymousClass2Fv = musicOverlayResultsListController.f66884G;
                    AnonymousClass281.m14531B(anonymousClass0Cm).ha(anonymousClass2G5.f28194I, anonymousClass2G5.f28196K, anonymousClass2G5.f28192G, anonymousClass2Fv.f28153B, anonymousClass2Fv.f28154C, musicOverlayResultsListController.f66881D);
                }
            }
        }
    }

    /* renamed from: P */
    public final int m24271P(AnonymousClass2G1 anonymousClass2G1) {
        for (int i = 0; i < this.f54224F.size(); i++) {
            if (anonymousClass2G1.equals(((AnonymousClass4SD) this.f54224F.get(i)).f54218B)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public final AnonymousClass4S8 m24272Q(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        switch (i) {
            case 0:
                return new AnonymousClass5U3(LayoutInflater.from(context).inflate(C0164R.layout.music_search_row_track, viewGroup, false), this.f54220B);
            case 1:
                return new AnonymousClass5Tz(LayoutInflater.from(context).inflate(C0164R.layout.music_search_row_grouping, viewGroup, false), this.f54220B);
            case 2:
                return new AnonymousClass5Tu(LayoutInflater.from(context).inflate(C0164R.layout.music_search_row_grouping, viewGroup, false), this.f54220B);
            case 3:
                return new AnonymousClass5Tw(LoadMoreButton.B(context, viewGroup, C0164R.layout.music_search_row_empty_state));
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown view type: ");
                stringBuilder.append(i);
                throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    public final long getItemId(int i) {
        String A;
        AnonymousClass4SD anonymousClass4SD = (AnonymousClass4SD) this.f54224F.get(i);
        switch (anonymousClass4SD.f54219C.ordinal()) {
            case 0:
                A = anonymousClass4SD.f54218B.m14868A();
                break;
            case 1:
                A = "ITEM_ID_KEY.LOAD_MORE_ROW";
                break;
            default:
                throw new UnsupportedOperationException("Unknown view model type");
        }
        return this.f54225G.m14288A(A);
    }

    public final int getItemViewType(int i) {
        AnonymousClass4SD anonymousClass4SD = (AnonymousClass4SD) this.f54224F.get(i);
        switch (anonymousClass4SD.f54219C.ordinal()) {
            case 0:
                return AnonymousClass4SE.m24266C(anonymousClass4SD.f54218B.f28180E);
            case 1:
                return 3;
            default:
                throw new UnsupportedOperationException("Unknown view model type");
        }
    }
}
