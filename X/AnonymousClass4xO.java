package X;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.4xO */
public final class AnonymousClass4xO {
    /* renamed from: D */
    public static final AnonymousClass0n8 f58841D = new AnonymousClass0n8("EMPTY_PLACEHOLDER", AnonymousClass13f.EMPTY_PLACEHOLDER, JsonProperty.USE_DEFAULT_NAME);
    /* renamed from: B */
    public final Set f58842B = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: C */
    public AnonymousClass0n8 f58843C;

    /* renamed from: A */
    public final void m25487A(AnonymousClass0n8 anonymousClass0n8) {
        AnonymousClass0n8 anonymousClass0n82 = this.f58843C;
        if (anonymousClass0n82 != anonymousClass0n8) {
            this.f58843C = anonymousClass0n8;
            for (AnonymousClass4xN Wf : this.f58842B) {
                Wf.Wf(this, this.f58843C, anonymousClass0n82);
            }
        }
    }
}
