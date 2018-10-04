package com.facebook.react.views.picker;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

public final class ReactPicker extends Spinner {
    private int mMode = 0;
    public OnSelectListener mOnSelectListener;
    private Integer mPrimaryColor;
    private Integer mStagedSelection;
    public boolean mSuppressNextEvent;
    private final Runnable measureAndLayout = new C01921();

    /* renamed from: com.facebook.react.views.picker.ReactPicker$1 */
    public final class C01921 implements Runnable {
        public final void run() {
            ReactPicker reactPicker = ReactPicker.this;
            reactPicker.measure(MeasureSpec.makeMeasureSpec(reactPicker.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(ReactPicker.this.getHeight(), 1073741824));
            ReactPicker reactPicker2 = ReactPicker.this;
            reactPicker2.layout(reactPicker2.getLeft(), ReactPicker.this.getTop(), ReactPicker.this.getRight(), ReactPicker.this.getBottom());
        }
    }

    /* renamed from: com.facebook.react.views.picker.ReactPicker$2 */
    public final class C01932 implements OnItemSelectedListener {
        public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (!(ReactPicker.this.mSuppressNextEvent || ReactPicker.this.mOnSelectListener == null)) {
                ReactPicker.this.mOnSelectListener.onItemSelected(i);
            }
            ReactPicker.this.mSuppressNextEvent = false;
        }

        public final void onNothingSelected(AdapterView adapterView) {
            if (!(ReactPicker.this.mSuppressNextEvent || ReactPicker.this.mOnSelectListener == null)) {
                ReactPicker.this.mOnSelectListener.onItemSelected(-1);
            }
            ReactPicker.this.mSuppressNextEvent = false;
        }
    }

    public interface OnSelectListener {
        void onItemSelected(int i);
    }

    public ReactPicker(Context context, int i) {
        super(context, i);
        this.mMode = i;
    }

    public int getMode() {
        return this.mMode;
    }

    public OnSelectListener getOnSelectListener() {
        return this.mOnSelectListener;
    }

    public Integer getPrimaryColor() {
        return this.mPrimaryColor;
    }

    public final void requestLayout() {
        super.requestLayout();
        post(this.measureAndLayout);
    }

    public void setOnSelectListener(OnSelectListener onSelectListener) {
        if (getOnItemSelectedListener() == null) {
            this.mSuppressNextEvent = true;
            setOnItemSelectedListener(new C01932());
        }
        this.mOnSelectListener = onSelectListener;
    }

    public void setPrimaryColor(Integer num) {
        this.mPrimaryColor = num;
    }

    private void setSelectionWithSuppressEvent(int i) {
        if (i != getSelectedItemPosition()) {
            this.mSuppressNextEvent = true;
            setSelection(i);
        }
    }

    public void setStagedSelection(int i) {
        this.mStagedSelection = Integer.valueOf(i);
    }

    public final void updateStagedSelection() {
        Integer num = this.mStagedSelection;
        if (num != null) {
            setSelectionWithSuppressEvent(num.intValue());
            this.mStagedSelection = null;
        }
    }
}
