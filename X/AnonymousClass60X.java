package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.school.fragment.UpdateSchoolFragment;

/* renamed from: X.60X */
public final class AnonymousClass60X implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ UpdateSchoolFragment f70826B;

    public AnonymousClass60X(UpdateSchoolFragment updateSchoolFragment) {
        this.f70826B = updateSchoolFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f70826B.f70844F.B();
        AnonymousClass5zL.m28719C("ig_school_school_detail_remove_school", this.f70826B.f70847I.f70854F).R();
        AnonymousClass0IJ anonymousClass0IJ = this.f70826B;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0IJ.f70848J);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "school/leave/";
        AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass5zg.class).N().H();
        H.f2849B = this.f70826B.f70843E;
        anonymousClass0IJ.schedule(H);
    }
}
