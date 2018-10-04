package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.4l9 */
public final class AnonymousClass4l9 extends AnonymousClass0TA {
    /* renamed from: B */
    private final AnonymousClass4l6 f56867B;
    /* renamed from: C */
    private final AnonymousClass0ES f56868C;
    /* renamed from: D */
    private final DirectPrivateStoryRecipientController f56869D;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4l9(AnonymousClass4l6 anonymousClass4l6, AnonymousClass0ES anonymousClass0ES, DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.f56867B = anonymousClass4l6;
        this.f56868C = anonymousClass0ES;
        this.f56869D = directPrivateStoryRecipientController;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 445502544);
        if (view == null) {
            view = AnonymousClass4l8.m24992C(viewGroup, 0);
        }
        AnonymousClass4lA anonymousClass4lA = (AnonymousClass4lA) obj;
        AnonymousClass4l6 anonymousClass4l6 = this.f56867B;
        AnonymousClass0ES anonymousClass0ES = this.f56868C;
        AnonymousClass4l8.m24991B(view, anonymousClass4lA, anonymousClass4l6, anonymousClass0ES, new AnonymousClass5Wx(anonymousClass4l6, anonymousClass0ES, anonymousClass4lA, this.f56869D));
        AnonymousClass0cQ.H(this, 11969791, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass4lA anonymousClass4lA = (AnonymousClass4lA) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
