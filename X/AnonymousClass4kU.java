package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

/* renamed from: X.4kU */
public final class AnonymousClass4kU extends AnonymousClass0TA {
    /* renamed from: B */
    private final AnonymousClass5VA f56775B;
    /* renamed from: C */
    private final AnonymousClass0Cm f56776C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass4kU(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5VA anonymousClass5VA) {
        this.f56776C = anonymousClass0Cm;
        this.f56775B = anonymousClass5VA;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        CharSequence string;
        int I = AnonymousClass0cQ.I(this, 1494640436);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0164R.layout.recipient_picker_add_to_highlights, viewGroup, false);
            view.setTag(new AnonymousClass4kb(view));
        }
        AnonymousClass4kb anonymousClass4kb = (AnonymousClass4kb) view.getTag();
        AnonymousClass0Cm anonymousClass0Cm = this.f56776C;
        Context context = viewGroup.getContext();
        anonymousClass4kb.f56788B.setOnClickListener(new AnonymousClass4ka(this.f56775B));
        if (AnonymousClass0JK.f2907B.E(anonymousClass0Cm).isEmpty()) {
            string = context.getResources().getString(C0164R.string.recipient_picker_add_to_highlights);
        } else {
            string = context.getResources().getString(C0164R.string.recipient_picker_added_to_highlights, new Object[]{AnonymousClass0IE.M(", ", r7)});
        }
        anonymousClass4kb.f56789C.setText(string);
        AnonymousClass0cQ.H(this, -2103384238, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        Void voidR = (Void) obj;
        Void voidR2 = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
