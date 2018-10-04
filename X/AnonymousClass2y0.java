package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2y0 */
public final class AnonymousClass2y0 {
    /* renamed from: B */
    public boolean f36450B;
    /* renamed from: C */
    public boolean f36451C;
    /* renamed from: D */
    public int f36452D;
    /* renamed from: E */
    public boolean f36453E;
    /* renamed from: F */
    public boolean f36454F;
    /* renamed from: G */
    public boolean f36455G;
    /* renamed from: H */
    public int f36456H;
    /* renamed from: I */
    public int f36457I;
    /* renamed from: J */
    public int f36458J;
    /* renamed from: K */
    public String f36459K;
    /* renamed from: L */
    public String f36460L;
    /* renamed from: M */
    public final SparseBooleanArray f36461M;
    /* renamed from: N */
    public boolean f36462N;
    /* renamed from: O */
    public final SparseArray f36463O;
    /* renamed from: P */
    public int f36464P;
    /* renamed from: Q */
    public int f36465Q;
    /* renamed from: R */
    public boolean f36466R;
    /* renamed from: S */
    public int f36467S;

    public AnonymousClass2y0() {
        this(DefaultTrackSelector$Parameters.f36431T);
    }

    public AnonymousClass2y0(DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) {
        SparseArray sparseArray = defaultTrackSelector$Parameters.f36445O;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f36463O = sparseArray2;
        this.f36461M = defaultTrackSelector$Parameters.f36443M.clone();
        this.f36459K = defaultTrackSelector$Parameters.f36441K;
        this.f36460L = defaultTrackSelector$Parameters.f36442L;
        this.f36462N = defaultTrackSelector$Parameters.f36444N;
        this.f36452D = defaultTrackSelector$Parameters.f36434D;
        this.f36455G = defaultTrackSelector$Parameters.f36437G;
        this.f36450B = defaultTrackSelector$Parameters.f36432B;
        this.f36451C = defaultTrackSelector$Parameters.f36433C;
        this.f36458J = defaultTrackSelector$Parameters.f36440J;
        this.f36457I = defaultTrackSelector$Parameters.f36439I;
        this.f36456H = defaultTrackSelector$Parameters.f36438H;
        this.f36454F = defaultTrackSelector$Parameters.f36436F;
        this.f36453E = defaultTrackSelector$Parameters.f36435E;
        this.f36467S = defaultTrackSelector$Parameters.f36449S;
        this.f36465Q = defaultTrackSelector$Parameters.f36447Q;
        this.f36466R = defaultTrackSelector$Parameters.f36448R;
        this.f36464P = defaultTrackSelector$Parameters.f36446P;
    }

    /* renamed from: A */
    public final AnonymousClass2y0 m17997A(int i, boolean z) {
        if (this.f36461M.get(i) != z) {
            if (z) {
                this.f36461M.put(i, true);
            } else {
                this.f36461M.delete(i);
            }
        }
        return this;
    }
}
