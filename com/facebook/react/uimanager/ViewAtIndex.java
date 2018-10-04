package com.facebook.react.uimanager;

import java.util.Comparator;

public final class ViewAtIndex {
    public static Comparator COMPARATOR = new C01121();
    public final int mIndex;
    public final int mTag;

    /* renamed from: com.facebook.react.uimanager.ViewAtIndex$1 */
    public final class C01121 implements Comparator {
        public static final int compare(ViewAtIndex viewAtIndex, ViewAtIndex viewAtIndex2) {
            return viewAtIndex.mIndex - viewAtIndex2.mIndex;
        }
    }

    public ViewAtIndex(int i, int i2) {
        this.mTag = i;
        this.mIndex = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        ViewAtIndex viewAtIndex = (ViewAtIndex) obj;
        if (this.mIndex == viewAtIndex.mIndex && this.mTag == viewAtIndex.mTag) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.mTag);
        stringBuilder.append(", ");
        stringBuilder.append(this.mIndex);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
