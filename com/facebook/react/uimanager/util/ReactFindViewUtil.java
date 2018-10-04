package com.facebook.react.uimanager.util;

import android.view.View;
import com.facebook.C0164R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ReactFindViewUtil {
    private static final Map mOnMultipleViewsFoundListener = new HashMap();
    private static final List mOnViewFoundListeners = new ArrayList();

    public interface OnMultipleViewsFoundListener {
        void onViewFound(View view, String str);
    }

    public interface OnViewFoundListener {
        String getNativeId();

        void onViewFound(View view);
    }

    private static String getNativeId(View view) {
        view = view.getTag(C0164R.id.view_tag_native_id);
        return view instanceof String ? (String) view : null;
    }

    public static void notifyViewRendered(View view) {
        String nativeId = getNativeId(view);
        if (nativeId != null) {
            Iterator it = mOnViewFoundListeners.iterator();
            while (it.hasNext()) {
                OnViewFoundListener onViewFoundListener = (OnViewFoundListener) it.next();
                if (nativeId != null && nativeId.equals(onViewFoundListener.getNativeId())) {
                    onViewFoundListener.onViewFound(view);
                    it.remove();
                }
            }
            for (Entry entry : mOnMultipleViewsFoundListener.entrySet()) {
                Set set = (Set) entry.getValue();
                if (set != null && set.contains(nativeId)) {
                    ((OnMultipleViewsFoundListener) entry.getKey()).onViewFound(view, nativeId);
                }
            }
        }
    }
}
