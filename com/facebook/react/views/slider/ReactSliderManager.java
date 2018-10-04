package com.facebook.react.views.slider;

import X.AnonymousClass2q3;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.LayerDrawable;
import android.view.View.MeasureSpec;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.Map;

public class ReactSliderManager extends SimpleViewManager {
    private static final OnSeekBarChangeListener ON_CHANGE_LISTENER = new C01961();
    private static final String REACT_CLASS = "RCTSlider";
    private static final int STYLE = 16842875;

    /* renamed from: com.facebook.react.views.slider.ReactSliderManager$1 */
    public final class C01961 implements OnSeekBarChangeListener {
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new ReactSliderEvent(seekBar.getId(), ((ReactSlider) seekBar).toRealProgress(i), z));
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new ReactSlidingCompleteEvent(seekBar.getId(), ((ReactSlider) seekBar).toRealProgress(seekBar.getProgress())));
        }
    }

    public class ReactSliderShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
        private int mHeight;
        private boolean mMeasured;
        private int mWidth;

        public ReactSliderShadowNode() {
            initMeasureFunction();
        }

        private ReactSliderShadowNode(ReactSliderShadowNode reactSliderShadowNode) {
            super(reactSliderShadowNode);
            this.mWidth = reactSliderShadowNode.mWidth;
            this.mHeight = reactSliderShadowNode.mHeight;
            this.mMeasured = reactSliderShadowNode.mMeasured;
        }

        public final ReactSliderShadowNode copy() {
            return new ReactSliderShadowNode(this);
        }

        private void initMeasureFunction() {
            setMeasureFunction(this);
        }

        public final long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.mMeasured) {
                SeekBar reactSlider = new ReactSlider(getThemedContext(), null, ReactSliderManager.STYLE);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(-2, 0);
                reactSlider.measure(makeMeasureSpec, makeMeasureSpec);
                this.mWidth = reactSlider.getMeasuredWidth();
                this.mHeight = reactSlider.getMeasuredHeight();
                this.mMeasured = true;
            }
            return AnonymousClass2q3.B(this.mWidth, this.mHeight);
        }

        public final ReactShadowNodeImpl mutableCopy(long j) {
            this = (ReactSliderShadowNode) super.mutableCopy(j);
            initMeasureFunction();
            return this;
        }
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, ReactSlider reactSlider) {
        reactSlider.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSliderShadowNode();
    }

    public ReactSlider createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactSlider(themedReactContext, null, STYLE);
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("topSlidingComplete", MapBuilder.of("registrationName", "onSlidingComplete"));
    }

    public Class getShadowNodeClass() {
        return ReactSliderShadowNode.class;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactSlider reactSlider, boolean z) {
        reactSlider.setEnabled(z);
    }

    @ReactProp(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(ReactSlider reactSlider, Integer num) {
        reactSlider = ((LayerDrawable) reactSlider.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            reactSlider.clearColorFilter();
        } else {
            reactSlider.setColorFilter(num.intValue(), Mode.SRC_IN);
        }
    }

    @ReactProp(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(ReactSlider reactSlider, double d) {
        reactSlider.setMaxValue(d);
    }

    @ReactProp(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(ReactSlider reactSlider, Integer num) {
        reactSlider = ((LayerDrawable) reactSlider.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            reactSlider.clearColorFilter();
        } else {
            reactSlider.setColorFilter(num.intValue(), Mode.SRC_IN);
        }
    }

    @ReactProp(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(ReactSlider reactSlider, double d) {
        reactSlider.setMinValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = "step")
    public void setStep(ReactSlider reactSlider, double d) {
        reactSlider.setStep(d);
    }

    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(ReactSlider reactSlider, Integer num) {
        if (num == null) {
            reactSlider.getThumb().clearColorFilter();
        } else {
            reactSlider.getThumb().setColorFilter(num.intValue(), Mode.SRC_IN);
        }
    }

    @ReactProp(defaultDouble = 0.0d, name = "value")
    public void setValue(ReactSlider reactSlider, double d) {
        reactSlider.setOnSeekBarChangeListener(null);
        reactSlider.setValue(d);
        reactSlider.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }
}
