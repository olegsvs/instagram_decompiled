package X;

import android.view.View;
import com.instagram.archive.fragment.ArchiveReelCalendarFragment;

/* renamed from: X.48j */
public final class AnonymousClass48j implements AnonymousClass3b8 {
    /* renamed from: B */
    public final /* synthetic */ ArchiveReelCalendarFragment f50772B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0MI f50773C;
    /* renamed from: D */
    public final /* synthetic */ View f50774D;

    public AnonymousClass48j(ArchiveReelCalendarFragment archiveReelCalendarFragment, View view, AnonymousClass0MI anonymousClass0MI) {
        this.f50772B = archiveReelCalendarFragment;
        this.f50774D = view;
        this.f50773C = anonymousClass0MI;
    }

    public final void onFinish() {
        ArchiveReelCalendarFragment archiveReelCalendarFragment = this.f50772B;
        View view = this.f50774D;
        AnonymousClass0MI anonymousClass0MI = this.f50773C;
        view.setVisibility(4);
        AnonymousClass0lG b = archiveReelCalendarFragment.m23411b();
        b.E(anonymousClass0MI, 0, null, archiveReelCalendarFragment.f50783F, new AnonymousClass48k(archiveReelCalendarFragment, anonymousClass0MI, view, b), true, AnonymousClass0Qf.CALENDAR);
    }
}
