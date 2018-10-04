package X;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* renamed from: X.4QJ */
public final class AnonymousClass4QJ extends SimpleOnGestureListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4QM f53895B;

    public AnonymousClass4QJ(AnonymousClass4QM anonymousClass4QM) {
        this.f53895B = anonymousClass4QM;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i = 0;
        if (motionEvent == null) {
            return false;
        }
        this.f53895B.f53911O = motionEvent2.getRawY() - motionEvent.getRawY();
        this.f53895B.f53919W = f;
        this.f53895B.f53920X = f2;
        while (i < this.f53895B.f53912P.size()) {
            ((AnonymousClass0dG) this.f53895B.f53912P.get(i)).Ym(this.f53895B.f53902F, this.f53895B.f53903G, f, f2);
            i++;
        }
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (int i = 0; i < this.f53895B.f53912P.size(); i++) {
            ((AnonymousClass0dG) this.f53895B.f53912P.get(i)).qy(this.f53895B.f53902F, this.f53895B.f53903G, f, f2, this.f53895B.f53906J, this.f53895B.f53907K);
        }
        return true;
    }
}
