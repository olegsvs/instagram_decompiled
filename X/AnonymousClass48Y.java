package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.instagram.archive.fragment.ArchiveHomeFragment;

/* renamed from: X.48Y */
public final class AnonymousClass48Y implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ ArchiveHomeFragment f50737B;

    public AnonymousClass48Y(ArchiveHomeFragment archiveHomeFragment) {
        this.f50737B = archiveHomeFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface = new AnonymousClass0IZ(this.f50737B.getActivity());
        AnonymousClass0Jd.f2931B.H();
        dialogInterface.f2754D = AnonymousClass0ST.B(AnonymousClass2Fj.AUTO_SAVE_SETTINGS_ONLY);
        dialogInterface.B();
    }
}
