package X;

import java.util.Calendar;
import java.util.Date;

/* renamed from: X.25y */
public final class AnonymousClass25y {
    /* renamed from: B */
    public final Date f25894B;
    /* renamed from: C */
    public final String f25895C;

    public AnonymousClass25y(Date date) {
        this.f25894B = date;
        Calendar instance = Calendar.getInstance();
        instance.setTime(this.f25894B);
        this.f25895C = String.valueOf(instance.get(5));
    }
}
