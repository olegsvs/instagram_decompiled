package android.support.v4.app;

import X.AnonymousClass0Fy;
import X.AnonymousClass0Fz;
import X.AnonymousClass0He;
import X.AnonymousClass0Hf;
import X.AnonymousClass0IL;
import X.AnonymousClass0IU;
import X.AnonymousClass0Kh;
import X.AnonymousClass0O8;
import X.AnonymousClass0c7;
import X.AnonymousClass0c8;
import X.AnonymousClass0c9;
import X.AnonymousClass0cP;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dU;
import X.AnonymousClass0dV;
import X.AnonymousClass0dW;
import X.AnonymousClass0e2;
import X.AnonymousClass1lF;
import X.AnonymousClass1lM;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends BaseFragmentActivityApi16 implements AnonymousClass0He, AnonymousClass0Hf {
    /* renamed from: B */
    public boolean f2706B;
    /* renamed from: C */
    public final AnonymousClass0c7 f2707C = new AnonymousClass0c7(new AnonymousClass0dW(this));
    /* renamed from: D */
    public final Handler f2708D = new AnonymousClass0dV(this);
    /* renamed from: E */
    public int f2709E;
    /* renamed from: F */
    public AnonymousClass0Kh f2710F;
    /* renamed from: G */
    public boolean f2711G = true;
    /* renamed from: H */
    public boolean f2712H;
    /* renamed from: I */
    public boolean f2713I;
    /* renamed from: J */
    public boolean f2714J;
    /* renamed from: K */
    public boolean f2715K = true;

    /* renamed from: F */
    public void mo433F(AnonymousClass0IL anonymousClass0IL) {
    }

    /* renamed from: A */
    public final View mo438A(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2707C.f7000B.f7003D.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: C */
    public final void m2097C(boolean z) {
        if (!this.f2711G) {
            this.f2711G = true;
            this.f2714J = z;
            this.f2708D.removeMessages(1);
            this.f2707C.m5692F(this.f2714J);
            AnonymousClass0cP.m5776D(this.f2707C.f7000B.f7003D, 2);
        } else if (z) {
            this.f2707C.m5691E();
            this.f2707C.m5692F(true);
        }
    }

    /* renamed from: D */
    public AnonymousClass0IU mo382D() {
        return this.f2707C.m5694H();
    }

    /* renamed from: E */
    public AnonymousClass0Fz mo383E() {
        return this.f2707C.m5695I();
    }

    /* renamed from: H */
    private static int m2094H(FragmentActivity fragmentActivity, AnonymousClass0IL anonymousClass0IL) {
        if (fragmentActivity.f2710F.m2849I() < 65534) {
            while (fragmentActivity.f2710F.m2844D(fragmentActivity.f2709E) >= 0) {
                fragmentActivity.f2709E = (fragmentActivity.f2709E + 1) % 65534;
            }
            int i = fragmentActivity.f2709E;
            fragmentActivity.f2710F.m2846F(i, anonymousClass0IL.mWho);
            fragmentActivity.f2709E = (fragmentActivity.f2709E + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: I */
    public void mo388I() {
        this.f2707C.m5689C();
    }

    /* renamed from: I */
    private static void m2095I(AnonymousClass0IU anonymousClass0IU, AnonymousClass0dU anonymousClass0dU) {
        for (AnonymousClass0IL anonymousClass0IL : anonymousClass0IU.mo1458J()) {
            if (anonymousClass0IL != null) {
                anonymousClass0IL.mLifecycleRegistry.f7448F = anonymousClass0dU;
                m2095I(anonymousClass0IL.getChildFragmentManager(), anonymousClass0dU);
            }
        }
    }

    /* renamed from: J */
    public final void m2102J(AnonymousClass0IL anonymousClass0IL, String[] strArr, int i) {
        if (i == -1) {
            AnonymousClass1lF.H(this, strArr, i);
            return;
        }
        BaseFragmentActivityApi14.m2106J(i);
        try {
            this.f2712H = true;
            AnonymousClass1lF.H(this, strArr, ((m2094H(this, anonymousClass0IL) + 1) << 16) + (i & 65535));
        } finally {
            this.f2712H = false;
        }
    }

    /* renamed from: K */
    public final void m2103K(AnonymousClass0IL anonymousClass0IL, Intent intent, int i, Bundle bundle) {
        this.f2716B = true;
        if (i == -1) {
            try {
                AnonymousClass1lF.J(this, intent, -1, bundle);
            } catch (Throwable th) {
                this.f2716B = false;
            }
        } else {
            BaseFragmentActivityApi14.m2106J(i);
            AnonymousClass1lF.J(this, intent, ((m2094H(this, anonymousClass0IL) + 1) << 16) + (i & 65535), bundle);
        }
        this.f2716B = false;
    }

    /* renamed from: L */
    public final void m2104L(AnonymousClass0IL anonymousClass0IL, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        int i5 = i;
        Activity activity = this;
        this.f2717B = true;
        IntentSender intentSender2 = intentSender;
        Intent intent2 = intent;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        Bundle bundle2 = bundle;
        if (i == -1) {
            try {
                AnonymousClass1lF.K(activity, intentSender2, i5, intent2, i6, i7, i8, bundle2);
            } catch (Throwable th) {
                activity.f2717B = false;
            }
        } else {
            BaseFragmentActivityApi14.m2106J(i);
            AnonymousClass1lF.K(activity, intentSender, ((m2094H(activity, anonymousClass0IL) + 1) << 16) + (i5 & 65535), intent, i2, i3, i4, bundle);
        }
        activity.f2717B = false;
    }

    /* renamed from: M */
    public void mo436M() {
        invalidateOptionsMenu();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("  ");
        String stringBuilder2 = stringBuilder.toString();
        printWriter.print(stringBuilder2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2706B);
        printWriter.print("mResumed=");
        printWriter.print(this.f2713I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2715K);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f2711G);
        AnonymousClass0c8 anonymousClass0c8 = this.f2707C.f7000B;
        printWriter.print(stringBuilder2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(anonymousClass0c8.f7006G);
        if (anonymousClass0c8.f7005F != null) {
            printWriter.print(stringBuilder2);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(anonymousClass0c8.f7005F)));
            printWriter.println(":");
            AnonymousClass0Fy anonymousClass0Fy = anonymousClass0c8.f7005F;
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder2);
            stringBuilder.append("  ");
            anonymousClass0Fy.m1708I(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
        }
        this.f2707C.m5694H().mo1451C(str, fileDescriptor, printWriter, strArr);
    }

    public final void iWA(int i) {
        if (!this.f2712H && i != -1) {
            BaseFragmentActivityApi14.m2106J(i);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2707C.m5696J();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.f2710F.m2842B(i4);
            this.f2710F.m2847G(i4);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            AnonymousClass0IL CA = this.f2707C.f7000B.f7003D.CA(str);
            if (CA == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Activity result no fragment exists for who: ");
                stringBuilder.append(str);
                Log.w("FragmentActivity", stringBuilder.toString());
            } else {
                CA.onActivityResult(i & 65535, i2, intent);
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        AnonymousClass0IU H = this.f2707C.m5694H();
        boolean K = H.mo1459K();
        if (K && VERSION.SDK_INT <= 25) {
            return;
        }
        if (K || !H.mo1463O()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2707C.f7000B.f7003D.m5825Z(configuration);
    }

    public void onCreate(Bundle bundle) {
        int B = AnonymousClass0cQ.m5852B(this, 630010573);
        AnonymousClass0c7 anonymousClass0c7 = this.f2707C;
        AnonymousClass0e2 anonymousClass0e2 = null;
        AnonymousClass0cP anonymousClass0cP = anonymousClass0c7.f7000B.f7003D;
        AnonymousClass0c9 anonymousClass0c9 = anonymousClass0c7.f7000B;
        anonymousClass0cP.m5822W(anonymousClass0c9, anonymousClass0c9, null);
        super.onCreate(bundle);
        AnonymousClass1lM anonymousClass1lM = (AnonymousClass1lM) getLastNonConfigurationInstance();
        if (anonymousClass1lM != null) {
            AnonymousClass0c7 anonymousClass0c72 = this.f2707C;
            AnonymousClass0O8 anonymousClass0O8 = anonymousClass1lM.f22476C;
            AnonymousClass0c8 anonymousClass0c8 = anonymousClass0c72.f7000B;
            if (anonymousClass0O8 != null) {
                int size = anonymousClass0O8.size();
                for (int i = 0; i < size; i++) {
                    ((AnonymousClass0Fy) anonymousClass0O8.m3532I(i)).f2286C = anonymousClass0c8;
                }
            }
            anonymousClass0c8.f7001B = anonymousClass0O8;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            anonymousClass0c72 = this.f2707C;
            if (anonymousClass1lM != null) {
                anonymousClass0e2 = anonymousClass1lM.f22475B;
            }
            anonymousClass0c72.f7000B.f7003D.OA(parcelable, anonymousClass0e2);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f2709E = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (!(intArray == null || stringArray == null)) {
                    if (intArray.length == stringArray.length) {
                        this.f2710F = new AnonymousClass0Kh(intArray.length);
                        for (int i2 = 0; i2 < intArray.length; i2++) {
                            this.f2710F.m2846F(intArray[i2], stringArray[i2]);
                        }
                    }
                }
                Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
            }
        }
        if (this.f2710F == null) {
            this.f2710F = new AnonymousClass0Kh();
            this.f2709E = 0;
        }
        this.f2707C.m5687A();
        AnonymousClass0cQ.m5853C(this, -1144238732, B);
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        i = super.onCreatePanelMenu(i, menu);
        AnonymousClass0c7 anonymousClass0c7 = this.f2707C;
        return i | anonymousClass0c7.f7000B.f7003D.m5828c(menu, getMenuInflater());
    }

    public void onDestroy() {
        int B = AnonymousClass0cQ.m5852B(this, 1956141081);
        super.onDestroy();
        m2097C(false);
        this.f2707C.f7000B.f7003D.m5829d();
        this.f2707C.m5690D();
        AnonymousClass0cQ.m5853C(this, 373752159, B);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f2707C.f7000B.f7003D.m5830e();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2707C.f7000B.f7003D.m5846u(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f2707C.f7000B.f7003D.m5826a(menuItem);
    }

    public final void onMultiWindowModeChanged(boolean z) {
        this.f2707C.f7000B.f7003D.m5831f(z);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f2707C.m5696J();
    }

    public final void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2707C.f7000B.f7003D.m5847v(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        int B = AnonymousClass0cQ.m5852B(this, 1263837095);
        super.onPause();
        this.f2713I = false;
        if (this.f2708D.hasMessages(2)) {
            this.f2708D.removeMessages(2);
            mo388I();
        }
        this.f2707C.m5688B();
        AnonymousClass0cQ.m5853C(this, 1262288531, B);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        this.f2707C.f7000B.f7003D.m5848w(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f2708D.removeMessages(2);
        mo388I();
        this.f2707C.m5693G();
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        return super.onPreparePanel(0, view, menu) | this.f2707C.f7000B.f7003D.m5849x(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.f2710F.m2842B(i3);
            this.f2710F.m2847G(i3);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            AnonymousClass0IL CA = this.f2707C.f7000B.f7003D.CA(str);
            if (CA == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Activity result no fragment exists for who: ");
                stringBuilder.append(str);
                Log.w("FragmentActivity", stringBuilder.toString());
            } else {
                CA.onRequestPermissionsResult(i & 65535, strArr, iArr);
            }
        }
    }

    public void onResume() {
        int B = AnonymousClass0cQ.m5852B(this, 535620415);
        super.onResume();
        this.f2708D.sendEmptyMessage(2);
        this.f2713I = true;
        this.f2707C.m5693G();
        AnonymousClass0cQ.m5853C(this, 459115065, B);
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.f2715K) {
            m2097C(true);
        }
        AnonymousClass0cP anonymousClass0cP = this.f2707C.f7000B.f7003D;
        AnonymousClass0cP.m5785M(anonymousClass0cP.f7146W);
        AnonymousClass0e2 anonymousClass0e2 = anonymousClass0cP.f7146W;
        AnonymousClass0O8 W = this.f2707C.f7000B.m5719W();
        if (anonymousClass0e2 == null && W == null) {
            return null;
        }
        AnonymousClass1lM anonymousClass1lM = new AnonymousClass1lM();
        anonymousClass1lM.f22475B = anonymousClass0e2;
        anonymousClass1lM.f22476C = W;
        return anonymousClass1lM;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m2095I(mo382D(), AnonymousClass0dU.CREATED);
        Parcelable PA = this.f2707C.f7000B.f7003D.PA();
        if (PA != null) {
            bundle.putParcelable("android:support:fragments", PA);
        }
        if (this.f2710F.m2849I() > 0) {
            bundle.putInt("android:support:next_request_index", this.f2709E);
            int[] iArr = new int[this.f2710F.m2849I()];
            String[] strArr = new String[this.f2710F.m2849I()];
            for (int i = 0; i < this.f2710F.m2849I(); i++) {
                iArr[i] = this.f2710F.m2845E(i);
                strArr[i] = (String) this.f2710F.m2850J(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        AnonymousClass0cP anonymousClass0cP;
        int B = AnonymousClass0cQ.m5852B(this, 719084298);
        super.onStart();
        this.f2715K = false;
        this.f2711G = false;
        this.f2708D.removeMessages(1);
        if (!this.f2706B) {
            this.f2706B = true;
            anonymousClass0cP = this.f2707C.f7000B.f7003D;
            anonymousClass0cP.f7149Z = false;
            AnonymousClass0cP.m5776D(anonymousClass0cP, 2);
        }
        this.f2707C.m5696J();
        this.f2707C.m5693G();
        this.f2707C.m5691E();
        anonymousClass0cP = this.f2707C.f7000B.f7003D;
        anonymousClass0cP.f7149Z = false;
        AnonymousClass0cP.m5776D(anonymousClass0cP, 4);
        this.f2707C.m5697K();
        AnonymousClass0cQ.m5853C(this, 1296390606, B);
    }

    public void onStateNotSaved() {
        this.f2707C.m5696J();
    }

    public void onStop() {
        int B = AnonymousClass0cQ.m5852B(this, -148133936);
        super.onStop();
        this.f2715K = true;
        m2095I(mo382D(), AnonymousClass0dU.CREATED);
        this.f2708D.sendEmptyMessage(1);
        AnonymousClass0cP anonymousClass0cP = this.f2707C.f7000B.f7003D;
        anonymousClass0cP.f7149Z = true;
        AnonymousClass0cP.m5776D(anonymousClass0cP, 3);
        AnonymousClass0cQ.m5853C(this, 657614596, B);
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (!(this.f2716B || i == -1)) {
            BaseFragmentActivityApi14.m2106J(i);
        }
        super.startActivityForResult(intent, i);
    }
}
