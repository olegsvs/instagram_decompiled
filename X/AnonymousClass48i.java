package X;

import com.instagram.archive.fragment.ArchiveReelCalendarFragment;

/* renamed from: X.48i */
public final class AnonymousClass48i extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ ArchiveReelCalendarFragment f50771B;

    public AnonymousClass48i(ArchiveReelCalendarFragment archiveReelCalendarFragment) {
        this.f50771B = archiveReelCalendarFragment;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1184344067);
        AnonymousClass30M anonymousClass30M = (AnonymousClass30M) obj;
        int I2 = AnonymousClass0cQ.I(this, -513325355);
        this.f50771B.f50781D = true;
        this.f50771B.mLoadingSpinner.setVisibility(8);
        AnonymousClass30M.m18160B(anonymousClass30M, this.f50771B.f50784G, this.f50771B.f50780C);
        ArchiveReelCalendarFragment.m23409B(this.f50771B);
        this.f50771B.mCalendar.FA(this.f50771B.f50779B.B() - 1);
        AnonymousClass0cQ.H(this, -1277290999, I2);
        AnonymousClass0cQ.H(this, 829341880, I);
    }
}
