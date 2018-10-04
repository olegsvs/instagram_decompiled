package com.instagram.creation.base.ui.effectpicker;

import X.AnonymousClass0cQ;
import X.AnonymousClass3Cs;
import X.AnonymousClass3Cv;
import X.AnonymousClass3Cw;
import X.AnonymousClass3Cx;
import X.AnonymousClass3D3;
import X.AnonymousClass3ym;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.List;

public class EffectPicker extends HorizontalScrollView implements OnClickListener {
    /* renamed from: H */
    public static int f39126H = -1887089959;
    /* renamed from: B */
    public List f39127B;
    /* renamed from: C */
    public AnonymousClass3Cx f39128C;
    /* renamed from: D */
    public int f39129D = -1;
    /* renamed from: E */
    public int f39130E = -1;
    /* renamed from: F */
    public LinearLayout f39131F;
    /* renamed from: G */
    public int f39132G;

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new AnonymousClass3Cw();
        /* renamed from: B */
        public int f39125B;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f39125B = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f39125B);
        }
    }

    /* renamed from: C */
    public boolean mo4779C(int i, AnonymousClass3Cv anonymousClass3Cv) {
        return false;
    }

    /* renamed from: E */
    public boolean mo4780E(int i, boolean z) {
        return true;
    }

    public EffectPicker(Context context) {
        super(context);
        m19034B();
    }

    public EffectPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19034B();
    }

    public EffectPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19034B();
    }

    /* renamed from: A */
    public final int m19033A(AnonymousClass3ym anonymousClass3ym) {
        int left = ((anonymousClass3ym.getLeft() - anonymousClass3ym.getWidth()) - getScrollX()) + getPaddingLeft();
        int paddingLeft = getPaddingLeft() + (((anonymousClass3ym.getRight() + anonymousClass3ym.getWidth()) - getWidth()) - getScrollX());
        if (paddingLeft <= 0) {
            paddingLeft = left < 0 ? left : 0;
        }
        return Math.max(0, Math.min(getScrollX() + paddingLeft, Math.max(0, getChildAt(0).getWidth() - getWidth()))) - getScrollX();
    }

    /* renamed from: B */
    public final void m19034B() {
        setHorizontalFadingEdgeEnabled(false);
        setHorizontalScrollBarEnabled(false);
        this.f39127B = new ArrayList();
    }

    /* renamed from: B */
    private void m19032B(AnonymousClass3ym anonymousClass3ym, boolean z) {
        if (mo4780E(anonymousClass3ym.getTileInfo().oM(), z)) {
            smoothScrollBy(m19033A(anonymousClass3ym), 0);
        }
        AnonymousClass3Cx anonymousClass3Cx = this.f39128C;
        if (anonymousClass3Cx != null) {
            anonymousClass3Cx.XDA(anonymousClass3ym, z);
        }
    }

    /* renamed from: D */
    public final void m19036D(int i) {
        m19032B((AnonymousClass3ym) this.f39127B.get(i), false);
    }

    public AnonymousClass3Cs getConfig() {
        return AnonymousClass3Cs.f39116M;
    }

    public void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 294703476);
        m19032B((AnonymousClass3ym) view, true);
        AnonymousClass0cQ.L(this, -1825546548, M);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() > 0) {
            int i5;
            if (this.f39129D == -1) {
                i5 = this.f39130E;
                if (i5 >= 0) {
                    this.f39129D = m19033A((AnonymousClass3ym) this.f39131F.getChildAt(i5));
                }
            }
            if (this.f39129D != -1) {
                i5 = this.f39129D;
                this.f39129D = -1;
                this.f39130E = -1;
                scrollTo(i5, 0);
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setRestoreScrollPosition(savedState.f39125B);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f39125B = getScrollX();
        return savedState;
    }

    public void setEffects(List list) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f39131F = linearLayout;
        linearLayout.setOrientation(0);
        this.f39131F.setGravity(16);
        this.f39127B.clear();
        ViewGroup viewGroup = this.f39131F;
        AnonymousClass3Cs config = getConfig();
        this.f39132G = AnonymousClass3D3.m19041C(getContext(), config);
        for (int i = 0; i < list.size(); i++) {
            View anonymousClass3ym = new AnonymousClass3ym(viewGroup.getContext());
            anonymousClass3ym.setConfig(config);
            anonymousClass3ym.m21829C((AnonymousClass3Cv) list.get(i), true);
            anonymousClass3ym.setContentDescription(((AnonymousClass3Cv) list.get(i)).getName());
            anonymousClass3ym.setOnClickListener(this);
            anonymousClass3ym.setDraggable(mo4779C(i, (AnonymousClass3Cv) list.get(i)));
            int i2 = f39126H;
            f39126H = i2 + 1;
            anonymousClass3ym.setId(i2);
            this.f39127B.add(anonymousClass3ym);
            viewGroup.addView(anonymousClass3ym, new LayoutParams(-2, -1));
            this.f39128C.WDA(anonymousClass3ym);
        }
        viewGroup.setClipChildren(false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(config.f39120E) + getResources().getDimensionPixelSize(C0164R.dimen.effect_tile_padding);
        setClipToPadding(false);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        addView(this.f39131F);
        if (getWidth() > 0 && this.f39129D != -1) {
            i2 = this.f39129D;
            this.f39129D = -1;
            this.f39130E = -1;
            scrollTo(i2, 0);
        }
    }

    public void setFilterListener(AnonymousClass3Cx anonymousClass3Cx) {
        this.f39128C = anonymousClass3Cx;
    }

    private void setRestoreScrollPosition(int i) {
        this.f39129D = i;
    }

    public void setRestoreSelectedIndex(int i) {
        this.f39130E = i;
    }
}
