package X;

import android.os.SystemClock;
import android.widget.ListView;

/* renamed from: X.0tz */
public final class AnonymousClass0tz implements Runnable {
    /* renamed from: B */
    public boolean f11782B;
    /* renamed from: C */
    public float f11783C;
    /* renamed from: D */
    public boolean f11784D;
    /* renamed from: E */
    public ListView f11785E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0iW f11786F;

    public AnonymousClass0tz(AnonymousClass0iW anonymousClass0iW) {
        this.f11786F = anonymousClass0iW;
    }

    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = (int) (uptimeMillis - this.f11786F.f8777E);
        if (this.f11785E.getLastVisiblePosition() == this.f11785E.getCount() - 1) {
            ListView listView = this.f11785E;
            if (listView.getChildAt(listView.getChildCount() - 1).getBottom() == this.f11785E.getBottom()) {
                if (this.f11786F.f8774B.LTA(this.f11785E)) {
                    this.f11783C = this.f11786F.f8781I;
                    this.f11784D = true;
                }
                this.f11782B = true;
            }
        }
        int round = Math.round(Math.abs(this.f11786F.m6910A() - this.f11783C));
        i = (int) (((float) i) * this.f11786F.f8782J);
        if (round < i) {
            i = round;
        }
        if (round != 0) {
            this.f11786F.f8777E = uptimeMillis;
            AnonymousClass0OR.m3626F(this.f11786F.f8776D, this, 5, -184581552);
        }
        if (this.f11784D) {
            i = -i;
        }
        if (this.f11782B) {
            AnonymousClass0iW.m6909E(this.f11786F, (float) i, false);
            this.f11785E.requestLayout();
            return;
        }
        ListView listView2 = this.f11785E;
        listView2.setSelectionFromTop(listView2.getFirstVisiblePosition(), this.f11785E.getChildAt(0).getTop() - i);
    }
}
