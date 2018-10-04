package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;

public final class TouchTargetHelper {
    private static final float[] mEventCoords = new float[2];
    private static final Matrix mInverseMatrix = new Matrix();
    private static final float[] mMatrixTransformCoords = new float[2];
    private static final PointF mTempPoint = new PointF();

    private static View findClosestReactAncestor(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    public static int findTargetTagAndCoordinatesForTouch(float f, float f2, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View findTouchTargetView = findTouchTargetView(fArr, viewGroup);
        if (findTouchTargetView == null) {
            return id;
        }
        View findClosestReactAncestor = findClosestReactAncestor(findTouchTargetView);
        if (findClosestReactAncestor == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = findClosestReactAncestor.getId();
        }
        return getTouchTargetForView(findClosestReactAncestor, fArr[0], fArr[1]);
    }

    public static int findTargetTagForTouch(float f, float f2, ViewGroup viewGroup) {
        return findTargetTagAndCoordinatesForTouch(f, f2, viewGroup, mEventCoords, null);
    }

    private static View findTouchTargetView(float[] fArr, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        ReactZIndexedViewGroup reactZIndexedViewGroup = viewGroup instanceof ReactZIndexedViewGroup ? (ReactZIndexedViewGroup) viewGroup : null;
        childCount--;
        while (childCount >= 0) {
            View childAt = viewGroup.getChildAt(reactZIndexedViewGroup != null ? reactZIndexedViewGroup.getZIndexMappedChildIndex(childCount) : childCount);
            PointF pointF = mTempPoint;
            if (isTransformedTouchPointInView(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View findTouchTargetViewWithPointerEvents = findTouchTargetViewWithPointerEvents(fArr, childAt);
                if (findTouchTargetViewWithPointerEvents != null) {
                    return findTouchTargetViewWithPointerEvents;
                }
                fArr[0] = f;
                fArr[1] = f2;
            }
            childCount--;
        }
        return viewGroup;
    }

    private static View findTouchTargetViewWithPointerEvents(float[] fArr, View view) {
        PointerEvents pointerEvents = view instanceof ReactPointerEventsView ? ((ReactPointerEventsView) view).getPointerEvents() : PointerEvents.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                pointerEvents = PointerEvents.BOX_NONE;
            } else if (pointerEvents == PointerEvents.BOX_ONLY) {
                pointerEvents = PointerEvents.NONE;
            }
        }
        if (pointerEvents != PointerEvents.NONE) {
            if (pointerEvents != PointerEvents.BOX_ONLY) {
                if (pointerEvents == PointerEvents.BOX_NONE) {
                    if (view instanceof ViewGroup) {
                        View findTouchTargetView = findTouchTargetView(fArr, (ViewGroup) view);
                        if (findTouchTargetView != view) {
                            return findTouchTargetView;
                        }
                        if ((view instanceof ReactCompoundView) && ((ReactCompoundView) view).reactTagForTouch(fArr[0], fArr[1]) != view.getId()) {
                        }
                    }
                } else if (pointerEvents != PointerEvents.AUTO) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown pointer event type: ");
                    stringBuilder.append(pointerEvents.toString());
                    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                } else if (!(view instanceof ReactCompoundViewGroup) || !((ReactCompoundViewGroup) view).interceptsTouchEvent(fArr[0], fArr[1])) {
                    if (view instanceof ViewGroup) {
                        return findTouchTargetView(fArr, (ViewGroup) view);
                    }
                }
            }
            return view;
        }
        return null;
    }

    private static int getTouchTargetForView(View view, float f, float f2) {
        if (view instanceof ReactCompoundView) {
            return ((ReactCompoundView) view).reactTagForTouch(f, f2);
        }
        return view.getId();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isTransformedTouchPointInView(float r5, float r6, android.view.ViewGroup r7, android.view.View r8, android.graphics.PointF r9) {
        /*
        r0 = r7.getScrollX();
        r0 = (float) r0;
        r5 = r5 + r0;
        r0 = r8.getLeft();
        r0 = (float) r0;
        r5 = r5 - r0;
        r0 = r7.getScrollY();
        r0 = (float) r0;
        r6 = r6 + r0;
        r0 = r8.getTop();
        r0 = (float) r0;
        r6 = r6 - r0;
        r2 = r8.getMatrix();
        r0 = r2.isIdentity();
        r4 = 1;
        r3 = 0;
        if (r0 != 0) goto L_0x0036;
    L_0x0024:
        r1 = mMatrixTransformCoords;
        r1[r3] = r5;
        r1[r4] = r6;
        r0 = mInverseMatrix;
        r2.invert(r0);
        r0.mapPoints(r1);
        r5 = r1[r3];
        r6 = r1[r4];
    L_0x0036:
        r0 = r8 instanceof com.facebook.react.touch.ReactHitSlopView;
        if (r0 == 0) goto L_0x007e;
    L_0x003a:
        r1 = r8;
        r1 = (com.facebook.react.touch.ReactHitSlopView) r1;
        r0 = r1.getHitSlopRect();
        if (r0 == 0) goto L_0x007e;
    L_0x0043:
        r2 = r1.getHitSlopRect();
        r0 = r2.left;
        r0 = -r0;
        r0 = (float) r0;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x007d;
    L_0x004f:
        r1 = r8.getRight();
        r0 = r8.getLeft();
        r1 = r1 - r0;
        r0 = r2.right;
        r1 = r1 + r0;
        r0 = (float) r1;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x007d;
    L_0x0060:
        r0 = r2.top;
        r0 = -r0;
        r0 = (float) r0;
        r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x007d;
    L_0x0068:
        r1 = r8.getBottom();
        r0 = r8.getTop();
        r1 = r1 - r0;
        r0 = r2.bottom;
        r1 = r1 + r0;
        r0 = (float) r1;
        r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x007d;
    L_0x0079:
        r9.set(r5, r6);
        return r4;
    L_0x007d:
        return r3;
    L_0x007e:
        r2 = 0;
        r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r0 < 0) goto L_0x007d;
    L_0x0083:
        r1 = r8.getRight();
        r0 = r8.getLeft();
        r1 = r1 - r0;
        r0 = (float) r1;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x007d;
    L_0x0091:
        r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r0 < 0) goto L_0x007d;
    L_0x0095:
        r1 = r8.getBottom();
        r0 = r8.getTop();
        r1 = r1 - r0;
        r0 = (float) r1;
        r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x007d;
    L_0x00a3:
        goto L_0x0079;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.TouchTargetHelper.isTransformedTouchPointInView(float, float, android.view.ViewGroup, android.view.View, android.graphics.PointF):boolean");
    }
}
