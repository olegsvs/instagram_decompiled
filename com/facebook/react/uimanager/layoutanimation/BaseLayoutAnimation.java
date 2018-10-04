package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.IllegalViewOperationException;

public abstract class BaseLayoutAnimation extends AbstractLayoutAnimation {
    public abstract boolean isReverse();

    public final Animation createAnimationImpl(View view, int i, int i2, int i3, int i4) {
        if (this.mAnimatedProperty != null) {
            float f = 0.0f;
            float alpha;
            switch (this.mAnimatedProperty) {
                case OPACITY:
                    alpha = isReverse() ? view.getAlpha() : 0.0f;
                    if (!isReverse()) {
                        f = view.getAlpha();
                    }
                    return new OpacityAnimation(view, alpha, f);
                case SCALE_XY:
                    alpha = isReverse() ? 1.0f : 0.0f;
                    f = isReverse() ? 0.0f : 1.0f;
                    return new ScaleAnimation(alpha, f, alpha, f, 1, 1056964608, 1, 1056964608);
                case SCALE_X:
                    return new ScaleAnimation(isReverse() ? 1.0f : 0.0f, isReverse() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 1056964608, 1, 0);
                case SCALE_Y:
                    return new ScaleAnimation(1.0f, 1.0f, isReverse() ? 1.0f : 0.0f, isReverse() ? 0.0f : 1.0f, 1, 0, 1, 1056964608);
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Missing animation for property : ");
                    stringBuilder.append(this.mAnimatedProperty);
                    throw new IllegalViewOperationException(stringBuilder.toString());
            }
        }
        throw new IllegalViewOperationException("Missing animated property from animation config");
    }

    public final boolean isValid() {
        return this.mDurationMs > 0 && this.mAnimatedProperty != null;
    }
}
