package X;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListView;
import com.facebook.forker.Process;

/* renamed from: X.3Nd */
public final class AnonymousClass3Nd implements AnonymousClass0wo {
    /* renamed from: B */
    public final AnonymousClass5F2 f40654B;
    /* renamed from: C */
    public final OnGlobalLayoutListener f40655C = new AnonymousClass3Nc(this);
    /* renamed from: D */
    public int f40656D;
    /* renamed from: E */
    public final AnonymousClass3Nf f40657E;
    /* renamed from: F */
    public final AnonymousClass0Qd f40658F = new AnonymousClass3Nb(this);
    /* renamed from: G */
    public final ListView f40659G;
    /* renamed from: H */
    public int f40660H;
    /* renamed from: I */
    public final int[] f40661I = new int[2];
    /* renamed from: J */
    public int f40662J;

    public AnonymousClass3Nd(ListView listView, AnonymousClass3Nf anonymousClass3Nf, AnonymousClass5F2 anonymousClass5F2) {
        this.f40659G = listView;
        this.f40654B = anonymousClass5F2;
        this.f40657E = anonymousClass3Nf;
        int i = anonymousClass3Nf.f40666D;
        if (i == -1) {
            i = Process.WAIT_RESULT_TIMEOUT;
        }
        this.f40656D = i;
        this.f40662J = Process.WAIT_RESULT_TIMEOUT;
        this.f40660H = Process.WAIT_RESULT_TIMEOUT;
    }

    public final void vWA(AnonymousClass0we anonymousClass0we, AnonymousClass0wM anonymousClass0wM) {
        AnonymousClass0LH.C(this.f40659G.getHeaderViewsCount() == 0, "VisibleItemTracker's ListPositionTracked isn't implemented to support list with headerView. If we decided to use headerView, please adjust the framework for it.");
        Object obj = (this.f40660H == Process.WAIT_RESULT_TIMEOUT || this.f40656D == Process.WAIT_RESULT_TIMEOUT || this.f40662J == Process.WAIT_RESULT_TIMEOUT) ? null : 1;
        if (obj != null) {
            int i = this.f40662J - this.f40656D;
            int firstVisiblePosition = this.f40659G.getFirstVisiblePosition();
            while (firstVisiblePosition <= this.f40659G.getLastVisiblePosition()) {
                ListView listView = this.f40659G;
                if (listView.getChildAt(firstVisiblePosition - listView.getFirstVisiblePosition()).getTop() + this.f40660H < i) {
                    anonymousClass0we.B(anonymousClass0wM, firstVisiblePosition);
                    firstVisiblePosition++;
                } else {
                    return;
                }
            }
        }
    }
}
