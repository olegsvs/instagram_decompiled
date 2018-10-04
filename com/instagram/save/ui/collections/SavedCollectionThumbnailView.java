package com.instagram.save.ui.collections;

import X.AnonymousClass0P7;
import X.AnonymousClass0ct;
import X.AnonymousClass0jC;
import X.AnonymousClass5z0;
import X.AnonymousClass5z1;
import X.AnonymousClass5z2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;

public class SavedCollectionThumbnailView extends FrameLayout {
    /* renamed from: B */
    public List f70610B;
    /* renamed from: C */
    public AnonymousClass0ct f70611C;
    /* renamed from: D */
    public AnonymousClass0ct f70612D;
    /* renamed from: E */
    private int f70613E;
    /* renamed from: F */
    private int f70614F;

    public SavedCollectionThumbnailView(Context context) {
        super(context);
        m28712C();
    }

    public SavedCollectionThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28712C();
    }

    public SavedCollectionThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28712C();
    }

    /* renamed from: B */
    public static void m28711B(SavedCollectionThumbnailView savedCollectionThumbnailView) {
        List<IgImageView> list = savedCollectionThumbnailView.f70610B;
        if (list != null) {
            for (IgImageView igImageView : list) {
                igImageView.setImageURI(null);
                igImageView.setImageDrawable(null);
                igImageView.setOnLoadListener(null);
                igImageView.setOnFallbackListener(null);
            }
        }
    }

    /* renamed from: C */
    private void m28712C() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0164R.layout.saved_collection_thumbnail, this);
        this.f70611C = new AnonymousClass0ct((ViewStub) inflate.findViewById(C0164R.id.single_saved_collection_thumbnail_stub));
        this.f70612D = new AnonymousClass0ct((ViewStub) inflate.findViewById(C0164R.id.two_by_two_saved_collection_thumbnail_stub));
        this.f70612D.f7268B = new AnonymousClass5z0(this);
        this.f70613E = getContext().getResources().getDimensionPixelSize(C0164R.dimen.saved_collection_grid_margin);
    }

    /* renamed from: D */
    private void m28713D() {
        if (this.f70610B != null) {
            int i = this.f70614F;
            LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            for (IgImageView layoutParams2 : this.f70610B) {
                layoutParams2.setLayoutParams(layoutParams);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        this.f70614F = (MeasureSpec.getSize(i) - this.f70613E) / 2;
        m28713D();
        super.onMeasure(i, i2);
    }

    public static void setImageForMedia(AnonymousClass0jC anonymousClass0jC, AnonymousClass0P7 anonymousClass0P7, String str, IgImageView igImageView) {
        igImageView.setUrl(str);
        igImageView.setOnLoadListener(new AnonymousClass5z1(anonymousClass0jC, anonymousClass0P7));
        igImageView.setOnFallbackListener(new AnonymousClass5z2(anonymousClass0jC, anonymousClass0P7));
    }

    public static void setupGrid(SavedCollectionThumbnailView savedCollectionThumbnailView, ViewGroup viewGroup) {
        List arrayList = new ArrayList();
        savedCollectionThumbnailView.f70610B = arrayList;
        arrayList.add((IgImageView) viewGroup.findViewById(C0164R.id.top_left_image));
        savedCollectionThumbnailView.f70610B.add((IgImageView) viewGroup.findViewById(C0164R.id.top_right_image));
        savedCollectionThumbnailView.f70610B.add((IgImageView) viewGroup.findViewById(C0164R.id.bottom_left_image));
        savedCollectionThumbnailView.f70610B.add((IgImageView) viewGroup.findViewById(C0164R.id.bottom_right_image));
        savedCollectionThumbnailView.m28713D();
    }
}
