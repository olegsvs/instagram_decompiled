package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class ViewGroupDrawingOrderHelper {
    private int[] mDrawingOrderIndices;
    private int mNumberOfChildrenWithZIndex = 0;
    private final ViewGroup mViewGroup;

    /* renamed from: com.facebook.react.uimanager.ViewGroupDrawingOrderHelper$1 */
    public final class C01131 implements Comparator {
        public static final int compare(View view, View view2) {
            view = ViewGroupManager.getViewZIndex(view);
            if (view == null) {
                view = Integer.valueOf(0);
            }
            Integer viewZIndex = ViewGroupManager.getViewZIndex(view2);
            if (viewZIndex == null) {
                viewZIndex = Integer.valueOf(0);
            }
            return view.intValue() - viewZIndex.intValue();
        }
    }

    public ViewGroupDrawingOrderHelper(ViewGroup viewGroup) {
        this.mViewGroup = viewGroup;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrderIndices == null) {
            Object arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.mViewGroup.getChildAt(i3));
            }
            Collections.sort(arrayList, new C01131());
            this.mDrawingOrderIndices = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.mDrawingOrderIndices[i4] = this.mViewGroup.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.mDrawingOrderIndices[i2];
    }

    public final void handleAddView(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.mNumberOfChildrenWithZIndex++;
        }
        this.mDrawingOrderIndices = null;
    }

    public final void handleRemoveView(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.mNumberOfChildrenWithZIndex--;
        }
        this.mDrawingOrderIndices = null;
    }

    public final boolean shouldEnableCustomDrawingOrder() {
        return this.mNumberOfChildrenWithZIndex > 0;
    }

    public final void update() {
        int i = 0;
        this.mNumberOfChildrenWithZIndex = 0;
        while (i < this.mViewGroup.getChildCount()) {
            if (ViewGroupManager.getViewZIndex(this.mViewGroup.getChildAt(i)) != null) {
                this.mNumberOfChildrenWithZIndex++;
            }
            i++;
        }
        this.mDrawingOrderIndices = null;
    }
}
