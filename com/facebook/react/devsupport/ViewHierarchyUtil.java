package com.facebook.react.devsupport;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Queue;

public final class ViewHierarchyUtil {
    public static Pair getDeepestLeaf(View view) {
        Queue linkedList = new LinkedList();
        Pair pair = new Pair(view, Integer.valueOf(1));
        linkedList.add(pair);
        while (!linkedList.isEmpty()) {
            Pair pair2 = (Pair) linkedList.poll();
            if (((Integer) pair2.second).intValue() > ((Integer) pair.second).intValue()) {
                pair = pair2;
            }
            if (pair2.first instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) pair2.first;
                Integer valueOf = Integer.valueOf(((Integer) pair2.second).intValue() + 1);
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    linkedList.add(new Pair(viewGroup.getChildAt(i), valueOf));
                }
            }
        }
        return pair;
    }
}
