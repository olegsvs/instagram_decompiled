package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;

/* renamed from: X.0BW */
public final class AnonymousClass0BW implements AnonymousClass099 {
    public final void mH(long j, StringBuilder stringBuilder) {
        if (AnonymousClass0CM.m897N(j)) {
            if (!TraceEvents.isEnabled(AnonymousClass0CI.f1519I)) {
                AnonymousClass0CM.m890G(j, stringBuilder);
            }
            Logger.writeEntry(AnonymousClass0CI.f1519I, 91, Logger.writeEntryWithoutMatch(AnonymousClass0CI.f1519I, 30, 735006533, 0), stringBuilder.toString());
        }
    }
}
