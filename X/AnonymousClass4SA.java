package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.creation.capture.quickcapture.music.search.MusicOverlayResultsListController;
import com.instagram.reels.music.model.MusicSearchGenre;

/* renamed from: X.4SA */
public final class AnonymousClass4SA implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Tu f54211B;
    /* renamed from: C */
    public final /* synthetic */ MusicSearchGenre f54212C;

    public AnonymousClass4SA(AnonymousClass5Tu anonymousClass5Tu, MusicSearchGenre musicSearchGenre) {
        this.f54211B = anonymousClass5Tu;
        this.f54212C = musicSearchGenre;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1819651143);
        MusicOverlayResultsListController musicOverlayResultsListController = this.f54211B.f64658D;
        Parcelable parcelable = this.f54212C;
        RecyclerView recyclerView = musicOverlayResultsListController.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestFocus();
        }
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", musicOverlayResultsListController.f66890M.f1759C);
        bundle.putParcelable(AnonymousClass5Tt.f64650G, parcelable);
        bundle.putSerializable("camera_upload_step", musicOverlayResultsListController.f66881D);
        bundle.putInt("list_bottom_padding_px", musicOverlayResultsListController.f66880C);
        AnonymousClass0IL anonymousClass5Tt = new AnonymousClass5Tt();
        anonymousClass5Tt.setArguments(bundle);
        AnonymousClass4S9.m24262B(musicOverlayResultsListController.f66882E.getParentFragment().getId(), musicOverlayResultsListController.f66882E, anonymousClass5Tt, musicOverlayResultsListController.f66883F, null);
        AnonymousClass0cQ.L(this, -301381763, M);
    }
}
