package com.instagram.creation.photo.crop;

import X.AnonymousClass0Hx;
import X.AnonymousClass0IL;
import X.AnonymousClass0IV;
import X.AnonymousClass0PF;
import X.AnonymousClass0cQ;
import X.AnonymousClass5Ud;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C0164R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.creation.base.CropInfo;

public class AvatarCropActivity extends IgFragmentActivity implements AnonymousClass0PF {
    public final void Km(Uri uri, Location location, CropInfo cropInfo, int i, int i2) {
        setResult(-1, new Intent(uri.toString()));
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, 975380221);
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(C0164R.layout.activity_single_container);
        if (mo382D().mo1453E(C0164R.id.layout_container_main) == null) {
            AnonymousClass0IV B2 = mo382D().mo1450B();
            AnonymousClass0Hx.f2719B.mo558A();
            AnonymousClass0IL anonymousClass5Ud = new AnonymousClass5Ud();
            anonymousClass5Ud.setArguments(getIntent().getExtras());
            B2.mo1622M(C0164R.id.layout_container_main, anonymousClass5Ud);
            B2.mo1615F();
        }
        AnonymousClass0cQ.m5853C(this, 1347945438, B);
    }

    public final void ze() {
        setResult(0);
        finish();
    }
}
