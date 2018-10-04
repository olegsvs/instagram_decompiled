package X;

import android.text.TextUtils;
import com.google.android.gms.internal.zzcrw;
import com.google.android.gms.internal.zzcry;

/* renamed from: X.6HG */
public final class AnonymousClass6HG extends AnonymousClass6Cb {
    /* renamed from: B */
    private /* synthetic */ byte[] f73963B;
    /* renamed from: C */
    private /* synthetic */ String f73964C;

    public AnonymousClass6HG(AnonymousClass1yt anonymousClass1yt, byte[] bArr, String str) {
        this.f73963B = bArr;
        this.f73964C = str;
        super(anonymousClass1yt);
    }

    /* renamed from: M */
    public final /* synthetic */ void m29890M(AnonymousClass1yi anonymousClass1yi) {
        AnonymousClass5fr anonymousClass5fr = (AnonymousClass5fr) anonymousClass1yi;
        zzcrw zzcrw = this.f72923B;
        byte[] bArr = this.f73963B;
        String str = this.f73964C;
        if (TextUtils.isEmpty(str)) {
            str = AnonymousClass5fr.m28243E(anonymousClass5fr, "com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((zzcry) anonymousClass5fr.L()).hXA(zzcrw, bArr, str);
    }
}
