package com.facebook.react.views.progressbar;

import X.AnonymousClass2q3;
import android.util.SparseIntArray;
import android.view.View.MeasureSpec;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.HashSet;
import java.util.Set;

public class ProgressBarShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
    private final SparseIntArray mHeight;
    private final Set mMeasured;
    private String mStyle;
    private final SparseIntArray mWidth;

    public ProgressBarShadowNode() {
        this.mStyle = ReactProgressBarViewManager.DEFAULT_STYLE;
        this.mHeight = new SparseIntArray();
        this.mWidth = new SparseIntArray();
        this.mMeasured = new HashSet();
        initMeasureFunction();
    }

    public ProgressBarShadowNode(ProgressBarShadowNode progressBarShadowNode) {
        super(progressBarShadowNode);
        this.mStyle = ReactProgressBarViewManager.DEFAULT_STYLE;
        this.mWidth = progressBarShadowNode.mWidth.clone();
        this.mHeight = progressBarShadowNode.mHeight.clone();
        this.mMeasured = new HashSet(progressBarShadowNode.mMeasured);
    }

    public final ProgressBarShadowNode copy() {
        return new ProgressBarShadowNode(this);
    }

    public final String getStyle() {
        return this.mStyle;
    }

    private void initMeasureFunction() {
        setMeasureFunction(this);
    }

    public final long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(getStyle());
        if (!this.mMeasured.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getThemedContext(), styleFromString);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.mHeight.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.mWidth.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.mMeasured.add(Integer.valueOf(styleFromString));
        }
        return AnonymousClass2q3.B(this.mWidth.get(styleFromString), this.mHeight.get(styleFromString));
    }

    public final ReactShadowNodeImpl mutableCopy(long j) {
        this = (ProgressBarShadowNode) super.mutableCopy(j);
        initMeasureFunction();
        return this;
    }

    @ReactProp(name = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.mStyle = str;
    }
}
