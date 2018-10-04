package X;

import android.app.Dialog;
import android.os.Bundle;
import com.facebook.C0164R;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.1SA */
public final class AnonymousClass1SA extends AnonymousClass1Pn {
    /* renamed from: B */
    public static AnonymousClass1SA m11465B(String str, String str2) {
        AnonymousClass0IL anonymousClass1SA = new AnonymousClass1SA();
        Bundle bundle = new Bundle();
        bundle.putString(DialogModule.KEY_TITLE, str);
        bundle.putString("body", str2);
        anonymousClass1SA.setArguments(bundle);
        return anonymousClass1SA;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new AnonymousClass0Sb(getActivity()).m4376R(getArguments().getString(DialogModule.KEY_TITLE)).m4367I(getArguments().getString("body")).m4373O(C0164R.string.ok, new AnonymousClass2Hi(this)).m4361C();
    }
}
