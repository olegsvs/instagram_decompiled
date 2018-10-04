package com.facebook.react.views.progressbar;

import android.content.Context;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = "AndroidProgressBar")
public class ReactProgressBarViewManager extends BaseViewManager {
    public static final String DEFAULT_STYLE = "Normal";
    public static final String PROP_ANIMATING = "animating";
    public static final String PROP_INDETERMINATE = "indeterminate";
    public static final String PROP_PROGRESS = "progress";
    public static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    private static Object sProgressBarCtorLock = new Object();

    public String getName() {
        return REACT_CLASS;
    }

    public void updateExtraData(ProgressBarContainerView progressBarContainerView, Object obj) {
    }

    public static ProgressBar createProgressBar(Context context, int i) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i);
        }
        return progressBar;
    }

    public ProgressBarShadowNode createShadowNodeInstance() {
        return new ProgressBarShadowNode();
    }

    public ProgressBarContainerView createViewInstance(ThemedReactContext themedReactContext) {
        return new ProgressBarContainerView(themedReactContext);
    }

    public Class getShadowNodeClass() {
        return ProgressBarShadowNode.class;
    }

    public static int getStyleFromString(String str) {
        if (str == null) {
            throw new JSApplicationIllegalArgumentException("ProgressBar needs to have a style, null received");
        } else if (str.equals("Horizontal")) {
            return 16842872;
        } else {
            if (str.equals("Small")) {
                return 16842873;
            }
            if (str.equals("Large")) {
                return 16842874;
            }
            if (str.equals("Inverse")) {
                return 16843399;
            }
            if (str.equals("SmallInverse")) {
                return 16843400;
            }
            if (str.equals("LargeInverse")) {
                return 16843401;
            }
            if (str.equals(DEFAULT_STYLE)) {
                return 16842871;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown ProgressBar style: ");
            stringBuilder.append(str);
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        }
    }

    public void onAfterUpdateTransaction(ProgressBarContainerView progressBarContainerView) {
        progressBarContainerView.apply();
    }

    @ReactProp(name = "animating")
    public void setAnimating(ProgressBarContainerView progressBarContainerView, boolean z) {
        progressBarContainerView.setAnimating(z);
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(ProgressBarContainerView progressBarContainerView, Integer num) {
        progressBarContainerView.setColor(num);
    }

    @ReactProp(name = "indeterminate")
    public void setIndeterminate(ProgressBarContainerView progressBarContainerView, boolean z) {
        progressBarContainerView.setIndeterminate(z);
    }

    @ReactProp(name = "progress")
    public void setProgress(ProgressBarContainerView progressBarContainerView, double d) {
        progressBarContainerView.setProgress(d);
    }

    @ReactProp(name = "styleAttr")
    public void setStyle(ProgressBarContainerView progressBarContainerView, String str) {
        progressBarContainerView.setStyle(str);
    }
}
