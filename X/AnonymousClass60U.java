package X;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.NumberPicker;

/* renamed from: X.60U */
public final class AnonymousClass60U implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Q2 f70823B;
    /* renamed from: C */
    public final /* synthetic */ NumberPicker f70824C;

    public AnonymousClass60U(AnonymousClass1Q2 anonymousClass1Q2, NumberPicker numberPicker) {
        this.f70823B = anonymousClass1Q2;
        this.f70824C = numberPicker;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -178178701);
        Intent intent = new Intent();
        intent.putExtra("SelectClassYearBottomSheetFragment.SELECTED_CLASS_YEAR", this.f70823B.f18289B[this.f70824C.getValue()]);
        this.f70823B.getTargetFragment().onActivityResult(1, -1, intent);
        AnonymousClass0bz.B(this.f70823B.getContext()).B();
        AnonymousClass0cQ.L(this, 1920448943, M);
    }
}
