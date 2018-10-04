package com.instagram.direct.share.choosertarget;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Gs;
import X.AnonymousClass0Tt;
import X.AnonymousClass0Tw;
import X.AnonymousClass0VU;
import X.AnonymousClass0Vw;
import X.AnonymousClass0Vx;
import X.AnonymousClass0rm;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import com.facebook.C0164R;
import com.instagram.service.session.ShouldInitUserSession;
import java.util.ArrayList;
import java.util.List;

@ShouldInitUserSession
public class DirectChooserTargetService extends ChooserTargetService {
    /* renamed from: B */
    private ChooserTarget m24861B(AnonymousClass0Cm anonymousClass0Cm, ComponentName componentName, AnonymousClass0Vw anonymousClass0Vw) {
        Bitmap bitmap = null;
        if (anonymousClass0Vw.O() == null) {
            return null;
        }
        Icon createWithBitmap;
        CharSequence D = AnonymousClass0Vx.D(getApplicationContext(), anonymousClass0Vw, anonymousClass0Cm.B());
        String C = AnonymousClass0VU.C(anonymousClass0Cm.B(), anonymousClass0Vw.J());
        if (C != null) {
            bitmap = AnonymousClass0Gs.B(AnonymousClass0Gs.f2431j, C, -1, false, true);
        }
        if (bitmap != null) {
            createWithBitmap = Icon.createWithBitmap(AnonymousClass0rm.L(bitmap));
        } else {
            createWithBitmap = Icon.createWithResource(this, C0164R.drawable.profile_anonymous_user);
        }
        anonymousClass0Cm = new Bundle();
        anonymousClass0Cm.putString("com.instagram.share.choosertarget.DirectChooserTargetService.THREAD_ID", anonymousClass0Vw.O());
        return new ChooserTarget(D, createWithBitmap, 0.9f, componentName, anonymousClass0Cm);
    }

    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        AnonymousClass0Cm H = AnonymousClass0Cd.f1698B.N() ? AnonymousClass0Ce.H(this) : null;
        if (H == null) {
            return new ArrayList();
        }
        List arrayList = new ArrayList();
        AnonymousClass0Tt.C(H).B();
        int i = 0;
        List a = AnonymousClass0Tw.C(H).a(false);
        int min = Math.min(a.size(), 8);
        while (i < min) {
            ChooserTarget B = m24861B(H, componentName, (AnonymousClass0Vw) a.get(i));
            if (B != null) {
                arrayList.add(B);
            }
            i++;
        }
        Integer.valueOf(arrayList.size());
        return arrayList;
    }
}
