package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1LO */
public abstract class AnonymousClass1LO {
    /* renamed from: B */
    public DataSetObserver f17330B;
    /* renamed from: C */
    private final DataSetObservable f17331C = new DataSetObservable();

    /* renamed from: B */
    public float m10835B(int i) {
        return 1.0f;
    }

    /* renamed from: E */
    public void mo2430E(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: F */
    public Parcelable mo2431F() {
        return null;
    }

    public abstract int getCount();

    public int getItemPosition(Object obj) {
        return -1;
    }

    public abstract boolean isViewFromObject(View view, Object obj);

    /* renamed from: A */
    public void mo2429A(ViewGroup viewGroup) {
    }

    /* renamed from: C */
    public void m10836C() {
        synchronized (this) {
            if (this.f17330B != null) {
                this.f17330B.onChanged();
            }
        }
        this.f17331C.notifyChanged();
    }

    /* renamed from: D */
    public void m10837D(DataSetObserver dataSetObserver) {
        this.f17331C.registerObserver(dataSetObserver);
    }

    /* renamed from: G */
    public void mo2432G(ViewGroup viewGroup, int i, Object obj) {
    }

    /* renamed from: H */
    public void mo2433H(ViewGroup viewGroup) {
    }

    /* renamed from: I */
    public void m10842I(DataSetObserver dataSetObserver) {
        this.f17331C.unregisterObserver(dataSetObserver);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }
}
