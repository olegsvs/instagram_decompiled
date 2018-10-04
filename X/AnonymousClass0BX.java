package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;

/* renamed from: X.0BX */
public final class AnonymousClass0BX implements AnonymousClass099 {
    public final void mH(long j, StringBuilder stringBuilder) {
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.isEmpty()) {
            Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1519I, 31, -409539198);
        } else {
            int i = AnonymousClass0CI.f1519I;
            Logger.writeEntry(i, 91, Logger.writeEntryWithoutMatch(i, 31, -409539198, 0), stringBuilder2);
        }
        if (!TraceEvents.isEnabled(AnonymousClass0CI.f1519I)) {
            AnonymousClass0CM.m896M(j, stringBuilder);
        }
    }
}
