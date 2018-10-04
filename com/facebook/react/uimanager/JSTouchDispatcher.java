package com.facebook.react.uimanager;

import X.AnonymousClass0Df;
import X.AnonymousClass0LR;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.TouchEvent;
import com.facebook.react.uimanager.events.TouchEventCoalescingKeyHelper;
import com.facebook.react.uimanager.events.TouchEventType;

public final class JSTouchDispatcher {
    private boolean mChildIsHandlingNativeGesture = false;
    private long mGestureStartTime = Long.MIN_VALUE;
    private final ViewGroup mRootViewGroup;
    private final float[] mTargetCoordinates = new float[2];
    private int mTargetTag = -1;
    private final TouchEventCoalescingKeyHelper mTouchEventCoalescingKeyHelper = new TouchEventCoalescingKeyHelper();

    public JSTouchDispatcher(ViewGroup viewGroup) {
        this.mRootViewGroup = viewGroup;
    }

    private void dispatchCancelEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.mTargetTag == -1) {
            AnonymousClass0Df.H("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        AnonymousClass0LR.C(this.mChildIsHandlingNativeGesture ^ true, "Expected to not have already sent a cancel for this gesture");
        EventDispatcher eventDispatcher2 = (EventDispatcher) AnonymousClass0LR.D(eventDispatcher);
        int i = this.mTargetTag;
        TouchEventType touchEventType = TouchEventType.CANCEL;
        long j = this.mGestureStartTime;
        float[] fArr = this.mTargetCoordinates;
        eventDispatcher2.dispatchEvent(TouchEvent.obtain(i, touchEventType, motionEvent, j, fArr[0], fArr[1], this.mTouchEventCoalescingKeyHelper));
    }

    private int findTargetTagAndSetCoordinates(MotionEvent motionEvent) {
        return TouchTargetHelper.findTargetTagAndCoordinatesForTouch(motionEvent.getX(), motionEvent.getY(), this.mRootViewGroup, this.mTargetCoordinates, null);
    }

    public final void handleTouchEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent2.getAction() & 255;
        JSTouchDispatcher jSTouchDispatcher = this;
        EventDispatcher eventDispatcher2 = eventDispatcher;
        int i;
        TouchEventType touchEventType;
        long j;
        float[] fArr;
        if (action == 0) {
            if (this.mTargetTag != -1) {
                AnonymousClass0Df.C("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.mChildIsHandlingNativeGesture = false;
            this.mGestureStartTime = motionEvent2.getEventTime();
            this.mTargetTag = findTargetTagAndSetCoordinates(motionEvent2);
            i = this.mTargetTag;
            touchEventType = TouchEventType.START;
            j = this.mGestureStartTime;
            fArr = this.mTargetCoordinates;
            eventDispatcher2.dispatchEvent(TouchEvent.obtain(i, touchEventType, motionEvent2, j, fArr[0], fArr[1], this.mTouchEventCoalescingKeyHelper));
        } else if (!this.mChildIsHandlingNativeGesture) {
            int i2 = this.mTargetTag;
            if (i2 == -1) {
                AnonymousClass0Df.C("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            } else if (action == 1) {
                findTargetTagAndSetCoordinates(motionEvent2);
                i2 = this.mTargetTag;
                r11 = TouchEventType.END;
                r13 = this.mGestureStartTime;
                float[] fArr2 = this.mTargetCoordinates;
                eventDispatcher2.dispatchEvent(TouchEvent.obtain(i2, r11, motionEvent2, r13, fArr2[0], fArr2[1], jSTouchDispatcher.mTouchEventCoalescingKeyHelper));
                jSTouchDispatcher.mTargetTag = -1;
                jSTouchDispatcher.mGestureStartTime = Long.MIN_VALUE;
            } else if (action == 2) {
                findTargetTagAndSetCoordinates(motionEvent2);
                i = this.mTargetTag;
                touchEventType = TouchEventType.MOVE;
                j = this.mGestureStartTime;
                fArr = this.mTargetCoordinates;
                eventDispatcher2.dispatchEvent(TouchEvent.obtain(i, touchEventType, motionEvent2, j, fArr[0], fArr[1], this.mTouchEventCoalescingKeyHelper));
            } else if (action == 5) {
                r11 = TouchEventType.START;
                r13 = this.mGestureStartTime;
                fArr = this.mTargetCoordinates;
                eventDispatcher2.dispatchEvent(TouchEvent.obtain(i2, r11, motionEvent2, r13, fArr[0], fArr[1], jSTouchDispatcher.mTouchEventCoalescingKeyHelper));
            } else if (action == 6) {
                r11 = TouchEventType.END;
                r13 = this.mGestureStartTime;
                fArr = this.mTargetCoordinates;
                eventDispatcher2.dispatchEvent(TouchEvent.obtain(i2, r11, motionEvent2, r13, fArr[0], fArr[1], jSTouchDispatcher.mTouchEventCoalescingKeyHelper));
            } else if (action == 3) {
                if (this.mTouchEventCoalescingKeyHelper.hasCoalescingKey(motionEvent2.getDownTime())) {
                    dispatchCancelEvent(motionEvent2, eventDispatcher2);
                } else {
                    AnonymousClass0Df.C("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
                this.mTargetTag = -1;
                this.mGestureStartTime = Long.MIN_VALUE;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Warning : touch event was ignored. Action=");
                stringBuilder.append(action);
                stringBuilder.append(" Target=");
                stringBuilder.append(this.mTargetTag);
                AnonymousClass0Df.H("ReactNative", stringBuilder.toString());
            }
        }
    }

    public final void onChildStartedNativeGesture(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (!this.mChildIsHandlingNativeGesture) {
            dispatchCancelEvent(motionEvent, eventDispatcher);
            this.mChildIsHandlingNativeGesture = true;
            this.mTargetTag = -1;
        }
    }
}
