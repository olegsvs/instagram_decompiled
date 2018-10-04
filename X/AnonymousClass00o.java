package X;

import android.content.Context;
import java.io.File;
import java.io.InputStream;

/* renamed from: X.00o */
public abstract class AnonymousClass00o {
    /* renamed from: B */
    public File f86B;
    /* renamed from: C */
    public final String f87C;
    /* renamed from: D */
    public final String f88D;

    /* renamed from: A */
    public void mo39A(Context context) {
    }

    /* renamed from: C */
    public abstract boolean mo38C(Context context, byte[] bArr);

    public AnonymousClass00o(String str, String str2) {
        this.f88D = str;
        this.f87C = str2;
    }

    /* renamed from: B */
    public InputStream mo174B(Context context) {
        return context.getAssets().open(this.f88D, 2);
    }
}
