package X;

import android.view.MotionEvent;
import com.instagram.igtv.ui.GestureManagerFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4ut */
public final class AnonymousClass4ut {
    /* renamed from: B */
    public final List f58420B;
    /* renamed from: C */
    private final List f58421C;
    /* renamed from: D */
    private AnonymousClass2I2 f58422D;
    /* renamed from: E */
    private final GestureManagerFrameLayout f58423E;

    public AnonymousClass4ut(GestureManagerFrameLayout gestureManagerFrameLayout, List list, List list2) {
        this.f58423E = gestureManagerFrameLayout;
        this.f58421C = new ArrayList(list);
        this.f58420B = new ArrayList(list2);
        this.f58423E.setGestureManager(this);
    }

    /* renamed from: A */
    public final boolean m25351A(boolean z, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && z) {
            this.f58422D = null;
        }
        if (!(z && this.f58423E.f58424B)) {
            AnonymousClass2I2 anonymousClass2I2 = this.f58422D;
            if (anonymousClass2I2 != null) {
                return AnonymousClass4ut.m25350B(anonymousClass2I2, z, motionEvent);
            }
            for (AnonymousClass2I2 anonymousClass2I22 : this.f58421C) {
                if (AnonymousClass4ut.m25350B(anonymousClass2I22, z, motionEvent)) {
                    this.f58422D = anonymousClass2I22;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    private static boolean m25350B(AnonymousClass2I2 anonymousClass2I2, boolean z, MotionEvent motionEvent) {
        if (z) {
            return anonymousClass2I2.Uo(motionEvent);
        }
        return anonymousClass2I2.zDA(motionEvent);
    }
}
