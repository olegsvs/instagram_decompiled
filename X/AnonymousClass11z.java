package X;

import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;

/* renamed from: X.11z */
public class AnonymousClass11z {
    /* renamed from: A */
    public void m8841A(LayoutInflater layoutInflater, Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof Factory2) {
            AnonymousClass11y.m8839B(layoutInflater, (Factory2) factory);
        } else {
            AnonymousClass11y.m8839B(layoutInflater, factory2);
        }
    }
}
