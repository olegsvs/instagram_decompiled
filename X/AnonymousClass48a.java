package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.C0164R;
import com.instagram.archive.fragment.ArchiveHomeFragment;
import com.instagram.common.ui.text.TitleTextView;
import java.util.List;

/* renamed from: X.48a */
public final class AnonymousClass48a extends BaseAdapter {
    /* renamed from: B */
    public final /* synthetic */ List f50740B;

    public final long getItemId(int i) {
        return (long) i;
    }

    public AnonymousClass48a(ArchiveHomeFragment archiveHomeFragment, List list) {
        this.f50740B = list;
    }

    public final int getCount() {
        return this.f50740B.size();
    }

    public final Object getItem(int i) {
        return this.f50740B.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.drop_down_row, viewGroup, false);
        }
        ((TitleTextView) view.findViewById(C0164R.id.option_text)).setText(((AnonymousClass48c) getItem(i)).f50758D);
        return view;
    }
}
