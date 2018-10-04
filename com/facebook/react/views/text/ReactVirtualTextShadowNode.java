package com.facebook.react.views.text;

public class ReactVirtualTextShadowNode extends ReactBaseTextShadowNode {
    public final boolean isVirtual() {
        return true;
    }

    private ReactVirtualTextShadowNode(ReactVirtualTextShadowNode reactVirtualTextShadowNode) {
        super(reactVirtualTextShadowNode);
    }

    public final ReactVirtualTextShadowNode copy() {
        return new ReactVirtualTextShadowNode(this);
    }
}
