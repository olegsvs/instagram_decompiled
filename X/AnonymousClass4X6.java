package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4X6 */
public final class AnonymousClass4X6 extends BaseAdapter {
    /* renamed from: B */
    public final List f54948B = new ArrayList();
    /* renamed from: C */
    public final List f54949C = new ArrayList();
    /* renamed from: D */
    private LayoutInflater f54950D;

    public final long getItemId(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public AnonymousClass4X6(Context context) {
        this.f54950D = LayoutInflater.from(context);
    }

    /* renamed from: A */
    public final AnonymousClass4X6 m24425A(List list) {
        for (Venue venue : list) {
            if (!this.f54949C.contains(venue)) {
                this.f54949C.add(venue);
            }
        }
        return this;
    }

    /* renamed from: B */
    private View m24424B(int i, ViewGroup viewGroup) {
        switch (i) {
            case 0:
                i = this.f54950D.inflate(C0164R.layout.row_venue, viewGroup, false);
                AnonymousClass1Qe anonymousClass1Qe = new AnonymousClass1Qe();
                i.setTag(anonymousClass1Qe);
                anonymousClass1Qe.f18414C = (ImageView) i.findViewById(C0164R.id.row_venue_image);
                anonymousClass1Qe.f18416E = (TextView) i.findViewById(C0164R.id.row_venue_title);
                anonymousClass1Qe.f18415D = (TextView) i.findViewById(C0164R.id.row_venue_subtitle);
                anonymousClass1Qe.f18413B = i.findViewById(C0164R.id.row_divider);
                return i;
            case 1:
                return AnonymousClass3iy.m20497B(this.f54950D, viewGroup);
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: B */
    public final List m24426B() {
        return Collections.unmodifiableList(this.f54949C);
    }

    public final int getCount() {
        return this.f54949C.size() + this.f54948B.size();
    }

    public final Object getItem(int i) {
        if (i < this.f54949C.size()) {
            return this.f54949C.get(i);
        }
        return this.f54948B.get(i - this.f54949C.size());
    }

    public final int getItemViewType(int i) {
        i = getItem(i);
        if (i == 0) {
            return -1;
        }
        if (i instanceof Venue) {
            return 0;
        }
        return i.equals(AnonymousClass4X5.NO_RESULTS) ? 1 : -2;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        if (view == null) {
            view = m24424B(itemViewType, viewGroup);
        }
        switch (itemViewType) {
            case 0:
                Venue venue = (Venue) getItem(i);
                AnonymousClass1Qe anonymousClass1Qe = (AnonymousClass1Qe) view.getTag();
                anonymousClass1Qe.f18416E.setText(venue.f6716M);
                anonymousClass1Qe.f18413B.setVisibility(8);
                anonymousClass1Qe.f18414C.setVisibility(8);
                if (!TextUtils.isEmpty(venue.f6705B)) {
                    anonymousClass1Qe.f18415D.setText(venue.f6705B);
                    anonymousClass1Qe.f18415D.setVisibility(0);
                    break;
                }
                anonymousClass1Qe.f18415D.setVisibility(8);
                break;
            case 1:
                ((AnonymousClass3ix) view.getTag()).f43657C.setText(C0164R.string.no_locations_found);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return view;
    }
}
