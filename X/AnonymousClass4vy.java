package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.C0164R;
import com.instagram.igtv.viewer.IGTVViewerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4vy */
public final class AnonymousClass4vy extends BaseAdapter {
    /* renamed from: B */
    public AnonymousClass0n8 f58604B;
    /* renamed from: C */
    public final List f58605C = new ArrayList();
    /* renamed from: D */
    private final AnonymousClass4vn f58606D;
    /* renamed from: E */
    private final AnonymousClass4uW f58607E;
    /* renamed from: F */
    private final IGTVViewerFragment f58608F;
    /* renamed from: G */
    private final IGTVViewerFragment f58609G;
    /* renamed from: H */
    private final AnonymousClass0Cm f58610H;

    public AnonymousClass4vy(AnonymousClass0Cm anonymousClass0Cm, IGTVViewerFragment iGTVViewerFragment, IGTVViewerFragment iGTVViewerFragment2, AnonymousClass4vn anonymousClass4vn, AnonymousClass4uW anonymousClass4uW) {
        this.f58608F = iGTVViewerFragment;
        this.f58609G = iGTVViewerFragment2;
        this.f58610H = anonymousClass0Cm;
        this.f58606D = anonymousClass4vn;
        this.f58607E = anonymousClass4uW;
    }

    /* renamed from: A */
    public final AnonymousClass2CT m25431A(int i) {
        return (i < 0 || i >= this.f58605C.size()) ? null : (AnonymousClass2CT) this.f58605C.get(i);
    }

    public final int getCount() {
        return this.f58605C.size();
    }

    public final Object getItem(int i) {
        return this.f58605C.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((AnonymousClass2CT) this.f58605C.get(i)).f27422J;
    }

    public final int getItemViewType(int i) {
        return ((AnonymousClass2CT) this.f58605C.get(i)).W() ? 1 : 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            switch (getItemViewType(i)) {
                case 0:
                    AnonymousClass0Cm anonymousClass0Cm = this.f58610H;
                    IGTVViewerFragment iGTVViewerFragment = this.f58608F;
                    AnonymousClass4vn anonymousClass4vn = this.f58606D;
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.channel_item_view, viewGroup, false);
                    view.setTag(new AnonymousClass5c3(view, anonymousClass0Cm, iGTVViewerFragment, anonymousClass4vn));
                    break;
                case 1:
                    IGTVViewerFragment iGTVViewerFragment2 = this.f58609G;
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.channel_item_sponsored_view, viewGroup, false);
                    view.setTag(new AnonymousClass5c4(view, iGTVViewerFragment2));
                    break;
                default:
                    break;
            }
        }
        AnonymousClass2CT anonymousClass2CT = (AnonymousClass2CT) this.f58605C.get(i);
        ((AnonymousClass5YU) view.getTag()).pC(anonymousClass2CT, i);
        this.f58607E.m25335A(view, anonymousClass2CT, i);
        return view;
    }
}
