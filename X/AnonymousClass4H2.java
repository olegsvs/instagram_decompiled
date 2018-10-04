package X;

import android.content.Context;
import android.os.Parcel;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.C0164R;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.filterkit.filter.IgFilter;
import com.instagram.filterkit.filter.IgFilterGroup;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4H2 */
public final class AnonymousClass4H2 implements AnonymousClass3Cu {
    /* renamed from: B */
    public int f52256B = 100;
    /* renamed from: C */
    public final SparseIntArray f52257C = new SparseIntArray();
    /* renamed from: D */
    public AlbumEditFragment f52258D;
    /* renamed from: E */
    private AnonymousClass3ym f52259E;
    /* renamed from: F */
    private List f52260F = new ArrayList();
    /* renamed from: G */
    private List f52261G = new ArrayList();

    public final boolean Tz(View view, ViewGroup viewGroup, IgFilter igFilter, AnonymousClass3Ct anonymousClass3Ct) {
        return false;
    }

    /* renamed from: A */
    public final boolean m23720A(View view, List list, List list2, AlbumEditFragment albumEditFragment) {
        this.f52258D = albumEditFragment;
        this.f52260F = list;
        this.f52261G = list2;
        AnonymousClass3ym anonymousClass3ym = (AnonymousClass3ym) view;
        this.f52256B = this.f52257C.get(anonymousClass3ym.getTileInfo().oM(), 100);
        if (this.f52259E == view && anonymousClass3ym.getTileInfo().oM() != 0) {
            return AnonymousClass0ci.B(AnonymousClass0ch.DEFAULT).f7232C;
        }
        AnonymousClass3ym anonymousClass3ym2 = this.f52259E;
        if (anonymousClass3ym2 != null) {
            anonymousClass3ym2.setChecked(false);
        }
        anonymousClass3ym.setChecked(true);
        anonymousClass3ym.refreshDrawableState();
        this.f52259E = anonymousClass3ym;
        BaseFilter baseFilter = ((AnonymousClass4H3) anonymousClass3ym.getTileInfo()).f52262B;
        for (IgFilterGroup igFilterGroup : this.f52260F) {
            PhotoFilter photoFilter = (PhotoFilter) igFilterGroup.m22013B(15);
            baseFilter.m23009G(this.f52256B);
            baseFilter.m23008F(photoFilter.f50026D);
            baseFilter.m23012J(photoFilter.f50031I);
            baseFilter.m23013K(photoFilter.f50032J);
            baseFilter.m23011I(photoFilter.f50030H);
            baseFilter.f50025C = photoFilter.f50025C;
            Parcel obtain = Parcel.obtain();
            baseFilter.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            igFilterGroup.m22017F(15, new PhotoFilter(obtain));
        }
        int oM = anonymousClass3ym.getTileInfo().oM();
        for (AnonymousClass0OA anonymousClass0OA : this.f52261G) {
            anonymousClass0OA.AD = oM;
            anonymousClass0OA.zC = this.f52256B;
        }
        this.f52258D.mRenderViewController.m23731C();
        return false;
    }

    /* renamed from: B */
    public static void m23719B(AnonymousClass4H2 anonymousClass4H2, int i) {
        for (IgFilterGroup B : anonymousClass4H2.f52260F) {
            ((PhotoFilter) B.m22013B(15)).m23009G(i);
        }
        for (AnonymousClass0OA anonymousClass0OA : anonymousClass4H2.f52261G) {
            anonymousClass0OA.zC = i;
        }
    }

    public final String CT() {
        return this.f52259E.getTileInfo().getName();
    }

    public final void Hd(boolean z) {
        if (z) {
            this.f52257C.put(this.f52259E.getTileInfo().oM(), this.f52256B);
        } else {
            AnonymousClass4H2.m23719B(this, this.f52257C.get(this.f52259E.getTileInfo().oM(), 100));
            this.f52258D.mRenderViewController.m23731C();
        }
        this.f52260F.clear();
        this.f52258D = null;
    }

    public final View MI(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C0164R.layout.filter_strength_adjuster, null, false);
        IgEditSeekBar igEditSeekBar = (IgEditSeekBar) viewGroup.findViewById(C0164R.id.filter_strength_seek);
        igEditSeekBar.setCurrentValue(this.f52256B);
        igEditSeekBar.setOnSeekBarChangeListener(new AnonymousClass4H1(this));
        ((ImageView) viewGroup.findViewById(C0164R.id.button_toggle_border)).setVisibility(8);
        return viewGroup;
    }

    public final void SLA() {
        AnonymousClass4H2.m23719B(this, this.f52256B);
    }

    public final void TLA() {
        AnonymousClass4H2.m23719B(this, this.f52257C.get(this.f52259E.getTileInfo().oM(), 100));
    }

    public final boolean XW(AnonymousClass3ym anonymousClass3ym, IgFilter igFilter) {
        if (igFilter == null || ((PhotoFilter) igFilter).f50029G != anonymousClass3ym.getTileInfo().oM()) {
            return false;
        }
        anonymousClass3ym.setChecked(true);
        this.f52259E = anonymousClass3ym;
        return true;
    }
}
