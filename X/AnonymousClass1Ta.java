package X;

import android.content.Context;
import android.util.SparseArray;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ta */
public final class AnonymousClass1Ta {
    /* renamed from: B */
    private static SparseArray f18936B;

    /* renamed from: B */
    public static List m11549B(Context context) {
        context = new ArrayList();
        context.addAll(AnonymousClass3Ox.B().A());
        if (((Boolean) AnonymousClass0CC.YK.m845G()).booleanValue()) {
            context.add(Integer.valueOf(644));
        }
        return context;
    }

    /* renamed from: C */
    public static SparseArray m11550C() {
        if (f18936B == null) {
            SparseArray sparseArray = new SparseArray();
            f18936B = sparseArray;
            sparseArray.put(ParserMinimalBase.INT_r, Integer.valueOf(60));
            f18936B.put(112, Integer.valueOf(60));
        }
        return f18936B;
    }
}
