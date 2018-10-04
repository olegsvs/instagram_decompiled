package X;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.File;
import java.util.Collection;

/* renamed from: X.0Cu */
public final class AnonymousClass0Cu extends AnonymousClass0Ct {
    /* renamed from: B */
    private Context f1780B;
    /* renamed from: C */
    private int f1781C;
    /* renamed from: D */
    private AnonymousClass0Cs f1782D;

    public AnonymousClass0Cu(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f1780B = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.f1780B = context;
        }
        this.f1781C = i;
        this.f1782D = new AnonymousClass0Cs(new File(this.f1780B.getApplicationInfo().nativeLibraryDir), i);
    }

    /* renamed from: A */
    public final void mo215A(Collection collection) {
        this.f1782D.mo215A(collection);
    }

    /* renamed from: B */
    public final int mo216B(String str, int i, ThreadPolicy threadPolicy) {
        return this.f1782D.mo216B(str, i, threadPolicy);
    }

    /* renamed from: C */
    public final void mo218C(int i) {
        this.f1782D.mo218C(i);
    }

    /* renamed from: D */
    public final File mo217D(String str) {
        return this.f1782D.mo217D(str);
    }

    /* renamed from: E */
    public final boolean m1069E() {
        try {
            File file = this.f1782D.f1779C;
            Context createPackageContext = this.f1780B.createPackageContext(this.f1780B.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Native library directory updated from ");
            stringBuilder.append(file);
            stringBuilder.append(" to ");
            stringBuilder.append(file2);
            stringBuilder.toString();
            this.f1781C |= 1;
            this.f1782D = new AnonymousClass0Cs(file2, this.f1781C);
            this.f1782D.mo218C(this.f1781C);
            this.f1780B = createPackageContext;
            return true;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        return this.f1782D.toString();
    }
}
