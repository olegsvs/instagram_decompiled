package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1r1 */
public class AnonymousClass1r1 {
    /* renamed from: B */
    public List f23386B = new ArrayList();
    /* renamed from: C */
    public WeakReference f23387C;
    /* renamed from: D */
    public AnonymousClass1ql f23388D;
    /* renamed from: E */
    public AnonymousClass1qm f23389E;
    /* renamed from: F */
    public AnonymousClass2PN f23390F;
    /* renamed from: G */
    public AnonymousClass1qn f23391G;
    /* renamed from: H */
    public WeakReference f23392H;
    /* renamed from: I */
    public WeakReference f23393I;

    /* renamed from: A */
    public void m13441A() {
        WeakReference weakReference = this.f23387C;
        if (!(weakReference == null || this.f23392H == null)) {
            if (this.f23393I != null) {
                Intent intent = (Intent) this.f23392H.get();
                View view = (View) this.f23393I.get();
                if (!(((Context) weakReference.get()) == null || intent == null || view == null || this.f23389E == null || this.f23391G == null)) {
                    if (this.f23388D != null) {
                        for (AnonymousClass2dD anonymousClass2dD : this.f23386B) {
                            AnonymousClass1qm anonymousClass1qm = this.f23389E;
                            AnonymousClass1qn anonymousClass1qn = this.f23391G;
                            AnonymousClass1ql anonymousClass1ql = this.f23388D;
                            anonymousClass2dD.f23359D = intent;
                            anonymousClass2dD.f23360E = view;
                            anonymousClass2dD.f23358C = anonymousClass1qm;
                            anonymousClass2dD.f23361F = anonymousClass1qn;
                            anonymousClass2dD.f23357B = anonymousClass1ql;
                        }
                        return;
                    }
                }
            }
        }
        AnonymousClass1r1.m13440B(this);
    }

    /* renamed from: B */
    public void mo2918B() {
        for (AnonymousClass2dD A : this.f23386B) {
            A.mo3505A();
        }
        this.f23386B.clear();
        WeakReference weakReference = this.f23387C;
        if (weakReference != null) {
            weakReference.clear();
            this.f23387C = null;
        }
        weakReference = this.f23392H;
        if (weakReference != null) {
            weakReference.clear();
            this.f23392H = null;
        }
        weakReference = this.f23393I;
        if (weakReference != null) {
            weakReference.clear();
            this.f23393I = null;
        }
        this.f23391G = null;
        this.f23389E = null;
        this.f23388D = null;
        this.f23390F = null;
    }

    /* renamed from: B */
    private static void m13440B(AnonymousClass1r1 anonymousClass1r1) {
        for (AnonymousClass2dD A : anonymousClass1r1.f23386B) {
            A.mo3505A();
        }
        anonymousClass1r1.f23386B.clear();
    }

    /* renamed from: C */
    public final List m13443C(Class cls) {
        List arrayList = new ArrayList();
        WeakReference weakReference = this.f23387C;
        if (weakReference != null) {
            if (this.f23392H != null) {
                Intent intent = (Intent) this.f23392H.get();
                if (((Context) weakReference.get()) != null) {
                    if (intent != null) {
                        for (AnonymousClass2dD anonymousClass2dD : this.f23386B) {
                            if (cls.isInstance(anonymousClass2dD)) {
                                arrayList.add(anonymousClass2dD);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
