package com.facebook.react.views.viewpager;

import X.AnonymousClass0cQ;
import X.AnonymousClass1Ar;
import X.AnonymousClass1LO;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import java.util.ArrayList;
import java.util.List;

public final class ReactViewPager extends ViewPager {
    public final EventDispatcher mEventDispatcher;
    public boolean mIsCurrentItemFromJs;
    private boolean mScrollEnabled = true;
    private final Runnable measureAndLayout = new C02031();

    /* renamed from: com.facebook.react.views.viewpager.ReactViewPager$1 */
    public final class C02031 implements Runnable {
        public final void run() {
            ReactViewPager reactViewPager = ReactViewPager.this;
            reactViewPager.measure(MeasureSpec.makeMeasureSpec(reactViewPager.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(ReactViewPager.this.getHeight(), 1073741824));
            ReactViewPager reactViewPager2 = ReactViewPager.this;
            reactViewPager2.layout(reactViewPager2.getLeft(), ReactViewPager.this.getTop(), ReactViewPager.this.getRight(), ReactViewPager.this.getBottom());
        }
    }

    public final class Adapter extends AnonymousClass1LO {
        private boolean mIsViewPagerInIntentionallyInconsistentState = false;
        private final List mViews = new ArrayList();

        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public final void addView(View view, int i) {
            this.mViews.add(i, view);
            C();
            ReactViewPager.this.setOffscreenPageLimit(this.mViews.size());
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public final int getCount() {
            return this.mViews.size();
        }

        public final int getItemPosition(Object obj) {
            if (!this.mIsViewPagerInIntentionallyInconsistentState) {
                if (this.mViews.contains(obj)) {
                    return this.mViews.indexOf(obj);
                }
            }
            return -2;
        }

        public final View getViewAt(int i) {
            return (View) this.mViews.get(i);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            View view = (View) this.mViews.get(i);
            viewGroup.addView(view, 0, ReactViewPager.this.generateDefaultLayoutParams());
            return view;
        }

        public final void removeViewAt(int i) {
            this.mViews.remove(i);
            C();
            ReactViewPager.this.setOffscreenPageLimit(this.mViews.size());
        }

        public final void setViews(List list) {
            this.mViews.clear();
            this.mViews.addAll(list);
            C();
            this.mIsViewPagerInIntentionallyInconsistentState = false;
        }
    }

    public final class PageChangeListener implements AnonymousClass1Ar {
        public final void onPageScrollStateChanged(int i) {
            String str;
            switch (i) {
                case 0:
                    str = "idle";
                    break;
                case 1:
                    str = "dragging";
                    break;
                case 2:
                    str = "settling";
                    break;
                default:
                    throw new IllegalStateException("Unsupported pageScrollState");
            }
            ReactViewPager.this.mEventDispatcher.dispatchEvent(new PageScrollStateChangedEvent(ReactViewPager.this.getId(), str));
        }

        public final void onPageScrolled(int i, float f, int i2) {
            ReactViewPager.this.mEventDispatcher.dispatchEvent(new PageScrollEvent(ReactViewPager.this.getId(), i, f));
        }

        public final void onPageSelected(int i) {
            if (!ReactViewPager.this.mIsCurrentItemFromJs) {
                ReactViewPager.this.mEventDispatcher.dispatchEvent(new PageSelectedEvent(ReactViewPager.this.getId(), i));
            }
        }
    }

    public ReactViewPager(ReactContext reactContext) {
        super(reactContext);
        this.mEventDispatcher = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.mIsCurrentItemFromJs = false;
        setOnPageChangeListener(new PageChangeListener());
        setAdapter(new Adapter());
    }

    public final void addViewToAdapter(View view, int i) {
        getAdapter().addView(view, i);
    }

    public Adapter getAdapter() {
        return (Adapter) super.getAdapter();
    }

    public int getViewCountInAdapter() {
        return getAdapter().getCount();
    }

    public final View getViewFromAdapter(int i) {
        return getAdapter().getViewAt(i);
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -460474331);
        super.onAttachedToWindow();
        requestLayout();
        post(this.measureAndLayout);
        AnonymousClass0cQ.O(this, 612575900, N);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mScrollEnabled) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
                    return true;
                }
            } catch (Throwable e) {
                Log.w("ReactNative", "Error intercepting touch event.", e);
            }
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -937125185);
        if (this.mScrollEnabled) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            AnonymousClass0cQ.L(this, -2072403471, M);
            return onTouchEvent;
        }
        AnonymousClass0cQ.L(this, 2082898113, M);
        return false;
    }

    public final void removeViewFromAdapter(int i) {
        getAdapter().removeViewAt(i);
    }

    public final void setCurrentItemFromJs(int i, boolean z) {
        this.mIsCurrentItemFromJs = true;
        P(i, z);
        this.mIsCurrentItemFromJs = false;
    }

    public void setScrollEnabled(boolean z) {
        this.mScrollEnabled = z;
    }

    public void setViews(List list) {
        getAdapter().setViews(list);
    }
}
