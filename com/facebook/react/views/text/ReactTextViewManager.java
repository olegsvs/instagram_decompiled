package com.facebook.react.views.text;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.Map;

@ReactModule(name = "RCTText")
public class ReactTextViewManager extends ReactTextAnchorViewManager {
    public static final String REACT_CLASS = "RCTText";

    public String getName() {
        return REACT_CLASS;
    }

    public ReactTextShadowNode createShadowNodeInstance() {
        return new ReactTextShadowNode();
    }

    public ReactTextView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactTextView(themedReactContext);
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("topTextLayout", MapBuilder.of("registrationName", "onTextLayout"));
    }

    public Class getShadowNodeClass() {
        return ReactTextShadowNode.class;
    }

    public void onAfterUpdateTransaction(ReactTextView reactTextView) {
        super.onAfterUpdateTransaction(reactTextView);
        reactTextView.updateView();
    }

    public void updateExtraData(ReactTextView reactTextView, Object obj) {
        ReactTextUpdate reactTextUpdate = (ReactTextUpdate) obj;
        if (reactTextUpdate.containsImages()) {
            TextInlineImageSpan.possiblyUpdateInlineImageSpans(reactTextUpdate.getText(), reactTextView);
        }
        reactTextView.setText(reactTextUpdate);
    }
}
