package com.instagram.actionbar;

import X.AnonymousClass1Kv;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ViewSwitcher;
import com.facebook.C0164R;
import com.instagram.ui.widget.spinner.RefreshSpinner;

public class ActionButton extends ViewSwitcher {
    /* renamed from: B */
    private ImageView f7721B;
    /* renamed from: C */
    private ImageView f7722C;

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new AnonymousClass1Kv();
        /* renamed from: B */
        public int f17264B;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f17264B = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f17264B);
        }
    }

    public ActionButton(Context context) {
        super(context);
        m6308A(context);
    }

    public ActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6308A(context);
    }

    /* renamed from: A */
    public final void m6308A(Context context) {
        ImageView imageView = new ImageView(context);
        this.f7721B = imageView;
        imageView.setImageResource(C0164R.drawable.nav_refresh);
        this.f7721B.setScaleType(ScaleType.CENTER);
        addView(this.f7721B);
        this.f7722C = new RefreshSpinner(context);
        View frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f7722C, new LayoutParams(-2, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0164R.dimen.refresh_button_size);
        addView(frameLayout, new LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setDisplayedChild(savedState.f17264B);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17264B = getDisplayedChild();
        return savedState;
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f7721B.setImageDrawable(drawable);
    }

    public void setButtonResource(int i) {
        this.f7721B.setImageResource(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f7721B.getDrawable().mutate().setColorFilter(colorFilter);
        this.f7722C.getDrawable().mutate().setColorFilter(colorFilter);
    }

    public void setDisplayedChild(int i) {
        super.setDisplayedChild(i);
        setClickable(i == 0);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f7721B.getDrawable().mutate().setAlpha(z ? 255 : 77);
    }
}
