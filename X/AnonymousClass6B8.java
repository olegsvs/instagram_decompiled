package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.C0164R;

/* renamed from: X.6B8 */
public final class AnonymousClass6B8 extends FrameLayout {
    /* renamed from: B */
    public int f72684B;
    /* renamed from: C */
    public final AnonymousClass3ig f72685C;
    /* renamed from: D */
    public final View f72686D;
    /* renamed from: E */
    public int f72687E;

    public AnonymousClass6B8(Context context) {
        this(context, null, 0);
    }

    public AnonymousClass6B8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72686D = AnonymousClass6B8.inflate(context, C0164R.layout.layout_videocall_cell, this).findViewById(C0164R.id.videocall_cell_mute_indicator);
        this.f72685C = AnonymousClass3ig.B(this, C0164R.id.videocall_debug_stub);
    }

    /* renamed from: A */
    public final AnonymousClass6B8 m29317A(View view) {
        view.setLayoutParams(new LayoutParams(-1, -1));
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view, 0);
        return this;
    }

    public int getColumn() {
        return this.f72684B;
    }

    public int getRow() {
        return this.f72687E;
    }
}
