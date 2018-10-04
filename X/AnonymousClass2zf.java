package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.2zf */
public final class AnonymousClass2zf extends BaseAdapter {
    /* renamed from: B */
    public final List f36689B;
    /* renamed from: C */
    private final AnonymousClass49R f36690C;

    public AnonymousClass2zf(List list, AnonymousClass49R anonymousClass49R) {
        this.f36689B = list;
        this.f36690C = anonymousClass49R;
    }

    public final int getCount() {
        return this.f36689B.size();
    }

    public final Object getItem(int i) {
        return this.f36689B.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((AnonymousClass0P7) this.f36689B.get(i)).getId().hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.cover_image_item, viewGroup, false);
            AnonymousClass2ze anonymousClass2ze = new AnonymousClass2ze();
            anonymousClass2ze.f36688B = (IgImageView) view;
            view.setTag(anonymousClass2ze);
        }
        AnonymousClass2ze anonymousClass2ze2 = (AnonymousClass2ze) view.getTag();
        AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) getItem(i);
        AnonymousClass49R anonymousClass49R = this.f36690C;
        anonymousClass2ze2.f36688B.setPlaceHolderColor(AnonymousClass0Ca.C(anonymousClass2ze2.f36688B.getContext(), C0164R.color.grey_1));
        anonymousClass2ze2.f36688B.setUrl(anonymousClass0P7.HA());
        anonymousClass2ze2.f36688B.setOnClickListener(new AnonymousClass2zd(anonymousClass49R, anonymousClass0P7));
        return view;
    }
}
