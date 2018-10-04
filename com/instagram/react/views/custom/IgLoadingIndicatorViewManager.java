package com.instagram.react.views.custom;

import com.facebook.C0164R;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public class IgLoadingIndicatorViewManager extends SimpleViewManager {
    public String getName() {
        return "IgLoadingIndicator";
    }

    public SpinnerImageView createViewInstance(ThemedReactContext themedReactContext) {
        SpinnerImageView spinnerImageView = new SpinnerImageView(themedReactContext);
        spinnerImageView.setImageResource(C0164R.drawable.spinner_large);
        return spinnerImageView;
    }
}
