package X;

import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.5d5 */
public final class AnonymousClass5d5 {
    /* renamed from: B */
    public final AnonymousClass5cu f67471B;
    /* renamed from: C */
    public final AnonymousClass6Ck f67472C;
    /* renamed from: D */
    public final AnonymousClass5cy f67473D;
    /* renamed from: E */
    public final Executor f67474E;

    public AnonymousClass5d5(Executor executor, AnonymousClass6Ck anonymousClass6Ck, AnonymousClass5cy anonymousClass5cy, AnonymousClass5cu anonymousClass5cu) {
        this.f67474E = executor;
        this.f67472C = anonymousClass6Ck;
        this.f67473D = anonymousClass5cy;
        this.f67471B = anonymousClass5cu;
    }

    /* renamed from: B */
    public static Boolean m28146B(FbAutofillData fbAutofillData, List list) {
        for (FbAutofillData iY : list) {
            if (fbAutofillData.iY(iY)) {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }
}
