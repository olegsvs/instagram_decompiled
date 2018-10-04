package com.instagram.react.activity;

import X.AnonymousClass0IL;
import X.AnonymousClass0IV;
import X.AnonymousClass0cQ;
import X.AnonymousClass1Y6;
import android.os.Bundle;
import com.facebook.C0164R;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class IgReactActivity extends BaseFragmentActivity implements PermissionAwareActivity {
    /* renamed from: B */
    private PermissionListener f69440B;

    /* renamed from: T */
    public final void m28576T() {
        if (D().E(C0164R.id.layout_container_main) == null) {
            AnonymousClass0IL anonymousClass1Y6 = new AnonymousClass1Y6();
            anonymousClass1Y6.setArguments(getIntent().getExtras());
            AnonymousClass0IV B = D().B();
            B.M(C0164R.id.layout_container_main, anonymousClass1Y6);
            B.F();
        }
    }

    public final void finish() {
        super.finish();
        int[] intArrayExtra = getIntent().getIntArrayExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.B(this, -1930693958);
        super.onCreate(bundle);
        int[] intArrayExtra = getIntent().getIntArrayExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[0], intArrayExtra[1]);
        }
        AnonymousClass0cQ.C(this, 79003697, B);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PermissionListener permissionListener = this.f69440B;
        if (permissionListener != null && permissionListener.onRequestPermissionsResult(i, strArr, iArr)) {
            this.f69440B = null;
        }
    }

    public final void requestPermissions(String[] strArr, int i, PermissionListener permissionListener) {
        this.f69440B = permissionListener;
        requestPermissions(strArr, i);
    }
}
