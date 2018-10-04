package com.facebook.react.animated;

import X.AnonymousClass0LR;
import java.util.ArrayList;
import java.util.List;

public abstract class AnimatedNode {
    public int mActiveIncomingNodes = 0;
    public int mBFSColor = 0;
    public List mChildren;
    public int mTag = -1;

    public void onAttachedToNode(AnimatedNode animatedNode) {
    }

    public void onDetachedFromNode(AnimatedNode animatedNode) {
    }

    public void update() {
    }

    public final void addChild(AnimatedNode animatedNode) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList(1);
        }
        ((List) AnonymousClass0LR.D(this.mChildren)).add(animatedNode);
        animatedNode.onAttachedToNode(this);
    }

    public final void removeChild(AnimatedNode animatedNode) {
        if (this.mChildren != null) {
            animatedNode.onDetachedFromNode(this);
            this.mChildren.remove(animatedNode);
        }
    }
}
