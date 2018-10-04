package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;

/* renamed from: X.2L7 */
public final class AnonymousClass2L7 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ GLDrawingView f29213B;

    public AnonymousClass2L7(GLDrawingView gLDrawingView) {
        this.f29213B = gLDrawingView;
    }

    public final void run() {
        if (this.f29213B.f32097C != null) {
            AnonymousClass4Ll anonymousClass4Ll = this.f29213B.f32097C;
            AnonymousClass5Sw.F(anonymousClass4Ll.f53106B.f53108C);
            if (anonymousClass4Ll.f53106B.f53107B.m16761H()) {
                anonymousClass4Ll.f53106B.f53108C.E(AnonymousClass4Li.ACTIVE_HAS_DRAWING);
            } else {
                anonymousClass4Ll.f53106B.f53108C.E(AnonymousClass4Li.ACTIVE_EMPTY);
            }
        }
    }
}
