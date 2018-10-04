package X;

import java.util.Comparator;
import org.json.JSONObject;

/* renamed from: X.09n */
public final class AnonymousClass09n implements Comparator {
    public AnonymousClass09n(AnonymousClass09o anonymousClass09o) {
    }

    public final int compare(Object obj, Object obj2) {
        try {
            String str = "1. Universe";
            return ((JSONObject) obj).getString(str).compareTo(((JSONObject) obj2).getString(str));
        } catch (Object obj22) {
            AnonymousClass0Dc.m1244G("QuickExperimentsValueLogger", "Unable to create log", obj22);
            return 0;
        }
    }
}
