package com.facebook.react.views.text;

import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ReactRawTextShadowNode extends ReactShadowNodeImpl {
    private String mText = null;

    public final boolean isVirtual() {
        return true;
    }

    private ReactRawTextShadowNode(ReactRawTextShadowNode reactRawTextShadowNode) {
        super(reactRawTextShadowNode);
        this.mText = reactRawTextShadowNode.mText;
    }

    public final ReactShadowNodeImpl copy() {
        return new ReactRawTextShadowNode(this);
    }

    public final String getText() {
        return this.mText;
    }

    @ReactProp(name = "text")
    public void setText(String str) {
        this.mText = str;
        markUpdated();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getViewClass());
        stringBuilder.append(" [text: ");
        stringBuilder.append(this.mText);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
