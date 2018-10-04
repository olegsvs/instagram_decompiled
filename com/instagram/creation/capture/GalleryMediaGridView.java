package com.instagram.creation.capture;

import X.AnonymousClass0eS;
import X.AnonymousClass1oG;
import X.AnonymousClass4HV;
import X.AnonymousClass4HW;
import X.AnonymousClass4J1;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.facebook.C0164R;
import com.instagram.common.gallery.GalleryItem;

public class GalleryMediaGridView extends RecyclerView {
    /* renamed from: B */
    public int f52349B;
    /* renamed from: C */
    public final AnonymousClass1oG f52350C;
    /* renamed from: D */
    public final int f52351D;
    /* renamed from: E */
    private final int f52352E;
    /* renamed from: F */
    private final int f52353F;

    public GalleryMediaGridView(Context context) {
        this(context, null);
    }

    public GalleryMediaGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GalleryMediaGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.GalleryMediaGridView, i, 0);
        int i2 = obtainStyledAttributes.getInt(0, 4);
        this.f52351D = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        obtainStyledAttributes.recycle();
        this.f52353F = Math.round((float) ((getResources().getDisplayMetrics().widthPixels - (this.f52351D * (i2 - 1))) / i2));
        this.f52352E = getResources().getDimensionPixelSize(C0164R.dimen.gallery_header_row_height);
        AnonymousClass1oG anonymousClass1oG = new AnonymousClass1oG(getContext(), i2);
        this.f52350C = anonymousClass1oG;
        anonymousClass1oG.f22918I = new AnonymousClass4HV(this);
        this.f52350C.f22918I.f22909B = true;
        setLayoutManager(this.f52350C);
        A(new AnonymousClass4HW(this));
        setOverScrollMode(2);
        setClipToPadding(false);
    }

    public final int PA(GalleryItem galleryItem) {
        AnonymousClass4J1 anonymousClass4J1 = (AnonymousClass4J1) getAdapter();
        int Q = anonymousClass4J1.m23811Q(galleryItem);
        int i = 0;
        if (Q == -1) {
            return 0;
        }
        Q = this.f52350C.f22918I.m13235C(Q, getSpanCount());
        if ((anonymousClass4J1.f52577C.isEmpty() ^ 1) != 0) {
            i = this.f52351D + this.f52352E;
            Q--;
            if (galleryItem.m14353D()) {
                i += i;
                Q--;
            }
        }
        return (Q * (this.f52353F + this.f52351D)) + i;
    }

    public float getContentEdge() {
        int childCount = getChildCount();
        int height = getHeight();
        if (childCount == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(childCount - 1);
        return Math.min((float) height, (float) (childAt.getTop() + childAt.getHeight()));
    }

    public int getScrollOffset() {
        AnonymousClass4J1 anonymousClass4J1 = (AnonymousClass4J1) getAdapter();
        int aA = this.f52350C.aA();
        View O = this.f52350C.O(aA);
        int i = 0;
        if (O == null) {
            return 0;
        }
        int C = this.f52350C.f22918I.m13235C(aA, getSpanCount());
        aA = this.f52353F + this.f52351D;
        switch (RecyclerView.L(O).f10374F) {
            case 0:
                if ((anonymousClass4J1.f52577C.isEmpty() ^ 1) != 0) {
                    i = (this.f52352E + this.f52351D) * 2;
                    C -= 2;
                    break;
                }
                break;
            case 1:
                i = this.f52351D + this.f52352E;
                C--;
                break;
            case 2:
                if (C == 0) {
                    C = 0;
                    break;
                }
                C--;
                i = this.f52352E + this.f52351D;
                break;
            default:
                throw new IllegalStateException("Invalid view type");
        }
        return (i + (C * aA)) - O.getTop();
    }

    public int getSpanCount() {
        return this.f52350C.f22917H;
    }

    public int getThumbnailDimension() {
        return this.f52353F;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i) + this.f52351D, 1073741824), i2);
    }

    public void setBottomRowSpacing(int i) {
        this.f52349B = i;
    }
}
