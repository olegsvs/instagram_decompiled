package com.instagram.base.activity;

import X.AnonymousClass0CC;
import X.AnonymousClass0EH;
import X.AnonymousClass0FC;
import X.AnonymousClass0G5;
import X.AnonymousClass0GA;
import X.AnonymousClass0Gi;
import X.AnonymousClass0Hg;
import X.AnonymousClass0IL;
import X.AnonymousClass0IS;
import X.AnonymousClass0Iz;
import X.AnonymousClass0Px;
import X.AnonymousClass0Rz;
import X.AnonymousClass0bz;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dP;
import X.AnonymousClass1mY;
import X.AnonymousClass3ci;
import android.app.ActivityManager.TaskDescription;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.CustomFragmentActivity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.facebook.C0164R;
import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class IgFragmentActivity extends CustomFragmentActivity implements AnonymousClass0Hg {
    /* renamed from: B */
    public AnonymousClass0bz f2704B;
    /* renamed from: C */
    private AnonymousClass3ci f2705C;

    /* renamed from: N */
    public void mo442N() {
        onBackPressed();
    }

    /* renamed from: O */
    public void m2092O(AnonymousClass0GA anonymousClass0GA) {
        AnonymousClass0Px.m3949B(this, mo383E(), anonymousClass0GA);
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.f2705C = new AnonymousClass3ci(context.getResources());
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0FC.m1519B().cKA(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final Resources getResources() {
        return (Resources) AnonymousClass1mY.D(this.f2705C, "Custom drawables have not been initialized!");
    }

    public void onBackPressed() {
        AnonymousClass0bz anonymousClass0bz = this.f2704B;
        if (anonymousClass0bz == null || !anonymousClass0bz.m5670E()) {
            AnonymousClass0IL E = mo382D().mo1453E(C0164R.id.layout_container_main);
            Object obj = ((E instanceof AnonymousClass0IS) && ((AnonymousClass0IS) E).onBackPressed()) ? 1 : null;
            if (obj == null) {
                AnonymousClass0Iz.f2854L.m2407J(this, "back");
                super.onBackPressed();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, -311357174);
        AnonymousClass0EH.m1380J(getResources());
        super.onCreate(bundle);
        AnonymousClass0Gi.f2408B.m1844A(this);
        setVolumeControlStream(Process.WAIT_RESULT_TIMEOUT);
        if (VERSION.SDK_INT >= 21) {
            setTaskDescription(new TaskDescription(null, null, AnonymousClass0G5.m1723D(this, 16843857)));
        }
        AnonymousClass0cQ.m5853C(this, 1246483589, B);
    }

    public void onDestroy() {
        int B = AnonymousClass0cQ.m5852B(this, 1870482225);
        super.onDestroy();
        AnonymousClass0Gi.f2408B.m1845B(this);
        AnonymousClass0cQ.m5853C(this, 421754636, B);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        AnonymousClass0IL E = mo382D().mo1453E(C0164R.id.layout_container_main);
        if ((E instanceof AnonymousClass0Rz) && ((AnonymousClass0Rz) E).sU(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onPause() {
        int B = AnonymousClass0cQ.m5852B(this, -2087975887);
        super.onPause();
        AnonymousClass0Gi.f2408B.m1846C(this);
        AnonymousClass0cQ.m5853C(this, -234322666, B);
    }

    public void onResume() {
        int B = AnonymousClass0cQ.m5852B(this, 1127377374);
        super.onResume();
        AnonymousClass0Gi.f2408B.m1847D(this);
        AnonymousClass0cQ.m5853C(this, 1266295207, B);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        List<AnonymousClass0IL> J = mo382D().mo1458J();
        if (((Boolean) AnonymousClass0CC.fC.m914G()).booleanValue()) {
            Parcel obtain = Parcel.obtain();
            obtain.writeBundle(bundle);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            Set keySet = bundle.keySet();
            if (dataSize > ((Integer) AnonymousClass0CC.dC.m914G()).intValue()) {
                String localClassName = getLocalClassName();
                List arrayList = new ArrayList();
                for (AnonymousClass0IL anonymousClass0IL : J) {
                    arrayList.add(anonymousClass0IL.getClass().getName());
                }
                AnonymousClass0dP.m6045B(localClassName, arrayList, dataSize, keySet);
            }
        }
    }

    public final AnonymousClass0bz wI() {
        if (this.f2704B == null) {
            this.f2704B = new AnonymousClass0bz(this, mo382D());
        }
        return this.f2704B;
    }
}
