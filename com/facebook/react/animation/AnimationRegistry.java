package com.facebook.react.animation;

import android.util.SparseArray;
import com.facebook.react.bridge.UiThreadUtil;

public final class AnimationRegistry {
    private final SparseArray mRegistry = new SparseArray();

    public final Animation getAnimation(int i) {
        UiThreadUtil.assertOnUiThread();
        return (Animation) this.mRegistry.get(i);
    }

    public final void registerAnimation(Animation animation) {
        UiThreadUtil.assertOnUiThread();
        this.mRegistry.put(animation.getAnimationID(), animation);
    }

    public final Animation removeAnimation(int i) {
        UiThreadUtil.assertOnUiThread();
        Animation animation = (Animation) this.mRegistry.get(i);
        if (animation != null) {
            this.mRegistry.delete(i);
        }
        return animation;
    }
}
