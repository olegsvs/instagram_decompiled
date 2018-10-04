package com.instagram.video.videocall.view;

import X.AnonymousClass0CC;
import X.AnonymousClass6B8;
import android.content.Context;
import android.os.Build.VERSION;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.GridLayout;
import android.widget.GridLayout.LayoutParams;
import android.widget.GridLayout.Spec;
import android.widget.TextView;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VideoCallSurfaceContainerView extends GridLayout {
    /* renamed from: B */
    public final List f72814B;
    /* renamed from: C */
    public int f72815C;
    /* renamed from: D */
    public int f72816D;
    /* renamed from: E */
    public final Map f72817E;

    public VideoCallSurfaceContainerView(Context context) {
        this(context, null);
    }

    public VideoCallSurfaceContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoCallSurfaceContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72817E = new LinkedHashMap();
        this.f72814B = new LinkedList();
        this.f72815C = 2;
        this.f72816D = 2;
        setOrientation(0);
        setColumnCount(this.f72815C);
        setRowCount(this.f72816D);
    }

    /* renamed from: A */
    public final void m29366A(String str, View view) {
        if (!this.f72817E.containsKey(str)) {
            if (this.f72817E.size() < getRowCount() * getColumnCount()) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                if (this.f72814B.size() < this.f72816D) {
                    View A = new AnonymousClass6B8(getContext()).m29317A(view);
                    A.f72687E = this.f72814B.size();
                    A.f72684B = 0;
                    this.f72814B.add(new LinkedList(Arrays.asList(new AnonymousClass6B8[]{A})));
                    this.f72817E.put(str, A);
                    addView(A, m29365C(this, A.getRow(), A.getColumn(), measuredWidth, measuredHeight));
                    m29364B(this, measuredWidth, measuredHeight);
                } else {
                    for (int size = this.f72814B.size() - 1; size >= 0; size--) {
                        if (((List) this.f72814B.get(size)).size() == 1) {
                            View A2 = new AnonymousClass6B8(getContext()).m29317A(view);
                            A2.f72687E = size;
                            A2.f72684B = 1;
                            ((List) this.f72814B.get(size)).add(A2);
                            this.f72817E.put(str, A2);
                            addView(A2, m29365C(this, A2.getRow(), A2.getColumn(), measuredWidth, measuredHeight));
                            m29364B(this, measuredWidth, measuredHeight);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: B */
    private static void m29364B(VideoCallSurfaceContainerView videoCallSurfaceContainerView, int i, int i2) {
        if (VERSION.SDK_INT >= 19 && ((Boolean) AnonymousClass0CC.Xj.G()).booleanValue()) {
            TransitionManager.beginDelayedTransition(videoCallSurfaceContainerView);
        }
        for (int i3 = 0; i3 < videoCallSurfaceContainerView.f72814B.size(); i3++) {
            for (int i4 = 0; i4 < ((List) videoCallSurfaceContainerView.f72814B.get(i3)).size(); i4++) {
                ((AnonymousClass6B8) ((List) videoCallSurfaceContainerView.f72814B.get(i3)).get(i4)).setLayoutParams(m29365C(videoCallSurfaceContainerView, i3, i4, i, i2));
            }
        }
        videoCallSurfaceContainerView.requestLayout();
    }

    /* renamed from: B */
    public final void m29367B(String str, boolean z) {
        if (this.f72817E.containsKey(str)) {
            ((AnonymousClass6B8) this.f72817E.get(str)).f72686D.setVisibility(0);
        }
    }

    /* renamed from: C */
    private static LayoutParams m29365C(VideoCallSurfaceContainerView videoCallSurfaceContainerView, int i, int i2, int i3, int i4) {
        int i5 = 1;
        Object obj = ((List) videoCallSurfaceContainerView.f72814B.get(i)).size() == 1 ? 1 : null;
        Spec spec = GridLayout.spec(i);
        if (obj != null) {
            i5 = 2;
        }
        LayoutParams layoutParams = new LayoutParams(spec, GridLayout.spec(i2, i5));
        if (obj == null) {
            i3 /= 2;
        }
        layoutParams.width = i3;
        layoutParams.height = i4 / videoCallSurfaceContainerView.f72814B.size();
        layoutParams.setGravity(119);
        return layoutParams;
    }

    /* renamed from: C */
    public final void m29368C(String str) {
        if (this.f72817E.containsKey(str)) {
            ((AnonymousClass6B8) this.f72817E.get(str)).f72686D.setVisibility(8);
        }
    }

    /* renamed from: D */
    public final void m29369D(String str) {
        if (this.f72817E.containsKey(str)) {
            AnonymousClass6B8 anonymousClass6B8 = (AnonymousClass6B8) this.f72817E.get(str);
            this.f72817E.remove(str);
            if (((List) this.f72814B.get(anonymousClass6B8.getRow())).size() == 1) {
                this.f72814B.remove(anonymousClass6B8.getRow());
            } else {
                ((List) this.f72814B.get(anonymousClass6B8.getRow())).remove(anonymousClass6B8.getColumn());
            }
            if (this.f72814B.size() == 1 && ((List) this.f72814B.get(0)).size() == 2) {
                this.f72814B.add(new LinkedList());
                ((List) this.f72814B.get(1)).add(((List) this.f72814B.get(0)).get(1));
                ((List) this.f72814B.get(0)).remove(1);
            }
            for (int i = 0; i < this.f72814B.size(); i++) {
                for (int i2 = 0; i2 < ((List) this.f72814B.get(i)).size(); i2++) {
                    ((AnonymousClass6B8) ((List) this.f72814B.get(i)).get(i2)).f72687E = i;
                    ((AnonymousClass6B8) ((List) this.f72814B.get(i)).get(i2)).f72684B = i2;
                }
            }
            removeView(anonymousClass6B8);
            m29364B(this, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: E */
    public final void m29370E(String str, String str2) {
        if (this.f72817E.containsKey(str)) {
            ((TextView) ((AnonymousClass6B8) this.f72817E.get(str)).f72685C.A()).setText(str2);
        }
    }

    public final void onMeasure(int i, int i2) {
        Object obj;
        MeasureSpec.toString(i);
        MeasureSpec.toString(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Object obj2 = null;
        if (size == measuredWidth) {
            if (size2 == measuredHeight) {
                obj = null;
                if (obj != null) {
                    m29364B(this, size, size2);
                }
                super.onMeasure(i, i2);
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight();
                if (!(measuredWidth == size && measuredHeight == size2)) {
                    obj2 = 1;
                }
                if (obj2 != null) {
                    m29364B(this, size, size2);
                    super.onMeasure(i, i2);
                }
            }
        }
        obj = 1;
        if (obj != null) {
            m29364B(this, size, size2);
        }
        super.onMeasure(i, i2);
        measuredWidth = getMeasuredWidth();
        measuredHeight = getMeasuredHeight();
        obj2 = 1;
        if (obj2 != null) {
            m29364B(this, size, size2);
            super.onMeasure(i, i2);
        }
    }

    public void setMaxParticipantCount(int i) {
        this.f72816D = i / this.f72815C;
        setOrientation(0);
        setColumnCount(this.f72815C);
        setRowCount(this.f72816D);
    }
}
