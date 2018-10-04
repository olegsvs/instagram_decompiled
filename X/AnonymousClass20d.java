package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: X.20d */
public final class AnonymousClass20d extends AnonymousClass0IL implements AnonymousClass1F2 {
    /* renamed from: E */
    private static WeakHashMap f25213E = new WeakHashMap();
    /* renamed from: B */
    public int f25214B = 0;
    /* renamed from: C */
    public Bundle f25215C;
    /* renamed from: D */
    private Map f25216D = new AnonymousClass0O7();

    /* renamed from: B */
    public static AnonymousClass20d m14154B(FragmentActivity fragmentActivity) {
        WeakReference weakReference = (WeakReference) f25213E.get(fragmentActivity);
        if (weakReference != null) {
            AnonymousClass20d anonymousClass20d = (AnonymousClass20d) weakReference.get();
            if (anonymousClass20d != null) {
                return anonymousClass20d;
            }
        }
        try {
            AnonymousClass20d anonymousClass20d2 = (AnonymousClass20d) fragmentActivity.D().F("SupportLifecycleFragmentImpl");
            if (anonymousClass20d2 == null || anonymousClass20d2.isRemoving()) {
                anonymousClass20d2 = new AnonymousClass20d();
                fragmentActivity.D().B().C(anonymousClass20d2, "SupportLifecycleFragmentImpl").G();
            }
            f25213E.put(fragmentActivity, new WeakReference(anonymousClass20d2));
            return anonymousClass20d2;
        } catch (Throwable e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    public final AnonymousClass1ho LXA(String str, Class cls) {
        return (AnonymousClass1ho) cls.cast(this.f25216D.get(str));
    }

    public final /* synthetic */ Activity aYA() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (AnonymousClass1ho A : this.f25216D.values()) {
            A.A(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void mXA(String str, AnonymousClass1ho anonymousClass1ho) {
        if (this.f25216D.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 59);
            stringBuilder.append("LifecycleCallback with tag ");
            stringBuilder.append(str);
            stringBuilder.append(" already added to this fragment.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f25216D.put(str, anonymousClass1ho);
        if (this.f25214B > 0) {
            AnonymousClass0OR.D(new Handler(Looper.getMainLooper()), new AnonymousClass20e(this, anonymousClass1ho, str), -755773275);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (AnonymousClass1ho C : this.f25216D.values()) {
            C.C(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 728860016);
        super.onCreate(bundle);
        this.f25214B = 1;
        this.f25215C = bundle;
        for (Entry entry : this.f25216D.entrySet()) {
            ((AnonymousClass1ho) entry.getValue()).D(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
        AnonymousClass0cQ.G(this, 1307595498, F);
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -502141600);
        super.onDestroy();
        this.f25214B = 5;
        for (AnonymousClass1ho anonymousClass1ho : this.f25216D.values()) {
        }
        AnonymousClass0cQ.G(this, 1822559392, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1030672464);
        super.onResume();
        this.f25214B = 3;
        for (AnonymousClass1ho E : this.f25216D.values()) {
            E.E();
        }
        AnonymousClass0cQ.G(this, 1636726100, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f25216D.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((AnonymousClass1ho) entry.getValue()).F(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -1680847222);
        super.onStart();
        this.f25214B = 2;
        for (AnonymousClass1ho G : this.f25216D.values()) {
            G.G();
        }
        AnonymousClass0cQ.G(this, 241471330, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -590152111);
        super.onStop();
        this.f25214B = 4;
        for (AnonymousClass1ho H : this.f25216D.values()) {
            H.H();
        }
        AnonymousClass0cQ.G(this, 273526244, F);
    }
}
