package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.igtv.uploadflow.IGTVUploadMetadataFragment;
import com.instagram.igtv.uploadflow.IGTVVideoCoverPickerFragment;

/* renamed from: X.4vD */
public final class AnonymousClass4vD implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ IGTVUploadMetadataFragment f58472B;
    /* renamed from: C */
    public final /* synthetic */ String[] f58473C;

    public AnonymousClass4vD(IGTVUploadMetadataFragment iGTVUploadMetadataFragment, String[] strArr) {
        this.f58472B = iGTVUploadMetadataFragment;
        this.f58473C = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0IZ anonymousClass0IZ;
        if (this.f58473C[i].equals(this.f58472B.getString(C0164R.string.igtv_cover_picker_video))) {
            anonymousClass0IZ = new AnonymousClass0IZ(this.f58472B.getActivity());
            AnonymousClass2CP.f27395B.D();
            String str = this.f58472B.f58494F.UB;
            String str2 = this.f58472B.f58490B.f41200C;
            String str3 = this.f58472B.f58490B.f41199B;
            Bundle bundle = new Bundle();
            bundle.putString("igtv_pending_media_key_arg", str);
            bundle.putString("igtv_session_id_arg", str2);
            bundle.putString("igtv_creation_session_id_arg", str3);
            AnonymousClass0IL iGTVVideoCoverPickerFragment = new IGTVVideoCoverPickerFragment();
            iGTVVideoCoverPickerFragment.setArguments(bundle);
            anonymousClass0IZ.f2754D = iGTVVideoCoverPickerFragment;
            anonymousClass0IZ.B();
        } else if (this.f58473C[i].equals(this.f58472B.getString(C0164R.string.igtv_cover_picker_camera_roll))) {
            IGTVUploadMetadataFragment.m25373C(this.f58472B);
            anonymousClass0IZ = new AnonymousClass0IZ(this.f58472B.getActivity());
            anonymousClass0IZ.f2754D = AnonymousClass2CP.f27395B.D().m25326A(AnonymousClass2CO.PICK_COVER_PHOTO, this.f58472B.f58494F.UB, this.f58472B.f58490B.f41200C, this.f58472B.f58490B.f41199B);
            anonymousClass0IZ.B();
        }
    }
}
