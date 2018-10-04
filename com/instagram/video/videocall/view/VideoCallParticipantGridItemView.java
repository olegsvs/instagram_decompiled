package com.instagram.video.videocall.view;

import X.AnonymousClass3ig;
import X.AnonymousClass6Aq;
import X.AnonymousClass6BY;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0164R;
import org.webrtc.MediaStreamTrack;

public class VideoCallParticipantGridItemView extends FrameLayout {
    /* renamed from: B */
    public final AnonymousClass3ig f72764B;
    /* renamed from: C */
    public final View f72765C;
    /* renamed from: D */
    private AnonymousClass6Aq f72766D;

    public VideoCallParticipantGridItemView(Context context) {
        this(context, null);
    }

    public VideoCallParticipantGridItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoCallParticipantGridItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, C0164R.layout.layout_videocall_grid_item, this);
        this.f72765C = findViewById(C0164R.id.videocall_cell_mute_indicator);
        this.f72764B = AnonymousClass3ig.B(this, C0164R.id.videocall_debug_stub);
    }

    private int getRowCount() {
        if (this.f72766D == null) {
            return 1;
        }
        return this.f72766D.m29292A(((AnonymousClass6BY) ((RecyclerView) getParent()).getAdapter()).f72775C);
    }

    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i2);
        int rowCount = getRowCount();
        if (rowCount != 0) {
            i2 = MeasureSpec.makeMeasureSpec(size / rowCount, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setVideoCallPositionStrategy(AnonymousClass6Aq anonymousClass6Aq) {
        this.f72766D = anonymousClass6Aq;
    }

    public void setVideoView(View view) {
        if (view.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != this) {
                viewGroup.removeView(view);
            } else {
                return;
            }
        }
        View childAt = getChildAt(0);
        String str = MediaStreamTrack.VIDEO_TRACK_KIND;
        if (str.equals(childAt.getTag())) {
            removeView(childAt);
        }
        view.setLayoutParams(generateDefaultLayoutParams());
        view.setTag(str);
        addView(view, 0);
    }
}
