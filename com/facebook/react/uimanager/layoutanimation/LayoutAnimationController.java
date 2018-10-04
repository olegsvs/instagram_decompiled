package com.facebook.react.uimanager.layoutanimation;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

public final class LayoutAnimationController {
    private final AbstractLayoutAnimation mLayoutCreateAnimation = new LayoutCreateAnimation();
    private final AbstractLayoutAnimation mLayoutDeleteAnimation = new LayoutDeleteAnimation();
    public final SparseArray mLayoutHandlers = new SparseArray(0);
    private final AbstractLayoutAnimation mLayoutUpdateAnimation = new LayoutUpdateAnimation();
    private boolean mShouldAnimateLayout;

    public final void applyLayoutUpdate(View view, int i, int i2, int i3, int i4) {
        int i5 = i4;
        int i6 = i3;
        UiThreadUtil.assertOnUiThread();
        View view2 = view;
        final int id = view.getId();
        LayoutHandlingAnimation layoutHandlingAnimation = (LayoutHandlingAnimation) this.mLayoutHandlers.get(id);
        int i7 = i;
        int i8 = i2;
        if (layoutHandlingAnimation != null) {
            layoutHandlingAnimation.onLayoutUpdate(i, i2, i3, i4);
            return;
        }
        AbstractLayoutAnimation abstractLayoutAnimation;
        Animation createAnimation;
        if (view.getWidth() != 0) {
            if (view.getHeight() != 0) {
                abstractLayoutAnimation = this.mLayoutUpdateAnimation;
                createAnimation = abstractLayoutAnimation.createAnimation(view2, i7, i8, i6, i5);
                if (createAnimation instanceof LayoutHandlingAnimation) {
                    view.layout(i, i2, i3 + i, i4 + i2);
                } else {
                    createAnimation.setAnimationListener(new AnimationListener() {
                        public final void onAnimationRepeat(Animation animation) {
                        }

                        public final void onAnimationEnd(Animation animation) {
                            LayoutAnimationController.this.mLayoutHandlers.remove(id);
                        }

                        public final void onAnimationStart(Animation animation) {
                            LayoutAnimationController.this.mLayoutHandlers.put(id, (LayoutHandlingAnimation) animation);
                        }
                    });
                }
                if (createAnimation != null) {
                    view.startAnimation(createAnimation);
                }
            }
        }
        abstractLayoutAnimation = this.mLayoutCreateAnimation;
        createAnimation = abstractLayoutAnimation.createAnimation(view2, i7, i8, i6, i5);
        if (createAnimation instanceof LayoutHandlingAnimation) {
            view.layout(i, i2, i3 + i, i4 + i2);
        } else {
            createAnimation.setAnimationListener(/* anonymous class already generated */);
        }
        if (createAnimation != null) {
            view.startAnimation(createAnimation);
        }
    }

    public final void deleteView(View view, final LayoutAnimationListener layoutAnimationListener) {
        UiThreadUtil.assertOnUiThread();
        Animation createAnimation = this.mLayoutDeleteAnimation.createAnimation(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (createAnimation != null) {
            disableUserInteractions(view);
            createAnimation.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    layoutAnimationListener.onAnimationEnd();
                }
            });
            view.startAnimation(createAnimation);
            return;
        }
        layoutAnimationListener.onAnimationEnd();
    }

    private void disableUserInteractions(View view) {
        int i = 0;
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            while (i < viewGroup.getChildCount()) {
                disableUserInteractions(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public final void initializeFromConfig(ReadableMap readableMap) {
        if (readableMap == null) {
            reset();
            return;
        }
        int i = 0;
        this.mShouldAnimateLayout = false;
        if (readableMap.hasKey(TraceFieldType.Duration)) {
            i = readableMap.getInt(TraceFieldType.Duration);
        }
        if (readableMap.hasKey(LayoutAnimationType.CREATE.toString())) {
            this.mLayoutCreateAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.CREATE.toString()), i);
            this.mShouldAnimateLayout = true;
        }
        if (readableMap.hasKey(LayoutAnimationType.UPDATE.toString())) {
            this.mLayoutUpdateAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.UPDATE.toString()), i);
            this.mShouldAnimateLayout = true;
        }
        if (readableMap.hasKey(LayoutAnimationType.DELETE.toString())) {
            this.mLayoutDeleteAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.DELETE.toString()), i);
            this.mShouldAnimateLayout = true;
        }
    }

    public final void reset() {
        this.mLayoutCreateAnimation.reset();
        this.mLayoutUpdateAnimation.reset();
        this.mLayoutDeleteAnimation.reset();
        this.mShouldAnimateLayout = false;
    }

    public final boolean shouldAnimateLayout(View view) {
        return (this.mShouldAnimateLayout && view.getParent() != null) || this.mLayoutHandlers.get(view.getId()) != null;
    }
}
