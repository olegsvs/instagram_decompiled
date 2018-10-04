package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.instagram.creation.capture.MediaCaptureFragment;
import java.util.List;

/* renamed from: X.4HJ */
public abstract class AnonymousClass4HJ extends LinearLayout implements AnonymousClass3DN {
    /* renamed from: B */
    public MediaCaptureFragment f52317B;

    /* renamed from: A */
    public abstract void m23739A();

    /* renamed from: B */
    public abstract boolean m23740B();

    /* renamed from: C */
    public abstract boolean m23741C();

    /* renamed from: D */
    public abstract void m23742D();

    /* renamed from: E */
    public abstract void m23743E();

    /* renamed from: F */
    public abstract void m23744F(int i, int i2);

    public abstract AnonymousClass3B8 getCurrentFolder();

    public abstract List getFolders();

    public abstract void setCurrentFolderById(int i);

    public abstract void setTabBarHeight(int i);

    public abstract void setTopOffset(int i);

    public AnonymousClass4HJ(Context context) {
        this(context, null);
    }

    public AnonymousClass4HJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnonymousClass4HJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setListener(MediaCaptureFragment mediaCaptureFragment) {
        this.f52317B = mediaCaptureFragment;
    }
}
