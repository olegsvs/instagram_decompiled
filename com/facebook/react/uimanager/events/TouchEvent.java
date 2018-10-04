package com.facebook.react.uimanager.events;

import X.AnonymousClass0KX;
import X.AnonymousClass0LR;
import android.view.MotionEvent;
import com.facebook.react.bridge.SoftAssertions;

public final class TouchEvent extends Event {
    private static final AnonymousClass0KX EVENTS_POOL = new AnonymousClass0KX(3);
    private short mCoalescingKey;
    private MotionEvent mMotionEvent;
    private TouchEventType mTouchEventType;
    private float mViewX;
    private float mViewY;

    private TouchEvent() {
    }

    public final boolean canCoalesce() {
        switch (((TouchEventType) AnonymousClass0LR.D(this.mTouchEventType)).ordinal()) {
            case 0:
            case 1:
            case 3:
                return false;
            case 2:
                return true;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown touch event type: ");
                stringBuilder.append(this.mTouchEventType);
                throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        TouchesHelper.sendTouchEvent(rCTEventEmitter, (TouchEventType) AnonymousClass0LR.D(this.mTouchEventType), getViewTag(), this);
    }

    public final short getCoalescingKey() {
        return this.mCoalescingKey;
    }

    public final String getEventName() {
        return ((TouchEventType) AnonymousClass0LR.D(this.mTouchEventType)).getJSEventName();
    }

    public final MotionEvent getMotionEvent() {
        AnonymousClass0LR.D(this.mMotionEvent);
        return this.mMotionEvent;
    }

    public final float getViewX() {
        return this.mViewX;
    }

    public final float getViewY() {
        return this.mViewY;
    }

    private void init(int i, TouchEventType touchEventType, MotionEvent motionEvent, long j, float f, float f2, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        super.init(i);
        short s = (short) 0;
        SoftAssertions.assertCondition(j != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                touchEventCoalescingKeyHelper.addCoalescingKey(j);
                break;
            case 1:
            case 3:
                touchEventCoalescingKeyHelper.removeCoalescingKey(j);
                break;
            case 2:
                s = touchEventCoalescingKeyHelper.getCoalescingKey(j);
                break;
            case 5:
            case 6:
                touchEventCoalescingKeyHelper.incrementCoalescingKey(j);
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unhandled MotionEvent action: ");
                stringBuilder.append(action);
                throw new RuntimeException(stringBuilder.toString());
        }
        this.mTouchEventType = touchEventType;
        this.mMotionEvent = MotionEvent.obtain(motionEvent);
        this.mCoalescingKey = s;
        this.mViewX = f;
        this.mViewY = f2;
    }

    public static TouchEvent obtain(int i, TouchEventType touchEventType, MotionEvent motionEvent, long j, float f, float f2, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        TouchEvent touchEvent = (TouchEvent) EVENTS_POOL.acquire();
        if (touchEvent == null) {
            touchEvent = new TouchEvent();
        }
        touchEvent.init(i, touchEventType, motionEvent, j, f, f2, touchEventCoalescingKeyHelper);
        return touchEvent;
    }

    public final void onDispose() {
        ((MotionEvent) AnonymousClass0LR.D(this.mMotionEvent)).recycle();
        this.mMotionEvent = null;
        EVENTS_POOL.release(this);
    }
}
