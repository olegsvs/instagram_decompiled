package X;

import android.view.View;
import android.widget.ViewSwitcher;

/* renamed from: X.5n9 */
public final class AnonymousClass5n9 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ View[] f69002B;
    /* renamed from: C */
    public final /* synthetic */ int f69003C;
    /* renamed from: D */
    public final /* synthetic */ ViewSwitcher f69004D;

    public AnonymousClass5n9(ViewSwitcher viewSwitcher, int i, View[] viewArr) {
        this.f69004D = viewSwitcher;
        this.f69003C = i;
        this.f69002B = viewArr;
    }

    public final void run() {
        int i = 0;
        this.f69004D.setDisplayedChild(0);
        while (i < this.f69003C) {
            this.f69002B[i].setClickable(true);
            i++;
        }
    }
}
