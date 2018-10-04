package X;

import android.view.ViewGroup;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.25x */
public abstract class AnonymousClass25x extends AnonymousClass0nJ {
    /* renamed from: G */
    public static final int f25887G = Calendar.getInstance().getActualMaximum(7);
    /* renamed from: B */
    public final Calendar f25888B = Calendar.getInstance();
    /* renamed from: C */
    public final Map f25889C = new HashMap();
    /* renamed from: D */
    public final Map f25890D = new HashMap();
    /* renamed from: E */
    public final List f25891E = new ArrayList();
    /* renamed from: F */
    public final DateFormat f25892F = new SimpleDateFormat("MMMM yyyy");

    /* renamed from: P */
    public abstract void mo3233P(AnonymousClass0oo anonymousClass0oo, AnonymousClass25z anonymousClass25z);

    /* renamed from: Q */
    public abstract void mo3234Q(AnonymousClass0oo anonymousClass0oo, AnonymousClass25y anonymousClass25y, List list);

    /* renamed from: R */
    public abstract void mo3235R(AnonymousClass0oo anonymousClass0oo, AnonymousClass260 anonymousClass260);

    /* renamed from: S */
    public abstract void mo3236S(AnonymousClass0oo anonymousClass0oo, AnonymousClass262 anonymousClass262);

    /* renamed from: T */
    public abstract AnonymousClass0oo mo3237T(ViewGroup viewGroup);

    /* renamed from: U */
    public abstract AnonymousClass0oo mo3238U(ViewGroup viewGroup);

    /* renamed from: V */
    public abstract AnonymousClass0oo mo3239V(ViewGroup viewGroup);

    /* renamed from: W */
    public abstract AnonymousClass0oo mo3240W(ViewGroup viewGroup);

    /* renamed from: B */
    public final int m14393B() {
        return this.f25891E.size();
    }

    /* renamed from: B */
    public static String m14392B(int i, int i2, int i3) {
        if (i3 == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i);
            stringBuilder.append(":");
            stringBuilder.append(i2);
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        String str = ":";
        stringBuilder.append(str);
        stringBuilder.append(i2);
        stringBuilder.append(str);
        stringBuilder.append(i3);
        return stringBuilder.toString();
    }

    /* renamed from: I */
    public final void m14394I(AnonymousClass0oo anonymousClass0oo, int i) {
        int itemViewType = getItemViewType(i);
        Object obj = this.f25891E.get(i);
        switch (itemViewType) {
            case 0:
                AnonymousClass25y anonymousClass25y = (AnonymousClass25y) obj;
                mo3234Q(anonymousClass0oo, anonymousClass25y, (List) this.f25890D.get(m14404X(anonymousClass25y.f25894B)));
                return;
            case 1:
                mo3236S(anonymousClass0oo, (AnonymousClass262) obj);
                return;
            case 2:
                mo3233P(anonymousClass0oo, (AnonymousClass25z) obj);
                return;
            case 3:
                mo3235R(anonymousClass0oo, (AnonymousClass260) obj);
                return;
            default:
                throw new IllegalStateException("unsupported viewType");
        }
    }

    /* renamed from: J */
    public final AnonymousClass0oo m14395J(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return mo3238U(viewGroup);
            case 1:
                return mo3240W(viewGroup);
            case 2:
                return mo3237T(viewGroup);
            case 3:
                return mo3239V(viewGroup);
            default:
                throw new IllegalStateException("unsupported viewType");
        }
    }

    /* renamed from: X */
    public final String m14404X(Date date) {
        this.f25888B.setTime(date);
        return AnonymousClass25x.m14392B(this.f25888B.get(1), this.f25888B.get(2), this.f25888B.get(5));
    }

    public final int getItemViewType(int i) {
        i = this.f25891E.get(i);
        if (i instanceof AnonymousClass25y) {
            return 0;
        }
        if (i instanceof AnonymousClass262) {
            return 1;
        }
        if (i instanceof AnonymousClass25z) {
            return 2;
        }
        if (i instanceof AnonymousClass260) {
            return 3;
        }
        throw new IllegalStateException("unexpected item type");
    }
}
