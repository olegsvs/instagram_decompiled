package com.instagram.react.views.switchview;

import X.AnonymousClass2q3;
import X.AnonymousClass5tD;
import X.AnonymousClass5tE;
import android.view.View.MeasureSpec;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

public class ReactSwitchManager extends SimpleViewManager {
    private static final OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new AnonymousClass5tE();
    private static final String REACT_CLASS = "AndroidSwitch";

    public class ReactSwitchShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
        private int mHeight;
        private boolean mMeasured;
        private int mWidth;

        public ReactSwitchShadowNode() {
            setMeasureFunction(this);
        }

        public final long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.mMeasured) {
                AnonymousClass5tD anonymousClass5tD = new AnonymousClass5tD(getThemedContext());
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(-2, 0);
                anonymousClass5tD.measure(makeMeasureSpec, makeMeasureSpec);
                this.mWidth = anonymousClass5tD.getMeasuredWidth();
                this.mHeight = anonymousClass5tD.getMeasuredHeight();
                this.mMeasured = true;
            }
            return AnonymousClass2q3.B(this.mWidth, this.mHeight);
        }
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, AnonymousClass5tD anonymousClass5tD) {
        anonymousClass5tD.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSwitchShadowNode();
    }

    public AnonymousClass5tD createViewInstance(ThemedReactContext themedReactContext) {
        return new AnonymousClass5tD(themedReactContext);
    }

    public Class getShadowNodeClass() {
        return ReactSwitchShadowNode.class;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(AnonymousClass5tD anonymousClass5tD, boolean z) {
        anonymousClass5tD.setEnabled(z);
    }

    @ReactProp(name = "on")
    public void setOn(AnonymousClass5tD anonymousClass5tD, boolean z) {
        anonymousClass5tD.setOnCheckedChangeListener(null);
        anonymousClass5tD.setOn(z);
        anonymousClass5tD.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }
}
