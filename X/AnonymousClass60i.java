package X;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.instagram.school.fragment.UpdateSchoolFragment;

/* renamed from: X.60i */
public final class AnonymousClass60i implements OnFocusChangeListener {
    /* renamed from: B */
    public final /* synthetic */ UpdateSchoolFragment f70836B;

    public AnonymousClass60i(UpdateSchoolFragment updateSchoolFragment) {
        this.f70836B = updateSchoolFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            AnonymousClass5zL.m28719C("ig_school_school_detail_tap_major_field", this.f70836B.f70847I.f70854F).R();
        }
    }
}
